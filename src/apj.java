import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.function.Function;

public class apj {
   public static void a(CommandDispatcher<et> $$0, ep $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("title").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)eu.a(
                                    "targets", fg.d()
                                 )
                                 .then(eu.a("clear").executes($$0x -> a((et)$$0x.getSource(), fg.f($$0x, "targets")))))
                              .then(eu.a("reset").executes($$0x -> b((et)$$0x.getSource(), fg.f($$0x, "targets")))))
                           .then(
                              eu.a("title")
                                 .then(
                                    eu.a("title", fc.a($$1))
                                       .executes($$0x -> a((et)$$0x.getSource(), fg.f($$0x, "targets"), fc.a($$0x, "title"), "title", afu::new))
                                 )
                           ))
                        .then(
                           eu.a("subtitle")
                              .then(
                                 eu.a("title", fc.a($$1))
                                    .executes($$0x -> a((et)$$0x.getSource(), fg.f($$0x, "targets"), fc.a($$0x, "title"), "subtitle", afs::new))
                              )
                        ))
                     .then(
                        eu.a("actionbar")
                           .then(
                              eu.a("title", fc.a($$1))
                                 .executes($$0x -> a((et)$$0x.getSource(), fg.f($$0x, "targets"), fc.a($$0x, "title"), "actionbar", aet::new))
                           )
                     ))
                  .then(
                     eu.a("times")
                        .then(
                           eu.a("fadeIn", gi.a())
                              .then(
                                 eu.a("stay", gi.a())
                                    .then(
                                       eu.a("fadeOut", gi.a())
                                          .executes(
                                             $$0x -> a(
                                                   (et)$$0x.getSource(),
                                                   fg.f($$0x, "targets"),
                                                   IntegerArgumentType.getInteger($$0x, "fadeIn"),
                                                   IntegerArgumentType.getInteger($$0x, "stay"),
                                                   IntegerArgumentType.getInteger($$0x, "fadeOut")
                                                )
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(et $$0, Collection<arh> $$1) {
      acq $$2 = new acq(false);

      for (arh $$3 : $$1) {
         $$3.c.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xd.a("commands.title.cleared.single", $$1.iterator().next().Q_()), true);
      } else {
         $$0.a(() -> xd.a("commands.title.cleared.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(et $$0, Collection<arh> $$1) {
      acq $$2 = new acq(true);

      for (arh $$3 : $$1) {
         $$3.c.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xd.a("commands.title.reset.single", $$1.iterator().next().Q_()), true);
      } else {
         $$0.a(() -> xd.a("commands.title.reset.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(et $$0, Collection<arh> $$1, xd $$2, String $$3, Function<xd, zk<?>> $$4) throws CommandSyntaxException {
      for (arh $$5 : $$1) {
         $$5.c.b($$4.apply(xg.a($$0, $$2, $$5, 0)));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xd.a("commands.title.show." + $$3 + ".single", $$1.iterator().next().Q_()), true);
      } else {
         $$0.a(() -> xd.a("commands.title.show." + $$3 + ".multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(et $$0, Collection<arh> $$1, int $$2, int $$3, int $$4) {
      afv $$5 = new afv($$2, $$3, $$4);

      for (arh $$6 : $$1) {
         $$6.c.b($$5);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xd.a("commands.title.times.single", $$1.iterator().next().Q_()), true);
      } else {
         $$0.a(() -> xd.a("commands.title.times.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}

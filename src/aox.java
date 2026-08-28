import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.function.Function;

public class aox {
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
                                       .executes($$0x -> a((et)$$0x.getSource(), fg.f($$0x, "targets"), fc.a($$0x, "title"), "title", afl::new))
                                 )
                           ))
                        .then(
                           eu.a("subtitle")
                              .then(
                                 eu.a("title", fc.a($$1))
                                    .executes($$0x -> a((et)$$0x.getSource(), fg.f($$0x, "targets"), fc.a($$0x, "title"), "subtitle", afj::new))
                              )
                        ))
                     .then(
                        eu.a("actionbar")
                           .then(
                              eu.a("title", fc.a($$1))
                                 .executes($$0x -> a((et)$$0x.getSource(), fg.f($$0x, "targets"), fc.a($$0x, "title"), "actionbar", aem::new))
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

   private static int a(et $$0, Collection<aqu> $$1) {
      ack $$2 = new ack(false);

      for (aqu $$3 : $$1) {
         $$3.c.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wy.a("commands.title.cleared.single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> wy.a("commands.title.cleared.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(et $$0, Collection<aqu> $$1) {
      ack $$2 = new ack(true);

      for (aqu $$3 : $$1) {
         $$3.c.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wy.a("commands.title.reset.single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> wy.a("commands.title.reset.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(et $$0, Collection<aqu> $$1, wy $$2, String $$3, Function<wy, zf<?>> $$4) throws CommandSyntaxException {
      for (aqu $$5 : $$1) {
         $$5.c.b($$4.apply(xb.a($$0, $$2, $$5, 0)));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wy.a("commands.title.show." + $$3 + ".single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> wy.a("commands.title.show." + $$3 + ".multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(et $$0, Collection<aqu> $$1, int $$2, int $$3, int $$4) {
      afm $$5 = new afm($$2, $$3, $$4);

      for (aqu $$6 : $$1) {
         $$6.c.b($$5);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wy.a("commands.title.times.single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> wy.a("commands.title.times.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}

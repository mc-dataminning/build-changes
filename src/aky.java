import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.function.Function;

public class aky {
   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("title").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a(
                                    "targets", ee.d()
                                 )
                                 .then(dt.a("clear").executes($$0x -> a((ds)$$0x.getSource(), ee.f($$0x, "targets")))))
                              .then(dt.a("reset").executes($$0x -> b((ds)$$0x.getSource(), ee.f($$0x, "targets")))))
                           .then(
                              dt.a("title")
                                 .then(
                                    dt.a("title", ea.a())
                                       .executes($$0x -> a((ds)$$0x.getSource(), ee.f($$0x, "targets"), ea.a($$0x, "title"), "title", acc::new))
                                 )
                           ))
                        .then(
                           dt.a("subtitle")
                              .then(
                                 dt.a("title", ea.a())
                                    .executes($$0x -> a((ds)$$0x.getSource(), ee.f($$0x, "targets"), ea.a($$0x, "title"), "subtitle", aca::new))
                              )
                        ))
                     .then(
                        dt.a("actionbar")
                           .then(
                              dt.a("title", ea.a())
                                 .executes($$0x -> a((ds)$$0x.getSource(), ee.f($$0x, "targets"), ea.a($$0x, "title"), "actionbar", abd::new))
                           )
                     ))
                  .then(
                     dt.a("times")
                        .then(
                           dt.a("fadeIn", fd.a())
                              .then(
                                 dt.a("stay", fd.a())
                                    .then(
                                       dt.a("fadeOut", fd.a())
                                          .executes(
                                             $$0x -> a(
                                                   (ds)$$0x.getSource(),
                                                   ee.f($$0x, "targets"),
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

   private static int a(ds $$0, Collection<amq> $$1) {
      ze $$2 = new ze(false);

      for (amq $$3 : $$1) {
         $$3.c.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> vb.a("commands.title.cleared.single", $$1.iterator().next().Q_()), true);
      } else {
         $$0.a(() -> vb.a("commands.title.cleared.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(ds $$0, Collection<amq> $$1) {
      ze $$2 = new ze(true);

      for (amq $$3 : $$1) {
         $$3.c.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> vb.a("commands.title.reset.single", $$1.iterator().next().Q_()), true);
      } else {
         $$0.a(() -> vb.a("commands.title.reset.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ds $$0, Collection<amq> $$1, vb $$2, String $$3, Function<vb, wu<?>> $$4) throws CommandSyntaxException {
      for (amq $$5 : $$1) {
         $$5.c.b($$4.apply(ve.a($$0, $$2, $$5, 0)));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> vb.a("commands.title.show." + $$3 + ".single", $$1.iterator().next().Q_()), true);
      } else {
         $$0.a(() -> vb.a("commands.title.show." + $$3 + ".multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ds $$0, Collection<amq> $$1, int $$2, int $$3, int $$4) {
      acd $$5 = new acd($$2, $$3, $$4);

      for (amq $$6 : $$1) {
         $$6.c.b($$5);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> vb.a("commands.title.times.single", $$1.iterator().next().Q_()), true);
      } else {
         $$0.a(() -> vb.a("commands.title.times.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}

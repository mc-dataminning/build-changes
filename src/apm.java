import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.function.Function;

public class apm {
   public static void a(CommandDispatcher<ep> $$0, el $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("title").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)eq.a(
                                    "targets", fc.d()
                                 )
                                 .then(eq.a("clear").executes($$0x -> a((ep)$$0x.getSource(), fc.f($$0x, "targets")))))
                              .then(eq.a("reset").executes($$0x -> b((ep)$$0x.getSource(), fc.f($$0x, "targets")))))
                           .then(
                              eq.a("title")
                                 .then(
                                    eq.a("title", ey.a($$1))
                                       .executes($$0x -> a((ep)$$0x.getSource(), fc.f($$0x, "targets"), ey.a($$0x, "title"), "title", aga::new))
                                 )
                           ))
                        .then(
                           eq.a("subtitle")
                              .then(
                                 eq.a("title", ey.a($$1))
                                    .executes($$0x -> a((ep)$$0x.getSource(), fc.f($$0x, "targets"), ey.a($$0x, "title"), "subtitle", afy::new))
                              )
                        ))
                     .then(
                        eq.a("actionbar")
                           .then(
                              eq.a("title", ey.a($$1))
                                 .executes($$0x -> a((ep)$$0x.getSource(), fc.f($$0x, "targets"), ey.a($$0x, "title"), "actionbar", afb::new))
                           )
                     ))
                  .then(
                     eq.a("times")
                        .then(
                           eq.a("fadeIn", ge.a())
                              .then(
                                 eq.a("stay", ge.a())
                                    .then(
                                       eq.a("fadeOut", ge.a())
                                          .executes(
                                             $$0x -> a(
                                                   (ep)$$0x.getSource(),
                                                   fc.f($$0x, "targets"),
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

   private static int a(ep $$0, Collection<arg> $$1) {
      acz $$2 = new acz(false);

      for (arg $$3 : $$1) {
         $$3.c.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xp.a("commands.title.cleared.single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> xp.a("commands.title.cleared.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(ep $$0, Collection<arg> $$1) {
      acz $$2 = new acz(true);

      for (arg $$3 : $$1) {
         $$3.c.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xp.a("commands.title.reset.single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> xp.a("commands.title.reset.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ep $$0, Collection<arg> $$1, xp $$2, String $$3, Function<xp, zw<?>> $$4) throws CommandSyntaxException {
      for (arg $$5 : $$1) {
         $$5.c.b($$4.apply(xs.a($$0, $$2, $$5, 0)));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xp.a("commands.title.show." + $$3 + ".single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> xp.a("commands.title.show." + $$3 + ".multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ep $$0, Collection<arg> $$1, int $$2, int $$3, int $$4) {
      agb $$5 = new agb($$2, $$3, $$4);

      for (arg $$6 : $$1) {
         $$6.c.b($$5);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xp.a("commands.title.times.single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> xp.a("commands.title.times.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}

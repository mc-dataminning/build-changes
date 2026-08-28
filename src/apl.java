import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.function.Function;

public class apl {
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
                                       .executes($$0x -> a((ep)$$0x.getSource(), fc.f($$0x, "targets"), ey.a($$0x, "title"), "title", afz::new))
                                 )
                           ))
                        .then(
                           eq.a("subtitle")
                              .then(
                                 eq.a("title", ey.a($$1))
                                    .executes($$0x -> a((ep)$$0x.getSource(), fc.f($$0x, "targets"), ey.a($$0x, "title"), "subtitle", afx::new))
                              )
                        ))
                     .then(
                        eq.a("actionbar")
                           .then(
                              eq.a("title", ey.a($$1))
                                 .executes($$0x -> a((ep)$$0x.getSource(), fc.f($$0x, "targets"), ey.a($$0x, "title"), "actionbar", afa::new))
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

   private static int a(ep $$0, Collection<arf> $$1) {
      acy $$2 = new acy(false);

      for (arf $$3 : $$1) {
         $$3.c.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xo.a("commands.title.cleared.single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> xo.a("commands.title.cleared.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(ep $$0, Collection<arf> $$1) {
      acy $$2 = new acy(true);

      for (arf $$3 : $$1) {
         $$3.c.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xo.a("commands.title.reset.single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> xo.a("commands.title.reset.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ep $$0, Collection<arf> $$1, xo $$2, String $$3, Function<xo, zv<?>> $$4) throws CommandSyntaxException {
      for (arf $$5 : $$1) {
         $$5.c.b($$4.apply(xr.a($$0, $$2, $$5, 0)));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xo.a("commands.title.show." + $$3 + ".single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> xo.a("commands.title.show." + $$3 + ".multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ep $$0, Collection<arf> $$1, int $$2, int $$3, int $$4) {
      aga $$5 = new aga($$2, $$3, $$4);

      for (arf $$6 : $$1) {
         $$6.c.b($$5);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xo.a("commands.title.times.single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> xo.a("commands.title.times.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}

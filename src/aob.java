import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.function.Function;

public class aob {
   public static void a(CommandDispatcher<dv> $$0, dr $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("title").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dw.a(
                                    "targets", ei.d()
                                 )
                                 .then(dw.a("clear").executes($$0x -> a((dv)$$0x.getSource(), ei.f($$0x, "targets")))))
                              .then(dw.a("reset").executes($$0x -> b((dv)$$0x.getSource(), ei.f($$0x, "targets")))))
                           .then(
                              dw.a("title")
                                 .then(
                                    dw.a("title", ee.a($$1))
                                       .executes($$0x -> a((dv)$$0x.getSource(), ei.f($$0x, "targets"), ee.a($$0x, "title"), "title", aer::new))
                                 )
                           ))
                        .then(
                           dw.a("subtitle")
                              .then(
                                 dw.a("title", ee.a($$1))
                                    .executes($$0x -> a((dv)$$0x.getSource(), ei.f($$0x, "targets"), ee.a($$0x, "title"), "subtitle", aep::new))
                              )
                        ))
                     .then(
                        dw.a("actionbar")
                           .then(
                              dw.a("title", ee.a($$1))
                                 .executes($$0x -> a((dv)$$0x.getSource(), ei.f($$0x, "targets"), ee.a($$0x, "title"), "actionbar", ads::new))
                           )
                     ))
                  .then(
                     dw.a("times")
                        .then(
                           dw.a("fadeIn", fj.a())
                              .then(
                                 dw.a("stay", fj.a())
                                    .then(
                                       dw.a("fadeOut", fj.a())
                                          .executes(
                                             $$0x -> a(
                                                   (dv)$$0x.getSource(),
                                                   ei.f($$0x, "targets"),
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

   private static int a(dv $$0, Collection<apv> $$1) {
      abr $$2 = new abr(false);

      for (apv $$3 : $$1) {
         $$3.d.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wi.a("commands.title.cleared.single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> wi.a("commands.title.cleared.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(dv $$0, Collection<apv> $$1) {
      abr $$2 = new abr(true);

      for (apv $$3 : $$1) {
         $$3.d.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wi.a("commands.title.reset.single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> wi.a("commands.title.reset.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(dv $$0, Collection<apv> $$1, wi $$2, String $$3, Function<wi, yp<?>> $$4) throws CommandSyntaxException {
      for (apv $$5 : $$1) {
         $$5.d.b($$4.apply(wl.a($$0, $$2, $$5, 0)));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wi.a("commands.title.show." + $$3 + ".single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> wi.a("commands.title.show." + $$3 + ".multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(dv $$0, Collection<apv> $$1, int $$2, int $$3, int $$4) {
      aes $$5 = new aes($$2, $$3, $$4);

      for (apv $$6 : $$1) {
         $$6.d.b($$5);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wi.a("commands.title.times.single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> wi.a("commands.title.times.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}

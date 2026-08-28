import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.function.Function;

public class apq {
   public static void a(CommandDispatcher<ew> $$0, es $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("title").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ex.a(
                                    "targets", fj.d()
                                 )
                                 .then(ex.a("clear").executes($$0x -> a((ew)$$0x.getSource(), fj.f($$0x, "targets")))))
                              .then(ex.a("reset").executes($$0x -> b((ew)$$0x.getSource(), fj.f($$0x, "targets")))))
                           .then(
                              ex.a("title")
                                 .then(
                                    ex.a("title", ff.a($$1))
                                       .executes($$0x -> a((ew)$$0x.getSource(), fj.f($$0x, "targets"), ff.a($$0x, "title"), "title", afz::new))
                                 )
                           ))
                        .then(
                           ex.a("subtitle")
                              .then(
                                 ex.a("title", ff.a($$1))
                                    .executes($$0x -> a((ew)$$0x.getSource(), fj.f($$0x, "targets"), ff.a($$0x, "title"), "subtitle", afx::new))
                              )
                        ))
                     .then(
                        ex.a("actionbar")
                           .then(
                              ex.a("title", ff.a($$1))
                                 .executes($$0x -> a((ew)$$0x.getSource(), fj.f($$0x, "targets"), ff.a($$0x, "title"), "actionbar", aey::new))
                           )
                     ))
                  .then(
                     ex.a("times")
                        .then(
                           ex.a("fadeIn", gl.a())
                              .then(
                                 ex.a("stay", gl.a())
                                    .then(
                                       ex.a("fadeOut", gl.a())
                                          .executes(
                                             $$0x -> a(
                                                   (ew)$$0x.getSource(),
                                                   fj.f($$0x, "targets"),
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

   private static int a(ew $$0, Collection<aro> $$1) {
      acv $$2 = new acv(false);

      for (aro $$3 : $$1) {
         $$3.g.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xi.a("commands.title.cleared.single", $$1.iterator().next().S_()), true);
      } else {
         $$0.a(() -> xi.a("commands.title.cleared.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(ew $$0, Collection<aro> $$1) {
      acv $$2 = new acv(true);

      for (aro $$3 : $$1) {
         $$3.g.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xi.a("commands.title.reset.single", $$1.iterator().next().S_()), true);
      } else {
         $$0.a(() -> xi.a("commands.title.reset.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ew $$0, Collection<aro> $$1, xi $$2, String $$3, Function<xi, zp<?>> $$4) throws CommandSyntaxException {
      for (aro $$5 : $$1) {
         $$5.g.b($$4.apply(xl.a($$0, $$2, $$5, 0)));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xi.a("commands.title.show." + $$3 + ".single", $$1.iterator().next().S_()), true);
      } else {
         $$0.a(() -> xi.a("commands.title.show." + $$3 + ".multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ew $$0, Collection<aro> $$1, int $$2, int $$3, int $$4) {
      aga $$5 = new aga($$2, $$3, $$4);

      for (aro $$6 : $$1) {
         $$6.g.b($$5);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xi.a("commands.title.times.single", $$1.iterator().next().S_()), true);
      } else {
         $$0.a(() -> xi.a("commands.title.times.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}

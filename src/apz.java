import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.function.Function;

public class apz {
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
                                       .executes($$0x -> a((ew)$$0x.getSource(), fj.f($$0x, "targets"), ff.a($$0x, "title"), "title", agf::new))
                                 )
                           ))
                        .then(
                           ex.a("subtitle")
                              .then(
                                 ex.a("title", ff.a($$1))
                                    .executes($$0x -> a((ew)$$0x.getSource(), fj.f($$0x, "targets"), ff.a($$0x, "title"), "subtitle", agd::new))
                              )
                        ))
                     .then(
                        ex.a("actionbar")
                           .then(
                              ex.a("title", ff.a($$1))
                                 .executes($$0x -> a((ew)$$0x.getSource(), fj.f($$0x, "targets"), ff.a($$0x, "title"), "actionbar", afe::new))
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

   private static int a(ew $$0, Collection<ary> $$1) {
      acx $$2 = new acx(false);

      for (ary $$3 : $$1) {
         $$3.f.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xk.a("commands.title.cleared.single", $$1.iterator().next().p_()), true);
      } else {
         $$0.a(() -> xk.a("commands.title.cleared.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(ew $$0, Collection<ary> $$1) {
      acx $$2 = new acx(true);

      for (ary $$3 : $$1) {
         $$3.f.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xk.a("commands.title.reset.single", $$1.iterator().next().p_()), true);
      } else {
         $$0.a(() -> xk.a("commands.title.reset.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ew $$0, Collection<ary> $$1, xk $$2, String $$3, Function<xk, zr<?>> $$4) throws CommandSyntaxException {
      for (ary $$5 : $$1) {
         $$5.f.b($$4.apply(xn.a($$0, $$2, $$5, 0)));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xk.a("commands.title.show." + $$3 + ".single", $$1.iterator().next().p_()), true);
      } else {
         $$0.a(() -> xk.a("commands.title.show." + $$3 + ".multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ew $$0, Collection<ary> $$1, int $$2, int $$3, int $$4) {
      agg $$5 = new agg($$2, $$3, $$4);

      for (ary $$6 : $$1) {
         $$6.f.b($$5);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xk.a("commands.title.times.single", $$1.iterator().next().p_()), true);
      } else {
         $$0.a(() -> xk.a("commands.title.times.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}

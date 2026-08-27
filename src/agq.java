import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.function.Function;

public class agq {
   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("title").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a(
                                    "targets", ec.d()
                                 )
                                 .then(dt.a("clear").executes($$0x -> a((ds)$$0x.getSource(), ec.f($$0x, "targets")))))
                              .then(dt.a("reset").executes($$0x -> b((ds)$$0x.getSource(), ec.f($$0x, "targets")))))
                           .then(
                              dt.a("title")
                                 .then(
                                    dt.a("title", dy.a())
                                       .executes($$0x -> a((ds)$$0x.getSource(), ec.f($$0x, "targets"), dy.a($$0x, "title"), "title", yj::new))
                                 )
                           ))
                        .then(
                           dt.a("subtitle")
                              .then(
                                 dt.a("title", dy.a())
                                    .executes($$0x -> a((ds)$$0x.getSource(), ec.f($$0x, "targets"), dy.a($$0x, "title"), "subtitle", yh::new))
                              )
                        ))
                     .then(
                        dt.a("actionbar")
                           .then(
                              dt.a("title", dy.a()).executes($$0x -> a((ds)$$0x.getSource(), ec.f($$0x, "targets"), dy.a($$0x, "title"), "actionbar", xk::new))
                           )
                     ))
                  .then(
                     dt.a("times")
                        .then(
                           dt.a("fadeIn", fb.a())
                              .then(
                                 dt.a("stay", fb.a())
                                    .then(
                                       dt.a("fadeOut", fb.a())
                                          .executes(
                                             $$0x -> a(
                                                   (ds)$$0x.getSource(),
                                                   ec.f($$0x, "targets"),
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

   private static int a(ds $$0, Collection<aig> $$1) {
      vg $$2 = new vg(false);

      for (aig $$3 : $$1) {
         $$3.c.a($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> sw.a("commands.title.cleared.single", $$1.iterator().next().H_()), true);
      } else {
         $$0.a(() -> sw.a("commands.title.cleared.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(ds $$0, Collection<aig> $$1) {
      vg $$2 = new vg(true);

      for (aig $$3 : $$1) {
         $$3.c.a($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> sw.a("commands.title.reset.single", $$1.iterator().next().H_()), true);
      } else {
         $$0.a(() -> sw.a("commands.title.reset.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ds $$0, Collection<aig> $$1, sw $$2, String $$3, Function<sw, uo<?>> $$4) throws CommandSyntaxException {
      for (aig $$5 : $$1) {
         $$5.c.a($$4.apply(sy.a($$0, $$2, $$5, 0)));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> sw.a("commands.title.show." + $$3 + ".single", $$1.iterator().next().H_()), true);
      } else {
         $$0.a(() -> sw.a("commands.title.show." + $$3 + ".multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ds $$0, Collection<aig> $$1, int $$2, int $$3, int $$4) {
      yk $$5 = new yk($$2, $$3, $$4);

      for (aig $$6 : $$1) {
         $$6.c.a($$5);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> sw.a("commands.title.times.single", $$1.iterator().next().H_()), true);
      } else {
         $$0.a(() -> sw.a("commands.title.times.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}

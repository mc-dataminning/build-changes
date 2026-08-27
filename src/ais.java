import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.function.Function;

public class ais {
   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("title").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a(
                                    "targets", ed.d()
                                 )
                                 .then(dt.a("clear").executes($$0x -> a((ds)$$0x.getSource(), ed.f($$0x, "targets")))))
                              .then(dt.a("reset").executes($$0x -> b((ds)$$0x.getSource(), ed.f($$0x, "targets")))))
                           .then(
                              dt.a("title")
                                 .then(
                                    dt.a("title", dz.a())
                                       .executes($$0x -> a((ds)$$0x.getSource(), ed.f($$0x, "targets"), dz.a($$0x, "title"), "title", aad::new))
                                 )
                           ))
                        .then(
                           dt.a("subtitle")
                              .then(
                                 dt.a("title", dz.a())
                                    .executes($$0x -> a((ds)$$0x.getSource(), ed.f($$0x, "targets"), dz.a($$0x, "title"), "subtitle", aab::new))
                              )
                        ))
                     .then(
                        dt.a("actionbar")
                           .then(
                              dt.a("title", dz.a()).executes($$0x -> a((ds)$$0x.getSource(), ed.f($$0x, "targets"), dz.a($$0x, "title"), "actionbar", ze::new))
                           )
                     ))
                  .then(
                     dt.a("times")
                        .then(
                           dt.a("fadeIn", fc.a())
                              .then(
                                 dt.a("stay", fc.a())
                                    .then(
                                       dt.a("fadeOut", fc.a())
                                          .executes(
                                             $$0x -> a(
                                                   (ds)$$0x.getSource(),
                                                   ed.f($$0x, "targets"),
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

   private static int a(ds $$0, Collection<akj> $$1) {
      xf $$2 = new xf(false);

      for (akj $$3 : $$1) {
         $$3.c.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> te.a("commands.title.cleared.single", $$1.iterator().next().H_()), true);
      } else {
         $$0.a(() -> te.a("commands.title.cleared.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(ds $$0, Collection<akj> $$1) {
      xf $$2 = new xf(true);

      for (akj $$3 : $$1) {
         $$3.c.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> te.a("commands.title.reset.single", $$1.iterator().next().H_()), true);
      } else {
         $$0.a(() -> te.a("commands.title.reset.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ds $$0, Collection<akj> $$1, te $$2, String $$3, Function<te, uw<?>> $$4) throws CommandSyntaxException {
      for (akj $$5 : $$1) {
         $$5.c.b($$4.apply(tg.a($$0, $$2, $$5, 0)));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> te.a("commands.title.show." + $$3 + ".single", $$1.iterator().next().H_()), true);
      } else {
         $$0.a(() -> te.a("commands.title.show." + $$3 + ".multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ds $$0, Collection<akj> $$1, int $$2, int $$3, int $$4) {
      aae $$5 = new aae($$2, $$3, $$4);

      for (akj $$6 : $$1) {
         $$6.c.b($$5);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> te.a("commands.title.times.single", $$1.iterator().next().H_()), true);
      } else {
         $$0.a(() -> te.a("commands.title.times.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}

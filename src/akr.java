import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.function.Function;

public class akr {
   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("title").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a(
                                    "targets", eg.d()
                                 )
                                 .then(dv.a("clear").executes($$0x -> a((du)$$0x.getSource(), eg.f($$0x, "targets")))))
                              .then(dv.a("reset").executes($$0x -> b((du)$$0x.getSource(), eg.f($$0x, "targets")))))
                           .then(
                              dv.a("title")
                                 .then(
                                    dv.a("title", ec.a())
                                       .executes($$0x -> a((du)$$0x.getSource(), eg.f($$0x, "targets"), ec.a($$0x, "title"), "title", abv::new))
                                 )
                           ))
                        .then(
                           dv.a("subtitle")
                              .then(
                                 dv.a("title", ec.a())
                                    .executes($$0x -> a((du)$$0x.getSource(), eg.f($$0x, "targets"), ec.a($$0x, "title"), "subtitle", abt::new))
                              )
                        ))
                     .then(
                        dv.a("actionbar")
                           .then(
                              dv.a("title", ec.a())
                                 .executes($$0x -> a((du)$$0x.getSource(), eg.f($$0x, "targets"), ec.a($$0x, "title"), "actionbar", aaw::new))
                           )
                     ))
                  .then(
                     dv.a("times")
                        .then(
                           dv.a("fadeIn", ff.a())
                              .then(
                                 dv.a("stay", ff.a())
                                    .then(
                                       dv.a("fadeOut", ff.a())
                                          .executes(
                                             $$0x -> a(
                                                   (du)$$0x.getSource(),
                                                   eg.f($$0x, "targets"),
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

   private static int a(du $$0, Collection<amj> $$1) {
      yx $$2 = new yx(false);

      for (amj $$3 : $$1) {
         $$3.c.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> uv.a("commands.title.cleared.single", $$1.iterator().next().Q_()), true);
      } else {
         $$0.a(() -> uv.a("commands.title.cleared.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(du $$0, Collection<amj> $$1) {
      yx $$2 = new yx(true);

      for (amj $$3 : $$1) {
         $$3.c.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> uv.a("commands.title.reset.single", $$1.iterator().next().Q_()), true);
      } else {
         $$0.a(() -> uv.a("commands.title.reset.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(du $$0, Collection<amj> $$1, uv $$2, String $$3, Function<uv, wo<?>> $$4) throws CommandSyntaxException {
      for (amj $$5 : $$1) {
         $$5.c.b($$4.apply(uy.a($$0, $$2, $$5, 0)));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> uv.a("commands.title.show." + $$3 + ".single", $$1.iterator().next().Q_()), true);
      } else {
         $$0.a(() -> uv.a("commands.title.show." + $$3 + ".multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(du $$0, Collection<amj> $$1, int $$2, int $$3, int $$4) {
      abw $$5 = new abw($$2, $$3, $$4);

      for (amj $$6 : $$1) {
         $$6.c.b($$5);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> uv.a("commands.title.times.single", $$1.iterator().next().Q_()), true);
      } else {
         $$0.a(() -> uv.a("commands.title.times.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.ToIntFunction;

public class amj {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("commands.experience.set.points.invalid"));

   public static void a(CommandDispatcher<ed> $$0) {
      LiteralCommandNode<ed> $$1 = $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("experience").requires($$0x -> $$0x.c(2)))
                  .then(
                     ee.a("add")
                        .then(
                           ee.a("targets", eq.d())
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ee.a("amount", IntegerArgumentType.integer())
                                          .executes(
                                             $$0x -> a((ed)$$0x.getSource(), eq.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), amj.a.a)
                                          ))
                                       .then(
                                          ee.a("points")
                                             .executes(
                                                $$0x -> a((ed)$$0x.getSource(), eq.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), amj.a.a)
                                             )
                                       ))
                                    .then(
                                       ee.a("levels")
                                          .executes(
                                             $$0x -> a((ed)$$0x.getSource(), eq.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), amj.a.b)
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  ee.a("set")
                     .then(
                        ee.a("targets", eq.d())
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ee.a("amount", IntegerArgumentType.integer(0))
                                       .executes(
                                          $$0x -> b((ed)$$0x.getSource(), eq.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), amj.a.a)
                                       ))
                                    .then(
                                       ee.a("points")
                                          .executes(
                                             $$0x -> b((ed)$$0x.getSource(), eq.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), amj.a.a)
                                          )
                                    ))
                                 .then(
                                    ee.a("levels")
                                       .executes(
                                          $$0x -> b((ed)$$0x.getSource(), eq.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), amj.a.b)
                                       )
                                 )
                           )
                     )
               ))
            .then(
               ee.a("query")
                  .then(
                     ((RequiredArgumentBuilder)ee.a("targets", eq.c())
                           .then(ee.a("points").executes($$0x -> a((ed)$$0x.getSource(), eq.e($$0x, "targets"), amj.a.a))))
                        .then(ee.a("levels").executes($$0x -> a((ed)$$0x.getSource(), eq.e($$0x, "targets"), amj.a.b)))
                  )
            )
      );
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("xp").requires($$0x -> $$0x.c(2))).redirect($$1));
   }

   private static int a(ed $$0, aqi $$1, amj.a $$2) {
      int $$3 = $$2.f.applyAsInt($$1);
      $$0.a(() -> wu.a("commands.experience.query." + $$2.e, $$1.O_(), $$3), false);
      return $$3;
   }

   private static int a(ed $$0, Collection<? extends aqi> $$1, int $$2, amj.a $$3) {
      for (aqi $$4 : $$1) {
         $$3.c.accept($$4, $$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wu.a("commands.experience.add." + $$3.e + ".success.single", $$2, $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> wu.a("commands.experience.add." + $$3.e + ".success.multiple", $$2, $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(ed $$0, Collection<? extends aqi> $$1, int $$2, amj.a $$3) throws CommandSyntaxException {
      int $$4 = 0;

      for (aqi $$5 : $$1) {
         if ($$3.d.test($$5, $$2)) {
            $$4++;
         }
      }

      if ($$4 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> wu.a("commands.experience.set." + $$3.e + ".success.single", $$2, $$1.iterator().next().O_()), true);
         } else {
            $$0.a(() -> wu.a("commands.experience.set." + $$3.e + ".success.multiple", $$2, $$1.size()), true);
         }

         return $$1.size();
      }
   }

   static enum a {
      a("points", clh::d, ($$0, $$1) -> {
         if ($$1 >= $$0.gj()) {
            return false;
         } else {
            $$0.a($$1);
            return true;
         }
      }, $$0 -> axz.d($$0.cr * (float)$$0.gj())),
      b("levels", aqi::c, ($$0, $$1) -> {
         $$0.b($$1);
         return true;
      }, $$0 -> $$0.cp);

      public final BiConsumer<aqi, Integer> c;
      public final BiPredicate<aqi, Integer> d;
      public final String e;
      final ToIntFunction<aqi> f;

      private a(String $$0, BiConsumer<aqi, Integer> $$1, BiPredicate<aqi, Integer> $$2, ToIntFunction<aqi> $$3) {
         this.c = $$1;
         this.e = $$0;
         this.d = $$2;
         this.f = $$3;
      }
   }
}

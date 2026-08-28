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

public class amy {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wp.c("commands.experience.set.points.invalid"));

   public static void a(CommandDispatcher<ex> $$0) {
      LiteralCommandNode<ex> $$1 = $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("experience").requires($$0x -> $$0x.c(2)))
                  .then(
                     ey.a("add")
                        .then(
                           ey.a("target", fk.d())
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ey.a("amount", IntegerArgumentType.integer())
                                          .executes(
                                             $$0x -> a((ex)$$0x.getSource(), fk.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), amy.a.a)
                                          ))
                                       .then(
                                          ey.a("points")
                                             .executes(
                                                $$0x -> a((ex)$$0x.getSource(), fk.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), amy.a.a)
                                             )
                                       ))
                                    .then(
                                       ey.a("levels")
                                          .executes(
                                             $$0x -> a((ex)$$0x.getSource(), fk.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), amy.a.b)
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  ey.a("set")
                     .then(
                        ey.a("target", fk.d())
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ey.a("amount", IntegerArgumentType.integer(0))
                                       .executes($$0x -> b((ex)$$0x.getSource(), fk.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), amy.a.a)))
                                    .then(
                                       ey.a("points")
                                          .executes(
                                             $$0x -> b((ex)$$0x.getSource(), fk.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), amy.a.a)
                                          )
                                    ))
                                 .then(
                                    ey.a("levels")
                                       .executes($$0x -> b((ex)$$0x.getSource(), fk.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), amy.a.b))
                                 )
                           )
                     )
               ))
            .then(
               ey.a("query")
                  .then(
                     ((RequiredArgumentBuilder)ey.a("target", fk.c())
                           .then(ey.a("points").executes($$0x -> a((ex)$$0x.getSource(), fk.e($$0x, "target"), amy.a.a))))
                        .then(ey.a("levels").executes($$0x -> a((ex)$$0x.getSource(), fk.e($$0x, "target"), amy.a.b)))
                  )
            )
      );
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("xp").requires($$0x -> $$0x.c(2))).redirect($$1));
   }

   private static int a(ex $$0, are $$1, amy.a $$2) {
      int $$3 = $$2.f.applyAsInt($$1);
      $$0.a(() -> wp.a("commands.experience.query." + $$2.e, $$1.m_(), $$3), false);
      return $$3;
   }

   private static int a(ex $$0, Collection<? extends are> $$1, int $$2, amy.a $$3) {
      for (are $$4 : $$1) {
         $$3.c.accept($$4, $$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wp.a("commands.experience.add." + $$3.e + ".success.single", $$2, $$1.iterator().next().m_()), true);
      } else {
         $$0.a(() -> wp.a("commands.experience.add." + $$3.e + ".success.multiple", $$2, $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(ex $$0, Collection<? extends are> $$1, int $$2, amy.a $$3) throws CommandSyntaxException {
      int $$4 = 0;

      for (are $$5 : $$1) {
         if ($$3.d.test($$5, $$2)) {
            $$4++;
         }
      }

      if ($$4 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> wp.a("commands.experience.set." + $$3.e + ".success.single", $$2, $$1.iterator().next().m_()), true);
         } else {
            $$0.a(() -> wp.a("commands.experience.set." + $$3.e + ".success.multiple", $$2, $$1.size()), true);
         }

         return $$1.size();
      }
   }

   static enum a {
      a("points", cpr::d, ($$0, $$1) -> {
         if ($$1 >= $$0.gv()) {
            return false;
         } else {
            $$0.a($$1);
            return true;
         }
      }, $$0 -> ayz.d($$0.cg * (float)$$0.gv())),
      b("levels", are::c, ($$0, $$1) -> {
         $$0.b($$1);
         return true;
      }, $$0 -> $$0.ce);

      public final BiConsumer<are, Integer> c;
      public final BiPredicate<are, Integer> d;
      public final String e;
      final ToIntFunction<are> f;

      private a(final String $$0, final BiConsumer<are, Integer> $$1, final BiPredicate<are, Integer> $$2, final ToIntFunction<are> $$3) {
         this.c = $$1;
         this.e = $$0;
         this.d = $$2;
         this.f = $$3;
      }
   }
}

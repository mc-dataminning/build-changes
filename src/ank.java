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

public class ank {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wy.c("commands.experience.set.points.invalid"));

   public static void a(CommandDispatcher<ej> $$0) {
      LiteralCommandNode<ej> $$1 = $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("experience").requires($$0x -> $$0x.c(2)))
                  .then(
                     ek.a("add")
                        .then(
                           ek.a("target", ew.d())
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ek.a("amount", IntegerArgumentType.integer())
                                          .executes(
                                             $$0x -> a((ej)$$0x.getSource(), ew.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), ank.a.a)
                                          ))
                                       .then(
                                          ek.a("points")
                                             .executes(
                                                $$0x -> a((ej)$$0x.getSource(), ew.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), ank.a.a)
                                             )
                                       ))
                                    .then(
                                       ek.a("levels")
                                          .executes(
                                             $$0x -> a((ej)$$0x.getSource(), ew.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), ank.a.b)
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  ek.a("set")
                     .then(
                        ek.a("target", ew.d())
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ek.a("amount", IntegerArgumentType.integer(0))
                                       .executes($$0x -> b((ej)$$0x.getSource(), ew.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), ank.a.a)))
                                    .then(
                                       ek.a("points")
                                          .executes(
                                             $$0x -> b((ej)$$0x.getSource(), ew.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), ank.a.a)
                                          )
                                    ))
                                 .then(
                                    ek.a("levels")
                                       .executes($$0x -> b((ej)$$0x.getSource(), ew.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), ank.a.b))
                                 )
                           )
                     )
               ))
            .then(
               ek.a("query")
                  .then(
                     ((RequiredArgumentBuilder)ek.a("target", ew.c())
                           .then(ek.a("points").executes($$0x -> a((ej)$$0x.getSource(), ew.e($$0x, "target"), ank.a.a))))
                        .then(ek.a("levels").executes($$0x -> a((ej)$$0x.getSource(), ew.e($$0x, "target"), ank.a.b)))
                  )
            )
      );
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("xp").requires($$0x -> $$0x.c(2))).redirect($$1));
   }

   private static int a(ej $$0, arr $$1, ank.a $$2) {
      int $$3 = $$2.f.applyAsInt($$1);
      $$0.a(() -> wy.a("commands.experience.query." + $$2.e, $$1.m_(), $$3), false);
      return $$3;
   }

   private static int a(ej $$0, Collection<? extends arr> $$1, int $$2, ank.a $$3) {
      for (arr $$4 : $$1) {
         $$3.c.accept($$4, $$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wy.a("commands.experience.add." + $$3.e + ".success.single", $$2, $$1.iterator().next().m_()), true);
      } else {
         $$0.a(() -> wy.a("commands.experience.add." + $$3.e + ".success.multiple", $$2, $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(ej $$0, Collection<? extends arr> $$1, int $$2, ank.a $$3) throws CommandSyntaxException {
      int $$4 = 0;

      for (arr $$5 : $$1) {
         if ($$3.d.test($$5, $$2)) {
            $$4++;
         }
      }

      if ($$4 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> wy.a("commands.experience.set." + $$3.e + ".success.single", $$2, $$1.iterator().next().m_()), true);
         } else {
            $$0.a(() -> wy.a("commands.experience.set." + $$3.e + ".success.multiple", $$2, $$1.size()), true);
         }

         return $$1.size();
      }
   }

   static enum a {
      a("points", crm::d, ($$0, $$1) -> {
         if ($$1 >= $$0.gs()) {
            return false;
         } else {
            $$0.a($$1);
            return true;
         }
      }, $$0 -> azm.d($$0.ch * (float)$$0.gs())),
      b("levels", arr::c, ($$0, $$1) -> {
         $$0.b($$1);
         return true;
      }, $$0 -> $$0.cf);

      public final BiConsumer<arr, Integer> c;
      public final BiPredicate<arr, Integer> d;
      public final String e;
      final ToIntFunction<arr> f;

      private a(final String $$0, final BiConsumer<arr, Integer> $$1, final BiPredicate<arr, Integer> $$2, final ToIntFunction<arr> $$3) {
         this.c = $$1;
         this.e = $$0;
         this.d = $$2;
         this.f = $$3;
      }
   }
}

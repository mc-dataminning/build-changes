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

public class agx {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tl.c("commands.experience.set.points.invalid"));

   public static void a(CommandDispatcher<dt> $$0) {
      LiteralCommandNode<dt> $$1 = $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("experience").requires($$0x -> $$0x.c(2)))
                  .then(
                     du.a("add")
                        .then(
                           du.a("targets", ee.d())
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)du.a("amount", IntegerArgumentType.integer())
                                          .executes(
                                             $$0x -> a((dt)$$0x.getSource(), ee.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), agx.a.a)
                                          ))
                                       .then(
                                          du.a("points")
                                             .executes(
                                                $$0x -> a((dt)$$0x.getSource(), ee.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), agx.a.a)
                                             )
                                       ))
                                    .then(
                                       du.a("levels")
                                          .executes(
                                             $$0x -> a((dt)$$0x.getSource(), ee.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), agx.a.b)
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  du.a("set")
                     .then(
                        du.a("targets", ee.d())
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)du.a("amount", IntegerArgumentType.integer(0))
                                       .executes(
                                          $$0x -> b((dt)$$0x.getSource(), ee.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), agx.a.a)
                                       ))
                                    .then(
                                       du.a("points")
                                          .executes(
                                             $$0x -> b((dt)$$0x.getSource(), ee.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), agx.a.a)
                                          )
                                    ))
                                 .then(
                                    du.a("levels")
                                       .executes(
                                          $$0x -> b((dt)$$0x.getSource(), ee.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), agx.a.b)
                                       )
                                 )
                           )
                     )
               ))
            .then(
               du.a("query")
                  .then(
                     ((RequiredArgumentBuilder)du.a("targets", ee.c())
                           .then(du.a("points").executes($$0x -> a((dt)$$0x.getSource(), ee.e($$0x, "targets"), agx.a.a))))
                        .then(du.a("levels").executes($$0x -> a((dt)$$0x.getSource(), ee.e($$0x, "targets"), agx.a.b)))
                  )
            )
      );
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("xp").requires($$0x -> $$0x.c(2))).redirect($$1));
   }

   private static int a(dt $$0, aks $$1, agx.a $$2) {
      int $$3 = $$2.f.applyAsInt($$1);
      $$0.a(() -> tl.a("commands.experience.query." + $$2.e, $$1.N_(), $$3), false);
      return $$3;
   }

   private static int a(dt $$0, Collection<? extends aks> $$1, int $$2, agx.a $$3) {
      for (aks $$4 : $$1) {
         $$3.c.accept($$4, $$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> tl.a("commands.experience.add." + $$3.e + ".success.single", $$2, $$1.iterator().next().N_()), true);
      } else {
         $$0.a(() -> tl.a("commands.experience.add." + $$3.e + ".success.multiple", $$2, $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(dt $$0, Collection<? extends aks> $$1, int $$2, agx.a $$3) throws CommandSyntaxException {
      int $$4 = 0;

      for (aks $$5 : $$1) {
         if ($$3.d.test($$5, $$2)) {
            $$4++;
         }
      }

      if ($$4 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> tl.a("commands.experience.set." + $$3.e + ".success.single", $$2, $$1.iterator().next().N_()), true);
         } else {
            $$0.a(() -> tl.a("commands.experience.set." + $$3.e + ".success.multiple", $$2, $$1.size()), true);
         }

         return $$1.size();
      }
   }

   static enum a {
      a("points", cbu::d, ($$0, $$1) -> {
         if ($$1 >= $$0.ga()) {
            return false;
         } else {
            $$0.a($$1);
            return true;
         }
      }, $$0 -> arx.d($$0.ch * (float)$$0.ga())),
      b("levels", aks::c, ($$0, $$1) -> {
         $$0.b($$1);
         return true;
      }, $$0 -> $$0.cf);

      public final BiConsumer<aks, Integer> c;
      public final BiPredicate<aks, Integer> d;
      public final String e;
      final ToIntFunction<aks> f;

      private a(String $$0, BiConsumer<aks, Integer> $$1, BiPredicate<aks, Integer> $$2, ToIntFunction<aks> $$3) {
         this.c = $$1;
         this.e = $$0;
         this.d = $$2;
         this.f = $$3;
      }
   }
}

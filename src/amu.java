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

public class amu {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wz.c("commands.experience.set.points.invalid"));

   public static void a(CommandDispatcher<et> $$0) {
      LiteralCommandNode<et> $$1 = $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("experience").requires($$0x -> $$0x.c(2)))
                  .then(
                     eu.a("add")
                        .then(
                           eu.a("targets", fg.d())
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)eu.a("amount", IntegerArgumentType.integer())
                                          .executes(
                                             $$0x -> a((et)$$0x.getSource(), fg.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), amu.a.a)
                                          ))
                                       .then(
                                          eu.a("points")
                                             .executes(
                                                $$0x -> a((et)$$0x.getSource(), fg.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), amu.a.a)
                                             )
                                       ))
                                    .then(
                                       eu.a("levels")
                                          .executes(
                                             $$0x -> a((et)$$0x.getSource(), fg.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), amu.a.b)
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  eu.a("set")
                     .then(
                        eu.a("targets", fg.d())
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)eu.a("amount", IntegerArgumentType.integer(0))
                                       .executes(
                                          $$0x -> b((et)$$0x.getSource(), fg.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), amu.a.a)
                                       ))
                                    .then(
                                       eu.a("points")
                                          .executes(
                                             $$0x -> b((et)$$0x.getSource(), fg.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), amu.a.a)
                                          )
                                    ))
                                 .then(
                                    eu.a("levels")
                                       .executes(
                                          $$0x -> b((et)$$0x.getSource(), fg.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), amu.a.b)
                                       )
                                 )
                           )
                     )
               ))
            .then(
               eu.a("query")
                  .then(
                     ((RequiredArgumentBuilder)eu.a("targets", fg.c())
                           .then(eu.a("points").executes($$0x -> a((et)$$0x.getSource(), fg.e($$0x, "targets"), amu.a.a))))
                        .then(eu.a("levels").executes($$0x -> a((et)$$0x.getSource(), fg.e($$0x, "targets"), amu.a.b)))
                  )
            )
      );
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("xp").requires($$0x -> $$0x.c(2))).redirect($$1));
   }

   private static int a(et $$0, aqv $$1, amu.a $$2) {
      int $$3 = $$2.f.applyAsInt($$1);
      $$0.a(() -> wz.a("commands.experience.query." + $$2.e, $$1.S_(), $$3), false);
      return $$3;
   }

   private static int a(et $$0, Collection<? extends aqv> $$1, int $$2, amu.a $$3) {
      for (aqv $$4 : $$1) {
         $$3.c.accept($$4, $$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wz.a("commands.experience.add." + $$3.e + ".success.single", $$2, $$1.iterator().next().S_()), true);
      } else {
         $$0.a(() -> wz.a("commands.experience.add." + $$3.e + ".success.multiple", $$2, $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(et $$0, Collection<? extends aqv> $$1, int $$2, amu.a $$3) throws CommandSyntaxException {
      int $$4 = 0;

      for (aqv $$5 : $$1) {
         if ($$3.d.test($$5, $$2)) {
            $$4++;
         }
      }

      if ($$4 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> wz.a("commands.experience.set." + $$3.e + ".success.single", $$2, $$1.iterator().next().S_()), true);
         } else {
            $$0.a(() -> wz.a("commands.experience.set." + $$3.e + ".success.multiple", $$2, $$1.size()), true);
         }

         return $$1.size();
      }
   }

   static enum a {
      a("points", cmx::d, ($$0, $$1) -> {
         if ($$1 >= $$0.gi()) {
            return false;
         } else {
            $$0.a($$1);
            return true;
         }
      }, $$0 -> ayo.d($$0.cs * (float)$$0.gi())),
      b("levels", aqv::c, ($$0, $$1) -> {
         $$0.b($$1);
         return true;
      }, $$0 -> $$0.cq);

      public final BiConsumer<aqv, Integer> c;
      public final BiPredicate<aqv, Integer> d;
      public final String e;
      final ToIntFunction<aqv> f;

      private a(final String $$0, final BiConsumer<aqv, Integer> $$1, final BiPredicate<aqv, Integer> $$2, final ToIntFunction<aqv> $$3) {
         this.c = $$1;
         this.e = $$0;
         this.d = $$2;
         this.f = $$3;
      }
   }
}

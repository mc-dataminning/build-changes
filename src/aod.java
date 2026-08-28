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

public class aod {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xv.c("commands.experience.set.points.invalid"));

   public static void a(CommandDispatcher<ew> $$0) {
      LiteralCommandNode<ew> $$1 = $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("experience").requires($$0x -> $$0x.c(2)))
                  .then(
                     ex.a("add")
                        .then(
                           ex.a("target", fj.d())
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ex.a("amount", IntegerArgumentType.integer())
                                          .executes(
                                             $$0x -> a((ew)$$0x.getSource(), fj.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), aod.a.a)
                                          ))
                                       .then(
                                          ex.a("points")
                                             .executes(
                                                $$0x -> a((ew)$$0x.getSource(), fj.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), aod.a.a)
                                             )
                                       ))
                                    .then(
                                       ex.a("levels")
                                          .executes(
                                             $$0x -> a((ew)$$0x.getSource(), fj.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), aod.a.b)
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  ex.a("set")
                     .then(
                        ex.a("target", fj.d())
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ex.a("amount", IntegerArgumentType.integer(0))
                                       .executes($$0x -> b((ew)$$0x.getSource(), fj.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), aod.a.a)))
                                    .then(
                                       ex.a("points")
                                          .executes(
                                             $$0x -> b((ew)$$0x.getSource(), fj.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), aod.a.a)
                                          )
                                    ))
                                 .then(
                                    ex.a("levels")
                                       .executes($$0x -> b((ew)$$0x.getSource(), fj.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), aod.a.b))
                                 )
                           )
                     )
               ))
            .then(
               ex.a("query")
                  .then(
                     ((RequiredArgumentBuilder)ex.a("target", fj.c())
                           .then(ex.a("points").executes($$0x -> a((ew)$$0x.getSource(), fj.e($$0x, "target"), aod.a.a))))
                        .then(ex.a("levels").executes($$0x -> a((ew)$$0x.getSource(), fj.e($$0x, "target"), aod.a.b)))
                  )
            )
      );
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("xp").requires($$0x -> $$0x.c(2))).redirect($$1));
   }

   private static int a(ew $$0, asi $$1, aod.a $$2) {
      int $$3 = $$2.f.applyAsInt($$1);
      $$0.a(() -> xv.a("commands.experience.query." + $$2.e, $$1.p_(), $$3), false);
      return $$3;
   }

   private static int a(ew $$0, Collection<? extends asi> $$1, int $$2, aod.a $$3) {
      for (asi $$4 : $$1) {
         $$3.c.accept($$4, $$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xv.a("commands.experience.add." + $$3.e + ".success.single", $$2, $$1.iterator().next().p_()), true);
      } else {
         $$0.a(() -> xv.a("commands.experience.add." + $$3.e + ".success.multiple", $$2, $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(ew $$0, Collection<? extends asi> $$1, int $$2, aod.a $$3) throws CommandSyntaxException {
      int $$4 = 0;

      for (asi $$5 : $$1) {
         if ($$3.d.test($$5, $$2)) {
            $$4++;
         }
      }

      if ($$4 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> xv.a("commands.experience.set." + $$3.e + ".success.single", $$2, $$1.iterator().next().p_()), true);
         } else {
            $$0.a(() -> xv.a("commands.experience.set." + $$3.e + ".success.multiple", $$2, $$1.size()), true);
         }

         return $$1.size();
      }
   }

   static enum a {
      a("points", cpx::d, ($$0, $$1) -> {
         if ($$1 >= $$0.gs()) {
            return false;
         } else {
            $$0.a($$1);
            return true;
         }
      }, $$0 -> bae.d($$0.cs * (float)$$0.gs())),
      b("levels", asi::c, ($$0, $$1) -> {
         $$0.b($$1);
         return true;
      }, $$0 -> $$0.cq);

      public final BiConsumer<asi, Integer> c;
      public final BiPredicate<asi, Integer> d;
      public final String e;
      final ToIntFunction<asi> f;

      private a(final String $$0, final BiConsumer<asi, Integer> $$1, final BiPredicate<asi, Integer> $$2, final ToIntFunction<asi> $$3) {
         this.c = $$1;
         this.e = $$0;
         this.d = $$2;
         this.f = $$3;
      }
   }
}

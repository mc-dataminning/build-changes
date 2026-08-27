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

public class alw {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wi.c("commands.experience.set.points.invalid"));

   public static void a(CommandDispatcher<dv> $$0) {
      LiteralCommandNode<dv> $$1 = $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("experience").requires($$0x -> $$0x.c(2)))
                  .then(
                     dw.a("add")
                        .then(
                           dw.a("targets", ei.d())
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dw.a("amount", IntegerArgumentType.integer())
                                          .executes(
                                             $$0x -> a((dv)$$0x.getSource(), ei.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), alw.a.a)
                                          ))
                                       .then(
                                          dw.a("points")
                                             .executes(
                                                $$0x -> a((dv)$$0x.getSource(), ei.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), alw.a.a)
                                             )
                                       ))
                                    .then(
                                       dw.a("levels")
                                          .executes(
                                             $$0x -> a((dv)$$0x.getSource(), ei.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), alw.a.b)
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  dw.a("set")
                     .then(
                        dw.a("targets", ei.d())
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dw.a("amount", IntegerArgumentType.integer(0))
                                       .executes(
                                          $$0x -> b((dv)$$0x.getSource(), ei.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), alw.a.a)
                                       ))
                                    .then(
                                       dw.a("points")
                                          .executes(
                                             $$0x -> b((dv)$$0x.getSource(), ei.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), alw.a.a)
                                          )
                                    ))
                                 .then(
                                    dw.a("levels")
                                       .executes(
                                          $$0x -> b((dv)$$0x.getSource(), ei.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), alw.a.b)
                                       )
                                 )
                           )
                     )
               ))
            .then(
               dw.a("query")
                  .then(
                     ((RequiredArgumentBuilder)dw.a("targets", ei.c())
                           .then(dw.a("points").executes($$0x -> a((dv)$$0x.getSource(), ei.e($$0x, "targets"), alw.a.a))))
                        .then(dw.a("levels").executes($$0x -> a((dv)$$0x.getSource(), ei.e($$0x, "targets"), alw.a.b)))
                  )
            )
      );
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("xp").requires($$0x -> $$0x.c(2))).redirect($$1));
   }

   private static int a(dv $$0, apv $$1, alw.a $$2) {
      int $$3 = $$2.f.applyAsInt($$1);
      $$0.a(() -> wi.a("commands.experience.query." + $$2.e, $$1.O_(), $$3), false);
      return $$3;
   }

   private static int a(dv $$0, Collection<? extends apv> $$1, int $$2, alw.a $$3) {
      for (apv $$4 : $$1) {
         $$3.c.accept($$4, $$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wi.a("commands.experience.add." + $$3.e + ".success.single", $$2, $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> wi.a("commands.experience.add." + $$3.e + ".success.multiple", $$2, $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(dv $$0, Collection<? extends apv> $$1, int $$2, alw.a $$3) throws CommandSyntaxException {
      int $$4 = 0;

      for (apv $$5 : $$1) {
         if ($$3.d.test($$5, $$2)) {
            $$4++;
         }
      }

      if ($$4 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> wi.a("commands.experience.set." + $$3.e + ".success.single", $$2, $$1.iterator().next().O_()), true);
         } else {
            $$0.a(() -> wi.a("commands.experience.set." + $$3.e + ".success.multiple", $$2, $$1.size()), true);
         }

         return $$1.size();
      }
   }

   static enum a {
      a("points", cka::d, ($$0, $$1) -> {
         if ($$1 >= $$0.gi()) {
            return false;
         } else {
            $$0.a($$1);
            return true;
         }
      }, $$0 -> axm.d($$0.cp * (float)$$0.gi())),
      b("levels", apv::c, ($$0, $$1) -> {
         $$0.b($$1);
         return true;
      }, $$0 -> $$0.cn);

      public final BiConsumer<apv, Integer> c;
      public final BiPredicate<apv, Integer> d;
      public final String e;
      final ToIntFunction<apv> f;

      private a(String $$0, BiConsumer<apv, Integer> $$1, BiPredicate<apv, Integer> $$2, ToIntFunction<apv> $$3) {
         this.c = $$1;
         this.e = $$0;
         this.d = $$2;
         this.f = $$3;
      }
   }
}

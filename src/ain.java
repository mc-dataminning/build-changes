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

public class ain {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(uv.c("commands.experience.set.points.invalid"));

   public static void a(CommandDispatcher<du> $$0) {
      LiteralCommandNode<du> $$1 = $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("experience").requires($$0x -> $$0x.c(2)))
                  .then(
                     dv.a("add")
                        .then(
                           dv.a("targets", eg.d())
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a("amount", IntegerArgumentType.integer())
                                          .executes(
                                             $$0x -> a((du)$$0x.getSource(), eg.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), ain.a.a)
                                          ))
                                       .then(
                                          dv.a("points")
                                             .executes(
                                                $$0x -> a((du)$$0x.getSource(), eg.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), ain.a.a)
                                             )
                                       ))
                                    .then(
                                       dv.a("levels")
                                          .executes(
                                             $$0x -> a((du)$$0x.getSource(), eg.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), ain.a.b)
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  dv.a("set")
                     .then(
                        dv.a("targets", eg.d())
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a("amount", IntegerArgumentType.integer(0))
                                       .executes(
                                          $$0x -> b((du)$$0x.getSource(), eg.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), ain.a.a)
                                       ))
                                    .then(
                                       dv.a("points")
                                          .executes(
                                             $$0x -> b((du)$$0x.getSource(), eg.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), ain.a.a)
                                          )
                                    ))
                                 .then(
                                    dv.a("levels")
                                       .executes(
                                          $$0x -> b((du)$$0x.getSource(), eg.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), ain.a.b)
                                       )
                                 )
                           )
                     )
               ))
            .then(
               dv.a("query")
                  .then(
                     ((RequiredArgumentBuilder)dv.a("targets", eg.c())
                           .then(dv.a("points").executes($$0x -> a((du)$$0x.getSource(), eg.e($$0x, "targets"), ain.a.a))))
                        .then(dv.a("levels").executes($$0x -> a((du)$$0x.getSource(), eg.e($$0x, "targets"), ain.a.b)))
                  )
            )
      );
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("xp").requires($$0x -> $$0x.c(2))).redirect($$1));
   }

   private static int a(du $$0, amj $$1, ain.a $$2) {
      int $$3 = $$2.f.applyAsInt($$1);
      $$0.a(() -> uv.a("commands.experience.query." + $$2.e, $$1.Q_(), $$3), false);
      return $$3;
   }

   private static int a(du $$0, Collection<? extends amj> $$1, int $$2, ain.a $$3) {
      for (amj $$4 : $$1) {
         $$3.c.accept($$4, $$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> uv.a("commands.experience.add." + $$3.e + ".success.single", $$2, $$1.iterator().next().Q_()), true);
      } else {
         $$0.a(() -> uv.a("commands.experience.add." + $$3.e + ".success.multiple", $$2, $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(du $$0, Collection<? extends amj> $$1, int $$2, ain.a $$3) throws CommandSyntaxException {
      int $$4 = 0;

      for (amj $$5 : $$1) {
         if ($$3.d.test($$5, $$2)) {
            $$4++;
         }
      }

      if ($$4 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> uv.a("commands.experience.set." + $$3.e + ".success.single", $$2, $$1.iterator().next().Q_()), true);
         } else {
            $$0.a(() -> uv.a("commands.experience.set." + $$3.e + ".success.multiple", $$2, $$1.size()), true);
         }

         return $$1.size();
      }
   }

   static enum a {
      a("points", cdz::d, ($$0, $$1) -> {
         if ($$1 >= $$0.gc()) {
            return false;
         } else {
            $$0.a($$1);
            return true;
         }
      }, $$0 -> atq.d($$0.ch * (float)$$0.gc())),
      b("levels", amj::c, ($$0, $$1) -> {
         $$0.b($$1);
         return true;
      }, $$0 -> $$0.cf);

      public final BiConsumer<amj, Integer> c;
      public final BiPredicate<amj, Integer> d;
      public final String e;
      final ToIntFunction<amj> f;

      private a(String $$0, BiConsumer<amj, Integer> $$1, BiPredicate<amj, Integer> $$2, ToIntFunction<amj> $$3) {
         this.c = $$1;
         this.e = $$0;
         this.d = $$2;
         this.f = $$3;
      }
   }
}

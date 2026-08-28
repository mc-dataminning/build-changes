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

public class anm {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xa.c("commands.experience.set.points.invalid"));

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
                                             $$0x -> a((ej)$$0x.getSource(), ew.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), anm.a.a)
                                          ))
                                       .then(
                                          ek.a("points")
                                             .executes(
                                                $$0x -> a((ej)$$0x.getSource(), ew.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), anm.a.a)
                                             )
                                       ))
                                    .then(
                                       ek.a("levels")
                                          .executes(
                                             $$0x -> a((ej)$$0x.getSource(), ew.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), anm.a.b)
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
                                       .executes($$0x -> b((ej)$$0x.getSource(), ew.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), anm.a.a)))
                                    .then(
                                       ek.a("points")
                                          .executes(
                                             $$0x -> b((ej)$$0x.getSource(), ew.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), anm.a.a)
                                          )
                                    ))
                                 .then(
                                    ek.a("levels")
                                       .executes($$0x -> b((ej)$$0x.getSource(), ew.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), anm.a.b))
                                 )
                           )
                     )
               ))
            .then(
               ek.a("query")
                  .then(
                     ((RequiredArgumentBuilder)ek.a("target", ew.c())
                           .then(ek.a("points").executes($$0x -> a((ej)$$0x.getSource(), ew.e($$0x, "target"), anm.a.a))))
                        .then(ek.a("levels").executes($$0x -> a((ej)$$0x.getSource(), ew.e($$0x, "target"), anm.a.b)))
                  )
            )
      );
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("xp").requires($$0x -> $$0x.c(2))).redirect($$1));
   }

   private static int a(ej $$0, art $$1, anm.a $$2) {
      int $$3 = $$2.f.applyAsInt($$1);
      $$0.a(() -> xa.a("commands.experience.query." + $$2.e, $$1.m_(), $$3), false);
      return $$3;
   }

   private static int a(ej $$0, Collection<? extends art> $$1, int $$2, anm.a $$3) {
      for (art $$4 : $$1) {
         $$3.c.accept($$4, $$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xa.a("commands.experience.add." + $$3.e + ".success.single", $$2, $$1.iterator().next().m_()), true);
      } else {
         $$0.a(() -> xa.a("commands.experience.add." + $$3.e + ".success.multiple", $$2, $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(ej $$0, Collection<? extends art> $$1, int $$2, anm.a $$3) throws CommandSyntaxException {
      int $$4 = 0;

      for (art $$5 : $$1) {
         if ($$3.d.test($$5, $$2)) {
            $$4++;
         }
      }

      if ($$4 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> xa.a("commands.experience.set." + $$3.e + ".success.single", $$2, $$1.iterator().next().m_()), true);
         } else {
            $$0.a(() -> xa.a("commands.experience.set." + $$3.e + ".success.multiple", $$2, $$1.size()), true);
         }

         return $$1.size();
      }
   }

   static enum a {
      a("points", crx::d, ($$0, $$1) -> {
         if ($$1 >= $$0.gt()) {
            return false;
         } else {
            $$0.a($$1);
            return true;
         }
      }, $$0 -> azo.d($$0.ch * (float)$$0.gt())),
      b("levels", art::c, ($$0, $$1) -> {
         $$0.b($$1);
         return true;
      }, $$0 -> $$0.cf);

      public final BiConsumer<art, Integer> c;
      public final BiPredicate<art, Integer> d;
      public final String e;
      final ToIntFunction<art> f;

      private a(final String $$0, final BiConsumer<art, Integer> $$1, final BiPredicate<art, Integer> $$2, final ToIntFunction<art> $$3) {
         this.c = $$1;
         this.e = $$0;
         this.d = $$2;
         this.f = $$3;
      }
   }
}

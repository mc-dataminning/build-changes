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

public class ano {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xc.c("commands.experience.set.points.invalid"));

   public static void a(CommandDispatcher<ek> $$0) {
      LiteralCommandNode<ek> $$1 = $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("experience").requires($$0x -> $$0x.c(2)))
                  .then(
                     el.a("add")
                        .then(
                           el.a("target", ex.d())
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)el.a("amount", IntegerArgumentType.integer())
                                          .executes(
                                             $$0x -> a((ek)$$0x.getSource(), ex.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), ano.a.a)
                                          ))
                                       .then(
                                          el.a("points")
                                             .executes(
                                                $$0x -> a((ek)$$0x.getSource(), ex.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), ano.a.a)
                                             )
                                       ))
                                    .then(
                                       el.a("levels")
                                          .executes(
                                             $$0x -> a((ek)$$0x.getSource(), ex.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), ano.a.b)
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  el.a("set")
                     .then(
                        el.a("target", ex.d())
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)el.a("amount", IntegerArgumentType.integer(0))
                                       .executes($$0x -> b((ek)$$0x.getSource(), ex.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), ano.a.a)))
                                    .then(
                                       el.a("points")
                                          .executes(
                                             $$0x -> b((ek)$$0x.getSource(), ex.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), ano.a.a)
                                          )
                                    ))
                                 .then(
                                    el.a("levels")
                                       .executes($$0x -> b((ek)$$0x.getSource(), ex.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), ano.a.b))
                                 )
                           )
                     )
               ))
            .then(
               el.a("query")
                  .then(
                     ((RequiredArgumentBuilder)el.a("target", ex.c())
                           .then(el.a("points").executes($$0x -> a((ek)$$0x.getSource(), ex.e($$0x, "target"), ano.a.a))))
                        .then(el.a("levels").executes($$0x -> a((ek)$$0x.getSource(), ex.e($$0x, "target"), ano.a.b)))
                  )
            )
      );
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("xp").requires($$0x -> $$0x.c(2))).redirect($$1));
   }

   private static int a(ek $$0, arv $$1, ano.a $$2) {
      int $$3 = $$2.f.applyAsInt($$1);
      $$0.a(() -> xc.a("commands.experience.query." + $$2.e, $$1.m_(), $$3), false);
      return $$3;
   }

   private static int a(ek $$0, Collection<? extends arv> $$1, int $$2, ano.a $$3) {
      for (arv $$4 : $$1) {
         $$3.c.accept($$4, $$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xc.a("commands.experience.add." + $$3.e + ".success.single", $$2, $$1.iterator().next().m_()), true);
      } else {
         $$0.a(() -> xc.a("commands.experience.add." + $$3.e + ".success.multiple", $$2, $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(ek $$0, Collection<? extends arv> $$1, int $$2, ano.a $$3) throws CommandSyntaxException {
      int $$4 = 0;

      for (arv $$5 : $$1) {
         if ($$3.d.test($$5, $$2)) {
            $$4++;
         }
      }

      if ($$4 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> xc.a("commands.experience.set." + $$3.e + ".success.single", $$2, $$1.iterator().next().m_()), true);
         } else {
            $$0.a(() -> xc.a("commands.experience.set." + $$3.e + ".success.multiple", $$2, $$1.size()), true);
         }

         return $$1.size();
      }
   }

   static enum a {
      a("points", crz::d, ($$0, $$1) -> {
         if ($$1 >= $$0.gt()) {
            return false;
         } else {
            $$0.a($$1);
            return true;
         }
      }, $$0 -> azq.d($$0.ch * (float)$$0.gt())),
      b("levels", arv::c, ($$0, $$1) -> {
         $$0.b($$1);
         return true;
      }, $$0 -> $$0.cf);

      public final BiConsumer<arv, Integer> c;
      public final BiPredicate<arv, Integer> d;
      public final String e;
      final ToIntFunction<arv> f;

      private a(final String $$0, final BiConsumer<arv, Integer> $$1, final BiPredicate<arv, Integer> $$2, final ToIntFunction<arv> $$3) {
         this.c = $$1;
         this.e = $$0;
         this.d = $$2;
         this.f = $$3;
      }
   }
}

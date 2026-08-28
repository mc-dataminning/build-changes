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

public class ani {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ww.c("commands.experience.set.points.invalid"));

   public static void a(CommandDispatcher<ei> $$0) {
      LiteralCommandNode<ei> $$1 = $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("experience").requires($$0x -> $$0x.c(2)))
                  .then(
                     ej.a("add")
                        .then(
                           ej.a("target", ev.d())
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ej.a("amount", IntegerArgumentType.integer())
                                          .executes(
                                             $$0x -> a((ei)$$0x.getSource(), ev.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), ani.a.a)
                                          ))
                                       .then(
                                          ej.a("points")
                                             .executes(
                                                $$0x -> a((ei)$$0x.getSource(), ev.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), ani.a.a)
                                             )
                                       ))
                                    .then(
                                       ej.a("levels")
                                          .executes(
                                             $$0x -> a((ei)$$0x.getSource(), ev.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), ani.a.b)
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  ej.a("set")
                     .then(
                        ej.a("target", ev.d())
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ej.a("amount", IntegerArgumentType.integer(0))
                                       .executes($$0x -> b((ei)$$0x.getSource(), ev.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), ani.a.a)))
                                    .then(
                                       ej.a("points")
                                          .executes(
                                             $$0x -> b((ei)$$0x.getSource(), ev.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), ani.a.a)
                                          )
                                    ))
                                 .then(
                                    ej.a("levels")
                                       .executes($$0x -> b((ei)$$0x.getSource(), ev.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), ani.a.b))
                                 )
                           )
                     )
               ))
            .then(
               ej.a("query")
                  .then(
                     ((RequiredArgumentBuilder)ej.a("target", ev.c())
                           .then(ej.a("points").executes($$0x -> a((ei)$$0x.getSource(), ev.e($$0x, "target"), ani.a.a))))
                        .then(ej.a("levels").executes($$0x -> a((ei)$$0x.getSource(), ev.e($$0x, "target"), ani.a.b)))
                  )
            )
      );
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("xp").requires($$0x -> $$0x.c(2))).redirect($$1));
   }

   private static int a(ei $$0, arp $$1, ani.a $$2) {
      int $$3 = $$2.f.applyAsInt($$1);
      $$0.a(() -> ww.a("commands.experience.query." + $$2.e, $$1.m_(), $$3), false);
      return $$3;
   }

   private static int a(ei $$0, Collection<? extends arp> $$1, int $$2, ani.a $$3) {
      for (arp $$4 : $$1) {
         $$3.c.accept($$4, $$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> ww.a("commands.experience.add." + $$3.e + ".success.single", $$2, $$1.iterator().next().m_()), true);
      } else {
         $$0.a(() -> ww.a("commands.experience.add." + $$3.e + ".success.multiple", $$2, $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(ei $$0, Collection<? extends arp> $$1, int $$2, ani.a $$3) throws CommandSyntaxException {
      int $$4 = 0;

      for (arp $$5 : $$1) {
         if ($$3.d.test($$5, $$2)) {
            $$4++;
         }
      }

      if ($$4 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> ww.a("commands.experience.set." + $$3.e + ".success.single", $$2, $$1.iterator().next().m_()), true);
         } else {
            $$0.a(() -> ww.a("commands.experience.set." + $$3.e + ".success.multiple", $$2, $$1.size()), true);
         }

         return $$1.size();
      }
   }

   static enum a {
      a("points", cqs::d, ($$0, $$1) -> {
         if ($$1 >= $$0.gs()) {
            return false;
         } else {
            $$0.a($$1);
            return true;
         }
      }, $$0 -> azk.d($$0.cg * (float)$$0.gs())),
      b("levels", arp::c, ($$0, $$1) -> {
         $$0.b($$1);
         return true;
      }, $$0 -> $$0.ce);

      public final BiConsumer<arp, Integer> c;
      public final BiPredicate<arp, Integer> d;
      public final String e;
      final ToIntFunction<arp> f;

      private a(final String $$0, final BiConsumer<arp, Integer> $$1, final BiPredicate<arp, Integer> $$2, final ToIntFunction<arp> $$3) {
         this.c = $$1;
         this.e = $$0;
         this.d = $$2;
         this.f = $$3;
      }
   }
}

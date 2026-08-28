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
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("commands.experience.set.points.invalid"));

   public static void a(CommandDispatcher<eu> $$0) {
      LiteralCommandNode<eu> $$1 = $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("experience").requires($$0x -> $$0x.c(2)))
                  .then(
                     ev.a("add")
                        .then(
                           ev.a("target", fh.d())
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ev.a("amount", IntegerArgumentType.integer())
                                          .executes(
                                             $$0x -> a((eu)$$0x.getSource(), fh.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), ani.a.a)
                                          ))
                                       .then(
                                          ev.a("points")
                                             .executes(
                                                $$0x -> a((eu)$$0x.getSource(), fh.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), ani.a.a)
                                             )
                                       ))
                                    .then(
                                       ev.a("levels")
                                          .executes(
                                             $$0x -> a((eu)$$0x.getSource(), fh.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), ani.a.b)
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  ev.a("set")
                     .then(
                        ev.a("target", fh.d())
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ev.a("amount", IntegerArgumentType.integer(0))
                                       .executes($$0x -> b((eu)$$0x.getSource(), fh.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), ani.a.a)))
                                    .then(
                                       ev.a("points")
                                          .executes(
                                             $$0x -> b((eu)$$0x.getSource(), fh.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), ani.a.a)
                                          )
                                    ))
                                 .then(
                                    ev.a("levels")
                                       .executes($$0x -> b((eu)$$0x.getSource(), fh.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), ani.a.b))
                                 )
                           )
                     )
               ))
            .then(
               ev.a("query")
                  .then(
                     ((RequiredArgumentBuilder)ev.a("target", fh.c())
                           .then(ev.a("points").executes($$0x -> a((eu)$$0x.getSource(), fh.e($$0x, "target"), ani.a.a))))
                        .then(ev.a("levels").executes($$0x -> a((eu)$$0x.getSource(), fh.e($$0x, "target"), ani.a.b)))
                  )
            )
      );
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("xp").requires($$0x -> $$0x.c(2))).redirect($$1));
   }

   private static int a(eu $$0, ark $$1, ani.a $$2) {
      int $$3 = $$2.f.applyAsInt($$1);
      $$0.a(() -> xe.a("commands.experience.query." + $$2.e, $$1.R_(), $$3), false);
      return $$3;
   }

   private static int a(eu $$0, Collection<? extends ark> $$1, int $$2, ani.a $$3) {
      for (ark $$4 : $$1) {
         $$3.c.accept($$4, $$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xe.a("commands.experience.add." + $$3.e + ".success.single", $$2, $$1.iterator().next().R_()), true);
      } else {
         $$0.a(() -> xe.a("commands.experience.add." + $$3.e + ".success.multiple", $$2, $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(eu $$0, Collection<? extends ark> $$1, int $$2, ani.a $$3) throws CommandSyntaxException {
      int $$4 = 0;

      for (ark $$5 : $$1) {
         if ($$3.d.test($$5, $$2)) {
            $$4++;
         }
      }

      if ($$4 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> xe.a("commands.experience.set." + $$3.e + ".success.single", $$2, $$1.iterator().next().R_()), true);
         } else {
            $$0.a(() -> xe.a("commands.experience.set." + $$3.e + ".success.multiple", $$2, $$1.size()), true);
         }

         return $$1.size();
      }
   }

   static enum a {
      a("points", cnx::d, ($$0, $$1) -> {
         if ($$1 >= $$0.gm()) {
            return false;
         } else {
            $$0.a($$1);
            return true;
         }
      }, $$0 -> azf.d($$0.co * (float)$$0.gm())),
      b("levels", ark::c, ($$0, $$1) -> {
         $$0.b($$1);
         return true;
      }, $$0 -> $$0.cm);

      public final BiConsumer<ark, Integer> c;
      public final BiPredicate<ark, Integer> d;
      public final String e;
      final ToIntFunction<ark> f;

      private a(final String $$0, final BiConsumer<ark, Integer> $$1, final BiPredicate<ark, Integer> $$2, final ToIntFunction<ark> $$3) {
         this.c = $$1;
         this.e = $$0;
         this.d = $$2;
         this.f = $$3;
      }
   }
}

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

public class and {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xl.c("commands.experience.set.points.invalid"));

   public static void a(CommandDispatcher<ep> $$0) {
      LiteralCommandNode<ep> $$1 = $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("experience").requires($$0x -> $$0x.c(2)))
                  .then(
                     eq.a("add")
                        .then(
                           eq.a("targets", fc.d())
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)eq.a("amount", IntegerArgumentType.integer())
                                          .executes(
                                             $$0x -> a((ep)$$0x.getSource(), fc.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), and.a.a)
                                          ))
                                       .then(
                                          eq.a("points")
                                             .executes(
                                                $$0x -> a((ep)$$0x.getSource(), fc.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), and.a.a)
                                             )
                                       ))
                                    .then(
                                       eq.a("levels")
                                          .executes(
                                             $$0x -> a((ep)$$0x.getSource(), fc.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), and.a.b)
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  eq.a("set")
                     .then(
                        eq.a("targets", fc.d())
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)eq.a("amount", IntegerArgumentType.integer(0))
                                       .executes(
                                          $$0x -> b((ep)$$0x.getSource(), fc.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), and.a.a)
                                       ))
                                    .then(
                                       eq.a("points")
                                          .executes(
                                             $$0x -> b((ep)$$0x.getSource(), fc.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), and.a.a)
                                          )
                                    ))
                                 .then(
                                    eq.a("levels")
                                       .executes(
                                          $$0x -> b((ep)$$0x.getSource(), fc.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), and.a.b)
                                       )
                                 )
                           )
                     )
               ))
            .then(
               eq.a("query")
                  .then(
                     ((RequiredArgumentBuilder)eq.a("targets", fc.c())
                           .then(eq.a("points").executes($$0x -> a((ep)$$0x.getSource(), fc.e($$0x, "targets"), and.a.a))))
                        .then(eq.a("levels").executes($$0x -> a((ep)$$0x.getSource(), fc.e($$0x, "targets"), and.a.b)))
                  )
            )
      );
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("xp").requires($$0x -> $$0x.c(2))).redirect($$1));
   }

   private static int a(ep $$0, arc $$1, and.a $$2) {
      int $$3 = $$2.f.applyAsInt($$1);
      $$0.a(() -> xl.a("commands.experience.query." + $$2.e, $$1.O_(), $$3), false);
      return $$3;
   }

   private static int a(ep $$0, Collection<? extends arc> $$1, int $$2, and.a $$3) {
      for (arc $$4 : $$1) {
         $$3.c.accept($$4, $$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xl.a("commands.experience.add." + $$3.e + ".success.single", $$2, $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> xl.a("commands.experience.add." + $$3.e + ".success.multiple", $$2, $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(ep $$0, Collection<? extends arc> $$1, int $$2, and.a $$3) throws CommandSyntaxException {
      int $$4 = 0;

      for (arc $$5 : $$1) {
         if ($$3.d.test($$5, $$2)) {
            $$4++;
         }
      }

      if ($$4 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> xl.a("commands.experience.set." + $$3.e + ".success.single", $$2, $$1.iterator().next().O_()), true);
         } else {
            $$0.a(() -> xl.a("commands.experience.set." + $$3.e + ".success.multiple", $$2, $$1.size()), true);
         }

         return $$1.size();
      }
   }

   static enum a {
      a("points", cms::d, ($$0, $$1) -> {
         if ($$1 >= $$0.gl()) {
            return false;
         } else {
            $$0.a($$1);
            return true;
         }
      }, $$0 -> ayu.d($$0.cq * (float)$$0.gl())),
      b("levels", arc::c, ($$0, $$1) -> {
         $$0.b($$1);
         return true;
      }, $$0 -> $$0.co);

      public final BiConsumer<arc, Integer> c;
      public final BiPredicate<arc, Integer> d;
      public final String e;
      final ToIntFunction<arc> f;

      private a(final String $$0, final BiConsumer<arc, Integer> $$1, final BiPredicate<arc, Integer> $$2, final ToIntFunction<arc> $$3) {
         this.c = $$1;
         this.e = $$0;
         this.d = $$2;
         this.f = $$3;
      }
   }
}

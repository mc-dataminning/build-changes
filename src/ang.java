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

public class ang {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xo.c("commands.experience.set.points.invalid"));

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
                                             $$0x -> a((ep)$$0x.getSource(), fc.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), ang.a.a)
                                          ))
                                       .then(
                                          eq.a("points")
                                             .executes(
                                                $$0x -> a((ep)$$0x.getSource(), fc.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), ang.a.a)
                                             )
                                       ))
                                    .then(
                                       eq.a("levels")
                                          .executes(
                                             $$0x -> a((ep)$$0x.getSource(), fc.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), ang.a.b)
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
                                          $$0x -> b((ep)$$0x.getSource(), fc.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), ang.a.a)
                                       ))
                                    .then(
                                       eq.a("points")
                                          .executes(
                                             $$0x -> b((ep)$$0x.getSource(), fc.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), ang.a.a)
                                          )
                                    ))
                                 .then(
                                    eq.a("levels")
                                       .executes(
                                          $$0x -> b((ep)$$0x.getSource(), fc.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), ang.a.b)
                                       )
                                 )
                           )
                     )
               ))
            .then(
               eq.a("query")
                  .then(
                     ((RequiredArgumentBuilder)eq.a("targets", fc.c())
                           .then(eq.a("points").executes($$0x -> a((ep)$$0x.getSource(), fc.e($$0x, "targets"), ang.a.a))))
                        .then(eq.a("levels").executes($$0x -> a((ep)$$0x.getSource(), fc.e($$0x, "targets"), ang.a.b)))
                  )
            )
      );
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("xp").requires($$0x -> $$0x.c(2))).redirect($$1));
   }

   private static int a(ep $$0, arf $$1, ang.a $$2) {
      int $$3 = $$2.f.applyAsInt($$1);
      $$0.a(() -> xo.a("commands.experience.query." + $$2.e, $$1.O_(), $$3), false);
      return $$3;
   }

   private static int a(ep $$0, Collection<? extends arf> $$1, int $$2, ang.a $$3) {
      for (arf $$4 : $$1) {
         $$3.c.accept($$4, $$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xo.a("commands.experience.add." + $$3.e + ".success.single", $$2, $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> xo.a("commands.experience.add." + $$3.e + ".success.multiple", $$2, $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(ep $$0, Collection<? extends arf> $$1, int $$2, ang.a $$3) throws CommandSyntaxException {
      int $$4 = 0;

      for (arf $$5 : $$1) {
         if ($$3.d.test($$5, $$2)) {
            $$4++;
         }
      }

      if ($$4 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> xo.a("commands.experience.set." + $$3.e + ".success.single", $$2, $$1.iterator().next().O_()), true);
         } else {
            $$0.a(() -> xo.a("commands.experience.set." + $$3.e + ".success.multiple", $$2, $$1.size()), true);
         }

         return $$1.size();
      }
   }

   static enum a {
      a("points", cmv::d, ($$0, $$1) -> {
         if ($$1 >= $$0.gl()) {
            return false;
         } else {
            $$0.a($$1);
            return true;
         }
      }, $$0 -> ayx.d($$0.cq * (float)$$0.gl())),
      b("levels", arf::c, ($$0, $$1) -> {
         $$0.b($$1);
         return true;
      }, $$0 -> $$0.co);

      public final BiConsumer<arf, Integer> c;
      public final BiPredicate<arf, Integer> d;
      public final String e;
      final ToIntFunction<arf> f;

      private a(final String $$0, final BiConsumer<arf, Integer> $$1, final BiPredicate<arf, Integer> $$2, final ToIntFunction<arf> $$3) {
         this.c = $$1;
         this.e = $$0;
         this.d = $$2;
         this.f = $$3;
      }
   }
}

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

public class amv {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("commands.experience.set.points.invalid"));

   public static void a(CommandDispatcher<eh> $$0) {
      LiteralCommandNode<eh> $$1 = $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("experience").requires($$0x -> $$0x.c(2)))
                  .then(
                     ei.a("add")
                        .then(
                           ei.a("targets", eu.d())
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ei.a("amount", IntegerArgumentType.integer())
                                          .executes(
                                             $$0x -> a((eh)$$0x.getSource(), eu.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), amv.a.a)
                                          ))
                                       .then(
                                          ei.a("points")
                                             .executes(
                                                $$0x -> a((eh)$$0x.getSource(), eu.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), amv.a.a)
                                             )
                                       ))
                                    .then(
                                       ei.a("levels")
                                          .executes(
                                             $$0x -> a((eh)$$0x.getSource(), eu.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), amv.a.b)
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  ei.a("set")
                     .then(
                        ei.a("targets", eu.d())
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ei.a("amount", IntegerArgumentType.integer(0))
                                       .executes(
                                          $$0x -> b((eh)$$0x.getSource(), eu.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), amv.a.a)
                                       ))
                                    .then(
                                       ei.a("points")
                                          .executes(
                                             $$0x -> b((eh)$$0x.getSource(), eu.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), amv.a.a)
                                          )
                                    ))
                                 .then(
                                    ei.a("levels")
                                       .executes(
                                          $$0x -> b((eh)$$0x.getSource(), eu.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), amv.a.b)
                                       )
                                 )
                           )
                     )
               ))
            .then(
               ei.a("query")
                  .then(
                     ((RequiredArgumentBuilder)ei.a("targets", eu.c())
                           .then(ei.a("points").executes($$0x -> a((eh)$$0x.getSource(), eu.e($$0x, "targets"), amv.a.a))))
                        .then(ei.a("levels").executes($$0x -> a((eh)$$0x.getSource(), eu.e($$0x, "targets"), amv.a.b)))
                  )
            )
      );
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("xp").requires($$0x -> $$0x.c(2))).redirect($$1));
   }

   private static int a(eh $$0, aqu $$1, amv.a $$2) {
      int $$3 = $$2.f.applyAsInt($$1);
      $$0.a(() -> xe.a("commands.experience.query." + $$2.e, $$1.P_(), $$3), false);
      return $$3;
   }

   private static int a(eh $$0, Collection<? extends aqu> $$1, int $$2, amv.a $$3) {
      for (aqu $$4 : $$1) {
         $$3.c.accept($$4, $$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xe.a("commands.experience.add." + $$3.e + ".success.single", $$2, $$1.iterator().next().P_()), true);
      } else {
         $$0.a(() -> xe.a("commands.experience.add." + $$3.e + ".success.multiple", $$2, $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(eh $$0, Collection<? extends aqu> $$1, int $$2, amv.a $$3) throws CommandSyntaxException {
      int $$4 = 0;

      for (aqu $$5 : $$1) {
         if ($$3.d.test($$5, $$2)) {
            $$4++;
         }
      }

      if ($$4 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> xe.a("commands.experience.set." + $$3.e + ".success.single", $$2, $$1.iterator().next().P_()), true);
         } else {
            $$0.a(() -> xe.a("commands.experience.set." + $$3.e + ".success.multiple", $$2, $$1.size()), true);
         }

         return $$1.size();
      }
   }

   static enum a {
      a("points", cly::d, ($$0, $$1) -> {
         if ($$1 >= $$0.gw()) {
            return false;
         } else {
            $$0.a($$1);
            return true;
         }
      }, $$0 -> aym.d($$0.cG * (float)$$0.gw())),
      b("levels", aqu::c, ($$0, $$1) -> {
         $$0.b($$1);
         return true;
      }, $$0 -> $$0.cE);

      public final BiConsumer<aqu, Integer> c;
      public final BiPredicate<aqu, Integer> d;
      public final String e;
      final ToIntFunction<aqu> f;

      private a(String $$0, BiConsumer<aqu, Integer> $$1, BiPredicate<aqu, Integer> $$2, ToIntFunction<aqu> $$3) {
         this.c = $$1;
         this.e = $$0;
         this.d = $$2;
         this.f = $$3;
      }
   }
}

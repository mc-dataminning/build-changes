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

public class agp {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(te.c("commands.experience.set.points.invalid"));

   public static void a(CommandDispatcher<ds> $$0) {
      LiteralCommandNode<ds> $$1 = $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("experience").requires($$0x -> $$0x.c(2)))
                  .then(
                     dt.a("add")
                        .then(
                           dt.a("targets", ed.d())
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("amount", IntegerArgumentType.integer())
                                          .executes(
                                             $$0x -> a((ds)$$0x.getSource(), ed.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), agp.a.a)
                                          ))
                                       .then(
                                          dt.a("points")
                                             .executes(
                                                $$0x -> a((ds)$$0x.getSource(), ed.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), agp.a.a)
                                             )
                                       ))
                                    .then(
                                       dt.a("levels")
                                          .executes(
                                             $$0x -> a((ds)$$0x.getSource(), ed.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), agp.a.b)
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  dt.a("set")
                     .then(
                        dt.a("targets", ed.d())
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("amount", IntegerArgumentType.integer(0))
                                       .executes(
                                          $$0x -> b((ds)$$0x.getSource(), ed.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), agp.a.a)
                                       ))
                                    .then(
                                       dt.a("points")
                                          .executes(
                                             $$0x -> b((ds)$$0x.getSource(), ed.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), agp.a.a)
                                          )
                                    ))
                                 .then(
                                    dt.a("levels")
                                       .executes(
                                          $$0x -> b((ds)$$0x.getSource(), ed.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), agp.a.b)
                                       )
                                 )
                           )
                     )
               ))
            .then(
               dt.a("query")
                  .then(
                     ((RequiredArgumentBuilder)dt.a("targets", ed.c())
                           .then(dt.a("points").executes($$0x -> a((ds)$$0x.getSource(), ed.e($$0x, "targets"), agp.a.a))))
                        .then(dt.a("levels").executes($$0x -> a((ds)$$0x.getSource(), ed.e($$0x, "targets"), agp.a.b)))
                  )
            )
      );
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("xp").requires($$0x -> $$0x.c(2))).redirect($$1));
   }

   private static int a(ds $$0, akj $$1, agp.a $$2) {
      int $$3 = $$2.f.applyAsInt($$1);
      $$0.a(() -> te.a("commands.experience.query." + $$2.e, $$1.H_(), $$3), false);
      return $$3;
   }

   private static int a(ds $$0, Collection<? extends akj> $$1, int $$2, agp.a $$3) {
      for (akj $$4 : $$1) {
         $$3.c.accept($$4, $$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> te.a("commands.experience.add." + $$3.e + ".success.single", $$2, $$1.iterator().next().H_()), true);
      } else {
         $$0.a(() -> te.a("commands.experience.add." + $$3.e + ".success.multiple", $$2, $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(ds $$0, Collection<? extends akj> $$1, int $$2, agp.a $$3) throws CommandSyntaxException {
      int $$4 = 0;

      for (akj $$5 : $$1) {
         if ($$3.d.test($$5, $$2)) {
            $$4++;
         }
      }

      if ($$4 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> te.a("commands.experience.set." + $$3.e + ".success.single", $$2, $$1.iterator().next().H_()), true);
         } else {
            $$0.a(() -> te.a("commands.experience.set." + $$3.e + ".success.multiple", $$2, $$1.size()), true);
         }

         return $$1.size();
      }
   }

   static enum a {
      a("points", cbl::d, ($$0, $$1) -> {
         if ($$1 >= $$0.fZ()) {
            return false;
         } else {
            $$0.a($$1);
            return true;
         }
      }, $$0 -> aro.d($$0.cf * (float)$$0.fZ())),
      b("levels", akj::c, ($$0, $$1) -> {
         $$0.b($$1);
         return true;
      }, $$0 -> $$0.cd);

      public final BiConsumer<akj, Integer> c;
      public final BiPredicate<akj, Integer> d;
      public final String e;
      final ToIntFunction<akj> f;

      private a(String $$0, BiConsumer<akj, Integer> $$1, BiPredicate<akj, Integer> $$2, ToIntFunction<akj> $$3) {
         this.c = $$1;
         this.e = $$0;
         this.d = $$2;
         this.f = $$3;
      }
   }
}

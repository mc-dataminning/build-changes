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

public class ajh {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vf.c("commands.experience.set.points.invalid"));

   public static void a(CommandDispatcher<ds> $$0) {
      LiteralCommandNode<ds> $$1 = $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("experience").requires($$0x -> $$0x.c(2)))
                  .then(
                     dt.a("add")
                        .then(
                           dt.a("targets", ef.d())
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("amount", IntegerArgumentType.integer())
                                          .executes(
                                             $$0x -> a((ds)$$0x.getSource(), ef.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), ajh.a.a)
                                          ))
                                       .then(
                                          dt.a("points")
                                             .executes(
                                                $$0x -> a((ds)$$0x.getSource(), ef.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), ajh.a.a)
                                             )
                                       ))
                                    .then(
                                       dt.a("levels")
                                          .executes(
                                             $$0x -> a((ds)$$0x.getSource(), ef.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), ajh.a.b)
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  dt.a("set")
                     .then(
                        dt.a("targets", ef.d())
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("amount", IntegerArgumentType.integer(0))
                                       .executes(
                                          $$0x -> b((ds)$$0x.getSource(), ef.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), ajh.a.a)
                                       ))
                                    .then(
                                       dt.a("points")
                                          .executes(
                                             $$0x -> b((ds)$$0x.getSource(), ef.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), ajh.a.a)
                                          )
                                    ))
                                 .then(
                                    dt.a("levels")
                                       .executes(
                                          $$0x -> b((ds)$$0x.getSource(), ef.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), ajh.a.b)
                                       )
                                 )
                           )
                     )
               ))
            .then(
               dt.a("query")
                  .then(
                     ((RequiredArgumentBuilder)dt.a("targets", ef.c())
                           .then(dt.a("points").executes($$0x -> a((ds)$$0x.getSource(), ef.e($$0x, "targets"), ajh.a.a))))
                        .then(dt.a("levels").executes($$0x -> a((ds)$$0x.getSource(), ef.e($$0x, "targets"), ajh.a.b)))
                  )
            )
      );
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("xp").requires($$0x -> $$0x.c(2))).redirect($$1));
   }

   private static int a(ds $$0, ane $$1, ajh.a $$2) {
      int $$3 = $$2.f.applyAsInt($$1);
      $$0.a(() -> vf.a("commands.experience.query." + $$2.e, $$1.Q_(), $$3), false);
      return $$3;
   }

   private static int a(ds $$0, Collection<? extends ane> $$1, int $$2, ajh.a $$3) {
      for (ane $$4 : $$1) {
         $$3.c.accept($$4, $$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> vf.a("commands.experience.add." + $$3.e + ".success.single", $$2, $$1.iterator().next().Q_()), true);
      } else {
         $$0.a(() -> vf.a("commands.experience.add." + $$3.e + ".success.multiple", $$2, $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(ds $$0, Collection<? extends ane> $$1, int $$2, ajh.a $$3) throws CommandSyntaxException {
      int $$4 = 0;

      for (ane $$5 : $$1) {
         if ($$3.d.test($$5, $$2)) {
            $$4++;
         }
      }

      if ($$4 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> vf.a("commands.experience.set." + $$3.e + ".success.single", $$2, $$1.iterator().next().Q_()), true);
         } else {
            $$0.a(() -> vf.a("commands.experience.set." + $$3.e + ".success.multiple", $$2, $$1.size()), true);
         }

         return $$1.size();
      }
   }

   static enum a {
      a("points", cfi::d, ($$0, $$1) -> {
         if ($$1 >= $$0.gb()) {
            return false;
         } else {
            $$0.a($$1);
            return true;
         }
      }, $$0 -> auo.d($$0.ch * (float)$$0.gb())),
      b("levels", ane::c, ($$0, $$1) -> {
         $$0.b($$1);
         return true;
      }, $$0 -> $$0.cf);

      public final BiConsumer<ane, Integer> c;
      public final BiPredicate<ane, Integer> d;
      public final String e;
      final ToIntFunction<ane> f;

      private a(String $$0, BiConsumer<ane, Integer> $$1, BiPredicate<ane, Integer> $$2, ToIntFunction<ane> $$3) {
         this.c = $$1;
         this.e = $$0;
         this.d = $$2;
         this.f = $$3;
      }
   }
}

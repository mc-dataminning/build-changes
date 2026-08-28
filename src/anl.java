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

public class anl {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xh.c("commands.experience.set.points.invalid"));

   public static void a(CommandDispatcher<ev> $$0) {
      LiteralCommandNode<ev> $$1 = $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("experience").requires($$0x -> $$0x.c(2)))
                  .then(
                     ew.a("add")
                        .then(
                           ew.a("target", fi.d())
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ew.a("amount", IntegerArgumentType.integer())
                                          .executes(
                                             $$0x -> a((ev)$$0x.getSource(), fi.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), anl.a.a)
                                          ))
                                       .then(
                                          ew.a("points")
                                             .executes(
                                                $$0x -> a((ev)$$0x.getSource(), fi.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), anl.a.a)
                                             )
                                       ))
                                    .then(
                                       ew.a("levels")
                                          .executes(
                                             $$0x -> a((ev)$$0x.getSource(), fi.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), anl.a.b)
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  ew.a("set")
                     .then(
                        ew.a("target", fi.d())
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ew.a("amount", IntegerArgumentType.integer(0))
                                       .executes($$0x -> b((ev)$$0x.getSource(), fi.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), anl.a.a)))
                                    .then(
                                       ew.a("points")
                                          .executes(
                                             $$0x -> b((ev)$$0x.getSource(), fi.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), anl.a.a)
                                          )
                                    ))
                                 .then(
                                    ew.a("levels")
                                       .executes($$0x -> b((ev)$$0x.getSource(), fi.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), anl.a.b))
                                 )
                           )
                     )
               ))
            .then(
               ew.a("query")
                  .then(
                     ((RequiredArgumentBuilder)ew.a("target", fi.c())
                           .then(ew.a("points").executes($$0x -> a((ev)$$0x.getSource(), fi.e($$0x, "target"), anl.a.a))))
                        .then(ew.a("levels").executes($$0x -> a((ev)$$0x.getSource(), fi.e($$0x, "target"), anl.a.b)))
                  )
            )
      );
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("xp").requires($$0x -> $$0x.c(2))).redirect($$1));
   }

   private static int a(ev $$0, arn $$1, anl.a $$2) {
      int $$3 = $$2.f.applyAsInt($$1);
      $$0.a(() -> xh.a("commands.experience.query." + $$2.e, $$1.S_(), $$3), false);
      return $$3;
   }

   private static int a(ev $$0, Collection<? extends arn> $$1, int $$2, anl.a $$3) {
      for (arn $$4 : $$1) {
         $$3.c.accept($$4, $$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xh.a("commands.experience.add." + $$3.e + ".success.single", $$2, $$1.iterator().next().S_()), true);
      } else {
         $$0.a(() -> xh.a("commands.experience.add." + $$3.e + ".success.multiple", $$2, $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(ev $$0, Collection<? extends arn> $$1, int $$2, anl.a $$3) throws CommandSyntaxException {
      int $$4 = 0;

      for (arn $$5 : $$1) {
         if ($$3.d.test($$5, $$2)) {
            $$4++;
         }
      }

      if ($$4 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> xh.a("commands.experience.set." + $$3.e + ".success.single", $$2, $$1.iterator().next().S_()), true);
         } else {
            $$0.a(() -> xh.a("commands.experience.set." + $$3.e + ".success.multiple", $$2, $$1.size()), true);
         }

         return $$1.size();
      }
   }

   static enum a {
      a("points", coh::d, ($$0, $$1) -> {
         if ($$1 >= $$0.gt()) {
            return false;
         } else {
            $$0.a($$1);
            return true;
         }
      }, $$0 -> azj.d($$0.cp * (float)$$0.gt())),
      b("levels", arn::c, ($$0, $$1) -> {
         $$0.b($$1);
         return true;
      }, $$0 -> $$0.cn);

      public final BiConsumer<arn, Integer> c;
      public final BiPredicate<arn, Integer> d;
      public final String e;
      final ToIntFunction<arn> f;

      private a(final String $$0, final BiConsumer<arn, Integer> $$1, final BiPredicate<arn, Integer> $$2, final ToIntFunction<arn> $$3) {
         this.c = $$1;
         this.e = $$0;
         this.d = $$2;
         this.f = $$3;
      }
   }
}

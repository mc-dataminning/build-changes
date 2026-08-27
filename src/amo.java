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

public class amo {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wx.c("commands.experience.set.points.invalid"));

   public static void a(CommandDispatcher<ee> $$0) {
      LiteralCommandNode<ee> $$1 = $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("experience").requires($$0x -> $$0x.c(2)))
                  .then(
                     ef.a("add")
                        .then(
                           ef.a("targets", er.d())
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ef.a("amount", IntegerArgumentType.integer())
                                          .executes(
                                             $$0x -> a((ee)$$0x.getSource(), er.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), amo.a.a)
                                          ))
                                       .then(
                                          ef.a("points")
                                             .executes(
                                                $$0x -> a((ee)$$0x.getSource(), er.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), amo.a.a)
                                             )
                                       ))
                                    .then(
                                       ef.a("levels")
                                          .executes(
                                             $$0x -> a((ee)$$0x.getSource(), er.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), amo.a.b)
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  ef.a("set")
                     .then(
                        ef.a("targets", er.d())
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ef.a("amount", IntegerArgumentType.integer(0))
                                       .executes(
                                          $$0x -> b((ee)$$0x.getSource(), er.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), amo.a.a)
                                       ))
                                    .then(
                                       ef.a("points")
                                          .executes(
                                             $$0x -> b((ee)$$0x.getSource(), er.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), amo.a.a)
                                          )
                                    ))
                                 .then(
                                    ef.a("levels")
                                       .executes(
                                          $$0x -> b((ee)$$0x.getSource(), er.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), amo.a.b)
                                       )
                                 )
                           )
                     )
               ))
            .then(
               ef.a("query")
                  .then(
                     ((RequiredArgumentBuilder)ef.a("targets", er.c())
                           .then(ef.a("points").executes($$0x -> a((ee)$$0x.getSource(), er.e($$0x, "targets"), amo.a.a))))
                        .then(ef.a("levels").executes($$0x -> a((ee)$$0x.getSource(), er.e($$0x, "targets"), amo.a.b)))
                  )
            )
      );
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("xp").requires($$0x -> $$0x.c(2))).redirect($$1));
   }

   private static int a(ee $$0, aqn $$1, amo.a $$2) {
      int $$3 = $$2.f.applyAsInt($$1);
      $$0.a(() -> wx.a("commands.experience.query." + $$2.e, $$1.O_(), $$3), false);
      return $$3;
   }

   private static int a(ee $$0, Collection<? extends aqn> $$1, int $$2, amo.a $$3) {
      for (aqn $$4 : $$1) {
         $$3.c.accept($$4, $$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wx.a("commands.experience.add." + $$3.e + ".success.single", $$2, $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> wx.a("commands.experience.add." + $$3.e + ".success.multiple", $$2, $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(ee $$0, Collection<? extends aqn> $$1, int $$2, amo.a $$3) throws CommandSyntaxException {
      int $$4 = 0;

      for (aqn $$5 : $$1) {
         if ($$3.d.test($$5, $$2)) {
            $$4++;
         }
      }

      if ($$4 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> wx.a("commands.experience.set." + $$3.e + ".success.single", $$2, $$1.iterator().next().O_()), true);
         } else {
            $$0.a(() -> wx.a("commands.experience.set." + $$3.e + ".success.multiple", $$2, $$1.size()), true);
         }

         return $$1.size();
      }
   }

   static enum a {
      a("points", clw::d, ($$0, $$1) -> {
         if ($$1 >= $$0.gl()) {
            return false;
         } else {
            $$0.a($$1);
            return true;
         }
      }, $$0 -> ayd.d($$0.cr * (float)$$0.gl())),
      b("levels", aqn::c, ($$0, $$1) -> {
         $$0.b($$1);
         return true;
      }, $$0 -> $$0.cp);

      public final BiConsumer<aqn, Integer> c;
      public final BiPredicate<aqn, Integer> d;
      public final String e;
      final ToIntFunction<aqn> f;

      private a(String $$0, BiConsumer<aqn, Integer> $$1, BiPredicate<aqn, Integer> $$2, ToIntFunction<aqn> $$3) {
         this.c = $$1;
         this.e = $$0;
         this.d = $$2;
         this.f = $$3;
      }
   }
}

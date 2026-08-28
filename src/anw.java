import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class anw {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wo.c("commands.playsound.failed"));

   public static void a(CommandDispatcher<ex> $$0) {
      RequiredArgumentBuilder<ex, aku> $$1 = (RequiredArgumentBuilder<ex, aku>)ey.a("sound", fy.a())
         .suggests(ix.b)
         .executes($$0x -> a((ex)$$0x.getSource(), a(((ex)$$0x.getSource()).i()), fy.a($$0x, "sound"), awa.a, ((ex)$$0x.getSource()).d(), 1.0F, 1.0F, 0.0F));

      for (awa $$2 : awa.values()) {
         $$1.then(a($$2));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("playsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static LiteralArgumentBuilder<ex> a(awa $$0) {
      return (LiteralArgumentBuilder<ex>)((LiteralArgumentBuilder)ey.a($$0.a())
            .executes($$1 -> a((ex)$$1.getSource(), a(((ex)$$1.getSource()).i()), fy.a($$1, "sound"), $$0, ((ex)$$1.getSource()).d(), 1.0F, 1.0F, 0.0F)))
         .then(
            ((RequiredArgumentBuilder)ey.a("targets", fk.d())
                  .executes($$1 -> a((ex)$$1.getSource(), fk.f($$1, "targets"), fy.a($$1, "sound"), $$0, ((ex)$$1.getSource()).d(), 1.0F, 1.0F, 0.0F)))
               .then(
                  ((RequiredArgumentBuilder)ey.a("pos", ha.a())
                        .executes($$1 -> a((ex)$$1.getSource(), fk.f($$1, "targets"), fy.a($$1, "sound"), $$0, ha.a($$1, "pos"), 1.0F, 1.0F, 0.0F)))
                     .then(
                        ((RequiredArgumentBuilder)ey.a("volume", FloatArgumentType.floatArg(0.0F))
                              .executes(
                                 $$1 -> a(
                                       (ex)$$1.getSource(),
                                       fk.f($$1, "targets"),
                                       fy.a($$1, "sound"),
                                       $$0,
                                       ha.a($$1, "pos"),
                                       (Float)$$1.getArgument("volume", Float.class),
                                       1.0F,
                                       0.0F
                                    )
                              ))
                           .then(
                              ((RequiredArgumentBuilder)ey.a("pitch", FloatArgumentType.floatArg(0.0F, 2.0F))
                                    .executes(
                                       $$1 -> a(
                                             (ex)$$1.getSource(),
                                             fk.f($$1, "targets"),
                                             fy.a($$1, "sound"),
                                             $$0,
                                             ha.a($$1, "pos"),
                                             (Float)$$1.getArgument("volume", Float.class),
                                             (Float)$$1.getArgument("pitch", Float.class),
                                             0.0F
                                          )
                                    ))
                                 .then(
                                    ey.a("minVolume", FloatArgumentType.floatArg(0.0F, 1.0F))
                                       .executes(
                                          $$1 -> a(
                                                (ex)$$1.getSource(),
                                                fk.f($$1, "targets"),
                                                fy.a($$1, "sound"),
                                                $$0,
                                                ha.a($$1, "pos"),
                                                (Float)$$1.getArgument("volume", Float.class),
                                                (Float)$$1.getArgument("pitch", Float.class),
                                                (Float)$$1.getArgument("minVolume", Float.class)
                                             )
                                       )
                                 )
                           )
                     )
               )
         );
   }

   private static Collection<ard> a(@Nullable ard $$0) {
      return $$0 != null ? List.of($$0) : List.of();
   }

   private static int a(ex $$0, Collection<ard> $$1, aku $$2, awa $$3, fay $$4, float $$5, float $$6, float $$7) throws CommandSyntaxException {
      jr<avy> $$8 = jr.a(avy.a($$2));
      double $$9 = (double)ayy.l($$8.a().a($$5));
      int $$10 = 0;
      long $$11 = $$0.e().H_().g();

      for (ard $$12 : $$1) {
         double $$13 = $$4.d - $$12.dB();
         double $$14 = $$4.e - $$12.dD();
         double $$15 = $$4.f - $$12.dH();
         double $$16 = $$13 * $$13 + $$14 * $$14 + $$15 * $$15;
         fay $$17 = $$4;
         float $$18 = $$5;
         if ($$16 > $$9) {
            if ($$7 <= 0.0F) {
               continue;
            }

            double $$19 = Math.sqrt($$16);
            $$17 = new fay($$12.dB() + $$13 / $$19 * 2.0, $$12.dD() + $$14 / $$19 * 2.0, $$12.dH() + $$15 / $$19 * 2.0);
            $$18 = $$7;
         }

         $$12.f.b(new afm($$8, $$3, $$17.a(), $$17.b(), $$17.c(), $$18, $$6, $$11));
         $$10++;
      }

      if ($$10 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> wo.a("commands.playsound.success.single", wo.a($$2), $$1.iterator().next().p_()), true);
         } else {
            $$0.a(() -> wo.a("commands.playsound.success.multiple", wo.a($$2), $$1.size()), true);
         }

         return $$10;
      }
   }
}

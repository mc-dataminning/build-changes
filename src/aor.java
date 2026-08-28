import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class aor {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xk.c("commands.playsound.failed"));

   public static void a(CommandDispatcher<ew> $$0) {
      RequiredArgumentBuilder<ew, alp> $$1 = (RequiredArgumentBuilder<ew, alp>)ex.a("sound", fx.a())
         .suggests(iw.b)
         .executes($$0x -> a((ew)$$0x.getSource(), a(((ew)$$0x.getSource()).i()), fx.a($$0x, "sound"), aww.a, ((ew)$$0x.getSource()).d(), 1.0F, 1.0F, 0.0F));

      for (aww $$2 : aww.values()) {
         $$1.then(a($$2));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("playsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static LiteralArgumentBuilder<ew> a(aww $$0) {
      return (LiteralArgumentBuilder<ew>)((LiteralArgumentBuilder)ex.a($$0.a())
            .executes($$1 -> a((ew)$$1.getSource(), a(((ew)$$1.getSource()).i()), fx.a($$1, "sound"), $$0, ((ew)$$1.getSource()).d(), 1.0F, 1.0F, 0.0F)))
         .then(
            ((RequiredArgumentBuilder)ex.a("targets", fj.d())
                  .executes($$1 -> a((ew)$$1.getSource(), fj.f($$1, "targets"), fx.a($$1, "sound"), $$0, ((ew)$$1.getSource()).d(), 1.0F, 1.0F, 0.0F)))
               .then(
                  ((RequiredArgumentBuilder)ex.a("pos", gz.a())
                        .executes($$1 -> a((ew)$$1.getSource(), fj.f($$1, "targets"), fx.a($$1, "sound"), $$0, gz.a($$1, "pos"), 1.0F, 1.0F, 0.0F)))
                     .then(
                        ((RequiredArgumentBuilder)ex.a("volume", FloatArgumentType.floatArg(0.0F))
                              .executes(
                                 $$1 -> a(
                                       (ew)$$1.getSource(),
                                       fj.f($$1, "targets"),
                                       fx.a($$1, "sound"),
                                       $$0,
                                       gz.a($$1, "pos"),
                                       (Float)$$1.getArgument("volume", Float.class),
                                       1.0F,
                                       0.0F
                                    )
                              ))
                           .then(
                              ((RequiredArgumentBuilder)ex.a("pitch", FloatArgumentType.floatArg(0.0F, 2.0F))
                                    .executes(
                                       $$1 -> a(
                                             (ew)$$1.getSource(),
                                             fj.f($$1, "targets"),
                                             fx.a($$1, "sound"),
                                             $$0,
                                             gz.a($$1, "pos"),
                                             (Float)$$1.getArgument("volume", Float.class),
                                             (Float)$$1.getArgument("pitch", Float.class),
                                             0.0F
                                          )
                                    ))
                                 .then(
                                    ex.a("minVolume", FloatArgumentType.floatArg(0.0F, 1.0F))
                                       .executes(
                                          $$1 -> a(
                                                (ew)$$1.getSource(),
                                                fj.f($$1, "targets"),
                                                fx.a($$1, "sound"),
                                                $$0,
                                                gz.a($$1, "pos"),
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

   private static Collection<ary> a(@Nullable ary $$0) {
      return $$0 != null ? List.of($$0) : List.of();
   }

   private static int a(ew $$0, Collection<ary> $$1, alp $$2, aww $$3, fbr $$4, float $$5, float $$6, float $$7) throws CommandSyntaxException {
      jq<awu> $$8 = jq.a(awu.a($$2));
      double $$9 = (double)azu.l($$8.a().a($$5));
      int $$10 = 0;
      long $$11 = $$0.e().H_().g();

      for (ary $$12 : $$1) {
         double $$13 = $$4.d - $$12.dB();
         double $$14 = $$4.e - $$12.dD();
         double $$15 = $$4.f - $$12.dH();
         double $$16 = $$13 * $$13 + $$14 * $$14 + $$15 * $$15;
         fbr $$17 = $$4;
         float $$18 = $$5;
         if ($$16 > $$9) {
            if ($$7 <= 0.0F) {
               continue;
            }

            double $$19 = Math.sqrt($$16);
            $$17 = new fbr($$12.dB() + $$13 / $$19 * 2.0, $$12.dD() + $$14 / $$19 * 2.0, $$12.dH() + $$15 / $$19 * 2.0);
            $$18 = $$7;
         }

         $$12.f.b(new agi($$8, $$3, $$17.a(), $$17.b(), $$17.c(), $$18, $$6, $$11));
         $$10++;
      }

      if ($$10 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> xk.a("commands.playsound.success.single", xk.a($$2), $$1.iterator().next().p_()), true);
         } else {
            $$0.a(() -> xk.a("commands.playsound.success.multiple", xk.a($$2), $$1.size()), true);
         }

         return $$10;
      }
   }
}

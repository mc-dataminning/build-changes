import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class amt {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wi.c("commands.playsound.failed"));

   public static void a(CommandDispatcher<dv> $$0) {
      RequiredArgumentBuilder<dv, ajv> $$1 = (RequiredArgumentBuilder<dv, ajv>)dw.a("sound", ew.a())
         .suggests(ht.c)
         .executes($$0x -> a((dv)$$0x.getSource(), a(((dv)$$0x.getSource()).i()), ew.e($$0x, "sound"), aup.a, ((dv)$$0x.getSource()).d(), 1.0F, 1.0F, 0.0F));

      for (aup $$2 : aup.values()) {
         $$1.then(a($$2));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("playsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static LiteralArgumentBuilder<dv> a(aup $$0) {
      return (LiteralArgumentBuilder<dv>)((LiteralArgumentBuilder)dw.a($$0.a())
            .executes($$1 -> a((dv)$$1.getSource(), a(((dv)$$1.getSource()).i()), ew.e($$1, "sound"), $$0, ((dv)$$1.getSource()).d(), 1.0F, 1.0F, 0.0F)))
         .then(
            ((RequiredArgumentBuilder)dw.a("targets", ei.d())
                  .executes($$1 -> a((dv)$$1.getSource(), ei.f($$1, "targets"), ew.e($$1, "sound"), $$0, ((dv)$$1.getSource()).d(), 1.0F, 1.0F, 0.0F)))
               .then(
                  ((RequiredArgumentBuilder)dw.a("pos", fx.a())
                        .executes($$1 -> a((dv)$$1.getSource(), ei.f($$1, "targets"), ew.e($$1, "sound"), $$0, fx.a($$1, "pos"), 1.0F, 1.0F, 0.0F)))
                     .then(
                        ((RequiredArgumentBuilder)dw.a("volume", FloatArgumentType.floatArg(0.0F))
                              .executes(
                                 $$1 -> a(
                                       (dv)$$1.getSource(),
                                       ei.f($$1, "targets"),
                                       ew.e($$1, "sound"),
                                       $$0,
                                       fx.a($$1, "pos"),
                                       (Float)$$1.getArgument("volume", Float.class),
                                       1.0F,
                                       0.0F
                                    )
                              ))
                           .then(
                              ((RequiredArgumentBuilder)dw.a("pitch", FloatArgumentType.floatArg(0.0F, 2.0F))
                                    .executes(
                                       $$1 -> a(
                                             (dv)$$1.getSource(),
                                             ei.f($$1, "targets"),
                                             ew.e($$1, "sound"),
                                             $$0,
                                             fx.a($$1, "pos"),
                                             (Float)$$1.getArgument("volume", Float.class),
                                             (Float)$$1.getArgument("pitch", Float.class),
                                             0.0F
                                          )
                                    ))
                                 .then(
                                    dw.a("minVolume", FloatArgumentType.floatArg(0.0F, 1.0F))
                                       .executes(
                                          $$1 -> a(
                                                (dv)$$1.getSource(),
                                                ei.f($$1, "targets"),
                                                ew.e($$1, "sound"),
                                                $$0,
                                                fx.a($$1, "pos"),
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

   private static Collection<apv> a(@Nullable apv $$0) {
      return $$0 != null ? List.of($$0) : List.of();
   }

   private static int a(dv $$0, Collection<apv> $$1, ajv $$2, aup $$3, esj $$4, float $$5, float $$6, float $$7) throws CommandSyntaxException {
      in<aun> $$8 = in.a(aun.a($$2));
      double $$9 = (double)axm.k($$8.a().a($$5));
      int $$10 = 0;
      long $$11 = $$0.e().E_().g();

      for (apv $$12 : $$1) {
         double $$13 = $$4.c - $$12.dr();
         double $$14 = $$4.d - $$12.dt();
         double $$15 = $$4.e - $$12.dx();
         double $$16 = $$13 * $$13 + $$14 * $$14 + $$15 * $$15;
         esj $$17 = $$4;
         float $$18 = $$5;
         if ($$16 > $$9) {
            if ($$7 <= 0.0F) {
               continue;
            }

            double $$19 = Math.sqrt($$16);
            $$17 = new esj($$12.dr() + $$13 / $$19 * 2.0, $$12.dt() + $$14 / $$19 * 2.0, $$12.dx() + $$15 / $$19 * 2.0);
            $$18 = $$7;
         }

         $$12.d.b(new aeu($$8, $$3, $$17.a(), $$17.b(), $$17.c(), $$18, $$6, $$11));
         $$10++;
      }

      if ($$10 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> wi.a("commands.playsound.success.single", wi.a($$2), $$1.iterator().next().O_()), true);
         } else {
            $$0.a(() -> wi.a("commands.playsound.success.multiple", wi.a($$2), $$1.size()), true);
         }

         return $$10;
      }
   }
}

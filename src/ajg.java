import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class ajg {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ur.c("commands.playsound.failed"));

   public static void a(CommandDispatcher<du> $$0) {
      RequiredArgumentBuilder<du, agi> $$1 = dv.a("sound", eu.a()).suggests(hj.c);

      for (aqs $$2 : aqs.values()) {
         $$1.then(a($$2));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("playsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static LiteralArgumentBuilder<du> a(aqs $$0) {
      return (LiteralArgumentBuilder<du>)dv.a($$0.a())
         .then(
            ((RequiredArgumentBuilder)dv.a("targets", eg.d())
                  .executes($$1 -> a((du)$$1.getSource(), eg.f($$1, "targets"), eu.e($$1, "sound"), $$0, ((du)$$1.getSource()).e(), 1.0F, 1.0F, 0.0F)))
               .then(
                  ((RequiredArgumentBuilder)dv.a("pos", ft.a())
                        .executes($$1 -> a((du)$$1.getSource(), eg.f($$1, "targets"), eu.e($$1, "sound"), $$0, ft.a($$1, "pos"), 1.0F, 1.0F, 0.0F)))
                     .then(
                        ((RequiredArgumentBuilder)dv.a("volume", FloatArgumentType.floatArg(0.0F))
                              .executes(
                                 $$1 -> a(
                                       (du)$$1.getSource(),
                                       eg.f($$1, "targets"),
                                       eu.e($$1, "sound"),
                                       $$0,
                                       ft.a($$1, "pos"),
                                       (Float)$$1.getArgument("volume", Float.class),
                                       1.0F,
                                       0.0F
                                    )
                              ))
                           .then(
                              ((RequiredArgumentBuilder)dv.a("pitch", FloatArgumentType.floatArg(0.0F, 2.0F))
                                    .executes(
                                       $$1 -> a(
                                             (du)$$1.getSource(),
                                             eg.f($$1, "targets"),
                                             eu.e($$1, "sound"),
                                             $$0,
                                             ft.a($$1, "pos"),
                                             (Float)$$1.getArgument("volume", Float.class),
                                             (Float)$$1.getArgument("pitch", Float.class),
                                             0.0F
                                          )
                                    ))
                                 .then(
                                    dv.a("minVolume", FloatArgumentType.floatArg(0.0F, 1.0F))
                                       .executes(
                                          $$1 -> a(
                                                (du)$$1.getSource(),
                                                eg.f($$1, "targets"),
                                                eu.e($$1, "sound"),
                                                $$0,
                                                ft.a($$1, "pos"),
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

   private static int a(du $$0, Collection<amf> $$1, agi $$2, aqs $$3, eju $$4, float $$5, float $$6, float $$7) throws CommandSyntaxException {
      ib<aqq> $$8 = ib.a(aqq.a($$2));
      double $$9 = (double)atm.k($$8.a().a($$5));
      int $$10 = 0;
      long $$11 = $$0.f().E_().g();

      for (amf $$12 : $$1) {
         double $$13 = $$4.c - $$12.ds();
         double $$14 = $$4.d - $$12.du();
         double $$15 = $$4.e - $$12.dy();
         double $$16 = $$13 * $$13 + $$14 * $$14 + $$15 * $$15;
         eju $$17 = $$4;
         float $$18 = $$5;
         if ($$16 > $$9) {
            if ($$7 <= 0.0F) {
               continue;
            }

            double $$19 = Math.sqrt($$16);
            $$17 = new eju($$12.ds() + $$13 / $$19 * 2.0, $$12.du() + $$14 / $$19 * 2.0, $$12.dy() + $$15 / $$19 * 2.0);
            $$18 = $$7;
         }

         $$12.c.b(new abu($$8, $$3, $$17.a(), $$17.b(), $$17.c(), $$18, $$6, $$11));
         $$10++;
      }

      if ($$10 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> ur.a("commands.playsound.success.single", ur.a($$2), $$1.iterator().next().P_()), true);
         } else {
            $$0.a(() -> ur.a("commands.playsound.success.multiple", ur.a($$2), $$1.size()), true);
         }

         return $$10;
      }
   }
}

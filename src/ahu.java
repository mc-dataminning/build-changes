import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class ahu {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tm.c("commands.playsound.failed"));

   public static void a(CommandDispatcher<dt> $$0) {
      RequiredArgumentBuilder<dt, aex> $$1 = du.a("sound", es.a()).suggests(gm.c);

      for (apf $$2 : apf.values()) {
         $$1.then(a($$2));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("playsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static LiteralArgumentBuilder<dt> a(apf $$0) {
      return (LiteralArgumentBuilder<dt>)du.a($$0.a())
         .then(
            ((RequiredArgumentBuilder)du.a("targets", ee.d())
                  .executes($$1 -> a((dt)$$1.getSource(), ee.f($$1, "targets"), es.e($$1, "sound"), $$0, ((dt)$$1.getSource()).d(), 1.0F, 1.0F, 0.0F)))
               .then(
                  ((RequiredArgumentBuilder)du.a("pos", fr.a())
                        .executes($$1 -> a((dt)$$1.getSource(), ee.f($$1, "targets"), es.e($$1, "sound"), $$0, fr.a($$1, "pos"), 1.0F, 1.0F, 0.0F)))
                     .then(
                        ((RequiredArgumentBuilder)du.a("volume", FloatArgumentType.floatArg(0.0F))
                              .executes(
                                 $$1 -> a(
                                       (dt)$$1.getSource(),
                                       ee.f($$1, "targets"),
                                       es.e($$1, "sound"),
                                       $$0,
                                       fr.a($$1, "pos"),
                                       (Float)$$1.getArgument("volume", Float.class),
                                       1.0F,
                                       0.0F
                                    )
                              ))
                           .then(
                              ((RequiredArgumentBuilder)du.a("pitch", FloatArgumentType.floatArg(0.0F, 2.0F))
                                    .executes(
                                       $$1 -> a(
                                             (dt)$$1.getSource(),
                                             ee.f($$1, "targets"),
                                             es.e($$1, "sound"),
                                             $$0,
                                             fr.a($$1, "pos"),
                                             (Float)$$1.getArgument("volume", Float.class),
                                             (Float)$$1.getArgument("pitch", Float.class),
                                             0.0F
                                          )
                                    ))
                                 .then(
                                    du.a("minVolume", FloatArgumentType.floatArg(0.0F, 1.0F))
                                       .executes(
                                          $$1 -> a(
                                                (dt)$$1.getSource(),
                                                ee.f($$1, "targets"),
                                                es.e($$1, "sound"),
                                                $$0,
                                                fr.a($$1, "pos"),
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

   private static int a(dt $$0, Collection<aks> $$1, aex $$2, apf $$3, ehn $$4, float $$5, float $$6, float $$7) throws CommandSyntaxException {
      hg<apd> $$8 = hg.a(apd.a($$2));
      double $$9 = (double)arx.k($$8.a().a($$5));
      int $$10 = 0;
      long $$11 = $$0.e().D_().g();

      for (aks $$12 : $$1) {
         double $$13 = $$4.c - $$12.dq();
         double $$14 = $$4.d - $$12.ds();
         double $$15 = $$4.e - $$12.dw();
         double $$16 = $$13 * $$13 + $$14 * $$14 + $$15 * $$15;
         ehn $$17 = $$4;
         float $$18 = $$5;
         if ($$16 > $$9) {
            if ($$7 <= 0.0F) {
               continue;
            }

            double $$19 = Math.sqrt($$16);
            $$17 = new ehn($$12.dq() + $$13 / $$19 * 2.0, $$12.ds() + $$14 / $$19 * 2.0, $$12.dw() + $$15 / $$19 * 2.0);
            $$18 = $$7;
         }

         $$12.c.b(new aao($$8, $$3, $$17.a(), $$17.b(), $$17.c(), $$18, $$6, $$11));
         $$10++;
      }

      if ($$10 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> tm.a("commands.playsound.success.single", $$2, $$1.iterator().next().N_()), true);
         } else {
            $$0.a(() -> tm.a("commands.playsound.success.multiple", $$2, $$1.size()), true);
         }

         return $$10;
      }
   }
}

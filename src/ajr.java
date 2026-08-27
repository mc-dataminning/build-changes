import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class ajr {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vb.c("commands.playsound.failed"));

   public static void a(CommandDispatcher<ds> $$0) {
      RequiredArgumentBuilder<ds, agt> $$1 = dt.a("sound", es.a()).suggests(hl.c);

      for (ard $$2 : ard.values()) {
         $$1.then(a($$2));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("playsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static LiteralArgumentBuilder<ds> a(ard $$0) {
      return (LiteralArgumentBuilder<ds>)dt.a($$0.a())
         .then(
            ((RequiredArgumentBuilder)dt.a("targets", ee.d())
                  .executes($$1 -> a((ds)$$1.getSource(), ee.f($$1, "targets"), es.e($$1, "sound"), $$0, ((ds)$$1.getSource()).d(), 1.0F, 1.0F, 0.0F)))
               .then(
                  ((RequiredArgumentBuilder)dt.a("pos", fr.a())
                        .executes($$1 -> a((ds)$$1.getSource(), ee.f($$1, "targets"), es.e($$1, "sound"), $$0, fr.a($$1, "pos"), 1.0F, 1.0F, 0.0F)))
                     .then(
                        ((RequiredArgumentBuilder)dt.a("volume", FloatArgumentType.floatArg(0.0F))
                              .executes(
                                 $$1 -> a(
                                       (ds)$$1.getSource(),
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
                              ((RequiredArgumentBuilder)dt.a("pitch", FloatArgumentType.floatArg(0.0F, 2.0F))
                                    .executes(
                                       $$1 -> a(
                                             (ds)$$1.getSource(),
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
                                    dt.a("minVolume", FloatArgumentType.floatArg(0.0F, 1.0F))
                                       .executes(
                                          $$1 -> a(
                                                (ds)$$1.getSource(),
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

   private static int a(ds $$0, Collection<amq> $$1, agt $$2, ard $$3, elb $$4, float $$5, float $$6, float $$7) throws CommandSyntaxException {
      ie<arb> $$8 = ie.a(arb.a($$2));
      double $$9 = (double)aty.k($$8.a().a($$5));
      int $$10 = 0;
      long $$11 = $$0.e().F_().g();

      for (amq $$12 : $$1) {
         double $$13 = $$4.c - $$12.dr();
         double $$14 = $$4.d - $$12.dt();
         double $$15 = $$4.e - $$12.dx();
         double $$16 = $$13 * $$13 + $$14 * $$14 + $$15 * $$15;
         elb $$17 = $$4;
         float $$18 = $$5;
         if ($$16 > $$9) {
            if ($$7 <= 0.0F) {
               continue;
            }

            double $$19 = Math.sqrt($$16);
            $$17 = new elb($$12.dr() + $$13 / $$19 * 2.0, $$12.dt() + $$14 / $$19 * 2.0, $$12.dx() + $$15 / $$19 * 2.0);
            $$18 = $$7;
         }

         $$12.c.b(new acf($$8, $$3, $$17.a(), $$17.b(), $$17.c(), $$18, $$6, $$11));
         $$10++;
      }

      if ($$10 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> vb.a("commands.playsound.success.single", vb.a($$2), $$1.iterator().next().Q_()), true);
         } else {
            $$0.a(() -> vb.a("commands.playsound.success.multiple", vb.a($$2), $$1.size()), true);
         }

         return $$10;
      }
   }
}

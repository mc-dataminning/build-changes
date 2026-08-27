import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class aho {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tf.c("commands.playsound.failed"));

   public static void a(CommandDispatcher<dr> $$0) {
      RequiredArgumentBuilder<dr, aer> $$1 = ds.a("sound", eq.a()).suggests(gk.c);

      for (aox $$2 : aox.values()) {
         $$1.then(a($$2));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("playsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static LiteralArgumentBuilder<dr> a(aox $$0) {
      return (LiteralArgumentBuilder<dr>)ds.a($$0.a())
         .then(
            ((RequiredArgumentBuilder)ds.a("targets", ec.d())
                  .executes($$1 -> a((dr)$$1.getSource(), ec.f($$1, "targets"), eq.e($$1, "sound"), $$0, ((dr)$$1.getSource()).d(), 1.0F, 1.0F, 0.0F)))
               .then(
                  ((RequiredArgumentBuilder)ds.a("pos", fp.a())
                        .executes($$1 -> a((dr)$$1.getSource(), ec.f($$1, "targets"), eq.e($$1, "sound"), $$0, fp.a($$1, "pos"), 1.0F, 1.0F, 0.0F)))
                     .then(
                        ((RequiredArgumentBuilder)ds.a("volume", FloatArgumentType.floatArg(0.0F))
                              .executes(
                                 $$1 -> a(
                                       (dr)$$1.getSource(),
                                       ec.f($$1, "targets"),
                                       eq.e($$1, "sound"),
                                       $$0,
                                       fp.a($$1, "pos"),
                                       (Float)$$1.getArgument("volume", Float.class),
                                       1.0F,
                                       0.0F
                                    )
                              ))
                           .then(
                              ((RequiredArgumentBuilder)ds.a("pitch", FloatArgumentType.floatArg(0.0F, 2.0F))
                                    .executes(
                                       $$1 -> a(
                                             (dr)$$1.getSource(),
                                             ec.f($$1, "targets"),
                                             eq.e($$1, "sound"),
                                             $$0,
                                             fp.a($$1, "pos"),
                                             (Float)$$1.getArgument("volume", Float.class),
                                             (Float)$$1.getArgument("pitch", Float.class),
                                             0.0F
                                          )
                                    ))
                                 .then(
                                    ds.a("minVolume", FloatArgumentType.floatArg(0.0F, 1.0F))
                                       .executes(
                                          $$1 -> a(
                                                (dr)$$1.getSource(),
                                                ec.f($$1, "targets"),
                                                eq.e($$1, "sound"),
                                                $$0,
                                                fp.a($$1, "pos"),
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

   private static int a(dr $$0, Collection<akl> $$1, aer $$2, aox $$3, ehd $$4, float $$5, float $$6, float $$7) throws CommandSyntaxException {
      he<aov> $$8 = he.a(aov.a($$2));
      double $$9 = (double)arp.k($$8.a().a($$5));
      int $$10 = 0;
      long $$11 = $$0.e().y_().g();

      for (akl $$12 : $$1) {
         double $$13 = $$4.c - $$12.dp();
         double $$14 = $$4.d - $$12.dr();
         double $$15 = $$4.e - $$12.dv();
         double $$16 = $$13 * $$13 + $$14 * $$14 + $$15 * $$15;
         ehd $$17 = $$4;
         float $$18 = $$5;
         if ($$16 > $$9) {
            if ($$7 <= 0.0F) {
               continue;
            }

            double $$19 = Math.sqrt($$16);
            $$17 = new ehd($$12.dp() + $$13 / $$19 * 2.0, $$12.dr() + $$14 / $$19 * 2.0, $$12.dv() + $$15 / $$19 * 2.0);
            $$18 = $$7;
         }

         $$12.c.b(new aah($$8, $$3, $$17.a(), $$17.b(), $$17.c(), $$18, $$6, $$11));
         $$10++;
      }

      if ($$10 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> tf.a("commands.playsound.success.single", $$2, $$1.iterator().next().H_()), true);
         } else {
            $$0.a(() -> tf.a("commands.playsound.success.multiple", $$2, $$1.size()), true);
         }

         return $$10;
      }
   }
}

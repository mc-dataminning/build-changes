import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class aoj {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wy.c("commands.playsound.failed"));

   public static void a(CommandDispatcher<ej> $$0) {
      RequiredArgumentBuilder<ej, alg> $$1 = (RequiredArgumentBuilder<ej, alg>)ek.a("sound", fk.a())
         .suggests(ik.b)
         .executes($$0x -> a((ej)$$0x.getSource(), a(((ej)$$0x.getSource()).i()), fk.a($$0x, "sound"), awo.a, ((ej)$$0x.getSource()).d(), 1.0F, 1.0F, 0.0F));

      for (awo $$2 : awo.values()) {
         $$1.then(a($$2));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("playsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static LiteralArgumentBuilder<ej> a(awo $$0) {
      return (LiteralArgumentBuilder<ej>)((LiteralArgumentBuilder)ek.a($$0.a())
            .executes($$1 -> a((ej)$$1.getSource(), a(((ej)$$1.getSource()).i()), fk.a($$1, "sound"), $$0, ((ej)$$1.getSource()).d(), 1.0F, 1.0F, 0.0F)))
         .then(
            ((RequiredArgumentBuilder)ek.a("targets", ew.d())
                  .executes($$1 -> a((ej)$$1.getSource(), ew.f($$1, "targets"), fk.a($$1, "sound"), $$0, ((ej)$$1.getSource()).d(), 1.0F, 1.0F, 0.0F)))
               .then(
                  ((RequiredArgumentBuilder)ek.a("pos", gn.a())
                        .executes($$1 -> a((ej)$$1.getSource(), ew.f($$1, "targets"), fk.a($$1, "sound"), $$0, gn.a($$1, "pos"), 1.0F, 1.0F, 0.0F)))
                     .then(
                        ((RequiredArgumentBuilder)ek.a("volume", FloatArgumentType.floatArg(0.0F))
                              .executes(
                                 $$1 -> a(
                                       (ej)$$1.getSource(),
                                       ew.f($$1, "targets"),
                                       fk.a($$1, "sound"),
                                       $$0,
                                       gn.a($$1, "pos"),
                                       (Float)$$1.getArgument("volume", Float.class),
                                       1.0F,
                                       0.0F
                                    )
                              ))
                           .then(
                              ((RequiredArgumentBuilder)ek.a("pitch", FloatArgumentType.floatArg(0.0F, 2.0F))
                                    .executes(
                                       $$1 -> a(
                                             (ej)$$1.getSource(),
                                             ew.f($$1, "targets"),
                                             fk.a($$1, "sound"),
                                             $$0,
                                             gn.a($$1, "pos"),
                                             (Float)$$1.getArgument("volume", Float.class),
                                             (Float)$$1.getArgument("pitch", Float.class),
                                             0.0F
                                          )
                                    ))
                                 .then(
                                    ek.a("minVolume", FloatArgumentType.floatArg(0.0F, 1.0F))
                                       .executes(
                                          $$1 -> a(
                                                (ej)$$1.getSource(),
                                                ew.f($$1, "targets"),
                                                fk.a($$1, "sound"),
                                                $$0,
                                                gn.a($$1, "pos"),
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

   private static Collection<arr> a(@Nullable arr $$0) {
      return $$0 != null ? List.of($$0) : List.of();
   }

   private static int a(ej $$0, Collection<arr> $$1, alg $$2, awo $$3, ffc $$4, float $$5, float $$6, float $$7) throws CommandSyntaxException {
      jf<awm> $$8 = jf.a(awm.a($$2));
      double $$9 = (double)azm.l($$8.a().a($$5));
      int $$10 = 0;
      long $$11 = $$0.e().C_().g();

      for (arr $$12 : $$1) {
         double $$13 = $$4.d - $$12.dz();
         double $$14 = $$4.e - $$12.dB();
         double $$15 = $$4.f - $$12.dF();
         double $$16 = $$13 * $$13 + $$14 * $$14 + $$15 * $$15;
         ffc $$17 = $$4;
         float $$18 = $$5;
         if ($$16 > $$9) {
            if ($$7 <= 0.0F) {
               continue;
            }

            double $$19 = Math.sqrt($$16);
            $$17 = new ffc($$12.dz() + $$13 / $$19 * 2.0, $$12.dB() + $$14 / $$19 * 2.0, $$12.dF() + $$15 / $$19 * 2.0);
            $$18 = $$7;
         }

         $$12.f.b(new afv($$8, $$3, $$17.a(), $$17.b(), $$17.c(), $$18, $$6, $$11));
         $$10++;
      }

      if ($$10 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> wy.a("commands.playsound.success.single", wy.a($$2), $$1.iterator().next().m_()), true);
         } else {
            $$0.a(() -> wy.a("commands.playsound.success.multiple", wy.a($$2), $$1.size()), true);
         }

         return $$10;
      }
   }
}

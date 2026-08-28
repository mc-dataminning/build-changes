import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class aol {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xa.c("commands.playsound.failed"));

   public static void a(CommandDispatcher<ej> $$0) {
      RequiredArgumentBuilder<ej, ali> $$1 = (RequiredArgumentBuilder<ej, ali>)ek.a("sound", fk.a())
         .suggests(ik.b)
         .executes($$0x -> a((ej)$$0x.getSource(), a(((ej)$$0x.getSource()).i()), fk.a($$0x, "sound"), awq.a, ((ej)$$0x.getSource()).d(), 1.0F, 1.0F, 0.0F));

      for (awq $$2 : awq.values()) {
         $$1.then(a($$2));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("playsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static LiteralArgumentBuilder<ej> a(awq $$0) {
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

   private static Collection<art> a(@Nullable art $$0) {
      return $$0 != null ? List.of($$0) : List.of();
   }

   private static int a(ej $$0, Collection<art> $$1, ali $$2, awq $$3, ffq $$4, float $$5, float $$6, float $$7) throws CommandSyntaxException {
      jf<awo> $$8 = jf.a(awo.a($$2));
      double $$9 = (double)azo.l($$8.a().a($$5));
      int $$10 = 0;
      long $$11 = $$0.e().G_().g();

      for (art $$12 : $$1) {
         double $$13 = $$4.d - $$12.dA();
         double $$14 = $$4.e - $$12.dC();
         double $$15 = $$4.f - $$12.dG();
         double $$16 = $$13 * $$13 + $$14 * $$14 + $$15 * $$15;
         ffq $$17 = $$4;
         float $$18 = $$5;
         if ($$16 > $$9) {
            if ($$7 <= 0.0F) {
               continue;
            }

            double $$19 = Math.sqrt($$16);
            $$17 = new ffq($$12.dA() + $$13 / $$19 * 2.0, $$12.dC() + $$14 / $$19 * 2.0, $$12.dG() + $$15 / $$19 * 2.0);
            $$18 = $$7;
         }

         $$12.f.b(new afx($$8, $$3, $$17.a(), $$17.b(), $$17.c(), $$18, $$6, $$11));
         $$10++;
      }

      if ($$10 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> xa.a("commands.playsound.success.single", xa.a($$2), $$1.iterator().next().m_()), true);
         } else {
            $$0.a(() -> xa.a("commands.playsound.success.multiple", xa.a($$2), $$1.size()), true);
         }

         return $$10;
      }
   }
}

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class aoh {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ww.c("commands.playsound.failed"));

   public static void a(CommandDispatcher<ei> $$0) {
      RequiredArgumentBuilder<ei, ale> $$1 = (RequiredArgumentBuilder<ei, ale>)ej.a("sound", fj.a())
         .suggests(ij.b)
         .executes($$0x -> a((ei)$$0x.getSource(), a(((ei)$$0x.getSource()).i()), fj.a($$0x, "sound"), awm.a, ((ei)$$0x.getSource()).d(), 1.0F, 1.0F, 0.0F));

      for (awm $$2 : awm.values()) {
         $$1.then(a($$2));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("playsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static LiteralArgumentBuilder<ei> a(awm $$0) {
      return (LiteralArgumentBuilder<ei>)((LiteralArgumentBuilder)ej.a($$0.a())
            .executes($$1 -> a((ei)$$1.getSource(), a(((ei)$$1.getSource()).i()), fj.a($$1, "sound"), $$0, ((ei)$$1.getSource()).d(), 1.0F, 1.0F, 0.0F)))
         .then(
            ((RequiredArgumentBuilder)ej.a("targets", ev.d())
                  .executes($$1 -> a((ei)$$1.getSource(), ev.f($$1, "targets"), fj.a($$1, "sound"), $$0, ((ei)$$1.getSource()).d(), 1.0F, 1.0F, 0.0F)))
               .then(
                  ((RequiredArgumentBuilder)ej.a("pos", gm.a())
                        .executes($$1 -> a((ei)$$1.getSource(), ev.f($$1, "targets"), fj.a($$1, "sound"), $$0, gm.a($$1, "pos"), 1.0F, 1.0F, 0.0F)))
                     .then(
                        ((RequiredArgumentBuilder)ej.a("volume", FloatArgumentType.floatArg(0.0F))
                              .executes(
                                 $$1 -> a(
                                       (ei)$$1.getSource(),
                                       ev.f($$1, "targets"),
                                       fj.a($$1, "sound"),
                                       $$0,
                                       gm.a($$1, "pos"),
                                       (Float)$$1.getArgument("volume", Float.class),
                                       1.0F,
                                       0.0F
                                    )
                              ))
                           .then(
                              ((RequiredArgumentBuilder)ej.a("pitch", FloatArgumentType.floatArg(0.0F, 2.0F))
                                    .executes(
                                       $$1 -> a(
                                             (ei)$$1.getSource(),
                                             ev.f($$1, "targets"),
                                             fj.a($$1, "sound"),
                                             $$0,
                                             gm.a($$1, "pos"),
                                             (Float)$$1.getArgument("volume", Float.class),
                                             (Float)$$1.getArgument("pitch", Float.class),
                                             0.0F
                                          )
                                    ))
                                 .then(
                                    ej.a("minVolume", FloatArgumentType.floatArg(0.0F, 1.0F))
                                       .executes(
                                          $$1 -> a(
                                                (ei)$$1.getSource(),
                                                ev.f($$1, "targets"),
                                                fj.a($$1, "sound"),
                                                $$0,
                                                gm.a($$1, "pos"),
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

   private static Collection<arp> a(@Nullable arp $$0) {
      return $$0 != null ? List.of($$0) : List.of();
   }

   private static int a(ei $$0, Collection<arp> $$1, ale $$2, awm $$3, fdw $$4, float $$5, float $$6, float $$7) throws CommandSyntaxException {
      je<awk> $$8 = je.a(awk.a($$2));
      double $$9 = (double)azk.l($$8.a().a($$5));
      int $$10 = 0;
      long $$11 = $$0.e().C_().g();

      for (arp $$12 : $$1) {
         double $$13 = $$4.d - $$12.dA();
         double $$14 = $$4.e - $$12.dC();
         double $$15 = $$4.f - $$12.dG();
         double $$16 = $$13 * $$13 + $$14 * $$14 + $$15 * $$15;
         fdw $$17 = $$4;
         float $$18 = $$5;
         if ($$16 > $$9) {
            if ($$7 <= 0.0F) {
               continue;
            }

            double $$19 = Math.sqrt($$16);
            $$17 = new fdw($$12.dA() + $$13 / $$19 * 2.0, $$12.dC() + $$14 / $$19 * 2.0, $$12.dG() + $$15 / $$19 * 2.0);
            $$18 = $$7;
         }

         $$12.f.b(new aft($$8, $$3, $$17.a(), $$17.b(), $$17.c(), $$18, $$6, $$11));
         $$10++;
      }

      if ($$10 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> ww.a("commands.playsound.success.single", ww.a($$2), $$1.iterator().next().m_()), true);
         } else {
            $$0.a(() -> ww.a("commands.playsound.success.multiple", ww.a($$2), $$1.size()), true);
         }

         return $$10;
      }
   }
}

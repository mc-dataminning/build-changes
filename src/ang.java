import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class ang {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("commands.playsound.failed"));

   public static void a(CommandDispatcher<ed> $$0) {
      RequiredArgumentBuilder<ed, akh> $$1 = (RequiredArgumentBuilder<ed, akh>)ee.a("sound", fe.a())
         .suggests(ib.c)
         .executes($$0x -> a((ed)$$0x.getSource(), a(((ed)$$0x.getSource()).i()), fe.c($$0x, "sound"), avd.a, ((ed)$$0x.getSource()).d(), 1.0F, 1.0F, 0.0F));

      for (avd $$2 : avd.values()) {
         $$1.then(a($$2));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("playsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static LiteralArgumentBuilder<ed> a(avd $$0) {
      return (LiteralArgumentBuilder<ed>)((LiteralArgumentBuilder)ee.a($$0.a())
            .executes($$1 -> a((ed)$$1.getSource(), a(((ed)$$1.getSource()).i()), fe.c($$1, "sound"), $$0, ((ed)$$1.getSource()).d(), 1.0F, 1.0F, 0.0F)))
         .then(
            ((RequiredArgumentBuilder)ee.a("targets", eq.d())
                  .executes($$1 -> a((ed)$$1.getSource(), eq.f($$1, "targets"), fe.c($$1, "sound"), $$0, ((ed)$$1.getSource()).d(), 1.0F, 1.0F, 0.0F)))
               .then(
                  ((RequiredArgumentBuilder)ee.a("pos", gg.a())
                        .executes($$1 -> a((ed)$$1.getSource(), eq.f($$1, "targets"), fe.c($$1, "sound"), $$0, gg.a($$1, "pos"), 1.0F, 1.0F, 0.0F)))
                     .then(
                        ((RequiredArgumentBuilder)ee.a("volume", FloatArgumentType.floatArg(0.0F))
                              .executes(
                                 $$1 -> a(
                                       (ed)$$1.getSource(),
                                       eq.f($$1, "targets"),
                                       fe.c($$1, "sound"),
                                       $$0,
                                       gg.a($$1, "pos"),
                                       (Float)$$1.getArgument("volume", Float.class),
                                       1.0F,
                                       0.0F
                                    )
                              ))
                           .then(
                              ((RequiredArgumentBuilder)ee.a("pitch", FloatArgumentType.floatArg(0.0F, 2.0F))
                                    .executes(
                                       $$1 -> a(
                                             (ed)$$1.getSource(),
                                             eq.f($$1, "targets"),
                                             fe.c($$1, "sound"),
                                             $$0,
                                             gg.a($$1, "pos"),
                                             (Float)$$1.getArgument("volume", Float.class),
                                             (Float)$$1.getArgument("pitch", Float.class),
                                             0.0F
                                          )
                                    ))
                                 .then(
                                    ee.a("minVolume", FloatArgumentType.floatArg(0.0F, 1.0F))
                                       .executes(
                                          $$1 -> a(
                                                (ed)$$1.getSource(),
                                                eq.f($$1, "targets"),
                                                fe.c($$1, "sound"),
                                                $$0,
                                                gg.a($$1, "pos"),
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

   private static Collection<aqi> a(@Nullable aqi $$0) {
      return $$0 != null ? List.of($$0) : List.of();
   }

   private static int a(ed $$0, Collection<aqi> $$1, akh $$2, avd $$3, etp $$4, float $$5, float $$6, float $$7) throws CommandSyntaxException {
      iw<avb> $$8 = iw.a(avb.a($$2));
      double $$9 = (double)axz.k($$8.a().a($$5));
      int $$10 = 0;
      long $$11 = $$0.e().E_().g();

      for (aqi $$12 : $$1) {
         double $$13 = $$4.c - $$12.ds();
         double $$14 = $$4.d - $$12.du();
         double $$15 = $$4.e - $$12.dy();
         double $$16 = $$13 * $$13 + $$14 * $$14 + $$15 * $$15;
         etp $$17 = $$4;
         float $$18 = $$5;
         if ($$16 > $$9) {
            if ($$7 <= 0.0F) {
               continue;
            }

            double $$19 = Math.sqrt($$16);
            $$17 = new etp($$12.ds() + $$13 / $$19 * 2.0, $$12.du() + $$14 / $$19 * 2.0, $$12.dy() + $$15 / $$19 * 2.0);
            $$18 = $$7;
         }

         $$12.d.b(new afg($$8, $$3, $$17.a(), $$17.b(), $$17.c(), $$18, $$6, $$11));
         $$10++;
      }

      if ($$10 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> wu.a("commands.playsound.success.single", wu.a($$2), $$1.iterator().next().O_()), true);
         } else {
            $$0.a(() -> wu.a("commands.playsound.success.multiple", wu.a($$2), $$1.size()), true);
         }

         return $$10;
      }
   }
}

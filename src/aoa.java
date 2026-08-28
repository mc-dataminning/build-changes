import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class aoa {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xl.c("commands.playsound.failed"));

   public static void a(CommandDispatcher<ep> $$0) {
      RequiredArgumentBuilder<ep, alb> $$1 = (RequiredArgumentBuilder<ep, alb>)eq.a("sound", fq.a())
         .suggests(io.c)
         .executes($$0x -> a((ep)$$0x.getSource(), a(((ep)$$0x.getSource()).i()), fq.c($$0x, "sound"), avx.a, ((ep)$$0x.getSource()).d(), 1.0F, 1.0F, 0.0F));

      for (avx $$2 : avx.values()) {
         $$1.then(a($$2));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("playsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static LiteralArgumentBuilder<ep> a(avx $$0) {
      return (LiteralArgumentBuilder<ep>)((LiteralArgumentBuilder)eq.a($$0.a())
            .executes($$1 -> a((ep)$$1.getSource(), a(((ep)$$1.getSource()).i()), fq.c($$1, "sound"), $$0, ((ep)$$1.getSource()).d(), 1.0F, 1.0F, 0.0F)))
         .then(
            ((RequiredArgumentBuilder)eq.a("targets", fc.d())
                  .executes($$1 -> a((ep)$$1.getSource(), fc.f($$1, "targets"), fq.c($$1, "sound"), $$0, ((ep)$$1.getSource()).d(), 1.0F, 1.0F, 0.0F)))
               .then(
                  ((RequiredArgumentBuilder)eq.a("pos", gs.a())
                        .executes($$1 -> a((ep)$$1.getSource(), fc.f($$1, "targets"), fq.c($$1, "sound"), $$0, gs.a($$1, "pos"), 1.0F, 1.0F, 0.0F)))
                     .then(
                        ((RequiredArgumentBuilder)eq.a("volume", FloatArgumentType.floatArg(0.0F))
                              .executes(
                                 $$1 -> a(
                                       (ep)$$1.getSource(),
                                       fc.f($$1, "targets"),
                                       fq.c($$1, "sound"),
                                       $$0,
                                       gs.a($$1, "pos"),
                                       (Float)$$1.getArgument("volume", Float.class),
                                       1.0F,
                                       0.0F
                                    )
                              ))
                           .then(
                              ((RequiredArgumentBuilder)eq.a("pitch", FloatArgumentType.floatArg(0.0F, 2.0F))
                                    .executes(
                                       $$1 -> a(
                                             (ep)$$1.getSource(),
                                             fc.f($$1, "targets"),
                                             fq.c($$1, "sound"),
                                             $$0,
                                             gs.a($$1, "pos"),
                                             (Float)$$1.getArgument("volume", Float.class),
                                             (Float)$$1.getArgument("pitch", Float.class),
                                             0.0F
                                          )
                                    ))
                                 .then(
                                    eq.a("minVolume", FloatArgumentType.floatArg(0.0F, 1.0F))
                                       .executes(
                                          $$1 -> a(
                                                (ep)$$1.getSource(),
                                                fc.f($$1, "targets"),
                                                fq.c($$1, "sound"),
                                                $$0,
                                                gs.a($$1, "pos"),
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

   private static Collection<arc> a(@Nullable arc $$0) {
      return $$0 != null ? List.of($$0) : List.of();
   }

   private static int a(ep $$0, Collection<arc> $$1, alb $$2, avx $$3, evm $$4, float $$5, float $$6, float $$7) throws CommandSyntaxException {
      ji<avv> $$8 = ji.a(avv.a($$2));
      double $$9 = (double)ayu.k($$8.a().a($$5));
      int $$10 = 0;
      long $$11 = $$0.e().E_().g();

      for (arc $$12 : $$1) {
         double $$13 = $$4.c - $$12.du();
         double $$14 = $$4.d - $$12.dw();
         double $$15 = $$4.e - $$12.dA();
         double $$16 = $$13 * $$13 + $$14 * $$14 + $$15 * $$15;
         evm $$17 = $$4;
         float $$18 = $$5;
         if ($$16 > $$9) {
            if ($$7 <= 0.0F) {
               continue;
            }

            double $$19 = Math.sqrt($$16);
            $$17 = new evm($$12.du() + $$13 / $$19 * 2.0, $$12.dw() + $$14 / $$19 * 2.0, $$12.dA() + $$15 / $$19 * 2.0);
            $$18 = $$7;
         }

         $$12.c.b(new afz($$8, $$3, $$17.a(), $$17.b(), $$17.c(), $$18, $$6, $$11));
         $$10++;
      }

      if ($$10 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> xl.a("commands.playsound.success.single", xl.a($$2), $$1.iterator().next().O_()), true);
         } else {
            $$0.a(() -> xl.a("commands.playsound.success.multiple", xl.a($$2), $$1.size()), true);
         }

         return $$10;
      }
   }
}

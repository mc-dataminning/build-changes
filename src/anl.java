import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class anl {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wx.c("commands.playsound.failed"));

   public static void a(CommandDispatcher<ee> $$0) {
      RequiredArgumentBuilder<ee, akm> $$1 = (RequiredArgumentBuilder<ee, akm>)ef.a("sound", ff.a())
         .suggests(ic.c)
         .executes($$0x -> a((ee)$$0x.getSource(), a(((ee)$$0x.getSource()).i()), ff.c($$0x, "sound"), avi.a, ((ee)$$0x.getSource()).d(), 1.0F, 1.0F, 0.0F));

      for (avi $$2 : avi.values()) {
         $$1.then(a($$2));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("playsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static LiteralArgumentBuilder<ee> a(avi $$0) {
      return (LiteralArgumentBuilder<ee>)((LiteralArgumentBuilder)ef.a($$0.a())
            .executes($$1 -> a((ee)$$1.getSource(), a(((ee)$$1.getSource()).i()), ff.c($$1, "sound"), $$0, ((ee)$$1.getSource()).d(), 1.0F, 1.0F, 0.0F)))
         .then(
            ((RequiredArgumentBuilder)ef.a("targets", er.d())
                  .executes($$1 -> a((ee)$$1.getSource(), er.f($$1, "targets"), ff.c($$1, "sound"), $$0, ((ee)$$1.getSource()).d(), 1.0F, 1.0F, 0.0F)))
               .then(
                  ((RequiredArgumentBuilder)ef.a("pos", gh.a())
                        .executes($$1 -> a((ee)$$1.getSource(), er.f($$1, "targets"), ff.c($$1, "sound"), $$0, gh.a($$1, "pos"), 1.0F, 1.0F, 0.0F)))
                     .then(
                        ((RequiredArgumentBuilder)ef.a("volume", FloatArgumentType.floatArg(0.0F))
                              .executes(
                                 $$1 -> a(
                                       (ee)$$1.getSource(),
                                       er.f($$1, "targets"),
                                       ff.c($$1, "sound"),
                                       $$0,
                                       gh.a($$1, "pos"),
                                       (Float)$$1.getArgument("volume", Float.class),
                                       1.0F,
                                       0.0F
                                    )
                              ))
                           .then(
                              ((RequiredArgumentBuilder)ef.a("pitch", FloatArgumentType.floatArg(0.0F, 2.0F))
                                    .executes(
                                       $$1 -> a(
                                             (ee)$$1.getSource(),
                                             er.f($$1, "targets"),
                                             ff.c($$1, "sound"),
                                             $$0,
                                             gh.a($$1, "pos"),
                                             (Float)$$1.getArgument("volume", Float.class),
                                             (Float)$$1.getArgument("pitch", Float.class),
                                             0.0F
                                          )
                                    ))
                                 .then(
                                    ef.a("minVolume", FloatArgumentType.floatArg(0.0F, 1.0F))
                                       .executes(
                                          $$1 -> a(
                                                (ee)$$1.getSource(),
                                                er.f($$1, "targets"),
                                                ff.c($$1, "sound"),
                                                $$0,
                                                gh.a($$1, "pos"),
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

   private static Collection<aqn> a(@Nullable aqn $$0) {
      return $$0 != null ? List.of($$0) : List.of();
   }

   private static int a(ee $$0, Collection<aqn> $$1, akm $$2, avi $$3, euk $$4, float $$5, float $$6, float $$7) throws CommandSyntaxException {
      ix<avg> $$8 = ix.a(avg.a($$2));
      double $$9 = (double)ayd.k($$8.a().a($$5));
      int $$10 = 0;
      long $$11 = $$0.e().E_().g();

      for (aqn $$12 : $$1) {
         double $$13 = $$4.c - $$12.du();
         double $$14 = $$4.d - $$12.dw();
         double $$15 = $$4.e - $$12.dA();
         double $$16 = $$13 * $$13 + $$14 * $$14 + $$15 * $$15;
         euk $$17 = $$4;
         float $$18 = $$5;
         if ($$16 > $$9) {
            if ($$7 <= 0.0F) {
               continue;
            }

            double $$19 = Math.sqrt($$16);
            $$17 = new euk($$12.du() + $$13 / $$19 * 2.0, $$12.dw() + $$14 / $$19 * 2.0, $$12.dA() + $$15 / $$19 * 2.0);
            $$18 = $$7;
         }

         $$12.d.b(new afk($$8, $$3, $$17.a(), $$17.b(), $$17.c(), $$18, $$6, $$11));
         $$10++;
      }

      if ($$10 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> wx.a("commands.playsound.success.single", wx.a($$2), $$1.iterator().next().O_()), true);
         } else {
            $$0.a(() -> wx.a("commands.playsound.success.multiple", wx.a($$2), $$1.size()), true);
         }

         return $$10;
      }
   }
}

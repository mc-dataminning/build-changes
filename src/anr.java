import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class anr {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wz.c("commands.playsound.failed"));

   public static void a(CommandDispatcher<et> $$0) {
      RequiredArgumentBuilder<et, akr> $$1 = (RequiredArgumentBuilder<et, akr>)eu.a("sound", fu.a())
         .suggests(is.c)
         .executes($$0x -> a((et)$$0x.getSource(), a(((et)$$0x.getSource()).i()), fu.c($$0x, "sound"), avq.a, ((et)$$0x.getSource()).d(), 1.0F, 1.0F, 0.0F));

      for (avq $$2 : avq.values()) {
         $$1.then(a($$2));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("playsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static LiteralArgumentBuilder<et> a(avq $$0) {
      return (LiteralArgumentBuilder<et>)((LiteralArgumentBuilder)eu.a($$0.a())
            .executes($$1 -> a((et)$$1.getSource(), a(((et)$$1.getSource()).i()), fu.c($$1, "sound"), $$0, ((et)$$1.getSource()).d(), 1.0F, 1.0F, 0.0F)))
         .then(
            ((RequiredArgumentBuilder)eu.a("targets", fg.d())
                  .executes($$1 -> a((et)$$1.getSource(), fg.f($$1, "targets"), fu.c($$1, "sound"), $$0, ((et)$$1.getSource()).d(), 1.0F, 1.0F, 0.0F)))
               .then(
                  ((RequiredArgumentBuilder)eu.a("pos", gw.a())
                        .executes($$1 -> a((et)$$1.getSource(), fg.f($$1, "targets"), fu.c($$1, "sound"), $$0, gw.a($$1, "pos"), 1.0F, 1.0F, 0.0F)))
                     .then(
                        ((RequiredArgumentBuilder)eu.a("volume", FloatArgumentType.floatArg(0.0F))
                              .executes(
                                 $$1 -> a(
                                       (et)$$1.getSource(),
                                       fg.f($$1, "targets"),
                                       fu.c($$1, "sound"),
                                       $$0,
                                       gw.a($$1, "pos"),
                                       (Float)$$1.getArgument("volume", Float.class),
                                       1.0F,
                                       0.0F
                                    )
                              ))
                           .then(
                              ((RequiredArgumentBuilder)eu.a("pitch", FloatArgumentType.floatArg(0.0F, 2.0F))
                                    .executes(
                                       $$1 -> a(
                                             (et)$$1.getSource(),
                                             fg.f($$1, "targets"),
                                             fu.c($$1, "sound"),
                                             $$0,
                                             gw.a($$1, "pos"),
                                             (Float)$$1.getArgument("volume", Float.class),
                                             (Float)$$1.getArgument("pitch", Float.class),
                                             0.0F
                                          )
                                    ))
                                 .then(
                                    eu.a("minVolume", FloatArgumentType.floatArg(0.0F, 1.0F))
                                       .executes(
                                          $$1 -> a(
                                                (et)$$1.getSource(),
                                                fg.f($$1, "targets"),
                                                fu.c($$1, "sound"),
                                                $$0,
                                                gw.a($$1, "pos"),
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

   private static Collection<aqv> a(@Nullable aqv $$0) {
      return $$0 != null ? List.of($$0) : List.of();
   }

   private static int a(et $$0, Collection<aqv> $$1, akr $$2, avq $$3, exa $$4, float $$5, float $$6, float $$7) throws CommandSyntaxException {
      jm<avo> $$8 = jm.a(avo.a($$2));
      double $$9 = (double)ayo.k($$8.a().a($$5));
      int $$10 = 0;
      long $$11 = $$0.e().E_().g();

      for (aqv $$12 : $$1) {
         double $$13 = $$4.c - $$12.du();
         double $$14 = $$4.d - $$12.dw();
         double $$15 = $$4.e - $$12.dA();
         double $$16 = $$13 * $$13 + $$14 * $$14 + $$15 * $$15;
         exa $$17 = $$4;
         float $$18 = $$5;
         if ($$16 > $$9) {
            if ($$7 <= 0.0F) {
               continue;
            }

            double $$19 = Math.sqrt($$16);
            $$17 = new exa($$12.du() + $$13 / $$19 * 2.0, $$12.dw() + $$14 / $$19 * 2.0, $$12.dA() + $$15 / $$19 * 2.0);
            $$18 = $$7;
         }

         $$12.c.b(new afp($$8, $$3, $$17.a(), $$17.b(), $$17.c(), $$18, $$6, $$11));
         $$10++;
      }

      if ($$10 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> wz.a("commands.playsound.success.single", wz.a($$2), $$1.iterator().next().S_()), true);
         } else {
            $$0.a(() -> wz.a("commands.playsound.success.multiple", wz.a($$2), $$1.size()), true);
         }

         return $$10;
      }
   }
}

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class aoc {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xd.c("commands.playsound.failed"));

   public static void a(CommandDispatcher<et> $$0) {
      RequiredArgumentBuilder<et, alb> $$1 = (RequiredArgumentBuilder<et, alb>)eu.a("sound", fu.a())
         .suggests(it.c)
         .executes($$0x -> a((et)$$0x.getSource(), a(((et)$$0x.getSource()).i()), fu.c($$0x, "sound"), awe.a, ((et)$$0x.getSource()).d(), 1.0F, 1.0F, 0.0F));

      for (awe $$2 : awe.values()) {
         $$1.then(a($$2));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("playsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static LiteralArgumentBuilder<et> a(awe $$0) {
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

   private static Collection<arh> a(@Nullable arh $$0) {
      return $$0 != null ? List.of($$0) : List.of();
   }

   private static int a(et $$0, Collection<arh> $$1, alb $$2, awe $$3, eye $$4, float $$5, float $$6, float $$7) throws CommandSyntaxException {
      jn<awc> $$8 = jn.a(awc.a($$2));
      double $$9 = (double)azc.k($$8.a().a($$5));
      int $$10 = 0;
      long $$11 = $$0.e().C_().g();

      for (arh $$12 : $$1) {
         double $$13 = $$4.d - $$12.dx();
         double $$14 = $$4.e - $$12.dz();
         double $$15 = $$4.f - $$12.dD();
         double $$16 = $$13 * $$13 + $$14 * $$14 + $$15 * $$15;
         eye $$17 = $$4;
         float $$18 = $$5;
         if ($$16 > $$9) {
            if ($$7 <= 0.0F) {
               continue;
            }

            double $$19 = Math.sqrt($$16);
            $$17 = new eye($$12.dx() + $$13 / $$19 * 2.0, $$12.dz() + $$14 / $$19 * 2.0, $$12.dD() + $$15 / $$19 * 2.0);
            $$18 = $$7;
         }

         $$12.c.b(new afx($$8, $$3, $$17.a(), $$17.b(), $$17.c(), $$18, $$6, $$11));
         $$10++;
      }

      if ($$10 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> xd.a("commands.playsound.success.single", xd.a($$2), $$1.iterator().next().Q_()), true);
         } else {
            $$0.a(() -> xd.a("commands.playsound.success.multiple", xd.a($$2), $$1.size()), true);
         }

         return $$10;
      }
   }
}

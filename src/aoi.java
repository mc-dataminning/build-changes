import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class aoi {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xh.c("commands.playsound.failed"));

   public static void a(CommandDispatcher<ev> $$0) {
      RequiredArgumentBuilder<ev, alh> $$1 = (RequiredArgumentBuilder<ev, alh>)ew.a("sound", fw.a())
         .suggests(iv.c)
         .executes($$0x -> a((ev)$$0x.getSource(), a(((ev)$$0x.getSource()).i()), fw.c($$0x, "sound"), awl.a, ((ev)$$0x.getSource()).d(), 1.0F, 1.0F, 0.0F));

      for (awl $$2 : awl.values()) {
         $$1.then(a($$2));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("playsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static LiteralArgumentBuilder<ev> a(awl $$0) {
      return (LiteralArgumentBuilder<ev>)((LiteralArgumentBuilder)ew.a($$0.a())
            .executes($$1 -> a((ev)$$1.getSource(), a(((ev)$$1.getSource()).i()), fw.c($$1, "sound"), $$0, ((ev)$$1.getSource()).d(), 1.0F, 1.0F, 0.0F)))
         .then(
            ((RequiredArgumentBuilder)ew.a("targets", fi.d())
                  .executes($$1 -> a((ev)$$1.getSource(), fi.f($$1, "targets"), fw.c($$1, "sound"), $$0, ((ev)$$1.getSource()).d(), 1.0F, 1.0F, 0.0F)))
               .then(
                  ((RequiredArgumentBuilder)ew.a("pos", gy.a())
                        .executes($$1 -> a((ev)$$1.getSource(), fi.f($$1, "targets"), fw.c($$1, "sound"), $$0, gy.a($$1, "pos"), 1.0F, 1.0F, 0.0F)))
                     .then(
                        ((RequiredArgumentBuilder)ew.a("volume", FloatArgumentType.floatArg(0.0F))
                              .executes(
                                 $$1 -> a(
                                       (ev)$$1.getSource(),
                                       fi.f($$1, "targets"),
                                       fw.c($$1, "sound"),
                                       $$0,
                                       gy.a($$1, "pos"),
                                       (Float)$$1.getArgument("volume", Float.class),
                                       1.0F,
                                       0.0F
                                    )
                              ))
                           .then(
                              ((RequiredArgumentBuilder)ew.a("pitch", FloatArgumentType.floatArg(0.0F, 2.0F))
                                    .executes(
                                       $$1 -> a(
                                             (ev)$$1.getSource(),
                                             fi.f($$1, "targets"),
                                             fw.c($$1, "sound"),
                                             $$0,
                                             gy.a($$1, "pos"),
                                             (Float)$$1.getArgument("volume", Float.class),
                                             (Float)$$1.getArgument("pitch", Float.class),
                                             0.0F
                                          )
                                    ))
                                 .then(
                                    ew.a("minVolume", FloatArgumentType.floatArg(0.0F, 1.0F))
                                       .executes(
                                          $$1 -> a(
                                                (ev)$$1.getSource(),
                                                fi.f($$1, "targets"),
                                                fw.c($$1, "sound"),
                                                $$0,
                                                gy.a($$1, "pos"),
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

   private static Collection<arn> a(@Nullable arn $$0) {
      return $$0 != null ? List.of($$0) : List.of();
   }

   private static int a(ev $$0, Collection<arn> $$1, alh $$2, awl $$3, ezh $$4, float $$5, float $$6, float $$7) throws CommandSyntaxException {
      jp<awj> $$8 = jp.a(awj.a($$2));
      double $$9 = (double)azj.l($$8.a().a($$5));
      int $$10 = 0;
      long $$11 = $$0.e().E_().g();

      for (arn $$12 : $$1) {
         double $$13 = $$4.d - $$12.dC();
         double $$14 = $$4.e - $$12.dE();
         double $$15 = $$4.f - $$12.dI();
         double $$16 = $$13 * $$13 + $$14 * $$14 + $$15 * $$15;
         ezh $$17 = $$4;
         float $$18 = $$5;
         if ($$16 > $$9) {
            if ($$7 <= 0.0F) {
               continue;
            }

            double $$19 = Math.sqrt($$16);
            $$17 = new ezh($$12.dC() + $$13 / $$19 * 2.0, $$12.dE() + $$14 / $$19 * 2.0, $$12.dI() + $$15 / $$19 * 2.0);
            $$18 = $$7;
         }

         $$12.d.b(new agb($$8, $$3, $$17.a(), $$17.b(), $$17.c(), $$18, $$6, $$11));
         $$10++;
      }

      if ($$10 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> xh.a("commands.playsound.success.single", xh.a($$2), $$1.iterator().next().S_()), true);
         } else {
            $$0.a(() -> xh.a("commands.playsound.success.multiple", xh.a($$2), $$1.size()), true);
         }

         return $$10;
      }
   }
}

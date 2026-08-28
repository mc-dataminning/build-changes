import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class aof {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("commands.playsound.failed"));

   public static void a(CommandDispatcher<eu> $$0) {
      RequiredArgumentBuilder<eu, ale> $$1 = (RequiredArgumentBuilder<eu, ale>)ev.a("sound", fv.a())
         .suggests(iu.c)
         .executes($$0x -> a((eu)$$0x.getSource(), a(((eu)$$0x.getSource()).i()), fv.c($$0x, "sound"), awh.a, ((eu)$$0x.getSource()).d(), 1.0F, 1.0F, 0.0F));

      for (awh $$2 : awh.values()) {
         $$1.then(a($$2));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("playsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static LiteralArgumentBuilder<eu> a(awh $$0) {
      return (LiteralArgumentBuilder<eu>)((LiteralArgumentBuilder)ev.a($$0.a())
            .executes($$1 -> a((eu)$$1.getSource(), a(((eu)$$1.getSource()).i()), fv.c($$1, "sound"), $$0, ((eu)$$1.getSource()).d(), 1.0F, 1.0F, 0.0F)))
         .then(
            ((RequiredArgumentBuilder)ev.a("targets", fh.d())
                  .executes($$1 -> a((eu)$$1.getSource(), fh.f($$1, "targets"), fv.c($$1, "sound"), $$0, ((eu)$$1.getSource()).d(), 1.0F, 1.0F, 0.0F)))
               .then(
                  ((RequiredArgumentBuilder)ev.a("pos", gx.a())
                        .executes($$1 -> a((eu)$$1.getSource(), fh.f($$1, "targets"), fv.c($$1, "sound"), $$0, gx.a($$1, "pos"), 1.0F, 1.0F, 0.0F)))
                     .then(
                        ((RequiredArgumentBuilder)ev.a("volume", FloatArgumentType.floatArg(0.0F))
                              .executes(
                                 $$1 -> a(
                                       (eu)$$1.getSource(),
                                       fh.f($$1, "targets"),
                                       fv.c($$1, "sound"),
                                       $$0,
                                       gx.a($$1, "pos"),
                                       (Float)$$1.getArgument("volume", Float.class),
                                       1.0F,
                                       0.0F
                                    )
                              ))
                           .then(
                              ((RequiredArgumentBuilder)ev.a("pitch", FloatArgumentType.floatArg(0.0F, 2.0F))
                                    .executes(
                                       $$1 -> a(
                                             (eu)$$1.getSource(),
                                             fh.f($$1, "targets"),
                                             fv.c($$1, "sound"),
                                             $$0,
                                             gx.a($$1, "pos"),
                                             (Float)$$1.getArgument("volume", Float.class),
                                             (Float)$$1.getArgument("pitch", Float.class),
                                             0.0F
                                          )
                                    ))
                                 .then(
                                    ev.a("minVolume", FloatArgumentType.floatArg(0.0F, 1.0F))
                                       .executes(
                                          $$1 -> a(
                                                (eu)$$1.getSource(),
                                                fh.f($$1, "targets"),
                                                fv.c($$1, "sound"),
                                                $$0,
                                                gx.a($$1, "pos"),
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

   private static Collection<ark> a(@Nullable ark $$0) {
      return $$0 != null ? List.of($$0) : List.of();
   }

   private static int a(eu $$0, Collection<ark> $$1, ale $$2, awh $$3, eyw $$4, float $$5, float $$6, float $$7) throws CommandSyntaxException {
      jo<awf> $$8 = jo.a(awf.a($$2));
      double $$9 = (double)azf.l($$8.a().a($$5));
      int $$10 = 0;
      long $$11 = $$0.e().D_().g();

      for (ark $$12 : $$1) {
         double $$13 = $$4.d - $$12.dx();
         double $$14 = $$4.e - $$12.dz();
         double $$15 = $$4.f - $$12.dD();
         double $$16 = $$13 * $$13 + $$14 * $$14 + $$15 * $$15;
         eyw $$17 = $$4;
         float $$18 = $$5;
         if ($$16 > $$9) {
            if ($$7 <= 0.0F) {
               continue;
            }

            double $$19 = Math.sqrt($$16);
            $$17 = new eyw($$12.dx() + $$13 / $$19 * 2.0, $$12.dz() + $$14 / $$19 * 2.0, $$12.dD() + $$15 / $$19 * 2.0);
            $$18 = $$7;
         }

         $$12.c.b(new afy($$8, $$3, $$17.a(), $$17.b(), $$17.c(), $$18, $$6, $$11));
         $$10++;
      }

      if ($$10 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> xe.a("commands.playsound.success.single", xe.a($$2), $$1.iterator().next().R_()), true);
         } else {
            $$0.a(() -> xe.a("commands.playsound.success.multiple", xe.a($$2), $$1.size()), true);
         }

         return $$10;
      }
   }
}

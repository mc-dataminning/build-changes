import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class aou {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xg.c("commands.playsound.failed"));

   public static void a(CommandDispatcher<ek> $$0) {
      RequiredArgumentBuilder<ek, alr> $$1 = (RequiredArgumentBuilder<ek, alr>)el.a("sound", fl.a())
         .suggests(il.b)
         .executes($$0x -> a((ek)$$0x.getSource(), a(((ek)$$0x.getSource()).i()), fl.a($$0x, "sound"), awz.a, ((ek)$$0x.getSource()).d(), 1.0F, 1.0F, 0.0F));

      for (awz $$2 : awz.values()) {
         $$1.then(a($$2));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("playsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static LiteralArgumentBuilder<ek> a(awz $$0) {
      return (LiteralArgumentBuilder<ek>)((LiteralArgumentBuilder)el.a($$0.a())
            .executes($$1 -> a((ek)$$1.getSource(), a(((ek)$$1.getSource()).i()), fl.a($$1, "sound"), $$0, ((ek)$$1.getSource()).d(), 1.0F, 1.0F, 0.0F)))
         .then(
            ((RequiredArgumentBuilder)el.a("targets", ex.d())
                  .executes($$1 -> a((ek)$$1.getSource(), ex.f($$1, "targets"), fl.a($$1, "sound"), $$0, ((ek)$$1.getSource()).d(), 1.0F, 1.0F, 0.0F)))
               .then(
                  ((RequiredArgumentBuilder)el.a("pos", go.a())
                        .executes($$1 -> a((ek)$$1.getSource(), ex.f($$1, "targets"), fl.a($$1, "sound"), $$0, go.a($$1, "pos"), 1.0F, 1.0F, 0.0F)))
                     .then(
                        ((RequiredArgumentBuilder)el.a("volume", FloatArgumentType.floatArg(0.0F))
                              .executes(
                                 $$1 -> a(
                                       (ek)$$1.getSource(),
                                       ex.f($$1, "targets"),
                                       fl.a($$1, "sound"),
                                       $$0,
                                       go.a($$1, "pos"),
                                       (Float)$$1.getArgument("volume", Float.class),
                                       1.0F,
                                       0.0F
                                    )
                              ))
                           .then(
                              ((RequiredArgumentBuilder)el.a("pitch", FloatArgumentType.floatArg(0.0F, 2.0F))
                                    .executes(
                                       $$1 -> a(
                                             (ek)$$1.getSource(),
                                             ex.f($$1, "targets"),
                                             fl.a($$1, "sound"),
                                             $$0,
                                             go.a($$1, "pos"),
                                             (Float)$$1.getArgument("volume", Float.class),
                                             (Float)$$1.getArgument("pitch", Float.class),
                                             0.0F
                                          )
                                    ))
                                 .then(
                                    el.a("minVolume", FloatArgumentType.floatArg(0.0F, 1.0F))
                                       .executes(
                                          $$1 -> a(
                                                (ek)$$1.getSource(),
                                                ex.f($$1, "targets"),
                                                fl.a($$1, "sound"),
                                                $$0,
                                                go.a($$1, "pos"),
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

   private static Collection<asc> a(@Nullable asc $$0) {
      return $$0 != null ? List.of($$0) : List.of();
   }

   private static int a(ek $$0, Collection<asc> $$1, alr $$2, awz $$3, fgc $$4, float $$5, float $$6, float $$7) throws CommandSyntaxException {
      jg<awx> $$8 = jg.a(awx.a($$2));
      double $$9 = (double)azz.l($$8.a().a($$5));
      int $$10 = 0;
      long $$11 = $$0.e().G_().g();

      for (asc $$12 : $$1) {
         double $$13 = $$4.d - $$12.dA();
         double $$14 = $$4.e - $$12.dC();
         double $$15 = $$4.f - $$12.dG();
         double $$16 = $$13 * $$13 + $$14 * $$14 + $$15 * $$15;
         fgc $$17 = $$4;
         float $$18 = $$5;
         if ($$16 > $$9) {
            if ($$7 <= 0.0F) {
               continue;
            }

            double $$19 = Math.sqrt($$16);
            $$17 = new fgc($$12.dA() + $$13 / $$19 * 2.0, $$12.dC() + $$14 / $$19 * 2.0, $$12.dG() + $$15 / $$19 * 2.0);
            $$18 = $$7;
         }

         $$12.f.b(new agg($$8, $$3, $$17.a(), $$17.b(), $$17.c(), $$18, $$6, $$11));
         $$10++;
      }

      if ($$10 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> xg.a("commands.playsound.success.single", xg.a($$2), $$1.iterator().next().m_()), true);
         } else {
            $$0.a(() -> xg.a("commands.playsound.success.multiple", xg.a($$2), $$1.size()), true);
         }

         return $$10;
      }
   }
}

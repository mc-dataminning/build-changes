import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class and {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ws.c("commands.playsound.failed"));

   public static void a(CommandDispatcher<ec> $$0) {
      RequiredArgumentBuilder<ec, akf> $$1 = (RequiredArgumentBuilder<ec, akf>)ed.a("sound", fd.a())
         .suggests(ia.c)
         .executes($$0x -> a((ec)$$0x.getSource(), a(((ec)$$0x.getSource()).i()), fd.e($$0x, "sound"), ava.a, ((ec)$$0x.getSource()).d(), 1.0F, 1.0F, 0.0F));

      for (ava $$2 : ava.values()) {
         $$1.then(a($$2));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("playsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static LiteralArgumentBuilder<ec> a(ava $$0) {
      return (LiteralArgumentBuilder<ec>)((LiteralArgumentBuilder)ed.a($$0.a())
            .executes($$1 -> a((ec)$$1.getSource(), a(((ec)$$1.getSource()).i()), fd.e($$1, "sound"), $$0, ((ec)$$1.getSource()).d(), 1.0F, 1.0F, 0.0F)))
         .then(
            ((RequiredArgumentBuilder)ed.a("targets", ep.d())
                  .executes($$1 -> a((ec)$$1.getSource(), ep.f($$1, "targets"), fd.e($$1, "sound"), $$0, ((ec)$$1.getSource()).d(), 1.0F, 1.0F, 0.0F)))
               .then(
                  ((RequiredArgumentBuilder)ed.a("pos", ge.a())
                        .executes($$1 -> a((ec)$$1.getSource(), ep.f($$1, "targets"), fd.e($$1, "sound"), $$0, ge.a($$1, "pos"), 1.0F, 1.0F, 0.0F)))
                     .then(
                        ((RequiredArgumentBuilder)ed.a("volume", FloatArgumentType.floatArg(0.0F))
                              .executes(
                                 $$1 -> a(
                                       (ec)$$1.getSource(),
                                       ep.f($$1, "targets"),
                                       fd.e($$1, "sound"),
                                       $$0,
                                       ge.a($$1, "pos"),
                                       (Float)$$1.getArgument("volume", Float.class),
                                       1.0F,
                                       0.0F
                                    )
                              ))
                           .then(
                              ((RequiredArgumentBuilder)ed.a("pitch", FloatArgumentType.floatArg(0.0F, 2.0F))
                                    .executes(
                                       $$1 -> a(
                                             (ec)$$1.getSource(),
                                             ep.f($$1, "targets"),
                                             fd.e($$1, "sound"),
                                             $$0,
                                             ge.a($$1, "pos"),
                                             (Float)$$1.getArgument("volume", Float.class),
                                             (Float)$$1.getArgument("pitch", Float.class),
                                             0.0F
                                          )
                                    ))
                                 .then(
                                    ed.a("minVolume", FloatArgumentType.floatArg(0.0F, 1.0F))
                                       .executes(
                                          $$1 -> a(
                                                (ec)$$1.getSource(),
                                                ep.f($$1, "targets"),
                                                fd.e($$1, "sound"),
                                                $$0,
                                                ge.a($$1, "pos"),
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

   private static Collection<aqf> a(@Nullable aqf $$0) {
      return $$0 != null ? List.of($$0) : List.of();
   }

   private static int a(ec $$0, Collection<aqf> $$1, akf $$2, ava $$3, etf $$4, float $$5, float $$6, float $$7) throws CommandSyntaxException {
      iv<auy> $$8 = iv.a(auy.a($$2));
      double $$9 = (double)axw.k($$8.a().a($$5));
      int $$10 = 0;
      long $$11 = $$0.e().E_().g();

      for (aqf $$12 : $$1) {
         double $$13 = $$4.c - $$12.ds();
         double $$14 = $$4.d - $$12.du();
         double $$15 = $$4.e - $$12.dy();
         double $$16 = $$13 * $$13 + $$14 * $$14 + $$15 * $$15;
         etf $$17 = $$4;
         float $$18 = $$5;
         if ($$16 > $$9) {
            if ($$7 <= 0.0F) {
               continue;
            }

            double $$19 = Math.sqrt($$16);
            $$17 = new etf($$12.ds() + $$13 / $$19 * 2.0, $$12.du() + $$14 / $$19 * 2.0, $$12.dy() + $$15 / $$19 * 2.0);
            $$18 = $$7;
         }

         $$12.d.b(new afe($$8, $$3, $$17.a(), $$17.b(), $$17.c(), $$18, $$6, $$11));
         $$10++;
      }

      if ($$10 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> ws.a("commands.playsound.success.single", ws.a($$2), $$1.iterator().next().O_()), true);
         } else {
            $$0.a(() -> ws.a("commands.playsound.success.multiple", ws.a($$2), $$1.size()), true);
         }

         return $$10;
      }
   }
}

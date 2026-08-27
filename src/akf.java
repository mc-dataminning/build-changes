import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class akf {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vg.c("commands.playsound.failed"));

   public static void a(CommandDispatcher<ds> $$0) {
      RequiredArgumentBuilder<ds, ahh> $$1 = dt.a("sound", et.a()).suggests(hn.c);

      for (aru $$2 : aru.values()) {
         $$1.then(a($$2));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("playsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static LiteralArgumentBuilder<ds> a(aru $$0) {
      return (LiteralArgumentBuilder<ds>)dt.a($$0.a())
         .then(
            ((RequiredArgumentBuilder)dt.a("targets", ef.d())
                  .executes($$1 -> a((ds)$$1.getSource(), ef.f($$1, "targets"), et.e($$1, "sound"), $$0, ((ds)$$1.getSource()).d(), 1.0F, 1.0F, 0.0F)))
               .then(
                  ((RequiredArgumentBuilder)dt.a("pos", ft.a())
                        .executes($$1 -> a((ds)$$1.getSource(), ef.f($$1, "targets"), et.e($$1, "sound"), $$0, ft.a($$1, "pos"), 1.0F, 1.0F, 0.0F)))
                     .then(
                        ((RequiredArgumentBuilder)dt.a("volume", FloatArgumentType.floatArg(0.0F))
                              .executes(
                                 $$1 -> a(
                                       (ds)$$1.getSource(),
                                       ef.f($$1, "targets"),
                                       et.e($$1, "sound"),
                                       $$0,
                                       ft.a($$1, "pos"),
                                       (Float)$$1.getArgument("volume", Float.class),
                                       1.0F,
                                       0.0F
                                    )
                              ))
                           .then(
                              ((RequiredArgumentBuilder)dt.a("pitch", FloatArgumentType.floatArg(0.0F, 2.0F))
                                    .executes(
                                       $$1 -> a(
                                             (ds)$$1.getSource(),
                                             ef.f($$1, "targets"),
                                             et.e($$1, "sound"),
                                             $$0,
                                             ft.a($$1, "pos"),
                                             (Float)$$1.getArgument("volume", Float.class),
                                             (Float)$$1.getArgument("pitch", Float.class),
                                             0.0F
                                          )
                                    ))
                                 .then(
                                    dt.a("minVolume", FloatArgumentType.floatArg(0.0F, 1.0F))
                                       .executes(
                                          $$1 -> a(
                                                (ds)$$1.getSource(),
                                                ef.f($$1, "targets"),
                                                et.e($$1, "sound"),
                                                $$0,
                                                ft.a($$1, "pos"),
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

   private static int a(ds $$0, Collection<anf> $$1, ahh $$2, aru $$3, emc $$4, float $$5, float $$6, float $$7) throws CommandSyntaxException {
      ih<ars> $$8 = ih.a(ars.a($$2));
      double $$9 = (double)aup.k($$8.a().a($$5));
      int $$10 = 0;
      long $$11 = $$0.e().F_().g();

      for (anf $$12 : $$1) {
         double $$13 = $$4.c - $$12.dq();
         double $$14 = $$4.d - $$12.ds();
         double $$15 = $$4.e - $$12.dw();
         double $$16 = $$13 * $$13 + $$14 * $$14 + $$15 * $$15;
         emc $$17 = $$4;
         float $$18 = $$5;
         if ($$16 > $$9) {
            if ($$7 <= 0.0F) {
               continue;
            }

            double $$19 = Math.sqrt($$16);
            $$17 = new emc($$12.dq() + $$13 / $$19 * 2.0, $$12.ds() + $$14 / $$19 * 2.0, $$12.dw() + $$15 / $$19 * 2.0);
            $$18 = $$7;
         }

         $$12.c.b(new act($$8, $$3, $$17.a(), $$17.b(), $$17.c(), $$18, $$6, $$11));
         $$10++;
      }

      if ($$10 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> vg.a("commands.playsound.success.single", vg.a($$2), $$1.iterator().next().Q_()), true);
         } else {
            $$0.a(() -> vg.a("commands.playsound.success.multiple", vg.a($$2), $$1.size()), true);
         }

         return $$10;
      }
   }
}

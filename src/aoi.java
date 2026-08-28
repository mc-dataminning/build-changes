import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Optional;

public class aoi {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wy.c("commands.place.feature.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wy.c("commands.place.jigsaw.failed"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wy.c("commands.place.structure.failed"));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wy.b("commands.place.template.invalid", $$0));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wy.c("commands.place.template.failed"));
   private static final SuggestionProvider<ei> f = ($$0, $$1) -> {
      eve $$2 = ((ei)$$0.getSource()).e().r();
      return en.a($$2.a(), $$1);
   };

   public static void a(CommandDispatcher<ei> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("place")
                        .requires($$0x -> $$0x.c(2)))
                     .then(
                        ej.a("feature")
                           .then(
                              ((RequiredArgumentBuilder)ej.a("feature", fi.a(mg.aL))
                                    .executes($$0x -> a((ei)$$0x.getSource(), fi.a($$0x, "feature"), iu.a((jo)((ei)$$0x.getSource()).d()))))
                                 .then(ej.a("pos", gf.a()).executes($$0x -> a((ei)$$0x.getSource(), fi.a($$0x, "feature"), gf.a($$0x, "pos"))))
                           )
                     ))
                  .then(
                     ej.a("jigsaw")
                        .then(
                           ej.a("pool", fi.a(mg.bf))
                              .then(
                                 ej.a("target", fj.a())
                                    .then(
                                       ((RequiredArgumentBuilder)ej.a("max_depth", IntegerArgumentType.integer(1, 20))
                                             .executes(
                                                $$0x -> a(
                                                      (ei)$$0x.getSource(),
                                                      fi.c($$0x, "pool"),
                                                      fj.a($$0x, "target"),
                                                      IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                      iu.a((jo)((ei)$$0x.getSource()).d())
                                                   )
                                             ))
                                          .then(
                                             ej.a("position", gf.a())
                                                .executes(
                                                   $$0x -> a(
                                                         (ei)$$0x.getSource(),
                                                         fi.c($$0x, "pool"),
                                                         fj.a($$0x, "target"),
                                                         IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                         gf.a($$0x, "position")
                                                      )
                                                )
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  ej.a("structure")
                     .then(
                        ((RequiredArgumentBuilder)ej.a("structure", fi.a(mg.be))
                              .executes($$0x -> b((ei)$$0x.getSource(), fi.b($$0x, "structure"), iu.a((jo)((ei)$$0x.getSource()).d()))))
                           .then(ej.a("pos", gf.a()).executes($$0x -> b((ei)$$0x.getSource(), fi.b($$0x, "structure"), gf.a($$0x, "pos"))))
                     )
               ))
            .then(
               ej.a("template")
                  .then(
                     ((RequiredArgumentBuilder)ej.a("template", fj.a())
                           .suggests(f)
                           .executes(
                              $$0x -> a((ei)$$0x.getSource(), fj.a($$0x, "template"), iu.a((jo)((ei)$$0x.getSource()).d()), dsz.a, dri.a, 1.0F, 0, false)
                           ))
                        .then(
                           ((RequiredArgumentBuilder)ej.a("pos", gf.a())
                                 .executes($$0x -> a((ei)$$0x.getSource(), fj.a($$0x, "template"), gf.a($$0x, "pos"), dsz.a, dri.a, 1.0F, 0, false)))
                              .then(
                                 ((RequiredArgumentBuilder)ej.a("rotation", fx.a())
                                       .executes(
                                          $$0x -> a(
                                                (ei)$$0x.getSource(), fj.a($$0x, "template"), gf.a($$0x, "pos"), fx.a($$0x, "rotation"), dri.a, 1.0F, 0, false
                                             )
                                       ))
                                    .then(
                                       ((RequiredArgumentBuilder)ej.a("mirror", fw.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ei)$$0x.getSource(),
                                                      fj.a($$0x, "template"),
                                                      gf.a($$0x, "pos"),
                                                      fx.a($$0x, "rotation"),
                                                      fw.a($$0x, "mirror"),
                                                      1.0F,
                                                      0,
                                                      false
                                                   )
                                             ))
                                          .then(
                                             ((RequiredArgumentBuilder)ej.a("integrity", FloatArgumentType.floatArg(0.0F, 1.0F))
                                                   .executes(
                                                      $$0x -> a(
                                                            (ei)$$0x.getSource(),
                                                            fj.a($$0x, "template"),
                                                            gf.a($$0x, "pos"),
                                                            fx.a($$0x, "rotation"),
                                                            fw.a($$0x, "mirror"),
                                                            FloatArgumentType.getFloat($$0x, "integrity"),
                                                            0,
                                                            false
                                                         )
                                                   ))
                                                .then(
                                                   ((RequiredArgumentBuilder)ej.a("seed", IntegerArgumentType.integer())
                                                         .executes(
                                                            $$0x -> a(
                                                                  (ei)$$0x.getSource(),
                                                                  fj.a($$0x, "template"),
                                                                  gf.a($$0x, "pos"),
                                                                  fx.a($$0x, "rotation"),
                                                                  fw.a($$0x, "mirror"),
                                                                  FloatArgumentType.getFloat($$0x, "integrity"),
                                                                  IntegerArgumentType.getInteger($$0x, "seed"),
                                                                  false
                                                               )
                                                         ))
                                                      .then(
                                                         ej.a("strict")
                                                            .executes(
                                                               $$0x -> a(
                                                                     (ei)$$0x.getSource(),
                                                                     fj.a($$0x, "template"),
                                                                     gf.a($$0x, "pos"),
                                                                     fx.a($$0x, "rotation"),
                                                                     fw.a($$0x, "mirror"),
                                                                     FloatArgumentType.getFloat($$0x, "integrity"),
                                                                     IntegerArgumentType.getInteger($$0x, "seed"),
                                                                     true
                                                                  )
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }

   public static int a(ei $$0, je.c<eiy<?, ?>> $$1, iu $$2) throws CommandSyntaxException {
      arq $$3 = $$0.e();
      eiy<?, ?> $$4 = $$1.a();
      dih $$5 = new dih($$2);
      a($$3, new dih($$5.h - 1, $$5.i - 1), new dih($$5.h + 1, $$5.i + 1));
      if (!$$4.a($$3, $$3.m().g(), $$3.C_(), $$2)) {
         throw a.create();
      } else {
         String $$6 = $$1.h().a().toString();
         $$0.a(() -> wy.a("commands.place.feature.success", $$6, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(ei $$0, je<esl> $$1, alg $$2, int $$3, iu $$4) throws CommandSyntaxException {
      arq $$5 = $$0.e();
      dih $$6 = new dih($$4);
      a($$5, $$6, $$6);
      if (!esf.a($$5, $$1, $$2, $$3, $$4, false)) {
         throw b.create();
      } else {
         $$0.a(() -> wy.a("commands.place.jigsaw.success", $$4.u(), $$4.v(), $$4.w()), true);
         return 1;
      }
   }

   public static int b(ei $$0, je.c<erb> $$1, iu $$2) throws CommandSyntaxException {
      arq $$3 = $$0.e();
      erb $$4 = $$1.a();
      ecf $$5 = $$3.m().g();
      erj $$6 = $$4.a($$1, $$3.aj(), $$0.u(), $$5, $$5.d(), $$3.m().i(), $$3.r(), $$3.E(), new dih($$2), 0, $$3, $$0x -> true);
      if (!$$6.b()) {
         throw c.create();
      } else {
         eqt $$7 = $$6.a();
         dih $$8 = new dih(jx.a($$7.h()), jx.a($$7.j()));
         dih $$9 = new dih(jx.a($$7.k()), jx.a($$7.m()));
         a($$3, $$8, $$9);
         dih.a($$8, $$9).forEach($$3x -> $$6.a($$3, $$3.b(), $$5, $$3.C_(), new eqt($$3x.d(), $$3.G_(), $$3x.e(), $$3x.f(), $$3.ao() + 1, $$3x.g()), $$3x));
         String $$10 = $$1.h().a().toString();
         $$0.a(() -> wy.a("commands.place.structure.success", $$10, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(ei $$0, alg $$1, iu $$2, dsz $$3, dri $$4, float $$5, int $$6, boolean $$7) throws CommandSyntaxException {
      arq $$8 = $$0.e();
      eve $$9 = $$8.r();

      Optional<evd> $$10;
      try {
         $$10 = $$9.b($$1);
      } catch (aa var14) {
         throw d.create($$1);
      }

      if ($$10.isEmpty()) {
         throw d.create($$1);
      } else {
         evd $$13 = $$10.get();
         a($$8, new dih($$2), new dih($$2.a($$13.a())));
         euz $$14 = new euz().a($$4).a($$3).b($$7);
         if ($$5 < 1.0F) {
            $$14.b().a(new eug($$5)).a(dyy.b((long)$$6));
         }

         boolean $$15 = $$13.a($$8, $$2, $$2, $$14, dyy.b((long)$$6), 2 | ($$7 ? 816 : 0));
         if (!$$15) {
            throw e.create();
         } else {
            $$0.a(() -> wy.a("commands.place.template.success", wy.a($$1), $$2.u(), $$2.v(), $$2.w()), true);
            return 1;
         }
      }
   }

   private static void a(arq $$0, dih $$1, dih $$2) throws CommandSyntaxException {
      if (dih.a($$1, $$2).filter($$1x -> !$$0.p($$1x.l())).findAny().isPresent()) {
         throw gf.a.create();
      }
   }
}

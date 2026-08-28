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
   private static final SuggestionProvider<ej> f = ($$0, $$1) -> {
      evq $$2 = ((ej)$$0.getSource()).e().r();
      return eo.a($$2.a(), $$1);
   };

   public static void a(CommandDispatcher<ej> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("place")
                        .requires($$0x -> $$0x.c(2)))
                     .then(
                        ek.a("feature")
                           .then(
                              ((RequiredArgumentBuilder)ek.a("feature", fj.a(mh.aL))
                                    .executes($$0x -> a((ej)$$0x.getSource(), fj.a($$0x, "feature"), iv.a((jp)((ej)$$0x.getSource()).d()))))
                                 .then(ek.a("pos", gg.a()).executes($$0x -> a((ej)$$0x.getSource(), fj.a($$0x, "feature"), gg.a($$0x, "pos"))))
                           )
                     ))
                  .then(
                     ek.a("jigsaw")
                        .then(
                           ek.a("pool", fj.a(mh.bf))
                              .then(
                                 ek.a("target", fk.a())
                                    .then(
                                       ((RequiredArgumentBuilder)ek.a("max_depth", IntegerArgumentType.integer(1, 20))
                                             .executes(
                                                $$0x -> a(
                                                      (ej)$$0x.getSource(),
                                                      fj.c($$0x, "pool"),
                                                      fk.a($$0x, "target"),
                                                      IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                      iv.a((jp)((ej)$$0x.getSource()).d())
                                                   )
                                             ))
                                          .then(
                                             ek.a("position", gg.a())
                                                .executes(
                                                   $$0x -> a(
                                                         (ej)$$0x.getSource(),
                                                         fj.c($$0x, "pool"),
                                                         fk.a($$0x, "target"),
                                                         IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                         gg.a($$0x, "position")
                                                      )
                                                )
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  ek.a("structure")
                     .then(
                        ((RequiredArgumentBuilder)ek.a("structure", fj.a(mh.be))
                              .executes($$0x -> b((ej)$$0x.getSource(), fj.b($$0x, "structure"), iv.a((jp)((ej)$$0x.getSource()).d()))))
                           .then(ek.a("pos", gg.a()).executes($$0x -> b((ej)$$0x.getSource(), fj.b($$0x, "structure"), gg.a($$0x, "pos"))))
                     )
               ))
            .then(
               ek.a("template")
                  .then(
                     ((RequiredArgumentBuilder)ek.a("template", fk.a())
                           .suggests(f)
                           .executes(
                              $$0x -> a((ej)$$0x.getSource(), fk.a($$0x, "template"), iv.a((jp)((ej)$$0x.getSource()).d()), dtl.a, dru.a, 1.0F, 0, false)
                           ))
                        .then(
                           ((RequiredArgumentBuilder)ek.a("pos", gg.a())
                                 .executes($$0x -> a((ej)$$0x.getSource(), fk.a($$0x, "template"), gg.a($$0x, "pos"), dtl.a, dru.a, 1.0F, 0, false)))
                              .then(
                                 ((RequiredArgumentBuilder)ek.a("rotation", fy.a())
                                       .executes(
                                          $$0x -> a(
                                                (ej)$$0x.getSource(), fk.a($$0x, "template"), gg.a($$0x, "pos"), fy.a($$0x, "rotation"), dru.a, 1.0F, 0, false
                                             )
                                       ))
                                    .then(
                                       ((RequiredArgumentBuilder)ek.a("mirror", fx.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ej)$$0x.getSource(),
                                                      fk.a($$0x, "template"),
                                                      gg.a($$0x, "pos"),
                                                      fy.a($$0x, "rotation"),
                                                      fx.a($$0x, "mirror"),
                                                      1.0F,
                                                      0,
                                                      false
                                                   )
                                             ))
                                          .then(
                                             ((RequiredArgumentBuilder)ek.a("integrity", FloatArgumentType.floatArg(0.0F, 1.0F))
                                                   .executes(
                                                      $$0x -> a(
                                                            (ej)$$0x.getSource(),
                                                            fk.a($$0x, "template"),
                                                            gg.a($$0x, "pos"),
                                                            fy.a($$0x, "rotation"),
                                                            fx.a($$0x, "mirror"),
                                                            FloatArgumentType.getFloat($$0x, "integrity"),
                                                            0,
                                                            false
                                                         )
                                                   ))
                                                .then(
                                                   ((RequiredArgumentBuilder)ek.a("seed", IntegerArgumentType.integer())
                                                         .executes(
                                                            $$0x -> a(
                                                                  (ej)$$0x.getSource(),
                                                                  fk.a($$0x, "template"),
                                                                  gg.a($$0x, "pos"),
                                                                  fy.a($$0x, "rotation"),
                                                                  fx.a($$0x, "mirror"),
                                                                  FloatArgumentType.getFloat($$0x, "integrity"),
                                                                  IntegerArgumentType.getInteger($$0x, "seed"),
                                                                  false
                                                               )
                                                         ))
                                                      .then(
                                                         ek.a("strict")
                                                            .executes(
                                                               $$0x -> a(
                                                                     (ej)$$0x.getSource(),
                                                                     fk.a($$0x, "template"),
                                                                     gg.a($$0x, "pos"),
                                                                     fy.a($$0x, "rotation"),
                                                                     fx.a($$0x, "mirror"),
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

   public static int a(ej $$0, jf.c<ejk<?, ?>> $$1, iv $$2) throws CommandSyntaxException {
      arq $$3 = $$0.e();
      ejk<?, ?> $$4 = $$1.a();
      dir $$5 = new dir($$2);
      a($$3, new dir($$5.h - 1, $$5.i - 1), new dir($$5.h + 1, $$5.i + 1));
      if (!$$4.a($$3, $$3.m().g(), $$3.C_(), $$2)) {
         throw a.create();
      } else {
         String $$6 = $$1.h().a().toString();
         $$0.a(() -> wy.a("commands.place.feature.success", $$6, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(ej $$0, jf<esx> $$1, alg $$2, int $$3, iv $$4) throws CommandSyntaxException {
      arq $$5 = $$0.e();
      dir $$6 = new dir($$4);
      a($$5, $$6, $$6);
      if (!esr.a($$5, $$1, $$2, $$3, $$4, false)) {
         throw b.create();
      } else {
         $$0.a(() -> wy.a("commands.place.jigsaw.success", $$4.u(), $$4.v(), $$4.w()), true);
         return 1;
      }
   }

   public static int b(ej $$0, jf.c<ern> $$1, iv $$2) throws CommandSyntaxException {
      arq $$3 = $$0.e();
      ern $$4 = $$1.a();
      ecr $$5 = $$3.m().g();
      erv $$6 = $$4.a($$1, $$3.aj(), $$0.u(), $$5, $$5.d(), $$3.m().i(), $$3.r(), $$3.E(), new dir($$2), 0, $$3, $$0x -> true);
      if (!$$6.b()) {
         throw c.create();
      } else {
         erf $$7 = $$6.a();
         dir $$8 = new dir(jy.a($$7.h()), jy.a($$7.j()));
         dir $$9 = new dir(jy.a($$7.k()), jy.a($$7.m()));
         a($$3, $$8, $$9);
         dir.a($$8, $$9).forEach($$3x -> $$6.a($$3, $$3.b(), $$5, $$3.C_(), new erf($$3x.d(), $$3.G_(), $$3x.e(), $$3x.f(), $$3.ao() + 1, $$3x.g()), $$3x));
         String $$10 = $$1.h().a().toString();
         $$0.a(() -> wy.a("commands.place.structure.success", $$10, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(ej $$0, alg $$1, iv $$2, dtl $$3, dru $$4, float $$5, int $$6, boolean $$7) throws CommandSyntaxException {
      arq $$8 = $$0.e();
      evq $$9 = $$8.r();

      Optional<evp> $$10;
      try {
         $$10 = $$9.b($$1);
      } catch (ab var14) {
         throw d.create($$1);
      }

      if ($$10.isEmpty()) {
         throw d.create($$1);
      } else {
         evp $$13 = $$10.get();
         a($$8, new dir($$2), new dir($$2.a($$13.a())));
         evl $$14 = new evl().a($$4).a($$3).b($$7);
         if ($$5 < 1.0F) {
            $$14.b().a(new eus($$5)).a(dzk.b((long)$$6));
         }

         boolean $$15 = $$13.a($$8, $$2, $$2, $$14, dzk.b((long)$$6), 2 | ($$7 ? 816 : 0));
         if (!$$15) {
            throw e.create();
         } else {
            $$0.a(() -> wy.a("commands.place.template.success", wy.a($$1), $$2.u(), $$2.v(), $$2.w()), true);
            return 1;
         }
      }
   }

   private static void a(arq $$0, dir $$1, dir $$2) throws CommandSyntaxException {
      if (dir.a($$1, $$2).filter($$1x -> !$$0.p($$1x.l())).findAny().isPresent()) {
         throw gg.a.create();
      }
   }
}

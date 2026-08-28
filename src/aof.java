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

public class aof {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wv.c("commands.place.feature.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wv.c("commands.place.jigsaw.failed"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wv.c("commands.place.structure.failed"));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wv.b("commands.place.template.invalid", $$0));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wv.c("commands.place.template.failed"));
   private static final SuggestionProvider<ex> f = ($$0, $$1) -> {
      etj $$2 = ((ex)$$0.getSource()).e().r();
      return fc.a($$2.a(), $$1);
   };

   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("place")
                        .requires($$0x -> $$0x.c(2)))
                     .then(
                        ey.a("feature")
                           .then(
                              ((RequiredArgumentBuilder)ey.a("feature", fx.a(me.aP))
                                    .executes($$0x -> a((ex)$$0x.getSource(), fx.a($$0x, "feature"), jj.a((kc)((ex)$$0x.getSource()).d()))))
                                 .then(ey.a("pos", gu.a()).executes($$0x -> a((ex)$$0x.getSource(), fx.a($$0x, "feature"), gu.a($$0x, "pos"))))
                           )
                     ))
                  .then(
                     ey.a("jigsaw")
                        .then(
                           ey.a("pool", fx.a(me.bc))
                              .then(
                                 ey.a("target", fy.a())
                                    .then(
                                       ((RequiredArgumentBuilder)ey.a("max_depth", IntegerArgumentType.integer(1, 20))
                                             .executes(
                                                $$0x -> a(
                                                      (ex)$$0x.getSource(),
                                                      fx.c($$0x, "pool"),
                                                      fy.a($$0x, "target"),
                                                      IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                      jj.a((kc)((ex)$$0x.getSource()).d())
                                                   )
                                             ))
                                          .then(
                                             ey.a("position", gu.a())
                                                .executes(
                                                   $$0x -> a(
                                                         (ex)$$0x.getSource(),
                                                         fx.c($$0x, "pool"),
                                                         fy.a($$0x, "target"),
                                                         IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                         gu.a($$0x, "position")
                                                      )
                                                )
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  ey.a("structure")
                     .then(
                        ((RequiredArgumentBuilder)ey.a("structure", fx.a(me.aZ))
                              .executes($$0x -> b((ex)$$0x.getSource(), fx.b($$0x, "structure"), jj.a((kc)((ex)$$0x.getSource()).d()))))
                           .then(ey.a("pos", gu.a()).executes($$0x -> b((ex)$$0x.getSource(), fx.b($$0x, "structure"), gu.a($$0x, "pos"))))
                     )
               ))
            .then(
               ey.a("template")
                  .then(
                     ((RequiredArgumentBuilder)ey.a("template", fy.a())
                           .suggests(f)
                           .executes(
                              $$0x -> a((ex)$$0x.getSource(), fy.a($$0x, "template"), jj.a((kc)((ex)$$0x.getSource()).d()), drm.a, dpv.a, 1.0F, 0, false)
                           ))
                        .then(
                           ((RequiredArgumentBuilder)ey.a("pos", gu.a())
                                 .executes($$0x -> a((ex)$$0x.getSource(), fy.a($$0x, "template"), gu.a($$0x, "pos"), drm.a, dpv.a, 1.0F, 0, false)))
                              .then(
                                 ((RequiredArgumentBuilder)ey.a("rotation", gm.a())
                                       .executes(
                                          $$0x -> a(
                                                (ex)$$0x.getSource(), fy.a($$0x, "template"), gu.a($$0x, "pos"), gm.a($$0x, "rotation"), dpv.a, 1.0F, 0, false
                                             )
                                       ))
                                    .then(
                                       ((RequiredArgumentBuilder)ey.a("mirror", gl.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ex)$$0x.getSource(),
                                                      fy.a($$0x, "template"),
                                                      gu.a($$0x, "pos"),
                                                      gm.a($$0x, "rotation"),
                                                      gl.a($$0x, "mirror"),
                                                      1.0F,
                                                      0,
                                                      false
                                                   )
                                             ))
                                          .then(
                                             ((RequiredArgumentBuilder)ey.a("integrity", FloatArgumentType.floatArg(0.0F, 1.0F))
                                                   .executes(
                                                      $$0x -> a(
                                                            (ex)$$0x.getSource(),
                                                            fy.a($$0x, "template"),
                                                            gu.a($$0x, "pos"),
                                                            gm.a($$0x, "rotation"),
                                                            gl.a($$0x, "mirror"),
                                                            FloatArgumentType.getFloat($$0x, "integrity"),
                                                            0,
                                                            false
                                                         )
                                                   ))
                                                .then(
                                                   ((RequiredArgumentBuilder)ey.a("seed", IntegerArgumentType.integer())
                                                         .executes(
                                                            $$0x -> a(
                                                                  (ex)$$0x.getSource(),
                                                                  fy.a($$0x, "template"),
                                                                  gu.a($$0x, "pos"),
                                                                  gm.a($$0x, "rotation"),
                                                                  gl.a($$0x, "mirror"),
                                                                  FloatArgumentType.getFloat($$0x, "integrity"),
                                                                  IntegerArgumentType.getInteger($$0x, "seed"),
                                                                  false
                                                               )
                                                         ))
                                                      .then(
                                                         ey.a("strict")
                                                            .executes(
                                                               $$0x -> a(
                                                                     (ex)$$0x.getSource(),
                                                                     fy.a($$0x, "template"),
                                                                     gu.a($$0x, "pos"),
                                                                     gm.a($$0x, "rotation"),
                                                                     gl.a($$0x, "mirror"),
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

   public static int a(ex $$0, js.c<ehd<?, ?>> $$1, jj $$2) throws CommandSyntaxException {
      arn $$3 = $$0.e();
      ehd<?, ?> $$4 = $$1.a();
      dgw $$5 = new dgw($$2);
      a($$3, new dgw($$5.h - 1, $$5.i - 1), new dgw($$5.h + 1, $$5.i + 1));
      if (!$$4.a($$3, $$3.m().g(), $$3.C_(), $$2)) {
         throw a.create();
      } else {
         String $$6 = $$1.h().a().toString();
         $$0.a(() -> wv.a("commands.place.feature.success", $$6, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(ex $$0, js<eqq> $$1, ald $$2, int $$3, jj $$4) throws CommandSyntaxException {
      arn $$5 = $$0.e();
      dgw $$6 = new dgw($$4);
      a($$5, $$6, $$6);
      if (!eqk.a($$5, $$1, $$2, $$3, $$4, false)) {
         throw b.create();
      } else {
         $$0.a(() -> wv.a("commands.place.jigsaw.success", $$4.u(), $$4.v(), $$4.w()), true);
         return 1;
      }
   }

   public static int b(ex $$0, js.c<epg> $$1, jj $$2) throws CommandSyntaxException {
      arn $$3 = $$0.e();
      epg $$4 = $$1.a();
      eak $$5 = $$3.m().g();
      epo $$6 = $$4.a($$1, $$3.aj(), $$0.u(), $$5, $$5.d(), $$3.m().i(), $$3.r(), $$3.E(), new dgw($$2), 0, $$3, $$0x -> true);
      if (!$$6.b()) {
         throw c.create();
      } else {
         eoy $$7 = $$6.a();
         dgw $$8 = new dgw(kl.a($$7.h()), kl.a($$7.j()));
         dgw $$9 = new dgw(kl.a($$7.k()), kl.a($$7.m()));
         a($$3, $$8, $$9);
         dgw.a($$8, $$9).forEach($$3x -> $$6.a($$3, $$3.b(), $$5, $$3.C_(), new eoy($$3x.d(), $$3.G_(), $$3x.e(), $$3x.f(), $$3.ao() + 1, $$3x.g()), $$3x));
         String $$10 = $$1.h().a().toString();
         $$0.a(() -> wv.a("commands.place.structure.success", $$10, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(ex $$0, ald $$1, jj $$2, drm $$3, dpv $$4, float $$5, int $$6, boolean $$7) throws CommandSyntaxException {
      arn $$8 = $$0.e();
      etj $$9 = $$8.r();

      Optional<eti> $$10;
      try {
         $$10 = $$9.b($$1);
      } catch (aa var14) {
         throw d.create($$1);
      }

      if ($$10.isEmpty()) {
         throw d.create($$1);
      } else {
         eti $$13 = $$10.get();
         a($$8, new dgw($$2), new dgw($$2.a($$13.a())));
         ete $$14 = new ete().a($$4).a($$3).b($$7);
         if ($$5 < 1.0F) {
            $$14.b().a(new esl($$5)).a(dxe.b((long)$$6));
         }

         boolean $$15 = $$13.a($$8, $$2, $$2, $$14, dxe.b((long)$$6), 2 | ($$7 ? 304 : 0));
         if (!$$15) {
            throw e.create();
         } else {
            $$0.a(() -> wv.a("commands.place.template.success", wv.a($$1), $$2.u(), $$2.v(), $$2.w()), true);
            return 1;
         }
      }
   }

   private static void a(arn $$0, dgw $$1, dgw $$2) throws CommandSyntaxException {
      if (dgw.a($$1, $$2).filter($$1x -> !$$0.p($$1x.l())).findAny().isPresent()) {
         throw gu.a.create();
      }
   }
}

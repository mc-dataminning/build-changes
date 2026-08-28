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

public class anw {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wp.c("commands.place.feature.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wp.c("commands.place.jigsaw.failed"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wp.c("commands.place.structure.failed"));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wp.b("commands.place.template.invalid", $$0));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wp.c("commands.place.template.failed"));
   private static final SuggestionProvider<ex> f = ($$0, $$1) -> {
      erq $$2 = ((ex)$$0.getSource()).e().r();
      return fc.a($$2.a(), $$1);
   };

   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("place")
                        .requires($$0x -> $$0x.c(2)))
                     .then(
                        ey.a("feature")
                           .then(
                              ((RequiredArgumentBuilder)ey.a("feature", fx.a(mc.aL))
                                    .executes($$0x -> a((ex)$$0x.getSource(), fx.a($$0x, "feature"), ji.a((kb)((ex)$$0x.getSource()).d()))))
                                 .then(ey.a("pos", gt.a()).executes($$0x -> a((ex)$$0x.getSource(), fx.a($$0x, "feature"), gt.a($$0x, "pos"))))
                           )
                     ))
                  .then(
                     ey.a("jigsaw")
                        .then(
                           ey.a("pool", fx.a(mc.aX))
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
                                                      ji.a((kb)((ex)$$0x.getSource()).d())
                                                   )
                                             ))
                                          .then(
                                             ey.a("position", gt.a())
                                                .executes(
                                                   $$0x -> a(
                                                         (ex)$$0x.getSource(),
                                                         fx.c($$0x, "pool"),
                                                         fy.a($$0x, "target"),
                                                         IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                         gt.a($$0x, "position")
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
                        ((RequiredArgumentBuilder)ey.a("structure", fx.a(mc.aU))
                              .executes($$0x -> b((ex)$$0x.getSource(), fx.b($$0x, "structure"), ji.a((kb)((ex)$$0x.getSource()).d()))))
                           .then(ey.a("pos", gt.a()).executes($$0x -> b((ex)$$0x.getSource(), fx.b($$0x, "structure"), gt.a($$0x, "pos"))))
                     )
               ))
            .then(
               ey.a("template")
                  .then(
                     ((RequiredArgumentBuilder)ey.a("template", fy.a())
                           .suggests(f)
                           .executes($$0x -> a((ex)$$0x.getSource(), fy.a($$0x, "template"), ji.a((kb)((ex)$$0x.getSource()).d()), dqf.a, dom.a, 1.0F, 0)))
                        .then(
                           ((RequiredArgumentBuilder)ey.a("pos", gt.a())
                                 .executes($$0x -> a((ex)$$0x.getSource(), fy.a($$0x, "template"), gt.a($$0x, "pos"), dqf.a, dom.a, 1.0F, 0)))
                              .then(
                                 ((RequiredArgumentBuilder)ey.a("rotation", gl.a())
                                       .executes(
                                          $$0x -> a((ex)$$0x.getSource(), fy.a($$0x, "template"), gt.a($$0x, "pos"), gl.a($$0x, "rotation"), dom.a, 1.0F, 0)
                                       ))
                                    .then(
                                       ((RequiredArgumentBuilder)ey.a("mirror", gk.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ex)$$0x.getSource(),
                                                      fy.a($$0x, "template"),
                                                      gt.a($$0x, "pos"),
                                                      gl.a($$0x, "rotation"),
                                                      gk.a($$0x, "mirror"),
                                                      1.0F,
                                                      0
                                                   )
                                             ))
                                          .then(
                                             ((RequiredArgumentBuilder)ey.a("integrity", FloatArgumentType.floatArg(0.0F, 1.0F))
                                                   .executes(
                                                      $$0x -> a(
                                                            (ex)$$0x.getSource(),
                                                            fy.a($$0x, "template"),
                                                            gt.a($$0x, "pos"),
                                                            gl.a($$0x, "rotation"),
                                                            gk.a($$0x, "mirror"),
                                                            FloatArgumentType.getFloat($$0x, "integrity"),
                                                            0
                                                         )
                                                   ))
                                                .then(
                                                   ey.a("seed", IntegerArgumentType.integer())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ex)$$0x.getSource(),
                                                               fy.a($$0x, "template"),
                                                               gt.a($$0x, "pos"),
                                                               gl.a($$0x, "rotation"),
                                                               gk.a($$0x, "mirror"),
                                                               FloatArgumentType.getFloat($$0x, "integrity"),
                                                               IntegerArgumentType.getInteger($$0x, "seed")
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

   public static int a(ex $$0, jr.c<efl<?, ?>> $$1, ji $$2) throws CommandSyntaxException {
      ard $$3 = $$0.e();
      efl<?, ?> $$4 = $$1.a();
      dfp $$5 = new dfp($$2);
      a($$3, new dfp($$5.h - 1, $$5.i - 1), new dfp($$5.h + 1, $$5.i + 1));
      if (!$$4.a($$3, $$3.m().g(), $$3.H_(), $$2)) {
         throw a.create();
      } else {
         String $$6 = $$1.h().a().toString();
         $$0.a(() -> wp.a("commands.place.feature.success", $$6, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(ex $$0, jr<eox> $$1, akv $$2, int $$3, ji $$4) throws CommandSyntaxException {
      ard $$5 = $$0.e();
      dfp $$6 = new dfp($$4);
      a($$5, $$6, $$6);
      if (!eor.a($$5, $$1, $$2, $$3, $$4, false)) {
         throw b.create();
      } else {
         $$0.a(() -> wp.a("commands.place.jigsaw.success", $$4.u(), $$4.v(), $$4.w()), true);
         return 1;
      }
   }

   public static int b(ex $$0, jr.c<enn> $$1, ji $$2) throws CommandSyntaxException {
      ard $$3 = $$0.e();
      enn $$4 = $$1.a();
      dyu $$5 = $$3.m().g();
      env $$6 = $$4.a($$1, $$3.ai(), $$0.u(), $$5, $$5.d(), $$3.m().i(), $$3.r(), $$3.E(), new dfp($$2), 0, $$3, $$0x -> true);
      if (!$$6.b()) {
         throw c.create();
      } else {
         enf $$7 = $$6.a();
         dfp $$8 = new dfp(kk.a($$7.h()), kk.a($$7.j()));
         dfp $$9 = new dfp(kk.a($$7.k()), kk.a($$7.m()));
         a($$3, $$8, $$9);
         dfp.a($$8, $$9).forEach($$3x -> $$6.a($$3, $$3.b(), $$5, $$3.H_(), new enf($$3x.d(), $$3.L_(), $$3x.e(), $$3x.f(), $$3.an() + 1, $$3x.g()), $$3x));
         String $$10 = $$1.h().a().toString();
         $$0.a(() -> wp.a("commands.place.structure.success", $$10, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(ex $$0, akv $$1, ji $$2, dqf $$3, dom $$4, float $$5, int $$6) throws CommandSyntaxException {
      ard $$7 = $$0.e();
      erq $$8 = $$7.r();

      Optional<erp> $$9;
      try {
         $$9 = $$8.b($$1);
      } catch (aa var13) {
         throw d.create($$1);
      }

      if ($$9.isEmpty()) {
         throw d.create($$1);
      } else {
         erp $$12 = $$9.get();
         a($$7, new dfp($$2), new dfp($$2.a($$12.a())));
         erl $$13 = new erl().a($$4).a($$3);
         if ($$5 < 1.0F) {
            $$13.b().a(new eqs($$5)).a(dvs.b((long)$$6));
         }

         boolean $$14 = $$12.a($$7, $$2, $$2, $$13, dvs.b((long)$$6), 2);
         if (!$$14) {
            throw e.create();
         } else {
            $$0.a(() -> wp.a("commands.place.template.success", wp.a($$1), $$2.u(), $$2.v(), $$2.w()), true);
            return 1;
         }
      }
   }

   private static void a(ard $$0, dfp $$1, dfp $$2) throws CommandSyntaxException {
      if (dfp.a($$1, $$2).filter($$1x -> !$$0.p($$1x.l())).findAny().isPresent()) {
         throw gt.a.create();
      }
   }
}

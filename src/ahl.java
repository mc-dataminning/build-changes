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

public class ahl {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(te.c("commands.place.feature.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(te.c("commands.place.jigsaw.failed"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(te.c("commands.place.structure.failed"));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> te.a("commands.place.template.invalid", $$0));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(te.c("commands.place.template.failed"));
   private static final SuggestionProvider<ds> f = ($$0, $$1) -> {
      dyr $$2 = ((ds)$$0.getSource()).e().p();
      return dv.a($$2.a(), $$1);
   };

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("place")
                        .requires($$0x -> $$0x.c(2)))
                     .then(
                        dt.a("feature")
                           .then(
                              ((RequiredArgumentBuilder)dt.a("feature", eq.a(jd.as))
                                    .executes($$0x -> a((ds)$$0x.getSource(), eq.a($$0x, "feature"), gv.a(((ds)$$0x.getSource()).d()))))
                                 .then(dt.a("pos", fj.a()).executes($$0x -> a((ds)$$0x.getSource(), eq.a($$0x, "feature"), fj.a($$0x, "pos"))))
                           )
                     ))
                  .then(
                     dt.a("jigsaw")
                        .then(
                           dt.a("pool", eq.a(jd.aC))
                              .then(
                                 dt.a("target", er.a())
                                    .then(
                                       ((RequiredArgumentBuilder)dt.a("max_depth", IntegerArgumentType.integer(1, 7))
                                             .executes(
                                                $$0x -> a(
                                                      (ds)$$0x.getSource(),
                                                      eq.c($$0x, "pool"),
                                                      er.e($$0x, "target"),
                                                      IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                      gv.a(((ds)$$0x.getSource()).d())
                                                   )
                                             ))
                                          .then(
                                             dt.a("position", fj.a())
                                                .executes(
                                                   $$0x -> a(
                                                         (ds)$$0x.getSource(),
                                                         eq.c($$0x, "pool"),
                                                         er.e($$0x, "target"),
                                                         IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                         fj.a($$0x, "position")
                                                      )
                                                )
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  dt.a("structure")
                     .then(
                        ((RequiredArgumentBuilder)dt.a("structure", eq.a(jd.az))
                              .executes($$0x -> b((ds)$$0x.getSource(), eq.b($$0x, "structure"), gv.a(((ds)$$0x.getSource()).d()))))
                           .then(dt.a("pos", fj.a()).executes($$0x -> b((ds)$$0x.getSource(), eq.b($$0x, "structure"), fj.a($$0x, "pos"))))
                     )
               ))
            .then(
               dt.a("template")
                  .then(
                     ((RequiredArgumentBuilder)dt.a("template", er.a())
                           .suggests(f)
                           .executes($$0x -> a((ds)$$0x.getSource(), er.e($$0x, "template"), gv.a(((ds)$$0x.getSource()).d()), cyw.a, cxf.a, 1.0F, 0)))
                        .then(
                           ((RequiredArgumentBuilder)dt.a("pos", fj.a())
                                 .executes($$0x -> a((ds)$$0x.getSource(), er.e($$0x, "template"), fj.a($$0x, "pos"), cyw.a, cxf.a, 1.0F, 0)))
                              .then(
                                 ((RequiredArgumentBuilder)dt.a("rotation", fb.a())
                                       .executes(
                                          $$0x -> a((ds)$$0x.getSource(), er.e($$0x, "template"), fj.a($$0x, "pos"), fb.a($$0x, "rotation"), cxf.a, 1.0F, 0)
                                       ))
                                    .then(
                                       ((RequiredArgumentBuilder)dt.a("mirror", fa.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ds)$$0x.getSource(),
                                                      er.e($$0x, "template"),
                                                      fj.a($$0x, "pos"),
                                                      fb.a($$0x, "rotation"),
                                                      fa.a($$0x, "mirror"),
                                                      1.0F,
                                                      0
                                                   )
                                             ))
                                          .then(
                                             ((RequiredArgumentBuilder)dt.a("integrity", FloatArgumentType.floatArg(0.0F, 1.0F))
                                                   .executes(
                                                      $$0x -> a(
                                                            (ds)$$0x.getSource(),
                                                            er.e($$0x, "template"),
                                                            fj.a($$0x, "pos"),
                                                            fb.a($$0x, "rotation"),
                                                            fa.a($$0x, "mirror"),
                                                            FloatArgumentType.getFloat($$0x, "integrity"),
                                                            0
                                                         )
                                                   ))
                                                .then(
                                                   dt.a("seed", IntegerArgumentType.integer())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ds)$$0x.getSource(),
                                                               er.e($$0x, "template"),
                                                               fj.a($$0x, "pos"),
                                                               fb.a($$0x, "rotation"),
                                                               fa.a($$0x, "mirror"),
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

   public static int a(ds $$0, hf.c<dmy<?, ?>> $$1, gv $$2) throws CommandSyntaxException {
      aki $$3 = $$0.e();
      dmy<?, ?> $$4 = $$1.a();
      cor $$5 = new cor($$2);
      a($$3, new cor($$5.e - 1, $$5.f - 1), new cor($$5.e + 1, $$5.f + 1));
      if (!$$4.a($$3, $$3.k().g(), $$3.y_(), $$2)) {
         throw a.create();
      } else {
         String $$6 = $$1.g().a().toString();
         $$0.a(() -> te.a("commands.place.feature.success", $$6, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(ds $$0, hf<dwg> $$1, aep $$2, int $$3, gv $$4) throws CommandSyntaxException {
      aki $$5 = $$0.e();
      if (!dwa.a($$5, $$1, $$2, $$3, $$4, false)) {
         throw b.create();
      } else {
         $$0.a(() -> te.a("commands.place.jigsaw.success", $$4.u(), $$4.v(), $$4.w()), true);
         return 1;
      }
   }

   public static int b(ds $$0, hf.c<dux> $$1, gv $$2) throws CommandSyntaxException {
      aki $$3 = $$0.e();
      dux $$4 = $$1.a();
      dgv $$5 = $$3.k().g();
      dvf $$6 = $$4.a($$0.v(), $$5, $$5.c(), $$3.k().i(), $$3.p(), $$3.A(), new cor($$2), 0, $$3, $$0x -> true);
      if (!$$6.b()) {
         throw c.create();
      } else {
         dup $$7 = $$6.a();
         cor $$8 = new cor(hy.a($$7.g()), hy.a($$7.i()));
         cor $$9 = new cor(hy.a($$7.j()), hy.a($$7.l()));
         a($$3, $$8, $$9);
         cor.a($$8, $$9).forEach($$3x -> $$6.a($$3, $$3.a(), $$5, $$3.y_(), new dup($$3x.d(), $$3.C_(), $$3x.e(), $$3x.f(), $$3.aj(), $$3x.g()), $$3x));
         String $$10 = $$1.g().a().toString();
         $$0.a(() -> te.a("commands.place.structure.success", $$10, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(ds $$0, aep $$1, gv $$2, cyw $$3, cxf $$4, float $$5, int $$6) throws CommandSyntaxException {
      aki $$7 = $$0.e();
      dyr $$8 = $$7.p();

      Optional<dyq> $$9;
      try {
         $$9 = $$8.b($$1);
      } catch (z var13) {
         throw d.create($$1);
      }

      if ($$9.isEmpty()) {
         throw d.create($$1);
      } else {
         dyq $$12 = $$9.get();
         a($$7, new cor($$2), new cor($$2.a($$12.a())));
         dym $$13 = new dym().a($$4).a($$3);
         if ($$5 < 1.0F) {
            $$13.b().a(new dxu($$5)).a(ddx.b((long)$$6));
         }

         boolean $$14 = $$12.a($$7, $$2, $$2, $$13, ddx.b((long)$$6), 2);
         if (!$$14) {
            throw e.create();
         } else {
            $$0.a(() -> te.a("commands.place.template.success", $$1, $$2.u(), $$2.v(), $$2.w()), true);
            return 1;
         }
      }
   }

   private static void a(aki $$0, cor $$1, cor $$2) throws CommandSyntaxException {
      if (cor.a($$1, $$2).filter($$1x -> !$$0.o($$1x.l())).findAny().isPresent()) {
         throw fj.a.create();
      }
   }
}

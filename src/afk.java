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

public class afk {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(sw.c("commands.place.feature.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(sw.c("commands.place.jigsaw.failed"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(sw.c("commands.place.structure.failed"));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> sw.a("commands.place.template.invalid", $$0));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(sw.c("commands.place.template.failed"));
   private static final SuggestionProvider<ds> f = ($$0, $$1) -> {
      dvu $$2 = ((ds)$$0.getSource()).e().p();
      return du.a($$2.a(), $$1);
   };

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("place")
                        .requires($$0x -> $$0x.c(2)))
                     .then(
                        dt.a("feature")
                           .then(
                              ((RequiredArgumentBuilder)dt.a("feature", ep.a(jc.as))
                                    .executes($$0x -> a((ds)$$0x.getSource(), ep.a($$0x, "feature"), gu.a(((ds)$$0x.getSource()).d()))))
                                 .then(dt.a("pos", fi.a()).executes($$0x -> a((ds)$$0x.getSource(), ep.a($$0x, "feature"), fi.a($$0x, "pos"))))
                           )
                     ))
                  .then(
                     dt.a("jigsaw")
                        .then(
                           dt.a("pool", ep.a(jc.aC))
                              .then(
                                 dt.a("target", eq.a())
                                    .then(
                                       ((RequiredArgumentBuilder)dt.a("max_depth", IntegerArgumentType.integer(1, 7))
                                             .executes(
                                                $$0x -> a(
                                                      (ds)$$0x.getSource(),
                                                      ep.c($$0x, "pool"),
                                                      eq.e($$0x, "target"),
                                                      IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                      gu.a(((ds)$$0x.getSource()).d())
                                                   )
                                             ))
                                          .then(
                                             dt.a("position", fi.a())
                                                .executes(
                                                   $$0x -> a(
                                                         (ds)$$0x.getSource(),
                                                         ep.c($$0x, "pool"),
                                                         eq.e($$0x, "target"),
                                                         IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                         fi.a($$0x, "position")
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
                        ((RequiredArgumentBuilder)dt.a("structure", ep.a(jc.az))
                              .executes($$0x -> b((ds)$$0x.getSource(), ep.b($$0x, "structure"), gu.a(((ds)$$0x.getSource()).d()))))
                           .then(dt.a("pos", fi.a()).executes($$0x -> b((ds)$$0x.getSource(), ep.b($$0x, "structure"), fi.a($$0x, "pos"))))
                     )
               ))
            .then(
               dt.a("template")
                  .then(
                     ((RequiredArgumentBuilder)dt.a("template", eq.a())
                           .suggests(f)
                           .executes($$0x -> a((ds)$$0x.getSource(), eq.e($$0x, "template"), gu.a(((ds)$$0x.getSource()).d()), cvz.a, cui.a, 1.0F, 0)))
                        .then(
                           ((RequiredArgumentBuilder)dt.a("pos", fi.a())
                                 .executes($$0x -> a((ds)$$0x.getSource(), eq.e($$0x, "template"), fi.a($$0x, "pos"), cvz.a, cui.a, 1.0F, 0)))
                              .then(
                                 ((RequiredArgumentBuilder)dt.a("rotation", fa.a())
                                       .executes(
                                          $$0x -> a((ds)$$0x.getSource(), eq.e($$0x, "template"), fi.a($$0x, "pos"), fa.a($$0x, "rotation"), cui.a, 1.0F, 0)
                                       ))
                                    .then(
                                       ((RequiredArgumentBuilder)dt.a("mirror", ez.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ds)$$0x.getSource(),
                                                      eq.e($$0x, "template"),
                                                      fi.a($$0x, "pos"),
                                                      fa.a($$0x, "rotation"),
                                                      ez.a($$0x, "mirror"),
                                                      1.0F,
                                                      0
                                                   )
                                             ))
                                          .then(
                                             ((RequiredArgumentBuilder)dt.a("integrity", FloatArgumentType.floatArg(0.0F, 1.0F))
                                                   .executes(
                                                      $$0x -> a(
                                                            (ds)$$0x.getSource(),
                                                            eq.e($$0x, "template"),
                                                            fi.a($$0x, "pos"),
                                                            fa.a($$0x, "rotation"),
                                                            ez.a($$0x, "mirror"),
                                                            FloatArgumentType.getFloat($$0x, "integrity"),
                                                            0
                                                         )
                                                   ))
                                                .then(
                                                   dt.a("seed", IntegerArgumentType.integer())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ds)$$0x.getSource(),
                                                               eq.e($$0x, "template"),
                                                               fi.a($$0x, "pos"),
                                                               fa.a($$0x, "rotation"),
                                                               ez.a($$0x, "mirror"),
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

   public static int a(ds $$0, he.c<dkb<?, ?>> $$1, gu $$2) throws CommandSyntaxException {
      aif $$3 = $$0.e();
      dkb<?, ?> $$4 = $$1.a();
      clt $$5 = new clt($$2);
      a($$3, new clt($$5.e - 1, $$5.f - 1), new clt($$5.e + 1, $$5.f + 1));
      if (!$$4.a($$3, $$3.k().g(), $$3.y_(), $$2)) {
         throw a.create();
      } else {
         String $$6 = $$1.g().a().toString();
         $$0.a(() -> sw.a("commands.place.feature.success", $$6, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(ds $$0, he<dtj> $$1, acq $$2, int $$3, gu $$4) throws CommandSyntaxException {
      aif $$5 = $$0.e();
      if (!dtd.a($$5, $$1, $$2, $$3, $$4, false)) {
         throw b.create();
      } else {
         $$0.a(() -> sw.a("commands.place.jigsaw.success", $$4.u(), $$4.v(), $$4.w()), true);
         return 1;
      }
   }

   public static int b(ds $$0, he.c<dsa> $$1, gu $$2) throws CommandSyntaxException {
      aif $$3 = $$0.e();
      dsa $$4 = $$1.a();
      ddy $$5 = $$3.k().g();
      dsi $$6 = $$4.a($$0.v(), $$5, $$5.c(), $$3.k().i(), $$3.p(), $$3.A(), new clt($$2), 0, $$3, $$0x -> true);
      if (!$$6.b()) {
         throw c.create();
      } else {
         drs $$7 = $$6.a();
         clt $$8 = new clt(hx.a($$7.g()), hx.a($$7.i()));
         clt $$9 = new clt(hx.a($$7.j()), hx.a($$7.l()));
         a($$3, $$8, $$9);
         clt.a($$8, $$9).forEach($$3x -> $$6.a($$3, $$3.a(), $$5, $$3.y_(), new drs($$3x.d(), $$3.C_(), $$3x.e(), $$3x.f(), $$3.aj(), $$3x.g()), $$3x));
         String $$10 = $$1.g().a().toString();
         $$0.a(() -> sw.a("commands.place.structure.success", $$10, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(ds $$0, acq $$1, gu $$2, cvz $$3, cui $$4, float $$5, int $$6) throws CommandSyntaxException {
      aif $$7 = $$0.e();
      dvu $$8 = $$7.p();

      Optional<dvt> $$9;
      try {
         $$9 = $$8.b($$1);
      } catch (z var13) {
         throw d.create($$1);
      }

      if ($$9.isEmpty()) {
         throw d.create($$1);
      } else {
         dvt $$12 = $$9.get();
         a($$7, new clt($$2), new clt($$2.a($$12.a())));
         dvp $$13 = new dvp().a($$4).a($$3);
         if ($$5 < 1.0F) {
            $$13.b().a(new dux($$5)).a(dba.b((long)$$6));
         }

         boolean $$14 = $$12.a($$7, $$2, $$2, $$13, dba.b((long)$$6), 2);
         if (!$$14) {
            throw e.create();
         } else {
            $$0.a(() -> sw.a("commands.place.template.success", $$1, $$2.u(), $$2.v(), $$2.w()), true);
            return 1;
         }
      }
   }

   private static void a(aif $$0, clt $$1, clt $$2) throws CommandSyntaxException {
      if (clt.a($$1, $$2).filter($$1x -> !$$0.o($$1x.l())).findAny().isPresent()) {
         throw fi.a.create();
      }
   }
}

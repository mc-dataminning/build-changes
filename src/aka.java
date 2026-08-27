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

public class aka {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vd.c("commands.place.feature.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vd.c("commands.place.jigsaw.failed"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(vd.c("commands.place.structure.failed"));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> vd.b("commands.place.template.invalid", $$0));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(vd.c("commands.place.template.failed"));
   private static final SuggestionProvider<ds> f = ($$0, $$1) -> {
      eda $$2 = ((ds)$$0.getSource()).e().q();
      return dx.a($$2.a(), $$1);
   };

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("place")
                        .requires($$0x -> $$0x.c(2)))
                     .then(
                        dt.a("feature")
                           .then(
                              ((RequiredArgumentBuilder)dt.a("feature", es.a(ke.aw))
                                    .executes($$0x -> a((ds)$$0x.getSource(), es.a($$0x, "feature"), hx.a(((ds)$$0x.getSource()).d()))))
                                 .then(dt.a("pos", fm.a()).executes($$0x -> a((ds)$$0x.getSource(), es.a($$0x, "feature"), fm.a($$0x, "pos"))))
                           )
                     ))
                  .then(
                     dt.a("jigsaw")
                        .then(
                           dt.a("pool", es.a(ke.aG))
                              .then(
                                 dt.a("target", et.a())
                                    .then(
                                       ((RequiredArgumentBuilder)dt.a("max_depth", IntegerArgumentType.integer(1, 7))
                                             .executes(
                                                $$0x -> a(
                                                      (ds)$$0x.getSource(),
                                                      es.c($$0x, "pool"),
                                                      et.e($$0x, "target"),
                                                      IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                      hx.a(((ds)$$0x.getSource()).d())
                                                   )
                                             ))
                                          .then(
                                             dt.a("position", fm.a())
                                                .executes(
                                                   $$0x -> a(
                                                         (ds)$$0x.getSource(),
                                                         es.c($$0x, "pool"),
                                                         et.e($$0x, "target"),
                                                         IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                         fm.a($$0x, "position")
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
                        ((RequiredArgumentBuilder)dt.a("structure", es.a(ke.aD))
                              .executes($$0x -> b((ds)$$0x.getSource(), es.b($$0x, "structure"), hx.a(((ds)$$0x.getSource()).d()))))
                           .then(dt.a("pos", fm.a()).executes($$0x -> b((ds)$$0x.getSource(), es.b($$0x, "structure"), fm.a($$0x, "pos"))))
                     )
               ))
            .then(
               dt.a("template")
                  .then(
                     ((RequiredArgumentBuilder)dt.a("template", et.a())
                           .suggests(f)
                           .executes($$0x -> a((ds)$$0x.getSource(), et.e($$0x, "template"), hx.a(((ds)$$0x.getSource()).d()), dcv.a, dbf.a, 1.0F, 0)))
                        .then(
                           ((RequiredArgumentBuilder)dt.a("pos", fm.a())
                                 .executes($$0x -> a((ds)$$0x.getSource(), et.e($$0x, "template"), fm.a($$0x, "pos"), dcv.a, dbf.a, 1.0F, 0)))
                              .then(
                                 ((RequiredArgumentBuilder)dt.a("rotation", fe.a())
                                       .executes(
                                          $$0x -> a((ds)$$0x.getSource(), et.e($$0x, "template"), fm.a($$0x, "pos"), fe.a($$0x, "rotation"), dbf.a, 1.0F, 0)
                                       ))
                                    .then(
                                       ((RequiredArgumentBuilder)dt.a("mirror", fd.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ds)$$0x.getSource(),
                                                      et.e($$0x, "template"),
                                                      fm.a($$0x, "pos"),
                                                      fe.a($$0x, "rotation"),
                                                      fd.a($$0x, "mirror"),
                                                      1.0F,
                                                      0
                                                   )
                                             ))
                                          .then(
                                             ((RequiredArgumentBuilder)dt.a("integrity", FloatArgumentType.floatArg(0.0F, 1.0F))
                                                   .executes(
                                                      $$0x -> a(
                                                            (ds)$$0x.getSource(),
                                                            et.e($$0x, "template"),
                                                            fm.a($$0x, "pos"),
                                                            fe.a($$0x, "rotation"),
                                                            fd.a($$0x, "mirror"),
                                                            FloatArgumentType.getFloat($$0x, "integrity"),
                                                            0
                                                         )
                                                   ))
                                                .then(
                                                   dt.a("seed", IntegerArgumentType.integer())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ds)$$0x.getSource(),
                                                               et.e($$0x, "template"),
                                                               fm.a($$0x, "pos"),
                                                               fe.a($$0x, "rotation"),
                                                               fd.a($$0x, "mirror"),
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

   public static int a(ds $$0, ih.c<dra<?, ?>> $$1, hx $$2) throws CommandSyntaxException {
      amz $$3 = $$0.e();
      dra<?, ?> $$4 = $$1.a();
      csp $$5 = new csp($$2);
      a($$3, new csp($$5.e - 1, $$5.f - 1), new csp($$5.e + 1, $$5.f + 1));
      if (!$$4.a($$3, $$3.l().g(), $$3.F_(), $$2)) {
         throw a.create();
      } else {
         String $$6 = $$1.g().a().toString();
         $$0.a(() -> vd.a("commands.place.feature.success", $$6, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(ds $$0, ih<eai> $$1, ahd $$2, int $$3, hx $$4) throws CommandSyntaxException {
      amz $$5 = $$0.e();
      if (!eac.a($$5, $$1, $$2, $$3, $$4, false)) {
         throw b.create();
      } else {
         $$0.a(() -> vd.a("commands.place.jigsaw.success", $$4.u(), $$4.v(), $$4.w()), true);
         return 1;
      }
   }

   public static int b(ds $$0, ih.c<dyz> $$1, hx $$2) throws CommandSyntaxException {
      amz $$3 = $$0.e();
      dyz $$4 = $$1.a();
      dkx $$5 = $$3.l().g();
      dzh $$6 = $$4.a($$0.v(), $$5, $$5.c(), $$3.l().i(), $$3.q(), $$3.C(), new csp($$2), 0, $$3, $$0x -> true);
      if (!$$6.b()) {
         throw c.create();
      } else {
         dyr $$7 = $$6.a();
         csp $$8 = new csp(iz.a($$7.h()), iz.a($$7.j()));
         csp $$9 = new csp(iz.a($$7.k()), iz.a($$7.m()));
         a($$3, $$8, $$9);
         csp.a($$8, $$9).forEach($$3x -> $$6.a($$3, $$3.a(), $$5, $$3.F_(), new dyr($$3x.d(), $$3.J_(), $$3x.e(), $$3x.f(), $$3.al(), $$3x.g()), $$3x));
         String $$10 = $$1.g().a().toString();
         $$0.a(() -> vd.a("commands.place.structure.success", $$10, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(ds $$0, ahd $$1, hx $$2, dcv $$3, dbf $$4, float $$5, int $$6) throws CommandSyntaxException {
      amz $$7 = $$0.e();
      eda $$8 = $$7.q();

      Optional<ecz> $$9;
      try {
         $$9 = $$8.b($$1);
      } catch (z var13) {
         throw d.create($$1);
      }

      if ($$9.isEmpty()) {
         throw d.create($$1);
      } else {
         ecz $$12 = $$9.get();
         a($$7, new csp($$2), new csp($$2.a($$12.a())));
         ecv $$13 = new ecv().a($$4).a($$3);
         if ($$5 < 1.0F) {
            $$13.b().a(new ecd($$5)).a(dic.b((long)$$6));
         }

         boolean $$14 = $$12.a($$7, $$2, $$2, $$13, dic.b((long)$$6), 2);
         if (!$$14) {
            throw e.create();
         } else {
            $$0.a(() -> vd.a("commands.place.template.success", vd.a($$1), $$2.u(), $$2.v(), $$2.w()), true);
            return 1;
         }
      }
   }

   private static void a(amz $$0, csp $$1, csp $$2) throws CommandSyntaxException {
      if (csp.a($$1, $$2).filter($$1x -> !$$0.p($$1x.l())).findAny().isPresent()) {
         throw fm.a.create();
      }
   }
}

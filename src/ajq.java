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

public class ajq {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vb.c("commands.place.feature.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vb.c("commands.place.jigsaw.failed"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(vb.c("commands.place.structure.failed"));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> vb.b("commands.place.template.invalid", $$0));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(vb.c("commands.place.template.failed"));
   private static final SuggestionProvider<ds> f = ($$0, $$1) -> {
      ecp $$2 = ((ds)$$0.getSource()).e().p();
      return dw.a($$2.a(), $$1);
   };

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("place")
                        .requires($$0x -> $$0x.c(2)))
                     .then(
                        dt.a("feature")
                           .then(
                              ((RequiredArgumentBuilder)dt.a("feature", er.a(kc.av))
                                    .executes($$0x -> a((ds)$$0x.getSource(), er.a($$0x, "feature"), hv.a(((ds)$$0x.getSource()).d()))))
                                 .then(dt.a("pos", fk.a()).executes($$0x -> a((ds)$$0x.getSource(), er.a($$0x, "feature"), fk.a($$0x, "pos"))))
                           )
                     ))
                  .then(
                     dt.a("jigsaw")
                        .then(
                           dt.a("pool", er.a(kc.aF))
                              .then(
                                 dt.a("target", es.a())
                                    .then(
                                       ((RequiredArgumentBuilder)dt.a("max_depth", IntegerArgumentType.integer(1, 7))
                                             .executes(
                                                $$0x -> a(
                                                      (ds)$$0x.getSource(),
                                                      er.c($$0x, "pool"),
                                                      es.e($$0x, "target"),
                                                      IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                      hv.a(((ds)$$0x.getSource()).d())
                                                   )
                                             ))
                                          .then(
                                             dt.a("position", fk.a())
                                                .executes(
                                                   $$0x -> a(
                                                         (ds)$$0x.getSource(),
                                                         er.c($$0x, "pool"),
                                                         es.e($$0x, "target"),
                                                         IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                         fk.a($$0x, "position")
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
                        ((RequiredArgumentBuilder)dt.a("structure", er.a(kc.aC))
                              .executes($$0x -> b((ds)$$0x.getSource(), er.b($$0x, "structure"), hv.a(((ds)$$0x.getSource()).d()))))
                           .then(dt.a("pos", fk.a()).executes($$0x -> b((ds)$$0x.getSource(), er.b($$0x, "structure"), fk.a($$0x, "pos"))))
                     )
               ))
            .then(
               dt.a("template")
                  .then(
                     ((RequiredArgumentBuilder)dt.a("template", es.a())
                           .suggests(f)
                           .executes($$0x -> a((ds)$$0x.getSource(), es.e($$0x, "template"), hv.a(((ds)$$0x.getSource()).d()), dcl.a, dav.a, 1.0F, 0)))
                        .then(
                           ((RequiredArgumentBuilder)dt.a("pos", fk.a())
                                 .executes($$0x -> a((ds)$$0x.getSource(), es.e($$0x, "template"), fk.a($$0x, "pos"), dcl.a, dav.a, 1.0F, 0)))
                              .then(
                                 ((RequiredArgumentBuilder)dt.a("rotation", fc.a())
                                       .executes(
                                          $$0x -> a((ds)$$0x.getSource(), es.e($$0x, "template"), fk.a($$0x, "pos"), fc.a($$0x, "rotation"), dav.a, 1.0F, 0)
                                       ))
                                    .then(
                                       ((RequiredArgumentBuilder)dt.a("mirror", fb.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ds)$$0x.getSource(),
                                                      es.e($$0x, "template"),
                                                      fk.a($$0x, "pos"),
                                                      fc.a($$0x, "rotation"),
                                                      fb.a($$0x, "mirror"),
                                                      1.0F,
                                                      0
                                                   )
                                             ))
                                          .then(
                                             ((RequiredArgumentBuilder)dt.a("integrity", FloatArgumentType.floatArg(0.0F, 1.0F))
                                                   .executes(
                                                      $$0x -> a(
                                                            (ds)$$0x.getSource(),
                                                            es.e($$0x, "template"),
                                                            fk.a($$0x, "pos"),
                                                            fc.a($$0x, "rotation"),
                                                            fb.a($$0x, "mirror"),
                                                            FloatArgumentType.getFloat($$0x, "integrity"),
                                                            0
                                                         )
                                                   ))
                                                .then(
                                                   dt.a("seed", IntegerArgumentType.integer())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ds)$$0x.getSource(),
                                                               es.e($$0x, "template"),
                                                               fk.a($$0x, "pos"),
                                                               fc.a($$0x, "rotation"),
                                                               fb.a($$0x, "mirror"),
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

   public static int a(ds $$0, ie.c<dqp<?, ?>> $$1, hv $$2) throws CommandSyntaxException {
      amp $$3 = $$0.e();
      dqp<?, ?> $$4 = $$1.a();
      csf $$5 = new csf($$2);
      a($$3, new csf($$5.e - 1, $$5.f - 1), new csf($$5.e + 1, $$5.f + 1));
      if (!$$4.a($$3, $$3.k().g(), $$3.F_(), $$2)) {
         throw a.create();
      } else {
         String $$6 = $$1.g().a().toString();
         $$0.a(() -> vb.a("commands.place.feature.success", $$6, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(ds $$0, ie<dzx> $$1, agt $$2, int $$3, hv $$4) throws CommandSyntaxException {
      amp $$5 = $$0.e();
      if (!dzr.a($$5, $$1, $$2, $$3, $$4, false)) {
         throw b.create();
      } else {
         $$0.a(() -> vb.a("commands.place.jigsaw.success", $$4.u(), $$4.v(), $$4.w()), true);
         return 1;
      }
   }

   public static int b(ds $$0, ie.c<dyo> $$1, hv $$2) throws CommandSyntaxException {
      amp $$3 = $$0.e();
      dyo $$4 = $$1.a();
      dkm $$5 = $$3.k().g();
      dyw $$6 = $$4.a($$0.v(), $$5, $$5.c(), $$3.k().i(), $$3.p(), $$3.B(), new csf($$2), 0, $$3, $$0x -> true);
      if (!$$6.b()) {
         throw c.create();
      } else {
         dyg $$7 = $$6.a();
         csf $$8 = new csf(ix.a($$7.h()), ix.a($$7.j()));
         csf $$9 = new csf(ix.a($$7.k()), ix.a($$7.m()));
         a($$3, $$8, $$9);
         csf.a($$8, $$9).forEach($$3x -> $$6.a($$3, $$3.a(), $$5, $$3.F_(), new dyg($$3x.d(), $$3.J_(), $$3x.e(), $$3x.f(), $$3.ak(), $$3x.g()), $$3x));
         String $$10 = $$1.g().a().toString();
         $$0.a(() -> vb.a("commands.place.structure.success", $$10, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(ds $$0, agt $$1, hv $$2, dcl $$3, dav $$4, float $$5, int $$6) throws CommandSyntaxException {
      amp $$7 = $$0.e();
      ecp $$8 = $$7.p();

      Optional<eco> $$9;
      try {
         $$9 = $$8.b($$1);
      } catch (z var13) {
         throw d.create($$1);
      }

      if ($$9.isEmpty()) {
         throw d.create($$1);
      } else {
         eco $$12 = $$9.get();
         a($$7, new csf($$2), new csf($$2.a($$12.a())));
         eck $$13 = new eck().a($$4).a($$3);
         if ($$5 < 1.0F) {
            $$13.b().a(new ebs($$5)).a(dhr.b((long)$$6));
         }

         boolean $$14 = $$12.a($$7, $$2, $$2, $$13, dhr.b((long)$$6), 2);
         if (!$$14) {
            throw e.create();
         } else {
            $$0.a(() -> vb.a("commands.place.template.success", vb.a($$1), $$2.u(), $$2.v(), $$2.w()), true);
            return 1;
         }
      }
   }

   private static void a(amp $$0, csf $$1, csf $$2) throws CommandSyntaxException {
      if (csf.a($$1, $$2).filter($$1x -> !$$0.o($$1x.l())).findAny().isPresent()) {
         throw fk.a.create();
      }
   }
}

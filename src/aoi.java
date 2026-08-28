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
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xi.c("commands.place.feature.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xi.c("commands.place.jigsaw.failed"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xi.c("commands.place.structure.failed"));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xi.b("commands.place.template.invalid", $$0));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xi.c("commands.place.template.failed"));
   private static final SuggestionProvider<ew> f = ($$0, $$1) -> {
      eqa $$2 = ((ew)$$0.getSource()).e().q();
      return fb.a($$2.a(), $$1);
   };

   public static void a(CommandDispatcher<ew> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("place")
                        .requires($$0x -> $$0x.c(2)))
                     .then(
                        ex.a("feature")
                           .then(
                              ((RequiredArgumentBuilder)ex.a("feature", fw.a(lz.aJ))
                                    .executes($$0x -> a((ew)$$0x.getSource(), fw.a($$0x, "feature"), jh.a((ka)((ew)$$0x.getSource()).d()))))
                                 .then(ex.a("pos", gs.a()).executes($$0x -> a((ew)$$0x.getSource(), fw.a($$0x, "feature"), gs.a($$0x, "pos"))))
                           )
                     ))
                  .then(
                     ex.a("jigsaw")
                        .then(
                           ex.a("pool", fw.a(lz.aV))
                              .then(
                                 ex.a("target", fx.a())
                                    .then(
                                       ((RequiredArgumentBuilder)ex.a("max_depth", IntegerArgumentType.integer(1, 20))
                                             .executes(
                                                $$0x -> a(
                                                      (ew)$$0x.getSource(),
                                                      fw.c($$0x, "pool"),
                                                      fx.c($$0x, "target"),
                                                      IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                      jh.a((ka)((ew)$$0x.getSource()).d())
                                                   )
                                             ))
                                          .then(
                                             ex.a("position", gs.a())
                                                .executes(
                                                   $$0x -> a(
                                                         (ew)$$0x.getSource(),
                                                         fw.c($$0x, "pool"),
                                                         fx.c($$0x, "target"),
                                                         IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                         gs.a($$0x, "position")
                                                      )
                                                )
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  ex.a("structure")
                     .then(
                        ((RequiredArgumentBuilder)ex.a("structure", fw.a(lz.aS))
                              .executes($$0x -> b((ew)$$0x.getSource(), fw.b($$0x, "structure"), jh.a((ka)((ew)$$0x.getSource()).d()))))
                           .then(ex.a("pos", gs.a()).executes($$0x -> b((ew)$$0x.getSource(), fw.b($$0x, "structure"), gs.a($$0x, "pos"))))
                     )
               ))
            .then(
               ex.a("template")
                  .then(
                     ((RequiredArgumentBuilder)ex.a("template", fx.a())
                           .suggests(f)
                           .executes($$0x -> a((ew)$$0x.getSource(), fx.c($$0x, "template"), jh.a((ka)((ew)$$0x.getSource()).d()), dor.a, dna.a, 1.0F, 0)))
                        .then(
                           ((RequiredArgumentBuilder)ex.a("pos", gs.a())
                                 .executes($$0x -> a((ew)$$0x.getSource(), fx.c($$0x, "template"), gs.a($$0x, "pos"), dor.a, dna.a, 1.0F, 0)))
                              .then(
                                 ((RequiredArgumentBuilder)ex.a("rotation", gk.a())
                                       .executes(
                                          $$0x -> a((ew)$$0x.getSource(), fx.c($$0x, "template"), gs.a($$0x, "pos"), gk.a($$0x, "rotation"), dna.a, 1.0F, 0)
                                       ))
                                    .then(
                                       ((RequiredArgumentBuilder)ex.a("mirror", gj.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ew)$$0x.getSource(),
                                                      fx.c($$0x, "template"),
                                                      gs.a($$0x, "pos"),
                                                      gk.a($$0x, "rotation"),
                                                      gj.a($$0x, "mirror"),
                                                      1.0F,
                                                      0
                                                   )
                                             ))
                                          .then(
                                             ((RequiredArgumentBuilder)ex.a("integrity", FloatArgumentType.floatArg(0.0F, 1.0F))
                                                   .executes(
                                                      $$0x -> a(
                                                            (ew)$$0x.getSource(),
                                                            fx.c($$0x, "template"),
                                                            gs.a($$0x, "pos"),
                                                            gk.a($$0x, "rotation"),
                                                            gj.a($$0x, "mirror"),
                                                            FloatArgumentType.getFloat($$0x, "integrity"),
                                                            0
                                                         )
                                                   ))
                                                .then(
                                                   ex.a("seed", IntegerArgumentType.integer())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ew)$$0x.getSource(),
                                                               fx.c($$0x, "template"),
                                                               gs.a($$0x, "pos"),
                                                               gk.a($$0x, "rotation"),
                                                               gj.a($$0x, "mirror"),
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

   public static int a(ew $$0, jq.c<edx<?, ?>> $$1, jh $$2) throws CommandSyntaxException {
      arn $$3 = $$0.e();
      edx<?, ?> $$4 = $$1.a();
      deh $$5 = new deh($$2);
      a($$3, new deh($$5.g - 1, $$5.h - 1), new deh($$5.g + 1, $$5.h + 1));
      if (!$$4.a($$3, $$3.l().g(), $$3.E_(), $$2)) {
         throw a.create();
      } else {
         String $$6 = $$1.h().a().toString();
         $$0.a(() -> xi.a("commands.place.feature.success", $$6, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(ew $$0, jq<enh> $$1, ali $$2, int $$3, jh $$4) throws CommandSyntaxException {
      arn $$5 = $$0.e();
      deh $$6 = new deh($$4);
      a($$5, $$6, $$6);
      if (!enb.a($$5, $$1, $$2, $$3, $$4, false)) {
         throw b.create();
      } else {
         $$0.a(() -> xi.a("commands.place.jigsaw.success", $$4.u(), $$4.v(), $$4.w()), true);
         return 1;
      }
   }

   public static int b(ew $$0, jq.c<elx> $$1, jh $$2) throws CommandSyntaxException {
      arn $$3 = $$0.e();
      elx $$4 = $$1.a();
      dxg $$5 = $$3.l().g();
      emf $$6 = $$4.a($$0.v(), $$5, $$5.d(), $$3.l().i(), $$3.q(), $$3.C(), new deh($$2), 0, $$3, $$0x -> true);
      if (!$$6.b()) {
         throw c.create();
      } else {
         elp $$7 = $$6.a();
         deh $$8 = new deh(kj.a($$7.h()), kj.a($$7.j()));
         deh $$9 = new deh(kj.a($$7.k()), kj.a($$7.m()));
         a($$3, $$8, $$9);
         deh.a($$8, $$9).forEach($$3x -> $$6.a($$3, $$3.a(), $$5, $$3.E_(), new elp($$3x.d(), $$3.I_(), $$3x.e(), $$3x.f(), $$3.al() + 1, $$3x.g()), $$3x));
         String $$10 = $$1.h().a().toString();
         $$0.a(() -> xi.a("commands.place.structure.success", $$10, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(ew $$0, ali $$1, jh $$2, dor $$3, dna $$4, float $$5, int $$6) throws CommandSyntaxException {
      arn $$7 = $$0.e();
      eqa $$8 = $$7.q();

      Optional<epz> $$9;
      try {
         $$9 = $$8.b($$1);
      } catch (aa var13) {
         throw d.create($$1);
      }

      if ($$9.isEmpty()) {
         throw d.create($$1);
      } else {
         epz $$12 = $$9.get();
         a($$7, new deh($$2), new deh($$2.a($$12.a())));
         epv $$13 = new epv().a($$4).a($$3);
         if ($$5 < 1.0F) {
            $$13.b().a(new epc($$5)).a(dud.b((long)$$6));
         }

         boolean $$14 = $$12.a($$7, $$2, $$2, $$13, dud.b((long)$$6), 2);
         if (!$$14) {
            throw e.create();
         } else {
            $$0.a(() -> xi.a("commands.place.template.success", xi.a($$1), $$2.u(), $$2.v(), $$2.w()), true);
            return 1;
         }
      }
   }

   private static void a(arn $$0, deh $$1, deh $$2) throws CommandSyntaxException {
      if (deh.a($$1, $$2).filter($$1x -> !$$0.p($$1x.l())).findAny().isPresent()) {
         throw gs.a.create();
      }
   }
}

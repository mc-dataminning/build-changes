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

public class ajj {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(uv.c("commands.place.feature.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(uv.c("commands.place.jigsaw.failed"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(uv.c("commands.place.structure.failed"));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> uv.b("commands.place.template.invalid", $$0));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(uv.c("commands.place.template.failed"));
   private static final SuggestionProvider<du> f = ($$0, $$1) -> {
      ebn $$2 = ((du)$$0.getSource()).e().p();
      return dy.a($$2.a(), $$1);
   };

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("place")
                        .requires($$0x -> $$0x.c(2)))
                     .then(
                        dv.a("feature")
                           .then(
                              ((RequiredArgumentBuilder)dv.a("feature", et.a(kd.au))
                                    .executes($$0x -> a((du)$$0x.getSource(), et.a($$0x, "feature"), hx.a(((du)$$0x.getSource()).d()))))
                                 .then(dv.a("pos", fm.a()).executes($$0x -> a((du)$$0x.getSource(), et.a($$0x, "feature"), fm.a($$0x, "pos"))))
                           )
                     ))
                  .then(
                     dv.a("jigsaw")
                        .then(
                           dv.a("pool", et.a(kd.aE))
                              .then(
                                 dv.a("target", eu.a())
                                    .then(
                                       ((RequiredArgumentBuilder)dv.a("max_depth", IntegerArgumentType.integer(1, 7))
                                             .executes(
                                                $$0x -> a(
                                                      (du)$$0x.getSource(),
                                                      et.c($$0x, "pool"),
                                                      eu.e($$0x, "target"),
                                                      IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                      hx.a(((du)$$0x.getSource()).d())
                                                   )
                                             ))
                                          .then(
                                             dv.a("position", fm.a())
                                                .executes(
                                                   $$0x -> a(
                                                         (du)$$0x.getSource(),
                                                         et.c($$0x, "pool"),
                                                         eu.e($$0x, "target"),
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
                  dv.a("structure")
                     .then(
                        ((RequiredArgumentBuilder)dv.a("structure", et.a(kd.aB))
                              .executes($$0x -> b((du)$$0x.getSource(), et.b($$0x, "structure"), hx.a(((du)$$0x.getSource()).d()))))
                           .then(dv.a("pos", fm.a()).executes($$0x -> b((du)$$0x.getSource(), et.b($$0x, "structure"), fm.a($$0x, "pos"))))
                     )
               ))
            .then(
               dv.a("template")
                  .then(
                     ((RequiredArgumentBuilder)dv.a("template", eu.a())
                           .suggests(f)
                           .executes($$0x -> a((du)$$0x.getSource(), eu.e($$0x, "template"), hx.a(((du)$$0x.getSource()).d()), dbr.a, dab.a, 1.0F, 0)))
                        .then(
                           ((RequiredArgumentBuilder)dv.a("pos", fm.a())
                                 .executes($$0x -> a((du)$$0x.getSource(), eu.e($$0x, "template"), fm.a($$0x, "pos"), dbr.a, dab.a, 1.0F, 0)))
                              .then(
                                 ((RequiredArgumentBuilder)dv.a("rotation", fe.a())
                                       .executes(
                                          $$0x -> a((du)$$0x.getSource(), eu.e($$0x, "template"), fm.a($$0x, "pos"), fe.a($$0x, "rotation"), dab.a, 1.0F, 0)
                                       ))
                                    .then(
                                       ((RequiredArgumentBuilder)dv.a("mirror", fd.a())
                                             .executes(
                                                $$0x -> a(
                                                      (du)$$0x.getSource(),
                                                      eu.e($$0x, "template"),
                                                      fm.a($$0x, "pos"),
                                                      fe.a($$0x, "rotation"),
                                                      fd.a($$0x, "mirror"),
                                                      1.0F,
                                                      0
                                                   )
                                             ))
                                          .then(
                                             ((RequiredArgumentBuilder)dv.a("integrity", FloatArgumentType.floatArg(0.0F, 1.0F))
                                                   .executes(
                                                      $$0x -> a(
                                                            (du)$$0x.getSource(),
                                                            eu.e($$0x, "template"),
                                                            fm.a($$0x, "pos"),
                                                            fe.a($$0x, "rotation"),
                                                            fd.a($$0x, "mirror"),
                                                            FloatArgumentType.getFloat($$0x, "integrity"),
                                                            0
                                                         )
                                                   ))
                                                .then(
                                                   dv.a("seed", IntegerArgumentType.integer())
                                                      .executes(
                                                         $$0x -> a(
                                                               (du)$$0x.getSource(),
                                                               eu.e($$0x, "template"),
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

   public static int a(du $$0, ig.c<dpn<?, ?>> $$1, hx $$2) throws CommandSyntaxException {
      ami $$3 = $$0.e();
      dpn<?, ?> $$4 = $$1.a();
      crm $$5 = new crm($$2);
      a($$3, new crm($$5.e - 1, $$5.f - 1), new crm($$5.e + 1, $$5.f + 1));
      if (!$$4.a($$3, $$3.k().g(), $$3.F_(), $$2)) {
         throw a.create();
      } else {
         String $$6 = $$1.g().a().toString();
         $$0.a(() -> uv.a("commands.place.feature.success", $$6, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(du $$0, ig<dyv> $$1, agm $$2, int $$3, hx $$4) throws CommandSyntaxException {
      ami $$5 = $$0.e();
      if (!dyp.a($$5, $$1, $$2, $$3, $$4, false)) {
         throw b.create();
      } else {
         $$0.a(() -> uv.a("commands.place.jigsaw.success", $$4.u(), $$4.v(), $$4.w()), true);
         return 1;
      }
   }

   public static int b(du $$0, ig.c<dxm> $$1, hx $$2) throws CommandSyntaxException {
      ami $$3 = $$0.e();
      dxm $$4 = $$1.a();
      djk $$5 = $$3.k().g();
      dxu $$6 = $$4.a($$0.v(), $$5, $$5.c(), $$3.k().i(), $$3.p(), $$3.B(), new crm($$2), 0, $$3, $$0x -> true);
      if (!$$6.b()) {
         throw c.create();
      } else {
         dxe $$7 = $$6.a();
         crm $$8 = new crm(iy.a($$7.h()), iy.a($$7.j()));
         crm $$9 = new crm(iy.a($$7.k()), iy.a($$7.m()));
         a($$3, $$8, $$9);
         crm.a($$8, $$9).forEach($$3x -> $$6.a($$3, $$3.a(), $$5, $$3.F_(), new dxe($$3x.d(), $$3.J_(), $$3x.e(), $$3x.f(), $$3.ak(), $$3x.g()), $$3x));
         String $$10 = $$1.g().a().toString();
         $$0.a(() -> uv.a("commands.place.structure.success", $$10, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(du $$0, agm $$1, hx $$2, dbr $$3, dab $$4, float $$5, int $$6) throws CommandSyntaxException {
      ami $$7 = $$0.e();
      ebn $$8 = $$7.p();

      Optional<ebm> $$9;
      try {
         $$9 = $$8.b($$1);
      } catch (z var13) {
         throw d.create($$1);
      }

      if ($$9.isEmpty()) {
         throw d.create($$1);
      } else {
         ebm $$12 = $$9.get();
         a($$7, new crm($$2), new crm($$2.a($$12.a())));
         ebi $$13 = new ebi().a($$4).a($$3);
         if ($$5 < 1.0F) {
            $$13.b().a(new eaq($$5)).a(dgw.b((long)$$6));
         }

         boolean $$14 = $$12.a($$7, $$2, $$2, $$13, dgw.b((long)$$6), 2);
         if (!$$14) {
            throw e.create();
         } else {
            $$0.a(() -> uv.a("commands.place.template.success", uv.a($$1), $$2.u(), $$2.v(), $$2.w()), true);
            return 1;
         }
      }
   }

   private static void a(ami $$0, crm $$1, crm $$2) throws CommandSyntaxException {
      if (crm.a($$1, $$2).filter($$1x -> !$$0.o($$1x.l())).findAny().isPresent()) {
         throw fm.a.create();
      }
   }
}

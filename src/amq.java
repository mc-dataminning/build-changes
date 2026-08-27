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

public class amq {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wg.c("commands.place.feature.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wg.c("commands.place.jigsaw.failed"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wg.c("commands.place.structure.failed"));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wg.b("commands.place.template.invalid", $$0));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wg.c("commands.place.template.failed"));
   private static final SuggestionProvider<du> f = ($$0, $$1) -> {
      eji $$2 = ((du)$$0.getSource()).e().q();
      return dz.a($$2.a(), $$1);
   };

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("place")
                        .requires($$0x -> $$0x.c(2)))
                     .then(
                        dv.a("feature")
                           .then(
                              ((RequiredArgumentBuilder)dv.a("feature", eu.a(ks.ay))
                                    .executes($$0x -> a((du)$$0x.getSource(), eu.a($$0x, "feature"), ib.a(((du)$$0x.getSource()).d()))))
                                 .then(dv.a("pos", fo.a()).executes($$0x -> a((du)$$0x.getSource(), eu.a($$0x, "feature"), fo.a($$0x, "pos"))))
                           )
                     ))
                  .then(
                     dv.a("jigsaw")
                        .then(
                           dv.a("pool", eu.a(ks.aI))
                              .then(
                                 dv.a("target", ev.a())
                                    .then(
                                       ((RequiredArgumentBuilder)dv.a("max_depth", IntegerArgumentType.integer(1, 20))
                                             .executes(
                                                $$0x -> a(
                                                      (du)$$0x.getSource(),
                                                      eu.c($$0x, "pool"),
                                                      ev.e($$0x, "target"),
                                                      IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                      ib.a(((du)$$0x.getSource()).d())
                                                   )
                                             ))
                                          .then(
                                             dv.a("position", fo.a())
                                                .executes(
                                                   $$0x -> a(
                                                         (du)$$0x.getSource(),
                                                         eu.c($$0x, "pool"),
                                                         ev.e($$0x, "target"),
                                                         IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                         fo.a($$0x, "position")
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
                        ((RequiredArgumentBuilder)dv.a("structure", eu.a(ks.aF))
                              .executes($$0x -> b((du)$$0x.getSource(), eu.b($$0x, "structure"), ib.a(((du)$$0x.getSource()).d()))))
                           .then(dv.a("pos", fo.a()).executes($$0x -> b((du)$$0x.getSource(), eu.b($$0x, "structure"), fo.a($$0x, "pos"))))
                     )
               ))
            .then(
               dv.a("template")
                  .then(
                     ((RequiredArgumentBuilder)dv.a("template", ev.a())
                           .suggests(f)
                           .executes($$0x -> a((du)$$0x.getSource(), ev.e($$0x, "template"), ib.a(((du)$$0x.getSource()).d()), dik.a, dgu.a, 1.0F, 0)))
                        .then(
                           ((RequiredArgumentBuilder)dv.a("pos", fo.a())
                                 .executes($$0x -> a((du)$$0x.getSource(), ev.e($$0x, "template"), fo.a($$0x, "pos"), dik.a, dgu.a, 1.0F, 0)))
                              .then(
                                 ((RequiredArgumentBuilder)dv.a("rotation", fg.a())
                                       .executes(
                                          $$0x -> a((du)$$0x.getSource(), ev.e($$0x, "template"), fo.a($$0x, "pos"), fg.a($$0x, "rotation"), dgu.a, 1.0F, 0)
                                       ))
                                    .then(
                                       ((RequiredArgumentBuilder)dv.a("mirror", ff.a())
                                             .executes(
                                                $$0x -> a(
                                                      (du)$$0x.getSource(),
                                                      ev.e($$0x, "template"),
                                                      fo.a($$0x, "pos"),
                                                      fg.a($$0x, "rotation"),
                                                      ff.a($$0x, "mirror"),
                                                      1.0F,
                                                      0
                                                   )
                                             ))
                                          .then(
                                             ((RequiredArgumentBuilder)dv.a("integrity", FloatArgumentType.floatArg(0.0F, 1.0F))
                                                   .executes(
                                                      $$0x -> a(
                                                            (du)$$0x.getSource(),
                                                            ev.e($$0x, "template"),
                                                            fo.a($$0x, "pos"),
                                                            fg.a($$0x, "rotation"),
                                                            ff.a($$0x, "mirror"),
                                                            FloatArgumentType.getFloat($$0x, "integrity"),
                                                            0
                                                         )
                                                   ))
                                                .then(
                                                   dv.a("seed", IntegerArgumentType.integer())
                                                      .executes(
                                                         $$0x -> a(
                                                               (du)$$0x.getSource(),
                                                               ev.e($$0x, "template"),
                                                               fo.a($$0x, "pos"),
                                                               fg.a($$0x, "rotation"),
                                                               ff.a($$0x, "mirror"),
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

   public static int a(du $$0, il.c<dxi<?, ?>> $$1, ib $$2) throws CommandSyntaxException {
      aps $$3 = $$0.e();
      dxi<?, ?> $$4 = $$1.a();
      cye $$5 = new cye($$2);
      a($$3, new cye($$5.e - 1, $$5.f - 1), new cye($$5.e + 1, $$5.f + 1));
      if (!$$4.a($$3, $$3.l().g(), $$3.E_(), $$2)) {
         throw a.create();
      } else {
         String $$6 = $$1.h().a().toString();
         $$0.a(() -> wg.a("commands.place.feature.success", $$6, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(du $$0, il<egq> $$1, ajt $$2, int $$3, ib $$4) throws CommandSyntaxException {
      aps $$5 = $$0.e();
      if (!egk.a($$5, $$1, $$2, $$3, $$4, false)) {
         throw b.create();
      } else {
         $$0.a(() -> wg.a("commands.place.jigsaw.success", $$4.u(), $$4.v(), $$4.w()), true);
         return 1;
      }
   }

   public static int b(du $$0, il.c<efh> $$1, ib $$2) throws CommandSyntaxException {
      aps $$3 = $$0.e();
      efh $$4 = $$1.a();
      dqw $$5 = $$3.l().g();
      efp $$6 = $$4.a($$0.v(), $$5, $$5.c(), $$3.l().i(), $$3.q(), $$3.C(), new cye($$2), 0, $$3, $$0x -> true);
      if (!$$6.b()) {
         throw c.create();
      } else {
         eez $$7 = $$6.a();
         cye $$8 = new cye(je.a($$7.h()), je.a($$7.j()));
         cye $$9 = new cye(je.a($$7.k()), je.a($$7.m()));
         a($$3, $$8, $$9);
         cye.a($$8, $$9).forEach($$3x -> $$6.a($$3, $$3.a(), $$5, $$3.E_(), new eez($$3x.d(), $$3.I_(), $$3x.e(), $$3x.f(), $$3.al(), $$3x.g()), $$3x));
         String $$10 = $$1.h().a().toString();
         $$0.a(() -> wg.a("commands.place.structure.success", $$10, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(du $$0, ajt $$1, ib $$2, dik $$3, dgu $$4, float $$5, int $$6) throws CommandSyntaxException {
      aps $$7 = $$0.e();
      eji $$8 = $$7.q();

      Optional<ejh> $$9;
      try {
         $$9 = $$8.b($$1);
      } catch (z var13) {
         throw d.create($$1);
      }

      if ($$9.isEmpty()) {
         throw d.create($$1);
      } else {
         ejh $$12 = $$9.get();
         a($$7, new cye($$2), new cye($$2.a($$12.a())));
         ejd $$13 = new ejd().a($$4).a($$3);
         if ($$5 < 1.0F) {
            $$13.b().a(new eil($$5)).a(dnu.b((long)$$6));
         }

         boolean $$14 = $$12.a($$7, $$2, $$2, $$13, dnu.b((long)$$6), 2);
         if (!$$14) {
            throw e.create();
         } else {
            $$0.a(() -> wg.a("commands.place.template.success", wg.a($$1), $$2.u(), $$2.v(), $$2.w()), true);
            return 1;
         }
      }
   }

   private static void a(aps $$0, cye $$1, cye $$2) throws CommandSyntaxException {
      if (cye.a($$1, $$2).filter($$1x -> !$$0.p($$1x.l())).findAny().isPresent()) {
         throw fo.a.create();
      }
   }
}

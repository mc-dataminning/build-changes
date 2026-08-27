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

public class ame {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vu.c("commands.place.feature.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vu.c("commands.place.jigsaw.failed"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(vu.c("commands.place.structure.failed"));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> vu.b("commands.place.template.invalid", $$0));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(vu.c("commands.place.template.failed"));
   private static final SuggestionProvider<du> f = ($$0, $$1) -> {
      ehf $$2 = ((du)$$0.getSource()).e().q();
      return dz.a($$2.a(), $$1);
   };

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("place")
                        .requires($$0x -> $$0x.c(2)))
                     .then(
                        dv.a("feature")
                           .then(
                              ((RequiredArgumentBuilder)dv.a("feature", eu.a(kj.ax))
                                    .executes($$0x -> a((du)$$0x.getSource(), eu.a($$0x, "feature"), ib.a(((du)$$0x.getSource()).d()))))
                                 .then(dv.a("pos", fo.a()).executes($$0x -> a((du)$$0x.getSource(), eu.a($$0x, "feature"), fo.a($$0x, "pos"))))
                           )
                     ))
                  .then(
                     dv.a("jigsaw")
                        .then(
                           dv.a("pool", eu.a(kj.aH))
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
                        ((RequiredArgumentBuilder)dv.a("structure", eu.a(kj.aE))
                              .executes($$0x -> b((du)$$0x.getSource(), eu.b($$0x, "structure"), ib.a(((du)$$0x.getSource()).d()))))
                           .then(dv.a("pos", fo.a()).executes($$0x -> b((du)$$0x.getSource(), eu.b($$0x, "structure"), fo.a($$0x, "pos"))))
                     )
               ))
            .then(
               dv.a("template")
                  .then(
                     ((RequiredArgumentBuilder)dv.a("template", ev.a())
                           .suggests(f)
                           .executes($$0x -> a((du)$$0x.getSource(), ev.e($$0x, "template"), ib.a(((du)$$0x.getSource()).d()), dgo.a, dey.a, 1.0F, 0)))
                        .then(
                           ((RequiredArgumentBuilder)dv.a("pos", fo.a())
                                 .executes($$0x -> a((du)$$0x.getSource(), ev.e($$0x, "template"), fo.a($$0x, "pos"), dgo.a, dey.a, 1.0F, 0)))
                              .then(
                                 ((RequiredArgumentBuilder)dv.a("rotation", fg.a())
                                       .executes(
                                          $$0x -> a((du)$$0x.getSource(), ev.e($$0x, "template"), fo.a($$0x, "pos"), fg.a($$0x, "rotation"), dey.a, 1.0F, 0)
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

   public static int a(du $$0, il.c<dvf<?, ?>> $$1, ib $$2) throws CommandSyntaxException {
      apf $$3 = $$0.e();
      dvf<?, ?> $$4 = $$1.a();
      cwi $$5 = new cwi($$2);
      a($$3, new cwi($$5.e - 1, $$5.f - 1), new cwi($$5.e + 1, $$5.f + 1));
      if (!$$4.a($$3, $$3.l().g(), $$3.E_(), $$2)) {
         throw a.create();
      } else {
         String $$6 = $$1.h().a().toString();
         $$0.a(() -> vu.a("commands.place.feature.success", $$6, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(du $$0, il<een> $$1, ajh $$2, int $$3, ib $$4) throws CommandSyntaxException {
      apf $$5 = $$0.e();
      if (!eeh.a($$5, $$1, $$2, $$3, $$4, false)) {
         throw b.create();
      } else {
         $$0.a(() -> vu.a("commands.place.jigsaw.success", $$4.u(), $$4.v(), $$4.w()), true);
         return 1;
      }
   }

   public static int b(du $$0, il.c<ede> $$1, ib $$2) throws CommandSyntaxException {
      apf $$3 = $$0.e();
      ede $$4 = $$1.a();
      doy $$5 = $$3.l().g();
      edm $$6 = $$4.a($$0.v(), $$5, $$5.c(), $$3.l().i(), $$3.q(), $$3.C(), new cwi($$2), 0, $$3, $$0x -> true);
      if (!$$6.b()) {
         throw c.create();
      } else {
         ecw $$7 = $$6.a();
         cwi $$8 = new cwi(je.a($$7.h()), je.a($$7.j()));
         cwi $$9 = new cwi(je.a($$7.k()), je.a($$7.m()));
         a($$3, $$8, $$9);
         cwi.a($$8, $$9).forEach($$3x -> $$6.a($$3, $$3.a(), $$5, $$3.E_(), new ecw($$3x.d(), $$3.I_(), $$3x.e(), $$3x.f(), $$3.ak(), $$3x.g()), $$3x));
         String $$10 = $$1.h().a().toString();
         $$0.a(() -> vu.a("commands.place.structure.success", $$10, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(du $$0, ajh $$1, ib $$2, dgo $$3, dey $$4, float $$5, int $$6) throws CommandSyntaxException {
      apf $$7 = $$0.e();
      ehf $$8 = $$7.q();

      Optional<ehe> $$9;
      try {
         $$9 = $$8.b($$1);
      } catch (z var13) {
         throw d.create($$1);
      }

      if ($$9.isEmpty()) {
         throw d.create($$1);
      } else {
         ehe $$12 = $$9.get();
         a($$7, new cwi($$2), new cwi($$2.a($$12.a())));
         eha $$13 = new eha().a($$4).a($$3);
         if ($$5 < 1.0F) {
            $$13.b().a(new egi($$5)).a(dlw.b((long)$$6));
         }

         boolean $$14 = $$12.a($$7, $$2, $$2, $$13, dlw.b((long)$$6), 2);
         if (!$$14) {
            throw e.create();
         } else {
            $$0.a(() -> vu.a("commands.place.template.success", vu.a($$1), $$2.u(), $$2.v(), $$2.w()), true);
            return 1;
         }
      }
   }

   private static void a(apf $$0, cwi $$1, cwi $$2) throws CommandSyntaxException {
      if (cwi.a($$1, $$2).filter($$1x -> !$$0.p($$1x.l())).findAny().isPresent()) {
         throw fo.a.create();
      }
   }
}

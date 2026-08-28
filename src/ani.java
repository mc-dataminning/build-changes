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

public class ani {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("commands.place.feature.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wu.c("commands.place.jigsaw.failed"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wu.c("commands.place.structure.failed"));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wu.b("commands.place.template.invalid", $$0));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wu.c("commands.place.template.failed"));
   private static final SuggestionProvider<eq> f = ($$0, $$1) -> {
      emz $$2 = ((eq)$$0.getSource()).e().q();
      return ev.a($$2.a(), $$1);
   };

   public static void a(CommandDispatcher<eq> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("place")
                        .requires($$0x -> $$0x.c(2)))
                     .then(
                        er.a("feature")
                           .then(
                              ((RequiredArgumentBuilder)er.a("feature", fq.a(lr.aH))
                                    .executes($$0x -> a((eq)$$0x.getSource(), fq.a($$0x, "feature"), ja.a(((eq)$$0x.getSource()).d()))))
                                 .then(er.a("pos", gm.a()).executes($$0x -> a((eq)$$0x.getSource(), fq.a($$0x, "feature"), gm.a($$0x, "pos"))))
                           )
                     ))
                  .then(
                     er.a("jigsaw")
                        .then(
                           er.a("pool", fq.a(lr.aT))
                              .then(
                                 er.a("target", fr.a())
                                    .then(
                                       ((RequiredArgumentBuilder)er.a("max_depth", IntegerArgumentType.integer(1, 20))
                                             .executes(
                                                $$0x -> a(
                                                      (eq)$$0x.getSource(),
                                                      fq.c($$0x, "pool"),
                                                      fr.c($$0x, "target"),
                                                      IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                      ja.a(((eq)$$0x.getSource()).d())
                                                   )
                                             ))
                                          .then(
                                             er.a("position", gm.a())
                                                .executes(
                                                   $$0x -> a(
                                                         (eq)$$0x.getSource(),
                                                         fq.c($$0x, "pool"),
                                                         fr.c($$0x, "target"),
                                                         IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                         gm.a($$0x, "position")
                                                      )
                                                )
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  er.a("structure")
                     .then(
                        ((RequiredArgumentBuilder)er.a("structure", fq.a(lr.aQ))
                              .executes($$0x -> b((eq)$$0x.getSource(), fq.b($$0x, "structure"), ja.a(((eq)$$0x.getSource()).d()))))
                           .then(er.a("pos", gm.a()).executes($$0x -> b((eq)$$0x.getSource(), fq.b($$0x, "structure"), gm.a($$0x, "pos"))))
                     )
               ))
            .then(
               er.a("template")
                  .then(
                     ((RequiredArgumentBuilder)er.a("template", fr.a())
                           .suggests(f)
                           .executes($$0x -> a((eq)$$0x.getSource(), fr.c($$0x, "template"), ja.a(((eq)$$0x.getSource()).d()), dlv.a, dkf.a, 1.0F, 0)))
                        .then(
                           ((RequiredArgumentBuilder)er.a("pos", gm.a())
                                 .executes($$0x -> a((eq)$$0x.getSource(), fr.c($$0x, "template"), gm.a($$0x, "pos"), dlv.a, dkf.a, 1.0F, 0)))
                              .then(
                                 ((RequiredArgumentBuilder)er.a("rotation", ge.a())
                                       .executes(
                                          $$0x -> a((eq)$$0x.getSource(), fr.c($$0x, "template"), gm.a($$0x, "pos"), ge.a($$0x, "rotation"), dkf.a, 1.0F, 0)
                                       ))
                                    .then(
                                       ((RequiredArgumentBuilder)er.a("mirror", gd.a())
                                             .executes(
                                                $$0x -> a(
                                                      (eq)$$0x.getSource(),
                                                      fr.c($$0x, "template"),
                                                      gm.a($$0x, "pos"),
                                                      ge.a($$0x, "rotation"),
                                                      gd.a($$0x, "mirror"),
                                                      1.0F,
                                                      0
                                                   )
                                             ))
                                          .then(
                                             ((RequiredArgumentBuilder)er.a("integrity", FloatArgumentType.floatArg(0.0F, 1.0F))
                                                   .executes(
                                                      $$0x -> a(
                                                            (eq)$$0x.getSource(),
                                                            fr.c($$0x, "template"),
                                                            gm.a($$0x, "pos"),
                                                            ge.a($$0x, "rotation"),
                                                            gd.a($$0x, "mirror"),
                                                            FloatArgumentType.getFloat($$0x, "integrity"),
                                                            0
                                                         )
                                                   ))
                                                .then(
                                                   er.a("seed", IntegerArgumentType.integer())
                                                      .executes(
                                                         $$0x -> a(
                                                               (eq)$$0x.getSource(),
                                                               fr.c($$0x, "template"),
                                                               gm.a($$0x, "pos"),
                                                               ge.a($$0x, "rotation"),
                                                               gd.a($$0x, "mirror"),
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

   public static int a(eq $$0, jj.c<eay<?, ?>> $$1, ja $$2) throws CommandSyntaxException {
      aqm $$3 = $$0.e();
      eay<?, ?> $$4 = $$1.a();
      dbn $$5 = new dbn($$2);
      a($$3, new dbn($$5.e - 1, $$5.f - 1), new dbn($$5.e + 1, $$5.f + 1));
      if (!$$4.a($$3, $$3.l().g(), $$3.E_(), $$2)) {
         throw a.create();
      } else {
         String $$6 = $$1.h().a().toString();
         $$0.a(() -> wu.a("commands.place.feature.success", $$6, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(eq $$0, jj<ekh> $$1, akk $$2, int $$3, ja $$4) throws CommandSyntaxException {
      aqm $$5 = $$0.e();
      dbn $$6 = new dbn($$4);
      a($$5, $$6, $$6);
      if (!ekb.a($$5, $$1, $$2, $$3, $$4, false)) {
         throw b.create();
      } else {
         $$0.a(() -> wu.a("commands.place.jigsaw.success", $$4.u(), $$4.v(), $$4.w()), true);
         return 1;
      }
   }

   public static int b(eq $$0, jj.c<eix> $$1, ja $$2) throws CommandSyntaxException {
      aqm $$3 = $$0.e();
      eix $$4 = $$1.a();
      dui $$5 = $$3.l().g();
      ejf $$6 = $$4.a($$0.v(), $$5, $$5.d(), $$3.l().i(), $$3.q(), $$3.C(), new dbn($$2), 0, $$3, $$0x -> true);
      if (!$$6.b()) {
         throw c.create();
      } else {
         eip $$7 = $$6.a();
         dbn $$8 = new dbn(kc.a($$7.h()), kc.a($$7.j()));
         dbn $$9 = new dbn(kc.a($$7.k()), kc.a($$7.m()));
         a($$3, $$8, $$9);
         dbn.a($$8, $$9).forEach($$3x -> $$6.a($$3, $$3.a(), $$5, $$3.E_(), new eip($$3x.d(), $$3.I_(), $$3x.e(), $$3x.f(), $$3.am(), $$3x.g()), $$3x));
         String $$10 = $$1.h().a().toString();
         $$0.a(() -> wu.a("commands.place.structure.success", $$10, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(eq $$0, akk $$1, ja $$2, dlv $$3, dkf $$4, float $$5, int $$6) throws CommandSyntaxException {
      aqm $$7 = $$0.e();
      emz $$8 = $$7.q();

      Optional<emy> $$9;
      try {
         $$9 = $$8.b($$1);
      } catch (z var13) {
         throw d.create($$1);
      }

      if ($$9.isEmpty()) {
         throw d.create($$1);
      } else {
         emy $$12 = $$9.get();
         a($$7, new dbn($$2), new dbn($$2.a($$12.a())));
         emu $$13 = new emu().a($$4).a($$3);
         if ($$5 < 1.0F) {
            $$13.b().a(new emc($$5)).a(drg.b((long)$$6));
         }

         boolean $$14 = $$12.a($$7, $$2, $$2, $$13, drg.b((long)$$6), 2);
         if (!$$14) {
            throw e.create();
         } else {
            $$0.a(() -> wu.a("commands.place.template.success", wu.a($$1), $$2.u(), $$2.v(), $$2.w()), true);
            return 1;
         }
      }
   }

   private static void a(aqm $$0, dbn $$1, dbn $$2) throws CommandSyntaxException {
      if (dbn.a($$1, $$2).filter($$1x -> !$$0.p($$1x.l())).findAny().isPresent()) {
         throw gm.a.create();
      }
   }
}

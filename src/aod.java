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

public class aod {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xp.c("commands.place.feature.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xp.c("commands.place.jigsaw.failed"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xp.c("commands.place.structure.failed"));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xp.b("commands.place.template.invalid", $$0));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xp.c("commands.place.template.failed"));
   private static final SuggestionProvider<ep> f = ($$0, $$1) -> {
      emn $$2 = ((ep)$$0.getSource()).e().q();
      return eu.a($$2.a(), $$1);
   };

   public static void a(CommandDispatcher<ep> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("place")
                        .requires($$0x -> $$0x.c(2)))
                     .then(
                        eq.a("feature")
                           .then(
                              ((RequiredArgumentBuilder)eq.a("feature", fp.a(lq.aC))
                                    .executes($$0x -> a((ep)$$0x.getSource(), fp.a($$0x, "feature"), iz.a(((ep)$$0x.getSource()).d()))))
                                 .then(eq.a("pos", gl.a()).executes($$0x -> a((ep)$$0x.getSource(), fp.a($$0x, "feature"), gl.a($$0x, "pos"))))
                           )
                     ))
                  .then(
                     eq.a("jigsaw")
                        .then(
                           eq.a("pool", fp.a(lq.aM))
                              .then(
                                 eq.a("target", fq.a())
                                    .then(
                                       ((RequiredArgumentBuilder)eq.a("max_depth", IntegerArgumentType.integer(1, 20))
                                             .executes(
                                                $$0x -> a(
                                                      (ep)$$0x.getSource(),
                                                      fp.c($$0x, "pool"),
                                                      fq.c($$0x, "target"),
                                                      IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                      iz.a(((ep)$$0x.getSource()).d())
                                                   )
                                             ))
                                          .then(
                                             eq.a("position", gl.a())
                                                .executes(
                                                   $$0x -> a(
                                                         (ep)$$0x.getSource(),
                                                         fp.c($$0x, "pool"),
                                                         fq.c($$0x, "target"),
                                                         IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                         gl.a($$0x, "position")
                                                      )
                                                )
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  eq.a("structure")
                     .then(
                        ((RequiredArgumentBuilder)eq.a("structure", fp.a(lq.aJ))
                              .executes($$0x -> b((ep)$$0x.getSource(), fp.b($$0x, "structure"), iz.a(((ep)$$0x.getSource()).d()))))
                           .then(eq.a("pos", gl.a()).executes($$0x -> b((ep)$$0x.getSource(), fp.b($$0x, "structure"), gl.a($$0x, "pos"))))
                     )
               ))
            .then(
               eq.a("template")
                  .then(
                     ((RequiredArgumentBuilder)eq.a("template", fq.a())
                           .suggests(f)
                           .executes($$0x -> a((ep)$$0x.getSource(), fq.c($$0x, "template"), iz.a(((ep)$$0x.getSource()).d()), dlo.a, djy.a, 1.0F, 0)))
                        .then(
                           ((RequiredArgumentBuilder)eq.a("pos", gl.a())
                                 .executes($$0x -> a((ep)$$0x.getSource(), fq.c($$0x, "template"), gl.a($$0x, "pos"), dlo.a, djy.a, 1.0F, 0)))
                              .then(
                                 ((RequiredArgumentBuilder)eq.a("rotation", gd.a())
                                       .executes(
                                          $$0x -> a((ep)$$0x.getSource(), fq.c($$0x, "template"), gl.a($$0x, "pos"), gd.a($$0x, "rotation"), djy.a, 1.0F, 0)
                                       ))
                                    .then(
                                       ((RequiredArgumentBuilder)eq.a("mirror", gc.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ep)$$0x.getSource(),
                                                      fq.c($$0x, "template"),
                                                      gl.a($$0x, "pos"),
                                                      gd.a($$0x, "rotation"),
                                                      gc.a($$0x, "mirror"),
                                                      1.0F,
                                                      0
                                                   )
                                             ))
                                          .then(
                                             ((RequiredArgumentBuilder)eq.a("integrity", FloatArgumentType.floatArg(0.0F, 1.0F))
                                                   .executes(
                                                      $$0x -> a(
                                                            (ep)$$0x.getSource(),
                                                            fq.c($$0x, "template"),
                                                            gl.a($$0x, "pos"),
                                                            gd.a($$0x, "rotation"),
                                                            gc.a($$0x, "mirror"),
                                                            FloatArgumentType.getFloat($$0x, "integrity"),
                                                            0
                                                         )
                                                   ))
                                                .then(
                                                   eq.a("seed", IntegerArgumentType.integer())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ep)$$0x.getSource(),
                                                               fq.c($$0x, "template"),
                                                               gl.a($$0x, "pos"),
                                                               gd.a($$0x, "rotation"),
                                                               gc.a($$0x, "mirror"),
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

   public static int a(ep $$0, ji.c<ean<?, ?>> $$1, iz $$2) throws CommandSyntaxException {
      arf $$3 = $$0.e();
      ean<?, ?> $$4 = $$1.a();
      dbh $$5 = new dbh($$2);
      a($$3, new dbh($$5.e - 1, $$5.f - 1), new dbh($$5.e + 1, $$5.f + 1));
      if (!$$4.a($$3, $$3.l().g(), $$3.E_(), $$2)) {
         throw a.create();
      } else {
         String $$6 = $$1.h().a().toString();
         $$0.a(() -> xp.a("commands.place.feature.success", $$6, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(ep $$0, ji<ejv> $$1, alf $$2, int $$3, iz $$4) throws CommandSyntaxException {
      arf $$5 = $$0.e();
      dbh $$6 = new dbh($$4);
      a($$5, $$6, $$6);
      if (!ejp.a($$5, $$1, $$2, $$3, $$4, false)) {
         throw b.create();
      } else {
         $$0.a(() -> xp.a("commands.place.jigsaw.success", $$4.u(), $$4.v(), $$4.w()), true);
         return 1;
      }
   }

   public static int b(ep $$0, ji.c<eim> $$1, iz $$2) throws CommandSyntaxException {
      arf $$3 = $$0.e();
      eim $$4 = $$1.a();
      dub $$5 = $$3.l().g();
      eiu $$6 = $$4.a($$0.v(), $$5, $$5.d(), $$3.l().i(), $$3.q(), $$3.C(), new dbh($$2), 0, $$3, $$0x -> true);
      if (!$$6.b()) {
         throw c.create();
      } else {
         eie $$7 = $$6.a();
         dbh $$8 = new dbh(kb.a($$7.h()), kb.a($$7.j()));
         dbh $$9 = new dbh(kb.a($$7.k()), kb.a($$7.m()));
         a($$3, $$8, $$9);
         dbh.a($$8, $$9).forEach($$3x -> $$6.a($$3, $$3.a(), $$5, $$3.E_(), new eie($$3x.d(), $$3.I_(), $$3x.e(), $$3x.f(), $$3.am(), $$3x.g()), $$3x));
         String $$10 = $$1.h().a().toString();
         $$0.a(() -> xp.a("commands.place.structure.success", $$10, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(ep $$0, alf $$1, iz $$2, dlo $$3, djy $$4, float $$5, int $$6) throws CommandSyntaxException {
      arf $$7 = $$0.e();
      emn $$8 = $$7.q();

      Optional<emm> $$9;
      try {
         $$9 = $$8.b($$1);
      } catch (z var13) {
         throw d.create($$1);
      }

      if ($$9.isEmpty()) {
         throw d.create($$1);
      } else {
         emm $$12 = $$9.get();
         a($$7, new dbh($$2), new dbh($$2.a($$12.a())));
         emi $$13 = new emi().a($$4).a($$3);
         if ($$5 < 1.0F) {
            $$13.b().a(new elq($$5)).a(dqy.b((long)$$6));
         }

         boolean $$14 = $$12.a($$7, $$2, $$2, $$13, dqy.b((long)$$6), 2);
         if (!$$14) {
            throw e.create();
         } else {
            $$0.a(() -> xp.a("commands.place.template.success", xp.a($$1), $$2.u(), $$2.v(), $$2.w()), true);
            return 1;
         }
      }
   }

   private static void a(arf $$0, dbh $$1, dbh $$2) throws CommandSyntaxException {
      if (dbh.a($$1, $$2).filter($$1x -> !$$0.p($$1x.l())).findAny().isPresent()) {
         throw gl.a.create();
      }
   }
}

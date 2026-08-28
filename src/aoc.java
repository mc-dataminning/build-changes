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

public class aoc {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xo.c("commands.place.feature.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xo.c("commands.place.jigsaw.failed"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xo.c("commands.place.structure.failed"));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xo.b("commands.place.template.invalid", $$0));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xo.c("commands.place.template.failed"));
   private static final SuggestionProvider<ep> f = ($$0, $$1) -> {
      emk $$2 = ((ep)$$0.getSource()).e().q();
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
                           .executes($$0x -> a((ep)$$0x.getSource(), fq.c($$0x, "template"), iz.a(((ep)$$0x.getSource()).d()), dll.a, djv.a, 1.0F, 0)))
                        .then(
                           ((RequiredArgumentBuilder)eq.a("pos", gl.a())
                                 .executes($$0x -> a((ep)$$0x.getSource(), fq.c($$0x, "template"), gl.a($$0x, "pos"), dll.a, djv.a, 1.0F, 0)))
                              .then(
                                 ((RequiredArgumentBuilder)eq.a("rotation", gd.a())
                                       .executes(
                                          $$0x -> a((ep)$$0x.getSource(), fq.c($$0x, "template"), gl.a($$0x, "pos"), gd.a($$0x, "rotation"), djv.a, 1.0F, 0)
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

   public static int a(ep $$0, ji.c<eak<?, ?>> $$1, iz $$2) throws CommandSyntaxException {
      are $$3 = $$0.e();
      eak<?, ?> $$4 = $$1.a();
      dbe $$5 = new dbe($$2);
      a($$3, new dbe($$5.e - 1, $$5.f - 1), new dbe($$5.e + 1, $$5.f + 1));
      if (!$$4.a($$3, $$3.l().g(), $$3.E_(), $$2)) {
         throw a.create();
      } else {
         String $$6 = $$1.h().a().toString();
         $$0.a(() -> xo.a("commands.place.feature.success", $$6, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(ep $$0, ji<ejs> $$1, ale $$2, int $$3, iz $$4) throws CommandSyntaxException {
      are $$5 = $$0.e();
      dbe $$6 = new dbe($$4);
      a($$5, $$6, $$6);
      if (!ejm.a($$5, $$1, $$2, $$3, $$4, false)) {
         throw b.create();
      } else {
         $$0.a(() -> xo.a("commands.place.jigsaw.success", $$4.u(), $$4.v(), $$4.w()), true);
         return 1;
      }
   }

   public static int b(ep $$0, ji.c<eij> $$1, iz $$2) throws CommandSyntaxException {
      are $$3 = $$0.e();
      eij $$4 = $$1.a();
      dty $$5 = $$3.l().g();
      eir $$6 = $$4.a($$0.v(), $$5, $$5.d(), $$3.l().i(), $$3.q(), $$3.C(), new dbe($$2), 0, $$3, $$0x -> true);
      if (!$$6.b()) {
         throw c.create();
      } else {
         eib $$7 = $$6.a();
         dbe $$8 = new dbe(kb.a($$7.h()), kb.a($$7.j()));
         dbe $$9 = new dbe(kb.a($$7.k()), kb.a($$7.m()));
         a($$3, $$8, $$9);
         dbe.a($$8, $$9).forEach($$3x -> $$6.a($$3, $$3.a(), $$5, $$3.E_(), new eib($$3x.d(), $$3.I_(), $$3x.e(), $$3x.f(), $$3.am(), $$3x.g()), $$3x));
         String $$10 = $$1.h().a().toString();
         $$0.a(() -> xo.a("commands.place.structure.success", $$10, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(ep $$0, ale $$1, iz $$2, dll $$3, djv $$4, float $$5, int $$6) throws CommandSyntaxException {
      are $$7 = $$0.e();
      emk $$8 = $$7.q();

      Optional<emj> $$9;
      try {
         $$9 = $$8.b($$1);
      } catch (z var13) {
         throw d.create($$1);
      }

      if ($$9.isEmpty()) {
         throw d.create($$1);
      } else {
         emj $$12 = $$9.get();
         a($$7, new dbe($$2), new dbe($$2.a($$12.a())));
         emf $$13 = new emf().a($$4).a($$3);
         if ($$5 < 1.0F) {
            $$13.b().a(new eln($$5)).a(dqv.b((long)$$6));
         }

         boolean $$14 = $$12.a($$7, $$2, $$2, $$13, dqv.b((long)$$6), 2);
         if (!$$14) {
            throw e.create();
         } else {
            $$0.a(() -> xo.a("commands.place.template.success", xo.a($$1), $$2.u(), $$2.v(), $$2.w()), true);
            return 1;
         }
      }
   }

   private static void a(are $$0, dbe $$1, dbe $$2) throws CommandSyntaxException {
      if (dbe.a($$1, $$2).filter($$1x -> !$$0.p($$1x.l())).findAny().isPresent()) {
         throw gl.a.create();
      }
   }
}

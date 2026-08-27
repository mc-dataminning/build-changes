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

public class anf {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("commands.place.feature.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wu.c("commands.place.jigsaw.failed"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wu.c("commands.place.structure.failed"));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wu.b("commands.place.template.invalid", $$0));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wu.c("commands.place.template.failed"));
   private static final SuggestionProvider<ed> f = ($$0, $$1) -> {
      ekq $$2 = ((ed)$$0.getSource()).e().q();
      return ei.a($$2.a(), $$1);
   };

   public static void a(CommandDispatcher<ed> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("place")
                        .requires($$0x -> $$0x.c(2)))
                     .then(
                        ee.a("feature")
                           .then(
                              ((RequiredArgumentBuilder)ee.a("feature", fd.a(le.aC))
                                    .executes($$0x -> a((ed)$$0x.getSource(), fd.a($$0x, "feature"), in.a(((ed)$$0x.getSource()).d()))))
                                 .then(ee.a("pos", fz.a()).executes($$0x -> a((ed)$$0x.getSource(), fd.a($$0x, "feature"), fz.a($$0x, "pos"))))
                           )
                     ))
                  .then(
                     ee.a("jigsaw")
                        .then(
                           ee.a("pool", fd.a(le.aM))
                              .then(
                                 ee.a("target", fe.a())
                                    .then(
                                       ((RequiredArgumentBuilder)ee.a("max_depth", IntegerArgumentType.integer(1, 20))
                                             .executes(
                                                $$0x -> a(
                                                      (ed)$$0x.getSource(),
                                                      fd.c($$0x, "pool"),
                                                      fe.c($$0x, "target"),
                                                      IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                      in.a(((ed)$$0x.getSource()).d())
                                                   )
                                             ))
                                          .then(
                                             ee.a("position", fz.a())
                                                .executes(
                                                   $$0x -> a(
                                                         (ed)$$0x.getSource(),
                                                         fd.c($$0x, "pool"),
                                                         fe.c($$0x, "target"),
                                                         IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                         fz.a($$0x, "position")
                                                      )
                                                )
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  ee.a("structure")
                     .then(
                        ((RequiredArgumentBuilder)ee.a("structure", fd.a(le.aJ))
                              .executes($$0x -> b((ed)$$0x.getSource(), fd.b($$0x, "structure"), in.a(((ed)$$0x.getSource()).d()))))
                           .then(ee.a("pos", fz.a()).executes($$0x -> b((ed)$$0x.getSource(), fd.b($$0x, "structure"), fz.a($$0x, "pos"))))
                     )
               ))
            .then(
               ee.a("template")
                  .then(
                     ((RequiredArgumentBuilder)ee.a("template", fe.a())
                           .suggests(f)
                           .executes($$0x -> a((ed)$$0x.getSource(), fe.c($$0x, "template"), in.a(((ed)$$0x.getSource()).d()), djr.a, dib.a, 1.0F, 0)))
                        .then(
                           ((RequiredArgumentBuilder)ee.a("pos", fz.a())
                                 .executes($$0x -> a((ed)$$0x.getSource(), fe.c($$0x, "template"), fz.a($$0x, "pos"), djr.a, dib.a, 1.0F, 0)))
                              .then(
                                 ((RequiredArgumentBuilder)ee.a("rotation", fr.a())
                                       .executes(
                                          $$0x -> a((ed)$$0x.getSource(), fe.c($$0x, "template"), fz.a($$0x, "pos"), fr.a($$0x, "rotation"), dib.a, 1.0F, 0)
                                       ))
                                    .then(
                                       ((RequiredArgumentBuilder)ee.a("mirror", fq.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ed)$$0x.getSource(),
                                                      fe.c($$0x, "template"),
                                                      fz.a($$0x, "pos"),
                                                      fr.a($$0x, "rotation"),
                                                      fq.a($$0x, "mirror"),
                                                      1.0F,
                                                      0
                                                   )
                                             ))
                                          .then(
                                             ((RequiredArgumentBuilder)ee.a("integrity", FloatArgumentType.floatArg(0.0F, 1.0F))
                                                   .executes(
                                                      $$0x -> a(
                                                            (ed)$$0x.getSource(),
                                                            fe.c($$0x, "template"),
                                                            fz.a($$0x, "pos"),
                                                            fr.a($$0x, "rotation"),
                                                            fq.a($$0x, "mirror"),
                                                            FloatArgumentType.getFloat($$0x, "integrity"),
                                                            0
                                                         )
                                                   ))
                                                .then(
                                                   ee.a("seed", IntegerArgumentType.integer())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ed)$$0x.getSource(),
                                                               fe.c($$0x, "template"),
                                                               fz.a($$0x, "pos"),
                                                               fr.a($$0x, "rotation"),
                                                               fq.a($$0x, "mirror"),
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

   public static int a(ed $$0, iw.c<dyq<?, ?>> $$1, in $$2) throws CommandSyntaxException {
      aqh $$3 = $$0.e();
      dyq<?, ?> $$4 = $$1.a();
      czk $$5 = new czk($$2);
      a($$3, new czk($$5.e - 1, $$5.f - 1), new czk($$5.e + 1, $$5.f + 1));
      if (!$$4.a($$3, $$3.l().g(), $$3.E_(), $$2)) {
         throw a.create();
      } else {
         String $$6 = $$1.h().a().toString();
         $$0.a(() -> wu.a("commands.place.feature.success", $$6, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(ed $$0, iw<ehy> $$1, akh $$2, int $$3, in $$4) throws CommandSyntaxException {
      aqh $$5 = $$0.e();
      if (!ehs.a($$5, $$1, $$2, $$3, $$4, false)) {
         throw b.create();
      } else {
         $$0.a(() -> wu.a("commands.place.jigsaw.success", $$4.u(), $$4.v(), $$4.w()), true);
         return 1;
      }
   }

   public static int b(ed $$0, iw.c<egp> $$1, in $$2) throws CommandSyntaxException {
      aqh $$3 = $$0.e();
      egp $$4 = $$1.a();
      dse $$5 = $$3.l().g();
      egx $$6 = $$4.a($$0.v(), $$5, $$5.c(), $$3.l().i(), $$3.q(), $$3.C(), new czk($$2), 0, $$3, $$0x -> true);
      if (!$$6.b()) {
         throw c.create();
      } else {
         egh $$7 = $$6.a();
         czk $$8 = new czk(jp.a($$7.h()), jp.a($$7.j()));
         czk $$9 = new czk(jp.a($$7.k()), jp.a($$7.m()));
         a($$3, $$8, $$9);
         czk.a($$8, $$9).forEach($$3x -> $$6.a($$3, $$3.a(), $$5, $$3.E_(), new egh($$3x.d(), $$3.I_(), $$3x.e(), $$3x.f(), $$3.al(), $$3x.g()), $$3x));
         String $$10 = $$1.h().a().toString();
         $$0.a(() -> wu.a("commands.place.structure.success", $$10, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(ed $$0, akh $$1, in $$2, djr $$3, dib $$4, float $$5, int $$6) throws CommandSyntaxException {
      aqh $$7 = $$0.e();
      ekq $$8 = $$7.q();

      Optional<ekp> $$9;
      try {
         $$9 = $$8.b($$1);
      } catch (z var13) {
         throw d.create($$1);
      }

      if ($$9.isEmpty()) {
         throw d.create($$1);
      } else {
         ekp $$12 = $$9.get();
         a($$7, new czk($$2), new czk($$2.a($$12.a())));
         ekl $$13 = new ekl().a($$4).a($$3);
         if ($$5 < 1.0F) {
            $$13.b().a(new ejt($$5)).a(dpb.b((long)$$6));
         }

         boolean $$14 = $$12.a($$7, $$2, $$2, $$13, dpb.b((long)$$6), 2);
         if (!$$14) {
            throw e.create();
         } else {
            $$0.a(() -> wu.a("commands.place.template.success", wu.a($$1), $$2.u(), $$2.v(), $$2.w()), true);
            return 1;
         }
      }
   }

   private static void a(aqh $$0, czk $$1, czk $$2) throws CommandSyntaxException {
      if (czk.a($$1, $$2).filter($$1x -> !$$0.p($$1x.l())).findAny().isPresent()) {
         throw fz.a.create();
      }
   }
}

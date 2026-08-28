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

public class aot {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xg.c("commands.place.feature.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xg.c("commands.place.jigsaw.failed"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xg.c("commands.place.structure.failed"));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xg.b("commands.place.template.invalid", $$0));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xg.c("commands.place.template.failed"));
   private static final SuggestionProvider<ek> f = ($$0, $$1) -> {
      ewq $$2 = ((ek)$$0.getSource()).e().r();
      return ep.a($$2.a(), $$1);
   };

   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("place")
                        .requires($$0x -> $$0x.c(2)))
                     .then(
                        el.a("feature")
                           .then(
                              ((RequiredArgumentBuilder)el.a("feature", fk.a(mi.aL))
                                    .executes($$0x -> a((ek)$$0x.getSource(), fk.a($$0x, "feature"), iw.a((jq)((ek)$$0x.getSource()).d()))))
                                 .then(el.a("pos", gh.a()).executes($$0x -> a((ek)$$0x.getSource(), fk.a($$0x, "feature"), gh.a($$0x, "pos"))))
                           )
                     ))
                  .then(
                     el.a("jigsaw")
                        .then(
                           el.a("pool", fk.a(mi.bf))
                              .then(
                                 el.a("target", fl.a())
                                    .then(
                                       ((RequiredArgumentBuilder)el.a("max_depth", IntegerArgumentType.integer(1, 20))
                                             .executes(
                                                $$0x -> a(
                                                      (ek)$$0x.getSource(),
                                                      fk.c($$0x, "pool"),
                                                      fl.a($$0x, "target"),
                                                      IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                      iw.a((jq)((ek)$$0x.getSource()).d())
                                                   )
                                             ))
                                          .then(
                                             el.a("position", gh.a())
                                                .executes(
                                                   $$0x -> a(
                                                         (ek)$$0x.getSource(),
                                                         fk.c($$0x, "pool"),
                                                         fl.a($$0x, "target"),
                                                         IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                         gh.a($$0x, "position")
                                                      )
                                                )
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  el.a("structure")
                     .then(
                        ((RequiredArgumentBuilder)el.a("structure", fk.a(mi.be))
                              .executes($$0x -> b((ek)$$0x.getSource(), fk.b($$0x, "structure"), iw.a((jq)((ek)$$0x.getSource()).d()))))
                           .then(el.a("pos", gh.a()).executes($$0x -> b((ek)$$0x.getSource(), fk.b($$0x, "structure"), gh.a($$0x, "pos"))))
                     )
               ))
            .then(
               el.a("template")
                  .then(
                     ((RequiredArgumentBuilder)el.a("template", fl.a())
                           .suggests(f)
                           .executes(
                              $$0x -> a((ek)$$0x.getSource(), fl.a($$0x, "template"), iw.a((jq)((ek)$$0x.getSource()).d()), dui.a, dsr.a, 1.0F, 0, false)
                           ))
                        .then(
                           ((RequiredArgumentBuilder)el.a("pos", gh.a())
                                 .executes($$0x -> a((ek)$$0x.getSource(), fl.a($$0x, "template"), gh.a($$0x, "pos"), dui.a, dsr.a, 1.0F, 0, false)))
                              .then(
                                 ((RequiredArgumentBuilder)el.a("rotation", fz.a())
                                       .executes(
                                          $$0x -> a(
                                                (ek)$$0x.getSource(), fl.a($$0x, "template"), gh.a($$0x, "pos"), fz.a($$0x, "rotation"), dsr.a, 1.0F, 0, false
                                             )
                                       ))
                                    .then(
                                       ((RequiredArgumentBuilder)el.a("mirror", fy.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ek)$$0x.getSource(),
                                                      fl.a($$0x, "template"),
                                                      gh.a($$0x, "pos"),
                                                      fz.a($$0x, "rotation"),
                                                      fy.a($$0x, "mirror"),
                                                      1.0F,
                                                      0,
                                                      false
                                                   )
                                             ))
                                          .then(
                                             ((RequiredArgumentBuilder)el.a("integrity", FloatArgumentType.floatArg(0.0F, 1.0F))
                                                   .executes(
                                                      $$0x -> a(
                                                            (ek)$$0x.getSource(),
                                                            fl.a($$0x, "template"),
                                                            gh.a($$0x, "pos"),
                                                            fz.a($$0x, "rotation"),
                                                            fy.a($$0x, "mirror"),
                                                            FloatArgumentType.getFloat($$0x, "integrity"),
                                                            0,
                                                            false
                                                         )
                                                   ))
                                                .then(
                                                   ((RequiredArgumentBuilder)el.a("seed", IntegerArgumentType.integer())
                                                         .executes(
                                                            $$0x -> a(
                                                                  (ek)$$0x.getSource(),
                                                                  fl.a($$0x, "template"),
                                                                  gh.a($$0x, "pos"),
                                                                  fz.a($$0x, "rotation"),
                                                                  fy.a($$0x, "mirror"),
                                                                  FloatArgumentType.getFloat($$0x, "integrity"),
                                                                  IntegerArgumentType.getInteger($$0x, "seed"),
                                                                  false
                                                               )
                                                         ))
                                                      .then(
                                                         el.a("strict")
                                                            .executes(
                                                               $$0x -> a(
                                                                     (ek)$$0x.getSource(),
                                                                     fl.a($$0x, "template"),
                                                                     gh.a($$0x, "pos"),
                                                                     fz.a($$0x, "rotation"),
                                                                     fy.a($$0x, "mirror"),
                                                                     FloatArgumentType.getFloat($$0x, "integrity"),
                                                                     IntegerArgumentType.getInteger($$0x, "seed"),
                                                                     true
                                                                  )
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

   public static int a(ek $$0, jg.c<ekh<?, ?>> $$1, iw $$2) throws CommandSyntaxException {
      asb $$3 = $$0.e();
      ekh<?, ?> $$4 = $$1.a();
      djo $$5 = new djo($$2);
      a($$3, new djo($$5.h - 1, $$5.i - 1), new djo($$5.h + 1, $$5.i + 1));
      if (!$$4.a($$3, $$3.m().g(), $$3.G_(), $$2)) {
         throw a.create();
      } else {
         String $$6 = $$1.h().a().toString();
         $$0.a(() -> xg.a("commands.place.feature.success", $$6, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(ek $$0, jg<etx> $$1, alr $$2, int $$3, iw $$4) throws CommandSyntaxException {
      asb $$5 = $$0.e();
      djo $$6 = new djo($$4);
      a($$5, $$6, $$6);
      if (!etr.a($$5, $$1, $$2, $$3, $$4, false)) {
         throw b.create();
      } else {
         $$0.a(() -> xg.a("commands.place.jigsaw.success", $$4.u(), $$4.v(), $$4.w()), true);
         return 1;
      }
   }

   public static int b(ek $$0, jg.c<esn> $$1, iw $$2) throws CommandSyntaxException {
      asb $$3 = $$0.e();
      esn $$4 = $$1.a();
      edo $$5 = $$3.m().g();
      esv $$6 = $$4.a($$1, $$3.aj(), $$0.u(), $$5, $$5.d(), $$3.m().i(), $$3.r(), $$3.E(), new djo($$2), 0, $$3, $$0x -> true);
      if (!$$6.b()) {
         throw c.create();
      } else {
         esf $$7 = $$6.a();
         djo $$8 = new djo(jz.a($$7.h()), jz.a($$7.j()));
         djo $$9 = new djo(jz.a($$7.k()), jz.a($$7.m()));
         a($$3, $$8, $$9);
         djo.a($$8, $$9).forEach($$3x -> $$6.a($$3, $$3.b(), $$5, $$3.G_(), new esf($$3x.d(), $$3.K_(), $$3x.e(), $$3x.f(), $$3.ao() + 1, $$3x.g()), $$3x));
         String $$10 = $$1.h().a().toString();
         $$0.a(() -> xg.a("commands.place.structure.success", $$10, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(ek $$0, alr $$1, iw $$2, dui $$3, dsr $$4, float $$5, int $$6, boolean $$7) throws CommandSyntaxException {
      asb $$8 = $$0.e();
      ewq $$9 = $$8.r();

      Optional<ewp> $$10;
      try {
         $$10 = $$9.b($$1);
      } catch (ab var14) {
         throw d.create($$1);
      }

      if ($$10.isEmpty()) {
         throw d.create($$1);
      } else {
         ewp $$13 = $$10.get();
         a($$8, new djo($$2), new djo($$2.a($$13.a())));
         ewl $$14 = new ewl().a($$4).a($$3).b($$7);
         if ($$5 < 1.0F) {
            $$14.b().a(new evs($$5)).a(eah.b((long)$$6));
         }

         boolean $$15 = $$13.a($$8, $$2, $$2, $$14, eah.b((long)$$6), 2 | ($$7 ? 816 : 0));
         if (!$$15) {
            throw e.create();
         } else {
            $$0.a(() -> xg.a("commands.place.template.success", xg.a($$1), $$2.u(), $$2.v(), $$2.w()), true);
            return 1;
         }
      }
   }

   private static void a(asb $$0, djo $$1, djo $$2) throws CommandSyntaxException {
      if (djo.a($$1, $$2).filter($$1x -> !$$0.p($$1x.l())).findAny().isPresent()) {
         throw gh.a.create();
      }
   }
}

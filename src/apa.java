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

public class apa {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xv.c("commands.place.feature.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xv.c("commands.place.jigsaw.failed"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xv.c("commands.place.structure.failed"));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xv.b("commands.place.template.invalid", $$0));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xv.c("commands.place.template.failed"));
   private static final SuggestionProvider<ew> f = ($$0, $$1) -> {
      esf $$2 = ((ew)$$0.getSource()).e().r();
      return fb.a($$2.a(), $$1);
   };

   public static void a(CommandDispatcher<ew> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("place")
                        .requires($$0x -> $$0x.c(2)))
                     .then(
                        ex.a("feature")
                           .then(
                              ((RequiredArgumentBuilder)ex.a("feature", fw.a(mb.aK))
                                    .executes($$0x -> a((ew)$$0x.getSource(), fw.a($$0x, "feature"), jh.a((ka)((ew)$$0x.getSource()).d()))))
                                 .then(ex.a("pos", gs.a()).executes($$0x -> a((ew)$$0x.getSource(), fw.a($$0x, "feature"), gs.a($$0x, "pos"))))
                           )
                     ))
                  .then(
                     ex.a("jigsaw")
                        .then(
                           ex.a("pool", fw.a(mb.aW))
                              .then(
                                 ex.a("target", fx.a())
                                    .then(
                                       ((RequiredArgumentBuilder)ex.a("max_depth", IntegerArgumentType.integer(1, 20))
                                             .executes(
                                                $$0x -> a(
                                                      (ew)$$0x.getSource(),
                                                      fw.c($$0x, "pool"),
                                                      fx.a($$0x, "target"),
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
                                                         fx.a($$0x, "target"),
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
                        ((RequiredArgumentBuilder)ex.a("structure", fw.a(mb.aT))
                              .executes($$0x -> b((ew)$$0x.getSource(), fw.b($$0x, "structure"), jh.a((ka)((ew)$$0x.getSource()).d()))))
                           .then(ex.a("pos", gs.a()).executes($$0x -> b((ew)$$0x.getSource(), fw.b($$0x, "structure"), gs.a($$0x, "pos"))))
                     )
               ))
            .then(
               ex.a("template")
                  .then(
                     ((RequiredArgumentBuilder)ex.a("template", fx.a())
                           .suggests(f)
                           .executes($$0x -> a((ew)$$0x.getSource(), fx.a($$0x, "template"), jh.a((ka)((ew)$$0x.getSource()).d()), dqu.a, dpd.a, 1.0F, 0)))
                        .then(
                           ((RequiredArgumentBuilder)ex.a("pos", gs.a())
                                 .executes($$0x -> a((ew)$$0x.getSource(), fx.a($$0x, "template"), gs.a($$0x, "pos"), dqu.a, dpd.a, 1.0F, 0)))
                              .then(
                                 ((RequiredArgumentBuilder)ex.a("rotation", gk.a())
                                       .executes(
                                          $$0x -> a((ew)$$0x.getSource(), fx.a($$0x, "template"), gs.a($$0x, "pos"), gk.a($$0x, "rotation"), dpd.a, 1.0F, 0)
                                       ))
                                    .then(
                                       ((RequiredArgumentBuilder)ex.a("mirror", gj.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ew)$$0x.getSource(),
                                                      fx.a($$0x, "template"),
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
                                                            fx.a($$0x, "template"),
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
                                                               fx.a($$0x, "template"),
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

   public static int a(ew $$0, jq.c<ega<?, ?>> $$1, jh $$2) throws CommandSyntaxException {
      ash $$3 = $$0.e();
      ega<?, ?> $$4 = $$1.a();
      dgg $$5 = new dgg($$2);
      a($$3, new dgg($$5.g - 1, $$5.h - 1), new dgg($$5.g + 1, $$5.h + 1));
      if (!$$4.a($$3, $$3.m().g(), $$3.H_(), $$2)) {
         throw a.create();
      } else {
         String $$6 = $$1.h().a().toString();
         $$0.a(() -> xv.a("commands.place.feature.success", $$6, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(ew $$0, jq<epm> $$1, alz $$2, int $$3, jh $$4) throws CommandSyntaxException {
      ash $$5 = $$0.e();
      dgg $$6 = new dgg($$4);
      a($$5, $$6, $$6);
      if (!epg.a($$5, $$1, $$2, $$3, $$4, false)) {
         throw b.create();
      } else {
         $$0.a(() -> xv.a("commands.place.jigsaw.success", $$4.u(), $$4.v(), $$4.w()), true);
         return 1;
      }
   }

   public static int b(ew $$0, jq.c<eoc> $$1, jh $$2) throws CommandSyntaxException {
      ash $$3 = $$0.e();
      eoc $$4 = $$1.a();
      dzj $$5 = $$3.m().g();
      eok $$6 = $$4.a($$0.u(), $$5, $$5.d(), $$3.m().i(), $$3.r(), $$3.D(), new dgg($$2), 0, $$3, $$0x -> true);
      if (!$$6.b()) {
         throw c.create();
      } else {
         enu $$7 = $$6.a();
         dgg $$8 = new dgg(kj.a($$7.h()), kj.a($$7.j()));
         dgg $$9 = new dgg(kj.a($$7.k()), kj.a($$7.m()));
         a($$3, $$8, $$9);
         dgg.a($$8, $$9).forEach($$3x -> $$6.a($$3, $$3.b(), $$5, $$3.H_(), new enu($$3x.d(), $$3.L_(), $$3x.e(), $$3x.f(), $$3.am() + 1, $$3x.g()), $$3x));
         String $$10 = $$1.h().a().toString();
         $$0.a(() -> xv.a("commands.place.structure.success", $$10, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(ew $$0, alz $$1, jh $$2, dqu $$3, dpd $$4, float $$5, int $$6) throws CommandSyntaxException {
      ash $$7 = $$0.e();
      esf $$8 = $$7.r();

      Optional<ese> $$9;
      try {
         $$9 = $$8.b($$1);
      } catch (aa var13) {
         throw d.create($$1);
      }

      if ($$9.isEmpty()) {
         throw d.create($$1);
      } else {
         ese $$12 = $$9.get();
         a($$7, new dgg($$2), new dgg($$2.a($$12.a())));
         esa $$13 = new esa().a($$4).a($$3);
         if ($$5 < 1.0F) {
            $$13.b().a(new erh($$5)).a(dwh.b((long)$$6));
         }

         boolean $$14 = $$12.a($$7, $$2, $$2, $$13, dwh.b((long)$$6), 2);
         if (!$$14) {
            throw e.create();
         } else {
            $$0.a(() -> xv.a("commands.place.template.success", xv.a($$1), $$2.u(), $$2.v(), $$2.w()), true);
            return 1;
         }
      }
   }

   private static void a(ash $$0, dgg $$1, dgg $$2) throws CommandSyntaxException {
      if (dgg.a($$1, $$2).filter($$1x -> !$$0.p($$1x.l())).findAny().isPresent()) {
         throw gs.a.create();
      }
   }
}

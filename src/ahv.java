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

public class ahv {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tl.c("commands.place.feature.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(tl.c("commands.place.jigsaw.failed"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(tl.c("commands.place.structure.failed"));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> tl.b("commands.place.template.invalid", $$0));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(tl.c("commands.place.template.failed"));
   private static final SuggestionProvider<dt> f = ($$0, $$1) -> {
      dyw $$2 = ((dt)$$0.getSource()).e().p();
      return dw.a($$2.a(), $$1);
   };

   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("place")
                        .requires($$0x -> $$0x.c(2)))
                     .then(
                        du.a("feature")
                           .then(
                              ((RequiredArgumentBuilder)du.a("feature", er.a(jc.at))
                                    .executes($$0x -> a((dt)$$0x.getSource(), er.a($$0x, "feature"), gw.a(((dt)$$0x.getSource()).d()))))
                                 .then(du.a("pos", fk.a()).executes($$0x -> a((dt)$$0x.getSource(), er.a($$0x, "feature"), fk.a($$0x, "pos"))))
                           )
                     ))
                  .then(
                     du.a("jigsaw")
                        .then(
                           du.a("pool", er.a(jc.aD))
                              .then(
                                 du.a("target", es.a())
                                    .then(
                                       ((RequiredArgumentBuilder)du.a("max_depth", IntegerArgumentType.integer(1, 7))
                                             .executes(
                                                $$0x -> a(
                                                      (dt)$$0x.getSource(),
                                                      er.c($$0x, "pool"),
                                                      es.e($$0x, "target"),
                                                      IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                      gw.a(((dt)$$0x.getSource()).d())
                                                   )
                                             ))
                                          .then(
                                             du.a("position", fk.a())
                                                .executes(
                                                   $$0x -> a(
                                                         (dt)$$0x.getSource(),
                                                         er.c($$0x, "pool"),
                                                         es.e($$0x, "target"),
                                                         IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                         fk.a($$0x, "position")
                                                      )
                                                )
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  du.a("structure")
                     .then(
                        ((RequiredArgumentBuilder)du.a("structure", er.a(jc.aA))
                              .executes($$0x -> b((dt)$$0x.getSource(), er.b($$0x, "structure"), gw.a(((dt)$$0x.getSource()).d()))))
                           .then(du.a("pos", fk.a()).executes($$0x -> b((dt)$$0x.getSource(), er.b($$0x, "structure"), fk.a($$0x, "pos"))))
                     )
               ))
            .then(
               du.a("template")
                  .then(
                     ((RequiredArgumentBuilder)du.a("template", es.a())
                           .suggests(f)
                           .executes($$0x -> a((dt)$$0x.getSource(), es.e($$0x, "template"), gw.a(((dt)$$0x.getSource()).d()), czn.a, cxx.a, 1.0F, 0)))
                        .then(
                           ((RequiredArgumentBuilder)du.a("pos", fk.a())
                                 .executes($$0x -> a((dt)$$0x.getSource(), es.e($$0x, "template"), fk.a($$0x, "pos"), czn.a, cxx.a, 1.0F, 0)))
                              .then(
                                 ((RequiredArgumentBuilder)du.a("rotation", fc.a())
                                       .executes(
                                          $$0x -> a((dt)$$0x.getSource(), es.e($$0x, "template"), fk.a($$0x, "pos"), fc.a($$0x, "rotation"), cxx.a, 1.0F, 0)
                                       ))
                                    .then(
                                       ((RequiredArgumentBuilder)du.a("mirror", fb.a())
                                             .executes(
                                                $$0x -> a(
                                                      (dt)$$0x.getSource(),
                                                      es.e($$0x, "template"),
                                                      fk.a($$0x, "pos"),
                                                      fc.a($$0x, "rotation"),
                                                      fb.a($$0x, "mirror"),
                                                      1.0F,
                                                      0
                                                   )
                                             ))
                                          .then(
                                             ((RequiredArgumentBuilder)du.a("integrity", FloatArgumentType.floatArg(0.0F, 1.0F))
                                                   .executes(
                                                      $$0x -> a(
                                                            (dt)$$0x.getSource(),
                                                            es.e($$0x, "template"),
                                                            fk.a($$0x, "pos"),
                                                            fc.a($$0x, "rotation"),
                                                            fb.a($$0x, "mirror"),
                                                            FloatArgumentType.getFloat($$0x, "integrity"),
                                                            0
                                                         )
                                                   ))
                                                .then(
                                                   du.a("seed", IntegerArgumentType.integer())
                                                      .executes(
                                                         $$0x -> a(
                                                               (dt)$$0x.getSource(),
                                                               es.e($$0x, "template"),
                                                               fk.a($$0x, "pos"),
                                                               fc.a($$0x, "rotation"),
                                                               fb.a($$0x, "mirror"),
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

   public static int a(dt $$0, he.c<dnd<?, ?>> $$1, gw $$2) throws CommandSyntaxException {
      akt $$3 = $$0.e();
      dnd<?, ?> $$4 = $$1.a();
      cpi $$5 = new cpi($$2);
      a($$3, new cpi($$5.e - 1, $$5.f - 1), new cpi($$5.e + 1, $$5.f + 1));
      if (!$$4.a($$3, $$3.k().g(), $$3.D_(), $$2)) {
         throw a.create();
      } else {
         String $$6 = $$1.g().a().toString();
         $$0.a(() -> tl.a("commands.place.feature.success", $$6, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(dt $$0, he<dwl> $$1, aez $$2, int $$3, gw $$4) throws CommandSyntaxException {
      akt $$5 = $$0.e();
      if (!dwf.a($$5, $$1, $$2, $$3, $$4, false)) {
         throw b.create();
      } else {
         $$0.a(() -> tl.a("commands.place.jigsaw.success", $$4.u(), $$4.v(), $$4.w()), true);
         return 1;
      }
   }

   public static int b(dt $$0, he.c<dvc> $$1, gw $$2) throws CommandSyntaxException {
      akt $$3 = $$0.e();
      dvc $$4 = $$1.a();
      dha $$5 = $$3.k().g();
      dvk $$6 = $$4.a($$0.v(), $$5, $$5.c(), $$3.k().i(), $$3.p(), $$3.A(), new cpi($$2), 0, $$3, $$0x -> true);
      if (!$$6.b()) {
         throw c.create();
      } else {
         duu $$7 = $$6.a();
         cpi $$8 = new cpi(hw.a($$7.g()), hw.a($$7.i()));
         cpi $$9 = new cpi(hw.a($$7.j()), hw.a($$7.l()));
         a($$3, $$8, $$9);
         cpi.a($$8, $$9).forEach($$3x -> $$6.a($$3, $$3.a(), $$5, $$3.D_(), new duu($$3x.d(), $$3.H_(), $$3x.e(), $$3x.f(), $$3.aj(), $$3x.g()), $$3x));
         String $$10 = $$1.g().a().toString();
         $$0.a(() -> tl.a("commands.place.structure.success", $$10, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(dt $$0, aez $$1, gw $$2, czn $$3, cxx $$4, float $$5, int $$6) throws CommandSyntaxException {
      akt $$7 = $$0.e();
      dyw $$8 = $$7.p();

      Optional<dyv> $$9;
      try {
         $$9 = $$8.b($$1);
      } catch (z var13) {
         throw d.create($$1);
      }

      if ($$9.isEmpty()) {
         throw d.create($$1);
      } else {
         dyv $$12 = $$9.get();
         a($$7, new cpi($$2), new cpi($$2.a($$12.a())));
         dyr $$13 = new dyr().a($$4).a($$3);
         if ($$5 < 1.0F) {
            $$13.b().a(new dxz($$5)).a(dem.b((long)$$6));
         }

         boolean $$14 = $$12.a($$7, $$2, $$2, $$13, dem.b((long)$$6), 2);
         if (!$$14) {
            throw e.create();
         } else {
            $$0.a(() -> tl.a("commands.place.template.success", tl.a($$1), $$2.u(), $$2.v(), $$2.w()), true);
            return 1;
         }
      }
   }

   private static void a(akt $$0, cpi $$1, cpi $$2) throws CommandSyntaxException {
      if (cpi.a($$1, $$2).filter($$1x -> !$$0.o($$1x.l())).findAny().isPresent()) {
         throw fk.a.create();
      }
   }
}

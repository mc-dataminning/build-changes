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

public class anc {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ws.c("commands.place.feature.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ws.c("commands.place.jigsaw.failed"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(ws.c("commands.place.structure.failed"));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> ws.b("commands.place.template.invalid", $$0));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(ws.c("commands.place.template.failed"));
   private static final SuggestionProvider<ec> f = ($$0, $$1) -> {
      ekh $$2 = ((ec)$$0.getSource()).e().q();
      return eh.a($$2.a(), $$1);
   };

   public static void a(CommandDispatcher<ec> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("place")
                        .requires($$0x -> $$0x.c(2)))
                     .then(
                        ed.a("feature")
                           .then(
                              ((RequiredArgumentBuilder)ed.a("feature", fc.a(ld.aB))
                                    .executes($$0x -> a((ec)$$0x.getSource(), fc.a($$0x, "feature"), im.a(((ec)$$0x.getSource()).d()))))
                                 .then(ed.a("pos", fx.a()).executes($$0x -> a((ec)$$0x.getSource(), fc.a($$0x, "feature"), fx.a($$0x, "pos"))))
                           )
                     ))
                  .then(
                     ed.a("jigsaw")
                        .then(
                           ed.a("pool", fc.a(ld.aL))
                              .then(
                                 ed.a("target", fd.a())
                                    .then(
                                       ((RequiredArgumentBuilder)ed.a("max_depth", IntegerArgumentType.integer(1, 20))
                                             .executes(
                                                $$0x -> a(
                                                      (ec)$$0x.getSource(),
                                                      fc.c($$0x, "pool"),
                                                      fd.e($$0x, "target"),
                                                      IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                      im.a(((ec)$$0x.getSource()).d())
                                                   )
                                             ))
                                          .then(
                                             ed.a("position", fx.a())
                                                .executes(
                                                   $$0x -> a(
                                                         (ec)$$0x.getSource(),
                                                         fc.c($$0x, "pool"),
                                                         fd.e($$0x, "target"),
                                                         IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                         fx.a($$0x, "position")
                                                      )
                                                )
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  ed.a("structure")
                     .then(
                        ((RequiredArgumentBuilder)ed.a("structure", fc.a(ld.aI))
                              .executes($$0x -> b((ec)$$0x.getSource(), fc.b($$0x, "structure"), im.a(((ec)$$0x.getSource()).d()))))
                           .then(ed.a("pos", fx.a()).executes($$0x -> b((ec)$$0x.getSource(), fc.b($$0x, "structure"), fx.a($$0x, "pos"))))
                     )
               ))
            .then(
               ed.a("template")
                  .then(
                     ((RequiredArgumentBuilder)ed.a("template", fd.a())
                           .suggests(f)
                           .executes($$0x -> a((ec)$$0x.getSource(), fd.e($$0x, "template"), im.a(((ec)$$0x.getSource()).d()), dji.a, dhs.a, 1.0F, 0)))
                        .then(
                           ((RequiredArgumentBuilder)ed.a("pos", fx.a())
                                 .executes($$0x -> a((ec)$$0x.getSource(), fd.e($$0x, "template"), fx.a($$0x, "pos"), dji.a, dhs.a, 1.0F, 0)))
                              .then(
                                 ((RequiredArgumentBuilder)ed.a("rotation", fp.a())
                                       .executes(
                                          $$0x -> a((ec)$$0x.getSource(), fd.e($$0x, "template"), fx.a($$0x, "pos"), fp.a($$0x, "rotation"), dhs.a, 1.0F, 0)
                                       ))
                                    .then(
                                       ((RequiredArgumentBuilder)ed.a("mirror", fo.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ec)$$0x.getSource(),
                                                      fd.e($$0x, "template"),
                                                      fx.a($$0x, "pos"),
                                                      fp.a($$0x, "rotation"),
                                                      fo.a($$0x, "mirror"),
                                                      1.0F,
                                                      0
                                                   )
                                             ))
                                          .then(
                                             ((RequiredArgumentBuilder)ed.a("integrity", FloatArgumentType.floatArg(0.0F, 1.0F))
                                                   .executes(
                                                      $$0x -> a(
                                                            (ec)$$0x.getSource(),
                                                            fd.e($$0x, "template"),
                                                            fx.a($$0x, "pos"),
                                                            fp.a($$0x, "rotation"),
                                                            fo.a($$0x, "mirror"),
                                                            FloatArgumentType.getFloat($$0x, "integrity"),
                                                            0
                                                         )
                                                   ))
                                                .then(
                                                   ed.a("seed", IntegerArgumentType.integer())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ec)$$0x.getSource(),
                                                               fd.e($$0x, "template"),
                                                               fx.a($$0x, "pos"),
                                                               fp.a($$0x, "rotation"),
                                                               fo.a($$0x, "mirror"),
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

   public static int a(ec $$0, iv.c<dyh<?, ?>> $$1, im $$2) throws CommandSyntaxException {
      aqe $$3 = $$0.e();
      dyh<?, ?> $$4 = $$1.a();
      czb $$5 = new czb($$2);
      a($$3, new czb($$5.e - 1, $$5.f - 1), new czb($$5.e + 1, $$5.f + 1));
      if (!$$4.a($$3, $$3.l().g(), $$3.E_(), $$2)) {
         throw a.create();
      } else {
         String $$6 = $$1.h().a().toString();
         $$0.a(() -> ws.a("commands.place.feature.success", $$6, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(ec $$0, iv<ehp> $$1, akf $$2, int $$3, im $$4) throws CommandSyntaxException {
      aqe $$5 = $$0.e();
      if (!ehj.a($$5, $$1, $$2, $$3, $$4, false)) {
         throw b.create();
      } else {
         $$0.a(() -> ws.a("commands.place.jigsaw.success", $$4.u(), $$4.v(), $$4.w()), true);
         return 1;
      }
   }

   public static int b(ec $$0, iv.c<egg> $$1, im $$2) throws CommandSyntaxException {
      aqe $$3 = $$0.e();
      egg $$4 = $$1.a();
      drv $$5 = $$3.l().g();
      ego $$6 = $$4.a($$0.v(), $$5, $$5.c(), $$3.l().i(), $$3.q(), $$3.C(), new czb($$2), 0, $$3, $$0x -> true);
      if (!$$6.b()) {
         throw c.create();
      } else {
         efy $$7 = $$6.a();
         czb $$8 = new czb(jo.a($$7.h()), jo.a($$7.j()));
         czb $$9 = new czb(jo.a($$7.k()), jo.a($$7.m()));
         a($$3, $$8, $$9);
         czb.a($$8, $$9).forEach($$3x -> $$6.a($$3, $$3.a(), $$5, $$3.E_(), new efy($$3x.d(), $$3.I_(), $$3x.e(), $$3x.f(), $$3.al(), $$3x.g()), $$3x));
         String $$10 = $$1.h().a().toString();
         $$0.a(() -> ws.a("commands.place.structure.success", $$10, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(ec $$0, akf $$1, im $$2, dji $$3, dhs $$4, float $$5, int $$6) throws CommandSyntaxException {
      aqe $$7 = $$0.e();
      ekh $$8 = $$7.q();

      Optional<ekg> $$9;
      try {
         $$9 = $$8.b($$1);
      } catch (z var13) {
         throw d.create($$1);
      }

      if ($$9.isEmpty()) {
         throw d.create($$1);
      } else {
         ekg $$12 = $$9.get();
         a($$7, new czb($$2), new czb($$2.a($$12.a())));
         ekc $$13 = new ekc().a($$4).a($$3);
         if ($$5 < 1.0F) {
            $$13.b().a(new ejk($$5)).a(dos.b((long)$$6));
         }

         boolean $$14 = $$12.a($$7, $$2, $$2, $$13, dos.b((long)$$6), 2);
         if (!$$14) {
            throw e.create();
         } else {
            $$0.a(() -> ws.a("commands.place.template.success", ws.a($$1), $$2.u(), $$2.v(), $$2.w()), true);
            return 1;
         }
      }
   }

   private static void a(aqe $$0, czb $$1, czb $$2) throws CommandSyntaxException {
      if (czb.a($$1, $$2).filter($$1x -> !$$0.p($$1x.l())).findAny().isPresent()) {
         throw fx.a.create();
      }
   }
}

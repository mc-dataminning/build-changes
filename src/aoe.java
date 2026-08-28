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

public class aoe {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("commands.place.feature.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xe.c("commands.place.jigsaw.failed"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xe.c("commands.place.structure.failed"));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xe.b("commands.place.template.invalid", $$0));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xe.c("commands.place.template.failed"));
   private static final SuggestionProvider<eu> f = ($$0, $$1) -> {
      epj $$2 = ((eu)$$0.getSource()).e().q();
      return ez.a($$2.a(), $$1);
   };

   public static void a(CommandDispatcher<eu> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("place")
                        .requires($$0x -> $$0x.c(2)))
                     .then(
                        ev.a("feature")
                           .then(
                              ((RequiredArgumentBuilder)ev.a("feature", fu.a(lw.aK))
                                    .executes($$0x -> a((eu)$$0x.getSource(), fu.a($$0x, "feature"), jf.a((jy)((eu)$$0x.getSource()).d()))))
                                 .then(ev.a("pos", gq.a()).executes($$0x -> a((eu)$$0x.getSource(), fu.a($$0x, "feature"), gq.a($$0x, "pos"))))
                           )
                     ))
                  .then(
                     ev.a("jigsaw")
                        .then(
                           ev.a("pool", fu.a(lw.aW))
                              .then(
                                 ev.a("target", fv.a())
                                    .then(
                                       ((RequiredArgumentBuilder)ev.a("max_depth", IntegerArgumentType.integer(1, 20))
                                             .executes(
                                                $$0x -> a(
                                                      (eu)$$0x.getSource(),
                                                      fu.c($$0x, "pool"),
                                                      fv.c($$0x, "target"),
                                                      IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                      jf.a((jy)((eu)$$0x.getSource()).d())
                                                   )
                                             ))
                                          .then(
                                             ev.a("position", gq.a())
                                                .executes(
                                                   $$0x -> a(
                                                         (eu)$$0x.getSource(),
                                                         fu.c($$0x, "pool"),
                                                         fv.c($$0x, "target"),
                                                         IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                         gq.a($$0x, "position")
                                                      )
                                                )
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  ev.a("structure")
                     .then(
                        ((RequiredArgumentBuilder)ev.a("structure", fu.a(lw.aT))
                              .executes($$0x -> b((eu)$$0x.getSource(), fu.b($$0x, "structure"), jf.a((jy)((eu)$$0x.getSource()).d()))))
                           .then(ev.a("pos", gq.a()).executes($$0x -> b((eu)$$0x.getSource(), fu.b($$0x, "structure"), gq.a($$0x, "pos"))))
                     )
               ))
            .then(
               ev.a("template")
                  .then(
                     ((RequiredArgumentBuilder)ev.a("template", fv.a())
                           .suggests(f)
                           .executes($$0x -> a((eu)$$0x.getSource(), fv.c($$0x, "template"), jf.a((jy)((eu)$$0x.getSource()).d()), doa.a, dmj.a, 1.0F, 0)))
                        .then(
                           ((RequiredArgumentBuilder)ev.a("pos", gq.a())
                                 .executes($$0x -> a((eu)$$0x.getSource(), fv.c($$0x, "template"), gq.a($$0x, "pos"), doa.a, dmj.a, 1.0F, 0)))
                              .then(
                                 ((RequiredArgumentBuilder)ev.a("rotation", gi.a())
                                       .executes(
                                          $$0x -> a((eu)$$0x.getSource(), fv.c($$0x, "template"), gq.a($$0x, "pos"), gi.a($$0x, "rotation"), dmj.a, 1.0F, 0)
                                       ))
                                    .then(
                                       ((RequiredArgumentBuilder)ev.a("mirror", gh.a())
                                             .executes(
                                                $$0x -> a(
                                                      (eu)$$0x.getSource(),
                                                      fv.c($$0x, "template"),
                                                      gq.a($$0x, "pos"),
                                                      gi.a($$0x, "rotation"),
                                                      gh.a($$0x, "mirror"),
                                                      1.0F,
                                                      0
                                                   )
                                             ))
                                          .then(
                                             ((RequiredArgumentBuilder)ev.a("integrity", FloatArgumentType.floatArg(0.0F, 1.0F))
                                                   .executes(
                                                      $$0x -> a(
                                                            (eu)$$0x.getSource(),
                                                            fv.c($$0x, "template"),
                                                            gq.a($$0x, "pos"),
                                                            gi.a($$0x, "rotation"),
                                                            gh.a($$0x, "mirror"),
                                                            FloatArgumentType.getFloat($$0x, "integrity"),
                                                            0
                                                         )
                                                   ))
                                                .then(
                                                   ev.a("seed", IntegerArgumentType.integer())
                                                      .executes(
                                                         $$0x -> a(
                                                               (eu)$$0x.getSource(),
                                                               fv.c($$0x, "template"),
                                                               gq.a($$0x, "pos"),
                                                               gi.a($$0x, "rotation"),
                                                               gh.a($$0x, "mirror"),
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

   public static int a(eu $$0, jo.c<edg<?, ?>> $$1, jf $$2) throws CommandSyntaxException {
      arj $$3 = $$0.e();
      edg<?, ?> $$4 = $$1.a();
      ddp $$5 = new ddp($$2);
      a($$3, new ddp($$5.e - 1, $$5.f - 1), new ddp($$5.e + 1, $$5.f + 1));
      if (!$$4.a($$3, $$3.l().g(), $$3.D_(), $$2)) {
         throw a.create();
      } else {
         String $$6 = $$1.h().a().toString();
         $$0.a(() -> xe.a("commands.place.feature.success", $$6, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(eu $$0, jo<emq> $$1, ale $$2, int $$3, jf $$4) throws CommandSyntaxException {
      arj $$5 = $$0.e();
      ddp $$6 = new ddp($$4);
      a($$5, $$6, $$6);
      if (!emk.a($$5, $$1, $$2, $$3, $$4, false)) {
         throw b.create();
      } else {
         $$0.a(() -> xe.a("commands.place.jigsaw.success", $$4.u(), $$4.v(), $$4.w()), true);
         return 1;
      }
   }

   public static int b(eu $$0, jo.c<elg> $$1, jf $$2) throws CommandSyntaxException {
      arj $$3 = $$0.e();
      elg $$4 = $$1.a();
      dwp $$5 = $$3.l().g();
      elo $$6 = $$4.a($$0.v(), $$5, $$5.d(), $$3.l().i(), $$3.q(), $$3.C(), new ddp($$2), 0, $$3, $$0x -> true);
      if (!$$6.b()) {
         throw c.create();
      } else {
         eky $$7 = $$6.a();
         ddp $$8 = new ddp(kh.a($$7.h()), kh.a($$7.j()));
         ddp $$9 = new ddp(kh.a($$7.k()), kh.a($$7.m()));
         a($$3, $$8, $$9);
         ddp.a($$8, $$9).forEach($$3x -> $$6.a($$3, $$3.a(), $$5, $$3.D_(), new eky($$3x.d(), $$3.H_(), $$3x.e(), $$3x.f(), $$3.an() + 1, $$3x.g()), $$3x));
         String $$10 = $$1.h().a().toString();
         $$0.a(() -> xe.a("commands.place.structure.success", $$10, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(eu $$0, ale $$1, jf $$2, doa $$3, dmj $$4, float $$5, int $$6) throws CommandSyntaxException {
      arj $$7 = $$0.e();
      epj $$8 = $$7.q();

      Optional<epi> $$9;
      try {
         $$9 = $$8.b($$1);
      } catch (aa var13) {
         throw d.create($$1);
      }

      if ($$9.isEmpty()) {
         throw d.create($$1);
      } else {
         epi $$12 = $$9.get();
         a($$7, new ddp($$2), new ddp($$2.a($$12.a())));
         epe $$13 = new epe().a($$4).a($$3);
         if ($$5 < 1.0F) {
            $$13.b().a(new eol($$5)).a(dtm.b((long)$$6));
         }

         boolean $$14 = $$12.a($$7, $$2, $$2, $$13, dtm.b((long)$$6), 2);
         if (!$$14) {
            throw e.create();
         } else {
            $$0.a(() -> xe.a("commands.place.template.success", xe.a($$1), $$2.u(), $$2.v(), $$2.w()), true);
            return 1;
         }
      }
   }

   private static void a(arj $$0, ddp $$1, ddp $$2) throws CommandSyntaxException {
      if (ddp.a($$1, $$2).filter($$1x -> !$$0.p($$1x.l())).findAny().isPresent()) {
         throw gq.a.create();
      }
   }
}

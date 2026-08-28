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

public class anq {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wz.c("commands.place.feature.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wz.c("commands.place.jigsaw.failed"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wz.c("commands.place.structure.failed"));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wz.b("commands.place.template.invalid", $$0));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wz.c("commands.place.template.failed"));
   private static final SuggestionProvider<et> f = ($$0, $$1) -> {
      ens $$2 = ((et)$$0.getSource()).e().q();
      return ey.a($$2.a(), $$1);
   };

   public static void a(CommandDispatcher<et> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("place")
                        .requires($$0x -> $$0x.c(2)))
                     .then(
                        eu.a("feature")
                           .then(
                              ((RequiredArgumentBuilder)eu.a("feature", ft.a(lu.aI))
                                    .executes($$0x -> a((et)$$0x.getSource(), ft.a($$0x, "feature"), jd.a((jw)((et)$$0x.getSource()).d()))))
                                 .then(eu.a("pos", gp.a()).executes($$0x -> a((et)$$0x.getSource(), ft.a($$0x, "feature"), gp.a($$0x, "pos"))))
                           )
                     ))
                  .then(
                     eu.a("jigsaw")
                        .then(
                           eu.a("pool", ft.a(lu.aU))
                              .then(
                                 eu.a("target", fu.a())
                                    .then(
                                       ((RequiredArgumentBuilder)eu.a("max_depth", IntegerArgumentType.integer(1, 20))
                                             .executes(
                                                $$0x -> a(
                                                      (et)$$0x.getSource(),
                                                      ft.c($$0x, "pool"),
                                                      fu.c($$0x, "target"),
                                                      IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                      jd.a((jw)((et)$$0x.getSource()).d())
                                                   )
                                             ))
                                          .then(
                                             eu.a("position", gp.a())
                                                .executes(
                                                   $$0x -> a(
                                                         (et)$$0x.getSource(),
                                                         ft.c($$0x, "pool"),
                                                         fu.c($$0x, "target"),
                                                         IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                         gp.a($$0x, "position")
                                                      )
                                                )
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  eu.a("structure")
                     .then(
                        ((RequiredArgumentBuilder)eu.a("structure", ft.a(lu.aR))
                              .executes($$0x -> b((et)$$0x.getSource(), ft.b($$0x, "structure"), jd.a((jw)((et)$$0x.getSource()).d()))))
                           .then(eu.a("pos", gp.a()).executes($$0x -> b((et)$$0x.getSource(), ft.b($$0x, "structure"), gp.a($$0x, "pos"))))
                     )
               ))
            .then(
               eu.a("template")
                  .then(
                     ((RequiredArgumentBuilder)eu.a("template", fu.a())
                           .suggests(f)
                           .executes($$0x -> a((et)$$0x.getSource(), fu.c($$0x, "template"), jd.a((jw)((et)$$0x.getSource()).d()), dmm.a, dkv.a, 1.0F, 0)))
                        .then(
                           ((RequiredArgumentBuilder)eu.a("pos", gp.a())
                                 .executes($$0x -> a((et)$$0x.getSource(), fu.c($$0x, "template"), gp.a($$0x, "pos"), dmm.a, dkv.a, 1.0F, 0)))
                              .then(
                                 ((RequiredArgumentBuilder)eu.a("rotation", gh.a())
                                       .executes(
                                          $$0x -> a((et)$$0x.getSource(), fu.c($$0x, "template"), gp.a($$0x, "pos"), gh.a($$0x, "rotation"), dkv.a, 1.0F, 0)
                                       ))
                                    .then(
                                       ((RequiredArgumentBuilder)eu.a("mirror", gg.a())
                                             .executes(
                                                $$0x -> a(
                                                      (et)$$0x.getSource(),
                                                      fu.c($$0x, "template"),
                                                      gp.a($$0x, "pos"),
                                                      gh.a($$0x, "rotation"),
                                                      gg.a($$0x, "mirror"),
                                                      1.0F,
                                                      0
                                                   )
                                             ))
                                          .then(
                                             ((RequiredArgumentBuilder)eu.a("integrity", FloatArgumentType.floatArg(0.0F, 1.0F))
                                                   .executes(
                                                      $$0x -> a(
                                                            (et)$$0x.getSource(),
                                                            fu.c($$0x, "template"),
                                                            gp.a($$0x, "pos"),
                                                            gh.a($$0x, "rotation"),
                                                            gg.a($$0x, "mirror"),
                                                            FloatArgumentType.getFloat($$0x, "integrity"),
                                                            0
                                                         )
                                                   ))
                                                .then(
                                                   eu.a("seed", IntegerArgumentType.integer())
                                                      .executes(
                                                         $$0x -> a(
                                                               (et)$$0x.getSource(),
                                                               fu.c($$0x, "template"),
                                                               gp.a($$0x, "pos"),
                                                               gh.a($$0x, "rotation"),
                                                               gg.a($$0x, "mirror"),
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

   public static int a(et $$0, jm.c<ebq<?, ?>> $$1, jd $$2) throws CommandSyntaxException {
      aqu $$3 = $$0.e();
      ebq<?, ?> $$4 = $$1.a();
      dcd $$5 = new dcd($$2);
      a($$3, new dcd($$5.e - 1, $$5.f - 1), new dcd($$5.e + 1, $$5.f + 1));
      if (!$$4.a($$3, $$3.l().g(), $$3.E_(), $$2)) {
         throw a.create();
      } else {
         String $$6 = $$1.h().a().toString();
         $$0.a(() -> wz.a("commands.place.feature.success", $$6, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(et $$0, jm<ekz> $$1, akr $$2, int $$3, jd $$4) throws CommandSyntaxException {
      aqu $$5 = $$0.e();
      dcd $$6 = new dcd($$4);
      a($$5, $$6, $$6);
      if (!ekt.a($$5, $$1, $$2, $$3, $$4, false)) {
         throw b.create();
      } else {
         $$0.a(() -> wz.a("commands.place.jigsaw.success", $$4.u(), $$4.v(), $$4.w()), true);
         return 1;
      }
   }

   public static int b(et $$0, jm.c<ejp> $$1, jd $$2) throws CommandSyntaxException {
      aqu $$3 = $$0.e();
      ejp $$4 = $$1.a();
      duz $$5 = $$3.l().g();
      ejx $$6 = $$4.a($$0.v(), $$5, $$5.d(), $$3.l().i(), $$3.q(), $$3.C(), new dcd($$2), 0, $$3, $$0x -> true);
      if (!$$6.b()) {
         throw c.create();
      } else {
         ejh $$7 = $$6.a();
         dcd $$8 = new dcd(kf.a($$7.h()), kf.a($$7.j()));
         dcd $$9 = new dcd(kf.a($$7.k()), kf.a($$7.m()));
         a($$3, $$8, $$9);
         dcd.a($$8, $$9).forEach($$3x -> $$6.a($$3, $$3.a(), $$5, $$3.E_(), new ejh($$3x.d(), $$3.I_(), $$3x.e(), $$3x.f(), $$3.am(), $$3x.g()), $$3x));
         String $$10 = $$1.h().a().toString();
         $$0.a(() -> wz.a("commands.place.structure.success", $$10, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(et $$0, akr $$1, jd $$2, dmm $$3, dkv $$4, float $$5, int $$6) throws CommandSyntaxException {
      aqu $$7 = $$0.e();
      ens $$8 = $$7.q();

      Optional<enr> $$9;
      try {
         $$9 = $$8.b($$1);
      } catch (aa var13) {
         throw d.create($$1);
      }

      if ($$9.isEmpty()) {
         throw d.create($$1);
      } else {
         enr $$12 = $$9.get();
         a($$7, new dcd($$2), new dcd($$2.a($$12.a())));
         enn $$13 = new enn().a($$4).a($$3);
         if ($$5 < 1.0F) {
            $$13.b().a(new emu($$5)).a(drx.b((long)$$6));
         }

         boolean $$14 = $$12.a($$7, $$2, $$2, $$13, drx.b((long)$$6), 2);
         if (!$$14) {
            throw e.create();
         } else {
            $$0.a(() -> wz.a("commands.place.template.success", wz.a($$1), $$2.u(), $$2.v(), $$2.w()), true);
            return 1;
         }
      }
   }

   private static void a(aqu $$0, dcd $$1, dcd $$2) throws CommandSyntaxException {
      if (dcd.a($$1, $$2).filter($$1x -> !$$0.p($$1x.l())).findAny().isPresent()) {
         throw gp.a.create();
      }
   }
}

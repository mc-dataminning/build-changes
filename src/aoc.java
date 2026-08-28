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
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xd.c("commands.place.feature.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xd.c("commands.place.jigsaw.failed"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xd.c("commands.place.structure.failed"));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xd.b("commands.place.template.invalid", $$0));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xd.c("commands.place.template.failed"));
   private static final SuggestionProvider<et> f = ($$0, $$1) -> {
      epf $$2 = ((et)$$0.getSource()).e().q();
      return ey.a($$2.a(), $$1);
   };

   public static void a(CommandDispatcher<et> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("place")
                        .requires($$0x -> $$0x.c(2)))
                     .then(
                        eu.a("feature")
                           .then(
                              ((RequiredArgumentBuilder)eu.a("feature", ft.a(lv.aJ))
                                    .executes($$0x -> a((et)$$0x.getSource(), ft.a($$0x, "feature"), je.a((jx)((et)$$0x.getSource()).d()))))
                                 .then(eu.a("pos", gp.a()).executes($$0x -> a((et)$$0x.getSource(), ft.a($$0x, "feature"), gp.a($$0x, "pos"))))
                           )
                     ))
                  .then(
                     eu.a("jigsaw")
                        .then(
                           eu.a("pool", ft.a(lv.aV))
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
                                                      je.a((jx)((et)$$0x.getSource()).d())
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
                        ((RequiredArgumentBuilder)eu.a("structure", ft.a(lv.aS))
                              .executes($$0x -> b((et)$$0x.getSource(), ft.b($$0x, "structure"), je.a((jx)((et)$$0x.getSource()).d()))))
                           .then(eu.a("pos", gp.a()).executes($$0x -> b((et)$$0x.getSource(), ft.b($$0x, "structure"), gp.a($$0x, "pos"))))
                     )
               ))
            .then(
               eu.a("template")
                  .then(
                     ((RequiredArgumentBuilder)eu.a("template", fu.a())
                           .suggests(f)
                           .executes($$0x -> a((et)$$0x.getSource(), fu.c($$0x, "template"), je.a((jx)((et)$$0x.getSource()).d()), dnx.a, dmg.a, 1.0F, 0)))
                        .then(
                           ((RequiredArgumentBuilder)eu.a("pos", gp.a())
                                 .executes($$0x -> a((et)$$0x.getSource(), fu.c($$0x, "template"), gp.a($$0x, "pos"), dnx.a, dmg.a, 1.0F, 0)))
                              .then(
                                 ((RequiredArgumentBuilder)eu.a("rotation", gh.a())
                                       .executes(
                                          $$0x -> a((et)$$0x.getSource(), fu.c($$0x, "template"), gp.a($$0x, "pos"), gh.a($$0x, "rotation"), dmg.a, 1.0F, 0)
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

   public static int a(et $$0, jn.c<edc<?, ?>> $$1, je $$2) throws CommandSyntaxException {
      arh $$3 = $$0.e();
      edc<?, ?> $$4 = $$1.a();
      ddm $$5 = new ddm($$2);
      a($$3, new ddm($$5.e - 1, $$5.f - 1), new ddm($$5.e + 1, $$5.f + 1));
      if (!$$4.a($$3, $$3.l().g(), $$3.C_(), $$2)) {
         throw a.create();
      } else {
         String $$6 = $$1.h().a().toString();
         $$0.a(() -> xd.a("commands.place.feature.success", $$6, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(et $$0, jn<emm> $$1, alc $$2, int $$3, je $$4) throws CommandSyntaxException {
      arh $$5 = $$0.e();
      ddm $$6 = new ddm($$4);
      a($$5, $$6, $$6);
      if (!emg.a($$5, $$1, $$2, $$3, $$4, false)) {
         throw b.create();
      } else {
         $$0.a(() -> xd.a("commands.place.jigsaw.success", $$4.u(), $$4.v(), $$4.w()), true);
         return 1;
      }
   }

   public static int b(et $$0, jn.c<elc> $$1, je $$2) throws CommandSyntaxException {
      arh $$3 = $$0.e();
      elc $$4 = $$1.a();
      dwl $$5 = $$3.l().g();
      elk $$6 = $$4.a($$0.v(), $$5, $$5.d(), $$3.l().i(), $$3.q(), $$3.C(), new ddm($$2), 0, $$3, $$0x -> true);
      if (!$$6.b()) {
         throw c.create();
      } else {
         eku $$7 = $$6.a();
         ddm $$8 = new ddm(kg.a($$7.h()), kg.a($$7.j()));
         ddm $$9 = new ddm(kg.a($$7.k()), kg.a($$7.m()));
         a($$3, $$8, $$9);
         ddm.a($$8, $$9).forEach($$3x -> $$6.a($$3, $$3.a(), $$5, $$3.C_(), new eku($$3x.d(), $$3.G_(), $$3x.e(), $$3x.f(), $$3.an() + 1, $$3x.g()), $$3x));
         String $$10 = $$1.h().a().toString();
         $$0.a(() -> xd.a("commands.place.structure.success", $$10, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(et $$0, alc $$1, je $$2, dnx $$3, dmg $$4, float $$5, int $$6) throws CommandSyntaxException {
      arh $$7 = $$0.e();
      epf $$8 = $$7.q();

      Optional<epe> $$9;
      try {
         $$9 = $$8.b($$1);
      } catch (aa var13) {
         throw d.create($$1);
      }

      if ($$9.isEmpty()) {
         throw d.create($$1);
      } else {
         epe $$12 = $$9.get();
         a($$7, new ddm($$2), new ddm($$2.a($$12.a())));
         epa $$13 = new epa().a($$4).a($$3);
         if ($$5 < 1.0F) {
            $$13.b().a(new eoh($$5)).a(dtj.b((long)$$6));
         }

         boolean $$14 = $$12.a($$7, $$2, $$2, $$13, dtj.b((long)$$6), 2);
         if (!$$14) {
            throw e.create();
         } else {
            $$0.a(() -> xd.a("commands.place.template.success", xd.a($$1), $$2.u(), $$2.v(), $$2.w()), true);
            return 1;
         }
      }
   }

   private static void a(arh $$0, ddm $$1, ddm $$2) throws CommandSyntaxException {
      if (ddm.a($$1, $$2).filter($$1x -> !$$0.p($$1x.l())).findAny().isPresent()) {
         throw gp.a.create();
      }
   }
}

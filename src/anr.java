import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.List;
import java.util.Optional;

public class anr {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("commands.place.feature.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xe.c("commands.place.jigsaw.failed"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xe.c("commands.place.structure.failed"));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xe.b("commands.place.template.invalid", $$0));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xe.c("commands.place.template.failed"));
   private static final SuggestionProvider<eh> f = ($$0, $$1) -> {
      enu $$2 = ((eh)$$0.getSource()).e().q();
      return em.a($$2.a(), $$1);
   };

   public static void a(CommandDispatcher<eh> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("place")
                        .requires($$0x -> $$0x.c(2)))
                     .then(
                        ei.a("feature")
                           .then(
                              ((RequiredArgumentBuilder)ei.a("feature", fh.a(li.aC))
                                    .executes($$0x -> a((eh)$$0x.getSource(), fh.a($$0x, "feature"), ir.a(((eh)$$0x.getSource()).d()))))
                                 .then(ei.a("pos", gd.a()).executes($$0x -> a((eh)$$0x.getSource(), fh.a($$0x, "feature"), gd.a($$0x, "pos"))))
                           )
                     ))
                  .then(
                     ei.a("jigsaw")
                        .then(
                           ei.a("pool", fh.a(li.aM))
                              .then(
                                 ei.a("target", fi.a())
                                    .then(
                                       ((RequiredArgumentBuilder)ei.a("max_depth", IntegerArgumentType.integer(1, 20))
                                             .executes(
                                                $$0x -> a(
                                                      (eh)$$0x.getSource(),
                                                      fh.c($$0x, "pool"),
                                                      fi.c($$0x, "target"),
                                                      IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                      ir.a(((eh)$$0x.getSource()).d())
                                                   )
                                             ))
                                          .then(
                                             ei.a("position", gd.a())
                                                .executes(
                                                   $$0x -> a(
                                                         (eh)$$0x.getSource(),
                                                         fh.c($$0x, "pool"),
                                                         fi.c($$0x, "target"),
                                                         IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                         gd.a($$0x, "position")
                                                      )
                                                )
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  ei.a("structure")
                     .then(
                        ((RequiredArgumentBuilder)ei.a("structure", fh.a(li.aJ))
                              .executes($$0x -> b((eh)$$0x.getSource(), fh.b($$0x, "structure"), ir.a(((eh)$$0x.getSource()).d()))))
                           .then(ei.a("pos", gd.a()).executes($$0x -> b((eh)$$0x.getSource(), fh.b($$0x, "structure"), gd.a($$0x, "pos"))))
                     )
               ))
            .then(
               ei.a("template")
                  .then(
                     ((RequiredArgumentBuilder)ei.a("template", fi.a())
                           .suggests(f)
                           .executes($$0x -> a((eh)$$0x.getSource(), fi.c($$0x, "template"), ir.a(((eh)$$0x.getSource()).d()), dmd.a, dke.a, 1.0F, 0)))
                        .then(
                           ((RequiredArgumentBuilder)ei.a("pos", gd.a())
                                 .executes($$0x -> a((eh)$$0x.getSource(), fi.c($$0x, "template"), gd.a($$0x, "pos"), dmd.a, dke.a, 1.0F, 0)))
                              .then(
                                 ((RequiredArgumentBuilder)ei.a("rotation", fv.a())
                                       .executes(
                                          $$0x -> a((eh)$$0x.getSource(), fi.c($$0x, "template"), gd.a($$0x, "pos"), fv.a($$0x, "rotation"), dke.a, 1.0F, 0)
                                       ))
                                    .then(
                                       ((RequiredArgumentBuilder)ei.a("mirror", fu.a())
                                             .executes(
                                                $$0x -> a(
                                                      (eh)$$0x.getSource(),
                                                      fi.c($$0x, "template"),
                                                      gd.a($$0x, "pos"),
                                                      fv.a($$0x, "rotation"),
                                                      fu.a($$0x, "mirror"),
                                                      1.0F,
                                                      0
                                                   )
                                             ))
                                          .then(
                                             ((RequiredArgumentBuilder)ei.a("integrity", FloatArgumentType.floatArg(0.0F, 1.0F))
                                                   .executes(
                                                      $$0x -> a(
                                                            (eh)$$0x.getSource(),
                                                            fi.c($$0x, "template"),
                                                            gd.a($$0x, "pos"),
                                                            fv.a($$0x, "rotation"),
                                                            fu.a($$0x, "mirror"),
                                                            FloatArgumentType.getFloat($$0x, "integrity"),
                                                            0
                                                         )
                                                   ))
                                                .then(
                                                   ei.a("seed", IntegerArgumentType.integer())
                                                      .executes(
                                                         $$0x -> a(
                                                               (eh)$$0x.getSource(),
                                                               fi.c($$0x, "template"),
                                                               gd.a($$0x, "pos"),
                                                               fv.a($$0x, "rotation"),
                                                               fu.a($$0x, "mirror"),
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

   public static int a(eh $$0, ja.c<ebm<?, ?>> $$1, ir $$2) throws CommandSyntaxException {
      aqt $$3 = $$0.e();
      ebm<?, ?> $$4 = $$1.a();
      dbh $$5 = new dbh($$2);
      a($$3, new dbh($$5.e - 1, $$5.f - 1), new dbh($$5.e + 1, $$5.f + 1));
      if (!$$4.a($$3, $$3.l().g(), $$3.F_(), $$2)) {
         throw a.create();
      } else {
         String $$6 = $$1.h().a().toString();
         $$0.a(() -> xe.a("commands.place.feature.success", $$6, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(eh $$0, ja<elc> $$1, akt $$2, int $$3, ir $$4) throws CommandSyntaxException {
      aqt $$5 = $$0.e();
      if (!ekw.a($$5, $$1, $$2, $$3, $$4, false)) {
         throw b.create();
      } else {
         $$0.a(() -> xe.a("commands.place.jigsaw.success", $$4.u(), $$4.v(), $$4.w()), true);
         return 1;
      }
   }

   public static int b(eh $$0, ja.c<ejt> $$1, ir $$2) throws CommandSyntaxException {
      aqt $$3 = $$0.e();
      ejt $$4 = $$1.a();
      duz $$5 = $$3.l().g();
      ekb $$6 = $$4.a($$0.v(), $$5, $$5.c(), $$3.l().i(), $$3.q(), $$3.C(), new dbh($$2), 0, $$3, $$0x -> true, List.of());
      if (!$$6.b()) {
         throw c.create();
      } else {
         ejl $$7 = $$6.a();
         dbh $$8 = new dbh(jt.a($$7.h()), jt.a($$7.j()));
         dbh $$9 = new dbh(jt.a($$7.k()), jt.a($$7.m()));
         a($$3, $$8, $$9);
         dbh.a($$8, $$9).forEach($$3x -> $$6.a($$3, $$3.a(), $$5, $$3.F_(), new ejl($$3x.d(), $$3.J_(), $$3x.e(), $$3x.f(), $$3.am(), $$3x.g()), $$3x));
         String $$10 = $$1.h().a().toString();
         $$0.a(() -> xe.a("commands.place.structure.success", $$10, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(eh $$0, akt $$1, ir $$2, dmd $$3, dke $$4, float $$5, int $$6) throws CommandSyntaxException {
      aqt $$7 = $$0.e();
      enu $$8 = $$7.q();

      Optional<ent> $$9;
      try {
         $$9 = $$8.b($$1);
      } catch (aa var13) {
         throw d.create($$1);
      }

      if ($$9.isEmpty()) {
         throw d.create($$1);
      } else {
         ent $$12 = $$9.get();
         a($$7, new dbh($$2), new dbh($$2.a($$12.a())));
         enp $$13 = new enp().a($$4).a($$3);
         if ($$5 < 1.0F) {
            $$13.b().a(new emx($$5)).a(drw.b((long)$$6));
         }

         boolean $$14 = $$12.a($$7, $$2, $$2, $$13, drw.b((long)$$6), 2);
         if (!$$14) {
            throw e.create();
         } else {
            $$0.a(() -> xe.a("commands.place.template.success", xe.a($$1), $$2.u(), $$2.v(), $$2.w()), true);
            return 1;
         }
      }
   }

   private static void a(aqt $$0, dbh $$1, dbh $$2) throws CommandSyntaxException {
      if (dbh.a($$1, $$2).filter($$1x -> !$$0.p($$1x.l())).findAny().isPresent()) {
         throw gd.a.create();
      }
   }
}

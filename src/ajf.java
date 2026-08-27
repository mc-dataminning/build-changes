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

public class ajf {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ur.c("commands.place.feature.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ur.c("commands.place.jigsaw.failed"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(ur.c("commands.place.structure.failed"));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> ur.b("commands.place.template.invalid", $$0));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(ur.c("commands.place.template.failed"));
   private static final SuggestionProvider<du> f = ($$0, $$1) -> {
      ebi $$2 = ((du)$$0.getSource()).f().p();
      return dy.a($$2.a(), $$1);
   };

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("place")
                        .requires($$0x -> $$0x.c(2)))
                     .then(
                        dv.a("feature")
                           .then(
                              ((RequiredArgumentBuilder)dv.a("feature", et.a(jz.au))
                                    .executes($$0x -> a((du)$$0x.getSource(), et.a($$0x, "feature"), ht.a(((du)$$0x.getSource()).e()))))
                                 .then(dv.a("pos", fm.a()).executes($$0x -> a((du)$$0x.getSource(), et.a($$0x, "feature"), fm.a($$0x, "pos"))))
                           )
                     ))
                  .then(
                     dv.a("jigsaw")
                        .then(
                           dv.a("pool", et.a(jz.aE))
                              .then(
                                 dv.a("target", eu.a())
                                    .then(
                                       ((RequiredArgumentBuilder)dv.a("max_depth", IntegerArgumentType.integer(1, 7))
                                             .executes(
                                                $$0x -> a(
                                                      (du)$$0x.getSource(),
                                                      et.c($$0x, "pool"),
                                                      eu.e($$0x, "target"),
                                                      IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                      ht.a(((du)$$0x.getSource()).e())
                                                   )
                                             ))
                                          .then(
                                             dv.a("position", fm.a())
                                                .executes(
                                                   $$0x -> a(
                                                         (du)$$0x.getSource(),
                                                         et.c($$0x, "pool"),
                                                         eu.e($$0x, "target"),
                                                         IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                         fm.a($$0x, "position")
                                                      )
                                                )
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  dv.a("structure")
                     .then(
                        ((RequiredArgumentBuilder)dv.a("structure", et.a(jz.aB))
                              .executes($$0x -> b((du)$$0x.getSource(), et.b($$0x, "structure"), ht.a(((du)$$0x.getSource()).e()))))
                           .then(dv.a("pos", fm.a()).executes($$0x -> b((du)$$0x.getSource(), et.b($$0x, "structure"), fm.a($$0x, "pos"))))
                     )
               ))
            .then(
               dv.a("template")
                  .then(
                     ((RequiredArgumentBuilder)dv.a("template", eu.a())
                           .suggests(f)
                           .executes($$0x -> a((du)$$0x.getSource(), eu.e($$0x, "template"), ht.a(((du)$$0x.getSource()).e()), dbm.a, czw.a, 1.0F, 0)))
                        .then(
                           ((RequiredArgumentBuilder)dv.a("pos", fm.a())
                                 .executes($$0x -> a((du)$$0x.getSource(), eu.e($$0x, "template"), fm.a($$0x, "pos"), dbm.a, czw.a, 1.0F, 0)))
                              .then(
                                 ((RequiredArgumentBuilder)dv.a("rotation", fe.a())
                                       .executes(
                                          $$0x -> a((du)$$0x.getSource(), eu.e($$0x, "template"), fm.a($$0x, "pos"), fe.a($$0x, "rotation"), czw.a, 1.0F, 0)
                                       ))
                                    .then(
                                       ((RequiredArgumentBuilder)dv.a("mirror", fd.a())
                                             .executes(
                                                $$0x -> a(
                                                      (du)$$0x.getSource(),
                                                      eu.e($$0x, "template"),
                                                      fm.a($$0x, "pos"),
                                                      fe.a($$0x, "rotation"),
                                                      fd.a($$0x, "mirror"),
                                                      1.0F,
                                                      0
                                                   )
                                             ))
                                          .then(
                                             ((RequiredArgumentBuilder)dv.a("integrity", FloatArgumentType.floatArg(0.0F, 1.0F))
                                                   .executes(
                                                      $$0x -> a(
                                                            (du)$$0x.getSource(),
                                                            eu.e($$0x, "template"),
                                                            fm.a($$0x, "pos"),
                                                            fe.a($$0x, "rotation"),
                                                            fd.a($$0x, "mirror"),
                                                            FloatArgumentType.getFloat($$0x, "integrity"),
                                                            0
                                                         )
                                                   ))
                                                .then(
                                                   dv.a("seed", IntegerArgumentType.integer())
                                                      .executes(
                                                         $$0x -> a(
                                                               (du)$$0x.getSource(),
                                                               eu.e($$0x, "template"),
                                                               fm.a($$0x, "pos"),
                                                               fe.a($$0x, "rotation"),
                                                               fd.a($$0x, "mirror"),
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

   public static int a(du $$0, ib.c<dpi<?, ?>> $$1, ht $$2) throws CommandSyntaxException {
      ame $$3 = $$0.f();
      dpi<?, ?> $$4 = $$1.a();
      crh $$5 = new crh($$2);
      a($$3, new crh($$5.e - 1, $$5.f - 1), new crh($$5.e + 1, $$5.f + 1));
      if (!$$4.a($$3, $$3.k().g(), $$3.E_(), $$2)) {
         throw a.create();
      } else {
         String $$6 = $$1.g().a().toString();
         $$0.a(() -> ur.a("commands.place.feature.success", $$6, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(du $$0, ib<dyq> $$1, agi $$2, int $$3, ht $$4) throws CommandSyntaxException {
      ame $$5 = $$0.f();
      if (!dyk.a($$5, $$1, $$2, $$3, $$4, false)) {
         throw b.create();
      } else {
         $$0.a(() -> ur.a("commands.place.jigsaw.success", $$4.u(), $$4.v(), $$4.w()), true);
         return 1;
      }
   }

   public static int b(du $$0, ib.c<dxh> $$1, ht $$2) throws CommandSyntaxException {
      ame $$3 = $$0.f();
      dxh $$4 = $$1.a();
      djf $$5 = $$3.k().g();
      dxp $$6 = $$4.a($$0.v(), $$5, $$5.c(), $$3.k().i(), $$3.p(), $$3.B(), new crh($$2), 0, $$3, $$0x -> true);
      if (!$$6.b()) {
         throw c.create();
      } else {
         dwz $$7 = $$6.a();
         crh $$8 = new crh(iu.a($$7.g()), iu.a($$7.i()));
         crh $$9 = new crh(iu.a($$7.j()), iu.a($$7.l()));
         a($$3, $$8, $$9);
         crh.a($$8, $$9).forEach($$3x -> $$6.a($$3, $$3.a(), $$5, $$3.E_(), new dwz($$3x.d(), $$3.I_(), $$3x.e(), $$3x.f(), $$3.ak(), $$3x.g()), $$3x));
         String $$10 = $$1.g().a().toString();
         $$0.a(() -> ur.a("commands.place.structure.success", $$10, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(du $$0, agi $$1, ht $$2, dbm $$3, czw $$4, float $$5, int $$6) throws CommandSyntaxException {
      ame $$7 = $$0.f();
      ebi $$8 = $$7.p();

      Optional<ebh> $$9;
      try {
         $$9 = $$8.b($$1);
      } catch (z var13) {
         throw d.create($$1);
      }

      if ($$9.isEmpty()) {
         throw d.create($$1);
      } else {
         ebh $$12 = $$9.get();
         a($$7, new crh($$2), new crh($$2.a($$12.a())));
         ebd $$13 = new ebd().a($$4).a($$3);
         if ($$5 < 1.0F) {
            $$13.b().a(new eal($$5)).a(dgr.b((long)$$6));
         }

         boolean $$14 = $$12.a($$7, $$2, $$2, $$13, dgr.b((long)$$6), 2);
         if (!$$14) {
            throw e.create();
         } else {
            $$0.a(() -> ur.a("commands.place.template.success", ur.a($$1), $$2.u(), $$2.v(), $$2.w()), true);
            return 1;
         }
      }
   }

   private static void a(ame $$0, crh $$1, crh $$2) throws CommandSyntaxException {
      if (crh.a($$1, $$2).filter($$1x -> !$$0.o($$1x.l())).findAny().isPresent()) {
         throw fm.a.create();
      }
   }
}

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

public class ams {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wi.c("commands.place.feature.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wi.c("commands.place.jigsaw.failed"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wi.c("commands.place.structure.failed"));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wi.b("commands.place.template.invalid", $$0));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wi.c("commands.place.template.failed"));
   private static final SuggestionProvider<dv> f = ($$0, $$1) -> {
      ejr $$2 = ((dv)$$0.getSource()).e().q();
      return ea.a($$2.a(), $$1);
   };

   public static void a(CommandDispatcher<dv> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("place")
                        .requires($$0x -> $$0x.c(2)))
                     .then(
                        dw.a("feature")
                           .then(
                              ((RequiredArgumentBuilder)dw.a("feature", ev.a(ku.az))
                                    .executes($$0x -> a((dv)$$0x.getSource(), ev.a($$0x, "feature"), id.a(((dv)$$0x.getSource()).d()))))
                                 .then(dw.a("pos", fq.a()).executes($$0x -> a((dv)$$0x.getSource(), ev.a($$0x, "feature"), fq.a($$0x, "pos"))))
                           )
                     ))
                  .then(
                     dw.a("jigsaw")
                        .then(
                           dw.a("pool", ev.a(ku.aJ))
                              .then(
                                 dw.a("target", ew.a())
                                    .then(
                                       ((RequiredArgumentBuilder)dw.a("max_depth", IntegerArgumentType.integer(1, 20))
                                             .executes(
                                                $$0x -> a(
                                                      (dv)$$0x.getSource(),
                                                      ev.c($$0x, "pool"),
                                                      ew.e($$0x, "target"),
                                                      IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                      id.a(((dv)$$0x.getSource()).d())
                                                   )
                                             ))
                                          .then(
                                             dw.a("position", fq.a())
                                                .executes(
                                                   $$0x -> a(
                                                         (dv)$$0x.getSource(),
                                                         ev.c($$0x, "pool"),
                                                         ew.e($$0x, "target"),
                                                         IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                         fq.a($$0x, "position")
                                                      )
                                                )
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  dw.a("structure")
                     .then(
                        ((RequiredArgumentBuilder)dw.a("structure", ev.a(ku.aG))
                              .executes($$0x -> b((dv)$$0x.getSource(), ev.b($$0x, "structure"), id.a(((dv)$$0x.getSource()).d()))))
                           .then(dw.a("pos", fq.a()).executes($$0x -> b((dv)$$0x.getSource(), ev.b($$0x, "structure"), fq.a($$0x, "pos"))))
                     )
               ))
            .then(
               dw.a("template")
                  .then(
                     ((RequiredArgumentBuilder)dw.a("template", ew.a())
                           .suggests(f)
                           .executes($$0x -> a((dv)$$0x.getSource(), ew.e($$0x, "template"), id.a(((dv)$$0x.getSource()).d()), dit.a, dhd.a, 1.0F, 0)))
                        .then(
                           ((RequiredArgumentBuilder)dw.a("pos", fq.a())
                                 .executes($$0x -> a((dv)$$0x.getSource(), ew.e($$0x, "template"), fq.a($$0x, "pos"), dit.a, dhd.a, 1.0F, 0)))
                              .then(
                                 ((RequiredArgumentBuilder)dw.a("rotation", fi.a())
                                       .executes(
                                          $$0x -> a((dv)$$0x.getSource(), ew.e($$0x, "template"), fq.a($$0x, "pos"), fi.a($$0x, "rotation"), dhd.a, 1.0F, 0)
                                       ))
                                    .then(
                                       ((RequiredArgumentBuilder)dw.a("mirror", fh.a())
                                             .executes(
                                                $$0x -> a(
                                                      (dv)$$0x.getSource(),
                                                      ew.e($$0x, "template"),
                                                      fq.a($$0x, "pos"),
                                                      fi.a($$0x, "rotation"),
                                                      fh.a($$0x, "mirror"),
                                                      1.0F,
                                                      0
                                                   )
                                             ))
                                          .then(
                                             ((RequiredArgumentBuilder)dw.a("integrity", FloatArgumentType.floatArg(0.0F, 1.0F))
                                                   .executes(
                                                      $$0x -> a(
                                                            (dv)$$0x.getSource(),
                                                            ew.e($$0x, "template"),
                                                            fq.a($$0x, "pos"),
                                                            fi.a($$0x, "rotation"),
                                                            fh.a($$0x, "mirror"),
                                                            FloatArgumentType.getFloat($$0x, "integrity"),
                                                            0
                                                         )
                                                   ))
                                                .then(
                                                   dw.a("seed", IntegerArgumentType.integer())
                                                      .executes(
                                                         $$0x -> a(
                                                               (dv)$$0x.getSource(),
                                                               ew.e($$0x, "template"),
                                                               fq.a($$0x, "pos"),
                                                               fi.a($$0x, "rotation"),
                                                               fh.a($$0x, "mirror"),
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

   public static int a(dv $$0, in.c<dxr<?, ?>> $$1, id $$2) throws CommandSyntaxException {
      apu $$3 = $$0.e();
      dxr<?, ?> $$4 = $$1.a();
      cyn $$5 = new cyn($$2);
      a($$3, new cyn($$5.e - 1, $$5.f - 1), new cyn($$5.e + 1, $$5.f + 1));
      if (!$$4.a($$3, $$3.l().g(), $$3.E_(), $$2)) {
         throw a.create();
      } else {
         String $$6 = $$1.h().a().toString();
         $$0.a(() -> wi.a("commands.place.feature.success", $$6, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(dv $$0, in<egz> $$1, ajv $$2, int $$3, id $$4) throws CommandSyntaxException {
      apu $$5 = $$0.e();
      if (!egt.a($$5, $$1, $$2, $$3, $$4, false)) {
         throw b.create();
      } else {
         $$0.a(() -> wi.a("commands.place.jigsaw.success", $$4.u(), $$4.v(), $$4.w()), true);
         return 1;
      }
   }

   public static int b(dv $$0, in.c<efq> $$1, id $$2) throws CommandSyntaxException {
      apu $$3 = $$0.e();
      efq $$4 = $$1.a();
      drf $$5 = $$3.l().g();
      efy $$6 = $$4.a($$0.v(), $$5, $$5.c(), $$3.l().i(), $$3.q(), $$3.C(), new cyn($$2), 0, $$3, $$0x -> true);
      if (!$$6.b()) {
         throw c.create();
      } else {
         efi $$7 = $$6.a();
         cyn $$8 = new cyn(jg.a($$7.h()), jg.a($$7.j()));
         cyn $$9 = new cyn(jg.a($$7.k()), jg.a($$7.m()));
         a($$3, $$8, $$9);
         cyn.a($$8, $$9).forEach($$3x -> $$6.a($$3, $$3.a(), $$5, $$3.E_(), new efi($$3x.d(), $$3.I_(), $$3x.e(), $$3x.f(), $$3.al(), $$3x.g()), $$3x));
         String $$10 = $$1.h().a().toString();
         $$0.a(() -> wi.a("commands.place.structure.success", $$10, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(dv $$0, ajv $$1, id $$2, dit $$3, dhd $$4, float $$5, int $$6) throws CommandSyntaxException {
      apu $$7 = $$0.e();
      ejr $$8 = $$7.q();

      Optional<ejq> $$9;
      try {
         $$9 = $$8.b($$1);
      } catch (z var13) {
         throw d.create($$1);
      }

      if ($$9.isEmpty()) {
         throw d.create($$1);
      } else {
         ejq $$12 = $$9.get();
         a($$7, new cyn($$2), new cyn($$2.a($$12.a())));
         ejm $$13 = new ejm().a($$4).a($$3);
         if ($$5 < 1.0F) {
            $$13.b().a(new eiu($$5)).a(dod.b((long)$$6));
         }

         boolean $$14 = $$12.a($$7, $$2, $$2, $$13, dod.b((long)$$6), 2);
         if (!$$14) {
            throw e.create();
         } else {
            $$0.a(() -> wi.a("commands.place.template.success", wi.a($$1), $$2.u(), $$2.v(), $$2.w()), true);
            return 1;
         }
      }
   }

   private static void a(apu $$0, cyn $$1, cyn $$2) throws CommandSyntaxException {
      if (cyn.a($$1, $$2).filter($$1x -> !$$0.p($$1x.l())).findAny().isPresent()) {
         throw fq.a.create();
      }
   }
}

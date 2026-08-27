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

public class ank {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wx.c("commands.place.feature.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wx.c("commands.place.jigsaw.failed"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wx.c("commands.place.structure.failed"));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wx.b("commands.place.template.invalid", $$0));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wx.c("commands.place.template.failed"));
   private static final SuggestionProvider<ee> f = ($$0, $$1) -> {
      elk $$2 = ((ee)$$0.getSource()).e().q();
      return ej.a($$2.a(), $$1);
   };

   public static void a(CommandDispatcher<ee> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("place")
                        .requires($$0x -> $$0x.c(2)))
                     .then(
                        ef.a("feature")
                           .then(
                              ((RequiredArgumentBuilder)ef.a("feature", fe.a(lf.aC))
                                    .executes($$0x -> a((ee)$$0x.getSource(), fe.a($$0x, "feature"), io.a(((ee)$$0x.getSource()).d()))))
                                 .then(ef.a("pos", ga.a()).executes($$0x -> a((ee)$$0x.getSource(), fe.a($$0x, "feature"), ga.a($$0x, "pos"))))
                           )
                     ))
                  .then(
                     ef.a("jigsaw")
                        .then(
                           ef.a("pool", fe.a(lf.aM))
                              .then(
                                 ef.a("target", ff.a())
                                    .then(
                                       ((RequiredArgumentBuilder)ef.a("max_depth", IntegerArgumentType.integer(1, 20))
                                             .executes(
                                                $$0x -> a(
                                                      (ee)$$0x.getSource(),
                                                      fe.c($$0x, "pool"),
                                                      ff.c($$0x, "target"),
                                                      IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                      io.a(((ee)$$0x.getSource()).d())
                                                   )
                                             ))
                                          .then(
                                             ef.a("position", ga.a())
                                                .executes(
                                                   $$0x -> a(
                                                         (ee)$$0x.getSource(),
                                                         fe.c($$0x, "pool"),
                                                         ff.c($$0x, "target"),
                                                         IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                         ga.a($$0x, "position")
                                                      )
                                                )
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  ef.a("structure")
                     .then(
                        ((RequiredArgumentBuilder)ef.a("structure", fe.a(lf.aJ))
                              .executes($$0x -> b((ee)$$0x.getSource(), fe.b($$0x, "structure"), io.a(((ee)$$0x.getSource()).d()))))
                           .then(ef.a("pos", ga.a()).executes($$0x -> b((ee)$$0x.getSource(), fe.b($$0x, "structure"), ga.a($$0x, "pos"))))
                     )
               ))
            .then(
               ef.a("template")
                  .then(
                     ((RequiredArgumentBuilder)ef.a("template", ff.a())
                           .suggests(f)
                           .executes($$0x -> a((ee)$$0x.getSource(), ff.c($$0x, "template"), io.a(((ee)$$0x.getSource()).d()), dkl.a, div.a, 1.0F, 0)))
                        .then(
                           ((RequiredArgumentBuilder)ef.a("pos", ga.a())
                                 .executes($$0x -> a((ee)$$0x.getSource(), ff.c($$0x, "template"), ga.a($$0x, "pos"), dkl.a, div.a, 1.0F, 0)))
                              .then(
                                 ((RequiredArgumentBuilder)ef.a("rotation", fs.a())
                                       .executes(
                                          $$0x -> a((ee)$$0x.getSource(), ff.c($$0x, "template"), ga.a($$0x, "pos"), fs.a($$0x, "rotation"), div.a, 1.0F, 0)
                                       ))
                                    .then(
                                       ((RequiredArgumentBuilder)ef.a("mirror", fr.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ee)$$0x.getSource(),
                                                      ff.c($$0x, "template"),
                                                      ga.a($$0x, "pos"),
                                                      fs.a($$0x, "rotation"),
                                                      fr.a($$0x, "mirror"),
                                                      1.0F,
                                                      0
                                                   )
                                             ))
                                          .then(
                                             ((RequiredArgumentBuilder)ef.a("integrity", FloatArgumentType.floatArg(0.0F, 1.0F))
                                                   .executes(
                                                      $$0x -> a(
                                                            (ee)$$0x.getSource(),
                                                            ff.c($$0x, "template"),
                                                            ga.a($$0x, "pos"),
                                                            fs.a($$0x, "rotation"),
                                                            fr.a($$0x, "mirror"),
                                                            FloatArgumentType.getFloat($$0x, "integrity"),
                                                            0
                                                         )
                                                   ))
                                                .then(
                                                   ef.a("seed", IntegerArgumentType.integer())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ee)$$0x.getSource(),
                                                               ff.c($$0x, "template"),
                                                               ga.a($$0x, "pos"),
                                                               fs.a($$0x, "rotation"),
                                                               fr.a($$0x, "mirror"),
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

   public static int a(ee $$0, ix.c<dzk<?, ?>> $$1, io $$2) throws CommandSyntaxException {
      aqm $$3 = $$0.e();
      dzk<?, ?> $$4 = $$1.a();
      dae $$5 = new dae($$2);
      a($$3, new dae($$5.e - 1, $$5.f - 1), new dae($$5.e + 1, $$5.f + 1));
      if (!$$4.a($$3, $$3.l().g(), $$3.E_(), $$2)) {
         throw a.create();
      } else {
         String $$6 = $$1.h().a().toString();
         $$0.a(() -> wx.a("commands.place.feature.success", $$6, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(ee $$0, ix<eis> $$1, akm $$2, int $$3, io $$4) throws CommandSyntaxException {
      aqm $$5 = $$0.e();
      if (!eim.a($$5, $$1, $$2, $$3, $$4, false)) {
         throw b.create();
      } else {
         $$0.a(() -> wx.a("commands.place.jigsaw.success", $$4.u(), $$4.v(), $$4.w()), true);
         return 1;
      }
   }

   public static int b(ee $$0, ix.c<ehj> $$1, io $$2) throws CommandSyntaxException {
      aqm $$3 = $$0.e();
      ehj $$4 = $$1.a();
      dsy $$5 = $$3.l().g();
      ehr $$6 = $$4.a($$0.v(), $$5, $$5.c(), $$3.l().i(), $$3.q(), $$3.C(), new dae($$2), 0, $$3, $$0x -> true);
      if (!$$6.b()) {
         throw c.create();
      } else {
         ehb $$7 = $$6.a();
         dae $$8 = new dae(jq.a($$7.h()), jq.a($$7.j()));
         dae $$9 = new dae(jq.a($$7.k()), jq.a($$7.m()));
         a($$3, $$8, $$9);
         dae.a($$8, $$9).forEach($$3x -> $$6.a($$3, $$3.a(), $$5, $$3.E_(), new ehb($$3x.d(), $$3.I_(), $$3x.e(), $$3x.f(), $$3.al(), $$3x.g()), $$3x));
         String $$10 = $$1.h().a().toString();
         $$0.a(() -> wx.a("commands.place.structure.success", $$10, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(ee $$0, akm $$1, io $$2, dkl $$3, div $$4, float $$5, int $$6) throws CommandSyntaxException {
      aqm $$7 = $$0.e();
      elk $$8 = $$7.q();

      Optional<elj> $$9;
      try {
         $$9 = $$8.b($$1);
      } catch (z var13) {
         throw d.create($$1);
      }

      if ($$9.isEmpty()) {
         throw d.create($$1);
      } else {
         elj $$12 = $$9.get();
         a($$7, new dae($$2), new dae($$2.a($$12.a())));
         elf $$13 = new elf().a($$4).a($$3);
         if ($$5 < 1.0F) {
            $$13.b().a(new ekn($$5)).a(dpv.b((long)$$6));
         }

         boolean $$14 = $$12.a($$7, $$2, $$2, $$13, dpv.b((long)$$6), 2);
         if (!$$14) {
            throw e.create();
         } else {
            $$0.a(() -> wx.a("commands.place.template.success", wx.a($$1), $$2.u(), $$2.v(), $$2.w()), true);
            return 1;
         }
      }
   }

   private static void a(aqm $$0, dae $$1, dae $$2) throws CommandSyntaxException {
      if (dae.a($$1, $$2).filter($$1x -> !$$0.p($$1x.l())).findAny().isPresent()) {
         throw ga.a.create();
      }
   }
}

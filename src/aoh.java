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

public class aoh {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xh.c("commands.place.feature.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xh.c("commands.place.jigsaw.failed"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xh.c("commands.place.structure.failed"));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xh.b("commands.place.template.invalid", $$0));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xh.c("commands.place.template.failed"));
   private static final SuggestionProvider<ev> f = ($$0, $$1) -> {
      epu $$2 = ((ev)$$0.getSource()).e().q();
      return fa.a($$2.a(), $$1);
   };

   public static void a(CommandDispatcher<ev> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("place")
                        .requires($$0x -> $$0x.c(2)))
                     .then(
                        ew.a("feature")
                           .then(
                              ((RequiredArgumentBuilder)ew.a("feature", fv.a(ly.aJ))
                                    .executes($$0x -> a((ev)$$0x.getSource(), fv.a($$0x, "feature"), jg.a((jz)((ev)$$0x.getSource()).d()))))
                                 .then(ew.a("pos", gr.a()).executes($$0x -> a((ev)$$0x.getSource(), fv.a($$0x, "feature"), gr.a($$0x, "pos"))))
                           )
                     ))
                  .then(
                     ew.a("jigsaw")
                        .then(
                           ew.a("pool", fv.a(ly.aV))
                              .then(
                                 ew.a("target", fw.a())
                                    .then(
                                       ((RequiredArgumentBuilder)ew.a("max_depth", IntegerArgumentType.integer(1, 20))
                                             .executes(
                                                $$0x -> a(
                                                      (ev)$$0x.getSource(),
                                                      fv.c($$0x, "pool"),
                                                      fw.c($$0x, "target"),
                                                      IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                      jg.a((jz)((ev)$$0x.getSource()).d())
                                                   )
                                             ))
                                          .then(
                                             ew.a("position", gr.a())
                                                .executes(
                                                   $$0x -> a(
                                                         (ev)$$0x.getSource(),
                                                         fv.c($$0x, "pool"),
                                                         fw.c($$0x, "target"),
                                                         IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                         gr.a($$0x, "position")
                                                      )
                                                )
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  ew.a("structure")
                     .then(
                        ((RequiredArgumentBuilder)ew.a("structure", fv.a(ly.aS))
                              .executes($$0x -> b((ev)$$0x.getSource(), fv.b($$0x, "structure"), jg.a((jz)((ev)$$0x.getSource()).d()))))
                           .then(ew.a("pos", gr.a()).executes($$0x -> b((ev)$$0x.getSource(), fv.b($$0x, "structure"), gr.a($$0x, "pos"))))
                     )
               ))
            .then(
               ew.a("template")
                  .then(
                     ((RequiredArgumentBuilder)ew.a("template", fw.a())
                           .suggests(f)
                           .executes($$0x -> a((ev)$$0x.getSource(), fw.c($$0x, "template"), jg.a((jz)((ev)$$0x.getSource()).d()), dol.a, dmu.a, 1.0F, 0)))
                        .then(
                           ((RequiredArgumentBuilder)ew.a("pos", gr.a())
                                 .executes($$0x -> a((ev)$$0x.getSource(), fw.c($$0x, "template"), gr.a($$0x, "pos"), dol.a, dmu.a, 1.0F, 0)))
                              .then(
                                 ((RequiredArgumentBuilder)ew.a("rotation", gj.a())
                                       .executes(
                                          $$0x -> a((ev)$$0x.getSource(), fw.c($$0x, "template"), gr.a($$0x, "pos"), gj.a($$0x, "rotation"), dmu.a, 1.0F, 0)
                                       ))
                                    .then(
                                       ((RequiredArgumentBuilder)ew.a("mirror", gi.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ev)$$0x.getSource(),
                                                      fw.c($$0x, "template"),
                                                      gr.a($$0x, "pos"),
                                                      gj.a($$0x, "rotation"),
                                                      gi.a($$0x, "mirror"),
                                                      1.0F,
                                                      0
                                                   )
                                             ))
                                          .then(
                                             ((RequiredArgumentBuilder)ew.a("integrity", FloatArgumentType.floatArg(0.0F, 1.0F))
                                                   .executes(
                                                      $$0x -> a(
                                                            (ev)$$0x.getSource(),
                                                            fw.c($$0x, "template"),
                                                            gr.a($$0x, "pos"),
                                                            gj.a($$0x, "rotation"),
                                                            gi.a($$0x, "mirror"),
                                                            FloatArgumentType.getFloat($$0x, "integrity"),
                                                            0
                                                         )
                                                   ))
                                                .then(
                                                   ew.a("seed", IntegerArgumentType.integer())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ev)$$0x.getSource(),
                                                               fw.c($$0x, "template"),
                                                               gr.a($$0x, "pos"),
                                                               gj.a($$0x, "rotation"),
                                                               gi.a($$0x, "mirror"),
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

   public static int a(ev $$0, jp.c<edr<?, ?>> $$1, jg $$2) throws CommandSyntaxException {
      arm $$3 = $$0.e();
      edr<?, ?> $$4 = $$1.a();
      deb $$5 = new deb($$2);
      a($$3, new deb($$5.e - 1, $$5.f - 1), new deb($$5.e + 1, $$5.f + 1));
      if (!$$4.a($$3, $$3.l().g(), $$3.E_(), $$2)) {
         throw a.create();
      } else {
         String $$6 = $$1.h().a().toString();
         $$0.a(() -> xh.a("commands.place.feature.success", $$6, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(ev $$0, jp<enb> $$1, alh $$2, int $$3, jg $$4) throws CommandSyntaxException {
      arm $$5 = $$0.e();
      deb $$6 = new deb($$4);
      a($$5, $$6, $$6);
      if (!emv.a($$5, $$1, $$2, $$3, $$4, false)) {
         throw b.create();
      } else {
         $$0.a(() -> xh.a("commands.place.jigsaw.success", $$4.u(), $$4.v(), $$4.w()), true);
         return 1;
      }
   }

   public static int b(ev $$0, jp.c<elr> $$1, jg $$2) throws CommandSyntaxException {
      arm $$3 = $$0.e();
      elr $$4 = $$1.a();
      dxa $$5 = $$3.l().g();
      elz $$6 = $$4.a($$0.v(), $$5, $$5.d(), $$3.l().i(), $$3.q(), $$3.C(), new deb($$2), 0, $$3, $$0x -> true);
      if (!$$6.b()) {
         throw c.create();
      } else {
         elj $$7 = $$6.a();
         deb $$8 = new deb(ki.a($$7.h()), ki.a($$7.j()));
         deb $$9 = new deb(ki.a($$7.k()), ki.a($$7.m()));
         a($$3, $$8, $$9);
         deb.a($$8, $$9).forEach($$3x -> $$6.a($$3, $$3.a(), $$5, $$3.E_(), new elj($$3x.d(), $$3.I_(), $$3x.e(), $$3x.f(), $$3.an() + 1, $$3x.g()), $$3x));
         String $$10 = $$1.h().a().toString();
         $$0.a(() -> xh.a("commands.place.structure.success", $$10, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(ev $$0, alh $$1, jg $$2, dol $$3, dmu $$4, float $$5, int $$6) throws CommandSyntaxException {
      arm $$7 = $$0.e();
      epu $$8 = $$7.q();

      Optional<ept> $$9;
      try {
         $$9 = $$8.b($$1);
      } catch (aa var13) {
         throw d.create($$1);
      }

      if ($$9.isEmpty()) {
         throw d.create($$1);
      } else {
         ept $$12 = $$9.get();
         a($$7, new deb($$2), new deb($$2.a($$12.a())));
         epp $$13 = new epp().a($$4).a($$3);
         if ($$5 < 1.0F) {
            $$13.b().a(new eow($$5)).a(dtx.b((long)$$6));
         }

         boolean $$14 = $$12.a($$7, $$2, $$2, $$13, dtx.b((long)$$6), 2);
         if (!$$14) {
            throw e.create();
         } else {
            $$0.a(() -> xh.a("commands.place.template.success", xh.a($$1), $$2.u(), $$2.v(), $$2.w()), true);
            return 1;
         }
      }
   }

   private static void a(arm $$0, deb $$1, deb $$2) throws CommandSyntaxException {
      if (deb.a($$1, $$2).filter($$1x -> !$$0.p($$1x.l())).findAny().isPresent()) {
         throw gr.a.create();
      }
   }
}

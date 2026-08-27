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

public class ahn {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tf.c("commands.place.feature.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(tf.c("commands.place.jigsaw.failed"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(tf.c("commands.place.structure.failed"));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> tf.a("commands.place.template.invalid", $$0));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(tf.c("commands.place.template.failed"));
   private static final SuggestionProvider<dr> f = ($$0, $$1) -> {
      dyt $$2 = ((dr)$$0.getSource()).e().p();
      return du.a($$2.a(), $$1);
   };

   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("place")
                        .requires($$0x -> $$0x.c(2)))
                     .then(
                        ds.a("feature")
                           .then(
                              ((RequiredArgumentBuilder)ds.a("feature", ep.a(jc.as))
                                    .executes($$0x -> a((dr)$$0x.getSource(), ep.a($$0x, "feature"), gu.a(((dr)$$0x.getSource()).d()))))
                                 .then(ds.a("pos", fi.a()).executes($$0x -> a((dr)$$0x.getSource(), ep.a($$0x, "feature"), fi.a($$0x, "pos"))))
                           )
                     ))
                  .then(
                     ds.a("jigsaw")
                        .then(
                           ds.a("pool", ep.a(jc.aC))
                              .then(
                                 ds.a("target", eq.a())
                                    .then(
                                       ((RequiredArgumentBuilder)ds.a("max_depth", IntegerArgumentType.integer(1, 7))
                                             .executes(
                                                $$0x -> a(
                                                      (dr)$$0x.getSource(),
                                                      ep.c($$0x, "pool"),
                                                      eq.e($$0x, "target"),
                                                      IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                      gu.a(((dr)$$0x.getSource()).d())
                                                   )
                                             ))
                                          .then(
                                             ds.a("position", fi.a())
                                                .executes(
                                                   $$0x -> a(
                                                         (dr)$$0x.getSource(),
                                                         ep.c($$0x, "pool"),
                                                         eq.e($$0x, "target"),
                                                         IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                         fi.a($$0x, "position")
                                                      )
                                                )
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  ds.a("structure")
                     .then(
                        ((RequiredArgumentBuilder)ds.a("structure", ep.a(jc.az))
                              .executes($$0x -> b((dr)$$0x.getSource(), ep.b($$0x, "structure"), gu.a(((dr)$$0x.getSource()).d()))))
                           .then(ds.a("pos", fi.a()).executes($$0x -> b((dr)$$0x.getSource(), ep.b($$0x, "structure"), fi.a($$0x, "pos"))))
                     )
               ))
            .then(
               ds.a("template")
                  .then(
                     ((RequiredArgumentBuilder)ds.a("template", eq.a())
                           .suggests(f)
                           .executes($$0x -> a((dr)$$0x.getSource(), eq.e($$0x, "template"), gu.a(((dr)$$0x.getSource()).d()), cyy.a, cxh.a, 1.0F, 0)))
                        .then(
                           ((RequiredArgumentBuilder)ds.a("pos", fi.a())
                                 .executes($$0x -> a((dr)$$0x.getSource(), eq.e($$0x, "template"), fi.a($$0x, "pos"), cyy.a, cxh.a, 1.0F, 0)))
                              .then(
                                 ((RequiredArgumentBuilder)ds.a("rotation", fa.a())
                                       .executes(
                                          $$0x -> a((dr)$$0x.getSource(), eq.e($$0x, "template"), fi.a($$0x, "pos"), fa.a($$0x, "rotation"), cxh.a, 1.0F, 0)
                                       ))
                                    .then(
                                       ((RequiredArgumentBuilder)ds.a("mirror", ez.a())
                                             .executes(
                                                $$0x -> a(
                                                      (dr)$$0x.getSource(),
                                                      eq.e($$0x, "template"),
                                                      fi.a($$0x, "pos"),
                                                      fa.a($$0x, "rotation"),
                                                      ez.a($$0x, "mirror"),
                                                      1.0F,
                                                      0
                                                   )
                                             ))
                                          .then(
                                             ((RequiredArgumentBuilder)ds.a("integrity", FloatArgumentType.floatArg(0.0F, 1.0F))
                                                   .executes(
                                                      $$0x -> a(
                                                            (dr)$$0x.getSource(),
                                                            eq.e($$0x, "template"),
                                                            fi.a($$0x, "pos"),
                                                            fa.a($$0x, "rotation"),
                                                            ez.a($$0x, "mirror"),
                                                            FloatArgumentType.getFloat($$0x, "integrity"),
                                                            0
                                                         )
                                                   ))
                                                .then(
                                                   ds.a("seed", IntegerArgumentType.integer())
                                                      .executes(
                                                         $$0x -> a(
                                                               (dr)$$0x.getSource(),
                                                               eq.e($$0x, "template"),
                                                               fi.a($$0x, "pos"),
                                                               fa.a($$0x, "rotation"),
                                                               ez.a($$0x, "mirror"),
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

   public static int a(dr $$0, he.c<dna<?, ?>> $$1, gu $$2) throws CommandSyntaxException {
      akk $$3 = $$0.e();
      dna<?, ?> $$4 = $$1.a();
      cot $$5 = new cot($$2);
      a($$3, new cot($$5.e - 1, $$5.f - 1), new cot($$5.e + 1, $$5.f + 1));
      if (!$$4.a($$3, $$3.k().g(), $$3.y_(), $$2)) {
         throw a.create();
      } else {
         String $$6 = $$1.g().a().toString();
         $$0.a(() -> tf.a("commands.place.feature.success", $$6, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(dr $$0, he<dwi> $$1, aer $$2, int $$3, gu $$4) throws CommandSyntaxException {
      akk $$5 = $$0.e();
      if (!dwc.a($$5, $$1, $$2, $$3, $$4, false)) {
         throw b.create();
      } else {
         $$0.a(() -> tf.a("commands.place.jigsaw.success", $$4.u(), $$4.v(), $$4.w()), true);
         return 1;
      }
   }

   public static int b(dr $$0, he.c<duz> $$1, gu $$2) throws CommandSyntaxException {
      akk $$3 = $$0.e();
      duz $$4 = $$1.a();
      dgx $$5 = $$3.k().g();
      dvh $$6 = $$4.a($$0.v(), $$5, $$5.c(), $$3.k().i(), $$3.p(), $$3.A(), new cot($$2), 0, $$3, $$0x -> true);
      if (!$$6.b()) {
         throw c.create();
      } else {
         dur $$7 = $$6.a();
         cot $$8 = new cot(hx.a($$7.g()), hx.a($$7.i()));
         cot $$9 = new cot(hx.a($$7.j()), hx.a($$7.l()));
         a($$3, $$8, $$9);
         cot.a($$8, $$9).forEach($$3x -> $$6.a($$3, $$3.a(), $$5, $$3.y_(), new dur($$3x.d(), $$3.C_(), $$3x.e(), $$3x.f(), $$3.aj(), $$3x.g()), $$3x));
         String $$10 = $$1.g().a().toString();
         $$0.a(() -> tf.a("commands.place.structure.success", $$10, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(dr $$0, aer $$1, gu $$2, cyy $$3, cxh $$4, float $$5, int $$6) throws CommandSyntaxException {
      akk $$7 = $$0.e();
      dyt $$8 = $$7.p();

      Optional<dys> $$9;
      try {
         $$9 = $$8.b($$1);
      } catch (z var13) {
         throw d.create($$1);
      }

      if ($$9.isEmpty()) {
         throw d.create($$1);
      } else {
         dys $$12 = $$9.get();
         a($$7, new cot($$2), new cot($$2.a($$12.a())));
         dyo $$13 = new dyo().a($$4).a($$3);
         if ($$5 < 1.0F) {
            $$13.b().a(new dxw($$5)).a(ddz.b((long)$$6));
         }

         boolean $$14 = $$12.a($$7, $$2, $$2, $$13, ddz.b((long)$$6), 2);
         if (!$$14) {
            throw e.create();
         } else {
            $$0.a(() -> tf.a("commands.place.template.success", $$1, $$2.u(), $$2.v(), $$2.w()), true);
            return 1;
         }
      }
   }

   private static void a(akk $$0, cot $$1, cot $$2) throws CommandSyntaxException {
      if (cot.a($$1, $$2).filter($$1x -> !$$0.o($$1x.l())).findAny().isPresent()) {
         throw fi.a.create();
      }
   }
}

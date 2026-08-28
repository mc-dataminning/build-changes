import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;

public class amr {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xi.b("commands.attribute.failed.entity", $$0));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xi.b("commands.attribute.failed.no_attribute", $$0, $$1)
   );
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xi.b("commands.attribute.failed.no_modifier", $$1, $$0, $$2)
   );
   private static final Dynamic3CommandExceptionType d = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xi.b("commands.attribute.failed.modifier_already_present", $$2, $$1, $$0)
   );

   public static void a(CommandDispatcher<ew> $$0, es $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("attribute").requires($$0x -> $$0x.c(2)))
            .then(
               ex.a("target", fj.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ex.a("attribute", fv.a($$1, lz.c))
                              .then(
                                 ((LiteralArgumentBuilder)ex.a("get")
                                       .executes($$0x -> a((ew)$$0x.getSource(), fj.a($$0x, "target"), fv.a($$0x, "attribute"), 1.0)))
                                    .then(
                                       ex.a("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             $$0x -> a(
                                                   (ew)$$0x.getSource(),
                                                   fj.a($$0x, "target"),
                                                   fv.a($$0x, "attribute"),
                                                   DoubleArgumentType.getDouble($$0x, "scale")
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)ex.a("base")
                                    .then(
                                       ex.a("set")
                                          .then(
                                             ex.a("value", DoubleArgumentType.doubleArg())
                                                .executes(
                                                   $$0x -> c(
                                                         (ew)$$0x.getSource(),
                                                         fj.a($$0x, "target"),
                                                         fv.a($$0x, "attribute"),
                                                         DoubleArgumentType.getDouble($$0x, "value")
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)ex.a("get")
                                          .executes($$0x -> b((ew)$$0x.getSource(), fj.a($$0x, "target"), fv.a($$0x, "attribute"), 1.0)))
                                       .then(
                                          ex.a("scale", DoubleArgumentType.doubleArg())
                                             .executes(
                                                $$0x -> b(
                                                      (ew)$$0x.getSource(),
                                                      fj.a($$0x, "target"),
                                                      fv.a($$0x, "attribute"),
                                                      DoubleArgumentType.getDouble($$0x, "scale")
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("modifier")
                                    .then(
                                       ex.a("add")
                                          .then(
                                             ex.a("id", fx.a())
                                                .then(
                                                   ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ex.a("value", DoubleArgumentType.doubleArg())
                                                            .then(
                                                               ex.a("add_value")
                                                                  .executes(
                                                                     $$0x -> a(
                                                                           (ew)$$0x.getSource(),
                                                                           fj.a($$0x, "target"),
                                                                           fv.a($$0x, "attribute"),
                                                                           fx.c($$0x, "id"),
                                                                           DoubleArgumentType.getDouble($$0x, "value"),
                                                                           bwg.a.a
                                                                        )
                                                                  )
                                                            ))
                                                         .then(
                                                            ex.a("add_multiplied_base")
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (ew)$$0x.getSource(),
                                                                        fj.a($$0x, "target"),
                                                                        fv.a($$0x, "attribute"),
                                                                        fx.c($$0x, "id"),
                                                                        DoubleArgumentType.getDouble($$0x, "value"),
                                                                        bwg.a.b
                                                                     )
                                                               )
                                                         ))
                                                      .then(
                                                         ex.a("add_multiplied_total")
                                                            .executes(
                                                               $$0x -> a(
                                                                     (ew)$$0x.getSource(),
                                                                     fj.a($$0x, "target"),
                                                                     fv.a($$0x, "attribute"),
                                                                     fx.c($$0x, "id"),
                                                                     DoubleArgumentType.getDouble($$0x, "value"),
                                                                     bwg.a.c
                                                                  )
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ex.a("remove")
                                       .then(
                                          ex.a("id", fx.a())
                                             .executes($$0x -> a((ew)$$0x.getSource(), fj.a($$0x, "target"), fv.a($$0x, "attribute"), fx.c($$0x, "id")))
                                       )
                                 ))
                              .then(
                                 ex.a("value")
                                    .then(
                                       ex.a("get")
                                          .then(
                                             ((RequiredArgumentBuilder)ex.a("id", fx.a())
                                                   .executes(
                                                      $$0x -> a((ew)$$0x.getSource(), fj.a($$0x, "target"), fv.a($$0x, "attribute"), fx.c($$0x, "id"), 1.0)
                                                   ))
                                                .then(
                                                   ex.a("scale", DoubleArgumentType.doubleArg())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ew)$$0x.getSource(),
                                                               fj.a($$0x, "target"),
                                                               fv.a($$0x, "attribute"),
                                                               fx.c($$0x, "id"),
                                                               DoubleArgumentType.getDouble($$0x, "scale")
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

   private static bwe a(bue $$0, jq<bwd> $$1) throws CommandSyntaxException {
      bwe $$2 = a($$0).fa().a($$1);
      if ($$2 == null) {
         throw b.create($$0.am(), a($$1));
      } else {
         return $$2;
      }
   }

   private static bva a(bue $$0) throws CommandSyntaxException {
      if (!($$0 instanceof bva)) {
         throw a.create($$0.am());
      } else {
         return (bva)$$0;
      }
   }

   private static bva b(bue $$0, jq<bwd> $$1) throws CommandSyntaxException {
      bva $$2 = a($$0);
      if (!$$2.fa().b($$1)) {
         throw b.create($$0.am(), a($$1));
      } else {
         return $$2;
      }
   }

   private static int a(ew $$0, bue $$1, jq<bwd> $$2, double $$3) throws CommandSyntaxException {
      bva $$4 = b($$1, $$2);
      double $$5 = $$4.h($$2);
      $$0.a(() -> xi.a("commands.attribute.value.get.success", a($$2), $$1.am(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int b(ew $$0, bue $$1, jq<bwd> $$2, double $$3) throws CommandSyntaxException {
      bva $$4 = b($$1, $$2);
      double $$5 = $$4.i($$2);
      $$0.a(() -> xi.a("commands.attribute.base_value.get.success", a($$2), $$1.am(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int a(ew $$0, bue $$1, jq<bwd> $$2, ali $$3, double $$4) throws CommandSyntaxException {
      bva $$5 = b($$1, $$2);
      bwf $$6 = $$5.fa();
      if (!$$6.a($$2, $$3)) {
         throw c.create($$1.am(), a($$2), $$3);
      } else {
         double $$7 = $$6.b($$2, $$3);
         $$0.a(() -> xi.a("commands.attribute.modifier.value.get.success", xi.a($$3), a($$2), $$1.am(), $$7), false);
         return (int)($$7 * $$4);
      }
   }

   private static int c(ew $$0, bue $$1, jq<bwd> $$2, double $$3) throws CommandSyntaxException {
      a($$1, $$2).a($$3);
      $$0.a(() -> xi.a("commands.attribute.base_value.set.success", a($$2), $$1.am(), $$3), false);
      return 1;
   }

   private static int a(ew $$0, bue $$1, jq<bwd> $$2, ali $$3, double $$4, bwg.a $$5) throws CommandSyntaxException {
      bwe $$6 = a($$1, $$2);
      bwg $$7 = new bwg($$3, $$4, $$5);
      if ($$6.b($$3)) {
         throw d.create($$1.am(), a($$2), $$3);
      } else {
         $$6.d($$7);
         $$0.a(() -> xi.a("commands.attribute.modifier.add.success", xi.a($$3), a($$2), $$1.am()), false);
         return 1;
      }
   }

   private static int a(ew $$0, bue $$1, jq<bwd> $$2, ali $$3) throws CommandSyntaxException {
      bwe $$4 = a($$1, $$2);
      if ($$4.c($$3)) {
         $$0.a(() -> xi.a("commands.attribute.modifier.remove.success", xi.a($$3), a($$2), $$1.am()), false);
         return 1;
      } else {
         throw c.create($$1.am(), a($$2), $$3);
      }
   }

   private static xi a(jq<bwd> $$0) {
      return xi.c($$0.a().c());
   }
}

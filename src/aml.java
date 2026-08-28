import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.UUID;

public class aml {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xo.b("commands.attribute.failed.entity", $$0));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xo.b("commands.attribute.failed.no_attribute", $$0, $$1)
   );
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xo.b("commands.attribute.failed.no_modifier", $$1, $$0, $$2)
   );
   private static final Dynamic3CommandExceptionType d = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xo.b("commands.attribute.failed.modifier_already_present", $$2, $$1, $$0)
   );

   public static void a(CommandDispatcher<ep> $$0, el $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("attribute").requires($$0x -> $$0x.c(2)))
            .then(
               eq.a("target", fc.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)eq.a("attribute", fo.a($$1, lq.c))
                              .then(
                                 ((LiteralArgumentBuilder)eq.a("get")
                                       .executes($$0x -> a((ep)$$0x.getSource(), fc.a($$0x, "target"), fo.a($$0x, "attribute"), 1.0)))
                                    .then(
                                       eq.a("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             $$0x -> a(
                                                   (ep)$$0x.getSource(),
                                                   fc.a($$0x, "target"),
                                                   fo.a($$0x, "attribute"),
                                                   DoubleArgumentType.getDouble($$0x, "scale")
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)eq.a("base")
                                    .then(
                                       eq.a("set")
                                          .then(
                                             eq.a("value", DoubleArgumentType.doubleArg())
                                                .executes(
                                                   $$0x -> c(
                                                         (ep)$$0x.getSource(),
                                                         fc.a($$0x, "target"),
                                                         fo.a($$0x, "attribute"),
                                                         DoubleArgumentType.getDouble($$0x, "value")
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)eq.a("get")
                                          .executes($$0x -> b((ep)$$0x.getSource(), fc.a($$0x, "target"), fo.a($$0x, "attribute"), 1.0)))
                                       .then(
                                          eq.a("scale", DoubleArgumentType.doubleArg())
                                             .executes(
                                                $$0x -> b(
                                                      (ep)$$0x.getSource(),
                                                      fc.a($$0x, "target"),
                                                      fo.a($$0x, "attribute"),
                                                      DoubleArgumentType.getDouble($$0x, "scale")
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           ((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("modifier")
                                    .then(
                                       eq.a("add")
                                          .then(
                                             eq.a("uuid", gf.a())
                                                .then(
                                                   eq.a("name", StringArgumentType.string())
                                                      .then(
                                                         ((RequiredArgumentBuilder)((RequiredArgumentBuilder)eq.a("value", DoubleArgumentType.doubleArg())
                                                                  .then(
                                                                     eq.a("add_value")
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ep)$$0x.getSource(),
                                                                                 fc.a($$0x, "target"),
                                                                                 fo.a($$0x, "attribute"),
                                                                                 gf.a($$0x, "uuid"),
                                                                                 StringArgumentType.getString($$0x, "name"),
                                                                                 DoubleArgumentType.getDouble($$0x, "value"),
                                                                                 buu.a.a
                                                                              )
                                                                        )
                                                                  ))
                                                               .then(
                                                                  eq.a("add_multiplied_base")
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ep)$$0x.getSource(),
                                                                              fc.a($$0x, "target"),
                                                                              fo.a($$0x, "attribute"),
                                                                              gf.a($$0x, "uuid"),
                                                                              StringArgumentType.getString($$0x, "name"),
                                                                              DoubleArgumentType.getDouble($$0x, "value"),
                                                                              buu.a.b
                                                                           )
                                                                     )
                                                               ))
                                                            .then(
                                                               eq.a("add_multiplied_total")
                                                                  .executes(
                                                                     $$0x -> a(
                                                                           (ep)$$0x.getSource(),
                                                                           fc.a($$0x, "target"),
                                                                           fo.a($$0x, "attribute"),
                                                                           gf.a($$0x, "uuid"),
                                                                           StringArgumentType.getString($$0x, "name"),
                                                                           DoubleArgumentType.getDouble($$0x, "value"),
                                                                           buu.a.c
                                                                        )
                                                                  )
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    eq.a("remove")
                                       .then(
                                          eq.a("uuid", gf.a())
                                             .executes($$0x -> a((ep)$$0x.getSource(), fc.a($$0x, "target"), fo.a($$0x, "attribute"), gf.a($$0x, "uuid")))
                                       )
                                 ))
                              .then(
                                 eq.a("value")
                                    .then(
                                       eq.a("get")
                                          .then(
                                             ((RequiredArgumentBuilder)eq.a("uuid", gf.a())
                                                   .executes(
                                                      $$0x -> a((ep)$$0x.getSource(), fc.a($$0x, "target"), fo.a($$0x, "attribute"), gf.a($$0x, "uuid"), 1.0)
                                                   ))
                                                .then(
                                                   eq.a("scale", DoubleArgumentType.doubleArg())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ep)$$0x.getSource(),
                                                               fc.a($$0x, "target"),
                                                               fo.a($$0x, "attribute"),
                                                               gf.a($$0x, "uuid"),
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

   private static bus a(bst $$0, ji<bur> $$1) throws CommandSyntaxException {
      bus $$2 = a($$0).eW().a($$1);
      if ($$2 == null) {
         throw b.create($$0.af(), a($$1));
      } else {
         return $$2;
      }
   }

   private static bto a(bst $$0) throws CommandSyntaxException {
      if (!($$0 instanceof bto)) {
         throw a.create($$0.af());
      } else {
         return (bto)$$0;
      }
   }

   private static bto b(bst $$0, ji<bur> $$1) throws CommandSyntaxException {
      bto $$2 = a($$0);
      if (!$$2.eW().b($$1)) {
         throw b.create($$0.af(), a($$1));
      } else {
         return $$2;
      }
   }

   private static int a(ep $$0, bst $$1, ji<bur> $$2, double $$3) throws CommandSyntaxException {
      bto $$4 = b($$1, $$2);
      double $$5 = $$4.g($$2);
      $$0.a(() -> xo.a("commands.attribute.value.get.success", a($$2), $$1.af(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int b(ep $$0, bst $$1, ji<bur> $$2, double $$3) throws CommandSyntaxException {
      bto $$4 = b($$1, $$2);
      double $$5 = $$4.h($$2);
      $$0.a(() -> xo.a("commands.attribute.base_value.get.success", a($$2), $$1.af(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int a(ep $$0, bst $$1, ji<bur> $$2, UUID $$3, double $$4) throws CommandSyntaxException {
      bto $$5 = b($$1, $$2);
      but $$6 = $$5.eW();
      if (!$$6.a($$2, $$3)) {
         throw c.create($$1.af(), a($$2), $$3);
      } else {
         double $$7 = $$6.b($$2, $$3);
         $$0.a(() -> xo.a("commands.attribute.modifier.value.get.success", xo.a($$3), a($$2), $$1.af(), $$7), false);
         return (int)($$7 * $$4);
      }
   }

   private static int c(ep $$0, bst $$1, ji<bur> $$2, double $$3) throws CommandSyntaxException {
      a($$1, $$2).a($$3);
      $$0.a(() -> xo.a("commands.attribute.base_value.set.success", a($$2), $$1.af(), $$3), false);
      return 1;
   }

   private static int a(ep $$0, bst $$1, ji<bur> $$2, UUID $$3, String $$4, double $$5, buu.a $$6) throws CommandSyntaxException {
      bus $$7 = a($$1, $$2);
      buu $$8 = new buu($$3, $$4, $$5, $$6);
      if ($$7.a($$8)) {
         throw d.create($$1.af(), a($$2), $$3);
      } else {
         $$7.d($$8);
         $$0.a(() -> xo.a("commands.attribute.modifier.add.success", xo.a($$3), a($$2), $$1.af()), false);
         return 1;
      }
   }

   private static int a(ep $$0, bst $$1, ji<bur> $$2, UUID $$3) throws CommandSyntaxException {
      bus $$4 = a($$1, $$2);
      if ($$4.c($$3)) {
         $$0.a(() -> xo.a("commands.attribute.modifier.remove.success", xo.a($$3), a($$2), $$1.af()), false);
         return 1;
      } else {
         throw c.create($$1.af(), a($$2), $$3);
      }
   }

   private static xo a(ji<bur> $$0) {
      return xo.c($$0.a().c());
   }
}

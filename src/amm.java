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

public class amm {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xp.b("commands.attribute.failed.entity", $$0));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xp.b("commands.attribute.failed.no_attribute", $$0, $$1)
   );
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xp.b("commands.attribute.failed.no_modifier", $$1, $$0, $$2)
   );
   private static final Dynamic3CommandExceptionType d = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xp.b("commands.attribute.failed.modifier_already_present", $$2, $$1, $$0)
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
                                                                                 bux.a.a
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
                                                                              bux.a.b
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
                                                                           bux.a.c
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

   private static buv a(bsw $$0, ji<buu> $$1) throws CommandSyntaxException {
      buv $$2 = a($$0).eW().a($$1);
      if ($$2 == null) {
         throw b.create($$0.af(), a($$1));
      } else {
         return $$2;
      }
   }

   private static btr a(bsw $$0) throws CommandSyntaxException {
      if (!($$0 instanceof btr)) {
         throw a.create($$0.af());
      } else {
         return (btr)$$0;
      }
   }

   private static btr b(bsw $$0, ji<buu> $$1) throws CommandSyntaxException {
      btr $$2 = a($$0);
      if (!$$2.eW().b($$1)) {
         throw b.create($$0.af(), a($$1));
      } else {
         return $$2;
      }
   }

   private static int a(ep $$0, bsw $$1, ji<buu> $$2, double $$3) throws CommandSyntaxException {
      btr $$4 = b($$1, $$2);
      double $$5 = $$4.g($$2);
      $$0.a(() -> xp.a("commands.attribute.value.get.success", a($$2), $$1.af(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int b(ep $$0, bsw $$1, ji<buu> $$2, double $$3) throws CommandSyntaxException {
      btr $$4 = b($$1, $$2);
      double $$5 = $$4.h($$2);
      $$0.a(() -> xp.a("commands.attribute.base_value.get.success", a($$2), $$1.af(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int a(ep $$0, bsw $$1, ji<buu> $$2, UUID $$3, double $$4) throws CommandSyntaxException {
      btr $$5 = b($$1, $$2);
      buw $$6 = $$5.eW();
      if (!$$6.a($$2, $$3)) {
         throw c.create($$1.af(), a($$2), $$3);
      } else {
         double $$7 = $$6.b($$2, $$3);
         $$0.a(() -> xp.a("commands.attribute.modifier.value.get.success", xp.a($$3), a($$2), $$1.af(), $$7), false);
         return (int)($$7 * $$4);
      }
   }

   private static int c(ep $$0, bsw $$1, ji<buu> $$2, double $$3) throws CommandSyntaxException {
      a($$1, $$2).a($$3);
      $$0.a(() -> xp.a("commands.attribute.base_value.set.success", a($$2), $$1.af(), $$3), false);
      return 1;
   }

   private static int a(ep $$0, bsw $$1, ji<buu> $$2, UUID $$3, String $$4, double $$5, bux.a $$6) throws CommandSyntaxException {
      buv $$7 = a($$1, $$2);
      bux $$8 = new bux($$3, $$4, $$5, $$6);
      if ($$7.a($$8)) {
         throw d.create($$1.af(), a($$2), $$3);
      } else {
         $$7.d($$8);
         $$0.a(() -> xp.a("commands.attribute.modifier.add.success", xp.a($$3), a($$2), $$1.af()), false);
         return 1;
      }
   }

   private static int a(ep $$0, bsw $$1, ji<buu> $$2, UUID $$3) throws CommandSyntaxException {
      buv $$4 = a($$1, $$2);
      if ($$4.c($$3)) {
         $$0.a(() -> xp.a("commands.attribute.modifier.remove.success", xp.a($$3), a($$2), $$1.af()), false);
         return 1;
      } else {
         throw c.create($$1.af(), a($$2), $$3);
      }
   }

   private static xp a(ji<buu> $$0) {
      return xp.c($$0.a().c());
   }
}

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

public class ahl {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> ur.b("commands.attribute.failed.entity", $$0));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> ur.b("commands.attribute.failed.no_attribute", $$0, $$1)
   );
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> ur.b("commands.attribute.failed.no_modifier", $$1, $$0, $$2)
   );
   private static final Dynamic3CommandExceptionType d = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> ur.b("commands.attribute.failed.modifier_already_present", $$2, $$1, $$0)
   );

   public static void a(CommandDispatcher<du> $$0, dp $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("attribute").requires($$0x -> $$0x.c(2)))
            .then(
               dv.a("target", eg.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a("attribute", es.a($$1, jz.b))
                              .then(
                                 ((LiteralArgumentBuilder)dv.a("get")
                                       .executes($$0x -> a((du)$$0x.getSource(), eg.a($$0x, "target"), es.a($$0x, "attribute"), 1.0)))
                                    .then(
                                       dv.a("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             $$0x -> a(
                                                   (du)$$0x.getSource(),
                                                   eg.a($$0x, "target"),
                                                   es.a($$0x, "attribute"),
                                                   DoubleArgumentType.getDouble($$0x, "scale")
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)dv.a("base")
                                    .then(
                                       dv.a("set")
                                          .then(
                                             dv.a("value", DoubleArgumentType.doubleArg())
                                                .executes(
                                                   $$0x -> c(
                                                         (du)$$0x.getSource(),
                                                         eg.a($$0x, "target"),
                                                         es.a($$0x, "attribute"),
                                                         DoubleArgumentType.getDouble($$0x, "value")
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)dv.a("get")
                                          .executes($$0x -> b((du)$$0x.getSource(), eg.a($$0x, "target"), es.a($$0x, "attribute"), 1.0)))
                                       .then(
                                          dv.a("scale", DoubleArgumentType.doubleArg())
                                             .executes(
                                                $$0x -> b(
                                                      (du)$$0x.getSource(),
                                                      eg.a($$0x, "target"),
                                                      es.a($$0x, "attribute"),
                                                      DoubleArgumentType.getDouble($$0x, "scale")
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           ((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("modifier")
                                    .then(
                                       dv.a("add")
                                          .then(
                                             dv.a("uuid", fg.a())
                                                .then(
                                                   dv.a("name", StringArgumentType.string())
                                                      .then(
                                                         ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a("value", DoubleArgumentType.doubleArg())
                                                                  .then(
                                                                     dv.a("add")
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (du)$$0x.getSource(),
                                                                                 eg.a($$0x, "target"),
                                                                                 es.a($$0x, "attribute"),
                                                                                 fg.a($$0x, "uuid"),
                                                                                 StringArgumentType.getString($$0x, "name"),
                                                                                 DoubleArgumentType.getDouble($$0x, "value"),
                                                                                 bmc.a.a
                                                                              )
                                                                        )
                                                                  ))
                                                               .then(
                                                                  dv.a("multiply")
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (du)$$0x.getSource(),
                                                                              eg.a($$0x, "target"),
                                                                              es.a($$0x, "attribute"),
                                                                              fg.a($$0x, "uuid"),
                                                                              StringArgumentType.getString($$0x, "name"),
                                                                              DoubleArgumentType.getDouble($$0x, "value"),
                                                                              bmc.a.c
                                                                           )
                                                                     )
                                                               ))
                                                            .then(
                                                               dv.a("multiply_base")
                                                                  .executes(
                                                                     $$0x -> a(
                                                                           (du)$$0x.getSource(),
                                                                           eg.a($$0x, "target"),
                                                                           es.a($$0x, "attribute"),
                                                                           fg.a($$0x, "uuid"),
                                                                           StringArgumentType.getString($$0x, "name"),
                                                                           DoubleArgumentType.getDouble($$0x, "value"),
                                                                           bmc.a.b
                                                                        )
                                                                  )
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    dv.a("remove")
                                       .then(
                                          dv.a("uuid", fg.a())
                                             .executes($$0x -> a((du)$$0x.getSource(), eg.a($$0x, "target"), es.a($$0x, "attribute"), fg.a($$0x, "uuid")))
                                       )
                                 ))
                              .then(
                                 dv.a("value")
                                    .then(
                                       dv.a("get")
                                          .then(
                                             ((RequiredArgumentBuilder)dv.a("uuid", fg.a())
                                                   .executes(
                                                      $$0x -> a((du)$$0x.getSource(), eg.a($$0x, "target"), es.a($$0x, "attribute"), fg.a($$0x, "uuid"), 1.0)
                                                   ))
                                                .then(
                                                   dv.a("scale", DoubleArgumentType.doubleArg())
                                                      .executes(
                                                         $$0x -> a(
                                                               (du)$$0x.getSource(),
                                                               eg.a($$0x, "target"),
                                                               es.a($$0x, "attribute"),
                                                               fg.a($$0x, "uuid"),
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

   private static bma a(bki $$0, ib<blz> $$1) throws CommandSyntaxException {
      bma $$2 = a($$0).eQ().a($$1);
      if ($$2 == null) {
         throw b.create($$0.ab(), a($$1));
      } else {
         return $$2;
      }
   }

   private static bky a(bki $$0) throws CommandSyntaxException {
      if (!($$0 instanceof bky)) {
         throw a.create($$0.ab());
      } else {
         return (bky)$$0;
      }
   }

   private static bky b(bki $$0, ib<blz> $$1) throws CommandSyntaxException {
      bky $$2 = a($$0);
      if (!$$2.eQ().b($$1)) {
         throw b.create($$0.ab(), a($$1));
      } else {
         return $$2;
      }
   }

   private static int a(du $$0, bki $$1, ib<blz> $$2, double $$3) throws CommandSyntaxException {
      bky $$4 = b($$1, $$2);
      double $$5 = $$4.a($$2);
      $$0.a(() -> ur.a("commands.attribute.value.get.success", a($$2), $$1.ab(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int b(du $$0, bki $$1, ib<blz> $$2, double $$3) throws CommandSyntaxException {
      bky $$4 = b($$1, $$2);
      double $$5 = $$4.b($$2);
      $$0.a(() -> ur.a("commands.attribute.base_value.get.success", a($$2), $$1.ab(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int a(du $$0, bki $$1, ib<blz> $$2, UUID $$3, double $$4) throws CommandSyntaxException {
      bky $$5 = b($$1, $$2);
      bmb $$6 = $$5.eQ();
      if (!$$6.a($$2, $$3)) {
         throw c.create($$1.ab(), a($$2), $$3);
      } else {
         double $$7 = $$6.b($$2, $$3);
         $$0.a(() -> ur.a("commands.attribute.modifier.value.get.success", ur.a($$3), a($$2), $$1.ab(), $$7), false);
         return (int)($$7 * $$4);
      }
   }

   private static int c(du $$0, bki $$1, ib<blz> $$2, double $$3) throws CommandSyntaxException {
      a($$1, $$2).a($$3);
      $$0.a(() -> ur.a("commands.attribute.base_value.set.success", a($$2), $$1.ab(), $$3), false);
      return 1;
   }

   private static int a(du $$0, bki $$1, ib<blz> $$2, UUID $$3, String $$4, double $$5, bmc.a $$6) throws CommandSyntaxException {
      bma $$7 = a($$1, $$2);
      bmc $$8 = new bmc($$3, $$4, $$5, $$6);
      if ($$7.a($$8)) {
         throw d.create($$1.ab(), a($$2), $$3);
      } else {
         $$7.c($$8);
         $$0.a(() -> ur.a("commands.attribute.modifier.add.success", ur.a($$3), a($$2), $$1.ab()), false);
         return 1;
      }
   }

   private static int a(du $$0, bki $$1, ib<blz> $$2, UUID $$3) throws CommandSyntaxException {
      bma $$4 = a($$1, $$2);
      if ($$4.c($$3)) {
         $$0.a(() -> ur.a("commands.attribute.modifier.remove.success", ur.a($$3), a($$2), $$1.ab()), false);
         return 1;
      } else {
         throw c.create($$1.ab(), a($$2), $$3);
      }
   }

   private static ur a(ib<blz> $$0) {
      return ur.c($$0.a().c());
   }
}

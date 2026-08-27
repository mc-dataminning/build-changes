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

public class alb {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wi.b("commands.attribute.failed.entity", $$0));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> wi.b("commands.attribute.failed.no_attribute", $$0, $$1)
   );
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> wi.b("commands.attribute.failed.no_modifier", $$1, $$0, $$2)
   );
   private static final Dynamic3CommandExceptionType d = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> wi.b("commands.attribute.failed.modifier_already_present", $$2, $$1, $$0)
   );

   public static void a(CommandDispatcher<dv> $$0, dr $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("attribute").requires($$0x -> $$0x.c(2)))
            .then(
               dw.a("target", ei.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dw.a("attribute", eu.a($$1, ku.c))
                              .then(
                                 ((LiteralArgumentBuilder)dw.a("get")
                                       .executes($$0x -> a((dv)$$0x.getSource(), ei.a($$0x, "target"), eu.a($$0x, "attribute"), 1.0)))
                                    .then(
                                       dw.a("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             $$0x -> a(
                                                   (dv)$$0x.getSource(),
                                                   ei.a($$0x, "target"),
                                                   eu.a($$0x, "attribute"),
                                                   DoubleArgumentType.getDouble($$0x, "scale")
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)dw.a("base")
                                    .then(
                                       dw.a("set")
                                          .then(
                                             dw.a("value", DoubleArgumentType.doubleArg())
                                                .executes(
                                                   $$0x -> c(
                                                         (dv)$$0x.getSource(),
                                                         ei.a($$0x, "target"),
                                                         eu.a($$0x, "attribute"),
                                                         DoubleArgumentType.getDouble($$0x, "value")
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)dw.a("get")
                                          .executes($$0x -> b((dv)$$0x.getSource(), ei.a($$0x, "target"), eu.a($$0x, "attribute"), 1.0)))
                                       .then(
                                          dw.a("scale", DoubleArgumentType.doubleArg())
                                             .executes(
                                                $$0x -> b(
                                                      (dv)$$0x.getSource(),
                                                      ei.a($$0x, "target"),
                                                      eu.a($$0x, "attribute"),
                                                      DoubleArgumentType.getDouble($$0x, "scale")
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           ((LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("modifier")
                                    .then(
                                       dw.a("add")
                                          .then(
                                             dw.a("uuid", fk.a())
                                                .then(
                                                   dw.a("name", StringArgumentType.string())
                                                      .then(
                                                         ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dw.a("value", DoubleArgumentType.doubleArg())
                                                                  .then(
                                                                     dw.a("add_value")
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (dv)$$0x.getSource(),
                                                                                 ei.a($$0x, "target"),
                                                                                 eu.a($$0x, "attribute"),
                                                                                 fk.a($$0x, "uuid"),
                                                                                 StringArgumentType.getString($$0x, "name"),
                                                                                 DoubleArgumentType.getDouble($$0x, "value"),
                                                                                 bry.a.a
                                                                              )
                                                                        )
                                                                  ))
                                                               .then(
                                                                  dw.a("add_multiplied_base")
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (dv)$$0x.getSource(),
                                                                              ei.a($$0x, "target"),
                                                                              eu.a($$0x, "attribute"),
                                                                              fk.a($$0x, "uuid"),
                                                                              StringArgumentType.getString($$0x, "name"),
                                                                              DoubleArgumentType.getDouble($$0x, "value"),
                                                                              bry.a.b
                                                                           )
                                                                     )
                                                               ))
                                                            .then(
                                                               dw.a("add_multiplied_total")
                                                                  .executes(
                                                                     $$0x -> a(
                                                                           (dv)$$0x.getSource(),
                                                                           ei.a($$0x, "target"),
                                                                           eu.a($$0x, "attribute"),
                                                                           fk.a($$0x, "uuid"),
                                                                           StringArgumentType.getString($$0x, "name"),
                                                                           DoubleArgumentType.getDouble($$0x, "value"),
                                                                           bry.a.c
                                                                        )
                                                                  )
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    dw.a("remove")
                                       .then(
                                          dw.a("uuid", fk.a())
                                             .executes($$0x -> a((dv)$$0x.getSource(), ei.a($$0x, "target"), eu.a($$0x, "attribute"), fk.a($$0x, "uuid")))
                                       )
                                 ))
                              .then(
                                 dw.a("value")
                                    .then(
                                       dw.a("get")
                                          .then(
                                             ((RequiredArgumentBuilder)dw.a("uuid", fk.a())
                                                   .executes(
                                                      $$0x -> a((dv)$$0x.getSource(), ei.a($$0x, "target"), eu.a($$0x, "attribute"), fk.a($$0x, "uuid"), 1.0)
                                                   ))
                                                .then(
                                                   dw.a("scale", DoubleArgumentType.doubleArg())
                                                      .executes(
                                                         $$0x -> a(
                                                               (dv)$$0x.getSource(),
                                                               ei.a($$0x, "target"),
                                                               eu.a($$0x, "attribute"),
                                                               fk.a($$0x, "uuid"),
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

   private static brw a(bqa $$0, in<brv> $$1) throws CommandSyntaxException {
      brw $$2 = a($$0).eT().a($$1);
      if ($$2 == null) {
         throw b.create($$0.ad(), a($$1));
      } else {
         return $$2;
      }
   }

   private static bqt a(bqa $$0) throws CommandSyntaxException {
      if (!($$0 instanceof bqt)) {
         throw a.create($$0.ad());
      } else {
         return (bqt)$$0;
      }
   }

   private static bqt b(bqa $$0, in<brv> $$1) throws CommandSyntaxException {
      bqt $$2 = a($$0);
      if (!$$2.eT().b($$1)) {
         throw b.create($$0.ad(), a($$1));
      } else {
         return $$2;
      }
   }

   private static int a(dv $$0, bqa $$1, in<brv> $$2, double $$3) throws CommandSyntaxException {
      bqt $$4 = b($$1, $$2);
      double $$5 = $$4.g($$2);
      $$0.a(() -> wi.a("commands.attribute.value.get.success", a($$2), $$1.ad(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int b(dv $$0, bqa $$1, in<brv> $$2, double $$3) throws CommandSyntaxException {
      bqt $$4 = b($$1, $$2);
      double $$5 = $$4.h($$2);
      $$0.a(() -> wi.a("commands.attribute.base_value.get.success", a($$2), $$1.ad(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int a(dv $$0, bqa $$1, in<brv> $$2, UUID $$3, double $$4) throws CommandSyntaxException {
      bqt $$5 = b($$1, $$2);
      brx $$6 = $$5.eT();
      if (!$$6.a($$2, $$3)) {
         throw c.create($$1.ad(), a($$2), $$3);
      } else {
         double $$7 = $$6.b($$2, $$3);
         $$0.a(() -> wi.a("commands.attribute.modifier.value.get.success", wi.a($$3), a($$2), $$1.ad(), $$7), false);
         return (int)($$7 * $$4);
      }
   }

   private static int c(dv $$0, bqa $$1, in<brv> $$2, double $$3) throws CommandSyntaxException {
      a($$1, $$2).a($$3);
      $$0.a(() -> wi.a("commands.attribute.base_value.set.success", a($$2), $$1.ad(), $$3), false);
      return 1;
   }

   private static int a(dv $$0, bqa $$1, in<brv> $$2, UUID $$3, String $$4, double $$5, bry.a $$6) throws CommandSyntaxException {
      brw $$7 = a($$1, $$2);
      bry $$8 = new bry($$3, $$4, $$5, $$6);
      if ($$7.a($$8)) {
         throw d.create($$1.ad(), a($$2), $$3);
      } else {
         $$7.d($$8);
         $$0.a(() -> wi.a("commands.attribute.modifier.add.success", wi.a($$3), a($$2), $$1.ad()), false);
         return 1;
      }
   }

   private static int a(dv $$0, bqa $$1, in<brv> $$2, UUID $$3) throws CommandSyntaxException {
      brw $$4 = a($$1, $$2);
      if ($$4.c($$3)) {
         $$0.a(() -> wi.a("commands.attribute.modifier.remove.success", wi.a($$3), a($$2), $$1.ad()), false);
         return 1;
      } else {
         throw c.create($$1.ad(), a($$2), $$3);
      }
   }

   private static wi a(in<brv> $$0) {
      return wi.c($$0.a().c());
   }
}

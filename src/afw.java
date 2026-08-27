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

public class afw {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> tf.a("commands.attribute.failed.entity", $$0));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> tf.a("commands.attribute.failed.no_attribute", $$0, $$1)
   );
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> tf.a("commands.attribute.failed.no_modifier", $$1, $$0, $$2)
   );
   private static final Dynamic3CommandExceptionType d = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> tf.a("commands.attribute.failed.modifier_already_present", $$2, $$1, $$0)
   );

   public static void a(CommandDispatcher<dr> $$0, dl $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("attribute").requires($$0x -> $$0x.c(2)))
            .then(
               ds.a("target", ec.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ds.a("attribute", eo.a($$1, jc.b))
                              .then(
                                 ((LiteralArgumentBuilder)ds.a("get")
                                       .executes($$0x -> a((dr)$$0x.getSource(), ec.a($$0x, "target"), eo.a($$0x, "attribute"), 1.0)))
                                    .then(
                                       ds.a("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             $$0x -> a(
                                                   (dr)$$0x.getSource(),
                                                   ec.a($$0x, "target"),
                                                   eo.a($$0x, "attribute"),
                                                   DoubleArgumentType.getDouble($$0x, "scale")
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)ds.a("base")
                                    .then(
                                       ds.a("set")
                                          .then(
                                             ds.a("value", DoubleArgumentType.doubleArg())
                                                .executes(
                                                   $$0x -> c(
                                                         (dr)$$0x.getSource(),
                                                         ec.a($$0x, "target"),
                                                         eo.a($$0x, "attribute"),
                                                         DoubleArgumentType.getDouble($$0x, "value")
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)ds.a("get")
                                          .executes($$0x -> b((dr)$$0x.getSource(), ec.a($$0x, "target"), eo.a($$0x, "attribute"), 1.0)))
                                       .then(
                                          ds.a("scale", DoubleArgumentType.doubleArg())
                                             .executes(
                                                $$0x -> b(
                                                      (dr)$$0x.getSource(),
                                                      ec.a($$0x, "target"),
                                                      eo.a($$0x, "attribute"),
                                                      DoubleArgumentType.getDouble($$0x, "scale")
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("modifier")
                                    .then(
                                       ds.a("add")
                                          .then(
                                             ds.a("uuid", fc.a())
                                                .then(
                                                   ds.a("name", StringArgumentType.string())
                                                      .then(
                                                         ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ds.a("value", DoubleArgumentType.doubleArg())
                                                                  .then(
                                                                     ds.a("add")
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (dr)$$0x.getSource(),
                                                                                 ec.a($$0x, "target"),
                                                                                 eo.a($$0x, "attribute"),
                                                                                 fc.a($$0x, "uuid"),
                                                                                 StringArgumentType.getString($$0x, "name"),
                                                                                 DoubleArgumentType.getDouble($$0x, "value"),
                                                                                 bkd.a.a
                                                                              )
                                                                        )
                                                                  ))
                                                               .then(
                                                                  ds.a("multiply")
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (dr)$$0x.getSource(),
                                                                              ec.a($$0x, "target"),
                                                                              eo.a($$0x, "attribute"),
                                                                              fc.a($$0x, "uuid"),
                                                                              StringArgumentType.getString($$0x, "name"),
                                                                              DoubleArgumentType.getDouble($$0x, "value"),
                                                                              bkd.a.c
                                                                           )
                                                                     )
                                                               ))
                                                            .then(
                                                               ds.a("multiply_base")
                                                                  .executes(
                                                                     $$0x -> a(
                                                                           (dr)$$0x.getSource(),
                                                                           ec.a($$0x, "target"),
                                                                           eo.a($$0x, "attribute"),
                                                                           fc.a($$0x, "uuid"),
                                                                           StringArgumentType.getString($$0x, "name"),
                                                                           DoubleArgumentType.getDouble($$0x, "value"),
                                                                           bkd.a.b
                                                                        )
                                                                  )
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ds.a("remove")
                                       .then(
                                          ds.a("uuid", fc.a())
                                             .executes($$0x -> a((dr)$$0x.getSource(), ec.a($$0x, "target"), eo.a($$0x, "attribute"), fc.a($$0x, "uuid")))
                                       )
                                 ))
                              .then(
                                 ds.a("value")
                                    .then(
                                       ds.a("get")
                                          .then(
                                             ((RequiredArgumentBuilder)ds.a("uuid", fc.a())
                                                   .executes(
                                                      $$0x -> a((dr)$$0x.getSource(), ec.a($$0x, "target"), eo.a($$0x, "attribute"), fc.a($$0x, "uuid"), 1.0)
                                                   ))
                                                .then(
                                                   ds.a("scale", DoubleArgumentType.doubleArg())
                                                      .executes(
                                                         $$0x -> a(
                                                               (dr)$$0x.getSource(),
                                                               ec.a($$0x, "target"),
                                                               eo.a($$0x, "attribute"),
                                                               fc.a($$0x, "uuid"),
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

   private static bkb a(bii $$0, he<bka> $$1) throws CommandSyntaxException {
      bkb $$2 = a($$0).eP().a($$1);
      if ($$2 == null) {
         throw b.create($$0.ab(), a($$1));
      } else {
         return $$2;
      }
   }

   private static biy a(bii $$0) throws CommandSyntaxException {
      if (!($$0 instanceof biy)) {
         throw a.create($$0.ab());
      } else {
         return (biy)$$0;
      }
   }

   private static biy b(bii $$0, he<bka> $$1) throws CommandSyntaxException {
      biy $$2 = a($$0);
      if (!$$2.eP().b($$1)) {
         throw b.create($$0.ab(), a($$1));
      } else {
         return $$2;
      }
   }

   private static int a(dr $$0, bii $$1, he<bka> $$2, double $$3) throws CommandSyntaxException {
      biy $$4 = b($$1, $$2);
      double $$5 = $$4.a($$2);
      $$0.a(() -> tf.a("commands.attribute.value.get.success", a($$2), $$1.ab(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int b(dr $$0, bii $$1, he<bka> $$2, double $$3) throws CommandSyntaxException {
      biy $$4 = b($$1, $$2);
      double $$5 = $$4.b($$2);
      $$0.a(() -> tf.a("commands.attribute.base_value.get.success", a($$2), $$1.ab(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int a(dr $$0, bii $$1, he<bka> $$2, UUID $$3, double $$4) throws CommandSyntaxException {
      biy $$5 = b($$1, $$2);
      bkc $$6 = $$5.eP();
      if (!$$6.a($$2, $$3)) {
         throw c.create($$1.ab(), a($$2), $$3);
      } else {
         double $$7 = $$6.b($$2, $$3);
         $$0.a(() -> tf.a("commands.attribute.modifier.value.get.success", $$3, a($$2), $$1.ab(), $$7), false);
         return (int)($$7 * $$4);
      }
   }

   private static int c(dr $$0, bii $$1, he<bka> $$2, double $$3) throws CommandSyntaxException {
      a($$1, $$2).a($$3);
      $$0.a(() -> tf.a("commands.attribute.base_value.set.success", a($$2), $$1.ab(), $$3), false);
      return 1;
   }

   private static int a(dr $$0, bii $$1, he<bka> $$2, UUID $$3, String $$4, double $$5, bkd.a $$6) throws CommandSyntaxException {
      bkb $$7 = a($$1, $$2);
      bkd $$8 = new bkd($$3, $$4, $$5, $$6);
      if ($$7.a($$8)) {
         throw d.create($$1.ab(), a($$2), $$3);
      } else {
         $$7.c($$8);
         $$0.a(() -> tf.a("commands.attribute.modifier.add.success", $$3, a($$2), $$1.ab()), false);
         return 1;
      }
   }

   private static int a(dr $$0, bii $$1, he<bka> $$2, UUID $$3) throws CommandSyntaxException {
      bkb $$4 = a($$1, $$2);
      if ($$4.c($$3)) {
         $$0.a(() -> tf.a("commands.attribute.modifier.remove.success", $$3, a($$2), $$1.ab()), false);
         return 1;
      } else {
         throw c.create($$1.ab(), a($$2), $$3);
      }
   }

   private static tf a(he<bka> $$0) {
      return tf.c($$0.a().c());
   }
}

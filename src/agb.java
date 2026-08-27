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

public class agb {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> tl.a("commands.attribute.failed.entity", $$0));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> tl.a("commands.attribute.failed.no_attribute", $$0, $$1)
   );
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> tl.a("commands.attribute.failed.no_modifier", $$1, $$0, $$2)
   );
   private static final Dynamic3CommandExceptionType d = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> tl.a("commands.attribute.failed.modifier_already_present", $$2, $$1, $$0)
   );

   public static void a(CommandDispatcher<dt> $$0, dn $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("attribute").requires($$0x -> $$0x.c(2)))
            .then(
               du.a("target", ee.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)du.a("attribute", eq.a($$1, jc.b))
                              .then(
                                 ((LiteralArgumentBuilder)du.a("get")
                                       .executes($$0x -> a((dt)$$0x.getSource(), ee.a($$0x, "target"), eq.a($$0x, "attribute"), 1.0)))
                                    .then(
                                       du.a("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             $$0x -> a(
                                                   (dt)$$0x.getSource(),
                                                   ee.a($$0x, "target"),
                                                   eq.a($$0x, "attribute"),
                                                   DoubleArgumentType.getDouble($$0x, "scale")
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)du.a("base")
                                    .then(
                                       du.a("set")
                                          .then(
                                             du.a("value", DoubleArgumentType.doubleArg())
                                                .executes(
                                                   $$0x -> c(
                                                         (dt)$$0x.getSource(),
                                                         ee.a($$0x, "target"),
                                                         eq.a($$0x, "attribute"),
                                                         DoubleArgumentType.getDouble($$0x, "value")
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)du.a("get")
                                          .executes($$0x -> b((dt)$$0x.getSource(), ee.a($$0x, "target"), eq.a($$0x, "attribute"), 1.0)))
                                       .then(
                                          du.a("scale", DoubleArgumentType.doubleArg())
                                             .executes(
                                                $$0x -> b(
                                                      (dt)$$0x.getSource(),
                                                      ee.a($$0x, "target"),
                                                      eq.a($$0x, "attribute"),
                                                      DoubleArgumentType.getDouble($$0x, "scale")
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           ((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("modifier")
                                    .then(
                                       du.a("add")
                                          .then(
                                             du.a("uuid", fe.a())
                                                .then(
                                                   du.a("name", StringArgumentType.string())
                                                      .then(
                                                         ((RequiredArgumentBuilder)((RequiredArgumentBuilder)du.a("value", DoubleArgumentType.doubleArg())
                                                                  .then(
                                                                     du.a("add")
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (dt)$$0x.getSource(),
                                                                                 ee.a($$0x, "target"),
                                                                                 eq.a($$0x, "attribute"),
                                                                                 fe.a($$0x, "uuid"),
                                                                                 StringArgumentType.getString($$0x, "name"),
                                                                                 DoubleArgumentType.getDouble($$0x, "value"),
                                                                                 bkk.a.a
                                                                              )
                                                                        )
                                                                  ))
                                                               .then(
                                                                  du.a("multiply")
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (dt)$$0x.getSource(),
                                                                              ee.a($$0x, "target"),
                                                                              eq.a($$0x, "attribute"),
                                                                              fe.a($$0x, "uuid"),
                                                                              StringArgumentType.getString($$0x, "name"),
                                                                              DoubleArgumentType.getDouble($$0x, "value"),
                                                                              bkk.a.c
                                                                           )
                                                                     )
                                                               ))
                                                            .then(
                                                               du.a("multiply_base")
                                                                  .executes(
                                                                     $$0x -> a(
                                                                           (dt)$$0x.getSource(),
                                                                           ee.a($$0x, "target"),
                                                                           eq.a($$0x, "attribute"),
                                                                           fe.a($$0x, "uuid"),
                                                                           StringArgumentType.getString($$0x, "name"),
                                                                           DoubleArgumentType.getDouble($$0x, "value"),
                                                                           bkk.a.b
                                                                        )
                                                                  )
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    du.a("remove")
                                       .then(
                                          du.a("uuid", fe.a())
                                             .executes($$0x -> a((dt)$$0x.getSource(), ee.a($$0x, "target"), eq.a($$0x, "attribute"), fe.a($$0x, "uuid")))
                                       )
                                 ))
                              .then(
                                 du.a("value")
                                    .then(
                                       du.a("get")
                                          .then(
                                             ((RequiredArgumentBuilder)du.a("uuid", fe.a())
                                                   .executes(
                                                      $$0x -> a((dt)$$0x.getSource(), ee.a($$0x, "target"), eq.a($$0x, "attribute"), fe.a($$0x, "uuid"), 1.0)
                                                   ))
                                                .then(
                                                   du.a("scale", DoubleArgumentType.doubleArg())
                                                      .executes(
                                                         $$0x -> a(
                                                               (dt)$$0x.getSource(),
                                                               ee.a($$0x, "target"),
                                                               eq.a($$0x, "attribute"),
                                                               fe.a($$0x, "uuid"),
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

   private static bki a(biq $$0, he<bkh> $$1) throws CommandSyntaxException {
      bki $$2 = a($$0).eQ().a($$1);
      if ($$2 == null) {
         throw b.create($$0.ab(), a($$1));
      } else {
         return $$2;
      }
   }

   private static bjg a(biq $$0) throws CommandSyntaxException {
      if (!($$0 instanceof bjg)) {
         throw a.create($$0.ab());
      } else {
         return (bjg)$$0;
      }
   }

   private static bjg b(biq $$0, he<bkh> $$1) throws CommandSyntaxException {
      bjg $$2 = a($$0);
      if (!$$2.eQ().b($$1)) {
         throw b.create($$0.ab(), a($$1));
      } else {
         return $$2;
      }
   }

   private static int a(dt $$0, biq $$1, he<bkh> $$2, double $$3) throws CommandSyntaxException {
      bjg $$4 = b($$1, $$2);
      double $$5 = $$4.a($$2);
      $$0.a(() -> tl.a("commands.attribute.value.get.success", a($$2), $$1.ab(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int b(dt $$0, biq $$1, he<bkh> $$2, double $$3) throws CommandSyntaxException {
      bjg $$4 = b($$1, $$2);
      double $$5 = $$4.b($$2);
      $$0.a(() -> tl.a("commands.attribute.base_value.get.success", a($$2), $$1.ab(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int a(dt $$0, biq $$1, he<bkh> $$2, UUID $$3, double $$4) throws CommandSyntaxException {
      bjg $$5 = b($$1, $$2);
      bkj $$6 = $$5.eQ();
      if (!$$6.a($$2, $$3)) {
         throw c.create($$1.ab(), a($$2), $$3);
      } else {
         double $$7 = $$6.b($$2, $$3);
         $$0.a(() -> tl.a("commands.attribute.modifier.value.get.success", $$3, a($$2), $$1.ab(), $$7), false);
         return (int)($$7 * $$4);
      }
   }

   private static int c(dt $$0, biq $$1, he<bkh> $$2, double $$3) throws CommandSyntaxException {
      a($$1, $$2).a($$3);
      $$0.a(() -> tl.a("commands.attribute.base_value.set.success", a($$2), $$1.ab(), $$3), false);
      return 1;
   }

   private static int a(dt $$0, biq $$1, he<bkh> $$2, UUID $$3, String $$4, double $$5, bkk.a $$6) throws CommandSyntaxException {
      bki $$7 = a($$1, $$2);
      bkk $$8 = new bkk($$3, $$4, $$5, $$6);
      if ($$7.a($$8)) {
         throw d.create($$1.ab(), a($$2), $$3);
      } else {
         $$7.c($$8);
         $$0.a(() -> tl.a("commands.attribute.modifier.add.success", $$3, a($$2), $$1.ab()), false);
         return 1;
      }
   }

   private static int a(dt $$0, biq $$1, he<bkh> $$2, UUID $$3) throws CommandSyntaxException {
      bki $$4 = a($$1, $$2);
      if ($$4.c($$3)) {
         $$0.a(() -> tl.a("commands.attribute.modifier.remove.success", $$3, a($$2), $$1.ab()), false);
         return 1;
      } else {
         throw c.create($$1.ab(), a($$2), $$3);
      }
   }

   private static tl a(he<bkh> $$0) {
      return tl.c($$0.a().c());
   }
}

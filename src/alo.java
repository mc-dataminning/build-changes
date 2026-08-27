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

public class alo {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wu.b("commands.attribute.failed.entity", $$0));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> wu.b("commands.attribute.failed.no_attribute", $$0, $$1)
   );
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> wu.b("commands.attribute.failed.no_modifier", $$1, $$0, $$2)
   );
   private static final Dynamic3CommandExceptionType d = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> wu.b("commands.attribute.failed.modifier_already_present", $$2, $$1, $$0)
   );

   public static void a(CommandDispatcher<ed> $$0, dz $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("attribute").requires($$0x -> $$0x.c(2)))
            .then(
               ee.a("target", eq.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ee.a("attribute", fc.a($$1, le.c))
                              .then(
                                 ((LiteralArgumentBuilder)ee.a("get")
                                       .executes($$0x -> a((ed)$$0x.getSource(), eq.a($$0x, "target"), fc.a($$0x, "attribute"), 1.0)))
                                    .then(
                                       ee.a("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             $$0x -> a(
                                                   (ed)$$0x.getSource(),
                                                   eq.a($$0x, "target"),
                                                   fc.a($$0x, "attribute"),
                                                   DoubleArgumentType.getDouble($$0x, "scale")
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)ee.a("base")
                                    .then(
                                       ee.a("set")
                                          .then(
                                             ee.a("value", DoubleArgumentType.doubleArg())
                                                .executes(
                                                   $$0x -> c(
                                                         (ed)$$0x.getSource(),
                                                         eq.a($$0x, "target"),
                                                         fc.a($$0x, "attribute"),
                                                         DoubleArgumentType.getDouble($$0x, "value")
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)ee.a("get")
                                          .executes($$0x -> b((ed)$$0x.getSource(), eq.a($$0x, "target"), fc.a($$0x, "attribute"), 1.0)))
                                       .then(
                                          ee.a("scale", DoubleArgumentType.doubleArg())
                                             .executes(
                                                $$0x -> b(
                                                      (ed)$$0x.getSource(),
                                                      eq.a($$0x, "target"),
                                                      fc.a($$0x, "attribute"),
                                                      DoubleArgumentType.getDouble($$0x, "scale")
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("modifier")
                                    .then(
                                       ee.a("add")
                                          .then(
                                             ee.a("uuid", ft.a())
                                                .then(
                                                   ee.a("name", StringArgumentType.string())
                                                      .then(
                                                         ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ee.a("value", DoubleArgumentType.doubleArg())
                                                                  .then(
                                                                     ee.a("add_value")
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ed)$$0x.getSource(),
                                                                                 eq.a($$0x, "target"),
                                                                                 fc.a($$0x, "attribute"),
                                                                                 ft.a($$0x, "uuid"),
                                                                                 StringArgumentType.getString($$0x, "name"),
                                                                                 DoubleArgumentType.getDouble($$0x, "value"),
                                                                                 btf.a.a
                                                                              )
                                                                        )
                                                                  ))
                                                               .then(
                                                                  ee.a("add_multiplied_base")
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ed)$$0x.getSource(),
                                                                              eq.a($$0x, "target"),
                                                                              fc.a($$0x, "attribute"),
                                                                              ft.a($$0x, "uuid"),
                                                                              StringArgumentType.getString($$0x, "name"),
                                                                              DoubleArgumentType.getDouble($$0x, "value"),
                                                                              btf.a.b
                                                                           )
                                                                     )
                                                               ))
                                                            .then(
                                                               ee.a("add_multiplied_total")
                                                                  .executes(
                                                                     $$0x -> a(
                                                                           (ed)$$0x.getSource(),
                                                                           eq.a($$0x, "target"),
                                                                           fc.a($$0x, "attribute"),
                                                                           ft.a($$0x, "uuid"),
                                                                           StringArgumentType.getString($$0x, "name"),
                                                                           DoubleArgumentType.getDouble($$0x, "value"),
                                                                           btf.a.c
                                                                        )
                                                                  )
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ee.a("remove")
                                       .then(
                                          ee.a("uuid", ft.a())
                                             .executes($$0x -> a((ed)$$0x.getSource(), eq.a($$0x, "target"), fc.a($$0x, "attribute"), ft.a($$0x, "uuid")))
                                       )
                                 ))
                              .then(
                                 ee.a("value")
                                    .then(
                                       ee.a("get")
                                          .then(
                                             ((RequiredArgumentBuilder)ee.a("uuid", ft.a())
                                                   .executes(
                                                      $$0x -> a((ed)$$0x.getSource(), eq.a($$0x, "target"), fc.a($$0x, "attribute"), ft.a($$0x, "uuid"), 1.0)
                                                   ))
                                                .then(
                                                   ee.a("scale", DoubleArgumentType.doubleArg())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ed)$$0x.getSource(),
                                                               eq.a($$0x, "target"),
                                                               fc.a($$0x, "attribute"),
                                                               ft.a($$0x, "uuid"),
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

   private static btd a(brh $$0, iw<btc> $$1) throws CommandSyntaxException {
      btd $$2 = a($$0).eU().a($$1);
      if ($$2 == null) {
         throw b.create($$0.ad(), a($$1));
      } else {
         return $$2;
      }
   }

   private static bsa a(brh $$0) throws CommandSyntaxException {
      if (!($$0 instanceof bsa)) {
         throw a.create($$0.ad());
      } else {
         return (bsa)$$0;
      }
   }

   private static bsa b(brh $$0, iw<btc> $$1) throws CommandSyntaxException {
      bsa $$2 = a($$0);
      if (!$$2.eU().b($$1)) {
         throw b.create($$0.ad(), a($$1));
      } else {
         return $$2;
      }
   }

   private static int a(ed $$0, brh $$1, iw<btc> $$2, double $$3) throws CommandSyntaxException {
      bsa $$4 = b($$1, $$2);
      double $$5 = $$4.g($$2);
      $$0.a(() -> wu.a("commands.attribute.value.get.success", a($$2), $$1.ad(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int b(ed $$0, brh $$1, iw<btc> $$2, double $$3) throws CommandSyntaxException {
      bsa $$4 = b($$1, $$2);
      double $$5 = $$4.h($$2);
      $$0.a(() -> wu.a("commands.attribute.base_value.get.success", a($$2), $$1.ad(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int a(ed $$0, brh $$1, iw<btc> $$2, UUID $$3, double $$4) throws CommandSyntaxException {
      bsa $$5 = b($$1, $$2);
      bte $$6 = $$5.eU();
      if (!$$6.a($$2, $$3)) {
         throw c.create($$1.ad(), a($$2), $$3);
      } else {
         double $$7 = $$6.b($$2, $$3);
         $$0.a(() -> wu.a("commands.attribute.modifier.value.get.success", wu.a($$3), a($$2), $$1.ad(), $$7), false);
         return (int)($$7 * $$4);
      }
   }

   private static int c(ed $$0, brh $$1, iw<btc> $$2, double $$3) throws CommandSyntaxException {
      a($$1, $$2).a($$3);
      $$0.a(() -> wu.a("commands.attribute.base_value.set.success", a($$2), $$1.ad(), $$3), false);
      return 1;
   }

   private static int a(ed $$0, brh $$1, iw<btc> $$2, UUID $$3, String $$4, double $$5, btf.a $$6) throws CommandSyntaxException {
      btd $$7 = a($$1, $$2);
      btf $$8 = new btf($$3, $$4, $$5, $$6);
      if ($$7.a($$8)) {
         throw d.create($$1.ad(), a($$2), $$3);
      } else {
         $$7.d($$8);
         $$0.a(() -> wu.a("commands.attribute.modifier.add.success", wu.a($$3), a($$2), $$1.ad()), false);
         return 1;
      }
   }

   private static int a(ed $$0, brh $$1, iw<btc> $$2, UUID $$3) throws CommandSyntaxException {
      btd $$4 = a($$1, $$2);
      if ($$4.c($$3)) {
         $$0.a(() -> wu.a("commands.attribute.modifier.remove.success", wu.a($$3), a($$2), $$1.ad()), false);
         return 1;
      } else {
         throw c.create($$1.ad(), a($$2), $$3);
      }
   }

   private static wu a(iw<btc> $$0) {
      return wu.c($$0.a().c());
   }
}

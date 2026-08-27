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

public class adu {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> sw.a("commands.attribute.failed.entity", $$0));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> sw.a("commands.attribute.failed.no_attribute", $$0, $$1)
   );
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> sw.a("commands.attribute.failed.no_modifier", $$1, $$0, $$2)
   );
   private static final Dynamic3CommandExceptionType d = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> sw.a("commands.attribute.failed.modifier_already_present", $$2, $$1, $$0)
   );

   public static void a(CommandDispatcher<ds> $$0, dm $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("attribute").requires($$0x -> $$0x.c(2)))
            .then(
               dt.a("target", ec.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("attribute", eo.a($$1, jc.b))
                              .then(
                                 ((LiteralArgumentBuilder)dt.a("get")
                                       .executes($$0x -> a((ds)$$0x.getSource(), ec.a($$0x, "target"), eo.a($$0x, "attribute"), 1.0)))
                                    .then(
                                       dt.a("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             $$0x -> a(
                                                   (ds)$$0x.getSource(),
                                                   ec.a($$0x, "target"),
                                                   eo.a($$0x, "attribute"),
                                                   DoubleArgumentType.getDouble($$0x, "scale")
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)dt.a("base")
                                    .then(
                                       dt.a("set")
                                          .then(
                                             dt.a("value", DoubleArgumentType.doubleArg())
                                                .executes(
                                                   $$0x -> c(
                                                         (ds)$$0x.getSource(),
                                                         ec.a($$0x, "target"),
                                                         eo.a($$0x, "attribute"),
                                                         DoubleArgumentType.getDouble($$0x, "value")
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)dt.a("get")
                                          .executes($$0x -> b((ds)$$0x.getSource(), ec.a($$0x, "target"), eo.a($$0x, "attribute"), 1.0)))
                                       .then(
                                          dt.a("scale", DoubleArgumentType.doubleArg())
                                             .executes(
                                                $$0x -> b(
                                                      (ds)$$0x.getSource(),
                                                      ec.a($$0x, "target"),
                                                      eo.a($$0x, "attribute"),
                                                      DoubleArgumentType.getDouble($$0x, "scale")
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           ((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("modifier")
                                    .then(
                                       dt.a("add")
                                          .then(
                                             dt.a("uuid", fc.a())
                                                .then(
                                                   dt.a("name", StringArgumentType.string())
                                                      .then(
                                                         ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("value", DoubleArgumentType.doubleArg())
                                                                  .then(
                                                                     dt.a("add")
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ds)$$0x.getSource(),
                                                                                 ec.a($$0x, "target"),
                                                                                 eo.a($$0x, "attribute"),
                                                                                 fc.a($$0x, "uuid"),
                                                                                 StringArgumentType.getString($$0x, "name"),
                                                                                 DoubleArgumentType.getDouble($$0x, "value"),
                                                                                 bhe.a.a
                                                                              )
                                                                        )
                                                                  ))
                                                               .then(
                                                                  dt.a("multiply")
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ds)$$0x.getSource(),
                                                                              ec.a($$0x, "target"),
                                                                              eo.a($$0x, "attribute"),
                                                                              fc.a($$0x, "uuid"),
                                                                              StringArgumentType.getString($$0x, "name"),
                                                                              DoubleArgumentType.getDouble($$0x, "value"),
                                                                              bhe.a.c
                                                                           )
                                                                     )
                                                               ))
                                                            .then(
                                                               dt.a("multiply_base")
                                                                  .executes(
                                                                     $$0x -> a(
                                                                           (ds)$$0x.getSource(),
                                                                           ec.a($$0x, "target"),
                                                                           eo.a($$0x, "attribute"),
                                                                           fc.a($$0x, "uuid"),
                                                                           StringArgumentType.getString($$0x, "name"),
                                                                           DoubleArgumentType.getDouble($$0x, "value"),
                                                                           bhe.a.b
                                                                        )
                                                                  )
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    dt.a("remove")
                                       .then(
                                          dt.a("uuid", fc.a())
                                             .executes($$0x -> a((ds)$$0x.getSource(), ec.a($$0x, "target"), eo.a($$0x, "attribute"), fc.a($$0x, "uuid")))
                                       )
                                 ))
                              .then(
                                 dt.a("value")
                                    .then(
                                       dt.a("get")
                                          .then(
                                             ((RequiredArgumentBuilder)dt.a("uuid", fc.a())
                                                   .executes(
                                                      $$0x -> a((ds)$$0x.getSource(), ec.a($$0x, "target"), eo.a($$0x, "attribute"), fc.a($$0x, "uuid"), 1.0)
                                                   ))
                                                .then(
                                                   dt.a("scale", DoubleArgumentType.doubleArg())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ds)$$0x.getSource(),
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

   private static bhc a(bfj $$0, he<bhb> $$1) throws CommandSyntaxException {
      bhc $$2 = a($$0).eM().a($$1);
      if ($$2 == null) {
         throw b.create($$0.Z(), a($$1));
      } else {
         return $$2;
      }
   }

   private static bfz a(bfj $$0) throws CommandSyntaxException {
      if (!($$0 instanceof bfz)) {
         throw a.create($$0.Z());
      } else {
         return (bfz)$$0;
      }
   }

   private static bfz b(bfj $$0, he<bhb> $$1) throws CommandSyntaxException {
      bfz $$2 = a($$0);
      if (!$$2.eM().b($$1)) {
         throw b.create($$0.Z(), a($$1));
      } else {
         return $$2;
      }
   }

   private static int a(ds $$0, bfj $$1, he<bhb> $$2, double $$3) throws CommandSyntaxException {
      bfz $$4 = b($$1, $$2);
      double $$5 = $$4.a($$2);
      $$0.a(() -> sw.a("commands.attribute.value.get.success", a($$2), $$1.Z(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int b(ds $$0, bfj $$1, he<bhb> $$2, double $$3) throws CommandSyntaxException {
      bfz $$4 = b($$1, $$2);
      double $$5 = $$4.b($$2);
      $$0.a(() -> sw.a("commands.attribute.base_value.get.success", a($$2), $$1.Z(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int a(ds $$0, bfj $$1, he<bhb> $$2, UUID $$3, double $$4) throws CommandSyntaxException {
      bfz $$5 = b($$1, $$2);
      bhd $$6 = $$5.eM();
      if (!$$6.a($$2, $$3)) {
         throw c.create($$1.Z(), a($$2), $$3);
      } else {
         double $$7 = $$6.b($$2, $$3);
         $$0.a(() -> sw.a("commands.attribute.modifier.value.get.success", $$3, a($$2), $$1.Z(), $$7), false);
         return (int)($$7 * $$4);
      }
   }

   private static int c(ds $$0, bfj $$1, he<bhb> $$2, double $$3) throws CommandSyntaxException {
      a($$1, $$2).a($$3);
      $$0.a(() -> sw.a("commands.attribute.base_value.set.success", a($$2), $$1.Z(), $$3), false);
      return 1;
   }

   private static int a(ds $$0, bfj $$1, he<bhb> $$2, UUID $$3, String $$4, double $$5, bhe.a $$6) throws CommandSyntaxException {
      bhc $$7 = a($$1, $$2);
      bhe $$8 = new bhe($$3, $$4, $$5, $$6);
      if ($$7.a($$8)) {
         throw d.create($$1.Z(), a($$2), $$3);
      } else {
         $$7.c($$8);
         $$0.a(() -> sw.a("commands.attribute.modifier.add.success", $$3, a($$2), $$1.Z()), false);
         return 1;
      }
   }

   private static int a(ds $$0, bfj $$1, he<bhb> $$2, UUID $$3) throws CommandSyntaxException {
      bhc $$4 = a($$1, $$2);
      if ($$4.c($$3)) {
         $$0.a(() -> sw.a("commands.attribute.modifier.remove.success", $$3, a($$2), $$1.Z()), false);
         return 1;
      } else {
         throw c.create($$1.Z(), a($$2), $$3);
      }
   }

   private static sw a(he<bhb> $$0) {
      return sw.c($$0.a().c());
   }
}

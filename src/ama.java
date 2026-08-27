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

public class ama {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xe.b("commands.attribute.failed.entity", $$0));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xe.b("commands.attribute.failed.no_attribute", $$0, $$1)
   );
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xe.b("commands.attribute.failed.no_modifier", $$1, $$0, $$2)
   );
   private static final Dynamic3CommandExceptionType d = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xe.b("commands.attribute.failed.modifier_already_present", $$2, $$1, $$0)
   );

   public static void a(CommandDispatcher<eh> $$0, ed $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("attribute").requires($$0x -> $$0x.c(2)))
            .then(
               ei.a("target", eu.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ei.a("attribute", fg.a($$1, li.c))
                              .then(
                                 ((LiteralArgumentBuilder)ei.a("get")
                                       .executes($$0x -> a((eh)$$0x.getSource(), eu.a($$0x, "target"), fg.a($$0x, "attribute"), 1.0)))
                                    .then(
                                       ei.a("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             $$0x -> a(
                                                   (eh)$$0x.getSource(),
                                                   eu.a($$0x, "target"),
                                                   fg.a($$0x, "attribute"),
                                                   DoubleArgumentType.getDouble($$0x, "scale")
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)ei.a("base")
                                    .then(
                                       ei.a("set")
                                          .then(
                                             ei.a("value", DoubleArgumentType.doubleArg())
                                                .executes(
                                                   $$0x -> c(
                                                         (eh)$$0x.getSource(),
                                                         eu.a($$0x, "target"),
                                                         fg.a($$0x, "attribute"),
                                                         DoubleArgumentType.getDouble($$0x, "value")
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)ei.a("get")
                                          .executes($$0x -> b((eh)$$0x.getSource(), eu.a($$0x, "target"), fg.a($$0x, "attribute"), 1.0)))
                                       .then(
                                          ei.a("scale", DoubleArgumentType.doubleArg())
                                             .executes(
                                                $$0x -> b(
                                                      (eh)$$0x.getSource(),
                                                      eu.a($$0x, "target"),
                                                      fg.a($$0x, "attribute"),
                                                      DoubleArgumentType.getDouble($$0x, "scale")
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("modifier")
                                    .then(
                                       ei.a("add")
                                          .then(
                                             ei.a("uuid", fx.a())
                                                .then(
                                                   ei.a("name", StringArgumentType.string())
                                                      .then(
                                                         ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ei.a("value", DoubleArgumentType.doubleArg())
                                                                  .then(
                                                                     ei.a("add_value")
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (eh)$$0x.getSource(),
                                                                                 eu.a($$0x, "target"),
                                                                                 fg.a($$0x, "attribute"),
                                                                                 fx.a($$0x, "uuid"),
                                                                                 StringArgumentType.getString($$0x, "name"),
                                                                                 DoubleArgumentType.getDouble($$0x, "value"),
                                                                                 btt.a.a
                                                                              )
                                                                        )
                                                                  ))
                                                               .then(
                                                                  ei.a("add_multiplied_base")
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (eh)$$0x.getSource(),
                                                                              eu.a($$0x, "target"),
                                                                              fg.a($$0x, "attribute"),
                                                                              fx.a($$0x, "uuid"),
                                                                              StringArgumentType.getString($$0x, "name"),
                                                                              DoubleArgumentType.getDouble($$0x, "value"),
                                                                              btt.a.b
                                                                           )
                                                                     )
                                                               ))
                                                            .then(
                                                               ei.a("add_multiplied_total")
                                                                  .executes(
                                                                     $$0x -> a(
                                                                           (eh)$$0x.getSource(),
                                                                           eu.a($$0x, "target"),
                                                                           fg.a($$0x, "attribute"),
                                                                           fx.a($$0x, "uuid"),
                                                                           StringArgumentType.getString($$0x, "name"),
                                                                           DoubleArgumentType.getDouble($$0x, "value"),
                                                                           btt.a.c
                                                                        )
                                                                  )
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ei.a("remove")
                                       .then(
                                          ei.a("uuid", fx.a())
                                             .executes($$0x -> a((eh)$$0x.getSource(), eu.a($$0x, "target"), fg.a($$0x, "attribute"), fx.a($$0x, "uuid")))
                                       )
                                 ))
                              .then(
                                 ei.a("value")
                                    .then(
                                       ei.a("get")
                                          .then(
                                             ((RequiredArgumentBuilder)ei.a("uuid", fx.a())
                                                   .executes(
                                                      $$0x -> a((eh)$$0x.getSource(), eu.a($$0x, "target"), fg.a($$0x, "attribute"), fx.a($$0x, "uuid"), 1.0)
                                                   ))
                                                .then(
                                                   ei.a("scale", DoubleArgumentType.doubleArg())
                                                      .executes(
                                                         $$0x -> a(
                                                               (eh)$$0x.getSource(),
                                                               eu.a($$0x, "target"),
                                                               fg.a($$0x, "attribute"),
                                                               fx.a($$0x, "uuid"),
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

   private static btr a(brv $$0, ja<btq> $$1) throws CommandSyntaxException {
      btr $$2 = a($$0).ff().a($$1);
      if ($$2 == null) {
         throw b.create($$0.af(), a($$1));
      } else {
         return $$2;
      }
   }

   private static bso a(brv $$0) throws CommandSyntaxException {
      if (!($$0 instanceof bso)) {
         throw a.create($$0.af());
      } else {
         return (bso)$$0;
      }
   }

   private static bso b(brv $$0, ja<btq> $$1) throws CommandSyntaxException {
      bso $$2 = a($$0);
      if (!$$2.ff().b($$1)) {
         throw b.create($$0.af(), a($$1));
      } else {
         return $$2;
      }
   }

   private static int a(eh $$0, brv $$1, ja<btq> $$2, double $$3) throws CommandSyntaxException {
      bso $$4 = b($$1, $$2);
      double $$5 = $$4.g($$2);
      $$0.a(() -> xe.a("commands.attribute.value.get.success", a($$2), $$1.af(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int b(eh $$0, brv $$1, ja<btq> $$2, double $$3) throws CommandSyntaxException {
      bso $$4 = b($$1, $$2);
      double $$5 = $$4.h($$2);
      $$0.a(() -> xe.a("commands.attribute.base_value.get.success", a($$2), $$1.af(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int a(eh $$0, brv $$1, ja<btq> $$2, UUID $$3, double $$4) throws CommandSyntaxException {
      bso $$5 = b($$1, $$2);
      bts $$6 = $$5.ff();
      if (!$$6.a($$2, $$3)) {
         throw c.create($$1.af(), a($$2), $$3);
      } else {
         double $$7 = $$6.b($$2, $$3);
         $$0.a(() -> xe.a("commands.attribute.modifier.value.get.success", xe.a($$3), a($$2), $$1.af(), $$7), false);
         return (int)($$7 * $$4);
      }
   }

   private static int c(eh $$0, brv $$1, ja<btq> $$2, double $$3) throws CommandSyntaxException {
      a($$1, $$2).a($$3);
      $$0.a(() -> xe.a("commands.attribute.base_value.set.success", a($$2), $$1.af(), $$3), false);
      return 1;
   }

   private static int a(eh $$0, brv $$1, ja<btq> $$2, UUID $$3, String $$4, double $$5, btt.a $$6) throws CommandSyntaxException {
      btr $$7 = a($$1, $$2);
      btt $$8 = new btt($$3, $$4, $$5, $$6);
      if ($$7.a($$8)) {
         throw d.create($$1.af(), a($$2), $$3);
      } else {
         $$7.d($$8);
         $$0.a(() -> xe.a("commands.attribute.modifier.add.success", xe.a($$3), a($$2), $$1.af()), false);
         return 1;
      }
   }

   private static int a(eh $$0, brv $$1, ja<btq> $$2, UUID $$3) throws CommandSyntaxException {
      btr $$4 = a($$1, $$2);
      if ($$4.c($$3)) {
         $$0.a(() -> xe.a("commands.attribute.modifier.remove.success", xe.a($$3), a($$2), $$1.af()), false);
         return 1;
      } else {
         throw c.create($$1.af(), a($$2), $$3);
      }
   }

   private static xe a(ja<btq> $$0) {
      return xe.c($$0.a().c());
   }
}

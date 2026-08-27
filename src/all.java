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

public class all {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> ws.b("commands.attribute.failed.entity", $$0));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> ws.b("commands.attribute.failed.no_attribute", $$0, $$1)
   );
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> ws.b("commands.attribute.failed.no_modifier", $$1, $$0, $$2)
   );
   private static final Dynamic3CommandExceptionType d = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> ws.b("commands.attribute.failed.modifier_already_present", $$2, $$1, $$0)
   );

   public static void a(CommandDispatcher<ec> $$0, dy $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("attribute").requires($$0x -> $$0x.c(2)))
            .then(
               ed.a("target", ep.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ed.a("attribute", fb.a($$1, ld.c))
                              .then(
                                 ((LiteralArgumentBuilder)ed.a("get")
                                       .executes($$0x -> a((ec)$$0x.getSource(), ep.a($$0x, "target"), fb.a($$0x, "attribute"), 1.0)))
                                    .then(
                                       ed.a("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             $$0x -> a(
                                                   (ec)$$0x.getSource(),
                                                   ep.a($$0x, "target"),
                                                   fb.a($$0x, "attribute"),
                                                   DoubleArgumentType.getDouble($$0x, "scale")
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)ed.a("base")
                                    .then(
                                       ed.a("set")
                                          .then(
                                             ed.a("value", DoubleArgumentType.doubleArg())
                                                .executes(
                                                   $$0x -> c(
                                                         (ec)$$0x.getSource(),
                                                         ep.a($$0x, "target"),
                                                         fb.a($$0x, "attribute"),
                                                         DoubleArgumentType.getDouble($$0x, "value")
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)ed.a("get")
                                          .executes($$0x -> b((ec)$$0x.getSource(), ep.a($$0x, "target"), fb.a($$0x, "attribute"), 1.0)))
                                       .then(
                                          ed.a("scale", DoubleArgumentType.doubleArg())
                                             .executes(
                                                $$0x -> b(
                                                      (ec)$$0x.getSource(),
                                                      ep.a($$0x, "target"),
                                                      fb.a($$0x, "attribute"),
                                                      DoubleArgumentType.getDouble($$0x, "scale")
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("modifier")
                                    .then(
                                       ed.a("add")
                                          .then(
                                             ed.a("uuid", fr.a())
                                                .then(
                                                   ed.a("name", StringArgumentType.string())
                                                      .then(
                                                         ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ed.a("value", DoubleArgumentType.doubleArg())
                                                                  .then(
                                                                     ed.a("add_value")
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ec)$$0x.getSource(),
                                                                                 ep.a($$0x, "target"),
                                                                                 fb.a($$0x, "attribute"),
                                                                                 fr.a($$0x, "uuid"),
                                                                                 StringArgumentType.getString($$0x, "name"),
                                                                                 DoubleArgumentType.getDouble($$0x, "value"),
                                                                                 bsj.a.a
                                                                              )
                                                                        )
                                                                  ))
                                                               .then(
                                                                  ed.a("add_multiplied_base")
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ec)$$0x.getSource(),
                                                                              ep.a($$0x, "target"),
                                                                              fb.a($$0x, "attribute"),
                                                                              fr.a($$0x, "uuid"),
                                                                              StringArgumentType.getString($$0x, "name"),
                                                                              DoubleArgumentType.getDouble($$0x, "value"),
                                                                              bsj.a.b
                                                                           )
                                                                     )
                                                               ))
                                                            .then(
                                                               ed.a("add_multiplied_total")
                                                                  .executes(
                                                                     $$0x -> a(
                                                                           (ec)$$0x.getSource(),
                                                                           ep.a($$0x, "target"),
                                                                           fb.a($$0x, "attribute"),
                                                                           fr.a($$0x, "uuid"),
                                                                           StringArgumentType.getString($$0x, "name"),
                                                                           DoubleArgumentType.getDouble($$0x, "value"),
                                                                           bsj.a.c
                                                                        )
                                                                  )
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ed.a("remove")
                                       .then(
                                          ed.a("uuid", fr.a())
                                             .executes($$0x -> a((ec)$$0x.getSource(), ep.a($$0x, "target"), fb.a($$0x, "attribute"), fr.a($$0x, "uuid")))
                                       )
                                 ))
                              .then(
                                 ed.a("value")
                                    .then(
                                       ed.a("get")
                                          .then(
                                             ((RequiredArgumentBuilder)ed.a("uuid", fr.a())
                                                   .executes(
                                                      $$0x -> a((ec)$$0x.getSource(), ep.a($$0x, "target"), fb.a($$0x, "attribute"), fr.a($$0x, "uuid"), 1.0)
                                                   ))
                                                .then(
                                                   ed.a("scale", DoubleArgumentType.doubleArg())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ec)$$0x.getSource(),
                                                               ep.a($$0x, "target"),
                                                               fb.a($$0x, "attribute"),
                                                               fr.a($$0x, "uuid"),
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

   private static bsh a(bql $$0, iv<bsg> $$1) throws CommandSyntaxException {
      bsh $$2 = a($$0).eU().a($$1);
      if ($$2 == null) {
         throw b.create($$0.ad(), a($$1));
      } else {
         return $$2;
      }
   }

   private static bre a(bql $$0) throws CommandSyntaxException {
      if (!($$0 instanceof bre)) {
         throw a.create($$0.ad());
      } else {
         return (bre)$$0;
      }
   }

   private static bre b(bql $$0, iv<bsg> $$1) throws CommandSyntaxException {
      bre $$2 = a($$0);
      if (!$$2.eU().b($$1)) {
         throw b.create($$0.ad(), a($$1));
      } else {
         return $$2;
      }
   }

   private static int a(ec $$0, bql $$1, iv<bsg> $$2, double $$3) throws CommandSyntaxException {
      bre $$4 = b($$1, $$2);
      double $$5 = $$4.g($$2);
      $$0.a(() -> ws.a("commands.attribute.value.get.success", a($$2), $$1.ad(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int b(ec $$0, bql $$1, iv<bsg> $$2, double $$3) throws CommandSyntaxException {
      bre $$4 = b($$1, $$2);
      double $$5 = $$4.h($$2);
      $$0.a(() -> ws.a("commands.attribute.base_value.get.success", a($$2), $$1.ad(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int a(ec $$0, bql $$1, iv<bsg> $$2, UUID $$3, double $$4) throws CommandSyntaxException {
      bre $$5 = b($$1, $$2);
      bsi $$6 = $$5.eU();
      if (!$$6.a($$2, $$3)) {
         throw c.create($$1.ad(), a($$2), $$3);
      } else {
         double $$7 = $$6.b($$2, $$3);
         $$0.a(() -> ws.a("commands.attribute.modifier.value.get.success", ws.a($$3), a($$2), $$1.ad(), $$7), false);
         return (int)($$7 * $$4);
      }
   }

   private static int c(ec $$0, bql $$1, iv<bsg> $$2, double $$3) throws CommandSyntaxException {
      a($$1, $$2).a($$3);
      $$0.a(() -> ws.a("commands.attribute.base_value.set.success", a($$2), $$1.ad(), $$3), false);
      return 1;
   }

   private static int a(ec $$0, bql $$1, iv<bsg> $$2, UUID $$3, String $$4, double $$5, bsj.a $$6) throws CommandSyntaxException {
      bsh $$7 = a($$1, $$2);
      bsj $$8 = new bsj($$3, $$4, $$5, $$6);
      if ($$7.a($$8)) {
         throw d.create($$1.ad(), a($$2), $$3);
      } else {
         $$7.d($$8);
         $$0.a(() -> ws.a("commands.attribute.modifier.add.success", ws.a($$3), a($$2), $$1.ad()), false);
         return 1;
      }
   }

   private static int a(ec $$0, bql $$1, iv<bsg> $$2, UUID $$3) throws CommandSyntaxException {
      bsh $$4 = a($$1, $$2);
      if ($$4.c($$3)) {
         $$0.a(() -> ws.a("commands.attribute.modifier.remove.success", ws.a($$3), a($$2), $$1.ad()), false);
         return 1;
      } else {
         throw c.create($$1.ad(), a($$2), $$3);
      }
   }

   private static ws a(iv<bsg> $$0) {
      return ws.c($$0.a().c());
   }
}

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

public class alr {
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

   public static void a(CommandDispatcher<eq> $$0, em $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("attribute").requires($$0x -> $$0x.c(2)))
            .then(
               er.a("target", fd.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)er.a("attribute", fp.a($$1, lr.c))
                              .then(
                                 ((LiteralArgumentBuilder)er.a("get")
                                       .executes($$0x -> a((eq)$$0x.getSource(), fd.a($$0x, "target"), fp.a($$0x, "attribute"), 1.0)))
                                    .then(
                                       er.a("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             $$0x -> a(
                                                   (eq)$$0x.getSource(),
                                                   fd.a($$0x, "target"),
                                                   fp.a($$0x, "attribute"),
                                                   DoubleArgumentType.getDouble($$0x, "scale")
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)er.a("base")
                                    .then(
                                       er.a("set")
                                          .then(
                                             er.a("value", DoubleArgumentType.doubleArg())
                                                .executes(
                                                   $$0x -> c(
                                                         (eq)$$0x.getSource(),
                                                         fd.a($$0x, "target"),
                                                         fp.a($$0x, "attribute"),
                                                         DoubleArgumentType.getDouble($$0x, "value")
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)er.a("get")
                                          .executes($$0x -> b((eq)$$0x.getSource(), fd.a($$0x, "target"), fp.a($$0x, "attribute"), 1.0)))
                                       .then(
                                          er.a("scale", DoubleArgumentType.doubleArg())
                                             .executes(
                                                $$0x -> b(
                                                      (eq)$$0x.getSource(),
                                                      fd.a($$0x, "target"),
                                                      fp.a($$0x, "attribute"),
                                                      DoubleArgumentType.getDouble($$0x, "scale")
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           ((LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("modifier")
                                    .then(
                                       er.a("add")
                                          .then(
                                             er.a("uuid", gg.a())
                                                .then(
                                                   er.a("name", StringArgumentType.string())
                                                      .then(
                                                         ((RequiredArgumentBuilder)((RequiredArgumentBuilder)er.a("value", DoubleArgumentType.doubleArg())
                                                                  .then(
                                                                     er.a("add_value")
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (eq)$$0x.getSource(),
                                                                                 fd.a($$0x, "target"),
                                                                                 fp.a($$0x, "attribute"),
                                                                                 gg.a($$0x, "uuid"),
                                                                                 StringArgumentType.getString($$0x, "name"),
                                                                                 DoubleArgumentType.getDouble($$0x, "value"),
                                                                                 buh.a.a
                                                                              )
                                                                        )
                                                                  ))
                                                               .then(
                                                                  er.a("add_multiplied_base")
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (eq)$$0x.getSource(),
                                                                              fd.a($$0x, "target"),
                                                                              fp.a($$0x, "attribute"),
                                                                              gg.a($$0x, "uuid"),
                                                                              StringArgumentType.getString($$0x, "name"),
                                                                              DoubleArgumentType.getDouble($$0x, "value"),
                                                                              buh.a.b
                                                                           )
                                                                     )
                                                               ))
                                                            .then(
                                                               er.a("add_multiplied_total")
                                                                  .executes(
                                                                     $$0x -> a(
                                                                           (eq)$$0x.getSource(),
                                                                           fd.a($$0x, "target"),
                                                                           fp.a($$0x, "attribute"),
                                                                           gg.a($$0x, "uuid"),
                                                                           StringArgumentType.getString($$0x, "name"),
                                                                           DoubleArgumentType.getDouble($$0x, "value"),
                                                                           buh.a.c
                                                                        )
                                                                  )
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    er.a("remove")
                                       .then(
                                          er.a("uuid", gg.a())
                                             .executes($$0x -> a((eq)$$0x.getSource(), fd.a($$0x, "target"), fp.a($$0x, "attribute"), gg.a($$0x, "uuid")))
                                       )
                                 ))
                              .then(
                                 er.a("value")
                                    .then(
                                       er.a("get")
                                          .then(
                                             ((RequiredArgumentBuilder)er.a("uuid", gg.a())
                                                   .executes(
                                                      $$0x -> a((eq)$$0x.getSource(), fd.a($$0x, "target"), fp.a($$0x, "attribute"), gg.a($$0x, "uuid"), 1.0)
                                                   ))
                                                .then(
                                                   er.a("scale", DoubleArgumentType.doubleArg())
                                                      .executes(
                                                         $$0x -> a(
                                                               (eq)$$0x.getSource(),
                                                               fd.a($$0x, "target"),
                                                               fp.a($$0x, "attribute"),
                                                               gg.a($$0x, "uuid"),
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

   private static buf a(bsg $$0, jj<bue> $$1) throws CommandSyntaxException {
      buf $$2 = a($$0).eT().a($$1);
      if ($$2 == null) {
         throw b.create($$0.ag(), a($$1));
      } else {
         return $$2;
      }
   }

   private static btb a(bsg $$0) throws CommandSyntaxException {
      if (!($$0 instanceof btb)) {
         throw a.create($$0.ag());
      } else {
         return (btb)$$0;
      }
   }

   private static btb b(bsg $$0, jj<bue> $$1) throws CommandSyntaxException {
      btb $$2 = a($$0);
      if (!$$2.eT().b($$1)) {
         throw b.create($$0.ag(), a($$1));
      } else {
         return $$2;
      }
   }

   private static int a(eq $$0, bsg $$1, jj<bue> $$2, double $$3) throws CommandSyntaxException {
      btb $$4 = b($$1, $$2);
      double $$5 = $$4.g($$2);
      $$0.a(() -> wu.a("commands.attribute.value.get.success", a($$2), $$1.ag(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int b(eq $$0, bsg $$1, jj<bue> $$2, double $$3) throws CommandSyntaxException {
      btb $$4 = b($$1, $$2);
      double $$5 = $$4.h($$2);
      $$0.a(() -> wu.a("commands.attribute.base_value.get.success", a($$2), $$1.ag(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int a(eq $$0, bsg $$1, jj<bue> $$2, UUID $$3, double $$4) throws CommandSyntaxException {
      btb $$5 = b($$1, $$2);
      bug $$6 = $$5.eT();
      if (!$$6.a($$2, $$3)) {
         throw c.create($$1.ag(), a($$2), $$3);
      } else {
         double $$7 = $$6.b($$2, $$3);
         $$0.a(() -> wu.a("commands.attribute.modifier.value.get.success", wu.a($$3), a($$2), $$1.ag(), $$7), false);
         return (int)($$7 * $$4);
      }
   }

   private static int c(eq $$0, bsg $$1, jj<bue> $$2, double $$3) throws CommandSyntaxException {
      a($$1, $$2).a($$3);
      $$0.a(() -> wu.a("commands.attribute.base_value.set.success", a($$2), $$1.ag(), $$3), false);
      return 1;
   }

   private static int a(eq $$0, bsg $$1, jj<bue> $$2, UUID $$3, String $$4, double $$5, buh.a $$6) throws CommandSyntaxException {
      buf $$7 = a($$1, $$2);
      buh $$8 = new buh($$3, $$4, $$5, $$6);
      if ($$7.a($$8)) {
         throw d.create($$1.ag(), a($$2), $$3);
      } else {
         $$7.d($$8);
         $$0.a(() -> wu.a("commands.attribute.modifier.add.success", wu.a($$3), a($$2), $$1.ag()), false);
         return 1;
      }
   }

   private static int a(eq $$0, bsg $$1, jj<bue> $$2, UUID $$3) throws CommandSyntaxException {
      buf $$4 = a($$1, $$2);
      if ($$4.c($$3)) {
         $$0.a(() -> wu.a("commands.attribute.modifier.remove.success", wu.a($$3), a($$2), $$1.ag()), false);
         return 1;
      } else {
         throw c.create($$1.ag(), a($$2), $$3);
      }
   }

   private static wu a(jj<bue> $$0) {
      return wu.c($$0.a().c());
   }
}

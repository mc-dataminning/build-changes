import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;

public class alz {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wz.b("commands.attribute.failed.entity", $$0));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> wz.b("commands.attribute.failed.no_attribute", $$0, $$1)
   );
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> wz.b("commands.attribute.failed.no_modifier", $$1, $$0, $$2)
   );
   private static final Dynamic3CommandExceptionType d = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> wz.b("commands.attribute.failed.modifier_already_present", $$2, $$1, $$0)
   );

   public static void a(CommandDispatcher<et> $$0, ep $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("attribute").requires($$0x -> $$0x.c(2)))
            .then(
               eu.a("target", fg.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)eu.a("attribute", fs.a($$1, lu.c))
                              .then(
                                 ((LiteralArgumentBuilder)eu.a("get")
                                       .executes($$0x -> a((et)$$0x.getSource(), fg.a($$0x, "target"), fs.a($$0x, "attribute"), 1.0)))
                                    .then(
                                       eu.a("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             $$0x -> a(
                                                   (et)$$0x.getSource(),
                                                   fg.a($$0x, "target"),
                                                   fs.a($$0x, "attribute"),
                                                   DoubleArgumentType.getDouble($$0x, "scale")
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)eu.a("base")
                                    .then(
                                       eu.a("set")
                                          .then(
                                             eu.a("value", DoubleArgumentType.doubleArg())
                                                .executes(
                                                   $$0x -> c(
                                                         (et)$$0x.getSource(),
                                                         fg.a($$0x, "target"),
                                                         fs.a($$0x, "attribute"),
                                                         DoubleArgumentType.getDouble($$0x, "value")
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)eu.a("get")
                                          .executes($$0x -> b((et)$$0x.getSource(), fg.a($$0x, "target"), fs.a($$0x, "attribute"), 1.0)))
                                       .then(
                                          eu.a("scale", DoubleArgumentType.doubleArg())
                                             .executes(
                                                $$0x -> b(
                                                      (et)$$0x.getSource(),
                                                      fg.a($$0x, "target"),
                                                      fs.a($$0x, "attribute"),
                                                      DoubleArgumentType.getDouble($$0x, "scale")
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           ((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("modifier")
                                    .then(
                                       eu.a("add")
                                          .then(
                                             eu.a("id", fu.a())
                                                .then(
                                                   ((RequiredArgumentBuilder)((RequiredArgumentBuilder)eu.a("value", DoubleArgumentType.doubleArg())
                                                            .then(
                                                               eu.a("add_value")
                                                                  .executes(
                                                                     $$0x -> a(
                                                                           (et)$$0x.getSource(),
                                                                           fg.a($$0x, "target"),
                                                                           fs.a($$0x, "attribute"),
                                                                           fu.c($$0x, "id"),
                                                                           DoubleArgumentType.getDouble($$0x, "value"),
                                                                           buu.a.a
                                                                        )
                                                                  )
                                                            ))
                                                         .then(
                                                            eu.a("add_multiplied_base")
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (et)$$0x.getSource(),
                                                                        fg.a($$0x, "target"),
                                                                        fs.a($$0x, "attribute"),
                                                                        fu.c($$0x, "id"),
                                                                        DoubleArgumentType.getDouble($$0x, "value"),
                                                                        buu.a.b
                                                                     )
                                                               )
                                                         ))
                                                      .then(
                                                         eu.a("add_multiplied_total")
                                                            .executes(
                                                               $$0x -> a(
                                                                     (et)$$0x.getSource(),
                                                                     fg.a($$0x, "target"),
                                                                     fs.a($$0x, "attribute"),
                                                                     fu.c($$0x, "id"),
                                                                     DoubleArgumentType.getDouble($$0x, "value"),
                                                                     buu.a.c
                                                                  )
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    eu.a("remove")
                                       .then(
                                          eu.a("id", fu.a())
                                             .executes($$0x -> a((et)$$0x.getSource(), fg.a($$0x, "target"), fs.a($$0x, "attribute"), fu.c($$0x, "id")))
                                       )
                                 ))
                              .then(
                                 eu.a("value")
                                    .then(
                                       eu.a("get")
                                          .then(
                                             ((RequiredArgumentBuilder)eu.a("id", fu.a())
                                                   .executes(
                                                      $$0x -> a((et)$$0x.getSource(), fg.a($$0x, "target"), fs.a($$0x, "attribute"), fu.c($$0x, "id"), 1.0)
                                                   ))
                                                .then(
                                                   eu.a("scale", DoubleArgumentType.doubleArg())
                                                      .executes(
                                                         $$0x -> a(
                                                               (et)$$0x.getSource(),
                                                               fg.a($$0x, "target"),
                                                               fs.a($$0x, "attribute"),
                                                               fu.c($$0x, "id"),
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

   private static bus a(bsr $$0, jm<bur> $$1) throws CommandSyntaxException {
      bus $$2 = a($$0).eT().a($$1);
      if ($$2 == null) {
         throw b.create($$0.ah(), a($$1));
      } else {
         return $$2;
      }
   }

   private static btn a(bsr $$0) throws CommandSyntaxException {
      if (!($$0 instanceof btn)) {
         throw a.create($$0.ah());
      } else {
         return (btn)$$0;
      }
   }

   private static btn b(bsr $$0, jm<bur> $$1) throws CommandSyntaxException {
      btn $$2 = a($$0);
      if (!$$2.eT().b($$1)) {
         throw b.create($$0.ah(), a($$1));
      } else {
         return $$2;
      }
   }

   private static int a(et $$0, bsr $$1, jm<bur> $$2, double $$3) throws CommandSyntaxException {
      btn $$4 = b($$1, $$2);
      double $$5 = $$4.g($$2);
      $$0.a(() -> wz.a("commands.attribute.value.get.success", a($$2), $$1.ah(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int b(et $$0, bsr $$1, jm<bur> $$2, double $$3) throws CommandSyntaxException {
      btn $$4 = b($$1, $$2);
      double $$5 = $$4.h($$2);
      $$0.a(() -> wz.a("commands.attribute.base_value.get.success", a($$2), $$1.ah(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int a(et $$0, bsr $$1, jm<bur> $$2, akr $$3, double $$4) throws CommandSyntaxException {
      btn $$5 = b($$1, $$2);
      but $$6 = $$5.eT();
      if (!$$6.a($$2, $$3)) {
         throw c.create($$1.ah(), a($$2), $$3);
      } else {
         double $$7 = $$6.b($$2, $$3);
         $$0.a(() -> wz.a("commands.attribute.modifier.value.get.success", wz.a($$3), a($$2), $$1.ah(), $$7), false);
         return (int)($$7 * $$4);
      }
   }

   private static int c(et $$0, bsr $$1, jm<bur> $$2, double $$3) throws CommandSyntaxException {
      a($$1, $$2).a($$3);
      $$0.a(() -> wz.a("commands.attribute.base_value.set.success", a($$2), $$1.ah(), $$3), false);
      return 1;
   }

   private static int a(et $$0, bsr $$1, jm<bur> $$2, akr $$3, double $$4, buu.a $$5) throws CommandSyntaxException {
      bus $$6 = a($$1, $$2);
      buu $$7 = new buu($$3, $$4, $$5);
      if ($$6.b($$3)) {
         throw d.create($$1.ah(), a($$2), $$3);
      } else {
         $$6.c($$7);
         $$0.a(() -> wz.a("commands.attribute.modifier.add.success", wz.a($$3), a($$2), $$1.ah()), false);
         return 1;
      }
   }

   private static int a(et $$0, bsr $$1, jm<bur> $$2, akr $$3) throws CommandSyntaxException {
      bus $$4 = a($$1, $$2);
      if ($$4.c($$3)) {
         $$0.a(() -> wz.a("commands.attribute.modifier.remove.success", wz.a($$3), a($$2), $$1.ah()), false);
         return 1;
      } else {
         throw c.create($$1.ah(), a($$2), $$3);
      }
   }

   private static wz a(jm<bur> $$0) {
      return wz.c($$0.a().c());
   }
}

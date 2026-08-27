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

public class alu {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wx.b("commands.attribute.failed.entity", $$0));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> wx.b("commands.attribute.failed.no_attribute", $$0, $$1)
   );
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> wx.b("commands.attribute.failed.no_modifier", $$1, $$0, $$2)
   );
   private static final Dynamic3CommandExceptionType d = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> wx.b("commands.attribute.failed.modifier_already_present", $$2, $$1, $$0)
   );

   public static void a(CommandDispatcher<ee> $$0, ea $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("attribute").requires($$0x -> $$0x.c(2)))
            .then(
               ef.a("target", er.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ef.a("attribute", fd.a($$1, lf.c))
                              .then(
                                 ((LiteralArgumentBuilder)ef.a("get")
                                       .executes($$0x -> a((ee)$$0x.getSource(), er.a($$0x, "target"), fd.a($$0x, "attribute"), 1.0)))
                                    .then(
                                       ef.a("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             $$0x -> a(
                                                   (ee)$$0x.getSource(),
                                                   er.a($$0x, "target"),
                                                   fd.a($$0x, "attribute"),
                                                   DoubleArgumentType.getDouble($$0x, "scale")
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)ef.a("base")
                                    .then(
                                       ef.a("set")
                                          .then(
                                             ef.a("value", DoubleArgumentType.doubleArg())
                                                .executes(
                                                   $$0x -> c(
                                                         (ee)$$0x.getSource(),
                                                         er.a($$0x, "target"),
                                                         fd.a($$0x, "attribute"),
                                                         DoubleArgumentType.getDouble($$0x, "value")
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)ef.a("get")
                                          .executes($$0x -> b((ee)$$0x.getSource(), er.a($$0x, "target"), fd.a($$0x, "attribute"), 1.0)))
                                       .then(
                                          ef.a("scale", DoubleArgumentType.doubleArg())
                                             .executes(
                                                $$0x -> b(
                                                      (ee)$$0x.getSource(),
                                                      er.a($$0x, "target"),
                                                      fd.a($$0x, "attribute"),
                                                      DoubleArgumentType.getDouble($$0x, "scale")
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("modifier")
                                    .then(
                                       ef.a("add")
                                          .then(
                                             ef.a("uuid", fu.a())
                                                .then(
                                                   ef.a("name", StringArgumentType.string())
                                                      .then(
                                                         ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ef.a("value", DoubleArgumentType.doubleArg())
                                                                  .then(
                                                                     ef.a("add_value")
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ee)$$0x.getSource(),
                                                                                 er.a($$0x, "target"),
                                                                                 fd.a($$0x, "attribute"),
                                                                                 fu.a($$0x, "uuid"),
                                                                                 StringArgumentType.getString($$0x, "name"),
                                                                                 DoubleArgumentType.getDouble($$0x, "value"),
                                                                                 btw.a.a
                                                                              )
                                                                        )
                                                                  ))
                                                               .then(
                                                                  ef.a("add_multiplied_base")
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ee)$$0x.getSource(),
                                                                              er.a($$0x, "target"),
                                                                              fd.a($$0x, "attribute"),
                                                                              fu.a($$0x, "uuid"),
                                                                              StringArgumentType.getString($$0x, "name"),
                                                                              DoubleArgumentType.getDouble($$0x, "value"),
                                                                              btw.a.b
                                                                           )
                                                                     )
                                                               ))
                                                            .then(
                                                               ef.a("add_multiplied_total")
                                                                  .executes(
                                                                     $$0x -> a(
                                                                           (ee)$$0x.getSource(),
                                                                           er.a($$0x, "target"),
                                                                           fd.a($$0x, "attribute"),
                                                                           fu.a($$0x, "uuid"),
                                                                           StringArgumentType.getString($$0x, "name"),
                                                                           DoubleArgumentType.getDouble($$0x, "value"),
                                                                           btw.a.c
                                                                        )
                                                                  )
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ef.a("remove")
                                       .then(
                                          ef.a("uuid", fu.a())
                                             .executes($$0x -> a((ee)$$0x.getSource(), er.a($$0x, "target"), fd.a($$0x, "attribute"), fu.a($$0x, "uuid")))
                                       )
                                 ))
                              .then(
                                 ef.a("value")
                                    .then(
                                       ef.a("get")
                                          .then(
                                             ((RequiredArgumentBuilder)ef.a("uuid", fu.a())
                                                   .executes(
                                                      $$0x -> a((ee)$$0x.getSource(), er.a($$0x, "target"), fd.a($$0x, "attribute"), fu.a($$0x, "uuid"), 1.0)
                                                   ))
                                                .then(
                                                   ef.a("scale", DoubleArgumentType.doubleArg())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ee)$$0x.getSource(),
                                                               er.a($$0x, "target"),
                                                               fd.a($$0x, "attribute"),
                                                               fu.a($$0x, "uuid"),
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

   private static btu a(brw $$0, ix<btt> $$1) throws CommandSyntaxException {
      btu $$2 = a($$0).eW().a($$1);
      if ($$2 == null) {
         throw b.create($$0.af(), a($$1));
      } else {
         return $$2;
      }
   }

   private static bsq a(brw $$0) throws CommandSyntaxException {
      if (!($$0 instanceof bsq)) {
         throw a.create($$0.af());
      } else {
         return (bsq)$$0;
      }
   }

   private static bsq b(brw $$0, ix<btt> $$1) throws CommandSyntaxException {
      bsq $$2 = a($$0);
      if (!$$2.eW().b($$1)) {
         throw b.create($$0.af(), a($$1));
      } else {
         return $$2;
      }
   }

   private static int a(ee $$0, brw $$1, ix<btt> $$2, double $$3) throws CommandSyntaxException {
      bsq $$4 = b($$1, $$2);
      double $$5 = $$4.g($$2);
      $$0.a(() -> wx.a("commands.attribute.value.get.success", a($$2), $$1.af(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int b(ee $$0, brw $$1, ix<btt> $$2, double $$3) throws CommandSyntaxException {
      bsq $$4 = b($$1, $$2);
      double $$5 = $$4.h($$2);
      $$0.a(() -> wx.a("commands.attribute.base_value.get.success", a($$2), $$1.af(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int a(ee $$0, brw $$1, ix<btt> $$2, UUID $$3, double $$4) throws CommandSyntaxException {
      bsq $$5 = b($$1, $$2);
      btv $$6 = $$5.eW();
      if (!$$6.a($$2, $$3)) {
         throw c.create($$1.af(), a($$2), $$3);
      } else {
         double $$7 = $$6.b($$2, $$3);
         $$0.a(() -> wx.a("commands.attribute.modifier.value.get.success", wx.a($$3), a($$2), $$1.af(), $$7), false);
         return (int)($$7 * $$4);
      }
   }

   private static int c(ee $$0, brw $$1, ix<btt> $$2, double $$3) throws CommandSyntaxException {
      a($$1, $$2).a($$3);
      $$0.a(() -> wx.a("commands.attribute.base_value.set.success", a($$2), $$1.af(), $$3), false);
      return 1;
   }

   private static int a(ee $$0, brw $$1, ix<btt> $$2, UUID $$3, String $$4, double $$5, btw.a $$6) throws CommandSyntaxException {
      btu $$7 = a($$1, $$2);
      btw $$8 = new btw($$3, $$4, $$5, $$6);
      if ($$7.a($$8)) {
         throw d.create($$1.af(), a($$2), $$3);
      } else {
         $$7.d($$8);
         $$0.a(() -> wx.a("commands.attribute.modifier.add.success", wx.a($$3), a($$2), $$1.af()), false);
         return 1;
      }
   }

   private static int a(ee $$0, brw $$1, ix<btt> $$2, UUID $$3) throws CommandSyntaxException {
      btu $$4 = a($$1, $$2);
      if ($$4.c($$3)) {
         $$0.a(() -> wx.a("commands.attribute.modifier.remove.success", wx.a($$3), a($$2), $$1.af()), false);
         return 1;
      } else {
         throw c.create($$1.af(), a($$2), $$3);
      }
   }

   private static wx a(ix<btt> $$0) {
      return wx.c($$0.a().c());
   }
}

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.stream.Stream;

public class amd {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wo.b("commands.attribute.failed.entity", $$0));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> wo.b("commands.attribute.failed.no_attribute", $$0, $$1)
   );
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> wo.b("commands.attribute.failed.no_modifier", $$1, $$0, $$2)
   );
   private static final Dynamic3CommandExceptionType d = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> wo.b("commands.attribute.failed.modifier_already_present", $$2, $$1, $$0)
   );

   public static void a(CommandDispatcher<ex> $$0, et $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("attribute").requires($$0x -> $$0x.c(2)))
            .then(
               ey.a("target", fk.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ey.a("attribute", fw.a($$1, mc.c))
                              .then(
                                 ((LiteralArgumentBuilder)ey.a("get")
                                       .executes($$0x -> a((ex)$$0x.getSource(), fk.a($$0x, "target"), fw.a($$0x, "attribute"), 1.0)))
                                    .then(
                                       ey.a("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             $$0x -> a(
                                                   (ex)$$0x.getSource(),
                                                   fk.a($$0x, "target"),
                                                   fw.a($$0x, "attribute"),
                                                   DoubleArgumentType.getDouble($$0x, "scale")
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("base")
                                       .then(
                                          ey.a("set")
                                             .then(
                                                ey.a("value", DoubleArgumentType.doubleArg())
                                                   .executes(
                                                      $$0x -> c(
                                                            (ex)$$0x.getSource(),
                                                            fk.a($$0x, "target"),
                                                            fw.a($$0x, "attribute"),
                                                            DoubleArgumentType.getDouble($$0x, "value")
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       ((LiteralArgumentBuilder)ey.a("get")
                                             .executes($$0x -> b((ex)$$0x.getSource(), fk.a($$0x, "target"), fw.a($$0x, "attribute"), 1.0)))
                                          .then(
                                             ey.a("scale", DoubleArgumentType.doubleArg())
                                                .executes(
                                                   $$0x -> b(
                                                         (ex)$$0x.getSource(),
                                                         fk.a($$0x, "target"),
                                                         fw.a($$0x, "attribute"),
                                                         DoubleArgumentType.getDouble($$0x, "scale")
                                                      )
                                                )
                                          )
                                    ))
                                 .then(ey.a("reset").executes($$0x -> a((ex)$$0x.getSource(), fk.a($$0x, "target"), fw.a($$0x, "attribute"))))
                           ))
                        .then(
                           ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("modifier")
                                    .then(
                                       ey.a("add")
                                          .then(
                                             ey.a("id", fy.a())
                                                .then(
                                                   ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ey.a("value", DoubleArgumentType.doubleArg())
                                                            .then(
                                                               ey.a("add_value")
                                                                  .executes(
                                                                     $$0x -> a(
                                                                           (ex)$$0x.getSource(),
                                                                           fk.a($$0x, "target"),
                                                                           fw.a($$0x, "attribute"),
                                                                           fy.a($$0x, "id"),
                                                                           DoubleArgumentType.getDouble($$0x, "value"),
                                                                           bwl.a.a
                                                                        )
                                                                  )
                                                            ))
                                                         .then(
                                                            ey.a("add_multiplied_base")
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (ex)$$0x.getSource(),
                                                                        fk.a($$0x, "target"),
                                                                        fw.a($$0x, "attribute"),
                                                                        fy.a($$0x, "id"),
                                                                        DoubleArgumentType.getDouble($$0x, "value"),
                                                                        bwl.a.b
                                                                     )
                                                               )
                                                         ))
                                                      .then(
                                                         ey.a("add_multiplied_total")
                                                            .executes(
                                                               $$0x -> a(
                                                                     (ex)$$0x.getSource(),
                                                                     fk.a($$0x, "target"),
                                                                     fw.a($$0x, "attribute"),
                                                                     fy.a($$0x, "id"),
                                                                     DoubleArgumentType.getDouble($$0x, "value"),
                                                                     bwl.a.c
                                                                  )
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ey.a("remove")
                                       .then(
                                          ey.a("id", fy.a())
                                             .suggests(($$0x, $$1x) -> fc.a(c(fk.a($$0x, "target"), fw.a($$0x, "attribute")), $$1x))
                                             .executes($$0x -> a((ex)$$0x.getSource(), fk.a($$0x, "target"), fw.a($$0x, "attribute"), fy.a($$0x, "id")))
                                       )
                                 ))
                              .then(
                                 ey.a("value")
                                    .then(
                                       ey.a("get")
                                          .then(
                                             ((RequiredArgumentBuilder)ey.a("id", fy.a())
                                                   .suggests(($$0x, $$1x) -> fc.a(c(fk.a($$0x, "target"), fw.a($$0x, "attribute")), $$1x))
                                                   .executes(
                                                      $$0x -> a((ex)$$0x.getSource(), fk.a($$0x, "target"), fw.a($$0x, "attribute"), fy.a($$0x, "id"), 1.0)
                                                   ))
                                                .then(
                                                   ey.a("scale", DoubleArgumentType.doubleArg())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ex)$$0x.getSource(),
                                                               fk.a($$0x, "target"),
                                                               fw.a($$0x, "attribute"),
                                                               fy.a($$0x, "id"),
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

   private static bwj a(buj $$0, jr<bwi> $$1) throws CommandSyntaxException {
      bwj $$2 = a($$0).eY().a($$1);
      if ($$2 == null) {
         throw b.create($$0.al(), a($$1));
      } else {
         return $$2;
      }
   }

   private static bvf a(buj $$0) throws CommandSyntaxException {
      if (!($$0 instanceof bvf)) {
         throw a.create($$0.al());
      } else {
         return (bvf)$$0;
      }
   }

   private static bvf b(buj $$0, jr<bwi> $$1) throws CommandSyntaxException {
      bvf $$2 = a($$0);
      if (!$$2.eY().b($$1)) {
         throw b.create($$0.al(), a($$1));
      } else {
         return $$2;
      }
   }

   private static int a(ex $$0, buj $$1, jr<bwi> $$2, double $$3) throws CommandSyntaxException {
      bvf $$4 = b($$1, $$2);
      double $$5 = $$4.h($$2);
      $$0.a(() -> wo.a("commands.attribute.value.get.success", a($$2), $$1.al(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int b(ex $$0, buj $$1, jr<bwi> $$2, double $$3) throws CommandSyntaxException {
      bvf $$4 = b($$1, $$2);
      double $$5 = $$4.i($$2);
      $$0.a(() -> wo.a("commands.attribute.base_value.get.success", a($$2), $$1.al(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int a(ex $$0, buj $$1, jr<bwi> $$2, aku $$3, double $$4) throws CommandSyntaxException {
      bvf $$5 = b($$1, $$2);
      bwk $$6 = $$5.eY();
      if (!$$6.a($$2, $$3)) {
         throw c.create($$1.al(), a($$2), $$3);
      } else {
         double $$7 = $$6.b($$2, $$3);
         $$0.a(() -> wo.a("commands.attribute.modifier.value.get.success", wo.a($$3), a($$2), $$1.al(), $$7), false);
         return (int)($$7 * $$4);
      }
   }

   private static Stream<aku> c(buj $$0, jr<bwi> $$1) throws CommandSyntaxException {
      bwj $$2 = a($$0, $$1);
      return $$2.c().stream().map(bwl::b);
   }

   private static int c(ex $$0, buj $$1, jr<bwi> $$2, double $$3) throws CommandSyntaxException {
      a($$1, $$2).a($$3);
      $$0.a(() -> wo.a("commands.attribute.base_value.set.success", a($$2), $$1.al(), $$3), false);
      return 1;
   }

   private static int a(ex $$0, buj $$1, jr<bwi> $$2) throws CommandSyntaxException {
      bvf $$3 = a($$1);
      if (!$$3.eY().e($$2)) {
         throw b.create($$1.al(), a($$2));
      } else {
         double $$4 = $$3.i($$2);
         $$0.a(() -> wo.a("commands.attribute.base_value.reset.success", a($$2), $$1.al(), $$4), false);
         return 1;
      }
   }

   private static int a(ex $$0, buj $$1, jr<bwi> $$2, aku $$3, double $$4, bwl.a $$5) throws CommandSyntaxException {
      bwj $$6 = a($$1, $$2);
      bwl $$7 = new bwl($$3, $$4, $$5);
      if ($$6.b($$3)) {
         throw d.create($$1.al(), a($$2), $$3);
      } else {
         $$6.d($$7);
         $$0.a(() -> wo.a("commands.attribute.modifier.add.success", wo.a($$3), a($$2), $$1.al()), false);
         return 1;
      }
   }

   private static int a(ex $$0, buj $$1, jr<bwi> $$2, aku $$3) throws CommandSyntaxException {
      bwj $$4 = a($$1, $$2);
      if ($$4.c($$3)) {
         $$0.a(() -> wo.a("commands.attribute.modifier.remove.success", wo.a($$3), a($$2), $$1.al()), false);
         return 1;
      } else {
         throw c.create($$1.al(), a($$2), $$3);
      }
   }

   private static wo a(jr<bwi> $$0) {
      return wo.c($$0.a().c());
   }
}

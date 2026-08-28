import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.stream.Stream;

public class amy {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xk.b("commands.attribute.failed.entity", $$0));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xk.b("commands.attribute.failed.no_attribute", $$0, $$1)
   );
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xk.b("commands.attribute.failed.no_modifier", $$1, $$0, $$2)
   );
   private static final Dynamic3CommandExceptionType d = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xk.b("commands.attribute.failed.modifier_already_present", $$2, $$1, $$0)
   );

   public static void a(CommandDispatcher<ew> $$0, es $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("attribute").requires($$0x -> $$0x.c(2)))
            .then(
               ex.a("target", fj.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ex.a("attribute", fv.a($$1, mb.c))
                              .then(
                                 ((LiteralArgumentBuilder)ex.a("get")
                                       .executes($$0x -> a((ew)$$0x.getSource(), fj.a($$0x, "target"), fv.a($$0x, "attribute"), 1.0)))
                                    .then(
                                       ex.a("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             $$0x -> a(
                                                   (ew)$$0x.getSource(),
                                                   fj.a($$0x, "target"),
                                                   fv.a($$0x, "attribute"),
                                                   DoubleArgumentType.getDouble($$0x, "scale")
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("base")
                                       .then(
                                          ex.a("set")
                                             .then(
                                                ex.a("value", DoubleArgumentType.doubleArg())
                                                   .executes(
                                                      $$0x -> c(
                                                            (ew)$$0x.getSource(),
                                                            fj.a($$0x, "target"),
                                                            fv.a($$0x, "attribute"),
                                                            DoubleArgumentType.getDouble($$0x, "value")
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       ((LiteralArgumentBuilder)ex.a("get")
                                             .executes($$0x -> b((ew)$$0x.getSource(), fj.a($$0x, "target"), fv.a($$0x, "attribute"), 1.0)))
                                          .then(
                                             ex.a("scale", DoubleArgumentType.doubleArg())
                                                .executes(
                                                   $$0x -> b(
                                                         (ew)$$0x.getSource(),
                                                         fj.a($$0x, "target"),
                                                         fv.a($$0x, "attribute"),
                                                         DoubleArgumentType.getDouble($$0x, "scale")
                                                      )
                                                )
                                          )
                                    ))
                                 .then(ex.a("reset").executes($$0x -> a((ew)$$0x.getSource(), fj.a($$0x, "target"), fv.a($$0x, "attribute"))))
                           ))
                        .then(
                           ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("modifier")
                                    .then(
                                       ex.a("add")
                                          .then(
                                             ex.a("id", fx.a())
                                                .then(
                                                   ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ex.a("value", DoubleArgumentType.doubleArg())
                                                            .then(
                                                               ex.a("add_value")
                                                                  .executes(
                                                                     $$0x -> a(
                                                                           (ew)$$0x.getSource(),
                                                                           fj.a($$0x, "target"),
                                                                           fv.a($$0x, "attribute"),
                                                                           fx.a($$0x, "id"),
                                                                           DoubleArgumentType.getDouble($$0x, "value"),
                                                                           bxd.a.a
                                                                        )
                                                                  )
                                                            ))
                                                         .then(
                                                            ex.a("add_multiplied_base")
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (ew)$$0x.getSource(),
                                                                        fj.a($$0x, "target"),
                                                                        fv.a($$0x, "attribute"),
                                                                        fx.a($$0x, "id"),
                                                                        DoubleArgumentType.getDouble($$0x, "value"),
                                                                        bxd.a.b
                                                                     )
                                                               )
                                                         ))
                                                      .then(
                                                         ex.a("add_multiplied_total")
                                                            .executes(
                                                               $$0x -> a(
                                                                     (ew)$$0x.getSource(),
                                                                     fj.a($$0x, "target"),
                                                                     fv.a($$0x, "attribute"),
                                                                     fx.a($$0x, "id"),
                                                                     DoubleArgumentType.getDouble($$0x, "value"),
                                                                     bxd.a.c
                                                                  )
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ex.a("remove")
                                       .then(
                                          ex.a("id", fx.a())
                                             .suggests(($$0x, $$1x) -> fb.a(c(fj.a($$0x, "target"), fv.a($$0x, "attribute")), $$1x))
                                             .executes($$0x -> a((ew)$$0x.getSource(), fj.a($$0x, "target"), fv.a($$0x, "attribute"), fx.a($$0x, "id")))
                                       )
                                 ))
                              .then(
                                 ex.a("value")
                                    .then(
                                       ex.a("get")
                                          .then(
                                             ((RequiredArgumentBuilder)ex.a("id", fx.a())
                                                   .suggests(($$0x, $$1x) -> fb.a(c(fj.a($$0x, "target"), fv.a($$0x, "attribute")), $$1x))
                                                   .executes(
                                                      $$0x -> a((ew)$$0x.getSource(), fj.a($$0x, "target"), fv.a($$0x, "attribute"), fx.a($$0x, "id"), 1.0)
                                                   ))
                                                .then(
                                                   ex.a("scale", DoubleArgumentType.doubleArg())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ew)$$0x.getSource(),
                                                               fj.a($$0x, "target"),
                                                               fv.a($$0x, "attribute"),
                                                               fx.a($$0x, "id"),
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

   private static bxb a(bvb $$0, jq<bxa> $$1) throws CommandSyntaxException {
      bxb $$2 = a($$0).eY().a($$1);
      if ($$2 == null) {
         throw b.create($$0.al(), a($$1));
      } else {
         return $$2;
      }
   }

   private static bvx a(bvb $$0) throws CommandSyntaxException {
      if (!($$0 instanceof bvx)) {
         throw a.create($$0.al());
      } else {
         return (bvx)$$0;
      }
   }

   private static bvx b(bvb $$0, jq<bxa> $$1) throws CommandSyntaxException {
      bvx $$2 = a($$0);
      if (!$$2.eY().b($$1)) {
         throw b.create($$0.al(), a($$1));
      } else {
         return $$2;
      }
   }

   private static int a(ew $$0, bvb $$1, jq<bxa> $$2, double $$3) throws CommandSyntaxException {
      bvx $$4 = b($$1, $$2);
      double $$5 = $$4.h($$2);
      $$0.a(() -> xk.a("commands.attribute.value.get.success", a($$2), $$1.al(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int b(ew $$0, bvb $$1, jq<bxa> $$2, double $$3) throws CommandSyntaxException {
      bvx $$4 = b($$1, $$2);
      double $$5 = $$4.i($$2);
      $$0.a(() -> xk.a("commands.attribute.base_value.get.success", a($$2), $$1.al(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int a(ew $$0, bvb $$1, jq<bxa> $$2, alp $$3, double $$4) throws CommandSyntaxException {
      bvx $$5 = b($$1, $$2);
      bxc $$6 = $$5.eY();
      if (!$$6.a($$2, $$3)) {
         throw c.create($$1.al(), a($$2), $$3);
      } else {
         double $$7 = $$6.b($$2, $$3);
         $$0.a(() -> xk.a("commands.attribute.modifier.value.get.success", xk.a($$3), a($$2), $$1.al(), $$7), false);
         return (int)($$7 * $$4);
      }
   }

   private static Stream<alp> c(bvb $$0, jq<bxa> $$1) throws CommandSyntaxException {
      bxb $$2 = a($$0, $$1);
      return $$2.c().stream().map(bxd::b);
   }

   private static int c(ew $$0, bvb $$1, jq<bxa> $$2, double $$3) throws CommandSyntaxException {
      a($$1, $$2).a($$3);
      $$0.a(() -> xk.a("commands.attribute.base_value.set.success", a($$2), $$1.al(), $$3), false);
      return 1;
   }

   private static int a(ew $$0, bvb $$1, jq<bxa> $$2) throws CommandSyntaxException {
      bvx $$3 = a($$1);
      if (!$$3.eY().e($$2)) {
         throw b.create($$1.al(), a($$2));
      } else {
         double $$4 = $$3.i($$2);
         $$0.a(() -> xk.a("commands.attribute.base_value.reset.success", a($$2), $$1.al(), $$4), false);
         return 1;
      }
   }

   private static int a(ew $$0, bvb $$1, jq<bxa> $$2, alp $$3, double $$4, bxd.a $$5) throws CommandSyntaxException {
      bxb $$6 = a($$1, $$2);
      bxd $$7 = new bxd($$3, $$4, $$5);
      if ($$6.b($$3)) {
         throw d.create($$1.al(), a($$2), $$3);
      } else {
         $$6.d($$7);
         $$0.a(() -> xk.a("commands.attribute.modifier.add.success", xk.a($$3), a($$2), $$1.al()), false);
         return 1;
      }
   }

   private static int a(ew $$0, bvb $$1, jq<bxa> $$2, alp $$3) throws CommandSyntaxException {
      bxb $$4 = a($$1, $$2);
      if ($$4.c($$3)) {
         $$0.a(() -> xk.a("commands.attribute.modifier.remove.success", xk.a($$3), a($$2), $$1.al()), false);
         return 1;
      } else {
         throw c.create($$1.al(), a($$2), $$3);
      }
   }

   private static xk a(jq<bxa> $$0) {
      return xk.c($$0.a().c());
   }
}

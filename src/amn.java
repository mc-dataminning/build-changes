import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;

public class amn {
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

   public static void a(CommandDispatcher<eu> $$0, eq $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("attribute").requires($$0x -> $$0x.c(2)))
            .then(
               ev.a("target", fh.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ev.a("attribute", ft.a($$1, lw.c))
                              .then(
                                 ((LiteralArgumentBuilder)ev.a("get")
                                       .executes($$0x -> a((eu)$$0x.getSource(), fh.a($$0x, "target"), ft.a($$0x, "attribute"), 1.0)))
                                    .then(
                                       ev.a("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             $$0x -> a(
                                                   (eu)$$0x.getSource(),
                                                   fh.a($$0x, "target"),
                                                   ft.a($$0x, "attribute"),
                                                   DoubleArgumentType.getDouble($$0x, "scale")
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)ev.a("base")
                                    .then(
                                       ev.a("set")
                                          .then(
                                             ev.a("value", DoubleArgumentType.doubleArg())
                                                .executes(
                                                   $$0x -> c(
                                                         (eu)$$0x.getSource(),
                                                         fh.a($$0x, "target"),
                                                         ft.a($$0x, "attribute"),
                                                         DoubleArgumentType.getDouble($$0x, "value")
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)ev.a("get")
                                          .executes($$0x -> b((eu)$$0x.getSource(), fh.a($$0x, "target"), ft.a($$0x, "attribute"), 1.0)))
                                       .then(
                                          ev.a("scale", DoubleArgumentType.doubleArg())
                                             .executes(
                                                $$0x -> b(
                                                      (eu)$$0x.getSource(),
                                                      fh.a($$0x, "target"),
                                                      ft.a($$0x, "attribute"),
                                                      DoubleArgumentType.getDouble($$0x, "scale")
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("modifier")
                                    .then(
                                       ev.a("add")
                                          .then(
                                             ev.a("id", fv.a())
                                                .then(
                                                   ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ev.a("value", DoubleArgumentType.doubleArg())
                                                            .then(
                                                               ev.a("add_value")
                                                                  .executes(
                                                                     $$0x -> a(
                                                                           (eu)$$0x.getSource(),
                                                                           fh.a($$0x, "target"),
                                                                           ft.a($$0x, "attribute"),
                                                                           fv.c($$0x, "id"),
                                                                           DoubleArgumentType.getDouble($$0x, "value"),
                                                                           bvs.a.a
                                                                        )
                                                                  )
                                                            ))
                                                         .then(
                                                            ev.a("add_multiplied_base")
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (eu)$$0x.getSource(),
                                                                        fh.a($$0x, "target"),
                                                                        ft.a($$0x, "attribute"),
                                                                        fv.c($$0x, "id"),
                                                                        DoubleArgumentType.getDouble($$0x, "value"),
                                                                        bvs.a.b
                                                                     )
                                                               )
                                                         ))
                                                      .then(
                                                         ev.a("add_multiplied_total")
                                                            .executes(
                                                               $$0x -> a(
                                                                     (eu)$$0x.getSource(),
                                                                     fh.a($$0x, "target"),
                                                                     ft.a($$0x, "attribute"),
                                                                     fv.c($$0x, "id"),
                                                                     DoubleArgumentType.getDouble($$0x, "value"),
                                                                     bvs.a.c
                                                                  )
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ev.a("remove")
                                       .then(
                                          ev.a("id", fv.a())
                                             .executes($$0x -> a((eu)$$0x.getSource(), fh.a($$0x, "target"), ft.a($$0x, "attribute"), fv.c($$0x, "id")))
                                       )
                                 ))
                              .then(
                                 ev.a("value")
                                    .then(
                                       ev.a("get")
                                          .then(
                                             ((RequiredArgumentBuilder)ev.a("id", fv.a())
                                                   .executes(
                                                      $$0x -> a((eu)$$0x.getSource(), fh.a($$0x, "target"), ft.a($$0x, "attribute"), fv.c($$0x, "id"), 1.0)
                                                   ))
                                                .then(
                                                   ev.a("scale", DoubleArgumentType.doubleArg())
                                                      .executes(
                                                         $$0x -> a(
                                                               (eu)$$0x.getSource(),
                                                               fh.a($$0x, "target"),
                                                               ft.a($$0x, "attribute"),
                                                               fv.c($$0x, "id"),
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

   private static bvq a(btr $$0, jo<bvp> $$1) throws CommandSyntaxException {
      bvq $$2 = a($$0).eV().a($$1);
      if ($$2 == null) {
         throw b.create($$0.aj(), a($$1));
      } else {
         return $$2;
      }
   }

   private static bun a(btr $$0) throws CommandSyntaxException {
      if (!($$0 instanceof bun)) {
         throw a.create($$0.aj());
      } else {
         return (bun)$$0;
      }
   }

   private static bun b(btr $$0, jo<bvp> $$1) throws CommandSyntaxException {
      bun $$2 = a($$0);
      if (!$$2.eV().b($$1)) {
         throw b.create($$0.aj(), a($$1));
      } else {
         return $$2;
      }
   }

   private static int a(eu $$0, btr $$1, jo<bvp> $$2, double $$3) throws CommandSyntaxException {
      bun $$4 = b($$1, $$2);
      double $$5 = $$4.h($$2);
      $$0.a(() -> xe.a("commands.attribute.value.get.success", a($$2), $$1.aj(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int b(eu $$0, btr $$1, jo<bvp> $$2, double $$3) throws CommandSyntaxException {
      bun $$4 = b($$1, $$2);
      double $$5 = $$4.i($$2);
      $$0.a(() -> xe.a("commands.attribute.base_value.get.success", a($$2), $$1.aj(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int a(eu $$0, btr $$1, jo<bvp> $$2, ale $$3, double $$4) throws CommandSyntaxException {
      bun $$5 = b($$1, $$2);
      bvr $$6 = $$5.eV();
      if (!$$6.a($$2, $$3)) {
         throw c.create($$1.aj(), a($$2), $$3);
      } else {
         double $$7 = $$6.b($$2, $$3);
         $$0.a(() -> xe.a("commands.attribute.modifier.value.get.success", xe.a($$3), a($$2), $$1.aj(), $$7), false);
         return (int)($$7 * $$4);
      }
   }

   private static int c(eu $$0, btr $$1, jo<bvp> $$2, double $$3) throws CommandSyntaxException {
      a($$1, $$2).a($$3);
      $$0.a(() -> xe.a("commands.attribute.base_value.set.success", a($$2), $$1.aj(), $$3), false);
      return 1;
   }

   private static int a(eu $$0, btr $$1, jo<bvp> $$2, ale $$3, double $$4, bvs.a $$5) throws CommandSyntaxException {
      bvq $$6 = a($$1, $$2);
      bvs $$7 = new bvs($$3, $$4, $$5);
      if ($$6.b($$3)) {
         throw d.create($$1.aj(), a($$2), $$3);
      } else {
         $$6.d($$7);
         $$0.a(() -> xe.a("commands.attribute.modifier.add.success", xe.a($$3), a($$2), $$1.aj()), false);
         return 1;
      }
   }

   private static int a(eu $$0, btr $$1, jo<bvp> $$2, ale $$3) throws CommandSyntaxException {
      bvq $$4 = a($$1, $$2);
      if ($$4.c($$3)) {
         $$0.a(() -> xe.a("commands.attribute.modifier.remove.success", xe.a($$3), a($$2), $$1.aj()), false);
         return 1;
      } else {
         throw c.create($$1.aj(), a($$2), $$3);
      }
   }

   private static xe a(jo<bvp> $$0) {
      return xe.c($$0.a().c());
   }
}

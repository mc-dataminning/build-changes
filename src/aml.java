import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;

public class aml {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xd.b("commands.attribute.failed.entity", $$0));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xd.b("commands.attribute.failed.no_attribute", $$0, $$1)
   );
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xd.b("commands.attribute.failed.no_modifier", $$1, $$0, $$2)
   );
   private static final Dynamic3CommandExceptionType d = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xd.b("commands.attribute.failed.modifier_already_present", $$2, $$1, $$0)
   );

   public static void a(CommandDispatcher<et> $$0, ep $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("attribute").requires($$0x -> $$0x.c(2)))
            .then(
               eu.a("target", fg.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)eu.a("attribute", fs.a($$1, lv.c))
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
                                                                           bvp.a.a
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
                                                                        bvp.a.b
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
                                                                     bvp.a.c
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

   private static bvn a(bto $$0, jn<bvm> $$1) throws CommandSyntaxException {
      bvn $$2 = a($$0).eV().a($$1);
      if ($$2 == null) {
         throw b.create($$0.aj(), a($$1));
      } else {
         return $$2;
      }
   }

   private static buk a(bto $$0) throws CommandSyntaxException {
      if (!($$0 instanceof buk)) {
         throw a.create($$0.aj());
      } else {
         return (buk)$$0;
      }
   }

   private static buk b(bto $$0, jn<bvm> $$1) throws CommandSyntaxException {
      buk $$2 = a($$0);
      if (!$$2.eV().b($$1)) {
         throw b.create($$0.aj(), a($$1));
      } else {
         return $$2;
      }
   }

   private static int a(et $$0, bto $$1, jn<bvm> $$2, double $$3) throws CommandSyntaxException {
      buk $$4 = b($$1, $$2);
      double $$5 = $$4.h($$2);
      $$0.a(() -> xd.a("commands.attribute.value.get.success", a($$2), $$1.aj(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int b(et $$0, bto $$1, jn<bvm> $$2, double $$3) throws CommandSyntaxException {
      buk $$4 = b($$1, $$2);
      double $$5 = $$4.i($$2);
      $$0.a(() -> xd.a("commands.attribute.base_value.get.success", a($$2), $$1.aj(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int a(et $$0, bto $$1, jn<bvm> $$2, alc $$3, double $$4) throws CommandSyntaxException {
      buk $$5 = b($$1, $$2);
      bvo $$6 = $$5.eV();
      if (!$$6.a($$2, $$3)) {
         throw c.create($$1.aj(), a($$2), $$3);
      } else {
         double $$7 = $$6.b($$2, $$3);
         $$0.a(() -> xd.a("commands.attribute.modifier.value.get.success", xd.a($$3), a($$2), $$1.aj(), $$7), false);
         return (int)($$7 * $$4);
      }
   }

   private static int c(et $$0, bto $$1, jn<bvm> $$2, double $$3) throws CommandSyntaxException {
      a($$1, $$2).a($$3);
      $$0.a(() -> xd.a("commands.attribute.base_value.set.success", a($$2), $$1.aj(), $$3), false);
      return 1;
   }

   private static int a(et $$0, bto $$1, jn<bvm> $$2, alc $$3, double $$4, bvp.a $$5) throws CommandSyntaxException {
      bvn $$6 = a($$1, $$2);
      bvp $$7 = new bvp($$3, $$4, $$5);
      if ($$6.b($$3)) {
         throw d.create($$1.aj(), a($$2), $$3);
      } else {
         $$6.d($$7);
         $$0.a(() -> xd.a("commands.attribute.modifier.add.success", xd.a($$3), a($$2), $$1.aj()), false);
         return 1;
      }
   }

   private static int a(et $$0, bto $$1, jn<bvm> $$2, alc $$3) throws CommandSyntaxException {
      bvn $$4 = a($$1, $$2);
      if ($$4.c($$3)) {
         $$0.a(() -> xd.a("commands.attribute.modifier.remove.success", xd.a($$3), a($$2), $$1.aj()), false);
         return 1;
      } else {
         throw c.create($$1.aj(), a($$2), $$3);
      }
   }

   private static xd a(jn<bvm> $$0) {
      return xd.c($$0.a().c());
   }
}

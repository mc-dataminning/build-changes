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

public class akz {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wg.b("commands.attribute.failed.entity", $$0));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> wg.b("commands.attribute.failed.no_attribute", $$0, $$1)
   );
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> wg.b("commands.attribute.failed.no_modifier", $$1, $$0, $$2)
   );
   private static final Dynamic3CommandExceptionType d = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> wg.b("commands.attribute.failed.modifier_already_present", $$2, $$1, $$0)
   );

   public static void a(CommandDispatcher<du> $$0, dq $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("attribute").requires($$0x -> $$0x.c(2)))
            .then(
               dv.a("target", eh.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a("attribute", et.a($$1, ks.c))
                              .then(
                                 ((LiteralArgumentBuilder)dv.a("get")
                                       .executes($$0x -> a((du)$$0x.getSource(), eh.a($$0x, "target"), et.a($$0x, "attribute"), 1.0)))
                                    .then(
                                       dv.a("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             $$0x -> a(
                                                   (du)$$0x.getSource(),
                                                   eh.a($$0x, "target"),
                                                   et.a($$0x, "attribute"),
                                                   DoubleArgumentType.getDouble($$0x, "scale")
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)dv.a("base")
                                    .then(
                                       dv.a("set")
                                          .then(
                                             dv.a("value", DoubleArgumentType.doubleArg())
                                                .executes(
                                                   $$0x -> c(
                                                         (du)$$0x.getSource(),
                                                         eh.a($$0x, "target"),
                                                         et.a($$0x, "attribute"),
                                                         DoubleArgumentType.getDouble($$0x, "value")
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)dv.a("get")
                                          .executes($$0x -> b((du)$$0x.getSource(), eh.a($$0x, "target"), et.a($$0x, "attribute"), 1.0)))
                                       .then(
                                          dv.a("scale", DoubleArgumentType.doubleArg())
                                             .executes(
                                                $$0x -> b(
                                                      (du)$$0x.getSource(),
                                                      eh.a($$0x, "target"),
                                                      et.a($$0x, "attribute"),
                                                      DoubleArgumentType.getDouble($$0x, "scale")
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           ((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("modifier")
                                    .then(
                                       dv.a("add")
                                          .then(
                                             dv.a("uuid", fi.a())
                                                .then(
                                                   dv.a("name", StringArgumentType.string())
                                                      .then(
                                                         ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a("value", DoubleArgumentType.doubleArg())
                                                                  .then(
                                                                     dv.a("add_value")
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (du)$$0x.getSource(),
                                                                                 eh.a($$0x, "target"),
                                                                                 et.a($$0x, "attribute"),
                                                                                 fi.a($$0x, "uuid"),
                                                                                 StringArgumentType.getString($$0x, "name"),
                                                                                 DoubleArgumentType.getDouble($$0x, "value"),
                                                                                 brt.a.a
                                                                              )
                                                                        )
                                                                  ))
                                                               .then(
                                                                  dv.a("add_multiplied_base")
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (du)$$0x.getSource(),
                                                                              eh.a($$0x, "target"),
                                                                              et.a($$0x, "attribute"),
                                                                              fi.a($$0x, "uuid"),
                                                                              StringArgumentType.getString($$0x, "name"),
                                                                              DoubleArgumentType.getDouble($$0x, "value"),
                                                                              brt.a.b
                                                                           )
                                                                     )
                                                               ))
                                                            .then(
                                                               dv.a("add_multiplied_total")
                                                                  .executes(
                                                                     $$0x -> a(
                                                                           (du)$$0x.getSource(),
                                                                           eh.a($$0x, "target"),
                                                                           et.a($$0x, "attribute"),
                                                                           fi.a($$0x, "uuid"),
                                                                           StringArgumentType.getString($$0x, "name"),
                                                                           DoubleArgumentType.getDouble($$0x, "value"),
                                                                           brt.a.c
                                                                        )
                                                                  )
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    dv.a("remove")
                                       .then(
                                          dv.a("uuid", fi.a())
                                             .executes($$0x -> a((du)$$0x.getSource(), eh.a($$0x, "target"), et.a($$0x, "attribute"), fi.a($$0x, "uuid")))
                                       )
                                 ))
                              .then(
                                 dv.a("value")
                                    .then(
                                       dv.a("get")
                                          .then(
                                             ((RequiredArgumentBuilder)dv.a("uuid", fi.a())
                                                   .executes(
                                                      $$0x -> a((du)$$0x.getSource(), eh.a($$0x, "target"), et.a($$0x, "attribute"), fi.a($$0x, "uuid"), 1.0)
                                                   ))
                                                .then(
                                                   dv.a("scale", DoubleArgumentType.doubleArg())
                                                      .executes(
                                                         $$0x -> a(
                                                               (du)$$0x.getSource(),
                                                               eh.a($$0x, "target"),
                                                               et.a($$0x, "attribute"),
                                                               fi.a($$0x, "uuid"),
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

   private static brr a(bpv $$0, il<brq> $$1) throws CommandSyntaxException {
      brr $$2 = a($$0).eT().a($$1);
      if ($$2 == null) {
         throw b.create($$0.ad(), a($$1));
      } else {
         return $$2;
      }
   }

   private static bqo a(bpv $$0) throws CommandSyntaxException {
      if (!($$0 instanceof bqo)) {
         throw a.create($$0.ad());
      } else {
         return (bqo)$$0;
      }
   }

   private static bqo b(bpv $$0, il<brq> $$1) throws CommandSyntaxException {
      bqo $$2 = a($$0);
      if (!$$2.eT().b($$1)) {
         throw b.create($$0.ad(), a($$1));
      } else {
         return $$2;
      }
   }

   private static int a(du $$0, bpv $$1, il<brq> $$2, double $$3) throws CommandSyntaxException {
      bqo $$4 = b($$1, $$2);
      double $$5 = $$4.g($$2);
      $$0.a(() -> wg.a("commands.attribute.value.get.success", a($$2), $$1.ad(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int b(du $$0, bpv $$1, il<brq> $$2, double $$3) throws CommandSyntaxException {
      bqo $$4 = b($$1, $$2);
      double $$5 = $$4.h($$2);
      $$0.a(() -> wg.a("commands.attribute.base_value.get.success", a($$2), $$1.ad(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int a(du $$0, bpv $$1, il<brq> $$2, UUID $$3, double $$4) throws CommandSyntaxException {
      bqo $$5 = b($$1, $$2);
      brs $$6 = $$5.eT();
      if (!$$6.a($$2, $$3)) {
         throw c.create($$1.ad(), a($$2), $$3);
      } else {
         double $$7 = $$6.b($$2, $$3);
         $$0.a(() -> wg.a("commands.attribute.modifier.value.get.success", wg.a($$3), a($$2), $$1.ad(), $$7), false);
         return (int)($$7 * $$4);
      }
   }

   private static int c(du $$0, bpv $$1, il<brq> $$2, double $$3) throws CommandSyntaxException {
      a($$1, $$2).a($$3);
      $$0.a(() -> wg.a("commands.attribute.base_value.set.success", a($$2), $$1.ad(), $$3), false);
      return 1;
   }

   private static int a(du $$0, bpv $$1, il<brq> $$2, UUID $$3, String $$4, double $$5, brt.a $$6) throws CommandSyntaxException {
      brr $$7 = a($$1, $$2);
      brt $$8 = new brt($$3, $$4, $$5, $$6);
      if ($$7.a($$8)) {
         throw d.create($$1.ad(), a($$2), $$3);
      } else {
         $$7.d($$8);
         $$0.a(() -> wg.a("commands.attribute.modifier.add.success", wg.a($$3), a($$2), $$1.ad()), false);
         return 1;
      }
   }

   private static int a(du $$0, bpv $$1, il<brq> $$2, UUID $$3) throws CommandSyntaxException {
      brr $$4 = a($$1, $$2);
      if ($$4.c($$3)) {
         $$0.a(() -> wg.a("commands.attribute.modifier.remove.success", wg.a($$3), a($$2), $$1.ad()), false);
         return 1;
      } else {
         throw c.create($$1.ad(), a($$2), $$3);
      }
   }

   private static wg a(il<brq> $$0) {
      return wg.c($$0.a().c());
   }
}

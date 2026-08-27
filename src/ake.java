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

public class ake {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> vq.b("commands.attribute.failed.entity", $$0));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> vq.b("commands.attribute.failed.no_attribute", $$0, $$1)
   );
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> vq.b("commands.attribute.failed.no_modifier", $$1, $$0, $$2)
   );
   private static final Dynamic3CommandExceptionType d = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> vq.b("commands.attribute.failed.modifier_already_present", $$2, $$1, $$0)
   );

   public static void a(CommandDispatcher<du> $$0, dq $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("attribute").requires($$0x -> $$0x.c(2)))
            .then(
               dv.a("target", eh.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a("attribute", et.a($$1, kg.c))
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
                                                                     dv.a("add")
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (du)$$0x.getSource(),
                                                                                 eh.a($$0x, "target"),
                                                                                 et.a($$0x, "attribute"),
                                                                                 fi.a($$0x, "uuid"),
                                                                                 StringArgumentType.getString($$0x, "name"),
                                                                                 DoubleArgumentType.getDouble($$0x, "value"),
                                                                                 bpj.a.a
                                                                              )
                                                                        )
                                                                  ))
                                                               .then(
                                                                  dv.a("multiply")
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (du)$$0x.getSource(),
                                                                              eh.a($$0x, "target"),
                                                                              et.a($$0x, "attribute"),
                                                                              fi.a($$0x, "uuid"),
                                                                              StringArgumentType.getString($$0x, "name"),
                                                                              DoubleArgumentType.getDouble($$0x, "value"),
                                                                              bpj.a.c
                                                                           )
                                                                     )
                                                               ))
                                                            .then(
                                                               dv.a("multiply_base")
                                                                  .executes(
                                                                     $$0x -> a(
                                                                           (du)$$0x.getSource(),
                                                                           eh.a($$0x, "target"),
                                                                           et.a($$0x, "attribute"),
                                                                           fi.a($$0x, "uuid"),
                                                                           StringArgumentType.getString($$0x, "name"),
                                                                           DoubleArgumentType.getDouble($$0x, "value"),
                                                                           bpj.a.b
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

   private static bph a(bno $$0, ij<bpg> $$1) throws CommandSyntaxException {
      bph $$2 = a($$0).eS().a($$1);
      if ($$2 == null) {
         throw b.create($$0.ad(), a($$1));
      } else {
         return $$2;
      }
   }

   private static bog a(bno $$0) throws CommandSyntaxException {
      if (!($$0 instanceof bog)) {
         throw a.create($$0.ad());
      } else {
         return (bog)$$0;
      }
   }

   private static bog b(bno $$0, ij<bpg> $$1) throws CommandSyntaxException {
      bog $$2 = a($$0);
      if (!$$2.eS().b($$1)) {
         throw b.create($$0.ad(), a($$1));
      } else {
         return $$2;
      }
   }

   private static int a(du $$0, bno $$1, ij<bpg> $$2, double $$3) throws CommandSyntaxException {
      bog $$4 = b($$1, $$2);
      double $$5 = $$4.g($$2);
      $$0.a(() -> vq.a("commands.attribute.value.get.success", a($$2), $$1.ad(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int b(du $$0, bno $$1, ij<bpg> $$2, double $$3) throws CommandSyntaxException {
      bog $$4 = b($$1, $$2);
      double $$5 = $$4.h($$2);
      $$0.a(() -> vq.a("commands.attribute.base_value.get.success", a($$2), $$1.ad(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int a(du $$0, bno $$1, ij<bpg> $$2, UUID $$3, double $$4) throws CommandSyntaxException {
      bog $$5 = b($$1, $$2);
      bpi $$6 = $$5.eS();
      if (!$$6.a($$2, $$3)) {
         throw c.create($$1.ad(), a($$2), $$3);
      } else {
         double $$7 = $$6.b($$2, $$3);
         $$0.a(() -> vq.a("commands.attribute.modifier.value.get.success", vq.a($$3), a($$2), $$1.ad(), $$7), false);
         return (int)($$7 * $$4);
      }
   }

   private static int c(du $$0, bno $$1, ij<bpg> $$2, double $$3) throws CommandSyntaxException {
      a($$1, $$2).a($$3);
      $$0.a(() -> vq.a("commands.attribute.base_value.set.success", a($$2), $$1.ad(), $$3), false);
      return 1;
   }

   private static int a(du $$0, bno $$1, ij<bpg> $$2, UUID $$3, String $$4, double $$5, bpj.a $$6) throws CommandSyntaxException {
      bph $$7 = a($$1, $$2);
      bpj $$8 = new bpj($$3, $$4, $$5, $$6);
      if ($$7.a($$8)) {
         throw d.create($$1.ad(), a($$2), $$3);
      } else {
         $$7.d($$8);
         $$0.a(() -> vq.a("commands.attribute.modifier.add.success", vq.a($$3), a($$2), $$1.ad()), false);
         return 1;
      }
   }

   private static int a(du $$0, bno $$1, ij<bpg> $$2, UUID $$3) throws CommandSyntaxException {
      bph $$4 = a($$1, $$2);
      if ($$4.c($$3)) {
         $$0.a(() -> vq.a("commands.attribute.modifier.remove.success", vq.a($$3), a($$2), $$1.ad()), false);
         return 1;
      } else {
         throw c.create($$1.ad(), a($$2), $$3);
      }
   }

   private static vq a(ij<bpg> $$0) {
      return vq.c($$0.a().c());
   }
}

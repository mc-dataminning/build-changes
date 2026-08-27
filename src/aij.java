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

public class aij {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> vd.b("commands.attribute.failed.entity", $$0));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> vd.b("commands.attribute.failed.no_attribute", $$0, $$1)
   );
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> vd.b("commands.attribute.failed.no_modifier", $$1, $$0, $$2)
   );
   private static final Dynamic3CommandExceptionType d = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> vd.b("commands.attribute.failed.modifier_already_present", $$2, $$1, $$0)
   );

   public static void a(CommandDispatcher<ds> $$0, dn $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("attribute").requires($$0x -> $$0x.c(2)))
            .then(
               dt.a("target", ef.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("attribute", er.a($$1, ke.c))
                              .then(
                                 ((LiteralArgumentBuilder)dt.a("get")
                                       .executes($$0x -> a((ds)$$0x.getSource(), ef.a($$0x, "target"), er.a($$0x, "attribute"), 1.0)))
                                    .then(
                                       dt.a("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             $$0x -> a(
                                                   (ds)$$0x.getSource(),
                                                   ef.a($$0x, "target"),
                                                   er.a($$0x, "attribute"),
                                                   DoubleArgumentType.getDouble($$0x, "scale")
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)dt.a("base")
                                    .then(
                                       dt.a("set")
                                          .then(
                                             dt.a("value", DoubleArgumentType.doubleArg())
                                                .executes(
                                                   $$0x -> c(
                                                         (ds)$$0x.getSource(),
                                                         ef.a($$0x, "target"),
                                                         er.a($$0x, "attribute"),
                                                         DoubleArgumentType.getDouble($$0x, "value")
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)dt.a("get")
                                          .executes($$0x -> b((ds)$$0x.getSource(), ef.a($$0x, "target"), er.a($$0x, "attribute"), 1.0)))
                                       .then(
                                          dt.a("scale", DoubleArgumentType.doubleArg())
                                             .executes(
                                                $$0x -> b(
                                                      (ds)$$0x.getSource(),
                                                      ef.a($$0x, "target"),
                                                      er.a($$0x, "attribute"),
                                                      DoubleArgumentType.getDouble($$0x, "scale")
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           ((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("modifier")
                                    .then(
                                       dt.a("add")
                                          .then(
                                             dt.a("uuid", fg.a())
                                                .then(
                                                   dt.a("name", StringArgumentType.string())
                                                      .then(
                                                         ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("value", DoubleArgumentType.doubleArg())
                                                                  .then(
                                                                     dt.a("add")
                                                                        .executes(
                                                                           $$0x -> a(
                                                                                 (ds)$$0x.getSource(),
                                                                                 ef.a($$0x, "target"),
                                                                                 er.a($$0x, "attribute"),
                                                                                 fg.a($$0x, "uuid"),
                                                                                 StringArgumentType.getString($$0x, "name"),
                                                                                 DoubleArgumentType.getDouble($$0x, "value"),
                                                                                 bnj.a.a
                                                                              )
                                                                        )
                                                                  ))
                                                               .then(
                                                                  dt.a("multiply")
                                                                     .executes(
                                                                        $$0x -> a(
                                                                              (ds)$$0x.getSource(),
                                                                              ef.a($$0x, "target"),
                                                                              er.a($$0x, "attribute"),
                                                                              fg.a($$0x, "uuid"),
                                                                              StringArgumentType.getString($$0x, "name"),
                                                                              DoubleArgumentType.getDouble($$0x, "value"),
                                                                              bnj.a.c
                                                                           )
                                                                     )
                                                               ))
                                                            .then(
                                                               dt.a("multiply_base")
                                                                  .executes(
                                                                     $$0x -> a(
                                                                           (ds)$$0x.getSource(),
                                                                           ef.a($$0x, "target"),
                                                                           er.a($$0x, "attribute"),
                                                                           fg.a($$0x, "uuid"),
                                                                           StringArgumentType.getString($$0x, "name"),
                                                                           DoubleArgumentType.getDouble($$0x, "value"),
                                                                           bnj.a.b
                                                                        )
                                                                  )
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    dt.a("remove")
                                       .then(
                                          dt.a("uuid", fg.a())
                                             .executes($$0x -> a((ds)$$0x.getSource(), ef.a($$0x, "target"), er.a($$0x, "attribute"), fg.a($$0x, "uuid")))
                                       )
                                 ))
                              .then(
                                 dt.a("value")
                                    .then(
                                       dt.a("get")
                                          .then(
                                             ((RequiredArgumentBuilder)dt.a("uuid", fg.a())
                                                   .executes(
                                                      $$0x -> a((ds)$$0x.getSource(), ef.a($$0x, "target"), er.a($$0x, "attribute"), fg.a($$0x, "uuid"), 1.0)
                                                   ))
                                                .then(
                                                   dt.a("scale", DoubleArgumentType.doubleArg())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ds)$$0x.getSource(),
                                                               ef.a($$0x, "target"),
                                                               er.a($$0x, "attribute"),
                                                               fg.a($$0x, "uuid"),
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

   private static bnh a(blp $$0, ih<bng> $$1) throws CommandSyntaxException {
      bnh $$2 = a($$0).eR().a($$1);
      if ($$2 == null) {
         throw b.create($$0.ad(), a($$1));
      } else {
         return $$2;
      }
   }

   private static bmf a(blp $$0) throws CommandSyntaxException {
      if (!($$0 instanceof bmf)) {
         throw a.create($$0.ad());
      } else {
         return (bmf)$$0;
      }
   }

   private static bmf b(blp $$0, ih<bng> $$1) throws CommandSyntaxException {
      bmf $$2 = a($$0);
      if (!$$2.eR().b($$1)) {
         throw b.create($$0.ad(), a($$1));
      } else {
         return $$2;
      }
   }

   private static int a(ds $$0, blp $$1, ih<bng> $$2, double $$3) throws CommandSyntaxException {
      bmf $$4 = b($$1, $$2);
      double $$5 = $$4.a($$2);
      $$0.a(() -> vd.a("commands.attribute.value.get.success", a($$2), $$1.ad(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int b(ds $$0, blp $$1, ih<bng> $$2, double $$3) throws CommandSyntaxException {
      bmf $$4 = b($$1, $$2);
      double $$5 = $$4.b($$2);
      $$0.a(() -> vd.a("commands.attribute.base_value.get.success", a($$2), $$1.ad(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int a(ds $$0, blp $$1, ih<bng> $$2, UUID $$3, double $$4) throws CommandSyntaxException {
      bmf $$5 = b($$1, $$2);
      bni $$6 = $$5.eR();
      if (!$$6.a($$2, $$3)) {
         throw c.create($$1.ad(), a($$2), $$3);
      } else {
         double $$7 = $$6.b($$2, $$3);
         $$0.a(() -> vd.a("commands.attribute.modifier.value.get.success", vd.a($$3), a($$2), $$1.ad(), $$7), false);
         return (int)($$7 * $$4);
      }
   }

   private static int c(ds $$0, blp $$1, ih<bng> $$2, double $$3) throws CommandSyntaxException {
      a($$1, $$2).a($$3);
      $$0.a(() -> vd.a("commands.attribute.base_value.set.success", a($$2), $$1.ad(), $$3), false);
      return 1;
   }

   private static int a(ds $$0, blp $$1, ih<bng> $$2, UUID $$3, String $$4, double $$5, bnj.a $$6) throws CommandSyntaxException {
      bnh $$7 = a($$1, $$2);
      bnj $$8 = new bnj($$3, $$4, $$5, $$6);
      if ($$7.a($$8)) {
         throw d.create($$1.ad(), a($$2), $$3);
      } else {
         $$7.c($$8);
         $$0.a(() -> vd.a("commands.attribute.modifier.add.success", vd.a($$3), a($$2), $$1.ad()), false);
         return 1;
      }
   }

   private static int a(ds $$0, blp $$1, ih<bng> $$2, UUID $$3) throws CommandSyntaxException {
      bnh $$4 = a($$1, $$2);
      if ($$4.c($$3)) {
         $$0.a(() -> vd.a("commands.attribute.modifier.remove.success", vd.a($$3), a($$2), $$1.ad()), false);
         return 1;
      } else {
         throw c.create($$1.ad(), a($$2), $$3);
      }
   }

   private static vd a(ih<bng> $$0) {
      return vd.c($$0.a().c());
   }
}

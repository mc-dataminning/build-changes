import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.stream.Stream;

public class amp {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wy.b("commands.attribute.failed.entity", $$0));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> wy.b("commands.attribute.failed.no_attribute", $$0, $$1)
   );
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> wy.b("commands.attribute.failed.no_modifier", $$1, $$0, $$2)
   );
   private static final Dynamic3CommandExceptionType d = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> wy.b("commands.attribute.failed.modifier_already_present", $$2, $$1, $$0)
   );

   public static void a(CommandDispatcher<ej> $$0, ef $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("attribute").requires($$0x -> $$0x.c(2)))
            .then(
               ek.a("target", ew.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ek.a("attribute", fi.a($$1, mh.c))
                              .then(
                                 ((LiteralArgumentBuilder)ek.a("get")
                                       .executes($$0x -> a((ej)$$0x.getSource(), ew.a($$0x, "target"), fi.a($$0x, "attribute"), 1.0)))
                                    .then(
                                       ek.a("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             $$0x -> a(
                                                   (ej)$$0x.getSource(),
                                                   ew.a($$0x, "target"),
                                                   fi.a($$0x, "attribute"),
                                                   DoubleArgumentType.getDouble($$0x, "scale")
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("base")
                                       .then(
                                          ek.a("set")
                                             .then(
                                                ek.a("value", DoubleArgumentType.doubleArg())
                                                   .executes(
                                                      $$0x -> c(
                                                            (ej)$$0x.getSource(),
                                                            ew.a($$0x, "target"),
                                                            fi.a($$0x, "attribute"),
                                                            DoubleArgumentType.getDouble($$0x, "value")
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       ((LiteralArgumentBuilder)ek.a("get")
                                             .executes($$0x -> b((ej)$$0x.getSource(), ew.a($$0x, "target"), fi.a($$0x, "attribute"), 1.0)))
                                          .then(
                                             ek.a("scale", DoubleArgumentType.doubleArg())
                                                .executes(
                                                   $$0x -> b(
                                                         (ej)$$0x.getSource(),
                                                         ew.a($$0x, "target"),
                                                         fi.a($$0x, "attribute"),
                                                         DoubleArgumentType.getDouble($$0x, "scale")
                                                      )
                                                )
                                          )
                                    ))
                                 .then(ek.a("reset").executes($$0x -> a((ej)$$0x.getSource(), ew.a($$0x, "target"), fi.a($$0x, "attribute"))))
                           ))
                        .then(
                           ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("modifier")
                                    .then(
                                       ek.a("add")
                                          .then(
                                             ek.a("id", fk.a())
                                                .then(
                                                   ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ek.a("value", DoubleArgumentType.doubleArg())
                                                            .then(
                                                               ek.a("add_value")
                                                                  .executes(
                                                                     $$0x -> a(
                                                                           (ej)$$0x.getSource(),
                                                                           ew.a($$0x, "target"),
                                                                           fi.a($$0x, "attribute"),
                                                                           fk.a($$0x, "id"),
                                                                           DoubleArgumentType.getDouble($$0x, "value"),
                                                                           byn.a.a
                                                                        )
                                                                  )
                                                            ))
                                                         .then(
                                                            ek.a("add_multiplied_base")
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (ej)$$0x.getSource(),
                                                                        ew.a($$0x, "target"),
                                                                        fi.a($$0x, "attribute"),
                                                                        fk.a($$0x, "id"),
                                                                        DoubleArgumentType.getDouble($$0x, "value"),
                                                                        byn.a.b
                                                                     )
                                                               )
                                                         ))
                                                      .then(
                                                         ek.a("add_multiplied_total")
                                                            .executes(
                                                               $$0x -> a(
                                                                     (ej)$$0x.getSource(),
                                                                     ew.a($$0x, "target"),
                                                                     fi.a($$0x, "attribute"),
                                                                     fk.a($$0x, "id"),
                                                                     DoubleArgumentType.getDouble($$0x, "value"),
                                                                     byn.a.c
                                                                  )
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ek.a("remove")
                                       .then(
                                          ek.a("id", fk.a())
                                             .suggests(($$0x, $$1x) -> eo.a(c(ew.a($$0x, "target"), fi.a($$0x, "attribute")), $$1x))
                                             .executes($$0x -> a((ej)$$0x.getSource(), ew.a($$0x, "target"), fi.a($$0x, "attribute"), fk.a($$0x, "id")))
                                       )
                                 ))
                              .then(
                                 ek.a("value")
                                    .then(
                                       ek.a("get")
                                          .then(
                                             ((RequiredArgumentBuilder)ek.a("id", fk.a())
                                                   .suggests(($$0x, $$1x) -> eo.a(c(ew.a($$0x, "target"), fi.a($$0x, "attribute")), $$1x))
                                                   .executes(
                                                      $$0x -> a((ej)$$0x.getSource(), ew.a($$0x, "target"), fi.a($$0x, "attribute"), fk.a($$0x, "id"), 1.0)
                                                   ))
                                                .then(
                                                   ek.a("scale", DoubleArgumentType.doubleArg())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ej)$$0x.getSource(),
                                                               ew.a($$0x, "target"),
                                                               fi.a($$0x, "attribute"),
                                                               fk.a($$0x, "id"),
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

   private static byl a(bwi $$0, jf<byk> $$1) throws CommandSyntaxException {
      byl $$2 = a($$0).eZ().a($$1);
      if ($$2 == null) {
         throw b.create($$0.ai(), a($$1));
      } else {
         return $$2;
      }
   }

   private static bxj a(bwi $$0) throws CommandSyntaxException {
      if (!($$0 instanceof bxj)) {
         throw a.create($$0.ai());
      } else {
         return (bxj)$$0;
      }
   }

   private static bxj b(bwi $$0, jf<byk> $$1) throws CommandSyntaxException {
      bxj $$2 = a($$0);
      if (!$$2.eZ().b($$1)) {
         throw b.create($$0.ai(), a($$1));
      } else {
         return $$2;
      }
   }

   private static int a(ej $$0, bwi $$1, jf<byk> $$2, double $$3) throws CommandSyntaxException {
      bxj $$4 = b($$1, $$2);
      double $$5 = $$4.h($$2);
      $$0.a(() -> wy.a("commands.attribute.value.get.success", a($$2), $$1.ai(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int b(ej $$0, bwi $$1, jf<byk> $$2, double $$3) throws CommandSyntaxException {
      bxj $$4 = b($$1, $$2);
      double $$5 = $$4.i($$2);
      $$0.a(() -> wy.a("commands.attribute.base_value.get.success", a($$2), $$1.ai(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int a(ej $$0, bwi $$1, jf<byk> $$2, alg $$3, double $$4) throws CommandSyntaxException {
      bxj $$5 = b($$1, $$2);
      bym $$6 = $$5.eZ();
      if (!$$6.a($$2, $$3)) {
         throw c.create($$1.ai(), a($$2), $$3);
      } else {
         double $$7 = $$6.b($$2, $$3);
         $$0.a(() -> wy.a("commands.attribute.modifier.value.get.success", wy.a($$3), a($$2), $$1.ai(), $$7), false);
         return (int)($$7 * $$4);
      }
   }

   private static Stream<alg> c(bwi $$0, jf<byk> $$1) throws CommandSyntaxException {
      byl $$2 = a($$0, $$1);
      return $$2.c().stream().map(byn::a);
   }

   private static int c(ej $$0, bwi $$1, jf<byk> $$2, double $$3) throws CommandSyntaxException {
      a($$1, $$2).a($$3);
      $$0.a(() -> wy.a("commands.attribute.base_value.set.success", a($$2), $$1.ai(), $$3), false);
      return 1;
   }

   private static int a(ej $$0, bwi $$1, jf<byk> $$2) throws CommandSyntaxException {
      bxj $$3 = a($$1);
      if (!$$3.eZ().e($$2)) {
         throw b.create($$1.ai(), a($$2));
      } else {
         double $$4 = $$3.i($$2);
         $$0.a(() -> wy.a("commands.attribute.base_value.reset.success", a($$2), $$1.ai(), $$4), false);
         return 1;
      }
   }

   private static int a(ej $$0, bwi $$1, jf<byk> $$2, alg $$3, double $$4, byn.a $$5) throws CommandSyntaxException {
      byl $$6 = a($$1, $$2);
      byn $$7 = new byn($$3, $$4, $$5);
      if ($$6.b($$3)) {
         throw d.create($$1.ai(), a($$2), $$3);
      } else {
         $$6.d($$7);
         $$0.a(() -> wy.a("commands.attribute.modifier.add.success", wy.a($$3), a($$2), $$1.ai()), false);
         return 1;
      }
   }

   private static int a(ej $$0, bwi $$1, jf<byk> $$2, alg $$3) throws CommandSyntaxException {
      byl $$4 = a($$1, $$2);
      if ($$4.c($$3)) {
         $$0.a(() -> wy.a("commands.attribute.modifier.remove.success", wy.a($$3), a($$2), $$1.ai()), false);
         return 1;
      } else {
         throw c.create($$1.ai(), a($$2), $$3);
      }
   }

   private static wy a(jf<byk> $$0) {
      return wy.c($$0.a().c());
   }
}

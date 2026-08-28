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

   public static void a(CommandDispatcher<ei> $$0, ee $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("attribute").requires($$0x -> $$0x.c(2)))
            .then(
               ej.a("target", ev.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ej.a("attribute", fh.a($$1, mg.c))
                              .then(
                                 ((LiteralArgumentBuilder)ej.a("get")
                                       .executes($$0x -> a((ei)$$0x.getSource(), ev.a($$0x, "target"), fh.a($$0x, "attribute"), 1.0)))
                                    .then(
                                       ej.a("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             $$0x -> a(
                                                   (ei)$$0x.getSource(),
                                                   ev.a($$0x, "target"),
                                                   fh.a($$0x, "attribute"),
                                                   DoubleArgumentType.getDouble($$0x, "scale")
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("base")
                                       .then(
                                          ej.a("set")
                                             .then(
                                                ej.a("value", DoubleArgumentType.doubleArg())
                                                   .executes(
                                                      $$0x -> c(
                                                            (ei)$$0x.getSource(),
                                                            ev.a($$0x, "target"),
                                                            fh.a($$0x, "attribute"),
                                                            DoubleArgumentType.getDouble($$0x, "value")
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       ((LiteralArgumentBuilder)ej.a("get")
                                             .executes($$0x -> b((ei)$$0x.getSource(), ev.a($$0x, "target"), fh.a($$0x, "attribute"), 1.0)))
                                          .then(
                                             ej.a("scale", DoubleArgumentType.doubleArg())
                                                .executes(
                                                   $$0x -> b(
                                                         (ei)$$0x.getSource(),
                                                         ev.a($$0x, "target"),
                                                         fh.a($$0x, "attribute"),
                                                         DoubleArgumentType.getDouble($$0x, "scale")
                                                      )
                                                )
                                          )
                                    ))
                                 .then(ej.a("reset").executes($$0x -> a((ei)$$0x.getSource(), ev.a($$0x, "target"), fh.a($$0x, "attribute"))))
                           ))
                        .then(
                           ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("modifier")
                                    .then(
                                       ej.a("add")
                                          .then(
                                             ej.a("id", fj.a())
                                                .then(
                                                   ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ej.a("value", DoubleArgumentType.doubleArg())
                                                            .then(
                                                               ej.a("add_value")
                                                                  .executes(
                                                                     $$0x -> a(
                                                                           (ei)$$0x.getSource(),
                                                                           ev.a($$0x, "target"),
                                                                           fh.a($$0x, "attribute"),
                                                                           fj.a($$0x, "id"),
                                                                           DoubleArgumentType.getDouble($$0x, "value"),
                                                                           byi.a.a
                                                                        )
                                                                  )
                                                            ))
                                                         .then(
                                                            ej.a("add_multiplied_base")
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (ei)$$0x.getSource(),
                                                                        ev.a($$0x, "target"),
                                                                        fh.a($$0x, "attribute"),
                                                                        fj.a($$0x, "id"),
                                                                        DoubleArgumentType.getDouble($$0x, "value"),
                                                                        byi.a.b
                                                                     )
                                                               )
                                                         ))
                                                      .then(
                                                         ej.a("add_multiplied_total")
                                                            .executes(
                                                               $$0x -> a(
                                                                     (ei)$$0x.getSource(),
                                                                     ev.a($$0x, "target"),
                                                                     fh.a($$0x, "attribute"),
                                                                     fj.a($$0x, "id"),
                                                                     DoubleArgumentType.getDouble($$0x, "value"),
                                                                     byi.a.c
                                                                  )
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ej.a("remove")
                                       .then(
                                          ej.a("id", fj.a())
                                             .suggests(($$0x, $$1x) -> en.a(c(ev.a($$0x, "target"), fh.a($$0x, "attribute")), $$1x))
                                             .executes($$0x -> a((ei)$$0x.getSource(), ev.a($$0x, "target"), fh.a($$0x, "attribute"), fj.a($$0x, "id")))
                                       )
                                 ))
                              .then(
                                 ej.a("value")
                                    .then(
                                       ej.a("get")
                                          .then(
                                             ((RequiredArgumentBuilder)ej.a("id", fj.a())
                                                   .suggests(($$0x, $$1x) -> en.a(c(ev.a($$0x, "target"), fh.a($$0x, "attribute")), $$1x))
                                                   .executes(
                                                      $$0x -> a((ei)$$0x.getSource(), ev.a($$0x, "target"), fh.a($$0x, "attribute"), fj.a($$0x, "id"), 1.0)
                                                   ))
                                                .then(
                                                   ej.a("scale", DoubleArgumentType.doubleArg())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ei)$$0x.getSource(),
                                                               ev.a($$0x, "target"),
                                                               fh.a($$0x, "attribute"),
                                                               fj.a($$0x, "id"),
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

   private static byg a(bwf $$0, je<byf> $$1) throws CommandSyntaxException {
      byg $$2 = a($$0).fa().a($$1);
      if ($$2 == null) {
         throw b.create($$0.al(), a($$1));
      } else {
         return $$2;
      }
   }

   private static bxe a(bwf $$0) throws CommandSyntaxException {
      if (!($$0 instanceof bxe)) {
         throw a.create($$0.al());
      } else {
         return (bxe)$$0;
      }
   }

   private static bxe b(bwf $$0, je<byf> $$1) throws CommandSyntaxException {
      bxe $$2 = a($$0);
      if (!$$2.fa().b($$1)) {
         throw b.create($$0.al(), a($$1));
      } else {
         return $$2;
      }
   }

   private static int a(ei $$0, bwf $$1, je<byf> $$2, double $$3) throws CommandSyntaxException {
      bxe $$4 = b($$1, $$2);
      double $$5 = $$4.h($$2);
      $$0.a(() -> wy.a("commands.attribute.value.get.success", a($$2), $$1.al(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int b(ei $$0, bwf $$1, je<byf> $$2, double $$3) throws CommandSyntaxException {
      bxe $$4 = b($$1, $$2);
      double $$5 = $$4.i($$2);
      $$0.a(() -> wy.a("commands.attribute.base_value.get.success", a($$2), $$1.al(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int a(ei $$0, bwf $$1, je<byf> $$2, alg $$3, double $$4) throws CommandSyntaxException {
      bxe $$5 = b($$1, $$2);
      byh $$6 = $$5.fa();
      if (!$$6.a($$2, $$3)) {
         throw c.create($$1.al(), a($$2), $$3);
      } else {
         double $$7 = $$6.b($$2, $$3);
         $$0.a(() -> wy.a("commands.attribute.modifier.value.get.success", wy.a($$3), a($$2), $$1.al(), $$7), false);
         return (int)($$7 * $$4);
      }
   }

   private static Stream<alg> c(bwf $$0, je<byf> $$1) throws CommandSyntaxException {
      byg $$2 = a($$0, $$1);
      return $$2.c().stream().map(byi::a);
   }

   private static int c(ei $$0, bwf $$1, je<byf> $$2, double $$3) throws CommandSyntaxException {
      a($$1, $$2).a($$3);
      $$0.a(() -> wy.a("commands.attribute.base_value.set.success", a($$2), $$1.al(), $$3), false);
      return 1;
   }

   private static int a(ei $$0, bwf $$1, je<byf> $$2) throws CommandSyntaxException {
      bxe $$3 = a($$1);
      if (!$$3.fa().e($$2)) {
         throw b.create($$1.al(), a($$2));
      } else {
         double $$4 = $$3.i($$2);
         $$0.a(() -> wy.a("commands.attribute.base_value.reset.success", a($$2), $$1.al(), $$4), false);
         return 1;
      }
   }

   private static int a(ei $$0, bwf $$1, je<byf> $$2, alg $$3, double $$4, byi.a $$5) throws CommandSyntaxException {
      byg $$6 = a($$1, $$2);
      byi $$7 = new byi($$3, $$4, $$5);
      if ($$6.b($$3)) {
         throw d.create($$1.al(), a($$2), $$3);
      } else {
         $$6.d($$7);
         $$0.a(() -> wy.a("commands.attribute.modifier.add.success", wy.a($$3), a($$2), $$1.al()), false);
         return 1;
      }
   }

   private static int a(ei $$0, bwf $$1, je<byf> $$2, alg $$3) throws CommandSyntaxException {
      byg $$4 = a($$1, $$2);
      if ($$4.c($$3)) {
         $$0.a(() -> wy.a("commands.attribute.modifier.remove.success", wy.a($$3), a($$2), $$1.al()), false);
         return 1;
      } else {
         throw c.create($$1.al(), a($$2), $$3);
      }
   }

   private static wy a(je<byf> $$0) {
      return wy.c($$0.a().c());
   }
}

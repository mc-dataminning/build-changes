import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.stream.Stream;

public class amn {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> ww.b("commands.attribute.failed.entity", $$0));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> ww.b("commands.attribute.failed.no_attribute", $$0, $$1)
   );
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> ww.b("commands.attribute.failed.no_modifier", $$1, $$0, $$2)
   );
   private static final Dynamic3CommandExceptionType d = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> ww.b("commands.attribute.failed.modifier_already_present", $$2, $$1, $$0)
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
                                                                           byd.a.a
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
                                                                        byd.a.b
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
                                                                     byd.a.c
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

   private static byb a(bwa $$0, je<bya> $$1) throws CommandSyntaxException {
      byb $$2 = a($$0).eZ().a($$1);
      if ($$2 == null) {
         throw b.create($$0.al(), a($$1));
      } else {
         return $$2;
      }
   }

   private static bwz a(bwa $$0) throws CommandSyntaxException {
      if (!($$0 instanceof bwz)) {
         throw a.create($$0.al());
      } else {
         return (bwz)$$0;
      }
   }

   private static bwz b(bwa $$0, je<bya> $$1) throws CommandSyntaxException {
      bwz $$2 = a($$0);
      if (!$$2.eZ().b($$1)) {
         throw b.create($$0.al(), a($$1));
      } else {
         return $$2;
      }
   }

   private static int a(ei $$0, bwa $$1, je<bya> $$2, double $$3) throws CommandSyntaxException {
      bwz $$4 = b($$1, $$2);
      double $$5 = $$4.h($$2);
      $$0.a(() -> ww.a("commands.attribute.value.get.success", a($$2), $$1.al(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int b(ei $$0, bwa $$1, je<bya> $$2, double $$3) throws CommandSyntaxException {
      bwz $$4 = b($$1, $$2);
      double $$5 = $$4.i($$2);
      $$0.a(() -> ww.a("commands.attribute.base_value.get.success", a($$2), $$1.al(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int a(ei $$0, bwa $$1, je<bya> $$2, ale $$3, double $$4) throws CommandSyntaxException {
      bwz $$5 = b($$1, $$2);
      byc $$6 = $$5.eZ();
      if (!$$6.a($$2, $$3)) {
         throw c.create($$1.al(), a($$2), $$3);
      } else {
         double $$7 = $$6.b($$2, $$3);
         $$0.a(() -> ww.a("commands.attribute.modifier.value.get.success", ww.a($$3), a($$2), $$1.al(), $$7), false);
         return (int)($$7 * $$4);
      }
   }

   private static Stream<ale> c(bwa $$0, je<bya> $$1) throws CommandSyntaxException {
      byb $$2 = a($$0, $$1);
      return $$2.c().stream().map(byd::b);
   }

   private static int c(ei $$0, bwa $$1, je<bya> $$2, double $$3) throws CommandSyntaxException {
      a($$1, $$2).a($$3);
      $$0.a(() -> ww.a("commands.attribute.base_value.set.success", a($$2), $$1.al(), $$3), false);
      return 1;
   }

   private static int a(ei $$0, bwa $$1, je<bya> $$2) throws CommandSyntaxException {
      bwz $$3 = a($$1);
      if (!$$3.eZ().e($$2)) {
         throw b.create($$1.al(), a($$2));
      } else {
         double $$4 = $$3.i($$2);
         $$0.a(() -> ww.a("commands.attribute.base_value.reset.success", a($$2), $$1.al(), $$4), false);
         return 1;
      }
   }

   private static int a(ei $$0, bwa $$1, je<bya> $$2, ale $$3, double $$4, byd.a $$5) throws CommandSyntaxException {
      byb $$6 = a($$1, $$2);
      byd $$7 = new byd($$3, $$4, $$5);
      if ($$6.b($$3)) {
         throw d.create($$1.al(), a($$2), $$3);
      } else {
         $$6.d($$7);
         $$0.a(() -> ww.a("commands.attribute.modifier.add.success", ww.a($$3), a($$2), $$1.al()), false);
         return 1;
      }
   }

   private static int a(ei $$0, bwa $$1, je<bya> $$2, ale $$3) throws CommandSyntaxException {
      byb $$4 = a($$1, $$2);
      if ($$4.c($$3)) {
         $$0.a(() -> ww.a("commands.attribute.modifier.remove.success", ww.a($$3), a($$2), $$1.al()), false);
         return 1;
      } else {
         throw c.create($$1.al(), a($$2), $$3);
      }
   }

   private static ww a(je<bya> $$0) {
      return ww.c($$0.a().c());
   }
}

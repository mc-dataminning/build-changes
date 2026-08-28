import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;

public class amq {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xh.b("commands.attribute.failed.entity", $$0));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xh.b("commands.attribute.failed.no_attribute", $$0, $$1)
   );
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xh.b("commands.attribute.failed.no_modifier", $$1, $$0, $$2)
   );
   private static final Dynamic3CommandExceptionType d = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xh.b("commands.attribute.failed.modifier_already_present", $$2, $$1, $$0)
   );

   public static void a(CommandDispatcher<ev> $$0, er $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("attribute").requires($$0x -> $$0x.c(2)))
            .then(
               ew.a("target", fi.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ew.a("attribute", fu.a($$1, ly.c))
                              .then(
                                 ((LiteralArgumentBuilder)ew.a("get")
                                       .executes($$0x -> a((ev)$$0x.getSource(), fi.a($$0x, "target"), fu.a($$0x, "attribute"), 1.0)))
                                    .then(
                                       ew.a("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             $$0x -> a(
                                                   (ev)$$0x.getSource(),
                                                   fi.a($$0x, "target"),
                                                   fu.a($$0x, "attribute"),
                                                   DoubleArgumentType.getDouble($$0x, "scale")
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)ew.a("base")
                                    .then(
                                       ew.a("set")
                                          .then(
                                             ew.a("value", DoubleArgumentType.doubleArg())
                                                .executes(
                                                   $$0x -> c(
                                                         (ev)$$0x.getSource(),
                                                         fi.a($$0x, "target"),
                                                         fu.a($$0x, "attribute"),
                                                         DoubleArgumentType.getDouble($$0x, "value")
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)ew.a("get")
                                          .executes($$0x -> b((ev)$$0x.getSource(), fi.a($$0x, "target"), fu.a($$0x, "attribute"), 1.0)))
                                       .then(
                                          ew.a("scale", DoubleArgumentType.doubleArg())
                                             .executes(
                                                $$0x -> b(
                                                      (ev)$$0x.getSource(),
                                                      fi.a($$0x, "target"),
                                                      fu.a($$0x, "attribute"),
                                                      DoubleArgumentType.getDouble($$0x, "scale")
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("modifier")
                                    .then(
                                       ew.a("add")
                                          .then(
                                             ew.a("id", fw.a())
                                                .then(
                                                   ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ew.a("value", DoubleArgumentType.doubleArg())
                                                            .then(
                                                               ew.a("add_value")
                                                                  .executes(
                                                                     $$0x -> a(
                                                                           (ev)$$0x.getSource(),
                                                                           fi.a($$0x, "target"),
                                                                           fu.a($$0x, "attribute"),
                                                                           fw.c($$0x, "id"),
                                                                           DoubleArgumentType.getDouble($$0x, "value"),
                                                                           bwb.a.a
                                                                        )
                                                                  )
                                                            ))
                                                         .then(
                                                            ew.a("add_multiplied_base")
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (ev)$$0x.getSource(),
                                                                        fi.a($$0x, "target"),
                                                                        fu.a($$0x, "attribute"),
                                                                        fw.c($$0x, "id"),
                                                                        DoubleArgumentType.getDouble($$0x, "value"),
                                                                        bwb.a.b
                                                                     )
                                                               )
                                                         ))
                                                      .then(
                                                         ew.a("add_multiplied_total")
                                                            .executes(
                                                               $$0x -> a(
                                                                     (ev)$$0x.getSource(),
                                                                     fi.a($$0x, "target"),
                                                                     fu.a($$0x, "attribute"),
                                                                     fw.c($$0x, "id"),
                                                                     DoubleArgumentType.getDouble($$0x, "value"),
                                                                     bwb.a.c
                                                                  )
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ew.a("remove")
                                       .then(
                                          ew.a("id", fw.a())
                                             .executes($$0x -> a((ev)$$0x.getSource(), fi.a($$0x, "target"), fu.a($$0x, "attribute"), fw.c($$0x, "id")))
                                       )
                                 ))
                              .then(
                                 ew.a("value")
                                    .then(
                                       ew.a("get")
                                          .then(
                                             ((RequiredArgumentBuilder)ew.a("id", fw.a())
                                                   .executes(
                                                      $$0x -> a((ev)$$0x.getSource(), fi.a($$0x, "target"), fu.a($$0x, "attribute"), fw.c($$0x, "id"), 1.0)
                                                   ))
                                                .then(
                                                   ew.a("scale", DoubleArgumentType.doubleArg())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ev)$$0x.getSource(),
                                                               fi.a($$0x, "target"),
                                                               fu.a($$0x, "attribute"),
                                                               fw.c($$0x, "id"),
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

   private static bvz a(btz $$0, jp<bvy> $$1) throws CommandSyntaxException {
      bvz $$2 = a($$0).fa().a($$1);
      if ($$2 == null) {
         throw b.create($$0.al(), a($$1));
      } else {
         return $$2;
      }
   }

   private static buv a(btz $$0) throws CommandSyntaxException {
      if (!($$0 instanceof buv)) {
         throw a.create($$0.al());
      } else {
         return (buv)$$0;
      }
   }

   private static buv b(btz $$0, jp<bvy> $$1) throws CommandSyntaxException {
      buv $$2 = a($$0);
      if (!$$2.fa().b($$1)) {
         throw b.create($$0.al(), a($$1));
      } else {
         return $$2;
      }
   }

   private static int a(ev $$0, btz $$1, jp<bvy> $$2, double $$3) throws CommandSyntaxException {
      buv $$4 = b($$1, $$2);
      double $$5 = $$4.h($$2);
      $$0.a(() -> xh.a("commands.attribute.value.get.success", a($$2), $$1.al(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int b(ev $$0, btz $$1, jp<bvy> $$2, double $$3) throws CommandSyntaxException {
      buv $$4 = b($$1, $$2);
      double $$5 = $$4.i($$2);
      $$0.a(() -> xh.a("commands.attribute.base_value.get.success", a($$2), $$1.al(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int a(ev $$0, btz $$1, jp<bvy> $$2, alh $$3, double $$4) throws CommandSyntaxException {
      buv $$5 = b($$1, $$2);
      bwa $$6 = $$5.fa();
      if (!$$6.a($$2, $$3)) {
         throw c.create($$1.al(), a($$2), $$3);
      } else {
         double $$7 = $$6.b($$2, $$3);
         $$0.a(() -> xh.a("commands.attribute.modifier.value.get.success", xh.a($$3), a($$2), $$1.al(), $$7), false);
         return (int)($$7 * $$4);
      }
   }

   private static int c(ev $$0, btz $$1, jp<bvy> $$2, double $$3) throws CommandSyntaxException {
      a($$1, $$2).a($$3);
      $$0.a(() -> xh.a("commands.attribute.base_value.set.success", a($$2), $$1.al(), $$3), false);
      return 1;
   }

   private static int a(ev $$0, btz $$1, jp<bvy> $$2, alh $$3, double $$4, bwb.a $$5) throws CommandSyntaxException {
      bvz $$6 = a($$1, $$2);
      bwb $$7 = new bwb($$3, $$4, $$5);
      if ($$6.b($$3)) {
         throw d.create($$1.al(), a($$2), $$3);
      } else {
         $$6.d($$7);
         $$0.a(() -> xh.a("commands.attribute.modifier.add.success", xh.a($$3), a($$2), $$1.al()), false);
         return 1;
      }
   }

   private static int a(ev $$0, btz $$1, jp<bvy> $$2, alh $$3) throws CommandSyntaxException {
      bvz $$4 = a($$1, $$2);
      if ($$4.c($$3)) {
         $$0.a(() -> xh.a("commands.attribute.modifier.remove.success", xh.a($$3), a($$2), $$1.al()), false);
         return 1;
      } else {
         throw c.create($$1.al(), a($$2), $$3);
      }
   }

   private static xh a(jp<bvy> $$0) {
      return xh.c($$0.a().c());
   }
}

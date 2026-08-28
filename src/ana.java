import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.stream.Stream;

public class ana {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xg.b("commands.attribute.failed.entity", $$0));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xg.b("commands.attribute.failed.no_attribute", $$0, $$1)
   );
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xg.b("commands.attribute.failed.no_modifier", $$1, $$0, $$2)
   );
   private static final Dynamic3CommandExceptionType d = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xg.b("commands.attribute.failed.modifier_already_present", $$2, $$1, $$0)
   );

   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("attribute").requires($$0x -> $$0x.c(2)))
            .then(
               el.a("target", ex.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)el.a("attribute", fj.a($$1, mi.c))
                              .then(
                                 ((LiteralArgumentBuilder)el.a("get")
                                       .executes($$0x -> a((ek)$$0x.getSource(), ex.a($$0x, "target"), fj.a($$0x, "attribute"), 1.0)))
                                    .then(
                                       el.a("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             $$0x -> a(
                                                   (ek)$$0x.getSource(),
                                                   ex.a($$0x, "target"),
                                                   fj.a($$0x, "attribute"),
                                                   DoubleArgumentType.getDouble($$0x, "scale")
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("base")
                                       .then(
                                          el.a("set")
                                             .then(
                                                el.a("value", DoubleArgumentType.doubleArg())
                                                   .executes(
                                                      $$0x -> c(
                                                            (ek)$$0x.getSource(),
                                                            ex.a($$0x, "target"),
                                                            fj.a($$0x, "attribute"),
                                                            DoubleArgumentType.getDouble($$0x, "value")
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       ((LiteralArgumentBuilder)el.a("get")
                                             .executes($$0x -> b((ek)$$0x.getSource(), ex.a($$0x, "target"), fj.a($$0x, "attribute"), 1.0)))
                                          .then(
                                             el.a("scale", DoubleArgumentType.doubleArg())
                                                .executes(
                                                   $$0x -> b(
                                                         (ek)$$0x.getSource(),
                                                         ex.a($$0x, "target"),
                                                         fj.a($$0x, "attribute"),
                                                         DoubleArgumentType.getDouble($$0x, "scale")
                                                      )
                                                )
                                          )
                                    ))
                                 .then(el.a("reset").executes($$0x -> a((ek)$$0x.getSource(), ex.a($$0x, "target"), fj.a($$0x, "attribute"))))
                           ))
                        .then(
                           ((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("modifier")
                                    .then(
                                       el.a("add")
                                          .then(
                                             el.a("id", fl.a())
                                                .then(
                                                   ((RequiredArgumentBuilder)((RequiredArgumentBuilder)el.a("value", DoubleArgumentType.doubleArg())
                                                            .then(
                                                               el.a("add_value")
                                                                  .executes(
                                                                     $$0x -> a(
                                                                           (ek)$$0x.getSource(),
                                                                           ex.a($$0x, "target"),
                                                                           fj.a($$0x, "attribute"),
                                                                           fl.a($$0x, "id"),
                                                                           DoubleArgumentType.getDouble($$0x, "value"),
                                                                           bzj.a.a
                                                                        )
                                                                  )
                                                            ))
                                                         .then(
                                                            el.a("add_multiplied_base")
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (ek)$$0x.getSource(),
                                                                        ex.a($$0x, "target"),
                                                                        fj.a($$0x, "attribute"),
                                                                        fl.a($$0x, "id"),
                                                                        DoubleArgumentType.getDouble($$0x, "value"),
                                                                        bzj.a.b
                                                                     )
                                                               )
                                                         ))
                                                      .then(
                                                         el.a("add_multiplied_total")
                                                            .executes(
                                                               $$0x -> a(
                                                                     (ek)$$0x.getSource(),
                                                                     ex.a($$0x, "target"),
                                                                     fj.a($$0x, "attribute"),
                                                                     fl.a($$0x, "id"),
                                                                     DoubleArgumentType.getDouble($$0x, "value"),
                                                                     bzj.a.c
                                                                  )
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    el.a("remove")
                                       .then(
                                          el.a("id", fl.a())
                                             .suggests(($$0x, $$1x) -> ep.a(c(ex.a($$0x, "target"), fj.a($$0x, "attribute")), $$1x))
                                             .executes($$0x -> a((ek)$$0x.getSource(), ex.a($$0x, "target"), fj.a($$0x, "attribute"), fl.a($$0x, "id")))
                                       )
                                 ))
                              .then(
                                 el.a("value")
                                    .then(
                                       el.a("get")
                                          .then(
                                             ((RequiredArgumentBuilder)el.a("id", fl.a())
                                                   .suggests(($$0x, $$1x) -> ep.a(c(ex.a($$0x, "target"), fj.a($$0x, "attribute")), $$1x))
                                                   .executes(
                                                      $$0x -> a((ek)$$0x.getSource(), ex.a($$0x, "target"), fj.a($$0x, "attribute"), fl.a($$0x, "id"), 1.0)
                                                   ))
                                                .then(
                                                   el.a("scale", DoubleArgumentType.doubleArg())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ek)$$0x.getSource(),
                                                               ex.a($$0x, "target"),
                                                               fj.a($$0x, "attribute"),
                                                               fl.a($$0x, "id"),
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

   private static bzh a(bxe $$0, jg<bzg> $$1) throws CommandSyntaxException {
      bzh $$2 = a($$0).fa().a($$1);
      if ($$2 == null) {
         throw b.create($$0.ah(), a($$1));
      } else {
         return $$2;
      }
   }

   private static byf a(bxe $$0) throws CommandSyntaxException {
      if (!($$0 instanceof byf)) {
         throw a.create($$0.ah());
      } else {
         return (byf)$$0;
      }
   }

   private static byf b(bxe $$0, jg<bzg> $$1) throws CommandSyntaxException {
      byf $$2 = a($$0);
      if (!$$2.fa().b($$1)) {
         throw b.create($$0.ah(), a($$1));
      } else {
         return $$2;
      }
   }

   private static int a(ek $$0, bxe $$1, jg<bzg> $$2, double $$3) throws CommandSyntaxException {
      byf $$4 = b($$1, $$2);
      double $$5 = $$4.h($$2);
      $$0.a(() -> xg.a("commands.attribute.value.get.success", a($$2), $$1.ah(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int b(ek $$0, bxe $$1, jg<bzg> $$2, double $$3) throws CommandSyntaxException {
      byf $$4 = b($$1, $$2);
      double $$5 = $$4.i($$2);
      $$0.a(() -> xg.a("commands.attribute.base_value.get.success", a($$2), $$1.ah(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int a(ek $$0, bxe $$1, jg<bzg> $$2, alr $$3, double $$4) throws CommandSyntaxException {
      byf $$5 = b($$1, $$2);
      bzi $$6 = $$5.fa();
      if (!$$6.a($$2, $$3)) {
         throw c.create($$1.ah(), a($$2), $$3);
      } else {
         double $$7 = $$6.b($$2, $$3);
         $$0.a(() -> xg.a("commands.attribute.modifier.value.get.success", xg.a($$3), a($$2), $$1.ah(), $$7), false);
         return (int)($$7 * $$4);
      }
   }

   private static Stream<alr> c(bxe $$0, jg<bzg> $$1) throws CommandSyntaxException {
      bzh $$2 = a($$0, $$1);
      return $$2.c().stream().map(bzj::a);
   }

   private static int c(ek $$0, bxe $$1, jg<bzg> $$2, double $$3) throws CommandSyntaxException {
      a($$1, $$2).a($$3);
      $$0.a(() -> xg.a("commands.attribute.base_value.set.success", a($$2), $$1.ah(), $$3), false);
      return 1;
   }

   private static int a(ek $$0, bxe $$1, jg<bzg> $$2) throws CommandSyntaxException {
      byf $$3 = a($$1);
      if (!$$3.fa().e($$2)) {
         throw b.create($$1.ah(), a($$2));
      } else {
         double $$4 = $$3.i($$2);
         $$0.a(() -> xg.a("commands.attribute.base_value.reset.success", a($$2), $$1.ah(), $$4), false);
         return 1;
      }
   }

   private static int a(ek $$0, bxe $$1, jg<bzg> $$2, alr $$3, double $$4, bzj.a $$5) throws CommandSyntaxException {
      bzh $$6 = a($$1, $$2);
      bzj $$7 = new bzj($$3, $$4, $$5);
      if ($$6.b($$3)) {
         throw d.create($$1.ah(), a($$2), $$3);
      } else {
         $$6.d($$7);
         $$0.a(() -> xg.a("commands.attribute.modifier.add.success", xg.a($$3), a($$2), $$1.ah()), false);
         return 1;
      }
   }

   private static int a(ek $$0, bxe $$1, jg<bzg> $$2, alr $$3) throws CommandSyntaxException {
      bzh $$4 = a($$1, $$2);
      if ($$4.c($$3)) {
         $$0.a(() -> xg.a("commands.attribute.modifier.remove.success", xg.a($$3), a($$2), $$1.ah()), false);
         return 1;
      } else {
         throw c.create($$1.ah(), a($$2), $$3);
      }
   }

   private static xg a(jg<bzg> $$0) {
      return xg.c($$0.a().c());
   }
}

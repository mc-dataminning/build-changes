import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class alj {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wi.c("commands.damage.invulnerable"));

   public static void a(CommandDispatcher<dv> $$0, dr $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("damage").requires($$0x -> $$0x.c(2)))
            .then(
               dw.a("target", ei.a())
                  .then(
                     ((RequiredArgumentBuilder)dw.a("amount", FloatArgumentType.floatArg(0.0F))
                           .executes(
                              $$0x -> a(
                                    (dv)$$0x.getSource(), ei.a($$0x, "target"), FloatArgumentType.getFloat($$0x, "amount"), ((dv)$$0x.getSource()).e().ai().n()
                                 )
                           ))
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dw.a("damageType", eu.a($$1, ku.s))
                                    .executes(
                                       $$0x -> a(
                                             (dv)$$0x.getSource(),
                                             ei.a($$0x, "target"),
                                             FloatArgumentType.getFloat($$0x, "amount"),
                                             new boy(eu.a($$0x, "damageType", ku.s))
                                          )
                                    ))
                                 .then(
                                    dw.a("at")
                                       .then(
                                          dw.a("location", fx.a())
                                             .executes(
                                                $$0x -> a(
                                                      (dv)$$0x.getSource(),
                                                      ei.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new boy(eu.a($$0x, "damageType", ku.s), fx.a($$0x, "location"))
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 dw.a("by")
                                    .then(
                                       ((RequiredArgumentBuilder)dw.a("entity", ei.a())
                                             .executes(
                                                $$0x -> a(
                                                      (dv)$$0x.getSource(),
                                                      ei.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new boy(eu.a($$0x, "damageType", ku.s), ei.a($$0x, "entity"))
                                                   )
                                             ))
                                          .then(
                                             dw.a("from")
                                                .then(
                                                   dw.a("cause", ei.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (dv)$$0x.getSource(),
                                                               ei.a($$0x, "target"),
                                                               FloatArgumentType.getFloat($$0x, "amount"),
                                                               new boy(eu.a($$0x, "damageType", ku.s), ei.a($$0x, "entity"), ei.a($$0x, "cause"))
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

   private static int a(dv $$0, bqa $$1, float $$2, boy $$3) throws CommandSyntaxException {
      if ($$1.a($$3, $$2)) {
         $$0.a(() -> wi.a("commands.damage.success", $$2, $$1.O_()), true);
         return 1;
      } else {
         throw a.create();
      }
   }
}

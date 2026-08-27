import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class alw {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("commands.damage.invulnerable"));

   public static void a(CommandDispatcher<ed> $$0, dz $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("damage").requires($$0x -> $$0x.c(2)))
            .then(
               ee.a("target", eq.a())
                  .then(
                     ((RequiredArgumentBuilder)ee.a("amount", FloatArgumentType.floatArg(0.0F))
                           .executes(
                              $$0x -> a(
                                    (ed)$$0x.getSource(), eq.a($$0x, "target"), FloatArgumentType.getFloat($$0x, "amount"), ((ed)$$0x.getSource()).e().ai().n()
                                 )
                           ))
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ee.a("damageType", fc.a($$1, le.s))
                                    .executes(
                                       $$0x -> a(
                                             (ed)$$0x.getSource(),
                                             eq.a($$0x, "target"),
                                             FloatArgumentType.getFloat($$0x, "amount"),
                                             new bqf(fc.a($$0x, "damageType", le.s))
                                          )
                                    ))
                                 .then(
                                    ee.a("at")
                                       .then(
                                          ee.a("location", gg.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ed)$$0x.getSource(),
                                                      eq.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new bqf(fc.a($$0x, "damageType", le.s), gg.a($$0x, "location"))
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ee.a("by")
                                    .then(
                                       ((RequiredArgumentBuilder)ee.a("entity", eq.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ed)$$0x.getSource(),
                                                      eq.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new bqf(fc.a($$0x, "damageType", le.s), eq.a($$0x, "entity"))
                                                   )
                                             ))
                                          .then(
                                             ee.a("from")
                                                .then(
                                                   ee.a("cause", eq.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ed)$$0x.getSource(),
                                                               eq.a($$0x, "target"),
                                                               FloatArgumentType.getFloat($$0x, "amount"),
                                                               new bqf(fc.a($$0x, "damageType", le.s), eq.a($$0x, "entity"), eq.a($$0x, "cause"))
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

   private static int a(ed $$0, brh $$1, float $$2, bqf $$3) throws CommandSyntaxException {
      if ($$1.a($$3, $$2)) {
         $$0.a(() -> wu.a("commands.damage.success", $$2, $$1.O_()), true);
         return 1;
      } else {
         throw a.create();
      }
   }
}

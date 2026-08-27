import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class agm {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tl.c("commands.damage.invulnerable"));

   public static void a(CommandDispatcher<dt> $$0, dn $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("damage").requires($$0x -> $$0x.c(2)))
            .then(
               du.a("target", ee.a())
                  .then(
                     ((RequiredArgumentBuilder)du.a("amount", FloatArgumentType.floatArg(0.0F))
                           .executes(
                              $$0x -> a(
                                    (dt)$$0x.getSource(), ee.a($$0x, "target"), FloatArgumentType.getFloat($$0x, "amount"), ((dt)$$0x.getSource()).e().ag().n()
                                 )
                           ))
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)du.a("damageType", eq.a($$1, jc.q))
                                    .executes(
                                       $$0x -> a(
                                             (dt)$$0x.getSource(),
                                             ee.a($$0x, "target"),
                                             FloatArgumentType.getFloat($$0x, "amount"),
                                             new bhu(eq.a($$0x, "damageType", jc.q))
                                          )
                                    ))
                                 .then(
                                    du.a("at")
                                       .then(
                                          du.a("location", fr.a())
                                             .executes(
                                                $$0x -> a(
                                                      (dt)$$0x.getSource(),
                                                      ee.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new bhu(eq.a($$0x, "damageType", jc.q), fr.a($$0x, "location"))
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 du.a("by")
                                    .then(
                                       ((RequiredArgumentBuilder)du.a("entity", ee.a())
                                             .executes(
                                                $$0x -> a(
                                                      (dt)$$0x.getSource(),
                                                      ee.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new bhu(eq.a($$0x, "damageType", jc.q), ee.a($$0x, "entity"))
                                                   )
                                             ))
                                          .then(
                                             du.a("from")
                                                .then(
                                                   du.a("cause", ee.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (dt)$$0x.getSource(),
                                                               ee.a($$0x, "target"),
                                                               FloatArgumentType.getFloat($$0x, "amount"),
                                                               new bhu(eq.a($$0x, "damageType", jc.q), ee.a($$0x, "entity"), ee.a($$0x, "cause"))
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

   private static int a(dt $$0, biw $$1, float $$2, bhu $$3) throws CommandSyntaxException {
      if ($$1.a($$3, $$2)) {
         $$0.a(() -> tl.a("commands.damage.success", $$2, $$1.N_()), true);
         return 1;
      } else {
         throw a.create();
      }
   }
}

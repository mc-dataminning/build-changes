import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class amu {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xp.c("commands.damage.invulnerable"));

   public static void a(CommandDispatcher<ep> $$0, el $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("damage").requires($$0x -> $$0x.c(2)))
            .then(
               eq.a("target", fc.a())
                  .then(
                     ((RequiredArgumentBuilder)eq.a("amount", FloatArgumentType.floatArg(0.0F))
                           .executes(
                              $$0x -> a(
                                    (ep)$$0x.getSource(), fc.a($$0x, "target"), FloatArgumentType.getFloat($$0x, "amount"), ((ep)$$0x.getSource()).e().aj().n()
                                 )
                           ))
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)eq.a("damageType", fo.a($$1, lq.s))
                                    .executes(
                                       $$0x -> a(
                                             (ep)$$0x.getSource(),
                                             fc.a($$0x, "target"),
                                             FloatArgumentType.getFloat($$0x, "amount"),
                                             new brn(fo.a($$0x, "damageType", lq.s))
                                          )
                                    ))
                                 .then(
                                    eq.a("at")
                                       .then(
                                          eq.a("location", gs.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ep)$$0x.getSource(),
                                                      fc.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new brn(fo.a($$0x, "damageType", lq.s), gs.a($$0x, "location"))
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 eq.a("by")
                                    .then(
                                       ((RequiredArgumentBuilder)eq.a("entity", fc.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ep)$$0x.getSource(),
                                                      fc.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new brn(fo.a($$0x, "damageType", lq.s), fc.a($$0x, "entity"))
                                                   )
                                             ))
                                          .then(
                                             eq.a("from")
                                                .then(
                                                   eq.a("cause", fc.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ep)$$0x.getSource(),
                                                               fc.a($$0x, "target"),
                                                               FloatArgumentType.getFloat($$0x, "amount"),
                                                               new brn(fo.a($$0x, "damageType", lq.s), fc.a($$0x, "entity"), fc.a($$0x, "cause"))
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

   private static int a(ep $$0, bsu $$1, float $$2, brn $$3) throws CommandSyntaxException {
      if ($$1.a($$3, $$2)) {
         $$0.a(() -> xp.a("commands.damage.success", $$2, $$1.O_()), true);
         return 1;
      } else {
         throw a.create();
      }
   }
}

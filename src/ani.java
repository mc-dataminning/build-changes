import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class ani {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xg.c("commands.damage.invulnerable"));

   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("damage").requires($$0x -> $$0x.c(2)))
            .then(
               el.a("target", ex.a())
                  .then(
                     ((RequiredArgumentBuilder)el.a("amount", FloatArgumentType.floatArg(0.0F))
                           .executes(
                              $$0x -> a(
                                    (ek)$$0x.getSource(), ex.a($$0x, "target"), FloatArgumentType.getFloat($$0x, "amount"), ((ek)$$0x.getSource()).e().al().p()
                                 )
                           ))
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)el.a("damageType", fj.a($$1, mi.aN))
                                    .executes(
                                       $$0x -> a(
                                             (ek)$$0x.getSource(),
                                             ex.a($$0x, "target"),
                                             FloatArgumentType.getFloat($$0x, "amount"),
                                             new bvt(fj.a($$0x, "damageType", mi.aN))
                                          )
                                    ))
                                 .then(
                                    el.a("at")
                                       .then(
                                          el.a("location", go.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ek)$$0x.getSource(),
                                                      ex.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new bvt(fj.a($$0x, "damageType", mi.aN), go.a($$0x, "location"))
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 el.a("by")
                                    .then(
                                       ((RequiredArgumentBuilder)el.a("entity", ex.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ek)$$0x.getSource(),
                                                      ex.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new bvt(fj.a($$0x, "damageType", mi.aN), ex.a($$0x, "entity"))
                                                   )
                                             ))
                                          .then(
                                             el.a("from")
                                                .then(
                                                   el.a("cause", ex.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ek)$$0x.getSource(),
                                                               ex.a($$0x, "target"),
                                                               FloatArgumentType.getFloat($$0x, "amount"),
                                                               new bvt(fj.a($$0x, "damageType", mi.aN), ex.a($$0x, "entity"), ex.a($$0x, "cause"))
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

   private static int a(ek $$0, bxe $$1, float $$2, bvt $$3) throws CommandSyntaxException {
      if ($$1.a($$0.e(), $$3, $$2)) {
         $$0.a(() -> xg.a("commands.damage.success", $$2, $$1.m_()), true);
         return 1;
      } else {
         throw a.create();
      }
   }
}

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class aia {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(uv.c("commands.damage.invulnerable"));

   public static void a(CommandDispatcher<du> $$0, dp $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("damage").requires($$0x -> $$0x.c(2)))
            .then(
               dv.a("target", eg.a())
                  .then(
                     ((RequiredArgumentBuilder)dv.a("amount", FloatArgumentType.floatArg(0.0F))
                           .executes(
                              $$0x -> a(
                                    (du)$$0x.getSource(), eg.a($$0x, "target"), FloatArgumentType.getFloat($$0x, "amount"), ((du)$$0x.getSource()).e().ah().n()
                                 )
                           ))
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a("damageType", es.a($$1, kd.q))
                                    .executes(
                                       $$0x -> a(
                                             (du)$$0x.getSource(),
                                             eg.a($$0x, "target"),
                                             FloatArgumentType.getFloat($$0x, "amount"),
                                             new bjt(es.a($$0x, "damageType", kd.q))
                                          )
                                    ))
                                 .then(
                                    dv.a("at")
                                       .then(
                                          dv.a("location", ft.a())
                                             .executes(
                                                $$0x -> a(
                                                      (du)$$0x.getSource(),
                                                      eg.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new bjt(es.a($$0x, "damageType", kd.q), ft.a($$0x, "location"))
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 dv.a("by")
                                    .then(
                                       ((RequiredArgumentBuilder)dv.a("entity", eg.a())
                                             .executes(
                                                $$0x -> a(
                                                      (du)$$0x.getSource(),
                                                      eg.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new bjt(es.a($$0x, "damageType", kd.q), eg.a($$0x, "entity"))
                                                   )
                                             ))
                                          .then(
                                             dv.a("from")
                                                .then(
                                                   dv.a("cause", eg.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (du)$$0x.getSource(),
                                                               eg.a($$0x, "target"),
                                                               FloatArgumentType.getFloat($$0x, "amount"),
                                                               new bjt(es.a($$0x, "damageType", kd.q), eg.a($$0x, "entity"), eg.a($$0x, "cause"))
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

   private static int a(du $$0, bkv $$1, float $$2, bjt $$3) throws CommandSyntaxException {
      if ($$1.a($$3, $$2)) {
         $$0.a(() -> uv.a("commands.damage.success", $$2, $$1.Q_()), true);
         return 1;
      } else {
         throw a.create();
      }
   }
}

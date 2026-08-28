import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class amy {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xh.c("commands.damage.invulnerable"));

   public static void a(CommandDispatcher<ev> $$0, er $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("damage").requires($$0x -> $$0x.c(2)))
            .then(
               ew.a("target", fi.a())
                  .then(
                     ((RequiredArgumentBuilder)ew.a("amount", FloatArgumentType.floatArg(0.0F))
                           .executes(
                              $$0x -> a(
                                    (ev)$$0x.getSource(), fi.a($$0x, "target"), FloatArgumentType.getFloat($$0x, "amount"), ((ev)$$0x.getSource()).e().ak().p()
                                 )
                           ))
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ew.a("damageType", fu.a($$1, ly.s))
                                    .executes(
                                       $$0x -> a(
                                             (ev)$$0x.getSource(),
                                             fi.a($$0x, "target"),
                                             FloatArgumentType.getFloat($$0x, "amount"),
                                             new bsp(fu.a($$0x, "damageType", ly.s))
                                          )
                                    ))
                                 .then(
                                    ew.a("at")
                                       .then(
                                          ew.a("location", gy.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ev)$$0x.getSource(),
                                                      fi.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new bsp(fu.a($$0x, "damageType", ly.s), gy.a($$0x, "location"))
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ew.a("by")
                                    .then(
                                       ((RequiredArgumentBuilder)ew.a("entity", fi.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ev)$$0x.getSource(),
                                                      fi.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new bsp(fu.a($$0x, "damageType", ly.s), fi.a($$0x, "entity"))
                                                   )
                                             ))
                                          .then(
                                             ew.a("from")
                                                .then(
                                                   ew.a("cause", fi.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ev)$$0x.getSource(),
                                                               fi.a($$0x, "target"),
                                                               FloatArgumentType.getFloat($$0x, "amount"),
                                                               new bsp(fu.a($$0x, "damageType", ly.s), fi.a($$0x, "entity"), fi.a($$0x, "cause"))
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

   private static int a(ev $$0, btz $$1, float $$2, bsp $$3) throws CommandSyntaxException {
      if ($$1.a($$3, $$2)) {
         $$0.a(() -> xh.a("commands.damage.success", $$2, $$1.S_()), true);
         return 1;
      } else {
         throw a.create();
      }
   }
}

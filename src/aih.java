import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class aih {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vb.c("commands.damage.invulnerable"));

   public static void a(CommandDispatcher<ds> $$0, dn $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("damage").requires($$0x -> $$0x.c(2)))
            .then(
               dt.a("target", ee.a())
                  .then(
                     ((RequiredArgumentBuilder)dt.a("amount", FloatArgumentType.floatArg(0.0F))
                           .executes(
                              $$0x -> a(
                                    (ds)$$0x.getSource(), ee.a($$0x, "target"), FloatArgumentType.getFloat($$0x, "amount"), ((ds)$$0x.getSource()).e().ah().n()
                                 )
                           ))
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("damageType", eq.a($$1, kc.r))
                                    .executes(
                                       $$0x -> a(
                                             (ds)$$0x.getSource(),
                                             ee.a($$0x, "target"),
                                             FloatArgumentType.getFloat($$0x, "amount"),
                                             new bkd(eq.a($$0x, "damageType", kc.r))
                                          )
                                    ))
                                 .then(
                                    dt.a("at")
                                       .then(
                                          dt.a("location", fr.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ds)$$0x.getSource(),
                                                      ee.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new bkd(eq.a($$0x, "damageType", kc.r), fr.a($$0x, "location"))
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 dt.a("by")
                                    .then(
                                       ((RequiredArgumentBuilder)dt.a("entity", ee.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ds)$$0x.getSource(),
                                                      ee.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new bkd(eq.a($$0x, "damageType", kc.r), ee.a($$0x, "entity"))
                                                   )
                                             ))
                                          .then(
                                             dt.a("from")
                                                .then(
                                                   dt.a("cause", ee.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ds)$$0x.getSource(),
                                                               ee.a($$0x, "target"),
                                                               FloatArgumentType.getFloat($$0x, "amount"),
                                                               new bkd(eq.a($$0x, "damageType", kc.r), ee.a($$0x, "entity"), ee.a($$0x, "cause"))
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

   private static int a(ds $$0, blf $$1, float $$2, bkd $$3) throws CommandSyntaxException {
      if ($$1.a($$3, $$2)) {
         $$0.a(() -> vb.a("commands.damage.success", $$2, $$1.Q_()), true);
         return 1;
      } else {
         throw a.create();
      }
   }
}

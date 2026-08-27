import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class aec {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(sw.c("commands.damage.invulnerable"));

   public static void a(CommandDispatcher<ds> $$0, dm $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("damage").requires($$0x -> $$0x.c(2)))
            .then(
               dt.a("target", ec.a())
                  .then(
                     ((RequiredArgumentBuilder)dt.a("amount", FloatArgumentType.floatArg(0.0F))
                           .executes(
                              $$0x -> a(
                                    (ds)$$0x.getSource(), ec.a($$0x, "target"), FloatArgumentType.getFloat($$0x, "amount"), ((ds)$$0x.getSource()).e().ag().n()
                                 )
                           ))
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("damageType", eo.a($$1, jc.p))
                                    .executes(
                                       $$0x -> a(
                                             (ds)$$0x.getSource(),
                                             ec.a($$0x, "target"),
                                             FloatArgumentType.getFloat($$0x, "amount"),
                                             new ben(eo.a($$0x, "damageType", jc.p))
                                          )
                                    ))
                                 .then(
                                    dt.a("at")
                                       .then(
                                          dt.a("location", fp.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ds)$$0x.getSource(),
                                                      ec.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new ben(eo.a($$0x, "damageType", jc.p), fp.a($$0x, "location"))
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 dt.a("by")
                                    .then(
                                       ((RequiredArgumentBuilder)dt.a("entity", ec.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ds)$$0x.getSource(),
                                                      ec.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new ben(eo.a($$0x, "damageType", jc.p), ec.a($$0x, "entity"))
                                                   )
                                             ))
                                          .then(
                                             dt.a("from")
                                                .then(
                                                   dt.a("cause", ec.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ds)$$0x.getSource(),
                                                               ec.a($$0x, "target"),
                                                               FloatArgumentType.getFloat($$0x, "amount"),
                                                               new ben(eo.a($$0x, "damageType", jc.p), ec.a($$0x, "entity"), ec.a($$0x, "cause"))
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

   private static int a(ds $$0, bfj $$1, float $$2, ben $$3) throws CommandSyntaxException {
      if ($$1.a($$3, $$2)) {
         $$0.a(() -> sw.a("commands.damage.success", $$2, $$1.H_()), true);
         return 1;
      } else {
         throw a.create();
      }
   }
}

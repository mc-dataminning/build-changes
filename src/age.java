import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class age {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tf.c("commands.damage.invulnerable"));

   public static void a(CommandDispatcher<dr> $$0, dl $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("damage").requires($$0x -> $$0x.c(2)))
            .then(
               ds.a("target", ec.a())
                  .then(
                     ((RequiredArgumentBuilder)ds.a("amount", FloatArgumentType.floatArg(0.0F))
                           .executes(
                              $$0x -> a(
                                    (dr)$$0x.getSource(), ec.a($$0x, "target"), FloatArgumentType.getFloat($$0x, "amount"), ((dr)$$0x.getSource()).e().ag().n()
                                 )
                           ))
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ds.a("damageType", eo.a($$1, jc.p))
                                    .executes(
                                       $$0x -> a(
                                             (dr)$$0x.getSource(),
                                             ec.a($$0x, "target"),
                                             FloatArgumentType.getFloat($$0x, "amount"),
                                             new bhg(eo.a($$0x, "damageType", jc.p))
                                          )
                                    ))
                                 .then(
                                    ds.a("at")
                                       .then(
                                          ds.a("location", fp.a())
                                             .executes(
                                                $$0x -> a(
                                                      (dr)$$0x.getSource(),
                                                      ec.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new bhg(eo.a($$0x, "damageType", jc.p), fp.a($$0x, "location"))
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ds.a("by")
                                    .then(
                                       ((RequiredArgumentBuilder)ds.a("entity", ec.a())
                                             .executes(
                                                $$0x -> a(
                                                      (dr)$$0x.getSource(),
                                                      ec.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new bhg(eo.a($$0x, "damageType", jc.p), ec.a($$0x, "entity"))
                                                   )
                                             ))
                                          .then(
                                             ds.a("from")
                                                .then(
                                                   ds.a("cause", ec.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (dr)$$0x.getSource(),
                                                               ec.a($$0x, "target"),
                                                               FloatArgumentType.getFloat($$0x, "amount"),
                                                               new bhg(eo.a($$0x, "damageType", jc.p), ec.a($$0x, "entity"), ec.a($$0x, "cause"))
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

   private static int a(dr $$0, bii $$1, float $$2, bhg $$3) throws CommandSyntaxException {
      if ($$1.a($$3, $$2)) {
         $$0.a(() -> tf.a("commands.damage.success", $$2, $$1.H_()), true);
         return 1;
      } else {
         throw a.create();
      }
   }
}

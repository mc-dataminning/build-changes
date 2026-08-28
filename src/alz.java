import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class alz {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("commands.damage.invulnerable"));

   public static void a(CommandDispatcher<eq> $$0, em $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("damage").requires($$0x -> $$0x.c(2)))
            .then(
               er.a("target", fd.a())
                  .then(
                     ((RequiredArgumentBuilder)er.a("amount", FloatArgumentType.floatArg(0.0F))
                           .executes(
                              $$0x -> a(
                                    (eq)$$0x.getSource(), fd.a($$0x, "target"), FloatArgumentType.getFloat($$0x, "amount"), ((eq)$$0x.getSource()).e().aj().o()
                                 )
                           ))
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)er.a("damageType", fp.a($$1, lr.s))
                                    .executes(
                                       $$0x -> a(
                                             (eq)$$0x.getSource(),
                                             fd.a($$0x, "target"),
                                             FloatArgumentType.getFloat($$0x, "amount"),
                                             new bra(fp.a($$0x, "damageType", lr.s))
                                          )
                                    ))
                                 .then(
                                    er.a("at")
                                       .then(
                                          er.a("location", gt.a())
                                             .executes(
                                                $$0x -> a(
                                                      (eq)$$0x.getSource(),
                                                      fd.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new bra(fp.a($$0x, "damageType", lr.s), gt.a($$0x, "location"))
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 er.a("by")
                                    .then(
                                       ((RequiredArgumentBuilder)er.a("entity", fd.a())
                                             .executes(
                                                $$0x -> a(
                                                      (eq)$$0x.getSource(),
                                                      fd.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new bra(fp.a($$0x, "damageType", lr.s), fd.a($$0x, "entity"))
                                                   )
                                             ))
                                          .then(
                                             er.a("from")
                                                .then(
                                                   er.a("cause", fd.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (eq)$$0x.getSource(),
                                                               fd.a($$0x, "target"),
                                                               FloatArgumentType.getFloat($$0x, "amount"),
                                                               new bra(fp.a($$0x, "damageType", lr.s), fd.a($$0x, "entity"), fd.a($$0x, "cause"))
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

   private static int a(eq $$0, bsh $$1, float $$2, bra $$3) throws CommandSyntaxException {
      if ($$1.a($$3, $$2)) {
         $$0.a(() -> wu.a("commands.damage.success", $$2, $$1.O_()), true);
         return 1;
      } else {
         throw a.create();
      }
   }
}

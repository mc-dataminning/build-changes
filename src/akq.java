import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class akq {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vs.c("commands.damage.invulnerable"));

   public static void a(CommandDispatcher<du> $$0, dq $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("damage").requires($$0x -> $$0x.c(2)))
            .then(
               dv.a("target", eh.a())
                  .then(
                     ((RequiredArgumentBuilder)dv.a("amount", FloatArgumentType.floatArg(0.0F))
                           .executes(
                              $$0x -> a(
                                    (du)$$0x.getSource(), eh.a($$0x, "target"), FloatArgumentType.getFloat($$0x, "amount"), ((du)$$0x.getSource()).e().ah().n()
                                 )
                           ))
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a("damageType", et.a($$1, ki.r))
                                    .executes(
                                       $$0x -> a(
                                             (du)$$0x.getSource(),
                                             eh.a($$0x, "target"),
                                             FloatArgumentType.getFloat($$0x, "amount"),
                                             new bne(et.a($$0x, "damageType", ki.r))
                                          )
                                    ))
                                 .then(
                                    dv.a("at")
                                       .then(
                                          dv.a("location", fv.a())
                                             .executes(
                                                $$0x -> a(
                                                      (du)$$0x.getSource(),
                                                      eh.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new bne(et.a($$0x, "damageType", ki.r), fv.a($$0x, "location"))
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 dv.a("by")
                                    .then(
                                       ((RequiredArgumentBuilder)dv.a("entity", eh.a())
                                             .executes(
                                                $$0x -> a(
                                                      (du)$$0x.getSource(),
                                                      eh.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new bne(et.a($$0x, "damageType", ki.r), eh.a($$0x, "entity"))
                                                   )
                                             ))
                                          .then(
                                             dv.a("from")
                                                .then(
                                                   dv.a("cause", eh.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (du)$$0x.getSource(),
                                                               eh.a($$0x, "target"),
                                                               FloatArgumentType.getFloat($$0x, "amount"),
                                                               new bne(et.a($$0x, "damageType", ki.r), eh.a($$0x, "entity"), eh.a($$0x, "cause"))
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

   private static int a(du $$0, bof $$1, float $$2, bne $$3) throws CommandSyntaxException {
      if ($$1.a($$3, $$2)) {
         $$0.a(() -> vs.a("commands.damage.success", $$2, $$1.Q_()), true);
         return 1;
      } else {
         throw a.create();
      }
   }
}

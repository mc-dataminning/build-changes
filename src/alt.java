import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class alt {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ws.c("commands.damage.invulnerable"));

   public static void a(CommandDispatcher<ec> $$0, dy $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("damage").requires($$0x -> $$0x.c(2)))
            .then(
               ed.a("target", ep.a())
                  .then(
                     ((RequiredArgumentBuilder)ed.a("amount", FloatArgumentType.floatArg(0.0F))
                           .executes(
                              $$0x -> a(
                                    (ec)$$0x.getSource(), ep.a($$0x, "target"), FloatArgumentType.getFloat($$0x, "amount"), ((ec)$$0x.getSource()).e().ai().n()
                                 )
                           ))
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ed.a("damageType", fb.a($$1, ld.s))
                                    .executes(
                                       $$0x -> a(
                                             (ec)$$0x.getSource(),
                                             ep.a($$0x, "target"),
                                             FloatArgumentType.getFloat($$0x, "amount"),
                                             new bpj(fb.a($$0x, "damageType", ld.s))
                                          )
                                    ))
                                 .then(
                                    ed.a("at")
                                       .then(
                                          ed.a("location", ge.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ec)$$0x.getSource(),
                                                      ep.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new bpj(fb.a($$0x, "damageType", ld.s), ge.a($$0x, "location"))
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ed.a("by")
                                    .then(
                                       ((RequiredArgumentBuilder)ed.a("entity", ep.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ec)$$0x.getSource(),
                                                      ep.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new bpj(fb.a($$0x, "damageType", ld.s), ep.a($$0x, "entity"))
                                                   )
                                             ))
                                          .then(
                                             ed.a("from")
                                                .then(
                                                   ed.a("cause", ep.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ec)$$0x.getSource(),
                                                               ep.a($$0x, "target"),
                                                               FloatArgumentType.getFloat($$0x, "amount"),
                                                               new bpj(fb.a($$0x, "damageType", ld.s), ep.a($$0x, "entity"), ep.a($$0x, "cause"))
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

   private static int a(ec $$0, bql $$1, float $$2, bpj $$3) throws CommandSyntaxException {
      if ($$1.a($$3, $$2)) {
         $$0.a(() -> ws.a("commands.damage.success", $$2, $$1.O_()), true);
         return 1;
      } else {
         throw a.create();
      }
   }
}

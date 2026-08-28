import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class amx {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wy.c("commands.damage.invulnerable"));

   public static void a(CommandDispatcher<ei> $$0, ee $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("damage").requires($$0x -> $$0x.c(2)))
            .then(
               ej.a("target", ev.a())
                  .then(
                     ((RequiredArgumentBuilder)ej.a("amount", FloatArgumentType.floatArg(0.0F))
                           .executes(
                              $$0x -> a(
                                    (ei)$$0x.getSource(), ev.a($$0x, "target"), FloatArgumentType.getFloat($$0x, "amount"), ((ei)$$0x.getSource()).e().al().p()
                                 )
                           ))
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ej.a("damageType", fh.a($$1, mg.aM))
                                    .executes(
                                       $$0x -> a(
                                             (ei)$$0x.getSource(),
                                             ev.a($$0x, "target"),
                                             FloatArgumentType.getFloat($$0x, "amount"),
                                             new bus(fh.a($$0x, "damageType", mg.aM))
                                          )
                                    ))
                                 .then(
                                    ej.a("at")
                                       .then(
                                          ej.a("location", gm.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ei)$$0x.getSource(),
                                                      ev.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new bus(fh.a($$0x, "damageType", mg.aM), gm.a($$0x, "location"))
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ej.a("by")
                                    .then(
                                       ((RequiredArgumentBuilder)ej.a("entity", ev.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ei)$$0x.getSource(),
                                                      ev.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new bus(fh.a($$0x, "damageType", mg.aM), ev.a($$0x, "entity"))
                                                   )
                                             ))
                                          .then(
                                             ej.a("from")
                                                .then(
                                                   ej.a("cause", ev.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ei)$$0x.getSource(),
                                                               ev.a($$0x, "target"),
                                                               FloatArgumentType.getFloat($$0x, "amount"),
                                                               new bus(fh.a($$0x, "damageType", mg.aM), ev.a($$0x, "entity"), ev.a($$0x, "cause"))
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

   private static int a(ei $$0, bwd $$1, float $$2, bus $$3) throws CommandSyntaxException {
      if ($$1.a($$0.e(), $$3, $$2)) {
         $$0.a(() -> wy.a("commands.damage.success", $$2, $$1.m_()), true);
         return 1;
      } else {
         throw a.create();
      }
   }
}

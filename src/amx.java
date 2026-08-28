import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class amx {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wy.c("commands.damage.invulnerable"));

   public static void a(CommandDispatcher<ej> $$0, ef $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("damage").requires($$0x -> $$0x.c(2)))
            .then(
               ek.a("target", ew.a())
                  .then(
                     ((RequiredArgumentBuilder)ek.a("amount", FloatArgumentType.floatArg(0.0F))
                           .executes(
                              $$0x -> a(
                                    (ej)$$0x.getSource(), ew.a($$0x, "target"), FloatArgumentType.getFloat($$0x, "amount"), ((ej)$$0x.getSource()).e().al().p()
                                 )
                           ))
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ek.a("damageType", fi.a($$1, mh.aN))
                                    .executes(
                                       $$0x -> a(
                                             (ej)$$0x.getSource(),
                                             ew.a($$0x, "target"),
                                             FloatArgumentType.getFloat($$0x, "amount"),
                                             new bux(fi.a($$0x, "damageType", mh.aN))
                                          )
                                    ))
                                 .then(
                                    ek.a("at")
                                       .then(
                                          ek.a("location", gn.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ej)$$0x.getSource(),
                                                      ew.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new bux(fi.a($$0x, "damageType", mh.aN), gn.a($$0x, "location"))
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ek.a("by")
                                    .then(
                                       ((RequiredArgumentBuilder)ek.a("entity", ew.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ej)$$0x.getSource(),
                                                      ew.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new bux(fi.a($$0x, "damageType", mh.aN), ew.a($$0x, "entity"))
                                                   )
                                             ))
                                          .then(
                                             ek.a("from")
                                                .then(
                                                   ek.a("cause", ew.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ej)$$0x.getSource(),
                                                               ew.a($$0x, "target"),
                                                               FloatArgumentType.getFloat($$0x, "amount"),
                                                               new bux(fi.a($$0x, "damageType", mh.aN), ew.a($$0x, "entity"), ew.a($$0x, "cause"))
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

   private static int a(ej $$0, bwi $$1, float $$2, bux $$3) throws CommandSyntaxException {
      if ($$1.a($$0.e(), $$3, $$2)) {
         $$0.a(() -> wy.a("commands.damage.success", $$2, $$1.m_()), true);
         return 1;
      } else {
         throw a.create();
      }
   }
}

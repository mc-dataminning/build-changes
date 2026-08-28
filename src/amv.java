import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class amv {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("commands.damage.invulnerable"));

   public static void a(CommandDispatcher<eu> $$0, eq $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("damage").requires($$0x -> $$0x.c(2)))
            .then(
               ev.a("target", fh.a())
                  .then(
                     ((RequiredArgumentBuilder)ev.a("amount", FloatArgumentType.floatArg(0.0F))
                           .executes(
                              $$0x -> a(
                                    (eu)$$0x.getSource(), fh.a($$0x, "target"), FloatArgumentType.getFloat($$0x, "amount"), ((eu)$$0x.getSource()).e().ak().p()
                                 )
                           ))
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ev.a("damageType", ft.a($$1, lw.s))
                                    .executes(
                                       $$0x -> a(
                                             (eu)$$0x.getSource(),
                                             fh.a($$0x, "target"),
                                             FloatArgumentType.getFloat($$0x, "amount"),
                                             new bsj(ft.a($$0x, "damageType", lw.s))
                                          )
                                    ))
                                 .then(
                                    ev.a("at")
                                       .then(
                                          ev.a("location", gx.a())
                                             .executes(
                                                $$0x -> a(
                                                      (eu)$$0x.getSource(),
                                                      fh.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new bsj(ft.a($$0x, "damageType", lw.s), gx.a($$0x, "location"))
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ev.a("by")
                                    .then(
                                       ((RequiredArgumentBuilder)ev.a("entity", fh.a())
                                             .executes(
                                                $$0x -> a(
                                                      (eu)$$0x.getSource(),
                                                      fh.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new bsj(ft.a($$0x, "damageType", lw.s), fh.a($$0x, "entity"))
                                                   )
                                             ))
                                          .then(
                                             ev.a("from")
                                                .then(
                                                   ev.a("cause", fh.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (eu)$$0x.getSource(),
                                                               fh.a($$0x, "target"),
                                                               FloatArgumentType.getFloat($$0x, "amount"),
                                                               new bsj(ft.a($$0x, "damageType", lw.s), fh.a($$0x, "entity"), fh.a($$0x, "cause"))
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

   private static int a(eu $$0, btr $$1, float $$2, bsj $$3) throws CommandSyntaxException {
      if ($$1.a($$3, $$2)) {
         $$0.a(() -> xe.a("commands.damage.success", $$2, $$1.R_()), true);
         return 1;
      } else {
         throw a.create();
      }
   }
}

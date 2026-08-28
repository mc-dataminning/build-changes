import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class ana {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xj.c("commands.damage.invulnerable"));

   public static void a(CommandDispatcher<ew> $$0, es $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("damage").requires($$0x -> $$0x.c(2)))
            .then(
               ex.a("target", fj.a())
                  .then(
                     ((RequiredArgumentBuilder)ex.a("amount", FloatArgumentType.floatArg(0.0F))
                           .executes(
                              $$0x -> a(
                                    (ew)$$0x.getSource(), fj.a($$0x, "target"), FloatArgumentType.getFloat($$0x, "amount"), ((ew)$$0x.getSource()).e().ai().p()
                                 )
                           ))
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ex.a("damageType", fv.a($$1, ma.s))
                                    .executes(
                                       $$0x -> a(
                                             (ew)$$0x.getSource(),
                                             fj.a($$0x, "target"),
                                             FloatArgumentType.getFloat($$0x, "amount"),
                                             new btb(fv.a($$0x, "damageType", ma.s))
                                          )
                                    ))
                                 .then(
                                    ex.a("at")
                                       .then(
                                          ex.a("location", gz.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ew)$$0x.getSource(),
                                                      fj.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new btb(fv.a($$0x, "damageType", ma.s), gz.a($$0x, "location"))
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ex.a("by")
                                    .then(
                                       ((RequiredArgumentBuilder)ex.a("entity", fj.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ew)$$0x.getSource(),
                                                      fj.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new btb(fv.a($$0x, "damageType", ma.s), fj.a($$0x, "entity"))
                                                   )
                                             ))
                                          .then(
                                             ex.a("from")
                                                .then(
                                                   ex.a("cause", fj.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ew)$$0x.getSource(),
                                                               fj.a($$0x, "target"),
                                                               FloatArgumentType.getFloat($$0x, "amount"),
                                                               new btb(fv.a($$0x, "damageType", ma.s), fj.a($$0x, "entity"), fj.a($$0x, "cause"))
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

   private static int a(ew $$0, bul $$1, float $$2, btb $$3) throws CommandSyntaxException {
      if ($$1.a($$0.e(), $$3, $$2)) {
         $$0.a(() -> xj.a("commands.damage.success", $$2, $$1.o_()), true);
         return 1;
      } else {
         throw a.create();
      }
   }
}

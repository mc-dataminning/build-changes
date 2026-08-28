import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class amu {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wv.c("commands.damage.invulnerable"));

   public static void a(CommandDispatcher<ex> $$0, et $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("damage").requires($$0x -> $$0x.c(2)))
            .then(
               ey.a("target", fk.a())
                  .then(
                     ((RequiredArgumentBuilder)ey.a("amount", FloatArgumentType.floatArg(0.0F))
                           .executes(
                              $$0x -> a(
                                    (ex)$$0x.getSource(), fk.a($$0x, "target"), FloatArgumentType.getFloat($$0x, "amount"), ((ex)$$0x.getSource()).e().al().p()
                                 )
                           ))
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ey.a("damageType", fw.a($$1, me.s))
                                    .executes(
                                       $$0x -> a(
                                             (ex)$$0x.getSource(),
                                             fk.a($$0x, "target"),
                                             FloatArgumentType.getFloat($$0x, "amount"),
                                             new buh(fw.a($$0x, "damageType", me.s))
                                          )
                                    ))
                                 .then(
                                    ey.a("at")
                                       .then(
                                          ey.a("location", hb.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ex)$$0x.getSource(),
                                                      fk.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new buh(fw.a($$0x, "damageType", me.s), hb.a($$0x, "location"))
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ey.a("by")
                                    .then(
                                       ((RequiredArgumentBuilder)ey.a("entity", fk.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ex)$$0x.getSource(),
                                                      fk.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new buh(fw.a($$0x, "damageType", me.s), fk.a($$0x, "entity"))
                                                   )
                                             ))
                                          .then(
                                             ey.a("from")
                                                .then(
                                                   ey.a("cause", fk.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ex)$$0x.getSource(),
                                                               fk.a($$0x, "target"),
                                                               FloatArgumentType.getFloat($$0x, "amount"),
                                                               new buh(fw.a($$0x, "damageType", me.s), fk.a($$0x, "entity"), fk.a($$0x, "cause"))
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

   private static int a(ex $$0, bvs $$1, float $$2, buh $$3) throws CommandSyntaxException {
      if ($$1.a($$0.e(), $$3, $$2)) {
         $$0.a(() -> wv.a("commands.damage.success", $$2, $$1.m_()), true);
         return 1;
      } else {
         throw a.create();
      }
   }
}

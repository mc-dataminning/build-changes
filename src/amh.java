import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class amh {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wz.c("commands.damage.invulnerable"));

   public static void a(CommandDispatcher<et> $$0, ep $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("damage").requires($$0x -> $$0x.c(2)))
            .then(
               eu.a("target", fg.a())
                  .then(
                     ((RequiredArgumentBuilder)eu.a("amount", FloatArgumentType.floatArg(0.0F))
                           .executes(
                              $$0x -> a(
                                    (et)$$0x.getSource(), fg.a($$0x, "target"), FloatArgumentType.getFloat($$0x, "amount"), ((et)$$0x.getSource()).e().aj().o()
                                 )
                           ))
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)eu.a("damageType", fs.a($$1, lu.s))
                                    .executes(
                                       $$0x -> a(
                                             (et)$$0x.getSource(),
                                             fg.a($$0x, "target"),
                                             FloatArgumentType.getFloat($$0x, "amount"),
                                             new brk(fs.a($$0x, "damageType", lu.s))
                                          )
                                    ))
                                 .then(
                                    eu.a("at")
                                       .then(
                                          eu.a("location", gw.a())
                                             .executes(
                                                $$0x -> a(
                                                      (et)$$0x.getSource(),
                                                      fg.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new brk(fs.a($$0x, "damageType", lu.s), gw.a($$0x, "location"))
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 eu.a("by")
                                    .then(
                                       ((RequiredArgumentBuilder)eu.a("entity", fg.a())
                                             .executes(
                                                $$0x -> a(
                                                      (et)$$0x.getSource(),
                                                      fg.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new brk(fs.a($$0x, "damageType", lu.s), fg.a($$0x, "entity"))
                                                   )
                                             ))
                                          .then(
                                             eu.a("from")
                                                .then(
                                                   eu.a("cause", fg.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (et)$$0x.getSource(),
                                                               fg.a($$0x, "target"),
                                                               FloatArgumentType.getFloat($$0x, "amount"),
                                                               new brk(fs.a($$0x, "damageType", lu.s), fg.a($$0x, "entity"), fg.a($$0x, "cause"))
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

   private static int a(et $$0, bsr $$1, float $$2, brk $$3) throws CommandSyntaxException {
      if ($$1.a($$3, $$2)) {
         $$0.a(() -> wz.a("commands.damage.success", $$2, $$1.S_()), true);
         return 1;
      } else {
         throw a.create();
      }
   }
}

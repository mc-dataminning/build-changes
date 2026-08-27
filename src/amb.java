import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class amb {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wx.c("commands.damage.invulnerable"));

   public static void a(CommandDispatcher<ee> $$0, ea $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("damage").requires($$0x -> $$0x.c(2)))
            .then(
               ef.a("target", er.a())
                  .then(
                     ((RequiredArgumentBuilder)ef.a("amount", FloatArgumentType.floatArg(0.0F))
                           .executes(
                              $$0x -> a(
                                    (ee)$$0x.getSource(), er.a($$0x, "target"), FloatArgumentType.getFloat($$0x, "amount"), ((ee)$$0x.getSource()).e().ai().n()
                                 )
                           ))
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ef.a("damageType", fd.a($$1, lf.s))
                                    .executes(
                                       $$0x -> a(
                                             (ee)$$0x.getSource(),
                                             er.a($$0x, "target"),
                                             FloatArgumentType.getFloat($$0x, "amount"),
                                             new bqn(fd.a($$0x, "damageType", lf.s))
                                          )
                                    ))
                                 .then(
                                    ef.a("at")
                                       .then(
                                          ef.a("location", gh.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ee)$$0x.getSource(),
                                                      er.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new bqn(fd.a($$0x, "damageType", lf.s), gh.a($$0x, "location"))
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ef.a("by")
                                    .then(
                                       ((RequiredArgumentBuilder)ef.a("entity", er.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ee)$$0x.getSource(),
                                                      er.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new bqn(fd.a($$0x, "damageType", lf.s), er.a($$0x, "entity"))
                                                   )
                                             ))
                                          .then(
                                             ef.a("from")
                                                .then(
                                                   ef.a("cause", er.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ee)$$0x.getSource(),
                                                               er.a($$0x, "target"),
                                                               FloatArgumentType.getFloat($$0x, "amount"),
                                                               new bqn(fd.a($$0x, "damageType", lf.s), er.a($$0x, "entity"), er.a($$0x, "cause"))
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

   private static int a(ee $$0, bru $$1, float $$2, bqn $$3) throws CommandSyntaxException {
      if ($$1.a($$3, $$2)) {
         $$0.a(() -> wx.a("commands.damage.success", $$2, $$1.O_()), true);
         return 1;
      } else {
         throw a.create();
      }
   }
}

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class aiu {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vf.c("commands.damage.invulnerable"));

   public static void a(CommandDispatcher<ds> $$0, dn $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("damage").requires($$0x -> $$0x.c(2)))
            .then(
               dt.a("target", ef.a())
                  .then(
                     ((RequiredArgumentBuilder)dt.a("amount", FloatArgumentType.floatArg(0.0F))
                           .executes(
                              $$0x -> a(
                                    (ds)$$0x.getSource(), ef.a($$0x, "target"), FloatArgumentType.getFloat($$0x, "amount"), ((ds)$$0x.getSource()).e().ai().n()
                                 )
                           ))
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("damageType", er.a($$1, ke.r))
                                    .executes(
                                       $$0x -> a(
                                             (ds)$$0x.getSource(),
                                             ef.a($$0x, "target"),
                                             FloatArgumentType.getFloat($$0x, "amount"),
                                             new bks(er.a($$0x, "damageType", ke.r))
                                          )
                                    ))
                                 .then(
                                    dt.a("at")
                                       .then(
                                          dt.a("location", ft.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ds)$$0x.getSource(),
                                                      ef.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new bks(er.a($$0x, "damageType", ke.r), ft.a($$0x, "location"))
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 dt.a("by")
                                    .then(
                                       ((RequiredArgumentBuilder)dt.a("entity", ef.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ds)$$0x.getSource(),
                                                      ef.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new bks(er.a($$0x, "damageType", ke.r), ef.a($$0x, "entity"))
                                                   )
                                             ))
                                          .then(
                                             dt.a("from")
                                                .then(
                                                   dt.a("cause", ef.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ds)$$0x.getSource(),
                                                               ef.a($$0x, "target"),
                                                               FloatArgumentType.getFloat($$0x, "amount"),
                                                               new bks(er.a($$0x, "damageType", ke.r), ef.a($$0x, "entity"), ef.a($$0x, "cause"))
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

   private static int a(ds $$0, blu $$1, float $$2, bks $$3) throws CommandSyntaxException {
      if ($$1.a($$3, $$2)) {
         $$0.a(() -> vf.a("commands.damage.success", $$2, $$1.Q_()), true);
         return 1;
      } else {
         throw a.create();
      }
   }
}

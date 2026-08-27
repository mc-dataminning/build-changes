import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class ami {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("commands.damage.invulnerable"));

   public static void a(CommandDispatcher<eh> $$0, ed $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("damage").requires($$0x -> $$0x.c(2)))
            .then(
               ei.a("target", eu.a())
                  .then(
                     ((RequiredArgumentBuilder)ei.a("amount", FloatArgumentType.floatArg(0.0F))
                           .executes(
                              $$0x -> a(
                                    (eh)$$0x.getSource(), eu.a($$0x, "target"), FloatArgumentType.getFloat($$0x, "amount"), ((eh)$$0x.getSource()).e().aj().o()
                                 )
                           ))
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ei.a("damageType", fg.a($$1, li.s))
                                    .executes(
                                       $$0x -> a(
                                             (eh)$$0x.getSource(),
                                             eu.a($$0x, "target"),
                                             FloatArgumentType.getFloat($$0x, "amount"),
                                             new bqt(fg.a($$0x, "damageType", li.s))
                                          )
                                    ))
                                 .then(
                                    ei.a("at")
                                       .then(
                                          ei.a("location", gk.a())
                                             .executes(
                                                $$0x -> a(
                                                      (eh)$$0x.getSource(),
                                                      eu.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new bqt(fg.a($$0x, "damageType", li.s), gk.a($$0x, "location"))
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ei.a("by")
                                    .then(
                                       ((RequiredArgumentBuilder)ei.a("entity", eu.a())
                                             .executes(
                                                $$0x -> a(
                                                      (eh)$$0x.getSource(),
                                                      eu.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new bqt(fg.a($$0x, "damageType", li.s), eu.a($$0x, "entity"))
                                                   )
                                             ))
                                          .then(
                                             ei.a("from")
                                                .then(
                                                   ei.a("cause", eu.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (eh)$$0x.getSource(),
                                                               eu.a($$0x, "target"),
                                                               FloatArgumentType.getFloat($$0x, "amount"),
                                                               new bqt(fg.a($$0x, "damageType", li.s), eu.a($$0x, "entity"), eu.a($$0x, "cause"))
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

   private static int a(eh $$0, brv $$1, float $$2, bqt $$3) throws CommandSyntaxException {
      if ($$1.a($$3, $$2)) {
         $$0.a(() -> xe.a("commands.damage.success", $$2, $$1.P_()), true);
         return 1;
      } else {
         throw a.create();
      }
   }
}

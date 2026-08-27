import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class agc {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(te.c("commands.damage.invulnerable"));

   public static void a(CommandDispatcher<ds> $$0, dm $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("damage").requires($$0x -> $$0x.c(2)))
            .then(
               dt.a("target", ed.a())
                  .then(
                     ((RequiredArgumentBuilder)dt.a("amount", FloatArgumentType.floatArg(0.0F))
                           .executes(
                              $$0x -> a(
                                    (ds)$$0x.getSource(), ed.a($$0x, "target"), FloatArgumentType.getFloat($$0x, "amount"), ((ds)$$0x.getSource()).e().ag().n()
                                 )
                           ))
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("damageType", ep.a($$1, jd.p))
                                    .executes(
                                       $$0x -> a(
                                             (ds)$$0x.getSource(),
                                             ed.a($$0x, "target"),
                                             FloatArgumentType.getFloat($$0x, "amount"),
                                             new bhe(ep.a($$0x, "damageType", jd.p))
                                          )
                                    ))
                                 .then(
                                    dt.a("at")
                                       .then(
                                          dt.a("location", fq.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ds)$$0x.getSource(),
                                                      ed.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new bhe(ep.a($$0x, "damageType", jd.p), fq.a($$0x, "location"))
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 dt.a("by")
                                    .then(
                                       ((RequiredArgumentBuilder)dt.a("entity", ed.a())
                                             .executes(
                                                $$0x -> a(
                                                      (ds)$$0x.getSource(),
                                                      ed.a($$0x, "target"),
                                                      FloatArgumentType.getFloat($$0x, "amount"),
                                                      new bhe(ep.a($$0x, "damageType", jd.p), ed.a($$0x, "entity"))
                                                   )
                                             ))
                                          .then(
                                             dt.a("from")
                                                .then(
                                                   dt.a("cause", ed.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ds)$$0x.getSource(),
                                                               ed.a($$0x, "target"),
                                                               FloatArgumentType.getFloat($$0x, "amount"),
                                                               new bhe(ep.a($$0x, "damageType", jd.p), ed.a($$0x, "entity"), ed.a($$0x, "cause"))
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

   private static int a(ds $$0, big $$1, float $$2, bhe $$3) throws CommandSyntaxException {
      if ($$1.a($$3, $$2)) {
         $$0.a(() -> te.a("commands.damage.success", $$2, $$1.H_()), true);
         return 1;
      } else {
         throw a.create();
      }
   }
}

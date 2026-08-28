import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class anu {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wp.c("commands.particle.failed"));

   public static void a(CommandDispatcher<ex> $$0, et $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("particle").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ey.a("name", fu.a($$1))
                     .executes(
                        $$0x -> a(
                              (ex)$$0x.getSource(), fu.a($$0x, "name"), ((ex)$$0x.getSource()).d(), faz.c, 0.0F, 0, false, ((ex)$$0x.getSource()).l().ag().t()
                           )
                     ))
                  .then(
                     ((RequiredArgumentBuilder)ey.a("pos", ha.a())
                           .executes(
                              $$0x -> a((ex)$$0x.getSource(), fu.a($$0x, "name"), ha.a($$0x, "pos"), faz.c, 0.0F, 0, false, ((ex)$$0x.getSource()).l().ag().t())
                           ))
                        .then(
                           ey.a("delta", ha.a(false))
                              .then(
                                 ey.a("speed", FloatArgumentType.floatArg(0.0F))
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ey.a("count", IntegerArgumentType.integer(0))
                                                .executes(
                                                   $$0x -> a(
                                                         (ex)$$0x.getSource(),
                                                         fu.a($$0x, "name"),
                                                         ha.a($$0x, "pos"),
                                                         ha.a($$0x, "delta"),
                                                         FloatArgumentType.getFloat($$0x, "speed"),
                                                         IntegerArgumentType.getInteger($$0x, "count"),
                                                         false,
                                                         ((ex)$$0x.getSource()).l().ag().t()
                                                      )
                                                ))
                                             .then(
                                                ((LiteralArgumentBuilder)ey.a("force")
                                                      .executes(
                                                         $$0x -> a(
                                                               (ex)$$0x.getSource(),
                                                               fu.a($$0x, "name"),
                                                               ha.a($$0x, "pos"),
                                                               ha.a($$0x, "delta"),
                                                               FloatArgumentType.getFloat($$0x, "speed"),
                                                               IntegerArgumentType.getInteger($$0x, "count"),
                                                               true,
                                                               ((ex)$$0x.getSource()).l().ag().t()
                                                            )
                                                      ))
                                                   .then(
                                                      ey.a("viewers", fk.d())
                                                         .executes(
                                                            $$0x -> a(
                                                                  (ex)$$0x.getSource(),
                                                                  fu.a($$0x, "name"),
                                                                  ha.a($$0x, "pos"),
                                                                  ha.a($$0x, "delta"),
                                                                  FloatArgumentType.getFloat($$0x, "speed"),
                                                                  IntegerArgumentType.getInteger($$0x, "count"),
                                                                  true,
                                                                  fk.f($$0x, "viewers")
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)ey.a("normal")
                                                   .executes(
                                                      $$0x -> a(
                                                            (ex)$$0x.getSource(),
                                                            fu.a($$0x, "name"),
                                                            ha.a($$0x, "pos"),
                                                            ha.a($$0x, "delta"),
                                                            FloatArgumentType.getFloat($$0x, "speed"),
                                                            IntegerArgumentType.getInteger($$0x, "count"),
                                                            false,
                                                            ((ex)$$0x.getSource()).l().ag().t()
                                                         )
                                                   ))
                                                .then(
                                                   ey.a("viewers", fk.d())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ex)$$0x.getSource(),
                                                               fu.a($$0x, "name"),
                                                               ha.a($$0x, "pos"),
                                                               ha.a($$0x, "delta"),
                                                               FloatArgumentType.getFloat($$0x, "speed"),
                                                               IntegerArgumentType.getInteger($$0x, "count"),
                                                               false,
                                                               fk.f($$0x, "viewers")
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

   private static int a(ex $$0, lr $$1, faz $$2, faz $$3, float $$4, int $$5, boolean $$6, Collection<are> $$7) throws CommandSyntaxException {
      int $$8 = 0;

      for (are $$9 : $$7) {
         if ($$0.e().a($$9, $$1, $$6, false, $$2.d, $$2.e, $$2.f, $$5, $$3.d, $$3.e, $$3.f, (double)$$4)) {
            $$8++;
         }
      }

      if ($$8 == 0) {
         throw a.create();
      } else {
         $$0.a(() -> wp.a("commands.particle.success", mb.i.b($$1.a()).toString()), true);
         return $$8;
      }
   }
}

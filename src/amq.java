import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class amq {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wi.c("commands.particle.failed"));

   public static void a(CommandDispatcher<dv> $$0, dr $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("particle").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)dw.a("name", es.a($$1))
                     .executes(
                        $$0x -> a(
                              (dv)$$0x.getSource(), es.a($$0x, "name"), ((dv)$$0x.getSource()).d(), esj.b, 0.0F, 0, false, ((dv)$$0x.getSource()).l().ah().t()
                           )
                     ))
                  .then(
                     ((RequiredArgumentBuilder)dw.a("pos", fx.a())
                           .executes(
                              $$0x -> a((dv)$$0x.getSource(), es.a($$0x, "name"), fx.a($$0x, "pos"), esj.b, 0.0F, 0, false, ((dv)$$0x.getSource()).l().ah().t())
                           ))
                        .then(
                           dw.a("delta", fx.a(false))
                              .then(
                                 dw.a("speed", FloatArgumentType.floatArg(0.0F))
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dw.a("count", IntegerArgumentType.integer(0))
                                                .executes(
                                                   $$0x -> a(
                                                         (dv)$$0x.getSource(),
                                                         es.a($$0x, "name"),
                                                         fx.a($$0x, "pos"),
                                                         fx.a($$0x, "delta"),
                                                         FloatArgumentType.getFloat($$0x, "speed"),
                                                         IntegerArgumentType.getInteger($$0x, "count"),
                                                         false,
                                                         ((dv)$$0x.getSource()).l().ah().t()
                                                      )
                                                ))
                                             .then(
                                                ((LiteralArgumentBuilder)dw.a("force")
                                                      .executes(
                                                         $$0x -> a(
                                                               (dv)$$0x.getSource(),
                                                               es.a($$0x, "name"),
                                                               fx.a($$0x, "pos"),
                                                               fx.a($$0x, "delta"),
                                                               FloatArgumentType.getFloat($$0x, "speed"),
                                                               IntegerArgumentType.getInteger($$0x, "count"),
                                                               true,
                                                               ((dv)$$0x.getSource()).l().ah().t()
                                                            )
                                                      ))
                                                   .then(
                                                      dw.a("viewers", ei.d())
                                                         .executes(
                                                            $$0x -> a(
                                                                  (dv)$$0x.getSource(),
                                                                  es.a($$0x, "name"),
                                                                  fx.a($$0x, "pos"),
                                                                  fx.a($$0x, "delta"),
                                                                  FloatArgumentType.getFloat($$0x, "speed"),
                                                                  IntegerArgumentType.getInteger($$0x, "count"),
                                                                  true,
                                                                  ei.f($$0x, "viewers")
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)dw.a("normal")
                                                   .executes(
                                                      $$0x -> a(
                                                            (dv)$$0x.getSource(),
                                                            es.a($$0x, "name"),
                                                            fx.a($$0x, "pos"),
                                                            fx.a($$0x, "delta"),
                                                            FloatArgumentType.getFloat($$0x, "speed"),
                                                            IntegerArgumentType.getInteger($$0x, "count"),
                                                            false,
                                                            ((dv)$$0x.getSource()).l().ah().t()
                                                         )
                                                   ))
                                                .then(
                                                   dw.a("viewers", ei.d())
                                                      .executes(
                                                         $$0x -> a(
                                                               (dv)$$0x.getSource(),
                                                               es.a($$0x, "name"),
                                                               fx.a($$0x, "pos"),
                                                               fx.a($$0x, "delta"),
                                                               FloatArgumentType.getFloat($$0x, "speed"),
                                                               IntegerArgumentType.getInteger($$0x, "count"),
                                                               false,
                                                               ei.f($$0x, "viewers")
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

   private static int a(dv $$0, kl $$1, esj $$2, esj $$3, float $$4, int $$5, boolean $$6, Collection<apv> $$7) throws CommandSyntaxException {
      int $$8 = 0;

      for (apv $$9 : $$7) {
         if ($$0.e().a($$9, $$1, $$6, $$2.c, $$2.d, $$2.e, $$5, $$3.c, $$3.d, $$3.e, (double)$$4)) {
            $$8++;
         }
      }

      if ($$8 == 0) {
         throw a.create();
      } else {
         $$0.a(() -> wi.a("commands.particle.success", kt.j.b($$1.a()).toString()), true);
         return $$8;
      }
   }
}

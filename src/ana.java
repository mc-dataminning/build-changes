import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class ana {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ws.c("commands.particle.failed"));

   public static void a(CommandDispatcher<ec> $$0, dy $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("particle").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ed.a("name", ez.a($$1))
                     .executes(
                        $$0x -> a(
                              (ec)$$0x.getSource(), ez.a($$0x, "name"), ((ec)$$0x.getSource()).d(), etf.b, 0.0F, 0, false, ((ec)$$0x.getSource()).l().ah().t()
                           )
                     ))
                  .then(
                     ((RequiredArgumentBuilder)ed.a("pos", ge.a())
                           .executes(
                              $$0x -> a((ec)$$0x.getSource(), ez.a($$0x, "name"), ge.a($$0x, "pos"), etf.b, 0.0F, 0, false, ((ec)$$0x.getSource()).l().ah().t())
                           ))
                        .then(
                           ed.a("delta", ge.a(false))
                              .then(
                                 ed.a("speed", FloatArgumentType.floatArg(0.0F))
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ed.a("count", IntegerArgumentType.integer(0))
                                                .executes(
                                                   $$0x -> a(
                                                         (ec)$$0x.getSource(),
                                                         ez.a($$0x, "name"),
                                                         ge.a($$0x, "pos"),
                                                         ge.a($$0x, "delta"),
                                                         FloatArgumentType.getFloat($$0x, "speed"),
                                                         IntegerArgumentType.getInteger($$0x, "count"),
                                                         false,
                                                         ((ec)$$0x.getSource()).l().ah().t()
                                                      )
                                                ))
                                             .then(
                                                ((LiteralArgumentBuilder)ed.a("force")
                                                      .executes(
                                                         $$0x -> a(
                                                               (ec)$$0x.getSource(),
                                                               ez.a($$0x, "name"),
                                                               ge.a($$0x, "pos"),
                                                               ge.a($$0x, "delta"),
                                                               FloatArgumentType.getFloat($$0x, "speed"),
                                                               IntegerArgumentType.getInteger($$0x, "count"),
                                                               true,
                                                               ((ec)$$0x.getSource()).l().ah().t()
                                                            )
                                                      ))
                                                   .then(
                                                      ed.a("viewers", ep.d())
                                                         .executes(
                                                            $$0x -> a(
                                                                  (ec)$$0x.getSource(),
                                                                  ez.a($$0x, "name"),
                                                                  ge.a($$0x, "pos"),
                                                                  ge.a($$0x, "delta"),
                                                                  FloatArgumentType.getFloat($$0x, "speed"),
                                                                  IntegerArgumentType.getInteger($$0x, "count"),
                                                                  true,
                                                                  ep.f($$0x, "viewers")
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)ed.a("normal")
                                                   .executes(
                                                      $$0x -> a(
                                                            (ec)$$0x.getSource(),
                                                            ez.a($$0x, "name"),
                                                            ge.a($$0x, "pos"),
                                                            ge.a($$0x, "delta"),
                                                            FloatArgumentType.getFloat($$0x, "speed"),
                                                            IntegerArgumentType.getInteger($$0x, "count"),
                                                            false,
                                                            ((ec)$$0x.getSource()).l().ah().t()
                                                         )
                                                   ))
                                                .then(
                                                   ed.a("viewers", ep.d())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ec)$$0x.getSource(),
                                                               ez.a($$0x, "name"),
                                                               ge.a($$0x, "pos"),
                                                               ge.a($$0x, "delta"),
                                                               FloatArgumentType.getFloat($$0x, "speed"),
                                                               IntegerArgumentType.getInteger($$0x, "count"),
                                                               false,
                                                               ep.f($$0x, "viewers")
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

   private static int a(ec $$0, ku $$1, etf $$2, etf $$3, float $$4, int $$5, boolean $$6, Collection<aqf> $$7) throws CommandSyntaxException {
      int $$8 = 0;

      for (aqf $$9 : $$7) {
         if ($$0.e().a($$9, $$1, $$6, $$2.c, $$2.d, $$2.e, $$5, $$3.c, $$3.d, $$3.e, (double)$$4)) {
            $$8++;
         }
      }

      if ($$8 == 0) {
         throw a.create();
      } else {
         $$0.a(() -> ws.a("commands.particle.success", lc.j.b($$1.a()).toString()), true);
         return $$8;
      }
   }
}

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class aor {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xg.c("commands.particle.failed"));

   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("particle").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)el.a("name", fh.a($$1))
                     .executes(
                        $$0x -> a(
                              (ek)$$0x.getSource(), fh.a($$0x, "name"), ((ek)$$0x.getSource()).d(), fgc.c, 0.0F, 0, false, ((ek)$$0x.getSource()).l().ag().t()
                           )
                     ))
                  .then(
                     ((RequiredArgumentBuilder)el.a("pos", go.a())
                           .executes(
                              $$0x -> a((ek)$$0x.getSource(), fh.a($$0x, "name"), go.a($$0x, "pos"), fgc.c, 0.0F, 0, false, ((ek)$$0x.getSource()).l().ag().t())
                           ))
                        .then(
                           el.a("delta", go.a(false))
                              .then(
                                 el.a("speed", FloatArgumentType.floatArg(0.0F))
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)el.a("count", IntegerArgumentType.integer(0))
                                                .executes(
                                                   $$0x -> a(
                                                         (ek)$$0x.getSource(),
                                                         fh.a($$0x, "name"),
                                                         go.a($$0x, "pos"),
                                                         go.a($$0x, "delta"),
                                                         FloatArgumentType.getFloat($$0x, "speed"),
                                                         IntegerArgumentType.getInteger($$0x, "count"),
                                                         false,
                                                         ((ek)$$0x.getSource()).l().ag().t()
                                                      )
                                                ))
                                             .then(
                                                ((LiteralArgumentBuilder)el.a("force")
                                                      .executes(
                                                         $$0x -> a(
                                                               (ek)$$0x.getSource(),
                                                               fh.a($$0x, "name"),
                                                               go.a($$0x, "pos"),
                                                               go.a($$0x, "delta"),
                                                               FloatArgumentType.getFloat($$0x, "speed"),
                                                               IntegerArgumentType.getInteger($$0x, "count"),
                                                               true,
                                                               ((ek)$$0x.getSource()).l().ag().t()
                                                            )
                                                      ))
                                                   .then(
                                                      el.a("viewers", ex.d())
                                                         .executes(
                                                            $$0x -> a(
                                                                  (ek)$$0x.getSource(),
                                                                  fh.a($$0x, "name"),
                                                                  go.a($$0x, "pos"),
                                                                  go.a($$0x, "delta"),
                                                                  FloatArgumentType.getFloat($$0x, "speed"),
                                                                  IntegerArgumentType.getInteger($$0x, "count"),
                                                                  true,
                                                                  ex.f($$0x, "viewers")
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)el.a("normal")
                                                   .executes(
                                                      $$0x -> a(
                                                            (ek)$$0x.getSource(),
                                                            fh.a($$0x, "name"),
                                                            go.a($$0x, "pos"),
                                                            go.a($$0x, "delta"),
                                                            FloatArgumentType.getFloat($$0x, "speed"),
                                                            IntegerArgumentType.getInteger($$0x, "count"),
                                                            false,
                                                            ((ek)$$0x.getSource()).l().ag().t()
                                                         )
                                                   ))
                                                .then(
                                                   el.a("viewers", ex.d())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ek)$$0x.getSource(),
                                                               fh.a($$0x, "name"),
                                                               go.a($$0x, "pos"),
                                                               go.a($$0x, "delta"),
                                                               FloatArgumentType.getFloat($$0x, "speed"),
                                                               IntegerArgumentType.getInteger($$0x, "count"),
                                                               false,
                                                               ex.f($$0x, "viewers")
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

   private static int a(ek $$0, lx $$1, fgc $$2, fgc $$3, float $$4, int $$5, boolean $$6, Collection<asc> $$7) throws CommandSyntaxException {
      int $$8 = 0;

      for (asc $$9 : $$7) {
         if ($$0.e().a($$9, $$1, $$6, false, $$2.d, $$2.e, $$2.f, $$5, $$3.d, $$3.e, $$3.f, (double)$$4)) {
            $$8++;
         }
      }

      if ($$8 == 0) {
         throw a.create();
      } else {
         $$0.a(() -> xg.a("commands.particle.success", mh.i.b($$1.a()).toString()), true);
         return $$8;
      }
   }
}

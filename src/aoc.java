import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class aoc {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("commands.particle.failed"));

   public static void a(CommandDispatcher<eu> $$0, eq $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("particle").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ev.a("name", fr.a($$1))
                     .executes(
                        $$0x -> a(
                              (eu)$$0x.getSource(), fr.a($$0x, "name"), ((eu)$$0x.getSource()).d(), eyw.c, 0.0F, 0, false, ((eu)$$0x.getSource()).l().ag().t()
                           )
                     ))
                  .then(
                     ((RequiredArgumentBuilder)ev.a("pos", gx.a())
                           .executes(
                              $$0x -> a((eu)$$0x.getSource(), fr.a($$0x, "name"), gx.a($$0x, "pos"), eyw.c, 0.0F, 0, false, ((eu)$$0x.getSource()).l().ag().t())
                           ))
                        .then(
                           ev.a("delta", gx.a(false))
                              .then(
                                 ev.a("speed", FloatArgumentType.floatArg(0.0F))
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ev.a("count", IntegerArgumentType.integer(0))
                                                .executes(
                                                   $$0x -> a(
                                                         (eu)$$0x.getSource(),
                                                         fr.a($$0x, "name"),
                                                         gx.a($$0x, "pos"),
                                                         gx.a($$0x, "delta"),
                                                         FloatArgumentType.getFloat($$0x, "speed"),
                                                         IntegerArgumentType.getInteger($$0x, "count"),
                                                         false,
                                                         ((eu)$$0x.getSource()).l().ag().t()
                                                      )
                                                ))
                                             .then(
                                                ((LiteralArgumentBuilder)ev.a("force")
                                                      .executes(
                                                         $$0x -> a(
                                                               (eu)$$0x.getSource(),
                                                               fr.a($$0x, "name"),
                                                               gx.a($$0x, "pos"),
                                                               gx.a($$0x, "delta"),
                                                               FloatArgumentType.getFloat($$0x, "speed"),
                                                               IntegerArgumentType.getInteger($$0x, "count"),
                                                               true,
                                                               ((eu)$$0x.getSource()).l().ag().t()
                                                            )
                                                      ))
                                                   .then(
                                                      ev.a("viewers", fh.d())
                                                         .executes(
                                                            $$0x -> a(
                                                                  (eu)$$0x.getSource(),
                                                                  fr.a($$0x, "name"),
                                                                  gx.a($$0x, "pos"),
                                                                  gx.a($$0x, "delta"),
                                                                  FloatArgumentType.getFloat($$0x, "speed"),
                                                                  IntegerArgumentType.getInteger($$0x, "count"),
                                                                  true,
                                                                  fh.f($$0x, "viewers")
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)ev.a("normal")
                                                   .executes(
                                                      $$0x -> a(
                                                            (eu)$$0x.getSource(),
                                                            fr.a($$0x, "name"),
                                                            gx.a($$0x, "pos"),
                                                            gx.a($$0x, "delta"),
                                                            FloatArgumentType.getFloat($$0x, "speed"),
                                                            IntegerArgumentType.getInteger($$0x, "count"),
                                                            false,
                                                            ((eu)$$0x.getSource()).l().ag().t()
                                                         )
                                                   ))
                                                .then(
                                                   ev.a("viewers", fh.d())
                                                      .executes(
                                                         $$0x -> a(
                                                               (eu)$$0x.getSource(),
                                                               fr.a($$0x, "name"),
                                                               gx.a($$0x, "pos"),
                                                               gx.a($$0x, "delta"),
                                                               FloatArgumentType.getFloat($$0x, "speed"),
                                                               IntegerArgumentType.getInteger($$0x, "count"),
                                                               false,
                                                               fh.f($$0x, "viewers")
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

   private static int a(eu $$0, lm $$1, eyw $$2, eyw $$3, float $$4, int $$5, boolean $$6, Collection<ark> $$7) throws CommandSyntaxException {
      int $$8 = 0;

      for (ark $$9 : $$7) {
         if ($$0.e().a($$9, $$1, $$6, $$2.d, $$2.e, $$2.f, $$5, $$3.d, $$3.e, $$3.f, (double)$$4)) {
            $$8++;
         }
      }

      if ($$8 == 0) {
         throw a.create();
      } else {
         $$0.a(() -> xe.a("commands.particle.success", lv.i.b($$1.a()).toString()), true);
         return $$8;
      }
   }
}

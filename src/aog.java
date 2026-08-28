import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class aog {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wy.c("commands.particle.failed"));

   public static void a(CommandDispatcher<ei> $$0, ee $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("particle").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ej.a("name", ff.a($$1))
                     .executes(
                        $$0x -> a(
                              (ei)$$0x.getSource(), ff.a($$0x, "name"), ((ei)$$0x.getSource()).d(), fei.c, 0.0F, 0, false, ((ei)$$0x.getSource()).l().ag().t()
                           )
                     ))
                  .then(
                     ((RequiredArgumentBuilder)ej.a("pos", gm.a())
                           .executes(
                              $$0x -> a((ei)$$0x.getSource(), ff.a($$0x, "name"), gm.a($$0x, "pos"), fei.c, 0.0F, 0, false, ((ei)$$0x.getSource()).l().ag().t())
                           ))
                        .then(
                           ej.a("delta", gm.a(false))
                              .then(
                                 ej.a("speed", FloatArgumentType.floatArg(0.0F))
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ej.a("count", IntegerArgumentType.integer(0))
                                                .executes(
                                                   $$0x -> a(
                                                         (ei)$$0x.getSource(),
                                                         ff.a($$0x, "name"),
                                                         gm.a($$0x, "pos"),
                                                         gm.a($$0x, "delta"),
                                                         FloatArgumentType.getFloat($$0x, "speed"),
                                                         IntegerArgumentType.getInteger($$0x, "count"),
                                                         false,
                                                         ((ei)$$0x.getSource()).l().ag().t()
                                                      )
                                                ))
                                             .then(
                                                ((LiteralArgumentBuilder)ej.a("force")
                                                      .executes(
                                                         $$0x -> a(
                                                               (ei)$$0x.getSource(),
                                                               ff.a($$0x, "name"),
                                                               gm.a($$0x, "pos"),
                                                               gm.a($$0x, "delta"),
                                                               FloatArgumentType.getFloat($$0x, "speed"),
                                                               IntegerArgumentType.getInteger($$0x, "count"),
                                                               true,
                                                               ((ei)$$0x.getSource()).l().ag().t()
                                                            )
                                                      ))
                                                   .then(
                                                      ej.a("viewers", ev.d())
                                                         .executes(
                                                            $$0x -> a(
                                                                  (ei)$$0x.getSource(),
                                                                  ff.a($$0x, "name"),
                                                                  gm.a($$0x, "pos"),
                                                                  gm.a($$0x, "delta"),
                                                                  FloatArgumentType.getFloat($$0x, "speed"),
                                                                  IntegerArgumentType.getInteger($$0x, "count"),
                                                                  true,
                                                                  ev.f($$0x, "viewers")
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)ej.a("normal")
                                                   .executes(
                                                      $$0x -> a(
                                                            (ei)$$0x.getSource(),
                                                            ff.a($$0x, "name"),
                                                            gm.a($$0x, "pos"),
                                                            gm.a($$0x, "delta"),
                                                            FloatArgumentType.getFloat($$0x, "speed"),
                                                            IntegerArgumentType.getInteger($$0x, "count"),
                                                            false,
                                                            ((ei)$$0x.getSource()).l().ag().t()
                                                         )
                                                   ))
                                                .then(
                                                   ej.a("viewers", ev.d())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ei)$$0x.getSource(),
                                                               ff.a($$0x, "name"),
                                                               gm.a($$0x, "pos"),
                                                               gm.a($$0x, "delta"),
                                                               FloatArgumentType.getFloat($$0x, "speed"),
                                                               IntegerArgumentType.getInteger($$0x, "count"),
                                                               false,
                                                               ev.f($$0x, "viewers")
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

   private static int a(ei $$0, lv $$1, fei $$2, fei $$3, float $$4, int $$5, boolean $$6, Collection<arr> $$7) throws CommandSyntaxException {
      int $$8 = 0;

      for (arr $$9 : $$7) {
         if ($$0.e().a($$9, $$1, $$6, false, $$2.d, $$2.e, $$2.f, $$5, $$3.d, $$3.e, $$3.f, (double)$$4)) {
            $$8++;
         }
      }

      if ($$8 == 0) {
         throw a.create();
      } else {
         $$0.a(() -> wy.a("commands.particle.success", mf.i.b($$1.a()).toString()), true);
         return $$8;
      }
   }
}

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class and {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("commands.particle.failed"));

   public static void a(CommandDispatcher<ed> $$0, dz $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("particle").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ee.a("name", fa.a($$1))
                     .executes(
                        $$0x -> a(
                              (ed)$$0x.getSource(), fa.a($$0x, "name"), ((ed)$$0x.getSource()).d(), etp.b, 0.0F, 0, false, ((ed)$$0x.getSource()).l().ah().t()
                           )
                     ))
                  .then(
                     ((RequiredArgumentBuilder)ee.a("pos", gg.a())
                           .executes(
                              $$0x -> a((ed)$$0x.getSource(), fa.a($$0x, "name"), gg.a($$0x, "pos"), etp.b, 0.0F, 0, false, ((ed)$$0x.getSource()).l().ah().t())
                           ))
                        .then(
                           ee.a("delta", gg.a(false))
                              .then(
                                 ee.a("speed", FloatArgumentType.floatArg(0.0F))
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ee.a("count", IntegerArgumentType.integer(0))
                                                .executes(
                                                   $$0x -> a(
                                                         (ed)$$0x.getSource(),
                                                         fa.a($$0x, "name"),
                                                         gg.a($$0x, "pos"),
                                                         gg.a($$0x, "delta"),
                                                         FloatArgumentType.getFloat($$0x, "speed"),
                                                         IntegerArgumentType.getInteger($$0x, "count"),
                                                         false,
                                                         ((ed)$$0x.getSource()).l().ah().t()
                                                      )
                                                ))
                                             .then(
                                                ((LiteralArgumentBuilder)ee.a("force")
                                                      .executes(
                                                         $$0x -> a(
                                                               (ed)$$0x.getSource(),
                                                               fa.a($$0x, "name"),
                                                               gg.a($$0x, "pos"),
                                                               gg.a($$0x, "delta"),
                                                               FloatArgumentType.getFloat($$0x, "speed"),
                                                               IntegerArgumentType.getInteger($$0x, "count"),
                                                               true,
                                                               ((ed)$$0x.getSource()).l().ah().t()
                                                            )
                                                      ))
                                                   .then(
                                                      ee.a("viewers", eq.d())
                                                         .executes(
                                                            $$0x -> a(
                                                                  (ed)$$0x.getSource(),
                                                                  fa.a($$0x, "name"),
                                                                  gg.a($$0x, "pos"),
                                                                  gg.a($$0x, "delta"),
                                                                  FloatArgumentType.getFloat($$0x, "speed"),
                                                                  IntegerArgumentType.getInteger($$0x, "count"),
                                                                  true,
                                                                  eq.f($$0x, "viewers")
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)ee.a("normal")
                                                   .executes(
                                                      $$0x -> a(
                                                            (ed)$$0x.getSource(),
                                                            fa.a($$0x, "name"),
                                                            gg.a($$0x, "pos"),
                                                            gg.a($$0x, "delta"),
                                                            FloatArgumentType.getFloat($$0x, "speed"),
                                                            IntegerArgumentType.getInteger($$0x, "count"),
                                                            false,
                                                            ((ed)$$0x.getSource()).l().ah().t()
                                                         )
                                                   ))
                                                .then(
                                                   ee.a("viewers", eq.d())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ed)$$0x.getSource(),
                                                               fa.a($$0x, "name"),
                                                               gg.a($$0x, "pos"),
                                                               gg.a($$0x, "delta"),
                                                               FloatArgumentType.getFloat($$0x, "speed"),
                                                               IntegerArgumentType.getInteger($$0x, "count"),
                                                               false,
                                                               eq.f($$0x, "viewers")
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

   private static int a(ed $$0, kv $$1, etp $$2, etp $$3, float $$4, int $$5, boolean $$6, Collection<aqi> $$7) throws CommandSyntaxException {
      int $$8 = 0;

      for (aqi $$9 : $$7) {
         if ($$0.e().a($$9, $$1, $$6, $$2.c, $$2.d, $$2.e, $$5, $$3.c, $$3.d, $$3.e, (double)$$4)) {
            $$8++;
         }
      }

      if ($$8 == 0) {
         throw a.create();
      } else {
         $$0.a(() -> wu.a("commands.particle.success", ld.j.b($$1.a()).toString()), true);
         return $$8;
      }
   }
}

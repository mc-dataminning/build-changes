import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class aob {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xp.c("commands.particle.failed"));

   public static void a(CommandDispatcher<ep> $$0, el $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("particle").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)eq.a("name", fm.a($$1))
                     .executes(
                        $$0x -> a(
                              (ep)$$0x.getSource(), fm.a($$0x, "name"), ((ep)$$0x.getSource()).d(), evr.b, 0.0F, 0, false, ((ep)$$0x.getSource()).l().ah().t()
                           )
                     ))
                  .then(
                     ((RequiredArgumentBuilder)eq.a("pos", gs.a())
                           .executes(
                              $$0x -> a((ep)$$0x.getSource(), fm.a($$0x, "name"), gs.a($$0x, "pos"), evr.b, 0.0F, 0, false, ((ep)$$0x.getSource()).l().ah().t())
                           ))
                        .then(
                           eq.a("delta", gs.a(false))
                              .then(
                                 eq.a("speed", FloatArgumentType.floatArg(0.0F))
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)eq.a("count", IntegerArgumentType.integer(0))
                                                .executes(
                                                   $$0x -> a(
                                                         (ep)$$0x.getSource(),
                                                         fm.a($$0x, "name"),
                                                         gs.a($$0x, "pos"),
                                                         gs.a($$0x, "delta"),
                                                         FloatArgumentType.getFloat($$0x, "speed"),
                                                         IntegerArgumentType.getInteger($$0x, "count"),
                                                         false,
                                                         ((ep)$$0x.getSource()).l().ah().t()
                                                      )
                                                ))
                                             .then(
                                                ((LiteralArgumentBuilder)eq.a("force")
                                                      .executes(
                                                         $$0x -> a(
                                                               (ep)$$0x.getSource(),
                                                               fm.a($$0x, "name"),
                                                               gs.a($$0x, "pos"),
                                                               gs.a($$0x, "delta"),
                                                               FloatArgumentType.getFloat($$0x, "speed"),
                                                               IntegerArgumentType.getInteger($$0x, "count"),
                                                               true,
                                                               ((ep)$$0x.getSource()).l().ah().t()
                                                            )
                                                      ))
                                                   .then(
                                                      eq.a("viewers", fc.d())
                                                         .executes(
                                                            $$0x -> a(
                                                                  (ep)$$0x.getSource(),
                                                                  fm.a($$0x, "name"),
                                                                  gs.a($$0x, "pos"),
                                                                  gs.a($$0x, "delta"),
                                                                  FloatArgumentType.getFloat($$0x, "speed"),
                                                                  IntegerArgumentType.getInteger($$0x, "count"),
                                                                  true,
                                                                  fc.f($$0x, "viewers")
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)eq.a("normal")
                                                   .executes(
                                                      $$0x -> a(
                                                            (ep)$$0x.getSource(),
                                                            fm.a($$0x, "name"),
                                                            gs.a($$0x, "pos"),
                                                            gs.a($$0x, "delta"),
                                                            FloatArgumentType.getFloat($$0x, "speed"),
                                                            IntegerArgumentType.getInteger($$0x, "count"),
                                                            false,
                                                            ((ep)$$0x.getSource()).l().ah().t()
                                                         )
                                                   ))
                                                .then(
                                                   eq.a("viewers", fc.d())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ep)$$0x.getSource(),
                                                               fm.a($$0x, "name"),
                                                               gs.a($$0x, "pos"),
                                                               gs.a($$0x, "delta"),
                                                               FloatArgumentType.getFloat($$0x, "speed"),
                                                               IntegerArgumentType.getInteger($$0x, "count"),
                                                               false,
                                                               fc.f($$0x, "viewers")
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

   private static int a(ep $$0, lg $$1, evr $$2, evr $$3, float $$4, int $$5, boolean $$6, Collection<arg> $$7) throws CommandSyntaxException {
      int $$8 = 0;

      for (arg $$9 : $$7) {
         if ($$0.e().a($$9, $$1, $$6, $$2.c, $$2.d, $$2.e, $$5, $$3.c, $$3.d, $$3.e, (double)$$4)) {
            $$8++;
         }
      }

      if ($$8 == 0) {
         throw a.create();
      } else {
         $$0.a(() -> xp.a("commands.particle.success", lp.j.b($$1.a()).toString()), true);
         return $$8;
      }
   }
}

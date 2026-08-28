import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class aoy {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xv.c("commands.particle.failed"));

   public static void a(CommandDispatcher<ew> $$0, es $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("particle").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ex.a("name", ft.a($$1))
                     .executes(
                        $$0x -> a(
                              (ew)$$0x.getSource(), ft.a($$0x, "name"), ((ew)$$0x.getSource()).d(), fbx.c, 0.0F, 0, false, ((ew)$$0x.getSource()).l().ag().t()
                           )
                     ))
                  .then(
                     ((RequiredArgumentBuilder)ex.a("pos", gz.a())
                           .executes(
                              $$0x -> a((ew)$$0x.getSource(), ft.a($$0x, "name"), gz.a($$0x, "pos"), fbx.c, 0.0F, 0, false, ((ew)$$0x.getSource()).l().ag().t())
                           ))
                        .then(
                           ex.a("delta", gz.a(false))
                              .then(
                                 ex.a("speed", FloatArgumentType.floatArg(0.0F))
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ex.a("count", IntegerArgumentType.integer(0))
                                                .executes(
                                                   $$0x -> a(
                                                         (ew)$$0x.getSource(),
                                                         ft.a($$0x, "name"),
                                                         gz.a($$0x, "pos"),
                                                         gz.a($$0x, "delta"),
                                                         FloatArgumentType.getFloat($$0x, "speed"),
                                                         IntegerArgumentType.getInteger($$0x, "count"),
                                                         false,
                                                         ((ew)$$0x.getSource()).l().ag().t()
                                                      )
                                                ))
                                             .then(
                                                ((LiteralArgumentBuilder)ex.a("force")
                                                      .executes(
                                                         $$0x -> a(
                                                               (ew)$$0x.getSource(),
                                                               ft.a($$0x, "name"),
                                                               gz.a($$0x, "pos"),
                                                               gz.a($$0x, "delta"),
                                                               FloatArgumentType.getFloat($$0x, "speed"),
                                                               IntegerArgumentType.getInteger($$0x, "count"),
                                                               true,
                                                               ((ew)$$0x.getSource()).l().ag().t()
                                                            )
                                                      ))
                                                   .then(
                                                      ex.a("viewers", fj.d())
                                                         .executes(
                                                            $$0x -> a(
                                                                  (ew)$$0x.getSource(),
                                                                  ft.a($$0x, "name"),
                                                                  gz.a($$0x, "pos"),
                                                                  gz.a($$0x, "delta"),
                                                                  FloatArgumentType.getFloat($$0x, "speed"),
                                                                  IntegerArgumentType.getInteger($$0x, "count"),
                                                                  true,
                                                                  fj.f($$0x, "viewers")
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)ex.a("normal")
                                                   .executes(
                                                      $$0x -> a(
                                                            (ew)$$0x.getSource(),
                                                            ft.a($$0x, "name"),
                                                            gz.a($$0x, "pos"),
                                                            gz.a($$0x, "delta"),
                                                            FloatArgumentType.getFloat($$0x, "speed"),
                                                            IntegerArgumentType.getInteger($$0x, "count"),
                                                            false,
                                                            ((ew)$$0x.getSource()).l().ag().t()
                                                         )
                                                   ))
                                                .then(
                                                   ex.a("viewers", fj.d())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ew)$$0x.getSource(),
                                                               ft.a($$0x, "name"),
                                                               gz.a($$0x, "pos"),
                                                               gz.a($$0x, "delta"),
                                                               FloatArgumentType.getFloat($$0x, "speed"),
                                                               IntegerArgumentType.getInteger($$0x, "count"),
                                                               false,
                                                               fj.f($$0x, "viewers")
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

   private static int a(ew $$0, lq $$1, fbx $$2, fbx $$3, float $$4, int $$5, boolean $$6, Collection<asi> $$7) throws CommandSyntaxException {
      int $$8 = 0;

      for (asi $$9 : $$7) {
         if ($$0.e().a($$9, $$1, $$6, $$2.d, $$2.e, $$2.f, $$5, $$3.d, $$3.e, $$3.f, (double)$$4)) {
            $$8++;
         }
      }

      if ($$8 == 0) {
         throw a.create();
      } else {
         $$0.a(() -> xv.a("commands.particle.success", ma.i.b($$1.a()).toString()), true);
         return $$8;
      }
   }
}

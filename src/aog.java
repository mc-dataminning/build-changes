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

   public static void a(CommandDispatcher<ej> $$0, ef $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("particle").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ek.a("name", fg.a($$1))
                     .executes(
                        $$0x -> a(
                              (ej)$$0x.getSource(), fg.a($$0x, "name"), ((ej)$$0x.getSource()).d(), fex.c, 0.0F, 0, false, ((ej)$$0x.getSource()).l().ag().t()
                           )
                     ))
                  .then(
                     ((RequiredArgumentBuilder)ek.a("pos", gn.a())
                           .executes(
                              $$0x -> a((ej)$$0x.getSource(), fg.a($$0x, "name"), gn.a($$0x, "pos"), fex.c, 0.0F, 0, false, ((ej)$$0x.getSource()).l().ag().t())
                           ))
                        .then(
                           ek.a("delta", gn.a(false))
                              .then(
                                 ek.a("speed", FloatArgumentType.floatArg(0.0F))
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ek.a("count", IntegerArgumentType.integer(0))
                                                .executes(
                                                   $$0x -> a(
                                                         (ej)$$0x.getSource(),
                                                         fg.a($$0x, "name"),
                                                         gn.a($$0x, "pos"),
                                                         gn.a($$0x, "delta"),
                                                         FloatArgumentType.getFloat($$0x, "speed"),
                                                         IntegerArgumentType.getInteger($$0x, "count"),
                                                         false,
                                                         ((ej)$$0x.getSource()).l().ag().t()
                                                      )
                                                ))
                                             .then(
                                                ((LiteralArgumentBuilder)ek.a("force")
                                                      .executes(
                                                         $$0x -> a(
                                                               (ej)$$0x.getSource(),
                                                               fg.a($$0x, "name"),
                                                               gn.a($$0x, "pos"),
                                                               gn.a($$0x, "delta"),
                                                               FloatArgumentType.getFloat($$0x, "speed"),
                                                               IntegerArgumentType.getInteger($$0x, "count"),
                                                               true,
                                                               ((ej)$$0x.getSource()).l().ag().t()
                                                            )
                                                      ))
                                                   .then(
                                                      ek.a("viewers", ew.d())
                                                         .executes(
                                                            $$0x -> a(
                                                                  (ej)$$0x.getSource(),
                                                                  fg.a($$0x, "name"),
                                                                  gn.a($$0x, "pos"),
                                                                  gn.a($$0x, "delta"),
                                                                  FloatArgumentType.getFloat($$0x, "speed"),
                                                                  IntegerArgumentType.getInteger($$0x, "count"),
                                                                  true,
                                                                  ew.f($$0x, "viewers")
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)ek.a("normal")
                                                   .executes(
                                                      $$0x -> a(
                                                            (ej)$$0x.getSource(),
                                                            fg.a($$0x, "name"),
                                                            gn.a($$0x, "pos"),
                                                            gn.a($$0x, "delta"),
                                                            FloatArgumentType.getFloat($$0x, "speed"),
                                                            IntegerArgumentType.getInteger($$0x, "count"),
                                                            false,
                                                            ((ej)$$0x.getSource()).l().ag().t()
                                                         )
                                                   ))
                                                .then(
                                                   ek.a("viewers", ew.d())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ej)$$0x.getSource(),
                                                               fg.a($$0x, "name"),
                                                               gn.a($$0x, "pos"),
                                                               gn.a($$0x, "delta"),
                                                               FloatArgumentType.getFloat($$0x, "speed"),
                                                               IntegerArgumentType.getInteger($$0x, "count"),
                                                               false,
                                                               ew.f($$0x, "viewers")
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

   private static int a(ej $$0, lw $$1, fex $$2, fex $$3, float $$4, int $$5, boolean $$6, Collection<arr> $$7) throws CommandSyntaxException {
      int $$8 = 0;

      for (arr $$9 : $$7) {
         if ($$0.e().a($$9, $$1, $$6, false, $$2.d, $$2.e, $$2.f, $$5, $$3.d, $$3.e, $$3.f, (double)$$4)) {
            $$8++;
         }
      }

      if ($$8 == 0) {
         throw a.create();
      } else {
         $$0.a(() -> wy.a("commands.particle.success", mg.i.b($$1.a()).toString()), true);
         return $$8;
      }
   }
}

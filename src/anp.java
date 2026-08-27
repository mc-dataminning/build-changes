import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class anp {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("commands.particle.failed"));

   public static void a(CommandDispatcher<eh> $$0, ed $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("particle").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ei.a("name", fe.a($$1))
                     .executes(
                        $$0x -> a(
                              (eh)$$0x.getSource(), fe.a($$0x, "name"), ((eh)$$0x.getSource()).d(), ewu.b, 0.0F, 0, false, ((eh)$$0x.getSource()).l().ah().t()
                           )
                     ))
                  .then(
                     ((RequiredArgumentBuilder)ei.a("pos", gk.a())
                           .executes(
                              $$0x -> a((eh)$$0x.getSource(), fe.a($$0x, "name"), gk.a($$0x, "pos"), ewu.b, 0.0F, 0, false, ((eh)$$0x.getSource()).l().ah().t())
                           ))
                        .then(
                           ei.a("delta", gk.a(false))
                              .then(
                                 ei.a("speed", FloatArgumentType.floatArg(0.0F))
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ei.a("count", IntegerArgumentType.integer(0))
                                                .executes(
                                                   $$0x -> a(
                                                         (eh)$$0x.getSource(),
                                                         fe.a($$0x, "name"),
                                                         gk.a($$0x, "pos"),
                                                         gk.a($$0x, "delta"),
                                                         FloatArgumentType.getFloat($$0x, "speed"),
                                                         IntegerArgumentType.getInteger($$0x, "count"),
                                                         false,
                                                         ((eh)$$0x.getSource()).l().ah().t()
                                                      )
                                                ))
                                             .then(
                                                ((LiteralArgumentBuilder)ei.a("force")
                                                      .executes(
                                                         $$0x -> a(
                                                               (eh)$$0x.getSource(),
                                                               fe.a($$0x, "name"),
                                                               gk.a($$0x, "pos"),
                                                               gk.a($$0x, "delta"),
                                                               FloatArgumentType.getFloat($$0x, "speed"),
                                                               IntegerArgumentType.getInteger($$0x, "count"),
                                                               true,
                                                               ((eh)$$0x.getSource()).l().ah().t()
                                                            )
                                                      ))
                                                   .then(
                                                      ei.a("viewers", eu.d())
                                                         .executes(
                                                            $$0x -> a(
                                                                  (eh)$$0x.getSource(),
                                                                  fe.a($$0x, "name"),
                                                                  gk.a($$0x, "pos"),
                                                                  gk.a($$0x, "delta"),
                                                                  FloatArgumentType.getFloat($$0x, "speed"),
                                                                  IntegerArgumentType.getInteger($$0x, "count"),
                                                                  true,
                                                                  eu.f($$0x, "viewers")
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)ei.a("normal")
                                                   .executes(
                                                      $$0x -> a(
                                                            (eh)$$0x.getSource(),
                                                            fe.a($$0x, "name"),
                                                            gk.a($$0x, "pos"),
                                                            gk.a($$0x, "delta"),
                                                            FloatArgumentType.getFloat($$0x, "speed"),
                                                            IntegerArgumentType.getInteger($$0x, "count"),
                                                            false,
                                                            ((eh)$$0x.getSource()).l().ah().t()
                                                         )
                                                   ))
                                                .then(
                                                   ei.a("viewers", eu.d())
                                                      .executes(
                                                         $$0x -> a(
                                                               (eh)$$0x.getSource(),
                                                               fe.a($$0x, "name"),
                                                               gk.a($$0x, "pos"),
                                                               gk.a($$0x, "delta"),
                                                               FloatArgumentType.getFloat($$0x, "speed"),
                                                               IntegerArgumentType.getInteger($$0x, "count"),
                                                               false,
                                                               eu.f($$0x, "viewers")
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

   private static int a(eh $$0, kz $$1, ewu $$2, ewu $$3, float $$4, int $$5, boolean $$6, Collection<aqu> $$7) throws CommandSyntaxException {
      int $$8 = 0;

      for (aqu $$9 : $$7) {
         if ($$0.e().a($$9, $$1, $$6, $$2.c, $$2.d, $$2.e, $$5, $$3.c, $$3.d, $$3.e, (double)$$4)) {
            $$8++;
         }
      }

      if ($$8 == 0) {
         throw a.create();
      } else {
         $$0.a(() -> xe.a("commands.particle.success", lh.j.b($$1.a()).toString()), true);
         return $$8;
      }
   }
}

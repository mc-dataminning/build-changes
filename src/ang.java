import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class ang {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("commands.particle.failed"));

   public static void a(CommandDispatcher<eq> $$0, em $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("particle").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)er.a("name", fn.a($$1))
                     .executes(
                        $$0x -> a(
                              (eq)$$0x.getSource(), fn.a($$0x, "name"), ((eq)$$0x.getSource()).d(), ewh.b, 0.0F, 0, false, ((eq)$$0x.getSource()).l().ai().t()
                           )
                     ))
                  .then(
                     ((RequiredArgumentBuilder)er.a("pos", gt.a())
                           .executes(
                              $$0x -> a((eq)$$0x.getSource(), fn.a($$0x, "name"), gt.a($$0x, "pos"), ewh.b, 0.0F, 0, false, ((eq)$$0x.getSource()).l().ai().t())
                           ))
                        .then(
                           er.a("delta", gt.a(false))
                              .then(
                                 er.a("speed", FloatArgumentType.floatArg(0.0F))
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)er.a("count", IntegerArgumentType.integer(0))
                                                .executes(
                                                   $$0x -> a(
                                                         (eq)$$0x.getSource(),
                                                         fn.a($$0x, "name"),
                                                         gt.a($$0x, "pos"),
                                                         gt.a($$0x, "delta"),
                                                         FloatArgumentType.getFloat($$0x, "speed"),
                                                         IntegerArgumentType.getInteger($$0x, "count"),
                                                         false,
                                                         ((eq)$$0x.getSource()).l().ai().t()
                                                      )
                                                ))
                                             .then(
                                                ((LiteralArgumentBuilder)er.a("force")
                                                      .executes(
                                                         $$0x -> a(
                                                               (eq)$$0x.getSource(),
                                                               fn.a($$0x, "name"),
                                                               gt.a($$0x, "pos"),
                                                               gt.a($$0x, "delta"),
                                                               FloatArgumentType.getFloat($$0x, "speed"),
                                                               IntegerArgumentType.getInteger($$0x, "count"),
                                                               true,
                                                               ((eq)$$0x.getSource()).l().ai().t()
                                                            )
                                                      ))
                                                   .then(
                                                      er.a("viewers", fd.d())
                                                         .executes(
                                                            $$0x -> a(
                                                                  (eq)$$0x.getSource(),
                                                                  fn.a($$0x, "name"),
                                                                  gt.a($$0x, "pos"),
                                                                  gt.a($$0x, "delta"),
                                                                  FloatArgumentType.getFloat($$0x, "speed"),
                                                                  IntegerArgumentType.getInteger($$0x, "count"),
                                                                  true,
                                                                  fd.f($$0x, "viewers")
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)er.a("normal")
                                                   .executes(
                                                      $$0x -> a(
                                                            (eq)$$0x.getSource(),
                                                            fn.a($$0x, "name"),
                                                            gt.a($$0x, "pos"),
                                                            gt.a($$0x, "delta"),
                                                            FloatArgumentType.getFloat($$0x, "speed"),
                                                            IntegerArgumentType.getInteger($$0x, "count"),
                                                            false,
                                                            ((eq)$$0x.getSource()).l().ai().t()
                                                         )
                                                   ))
                                                .then(
                                                   er.a("viewers", fd.d())
                                                      .executes(
                                                         $$0x -> a(
                                                               (eq)$$0x.getSource(),
                                                               fn.a($$0x, "name"),
                                                               gt.a($$0x, "pos"),
                                                               gt.a($$0x, "delta"),
                                                               FloatArgumentType.getFloat($$0x, "speed"),
                                                               IntegerArgumentType.getInteger($$0x, "count"),
                                                               false,
                                                               fd.f($$0x, "viewers")
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

   private static int a(eq $$0, lh $$1, ewh $$2, ewh $$3, float $$4, int $$5, boolean $$6, Collection<aqn> $$7) throws CommandSyntaxException {
      int $$8 = 0;

      for (aqn $$9 : $$7) {
         if ($$0.e().a($$9, $$1, $$6, $$2.c, $$2.d, $$2.e, $$5, $$3.c, $$3.d, $$3.e, (double)$$4)) {
            $$8++;
         }
      }

      if ($$8 == 0) {
         throw a.create();
      } else {
         $$0.a(() -> wu.a("commands.particle.success", lq.i.b($$1.a()).toString()), true);
         return $$8;
      }
   }
}

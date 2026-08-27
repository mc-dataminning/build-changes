import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class alt {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vq.c("commands.particle.failed"));

   public static void a(CommandDispatcher<du> $$0, dq $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("particle").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)dv.a("name", er.a($$1))
                     .executes(
                        $$0x -> a(
                              (du)$$0x.getSource(), er.a($$0x, "name"), ((du)$$0x.getSource()).d(), ens.b, 0.0F, 0, false, ((du)$$0x.getSource()).l().ae().t()
                           )
                     ))
                  .then(
                     ((RequiredArgumentBuilder)dv.a("pos", fv.a())
                           .executes(
                              $$0x -> a((du)$$0x.getSource(), er.a($$0x, "name"), fv.a($$0x, "pos"), ens.b, 0.0F, 0, false, ((du)$$0x.getSource()).l().ae().t())
                           ))
                        .then(
                           dv.a("delta", fv.a(false))
                              .then(
                                 dv.a("speed", FloatArgumentType.floatArg(0.0F))
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a("count", IntegerArgumentType.integer(0))
                                                .executes(
                                                   $$0x -> a(
                                                         (du)$$0x.getSource(),
                                                         er.a($$0x, "name"),
                                                         fv.a($$0x, "pos"),
                                                         fv.a($$0x, "delta"),
                                                         FloatArgumentType.getFloat($$0x, "speed"),
                                                         IntegerArgumentType.getInteger($$0x, "count"),
                                                         false,
                                                         ((du)$$0x.getSource()).l().ae().t()
                                                      )
                                                ))
                                             .then(
                                                ((LiteralArgumentBuilder)dv.a("force")
                                                      .executes(
                                                         $$0x -> a(
                                                               (du)$$0x.getSource(),
                                                               er.a($$0x, "name"),
                                                               fv.a($$0x, "pos"),
                                                               fv.a($$0x, "delta"),
                                                               FloatArgumentType.getFloat($$0x, "speed"),
                                                               IntegerArgumentType.getInteger($$0x, "count"),
                                                               true,
                                                               ((du)$$0x.getSource()).l().ae().t()
                                                            )
                                                      ))
                                                   .then(
                                                      dv.a("viewers", eh.d())
                                                         .executes(
                                                            $$0x -> a(
                                                                  (du)$$0x.getSource(),
                                                                  er.a($$0x, "name"),
                                                                  fv.a($$0x, "pos"),
                                                                  fv.a($$0x, "delta"),
                                                                  FloatArgumentType.getFloat($$0x, "speed"),
                                                                  IntegerArgumentType.getInteger($$0x, "count"),
                                                                  true,
                                                                  eh.f($$0x, "viewers")
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)dv.a("normal")
                                                   .executes(
                                                      $$0x -> a(
                                                            (du)$$0x.getSource(),
                                                            er.a($$0x, "name"),
                                                            fv.a($$0x, "pos"),
                                                            fv.a($$0x, "delta"),
                                                            FloatArgumentType.getFloat($$0x, "speed"),
                                                            IntegerArgumentType.getInteger($$0x, "count"),
                                                            false,
                                                            ((du)$$0x.getSource()).l().ae().t()
                                                         )
                                                   ))
                                                .then(
                                                   dv.a("viewers", eh.d())
                                                      .executes(
                                                         $$0x -> a(
                                                               (du)$$0x.getSource(),
                                                               er.a($$0x, "name"),
                                                               fv.a($$0x, "pos"),
                                                               fv.a($$0x, "delta"),
                                                               FloatArgumentType.getFloat($$0x, "speed"),
                                                               IntegerArgumentType.getInteger($$0x, "count"),
                                                               false,
                                                               eh.f($$0x, "viewers")
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

   private static int a(du $$0, jx $$1, ens $$2, ens $$3, float $$4, int $$5, boolean $$6, Collection<aow> $$7) throws CommandSyntaxException {
      int $$8 = 0;

      for (aow $$9 : $$7) {
         if ($$0.e().a($$9, $$1, $$6, $$2.c, $$2.d, $$2.e, $$5, $$3.c, $$3.d, $$3.e, (double)$$4)) {
            $$8++;
         }
      }

      if ($$8 == 0) {
         throw a.create();
      } else {
         $$0.a(() -> vq.a("commands.particle.success", kf.j.b($$1.b()).toString()), true);
         return $$8;
      }
   }
}

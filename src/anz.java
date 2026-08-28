import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class anz {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xd.c("commands.particle.failed"));

   public static void a(CommandDispatcher<et> $$0, ep $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("particle").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)eu.a("name", fq.a($$1))
                     .executes(
                        $$0x -> a(
                              (et)$$0x.getSource(), fq.a($$0x, "name"), ((et)$$0x.getSource()).d(), eye.c, 0.0F, 0, false, ((et)$$0x.getSource()).l().ag().t()
                           )
                     ))
                  .then(
                     ((RequiredArgumentBuilder)eu.a("pos", gw.a())
                           .executes(
                              $$0x -> a((et)$$0x.getSource(), fq.a($$0x, "name"), gw.a($$0x, "pos"), eye.c, 0.0F, 0, false, ((et)$$0x.getSource()).l().ag().t())
                           ))
                        .then(
                           eu.a("delta", gw.a(false))
                              .then(
                                 eu.a("speed", FloatArgumentType.floatArg(0.0F))
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)eu.a("count", IntegerArgumentType.integer(0))
                                                .executes(
                                                   $$0x -> a(
                                                         (et)$$0x.getSource(),
                                                         fq.a($$0x, "name"),
                                                         gw.a($$0x, "pos"),
                                                         gw.a($$0x, "delta"),
                                                         FloatArgumentType.getFloat($$0x, "speed"),
                                                         IntegerArgumentType.getInteger($$0x, "count"),
                                                         false,
                                                         ((et)$$0x.getSource()).l().ag().t()
                                                      )
                                                ))
                                             .then(
                                                ((LiteralArgumentBuilder)eu.a("force")
                                                      .executes(
                                                         $$0x -> a(
                                                               (et)$$0x.getSource(),
                                                               fq.a($$0x, "name"),
                                                               gw.a($$0x, "pos"),
                                                               gw.a($$0x, "delta"),
                                                               FloatArgumentType.getFloat($$0x, "speed"),
                                                               IntegerArgumentType.getInteger($$0x, "count"),
                                                               true,
                                                               ((et)$$0x.getSource()).l().ag().t()
                                                            )
                                                      ))
                                                   .then(
                                                      eu.a("viewers", fg.d())
                                                         .executes(
                                                            $$0x -> a(
                                                                  (et)$$0x.getSource(),
                                                                  fq.a($$0x, "name"),
                                                                  gw.a($$0x, "pos"),
                                                                  gw.a($$0x, "delta"),
                                                                  FloatArgumentType.getFloat($$0x, "speed"),
                                                                  IntegerArgumentType.getInteger($$0x, "count"),
                                                                  true,
                                                                  fg.f($$0x, "viewers")
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)eu.a("normal")
                                                   .executes(
                                                      $$0x -> a(
                                                            (et)$$0x.getSource(),
                                                            fq.a($$0x, "name"),
                                                            gw.a($$0x, "pos"),
                                                            gw.a($$0x, "delta"),
                                                            FloatArgumentType.getFloat($$0x, "speed"),
                                                            IntegerArgumentType.getInteger($$0x, "count"),
                                                            false,
                                                            ((et)$$0x.getSource()).l().ag().t()
                                                         )
                                                   ))
                                                .then(
                                                   eu.a("viewers", fg.d())
                                                      .executes(
                                                         $$0x -> a(
                                                               (et)$$0x.getSource(),
                                                               fq.a($$0x, "name"),
                                                               gw.a($$0x, "pos"),
                                                               gw.a($$0x, "delta"),
                                                               FloatArgumentType.getFloat($$0x, "speed"),
                                                               IntegerArgumentType.getInteger($$0x, "count"),
                                                               false,
                                                               fg.f($$0x, "viewers")
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

   private static int a(et $$0, ll $$1, eye $$2, eye $$3, float $$4, int $$5, boolean $$6, Collection<arh> $$7) throws CommandSyntaxException {
      int $$8 = 0;

      for (arh $$9 : $$7) {
         if ($$0.e().a($$9, $$1, $$6, $$2.d, $$2.e, $$2.f, $$5, $$3.d, $$3.e, $$3.f, (double)$$4)) {
            $$8++;
         }
      }

      if ($$8 == 0) {
         throw a.create();
      } else {
         $$0.a(() -> xd.a("commands.particle.success", lu.i.b($$1.a()).toString()), true);
         return $$8;
      }
   }
}

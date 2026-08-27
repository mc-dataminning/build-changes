import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class ahs {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tn.c("commands.particle.failed"));

   public static void a(CommandDispatcher<dt> $$0, dn $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("particle").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)du.a("name", eo.a($$1))
                     .executes(
                        $$0x -> a(
                              (dt)$$0x.getSource(), eo.a($$0x, "name"), ((dt)$$0x.getSource()).d(), ehp.b, 0.0F, 0, false, ((dt)$$0x.getSource()).l().ac().t()
                           )
                     ))
                  .then(
                     ((RequiredArgumentBuilder)du.a("pos", fr.a())
                           .executes(
                              $$0x -> a((dt)$$0x.getSource(), eo.a($$0x, "name"), fr.a($$0x, "pos"), ehp.b, 0.0F, 0, false, ((dt)$$0x.getSource()).l().ac().t())
                           ))
                        .then(
                           du.a("delta", fr.a(false))
                              .then(
                                 du.a("speed", FloatArgumentType.floatArg(0.0F))
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)du.a("count", IntegerArgumentType.integer(0))
                                                .executes(
                                                   $$0x -> a(
                                                         (dt)$$0x.getSource(),
                                                         eo.a($$0x, "name"),
                                                         fr.a($$0x, "pos"),
                                                         fr.a($$0x, "delta"),
                                                         FloatArgumentType.getFloat($$0x, "speed"),
                                                         IntegerArgumentType.getInteger($$0x, "count"),
                                                         false,
                                                         ((dt)$$0x.getSource()).l().ac().t()
                                                      )
                                                ))
                                             .then(
                                                ((LiteralArgumentBuilder)du.a("force")
                                                      .executes(
                                                         $$0x -> a(
                                                               (dt)$$0x.getSource(),
                                                               eo.a($$0x, "name"),
                                                               fr.a($$0x, "pos"),
                                                               fr.a($$0x, "delta"),
                                                               FloatArgumentType.getFloat($$0x, "speed"),
                                                               IntegerArgumentType.getInteger($$0x, "count"),
                                                               true,
                                                               ((dt)$$0x.getSource()).l().ac().t()
                                                            )
                                                      ))
                                                   .then(
                                                      du.a("viewers", ee.d())
                                                         .executes(
                                                            $$0x -> a(
                                                                  (dt)$$0x.getSource(),
                                                                  eo.a($$0x, "name"),
                                                                  fr.a($$0x, "pos"),
                                                                  fr.a($$0x, "delta"),
                                                                  FloatArgumentType.getFloat($$0x, "speed"),
                                                                  IntegerArgumentType.getInteger($$0x, "count"),
                                                                  true,
                                                                  ee.f($$0x, "viewers")
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)du.a("normal")
                                                   .executes(
                                                      $$0x -> a(
                                                            (dt)$$0x.getSource(),
                                                            eo.a($$0x, "name"),
                                                            fr.a($$0x, "pos"),
                                                            fr.a($$0x, "delta"),
                                                            FloatArgumentType.getFloat($$0x, "speed"),
                                                            IntegerArgumentType.getInteger($$0x, "count"),
                                                            false,
                                                            ((dt)$$0x.getSource()).l().ac().t()
                                                         )
                                                   ))
                                                .then(
                                                   du.a("viewers", ee.d())
                                                      .executes(
                                                         $$0x -> a(
                                                               (dt)$$0x.getSource(),
                                                               eo.a($$0x, "name"),
                                                               fr.a($$0x, "pos"),
                                                               fr.a($$0x, "delta"),
                                                               FloatArgumentType.getFloat($$0x, "speed"),
                                                               IntegerArgumentType.getInteger($$0x, "count"),
                                                               false,
                                                               ee.f($$0x, "viewers")
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

   private static int a(dt $$0, iv $$1, ehp $$2, ehp $$3, float $$4, int $$5, boolean $$6, Collection<akt> $$7) throws CommandSyntaxException {
      int $$8 = 0;

      for (akt $$9 : $$7) {
         if ($$0.e().a($$9, $$1, $$6, $$2.c, $$2.d, $$2.e, $$5, $$3.c, $$3.d, $$3.e, (double)$$4)) {
            $$8++;
         }
      }

      if ($$8 == 0) {
         throw a.create();
      } else {
         $$0.a(() -> tn.a("commands.particle.success", jd.k.b($$1.b()).toString()), true);
         return $$8;
      }
   }
}

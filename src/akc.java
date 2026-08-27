import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class akc {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vg.c("commands.particle.failed"));

   public static void a(CommandDispatcher<ds> $$0, dn $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("particle").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)dt.a("name", ep.a($$1))
                     .executes(
                        $$0x -> a(
                              (ds)$$0x.getSource(), ep.a($$0x, "name"), ((ds)$$0x.getSource()).d(), emc.b, 0.0F, 0, false, ((ds)$$0x.getSource()).l().ae().t()
                           )
                     ))
                  .then(
                     ((RequiredArgumentBuilder)dt.a("pos", ft.a())
                           .executes(
                              $$0x -> a((ds)$$0x.getSource(), ep.a($$0x, "name"), ft.a($$0x, "pos"), emc.b, 0.0F, 0, false, ((ds)$$0x.getSource()).l().ae().t())
                           ))
                        .then(
                           dt.a("delta", ft.a(false))
                              .then(
                                 dt.a("speed", FloatArgumentType.floatArg(0.0F))
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("count", IntegerArgumentType.integer(0))
                                                .executes(
                                                   $$0x -> a(
                                                         (ds)$$0x.getSource(),
                                                         ep.a($$0x, "name"),
                                                         ft.a($$0x, "pos"),
                                                         ft.a($$0x, "delta"),
                                                         FloatArgumentType.getFloat($$0x, "speed"),
                                                         IntegerArgumentType.getInteger($$0x, "count"),
                                                         false,
                                                         ((ds)$$0x.getSource()).l().ae().t()
                                                      )
                                                ))
                                             .then(
                                                ((LiteralArgumentBuilder)dt.a("force")
                                                      .executes(
                                                         $$0x -> a(
                                                               (ds)$$0x.getSource(),
                                                               ep.a($$0x, "name"),
                                                               ft.a($$0x, "pos"),
                                                               ft.a($$0x, "delta"),
                                                               FloatArgumentType.getFloat($$0x, "speed"),
                                                               IntegerArgumentType.getInteger($$0x, "count"),
                                                               true,
                                                               ((ds)$$0x.getSource()).l().ae().t()
                                                            )
                                                      ))
                                                   .then(
                                                      dt.a("viewers", ef.d())
                                                         .executes(
                                                            $$0x -> a(
                                                                  (ds)$$0x.getSource(),
                                                                  ep.a($$0x, "name"),
                                                                  ft.a($$0x, "pos"),
                                                                  ft.a($$0x, "delta"),
                                                                  FloatArgumentType.getFloat($$0x, "speed"),
                                                                  IntegerArgumentType.getInteger($$0x, "count"),
                                                                  true,
                                                                  ef.f($$0x, "viewers")
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)dt.a("normal")
                                                   .executes(
                                                      $$0x -> a(
                                                            (ds)$$0x.getSource(),
                                                            ep.a($$0x, "name"),
                                                            ft.a($$0x, "pos"),
                                                            ft.a($$0x, "delta"),
                                                            FloatArgumentType.getFloat($$0x, "speed"),
                                                            IntegerArgumentType.getInteger($$0x, "count"),
                                                            false,
                                                            ((ds)$$0x.getSource()).l().ae().t()
                                                         )
                                                   ))
                                                .then(
                                                   dt.a("viewers", ef.d())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ds)$$0x.getSource(),
                                                               ep.a($$0x, "name"),
                                                               ft.a($$0x, "pos"),
                                                               ft.a($$0x, "delta"),
                                                               FloatArgumentType.getFloat($$0x, "speed"),
                                                               IntegerArgumentType.getInteger($$0x, "count"),
                                                               false,
                                                               ef.f($$0x, "viewers")
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

   private static int a(ds $$0, jv $$1, emc $$2, emc $$3, float $$4, int $$5, boolean $$6, Collection<anf> $$7) throws CommandSyntaxException {
      int $$8 = 0;

      for (anf $$9 : $$7) {
         if ($$0.e().a($$9, $$1, $$6, $$2.c, $$2.d, $$2.e, $$5, $$3.c, $$3.d, $$3.e, (double)$$4)) {
            $$8++;
         }
      }

      if ($$8 == 0) {
         throw a.create();
      } else {
         $$0.a(() -> vg.a("commands.particle.success", kd.j.b($$1.b()).toString()), true);
         return $$8;
      }
   }
}

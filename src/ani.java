import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class ani {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wx.c("commands.particle.failed"));

   public static void a(CommandDispatcher<ee> $$0, ea $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("particle").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ef.a("name", fb.a($$1))
                     .executes(
                        $$0x -> a(
                              (ee)$$0x.getSource(), fb.a($$0x, "name"), ((ee)$$0x.getSource()).d(), euk.b, 0.0F, 0, false, ((ee)$$0x.getSource()).l().ah().t()
                           )
                     ))
                  .then(
                     ((RequiredArgumentBuilder)ef.a("pos", gh.a())
                           .executes(
                              $$0x -> a((ee)$$0x.getSource(), fb.a($$0x, "name"), gh.a($$0x, "pos"), euk.b, 0.0F, 0, false, ((ee)$$0x.getSource()).l().ah().t())
                           ))
                        .then(
                           ef.a("delta", gh.a(false))
                              .then(
                                 ef.a("speed", FloatArgumentType.floatArg(0.0F))
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ef.a("count", IntegerArgumentType.integer(0))
                                                .executes(
                                                   $$0x -> a(
                                                         (ee)$$0x.getSource(),
                                                         fb.a($$0x, "name"),
                                                         gh.a($$0x, "pos"),
                                                         gh.a($$0x, "delta"),
                                                         FloatArgumentType.getFloat($$0x, "speed"),
                                                         IntegerArgumentType.getInteger($$0x, "count"),
                                                         false,
                                                         ((ee)$$0x.getSource()).l().ah().t()
                                                      )
                                                ))
                                             .then(
                                                ((LiteralArgumentBuilder)ef.a("force")
                                                      .executes(
                                                         $$0x -> a(
                                                               (ee)$$0x.getSource(),
                                                               fb.a($$0x, "name"),
                                                               gh.a($$0x, "pos"),
                                                               gh.a($$0x, "delta"),
                                                               FloatArgumentType.getFloat($$0x, "speed"),
                                                               IntegerArgumentType.getInteger($$0x, "count"),
                                                               true,
                                                               ((ee)$$0x.getSource()).l().ah().t()
                                                            )
                                                      ))
                                                   .then(
                                                      ef.a("viewers", er.d())
                                                         .executes(
                                                            $$0x -> a(
                                                                  (ee)$$0x.getSource(),
                                                                  fb.a($$0x, "name"),
                                                                  gh.a($$0x, "pos"),
                                                                  gh.a($$0x, "delta"),
                                                                  FloatArgumentType.getFloat($$0x, "speed"),
                                                                  IntegerArgumentType.getInteger($$0x, "count"),
                                                                  true,
                                                                  er.f($$0x, "viewers")
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)ef.a("normal")
                                                   .executes(
                                                      $$0x -> a(
                                                            (ee)$$0x.getSource(),
                                                            fb.a($$0x, "name"),
                                                            gh.a($$0x, "pos"),
                                                            gh.a($$0x, "delta"),
                                                            FloatArgumentType.getFloat($$0x, "speed"),
                                                            IntegerArgumentType.getInteger($$0x, "count"),
                                                            false,
                                                            ((ee)$$0x.getSource()).l().ah().t()
                                                         )
                                                   ))
                                                .then(
                                                   ef.a("viewers", er.d())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ee)$$0x.getSource(),
                                                               fb.a($$0x, "name"),
                                                               gh.a($$0x, "pos"),
                                                               gh.a($$0x, "delta"),
                                                               FloatArgumentType.getFloat($$0x, "speed"),
                                                               IntegerArgumentType.getInteger($$0x, "count"),
                                                               false,
                                                               er.f($$0x, "viewers")
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

   private static int a(ee $$0, kw $$1, euk $$2, euk $$3, float $$4, int $$5, boolean $$6, Collection<aqn> $$7) throws CommandSyntaxException {
      int $$8 = 0;

      for (aqn $$9 : $$7) {
         if ($$0.e().a($$9, $$1, $$6, $$2.c, $$2.d, $$2.e, $$5, $$3.c, $$3.d, $$3.e, (double)$$4)) {
            $$8++;
         }
      }

      if ($$8 == 0) {
         throw a.create();
      } else {
         $$0.a(() -> wx.a("commands.particle.success", le.j.b($$1.a()).toString()), true);
         return $$8;
      }
   }
}

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class aof {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xh.c("commands.particle.failed"));

   public static void a(CommandDispatcher<ev> $$0, er $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("particle").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ew.a("name", fs.a($$1))
                     .executes(
                        $$0x -> a(
                              (ev)$$0x.getSource(), fs.a($$0x, "name"), ((ev)$$0x.getSource()).d(), ezh.c, 0.0F, 0, false, ((ev)$$0x.getSource()).l().ag().t()
                           )
                     ))
                  .then(
                     ((RequiredArgumentBuilder)ew.a("pos", gy.a())
                           .executes(
                              $$0x -> a((ev)$$0x.getSource(), fs.a($$0x, "name"), gy.a($$0x, "pos"), ezh.c, 0.0F, 0, false, ((ev)$$0x.getSource()).l().ag().t())
                           ))
                        .then(
                           ew.a("delta", gy.a(false))
                              .then(
                                 ew.a("speed", FloatArgumentType.floatArg(0.0F))
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ew.a("count", IntegerArgumentType.integer(0))
                                                .executes(
                                                   $$0x -> a(
                                                         (ev)$$0x.getSource(),
                                                         fs.a($$0x, "name"),
                                                         gy.a($$0x, "pos"),
                                                         gy.a($$0x, "delta"),
                                                         FloatArgumentType.getFloat($$0x, "speed"),
                                                         IntegerArgumentType.getInteger($$0x, "count"),
                                                         false,
                                                         ((ev)$$0x.getSource()).l().ag().t()
                                                      )
                                                ))
                                             .then(
                                                ((LiteralArgumentBuilder)ew.a("force")
                                                      .executes(
                                                         $$0x -> a(
                                                               (ev)$$0x.getSource(),
                                                               fs.a($$0x, "name"),
                                                               gy.a($$0x, "pos"),
                                                               gy.a($$0x, "delta"),
                                                               FloatArgumentType.getFloat($$0x, "speed"),
                                                               IntegerArgumentType.getInteger($$0x, "count"),
                                                               true,
                                                               ((ev)$$0x.getSource()).l().ag().t()
                                                            )
                                                      ))
                                                   .then(
                                                      ew.a("viewers", fi.d())
                                                         .executes(
                                                            $$0x -> a(
                                                                  (ev)$$0x.getSource(),
                                                                  fs.a($$0x, "name"),
                                                                  gy.a($$0x, "pos"),
                                                                  gy.a($$0x, "delta"),
                                                                  FloatArgumentType.getFloat($$0x, "speed"),
                                                                  IntegerArgumentType.getInteger($$0x, "count"),
                                                                  true,
                                                                  fi.f($$0x, "viewers")
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)ew.a("normal")
                                                   .executes(
                                                      $$0x -> a(
                                                            (ev)$$0x.getSource(),
                                                            fs.a($$0x, "name"),
                                                            gy.a($$0x, "pos"),
                                                            gy.a($$0x, "delta"),
                                                            FloatArgumentType.getFloat($$0x, "speed"),
                                                            IntegerArgumentType.getInteger($$0x, "count"),
                                                            false,
                                                            ((ev)$$0x.getSource()).l().ag().t()
                                                         )
                                                   ))
                                                .then(
                                                   ew.a("viewers", fi.d())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ev)$$0x.getSource(),
                                                               fs.a($$0x, "name"),
                                                               gy.a($$0x, "pos"),
                                                               gy.a($$0x, "delta"),
                                                               FloatArgumentType.getFloat($$0x, "speed"),
                                                               IntegerArgumentType.getInteger($$0x, "count"),
                                                               false,
                                                               fi.f($$0x, "viewers")
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

   private static int a(ev $$0, lo $$1, ezh $$2, ezh $$3, float $$4, int $$5, boolean $$6, Collection<arn> $$7) throws CommandSyntaxException {
      int $$8 = 0;

      for (arn $$9 : $$7) {
         if ($$0.e().a($$9, $$1, $$6, $$2.d, $$2.e, $$2.f, $$5, $$3.d, $$3.e, $$3.f, (double)$$4)) {
            $$8++;
         }
      }

      if ($$8 == 0) {
         throw a.create();
      } else {
         $$0.a(() -> xh.a("commands.particle.success", lx.i.b($$1.a()).toString()), true);
         return $$8;
      }
   }
}

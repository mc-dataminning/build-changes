import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class ahj {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(te.c("commands.particle.failed"));

   public static void a(CommandDispatcher<ds> $$0, dm $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("particle").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)dt.a("name", en.a($$1))
                     .executes(
                        $$0x -> a(
                              (ds)$$0x.getSource(), en.a($$0x, "name"), ((ds)$$0x.getSource()).d(), ehf.b, 0.0F, 0, false, ((ds)$$0x.getSource()).l().ac().t()
                           )
                     ))
                  .then(
                     ((RequiredArgumentBuilder)dt.a("pos", fq.a())
                           .executes(
                              $$0x -> a((ds)$$0x.getSource(), en.a($$0x, "name"), fq.a($$0x, "pos"), ehf.b, 0.0F, 0, false, ((ds)$$0x.getSource()).l().ac().t())
                           ))
                        .then(
                           dt.a("delta", fq.a(false))
                              .then(
                                 dt.a("speed", FloatArgumentType.floatArg(0.0F))
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("count", IntegerArgumentType.integer(0))
                                                .executes(
                                                   $$0x -> a(
                                                         (ds)$$0x.getSource(),
                                                         en.a($$0x, "name"),
                                                         fq.a($$0x, "pos"),
                                                         fq.a($$0x, "delta"),
                                                         FloatArgumentType.getFloat($$0x, "speed"),
                                                         IntegerArgumentType.getInteger($$0x, "count"),
                                                         false,
                                                         ((ds)$$0x.getSource()).l().ac().t()
                                                      )
                                                ))
                                             .then(
                                                ((LiteralArgumentBuilder)dt.a("force")
                                                      .executes(
                                                         $$0x -> a(
                                                               (ds)$$0x.getSource(),
                                                               en.a($$0x, "name"),
                                                               fq.a($$0x, "pos"),
                                                               fq.a($$0x, "delta"),
                                                               FloatArgumentType.getFloat($$0x, "speed"),
                                                               IntegerArgumentType.getInteger($$0x, "count"),
                                                               true,
                                                               ((ds)$$0x.getSource()).l().ac().t()
                                                            )
                                                      ))
                                                   .then(
                                                      dt.a("viewers", ed.d())
                                                         .executes(
                                                            $$0x -> a(
                                                                  (ds)$$0x.getSource(),
                                                                  en.a($$0x, "name"),
                                                                  fq.a($$0x, "pos"),
                                                                  fq.a($$0x, "delta"),
                                                                  FloatArgumentType.getFloat($$0x, "speed"),
                                                                  IntegerArgumentType.getInteger($$0x, "count"),
                                                                  true,
                                                                  ed.f($$0x, "viewers")
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)dt.a("normal")
                                                   .executes(
                                                      $$0x -> a(
                                                            (ds)$$0x.getSource(),
                                                            en.a($$0x, "name"),
                                                            fq.a($$0x, "pos"),
                                                            fq.a($$0x, "delta"),
                                                            FloatArgumentType.getFloat($$0x, "speed"),
                                                            IntegerArgumentType.getInteger($$0x, "count"),
                                                            false,
                                                            ((ds)$$0x.getSource()).l().ac().t()
                                                         )
                                                   ))
                                                .then(
                                                   dt.a("viewers", ed.d())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ds)$$0x.getSource(),
                                                               en.a($$0x, "name"),
                                                               fq.a($$0x, "pos"),
                                                               fq.a($$0x, "delta"),
                                                               FloatArgumentType.getFloat($$0x, "speed"),
                                                               IntegerArgumentType.getInteger($$0x, "count"),
                                                               false,
                                                               ed.f($$0x, "viewers")
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

   private static int a(ds $$0, iu $$1, ehf $$2, ehf $$3, float $$4, int $$5, boolean $$6, Collection<akj> $$7) throws CommandSyntaxException {
      int $$8 = 0;

      for (akj $$9 : $$7) {
         if ($$0.e().a($$9, $$1, $$6, $$2.c, $$2.d, $$2.e, $$5, $$3.c, $$3.d, $$3.e, (double)$$4)) {
            $$8++;
         }
      }

      if ($$8 == 0) {
         throw a.create();
      } else {
         $$0.a(() -> te.a("commands.particle.success", jc.k.b($$1.b()).toString()), true);
         return $$8;
      }
   }
}

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class ahl {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tf.c("commands.particle.failed"));

   public static void a(CommandDispatcher<dr> $$0, dl $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("particle").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ds.a("name", em.a($$1))
                     .executes(
                        $$0x -> a(
                              (dr)$$0x.getSource(), em.a($$0x, "name"), ((dr)$$0x.getSource()).d(), ehe.b, 0.0F, 0, false, ((dr)$$0x.getSource()).l().ac().t()
                           )
                     ))
                  .then(
                     ((RequiredArgumentBuilder)ds.a("pos", fp.a())
                           .executes(
                              $$0x -> a((dr)$$0x.getSource(), em.a($$0x, "name"), fp.a($$0x, "pos"), ehe.b, 0.0F, 0, false, ((dr)$$0x.getSource()).l().ac().t())
                           ))
                        .then(
                           ds.a("delta", fp.a(false))
                              .then(
                                 ds.a("speed", FloatArgumentType.floatArg(0.0F))
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ds.a("count", IntegerArgumentType.integer(0))
                                                .executes(
                                                   $$0x -> a(
                                                         (dr)$$0x.getSource(),
                                                         em.a($$0x, "name"),
                                                         fp.a($$0x, "pos"),
                                                         fp.a($$0x, "delta"),
                                                         FloatArgumentType.getFloat($$0x, "speed"),
                                                         IntegerArgumentType.getInteger($$0x, "count"),
                                                         false,
                                                         ((dr)$$0x.getSource()).l().ac().t()
                                                      )
                                                ))
                                             .then(
                                                ((LiteralArgumentBuilder)ds.a("force")
                                                      .executes(
                                                         $$0x -> a(
                                                               (dr)$$0x.getSource(),
                                                               em.a($$0x, "name"),
                                                               fp.a($$0x, "pos"),
                                                               fp.a($$0x, "delta"),
                                                               FloatArgumentType.getFloat($$0x, "speed"),
                                                               IntegerArgumentType.getInteger($$0x, "count"),
                                                               true,
                                                               ((dr)$$0x.getSource()).l().ac().t()
                                                            )
                                                      ))
                                                   .then(
                                                      ds.a("viewers", ec.d())
                                                         .executes(
                                                            $$0x -> a(
                                                                  (dr)$$0x.getSource(),
                                                                  em.a($$0x, "name"),
                                                                  fp.a($$0x, "pos"),
                                                                  fp.a($$0x, "delta"),
                                                                  FloatArgumentType.getFloat($$0x, "speed"),
                                                                  IntegerArgumentType.getInteger($$0x, "count"),
                                                                  true,
                                                                  ec.f($$0x, "viewers")
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)ds.a("normal")
                                                   .executes(
                                                      $$0x -> a(
                                                            (dr)$$0x.getSource(),
                                                            em.a($$0x, "name"),
                                                            fp.a($$0x, "pos"),
                                                            fp.a($$0x, "delta"),
                                                            FloatArgumentType.getFloat($$0x, "speed"),
                                                            IntegerArgumentType.getInteger($$0x, "count"),
                                                            false,
                                                            ((dr)$$0x.getSource()).l().ac().t()
                                                         )
                                                   ))
                                                .then(
                                                   ds.a("viewers", ec.d())
                                                      .executes(
                                                         $$0x -> a(
                                                               (dr)$$0x.getSource(),
                                                               em.a($$0x, "name"),
                                                               fp.a($$0x, "pos"),
                                                               fp.a($$0x, "delta"),
                                                               FloatArgumentType.getFloat($$0x, "speed"),
                                                               IntegerArgumentType.getInteger($$0x, "count"),
                                                               false,
                                                               ec.f($$0x, "viewers")
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

   private static int a(dr $$0, it $$1, ehe $$2, ehe $$3, float $$4, int $$5, boolean $$6, Collection<akl> $$7) throws CommandSyntaxException {
      int $$8 = 0;

      for (akl $$9 : $$7) {
         if ($$0.e().a($$9, $$1, $$6, $$2.c, $$2.d, $$2.e, $$5, $$3.c, $$3.d, $$3.e, (double)$$4)) {
            $$8++;
         }
      }

      if ($$8 == 0) {
         throw a.create();
      } else {
         $$0.a(() -> tf.a("commands.particle.success", jb.k.b($$1.b()).toString()), true);
         return $$8;
      }
   }
}

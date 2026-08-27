import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;

public class aou {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("commands.worldborder.center.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wu.c("commands.worldborder.set.failed.nochange"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wu.c("commands.worldborder.set.failed.small"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wu.a("commands.worldborder.set.failed.big", 5.999997E7F));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wu.a("commands.worldborder.set.failed.far", 2.9999984E7));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(wu.c("commands.worldborder.warning.time.failed"));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(wu.c("commands.worldborder.warning.distance.failed"));
   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(wu.c("commands.worldborder.damage.buffer.failed"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(wu.c("commands.worldborder.damage.amount.failed"));

   public static void a(CommandDispatcher<ed> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a(
                                 "worldborder"
                              )
                              .requires($$0x -> $$0x.c(2)))
                           .then(
                              ee.a("add")
                                 .then(
                                    ((RequiredArgumentBuilder)ee.a("distance", DoubleArgumentType.doubleArg(-5.999997E7F, 5.999997E7F))
                                          .executes(
                                             $$0x -> a(
                                                   (ed)$$0x.getSource(),
                                                   ((ed)$$0x.getSource()).e().C_().i() + DoubleArgumentType.getDouble($$0x, "distance"),
                                                   0L
                                                )
                                          ))
                                       .then(
                                          ee.a("time", IntegerArgumentType.integer(0))
                                             .executes(
                                                $$0x -> a(
                                                      (ed)$$0x.getSource(),
                                                      ((ed)$$0x.getSource()).e().C_().i() + DoubleArgumentType.getDouble($$0x, "distance"),
                                                      ((ed)$$0x.getSource()).e().C_().j() + (long)IntegerArgumentType.getInteger($$0x, "time") * 1000L
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           ee.a("set")
                              .then(
                                 ((RequiredArgumentBuilder)ee.a("distance", DoubleArgumentType.doubleArg(-5.999997E7F, 5.999997E7F))
                                       .executes($$0x -> a((ed)$$0x.getSource(), DoubleArgumentType.getDouble($$0x, "distance"), 0L)))
                                    .then(
                                       ee.a("time", IntegerArgumentType.integer(0))
                                          .executes(
                                             $$0x -> a(
                                                   (ed)$$0x.getSource(),
                                                   DoubleArgumentType.getDouble($$0x, "distance"),
                                                   (long)IntegerArgumentType.getInteger($$0x, "time") * 1000L
                                                )
                                          )
                                    )
                              )
                        ))
                     .then(ee.a("center").then(ee.a("pos", gf.a()).executes($$0x -> a((ed)$$0x.getSource(), gf.a($$0x, "pos"))))))
                  .then(
                     ((LiteralArgumentBuilder)ee.a("damage")
                           .then(
                              ee.a("amount")
                                 .then(
                                    ee.a("damagePerBlock", FloatArgumentType.floatArg(0.0F))
                                       .executes($$0x -> b((ed)$$0x.getSource(), FloatArgumentType.getFloat($$0x, "damagePerBlock")))
                                 )
                           ))
                        .then(
                           ee.a("buffer")
                              .then(
                                 ee.a("distance", FloatArgumentType.floatArg(0.0F))
                                    .executes($$0x -> a((ed)$$0x.getSource(), FloatArgumentType.getFloat($$0x, "distance")))
                              )
                        )
                  ))
               .then(ee.a("get").executes($$0x -> a((ed)$$0x.getSource()))))
            .then(
               ((LiteralArgumentBuilder)ee.a("warning")
                     .then(
                        ee.a("distance")
                           .then(
                              ee.a("distance", IntegerArgumentType.integer(0))
                                 .executes($$0x -> b((ed)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "distance")))
                           )
                     ))
                  .then(
                     ee.a("time")
                        .then(
                           ee.a("time", IntegerArgumentType.integer(0)).executes($$0x -> a((ed)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time")))
                        )
                  )
            )
      );
   }

   private static int a(ed $$0, float $$1) throws CommandSyntaxException {
      dry $$2 = $$0.l().I().C_();
      if ($$2.n() == (double)$$1) {
         throw h.create();
      } else {
         $$2.b((double)$$1);
         $$0.a(() -> wu.a("commands.worldborder.damage.buffer.success", String.format(Locale.ROOT, "%.2f", $$1)), true);
         return (int)$$1;
      }
   }

   private static int b(ed $$0, float $$1) throws CommandSyntaxException {
      dry $$2 = $$0.l().I().C_();
      if ($$2.o() == (double)$$1) {
         throw i.create();
      } else {
         $$2.c((double)$$1);
         $$0.a(() -> wu.a("commands.worldborder.damage.amount.success", String.format(Locale.ROOT, "%.2f", $$1)), true);
         return (int)$$1;
      }
   }

   private static int a(ed $$0, int $$1) throws CommandSyntaxException {
      dry $$2 = $$0.l().I().C_();
      if ($$2.q() == $$1) {
         throw f.create();
      } else {
         $$2.b($$1);
         $$0.a(() -> wu.a("commands.worldborder.warning.time.success", $$1), true);
         return $$1;
      }
   }

   private static int b(ed $$0, int $$1) throws CommandSyntaxException {
      dry $$2 = $$0.l().I().C_();
      if ($$2.r() == $$1) {
         throw g.create();
      } else {
         $$2.c($$1);
         $$0.a(() -> wu.a("commands.worldborder.warning.distance.success", $$1), true);
         return $$1;
      }
   }

   private static int a(ed $$0) {
      double $$1 = $$0.l().I().C_().i();
      $$0.a(() -> wu.a("commands.worldborder.get", String.format(Locale.ROOT, "%.0f", $$1)), false);
      return axz.a($$1 + 0.5);
   }

   private static int a(ed $$0, eto $$1) throws CommandSyntaxException {
      dry $$2 = $$0.l().I().C_();
      if ($$2.a() == (double)$$1.i && $$2.b() == (double)$$1.j) {
         throw a.create();
      } else if (!((double)Math.abs($$1.i) > 2.9999984E7) && !((double)Math.abs($$1.j) > 2.9999984E7)) {
         $$2.c((double)$$1.i, (double)$$1.j);
         $$0.a(() -> wu.a("commands.worldborder.center.success", String.format(Locale.ROOT, "%.2f", $$1.i), String.format(Locale.ROOT, "%.2f", $$1.j)), true);
         return 0;
      } else {
         throw e.create();
      }
   }

   private static int a(ed $$0, double $$1, long $$2) throws CommandSyntaxException {
      dry $$3 = $$0.l().I().C_();
      double $$4 = $$3.i();
      if ($$4 == $$1) {
         throw b.create();
      } else if ($$1 < 1.0) {
         throw c.create();
      } else if ($$1 > 5.999997E7F) {
         throw d.create();
      } else {
         if ($$2 > 0L) {
            $$3.a($$4, $$1, $$2);
            if ($$1 > $$4) {
               $$0.a(() -> wu.a("commands.worldborder.set.grow", String.format(Locale.ROOT, "%.1f", $$1), Long.toString($$2 / 1000L)), true);
            } else {
               $$0.a(() -> wu.a("commands.worldborder.set.shrink", String.format(Locale.ROOT, "%.1f", $$1), Long.toString($$2 / 1000L)), true);
            }
         } else {
            $$3.a($$1);
            $$0.a(() -> wu.a("commands.worldborder.set.immediate", String.format(Locale.ROOT, "%.1f", $$1)), true);
         }

         return (int)($$1 - $$4);
      }
   }
}

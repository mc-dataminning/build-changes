import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;

public class alr {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vf.c("commands.worldborder.center.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vf.c("commands.worldborder.set.failed.nochange"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(vf.c("commands.worldborder.set.failed.small"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(vf.a("commands.worldborder.set.failed.big", 5.999997E7F));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(vf.a("commands.worldborder.set.failed.far", 2.9999984E7));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(vf.c("commands.worldborder.warning.time.failed"));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(vf.c("commands.worldborder.warning.distance.failed"));
   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(vf.c("commands.worldborder.damage.buffer.failed"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(vf.c("commands.worldborder.damage.amount.failed"));

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a(
                                 "worldborder"
                              )
                              .requires($$0x -> $$0x.c(2)))
                           .then(
                              dt.a("add")
                                 .then(
                                    ((RequiredArgumentBuilder)dt.a("distance", DoubleArgumentType.doubleArg(-5.999997E7F, 5.999997E7F))
                                          .executes(
                                             $$0x -> a(
                                                   (ds)$$0x.getSource(),
                                                   ((ds)$$0x.getSource()).e().D_().i() + DoubleArgumentType.getDouble($$0x, "distance"),
                                                   0L
                                                )
                                          ))
                                       .then(
                                          dt.a("time", IntegerArgumentType.integer(0))
                                             .executes(
                                                $$0x -> a(
                                                      (ds)$$0x.getSource(),
                                                      ((ds)$$0x.getSource()).e().D_().i() + DoubleArgumentType.getDouble($$0x, "distance"),
                                                      ((ds)$$0x.getSource()).e().D_().j() + (long)IntegerArgumentType.getInteger($$0x, "time") * 1000L
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           dt.a("set")
                              .then(
                                 ((RequiredArgumentBuilder)dt.a("distance", DoubleArgumentType.doubleArg(-5.999997E7F, 5.999997E7F))
                                       .executes($$0x -> a((ds)$$0x.getSource(), DoubleArgumentType.getDouble($$0x, "distance"), 0L)))
                                    .then(
                                       dt.a("time", IntegerArgumentType.integer(0))
                                          .executes(
                                             $$0x -> a(
                                                   (ds)$$0x.getSource(),
                                                   DoubleArgumentType.getDouble($$0x, "distance"),
                                                   (long)IntegerArgumentType.getInteger($$0x, "time") * 1000L
                                                )
                                          )
                                    )
                              )
                        ))
                     .then(dt.a("center").then(dt.a("pos", fs.a()).executes($$0x -> a((ds)$$0x.getSource(), fs.a($$0x, "pos"))))))
                  .then(
                     ((LiteralArgumentBuilder)dt.a("damage")
                           .then(
                              dt.a("amount")
                                 .then(
                                    dt.a("damagePerBlock", FloatArgumentType.floatArg(0.0F))
                                       .executes($$0x -> b((ds)$$0x.getSource(), FloatArgumentType.getFloat($$0x, "damagePerBlock")))
                                 )
                           ))
                        .then(
                           dt.a("buffer")
                              .then(
                                 dt.a("distance", FloatArgumentType.floatArg(0.0F))
                                    .executes($$0x -> a((ds)$$0x.getSource(), FloatArgumentType.getFloat($$0x, "distance")))
                              )
                        )
                  ))
               .then(dt.a("get").executes($$0x -> a((ds)$$0x.getSource()))))
            .then(
               ((LiteralArgumentBuilder)dt.a("warning")
                     .then(
                        dt.a("distance")
                           .then(
                              dt.a("distance", IntegerArgumentType.integer(0))
                                 .executes($$0x -> b((ds)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "distance")))
                           )
                     ))
                  .then(
                     dt.a("time")
                        .then(
                           dt.a("time", IntegerArgumentType.integer(0)).executes($$0x -> a((ds)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time")))
                        )
                  )
            )
      );
   }

   private static int a(ds $$0, float $$1) throws CommandSyntaxException {
      dkx $$2 = $$0.l().F().D_();
      if ($$2.n() == (double)$$1) {
         throw h.create();
      } else {
         $$2.b((double)$$1);
         $$0.a(() -> vf.a("commands.worldborder.damage.buffer.success", String.format(Locale.ROOT, "%.2f", $$1)), true);
         return (int)$$1;
      }
   }

   private static int b(ds $$0, float $$1) throws CommandSyntaxException {
      dkx $$2 = $$0.l().F().D_();
      if ($$2.o() == (double)$$1) {
         throw i.create();
      } else {
         $$2.c((double)$$1);
         $$0.a(() -> vf.a("commands.worldborder.damage.amount.success", String.format(Locale.ROOT, "%.2f", $$1)), true);
         return (int)$$1;
      }
   }

   private static int a(ds $$0, int $$1) throws CommandSyntaxException {
      dkx $$2 = $$0.l().F().D_();
      if ($$2.q() == $$1) {
         throw f.create();
      } else {
         $$2.b($$1);
         $$0.a(() -> vf.a("commands.worldborder.warning.time.success", $$1), true);
         return $$1;
      }
   }

   private static int b(ds $$0, int $$1) throws CommandSyntaxException {
      dkx $$2 = $$0.l().F().D_();
      if ($$2.r() == $$1) {
         throw g.create();
      } else {
         $$2.c($$1);
         $$0.a(() -> vf.a("commands.worldborder.warning.distance.success", $$1), true);
         return $$1;
      }
   }

   private static int a(ds $$0) {
      double $$1 = $$0.l().F().D_().i();
      $$0.a(() -> vf.a("commands.worldborder.get", String.format(Locale.ROOT, "%.0f", $$1)), false);
      return aun.a($$1 + 0.5);
   }

   private static int a(ds $$0, elr $$1) throws CommandSyntaxException {
      dkx $$2 = $$0.l().F().D_();
      if ($$2.a() == (double)$$1.i && $$2.b() == (double)$$1.j) {
         throw a.create();
      } else if (!((double)Math.abs($$1.i) > 2.9999984E7) && !((double)Math.abs($$1.j) > 2.9999984E7)) {
         $$2.c((double)$$1.i, (double)$$1.j);
         $$0.a(() -> vf.a("commands.worldborder.center.success", String.format(Locale.ROOT, "%.2f", $$1.i), String.format(Locale.ROOT, "%.2f", $$1.j)), true);
         return 0;
      } else {
         throw e.create();
      }
   }

   private static int a(ds $$0, double $$1, long $$2) throws CommandSyntaxException {
      dkx $$3 = $$0.l().F().D_();
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
               $$0.a(() -> vf.a("commands.worldborder.set.grow", String.format(Locale.ROOT, "%.1f", $$1), Long.toString($$2 / 1000L)), true);
            } else {
               $$0.a(() -> vf.a("commands.worldborder.set.shrink", String.format(Locale.ROOT, "%.1f", $$1), Long.toString($$2 / 1000L)), true);
            }
         } else {
            $$3.a($$1);
            $$0.a(() -> vf.a("commands.worldborder.set.immediate", String.format(Locale.ROOT, "%.1f", $$1)), true);
         }

         return (int)($$1 - $$4);
      }
   }
}

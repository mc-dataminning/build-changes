import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;

public class aoz {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wx.c("commands.worldborder.center.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wx.c("commands.worldborder.set.failed.nochange"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wx.c("commands.worldborder.set.failed.small"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wx.a("commands.worldborder.set.failed.big", 5.999997E7F));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wx.a("commands.worldborder.set.failed.far", 2.9999984E7));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(wx.c("commands.worldborder.warning.time.failed"));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(wx.c("commands.worldborder.warning.distance.failed"));
   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(wx.c("commands.worldborder.damage.buffer.failed"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(wx.c("commands.worldborder.damage.amount.failed"));

   public static void a(CommandDispatcher<ee> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a(
                                 "worldborder"
                              )
                              .requires($$0x -> $$0x.c(2)))
                           .then(
                              ef.a("add")
                                 .then(
                                    ((RequiredArgumentBuilder)ef.a("distance", DoubleArgumentType.doubleArg(-5.999997E7F, 5.999997E7F))
                                          .executes(
                                             $$0x -> a(
                                                   (ee)$$0x.getSource(),
                                                   ((ee)$$0x.getSource()).e().C_().i() + DoubleArgumentType.getDouble($$0x, "distance"),
                                                   0L
                                                )
                                          ))
                                       .then(
                                          ef.a("time", IntegerArgumentType.integer(0))
                                             .executes(
                                                $$0x -> a(
                                                      (ee)$$0x.getSource(),
                                                      ((ee)$$0x.getSource()).e().C_().i() + DoubleArgumentType.getDouble($$0x, "distance"),
                                                      ((ee)$$0x.getSource()).e().C_().j() + (long)IntegerArgumentType.getInteger($$0x, "time") * 1000L
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           ef.a("set")
                              .then(
                                 ((RequiredArgumentBuilder)ef.a("distance", DoubleArgumentType.doubleArg(-5.999997E7F, 5.999997E7F))
                                       .executes($$0x -> a((ee)$$0x.getSource(), DoubleArgumentType.getDouble($$0x, "distance"), 0L)))
                                    .then(
                                       ef.a("time", IntegerArgumentType.integer(0))
                                          .executes(
                                             $$0x -> a(
                                                   (ee)$$0x.getSource(),
                                                   DoubleArgumentType.getDouble($$0x, "distance"),
                                                   (long)IntegerArgumentType.getInteger($$0x, "time") * 1000L
                                                )
                                          )
                                    )
                              )
                        ))
                     .then(ef.a("center").then(ef.a("pos", gg.a()).executes($$0x -> a((ee)$$0x.getSource(), gg.a($$0x, "pos"))))))
                  .then(
                     ((LiteralArgumentBuilder)ef.a("damage")
                           .then(
                              ef.a("amount")
                                 .then(
                                    ef.a("damagePerBlock", FloatArgumentType.floatArg(0.0F))
                                       .executes($$0x -> b((ee)$$0x.getSource(), FloatArgumentType.getFloat($$0x, "damagePerBlock")))
                                 )
                           ))
                        .then(
                           ef.a("buffer")
                              .then(
                                 ef.a("distance", FloatArgumentType.floatArg(0.0F))
                                    .executes($$0x -> a((ee)$$0x.getSource(), FloatArgumentType.getFloat($$0x, "distance")))
                              )
                        )
                  ))
               .then(ef.a("get").executes($$0x -> a((ee)$$0x.getSource()))))
            .then(
               ((LiteralArgumentBuilder)ef.a("warning")
                     .then(
                        ef.a("distance")
                           .then(
                              ef.a("distance", IntegerArgumentType.integer(0))
                                 .executes($$0x -> b((ee)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "distance")))
                           )
                     ))
                  .then(
                     ef.a("time")
                        .then(
                           ef.a("time", IntegerArgumentType.integer(0)).executes($$0x -> a((ee)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time")))
                        )
                  )
            )
      );
   }

   private static int a(ee $$0, float $$1) throws CommandSyntaxException {
      dss $$2 = $$0.l().I().C_();
      if ($$2.n() == (double)$$1) {
         throw h.create();
      } else {
         $$2.b((double)$$1);
         $$0.a(() -> wx.a("commands.worldborder.damage.buffer.success", String.format(Locale.ROOT, "%.2f", $$1)), true);
         return (int)$$1;
      }
   }

   private static int b(ee $$0, float $$1) throws CommandSyntaxException {
      dss $$2 = $$0.l().I().C_();
      if ($$2.o() == (double)$$1) {
         throw i.create();
      } else {
         $$2.c((double)$$1);
         $$0.a(() -> wx.a("commands.worldborder.damage.amount.success", String.format(Locale.ROOT, "%.2f", $$1)), true);
         return (int)$$1;
      }
   }

   private static int a(ee $$0, int $$1) throws CommandSyntaxException {
      dss $$2 = $$0.l().I().C_();
      if ($$2.q() == $$1) {
         throw f.create();
      } else {
         $$2.b($$1);
         $$0.a(() -> wx.a("commands.worldborder.warning.time.success", $$1), true);
         return $$1;
      }
   }

   private static int b(ee $$0, int $$1) throws CommandSyntaxException {
      dss $$2 = $$0.l().I().C_();
      if ($$2.r() == $$1) {
         throw g.create();
      } else {
         $$2.c($$1);
         $$0.a(() -> wx.a("commands.worldborder.warning.distance.success", $$1), true);
         return $$1;
      }
   }

   private static int a(ee $$0) {
      double $$1 = $$0.l().I().C_().i();
      $$0.a(() -> wx.a("commands.worldborder.get", String.format(Locale.ROOT, "%.0f", $$1)), false);
      return ayd.a($$1 + 0.5);
   }

   private static int a(ee $$0, euj $$1) throws CommandSyntaxException {
      dss $$2 = $$0.l().I().C_();
      if ($$2.a() == (double)$$1.i && $$2.b() == (double)$$1.j) {
         throw a.create();
      } else if (!((double)Math.abs($$1.i) > 2.9999984E7) && !((double)Math.abs($$1.j) > 2.9999984E7)) {
         $$2.c((double)$$1.i, (double)$$1.j);
         $$0.a(() -> wx.a("commands.worldborder.center.success", String.format(Locale.ROOT, "%.2f", $$1.i), String.format(Locale.ROOT, "%.2f", $$1.j)), true);
         return 0;
      } else {
         throw e.create();
      }
   }

   private static int a(ee $$0, double $$1, long $$2) throws CommandSyntaxException {
      dss $$3 = $$0.l().I().C_();
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
               $$0.a(() -> wx.a("commands.worldborder.set.grow", String.format(Locale.ROOT, "%.1f", $$1), Long.toString($$2 / 1000L)), true);
            } else {
               $$0.a(() -> wx.a("commands.worldborder.set.shrink", String.format(Locale.ROOT, "%.1f", $$1), Long.toString($$2 / 1000L)), true);
            }
         } else {
            $$3.a($$1);
            $$0.a(() -> wx.a("commands.worldborder.set.immediate", String.format(Locale.ROOT, "%.1f", $$1)), true);
         }

         return (int)($$1 - $$4);
      }
   }
}

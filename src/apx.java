import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;

public class apx {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wy.c("commands.worldborder.center.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wy.c("commands.worldborder.set.failed.nochange"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wy.c("commands.worldborder.set.failed.small"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wy.a("commands.worldborder.set.failed.big", 5.999997E7F));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wy.a("commands.worldborder.set.failed.far", 2.9999984E7));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(wy.c("commands.worldborder.warning.time.failed"));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(wy.c("commands.worldborder.warning.distance.failed"));
   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(wy.c("commands.worldborder.damage.buffer.failed"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(wy.c("commands.worldborder.damage.amount.failed"));

   public static void a(CommandDispatcher<ej> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a(
                                 "worldborder"
                              )
                              .requires($$0x -> $$0x.c(2)))
                           .then(
                              ek.a("add")
                                 .then(
                                    ((RequiredArgumentBuilder)ek.a("distance", DoubleArgumentType.doubleArg(-5.999997E7F, 5.999997E7F))
                                          .executes(
                                             $$0x -> a(
                                                   (ej)$$0x.getSource(),
                                                   ((ej)$$0x.getSource()).e().A_().i() + DoubleArgumentType.getDouble($$0x, "distance"),
                                                   0L
                                                )
                                          ))
                                       .then(
                                          ek.a("time", IntegerArgumentType.integer(0))
                                             .executes(
                                                $$0x -> a(
                                                      (ej)$$0x.getSource(),
                                                      ((ej)$$0x.getSource()).e().A_().i() + DoubleArgumentType.getDouble($$0x, "distance"),
                                                      ((ej)$$0x.getSource()).e().A_().j() + (long)IntegerArgumentType.getInteger($$0x, "time") * 1000L
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           ek.a("set")
                              .then(
                                 ((RequiredArgumentBuilder)ek.a("distance", DoubleArgumentType.doubleArg(-5.999997E7F, 5.999997E7F))
                                       .executes($$0x -> a((ej)$$0x.getSource(), DoubleArgumentType.getDouble($$0x, "distance"), 0L)))
                                    .then(
                                       ek.a("time", IntegerArgumentType.integer(0))
                                          .executes(
                                             $$0x -> a(
                                                   (ej)$$0x.getSource(),
                                                   DoubleArgumentType.getDouble($$0x, "distance"),
                                                   (long)IntegerArgumentType.getInteger($$0x, "time") * 1000L
                                                )
                                          )
                                    )
                              )
                        ))
                     .then(ek.a("center").then(ek.a("pos", gm.a()).executes($$0x -> a((ej)$$0x.getSource(), gm.a($$0x, "pos"))))))
                  .then(
                     ((LiteralArgumentBuilder)ek.a("damage")
                           .then(
                              ek.a("amount")
                                 .then(
                                    ek.a("damagePerBlock", FloatArgumentType.floatArg(0.0F))
                                       .executes($$0x -> b((ej)$$0x.getSource(), FloatArgumentType.getFloat($$0x, "damagePerBlock")))
                                 )
                           ))
                        .then(
                           ek.a("buffer")
                              .then(
                                 ek.a("distance", FloatArgumentType.floatArg(0.0F))
                                    .executes($$0x -> a((ej)$$0x.getSource(), FloatArgumentType.getFloat($$0x, "distance")))
                              )
                        )
                  ))
               .then(ek.a("get").executes($$0x -> a((ej)$$0x.getSource()))))
            .then(
               ((LiteralArgumentBuilder)ek.a("warning")
                     .then(
                        ek.a("distance")
                           .then(
                              ek.a("distance", IntegerArgumentType.integer(0))
                                 .executes($$0x -> b((ej)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "distance")))
                           )
                     ))
                  .then(
                     ek.a("time")
                        .then(
                           ek.a("time", IntegerArgumentType.integer(0)).executes($$0x -> a((ej)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time")))
                        )
                  )
            )
      );
   }

   private static int a(ej $$0, float $$1) throws CommandSyntaxException {
      ecl $$2 = $$0.l().J().A_();
      if ($$2.n() == (double)$$1) {
         throw h.create();
      } else {
         $$2.b((double)$$1);
         $$0.a(() -> wy.a("commands.worldborder.damage.buffer.success", String.format(Locale.ROOT, "%.2f", $$1)), true);
         return (int)$$1;
      }
   }

   private static int b(ej $$0, float $$1) throws CommandSyntaxException {
      ecl $$2 = $$0.l().J().A_();
      if ($$2.o() == (double)$$1) {
         throw i.create();
      } else {
         $$2.c((double)$$1);
         $$0.a(() -> wy.a("commands.worldborder.damage.amount.success", String.format(Locale.ROOT, "%.2f", $$1)), true);
         return (int)$$1;
      }
   }

   private static int a(ej $$0, int $$1) throws CommandSyntaxException {
      ecl $$2 = $$0.l().J().A_();
      if ($$2.q() == $$1) {
         throw f.create();
      } else {
         $$2.b($$1);
         $$0.a(() -> wy.a("commands.worldborder.warning.time.success", $$1), true);
         return $$1;
      }
   }

   private static int b(ej $$0, int $$1) throws CommandSyntaxException {
      ecl $$2 = $$0.l().J().A_();
      if ($$2.r() == $$1) {
         throw g.create();
      } else {
         $$2.c($$1);
         $$0.a(() -> wy.a("commands.worldborder.warning.distance.success", $$1), true);
         return $$1;
      }
   }

   private static int a(ej $$0) {
      double $$1 = $$0.l().J().A_().i();
      $$0.a(() -> wy.a("commands.worldborder.get", String.format(Locale.ROOT, "%.0f", $$1)), false);
      return azm.a($$1 + 0.5);
   }

   private static int a(ej $$0, ffb $$1) throws CommandSyntaxException {
      ecl $$2 = $$0.l().J().A_();
      if ($$2.a() == (double)$$1.j && $$2.b() == (double)$$1.k) {
         throw a.create();
      } else if (!((double)Math.abs($$1.j) > 2.9999984E7) && !((double)Math.abs($$1.k) > 2.9999984E7)) {
         $$2.d((double)$$1.j, (double)$$1.k);
         $$0.a(() -> wy.a("commands.worldborder.center.success", String.format(Locale.ROOT, "%.2f", $$1.j), String.format(Locale.ROOT, "%.2f", $$1.k)), true);
         return 0;
      } else {
         throw e.create();
      }
   }

   private static int a(ej $$0, double $$1, long $$2) throws CommandSyntaxException {
      ecl $$3 = $$0.l().J().A_();
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
               $$0.a(() -> wy.a("commands.worldborder.set.grow", String.format(Locale.ROOT, "%.1f", $$1), Long.toString($$2 / 1000L)), true);
            } else {
               $$0.a(() -> wy.a("commands.worldborder.set.shrink", String.format(Locale.ROOT, "%.1f", $$1), Long.toString($$2 / 1000L)), true);
            }
         } else {
            $$3.a($$1);
            $$0.a(() -> wy.a("commands.worldborder.set.immediate", String.format(Locale.ROOT, "%.1f", $$1)), true);
         }

         return (int)($$1 - $$4);
      }
   }
}

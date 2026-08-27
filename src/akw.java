import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Arrays;

public class akw {
   private static final float a = 10000.0F;
   private static final String b = String.valueOf(20);

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a(
                                 "tick"
                              )
                              .requires($$0x -> $$0x.c(3)))
                           .then(dt.a("query").executes($$0x -> a((ds)$$0x.getSource()))))
                        .then(
                           dt.a("rate")
                              .then(
                                 dt.a("rate", FloatArgumentType.floatArg(1.0F, 10000.0F))
                                    .suggests(($$0x, $$1) -> dw.a(new String[]{b}, $$1))
                                    .executes($$0x -> a((ds)$$0x.getSource(), FloatArgumentType.getFloat($$0x, "rate")))
                              )
                        ))
                     .then(
                        ((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("step").executes($$0x -> b((ds)$$0x.getSource(), 1)))
                              .then(dt.a("stop").executes($$0x -> b((ds)$$0x.getSource()))))
                           .then(
                              dt.a("time", fd.a(1))
                                 .suggests(($$0x, $$1) -> dw.a(new String[]{"1t", "1s"}, $$1))
                                 .executes($$0x -> b((ds)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time")))
                           )
                     ))
                  .then(
                     ((LiteralArgumentBuilder)dt.a("sprint").then(dt.a("stop").executes($$0x -> c((ds)$$0x.getSource()))))
                        .then(
                           dt.a("time", fd.a(1))
                              .suggests(($$0x, $$1) -> dw.a(new String[]{"60s", "1d", "3d"}, $$1))
                              .executes($$0x -> a((ds)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time")))
                        )
                  ))
               .then(dt.a("unfreeze").executes($$0x -> a((ds)$$0x.getSource(), false))))
            .then(dt.a("freeze").executes($$0x -> a((ds)$$0x.getSource(), true)))
      );
   }

   private static String a(long $$0) {
      return String.format("%.1f", (float)$$0 / (float)auz.b);
   }

   private static int a(ds $$0, float $$1) {
      ahl $$2 = $$0.l().aO();
      $$2.a($$1);
      String $$3 = String.format("%.1f", $$1);
      $$0.a(() -> vb.a("commands.tick.rate.success", $$3), true);
      return (int)$$1;
   }

   private static int a(ds $$0) {
      ahl $$1 = $$0.l().aO();
      String $$2 = a($$0.l().aP());
      float $$3 = $$1.f();
      String $$4 = String.format("%.1f", $$3);
      if ($$1.a()) {
         $$0.a(() -> vb.c("commands.tick.status.sprinting"), false);
         $$0.a(() -> vb.a("commands.tick.query.rate.sprinting", $$4, $$2), false);
      } else {
         if ($$1.l()) {
            $$0.a(() -> vb.c("commands.tick.status.frozen"), false);
         } else {
            $$0.a(() -> vb.c("commands.tick.status.running"), false);
         }

         String $$5 = a($$1.h());
         $$0.a(() -> vb.a("commands.tick.query.rate.running", $$4, $$2, $$5), false);
      }

      long[] $$6 = Arrays.copyOf($$0.l().aQ(), $$0.l().aQ().length);
      Arrays.sort($$6);
      String $$7 = a($$6[$$6.length / 2]);
      String $$8 = a($$6[(int)((double)$$6.length * 0.95)]);
      String $$9 = a($$6[(int)((double)$$6.length * 0.99)]);
      $$0.a(() -> vb.a("commands.tick.query.percentiles", $$7, $$8, $$9, $$6.length), false);
      return (int)$$3;
   }

   private static int a(ds $$0, int $$1) {
      boolean $$2 = $$0.l().aO().b($$1);
      if ($$2) {
         $$0.a(() -> vb.c("commands.tick.sprint.stop.success"), true);
      }

      $$0.a(() -> vb.c("commands.tick.status.sprinting"), true);
      return 1;
   }

   private static int a(ds $$0, boolean $$1) {
      ahl $$2 = $$0.l().aO();
      if ($$1) {
         if ($$2.a()) {
            $$2.c();
         }

         if ($$2.j()) {
            $$2.b();
         }
      }

      $$2.a($$1);
      if ($$1) {
         $$0.a(() -> vb.c("commands.tick.status.frozen"), true);
      } else {
         $$0.a(() -> vb.c("commands.tick.status.running"), true);
      }

      return $$1 ? 1 : 0;
   }

   private static int b(ds $$0, int $$1) {
      ahl $$2 = $$0.l().aO();
      boolean $$3 = $$2.a($$1);
      if ($$3) {
         $$0.a(() -> vb.a("commands.tick.step.success", $$1), true);
      } else {
         $$0.b(vb.c("commands.tick.step.fail"));
      }

      return 1;
   }

   private static int b(ds $$0) {
      ahl $$1 = $$0.l().aO();
      boolean $$2 = $$1.b();
      if ($$2) {
         $$0.a(() -> vb.c("commands.tick.step.stop.success"), true);
         return 1;
      } else {
         $$0.b(vb.c("commands.tick.step.stop.fail"));
         return 0;
      }
   }

   private static int c(ds $$0) {
      ahl $$1 = $$0.l().aO();
      boolean $$2 = $$1.c();
      if ($$2) {
         $$0.a(() -> vb.c("commands.tick.sprint.stop.success"), true);
         return 1;
      } else {
         $$0.b(vb.c("commands.tick.sprint.stop.fail"));
         return 0;
      }
   }
}

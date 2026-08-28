import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Arrays;

public class apk {
   private static final float a = 10000.0F;
   private static final String b = String.valueOf(20);

   public static void a(CommandDispatcher<ep> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a(
                                 "tick"
                              )
                              .requires($$0x -> $$0x.c(3)))
                           .then(eq.a("query").executes($$0x -> a((ep)$$0x.getSource()))))
                        .then(
                           eq.a("rate")
                              .then(
                                 eq.a("rate", FloatArgumentType.floatArg(1.0F, 10000.0F))
                                    .suggests(($$0x, $$1) -> eu.a(new String[]{b}, $$1))
                                    .executes($$0x -> a((ep)$$0x.getSource(), FloatArgumentType.getFloat($$0x, "rate")))
                              )
                        ))
                     .then(
                        ((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("step").executes($$0x -> b((ep)$$0x.getSource(), 1)))
                              .then(eq.a("stop").executes($$0x -> b((ep)$$0x.getSource()))))
                           .then(
                              eq.a("time", ge.a(1))
                                 .suggests(($$0x, $$1) -> eu.a(new String[]{"1t", "1s"}, $$1))
                                 .executes($$0x -> b((ep)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time")))
                           )
                     ))
                  .then(
                     ((LiteralArgumentBuilder)eq.a("sprint").then(eq.a("stop").executes($$0x -> c((ep)$$0x.getSource()))))
                        .then(
                           eq.a("time", ge.a(1))
                              .suggests(($$0x, $$1) -> eu.a(new String[]{"60s", "1d", "3d"}, $$1))
                              .executes($$0x -> a((ep)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time")))
                        )
                  ))
               .then(eq.a("unfreeze").executes($$0x -> a((ep)$$0x.getSource(), false))))
            .then(eq.a("freeze").executes($$0x -> a((ep)$$0x.getSource(), true)))
      );
   }

   private static String a(long $$0) {
      return String.format("%.1f", (float)$$0 / (float)azz.b);
   }

   private static int a(ep $$0, float $$1) {
      aly $$2 = $$0.l().aQ();
      $$2.a($$1);
      String $$3 = String.format("%.1f", $$1);
      $$0.a(() -> xp.a("commands.tick.rate.success", $$3), true);
      return (int)$$1;
   }

   private static int a(ep $$0) {
      aly $$1 = $$0.l().aQ();
      String $$2 = a($$0.l().aR());
      float $$3 = $$1.f();
      String $$4 = String.format("%.1f", $$3);
      if ($$1.a()) {
         $$0.a(() -> xp.c("commands.tick.status.sprinting"), false);
         $$0.a(() -> xp.a("commands.tick.query.rate.sprinting", $$4, $$2), false);
      } else {
         if ($$1.l()) {
            $$0.a(() -> xp.c("commands.tick.status.frozen"), false);
         } else if ($$1.h() < $$0.l().aR()) {
            $$0.a(() -> xp.c("commands.tick.status.lagging"), false);
         } else {
            $$0.a(() -> xp.c("commands.tick.status.running"), false);
         }

         String $$5 = a($$1.h());
         $$0.a(() -> xp.a("commands.tick.query.rate.running", $$4, $$2, $$5), false);
      }

      long[] $$6 = Arrays.copyOf($$0.l().aS(), $$0.l().aS().length);
      Arrays.sort($$6);
      String $$7 = a($$6[$$6.length / 2]);
      String $$8 = a($$6[(int)((double)$$6.length * 0.95)]);
      String $$9 = a($$6[(int)((double)$$6.length * 0.99)]);
      $$0.a(() -> xp.a("commands.tick.query.percentiles", $$7, $$8, $$9, $$6.length), false);
      return (int)$$3;
   }

   private static int a(ep $$0, int $$1) {
      boolean $$2 = $$0.l().aQ().b($$1);
      if ($$2) {
         $$0.a(() -> xp.c("commands.tick.sprint.stop.success"), true);
      }

      $$0.a(() -> xp.c("commands.tick.status.sprinting"), true);
      return 1;
   }

   private static int a(ep $$0, boolean $$1) {
      aly $$2 = $$0.l().aQ();
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
         $$0.a(() -> xp.c("commands.tick.status.frozen"), true);
      } else {
         $$0.a(() -> xp.c("commands.tick.status.running"), true);
      }

      return $$1 ? 1 : 0;
   }

   private static int b(ep $$0, int $$1) {
      aly $$2 = $$0.l().aQ();
      boolean $$3 = $$2.a($$1);
      if ($$3) {
         $$0.a(() -> xp.a("commands.tick.step.success", $$1), true);
      } else {
         $$0.b(xp.c("commands.tick.step.fail"));
      }

      return 1;
   }

   private static int b(ep $$0) {
      aly $$1 = $$0.l().aQ();
      boolean $$2 = $$1.b();
      if ($$2) {
         $$0.a(() -> xp.c("commands.tick.step.stop.success"), true);
         return 1;
      } else {
         $$0.b(xp.c("commands.tick.step.stop.fail"));
         return 0;
      }
   }

   private static int c(ep $$0) {
      aly $$1 = $$0.l().aQ();
      boolean $$2 = $$1.c();
      if ($$2) {
         $$0.a(() -> xp.c("commands.tick.sprint.stop.success"), true);
         return 1;
      } else {
         $$0.b(xp.c("commands.tick.sprint.stop.fail"));
         return 0;
      }
   }
}

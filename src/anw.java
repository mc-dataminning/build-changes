import com.google.common.base.Stopwatch;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.time.Duration;
import java.util.Optional;
import org.slf4j.Logger;

public class anw {
   private static final Logger a = LogUtils.getLogger();
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xe.b("commands.locate.structure.not_found", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xe.b("commands.locate.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xe.b("commands.locate.biome.not_found", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xe.b("commands.locate.poi.not_found", $$0));
   private static final int f = 100;
   private static final int g = 6400;
   private static final int h = 32;
   private static final int i = 64;
   private static final int j = 256;

   public static void a(CommandDispatcher<eu> $$0, eq $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("locate").requires($$0x -> $$0x.c(2)))
                  .then(ev.a("structure").then(ev.a("structure", fy.a(lw.aT)).executes($$0x -> a((eu)$$0x.getSource(), fy.a($$0x, "structure", lw.aT, c))))))
               .then(ev.a("biome").then(ev.a("biome", fx.a($$1, lw.aH)).executes($$0x -> a((eu)$$0x.getSource(), fx.a($$0x, "biome", lw.aH))))))
            .then(ev.a("poi").then(ev.a("poi", fx.a($$1, lw.aa)).executes($$0x -> b((eu)$$0x.getSource(), fx.a($$0x, "poi", lw.aa)))))
      );
   }

   private static Optional<? extends js.b<elg>> a(fy.c<elg> $$0, kb<elg> $$1) {
      return (Optional<? extends js.b<elg>>)$$0.a().map($$1x -> $$1.a($$1x).map($$0xx -> js.a($$0xx)), $$1::a);
   }

   private static int a(eu $$0, fy.c<elg> $$1) throws CommandSyntaxException {
      kb<elg> $$2 = $$0.e().G_().e(lw.aT);
      js<elg> $$3 = (js<elg>)a($$1, $$2).orElseThrow(() -> c.create($$1.b()));
      jf $$4 = jf.a((jy)$$0.d());
      arj $$5 = $$0.e();
      Stopwatch $$6 = Stopwatch.createStarted(ad.d);
      Pair<jf, jo<elg>> $$7 = $$5.l().g().a($$5, $$3, $$4, 100, false);
      $$6.stop();
      if ($$7 == null) {
         throw b.create($$1.b());
      } else {
         return a($$0, $$1, $$4, $$7, "commands.locate.structure.success", false, $$6.elapsed());
      }
   }

   private static int a(eu $$0, fx.c<dfk> $$1) throws CommandSyntaxException {
      jf $$2 = jf.a((jy)$$0.d());
      Stopwatch $$3 = Stopwatch.createStarted(ad.d);
      Pair<jf, jo<dfk>> $$4 = $$0.e().a($$1, $$2, 6400, 32, 64);
      $$3.stop();
      if ($$4 == null) {
         throw d.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$4, "commands.locate.biome.success", true, $$3.elapsed());
      }
   }

   private static int b(eu $$0, fx.c<cft> $$1) throws CommandSyntaxException {
      jf $$2 = jf.a((jy)$$0.d());
      arj $$3 = $$0.e();
      Stopwatch $$4 = Stopwatch.createStarted(ad.d);
      Optional<Pair<jo<cft>, jf>> $$5 = $$3.y().e($$1, $$2, 256, cfq.b.c);
      $$4.stop();
      if ($$5.isEmpty()) {
         throw e.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$5.get().swap(), "commands.locate.poi.success", false, $$4.elapsed());
      }
   }

   public static int a(eu $$0, fx.c<?> $$1, jf $$2, Pair<jf, ? extends jo<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$1x -> $$1.b(), $$2x -> $$1.b() + " (" + ((jo)$$3.getSecond()).g() + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   public static int a(eu $$0, fy.c<?> $$1, jf $$2, Pair<jf, ? extends jo<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$0x -> $$0x.a().toString(), $$1x -> "#" + $$1x.b() + " (" + ((jo)$$3.getSecond()).g() + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   private static int a(eu $$0, jf $$1, Pair<jf, ? extends jo<?>> $$2, String $$3, boolean $$4, String $$5, Duration $$6) {
      jf $$7 = (jf)$$2.getFirst();
      int $$8 = $$4 ? azf.d(azf.c((float)$$1.j($$7))) : azf.d(a($$1.u(), $$1.w(), $$7.u(), $$7.w()));
      String $$9 = $$4 ? String.valueOf($$7.v()) : "~";
      xe $$10 = xh.a((xe)xe.a("chat.coordinates", $$7.u(), $$9, $$7.w()))
         .a($$2x -> $$2x.a(n.k).a(new xc(xc.a.d, "/tp @s " + $$7.u() + " " + $$9 + " " + $$7.w())).a(new xk(xk.a.a, xe.c("chat.coordinates.tooltip"))));
      $$0.a(() -> xe.a($$3, $$5, $$10, $$8), false);
      a.info("Locating element " + $$5 + " took " + $$6.toMillis() + " ms");
      return $$8;
   }

   private static float a(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$2 - $$0;
      int $$5 = $$3 - $$1;
      return azf.c((float)($$4 * $$4 + $$5 * $$5));
   }
}

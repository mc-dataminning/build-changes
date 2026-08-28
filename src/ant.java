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

public class ant {
   private static final Logger a = LogUtils.getLogger();
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xd.b("commands.locate.structure.not_found", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xd.b("commands.locate.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xd.b("commands.locate.biome.not_found", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xd.b("commands.locate.poi.not_found", $$0));
   private static final int f = 100;
   private static final int g = 6400;
   private static final int h = 32;
   private static final int i = 64;
   private static final int j = 256;

   public static void a(CommandDispatcher<et> $$0, ep $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("locate").requires($$0x -> $$0x.c(2)))
                  .then(eu.a("structure").then(eu.a("structure", fx.a(lv.aR)).executes($$0x -> a((et)$$0x.getSource(), fx.a($$0x, "structure", lv.aR, c))))))
               .then(eu.a("biome").then(eu.a("biome", fw.a($$1, lv.aF)).executes($$0x -> a((et)$$0x.getSource(), fw.a($$0x, "biome", lv.aF))))))
            .then(eu.a("poi").then(eu.a("poi", fw.a($$1, lv.aa)).executes($$0x -> b((et)$$0x.getSource(), fw.a($$0x, "poi", lv.aa)))))
      );
   }

   private static Optional<? extends jr.b<eko>> a(fx.c<eko> $$0, ka<eko> $$1) {
      return (Optional<? extends jr.b<eko>>)$$0.a().map($$1x -> $$1.b($$1x).map($$0xx -> jr.a($$0xx)), $$1::a);
   }

   private static int a(et $$0, fx.c<eko> $$1) throws CommandSyntaxException {
      ka<eko> $$2 = $$0.e().F_().d(lv.aR);
      jr<eko> $$3 = (jr<eko>)a($$1, $$2).orElseThrow(() -> c.create($$1.b()));
      je $$4 = je.a((jx)$$0.d());
      arg $$5 = $$0.e();
      Stopwatch $$6 = Stopwatch.createStarted(ad.d);
      Pair<je, jn<eko>> $$7 = $$5.l().g().a($$5, $$3, $$4, 100, false);
      $$6.stop();
      if ($$7 == null) {
         throw b.create($$1.b());
      } else {
         return a($$0, $$1, $$4, $$7, "commands.locate.structure.success", false, $$6.elapsed());
      }
   }

   private static int a(et $$0, fw.c<det> $$1) throws CommandSyntaxException {
      je $$2 = je.a((jx)$$0.d());
      Stopwatch $$3 = Stopwatch.createStarted(ad.d);
      Pair<je, jn<det>> $$4 = $$0.e().a($$1, $$2, 6400, 32, 64);
      $$3.stop();
      if ($$4 == null) {
         throw d.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$4, "commands.locate.biome.success", true, $$3.elapsed());
      }
   }

   private static int b(et $$0, fw.c<cfl> $$1) throws CommandSyntaxException {
      je $$2 = je.a((jx)$$0.d());
      arg $$3 = $$0.e();
      Stopwatch $$4 = Stopwatch.createStarted(ad.d);
      Optional<Pair<jn<cfl>, je>> $$5 = $$3.y().e($$1, $$2, 256, cfi.b.c);
      $$4.stop();
      if ($$5.isEmpty()) {
         throw e.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$5.get().swap(), "commands.locate.poi.success", false, $$4.elapsed());
      }
   }

   public static int a(et $$0, fw.c<?> $$1, je $$2, Pair<je, ? extends jn<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$1x -> $$1.b(), $$2x -> $$1.b() + " (" + ((jn)$$3.getSecond()).g() + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   public static int a(et $$0, fx.c<?> $$1, je $$2, Pair<je, ? extends jn<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$0x -> $$0x.a().toString(), $$1x -> "#" + $$1x.b() + " (" + ((jn)$$3.getSecond()).g() + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   private static int a(et $$0, je $$1, Pair<je, ? extends jn<?>> $$2, String $$3, boolean $$4, String $$5, Duration $$6) {
      je $$7 = (je)$$2.getFirst();
      int $$8 = $$4 ? azc.d(azc.c((float)$$1.j($$7))) : azc.d(a($$1.u(), $$1.w(), $$7.u(), $$7.w()));
      String $$9 = $$4 ? String.valueOf($$7.v()) : "~";
      xd $$10 = xg.a((xd)xd.a("chat.coordinates", $$7.u(), $$9, $$7.w()))
         .a($$2x -> $$2x.a(n.k).a(new xb(xb.a.d, "/tp @s " + $$7.u() + " " + $$9 + " " + $$7.w())).a(new xj(xj.a.a, xd.c("chat.coordinates.tooltip"))));
      $$0.a(() -> xd.a($$3, $$5, $$10, $$8), false);
      a.info("Locating element " + $$5 + " took " + $$6.toMillis() + " ms");
      return $$8;
   }

   private static float a(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$2 - $$0;
      int $$5 = $$3 - $$1;
      return azc.c((float)($$4 * $$4 + $$5 * $$5));
   }
}

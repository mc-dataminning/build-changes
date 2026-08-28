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

public class anh {
   private static final Logger a = LogUtils.getLogger();
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wy.b("commands.locate.structure.not_found", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wy.b("commands.locate.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wy.b("commands.locate.biome.not_found", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> wy.b("commands.locate.poi.not_found", $$0));
   private static final int f = 100;
   private static final int g = 6400;
   private static final int h = 32;
   private static final int i = 64;
   private static final int j = 256;

   public static void a(CommandDispatcher<et> $$0, ep $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("locate").requires($$0x -> $$0x.c(2)))
                  .then(eu.a("structure").then(eu.a("structure", fx.a(lu.aR)).executes($$0x -> a((et)$$0x.getSource(), fx.a($$0x, "structure", lu.aR, c))))))
               .then(eu.a("biome").then(eu.a("biome", fw.a($$1, lu.aF)).executes($$0x -> a((et)$$0x.getSource(), fw.a($$0x, "biome", lu.aF))))))
            .then(eu.a("poi").then(eu.a("poi", fw.a($$1, lu.aa)).executes($$0x -> b((et)$$0x.getSource(), fw.a($$0x, "poi", lu.aa)))))
      );
   }

   private static Optional<? extends jq.b<ejm>> a(fx.c<ejm> $$0, jz<ejm> $$1) {
      return (Optional<? extends jq.b<ejm>>)$$0.a().map($$1x -> $$1.b($$1x).map($$0xx -> jq.a($$0xx)), $$1::b);
   }

   private static int a(et $$0, fx.c<ejm> $$1) throws CommandSyntaxException {
      jz<ejm> $$2 = $$0.e().H_().d(lu.aR);
      jq<ejm> $$3 = (jq<ejm>)a($$1, $$2).orElseThrow(() -> c.create($$1.b()));
      jd $$4 = jd.a((jw)$$0.d());
      aqt $$5 = $$0.e();
      Stopwatch $$6 = Stopwatch.createStarted(ad.d);
      Pair<jd, jm<ejm>> $$7 = $$5.l().g().a($$5, $$3, $$4, 100, false);
      $$6.stop();
      if ($$7 == null) {
         throw b.create($$1.b());
      } else {
         return a($$0, $$1, $$4, $$7, "commands.locate.structure.success", false, $$6.elapsed());
      }
   }

   private static int a(et $$0, fw.c<ddu> $$1) throws CommandSyntaxException {
      jd $$2 = jd.a((jw)$$0.d());
      Stopwatch $$3 = Stopwatch.createStarted(ad.d);
      Pair<jd, jm<ddu>> $$4 = $$0.e().a($$1, $$2, 6400, 32, 64);
      $$3.stop();
      if ($$4 == null) {
         throw d.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$4, "commands.locate.biome.success", true, $$3.elapsed());
      }
   }

   private static int b(et $$0, fw.c<cet> $$1) throws CommandSyntaxException {
      jd $$2 = jd.a((jw)$$0.d());
      aqt $$3 = $$0.e();
      Stopwatch $$4 = Stopwatch.createStarted(ad.d);
      Optional<Pair<jm<cet>, jd>> $$5 = $$3.y().e($$1, $$2, 256, ceq.b.c);
      $$4.stop();
      if ($$5.isEmpty()) {
         throw e.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$5.get().swap(), "commands.locate.poi.success", false, $$4.elapsed());
      }
   }

   public static int a(et $$0, fw.c<?> $$1, jd $$2, Pair<jd, ? extends jm<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$1x -> $$1.b(), $$2x -> $$1.b() + " (" + ((jm)$$3.getSecond()).g() + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   public static int a(et $$0, fx.c<?> $$1, jd $$2, Pair<jd, ? extends jm<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$0x -> $$0x.a().toString(), $$1x -> "#" + $$1x.b() + " (" + ((jm)$$3.getSecond()).g() + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   private static int a(et $$0, jd $$1, Pair<jd, ? extends jm<?>> $$2, String $$3, boolean $$4, String $$5, Duration $$6) {
      jd $$7 = (jd)$$2.getFirst();
      int $$8 = $$4 ? ayn.d(ayn.c((float)$$1.j($$7))) : ayn.d(a($$1.u(), $$1.w(), $$7.u(), $$7.w()));
      String $$9 = $$4 ? String.valueOf($$7.v()) : "~";
      wy $$10 = xb.a((wy)wy.a("chat.coordinates", $$7.u(), $$9, $$7.w()))
         .a($$2x -> $$2x.a(n.k).a(new ww(ww.a.d, "/tp @s " + $$7.u() + " " + $$9 + " " + $$7.w())).a(new xe(xe.a.a, wy.c("chat.coordinates.tooltip"))));
      $$0.a(() -> wy.a($$3, $$5, $$10, $$8), false);
      a.info("Locating element " + $$5 + " took " + $$6.toMillis() + " ms");
      return $$8;
   }

   private static float a(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$2 - $$0;
      int $$5 = $$3 - $$1;
      return ayn.c((float)($$4 * $$4 + $$5 * $$5));
   }
}

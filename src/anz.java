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

public class anz {
   private static final Logger a = LogUtils.getLogger();
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xh.b("commands.locate.structure.not_found", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xh.b("commands.locate.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xh.b("commands.locate.biome.not_found", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xh.b("commands.locate.poi.not_found", $$0));
   private static final int f = 100;
   private static final int g = 6400;
   private static final int h = 32;
   private static final int i = 64;
   private static final int j = 256;

   public static void a(CommandDispatcher<ev> $$0, er $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("locate").requires($$0x -> $$0x.c(2)))
                  .then(ew.a("structure").then(ew.a("structure", fz.a(ly.aS)).executes($$0x -> a((ev)$$0x.getSource(), fz.a($$0x, "structure", ly.aS, c))))))
               .then(ew.a("biome").then(ew.a("biome", fy.a($$1, ly.aG)).executes($$0x -> a((ev)$$0x.getSource(), fy.a($$0x, "biome", ly.aG))))))
            .then(ew.a("poi").then(ew.a("poi", fy.a($$1, ly.aa)).executes($$0x -> b((ev)$$0x.getSource(), fy.a($$0x, "poi", ly.aa)))))
      );
   }

   private static Optional<? extends jt.b<elr>> a(fz.c<elr> $$0, kc<elr> $$1) {
      return (Optional<? extends jt.b<elr>>)$$0.a().map($$1x -> $$1.a($$1x).map($$0xx -> jt.a($$0xx)), $$1::a);
   }

   private static int a(ev $$0, fz.c<elr> $$1) throws CommandSyntaxException {
      kc<elr> $$2 = $$0.e().H_().e(ly.aS);
      jt<elr> $$3 = (jt<elr>)a($$1, $$2).orElseThrow(() -> c.create($$1.b()));
      jg $$4 = jg.a((jz)$$0.d());
      arm $$5 = $$0.e();
      Stopwatch $$6 = Stopwatch.createStarted(ad.d);
      Pair<jg, jp<elr>> $$7 = $$5.l().g().a($$5, $$3, $$4, 100, false);
      $$6.stop();
      if ($$7 == null) {
         throw b.create($$1.b());
      } else {
         return a($$0, $$1, $$4, $$7, "commands.locate.structure.success", false, $$6.elapsed());
      }
   }

   private static int a(ev $$0, fy.c<dfw> $$1) throws CommandSyntaxException {
      jg $$2 = jg.a((jz)$$0.d());
      Stopwatch $$3 = Stopwatch.createStarted(ad.d);
      Pair<jg, jp<dfw>> $$4 = $$0.e().a($$1, $$2, 6400, 32, 64);
      $$3.stop();
      if ($$4 == null) {
         throw d.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$4, "commands.locate.biome.success", true, $$3.elapsed());
      }
   }

   private static int b(ev $$0, fy.c<cgc> $$1) throws CommandSyntaxException {
      jg $$2 = jg.a((jz)$$0.d());
      arm $$3 = $$0.e();
      Stopwatch $$4 = Stopwatch.createStarted(ad.d);
      Optional<Pair<jp<cgc>, jg>> $$5 = $$3.y().e($$1, $$2, 256, cfz.b.c);
      $$4.stop();
      if ($$5.isEmpty()) {
         throw e.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$5.get().swap(), "commands.locate.poi.success", false, $$4.elapsed());
      }
   }

   public static int a(ev $$0, fy.c<?> $$1, jg $$2, Pair<jg, ? extends jp<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$1x -> $$1.b(), $$2x -> $$1.b() + " (" + ((jp)$$3.getSecond()).g() + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   public static int a(ev $$0, fz.c<?> $$1, jg $$2, Pair<jg, ? extends jp<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$0x -> $$0x.a().toString(), $$1x -> "#" + $$1x.b() + " (" + ((jp)$$3.getSecond()).g() + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   private static int a(ev $$0, jg $$1, Pair<jg, ? extends jp<?>> $$2, String $$3, boolean $$4, String $$5, Duration $$6) {
      jg $$7 = (jg)$$2.getFirst();
      int $$8 = $$4 ? azj.d(azj.c((float)$$1.j($$7))) : azj.d(a($$1.u(), $$1.w(), $$7.u(), $$7.w()));
      String $$9 = $$4 ? String.valueOf($$7.v()) : "~";
      xh $$10 = xk.a((xh)xh.a("chat.coordinates", $$7.u(), $$9, $$7.w()))
         .a($$2x -> $$2x.a(n.k).a(new xf(xf.a.d, "/tp @s " + $$7.u() + " " + $$9 + " " + $$7.w())).a(new xn(xn.a.a, xh.c("chat.coordinates.tooltip"))));
      $$0.a(() -> xh.a($$3, $$5, $$10, $$8), false);
      a.info("Locating element " + $$5 + " took " + $$6.toMillis() + " ms");
      return $$8;
   }

   private static float a(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$2 - $$0;
      int $$5 = $$3 - $$1;
      return azj.c((float)($$4 * $$4 + $$5 * $$5));
   }
}

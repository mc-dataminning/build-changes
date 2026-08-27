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

public class ami {
   private static final Logger a = LogUtils.getLogger();
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wg.b("commands.locate.structure.not_found", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wg.b("commands.locate.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wg.b("commands.locate.biome.not_found", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> wg.b("commands.locate.poi.not_found", $$0));
   private static final int f = 100;
   private static final int g = 6400;
   private static final int h = 32;
   private static final int i = 64;
   private static final int j = 256;

   public static void a(CommandDispatcher<du> $$0, dq $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("locate").requires($$0x -> $$0x.c(2)))
                  .then(dv.a("structure").then(dv.a("structure", ex.a(ks.aF)).executes($$0x -> a((du)$$0x.getSource(), ex.a($$0x, "structure", ks.aF, c))))))
               .then(dv.a("biome").then(dv.a("biome", ew.a($$1, ks.av)).executes($$0x -> a((du)$$0x.getSource(), ew.a($$0x, "biome", ks.av))))))
            .then(dv.a("poi").then(dv.a("poi", ew.a($$1, ks.U)).executes($$0x -> b((du)$$0x.getSource(), ew.a($$0x, "poi", ks.U)))))
      );
   }

   private static Optional<? extends ip.b<efh>> a(ex.c<efh> $$0, iy<efh> $$1) {
      return (Optional<? extends ip.b<efh>>)$$0.a().map($$1x -> $$1.b($$1x).map($$0xx -> ip.a($$0xx)), $$1::b);
   }

   private static int a(du $$0, ex.c<efh> $$1) throws CommandSyntaxException {
      iy<efh> $$2 = $$0.e().H_().d(ks.aF);
      ip<efh> $$3 = (ip<efh>)a($$1, $$2).orElseThrow(() -> c.create($$1.b()));
      ib $$4 = ib.a($$0.d());
      aps $$5 = $$0.e();
      Stopwatch $$6 = Stopwatch.createStarted(ac.d);
      Pair<ib, il<efh>> $$7 = $$5.l().g().a($$5, $$3, $$4, 100, false);
      $$6.stop();
      if ($$7 == null) {
         throw b.create($$1.b());
      } else {
         return a($$0, $$1, $$4, $$7, "commands.locate.structure.success", false, $$6.elapsed());
      }
   }

   private static int a(du $$0, ew.c<czw> $$1) throws CommandSyntaxException {
      ib $$2 = ib.a($$0.d());
      Stopwatch $$3 = Stopwatch.createStarted(ac.d);
      Pair<ib, il<czw>> $$4 = $$0.e().a($$1, $$2, 6400, 32, 64);
      $$3.stop();
      if ($$4 == null) {
         throw d.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$4, "commands.locate.biome.success", true, $$3.elapsed());
      }
   }

   private static int b(du $$0, ew.c<cbu> $$1) throws CommandSyntaxException {
      ib $$2 = ib.a($$0.d());
      aps $$3 = $$0.e();
      Stopwatch $$4 = Stopwatch.createStarted(ac.d);
      Optional<Pair<il<cbu>, ib>> $$5 = $$3.y().e($$1, $$2, 256, cbr.b.c);
      $$4.stop();
      if ($$5.isEmpty()) {
         throw e.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$5.get().swap(), "commands.locate.poi.success", false, $$4.elapsed());
      }
   }

   public static int a(du $$0, ew.c<?> $$1, ib $$2, Pair<ib, ? extends il<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$1x -> $$1.b(), $$2x -> $$1.b() + " (" + ((il)$$3.getSecond()).g() + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   public static int a(du $$0, ex.c<?> $$1, ib $$2, Pair<ib, ? extends il<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$0x -> $$0x.a().toString(), $$1x -> "#" + $$1x.b() + " (" + ((il)$$3.getSecond()).g() + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   private static int a(du $$0, ib $$1, Pair<ib, ? extends il<?>> $$2, String $$3, boolean $$4, String $$5, Duration $$6) {
      ib $$7 = (ib)$$2.getFirst();
      int $$8 = $$4 ? axk.d(axk.c((float)$$1.j($$7))) : axk.d(a($$1.u(), $$1.w(), $$7.u(), $$7.w()));
      String $$9 = $$4 ? String.valueOf($$7.v()) : "~";
      wg $$10 = wj.a((wg)wg.a("chat.coordinates", $$7.u(), $$9, $$7.w()))
         .a($$2x -> $$2x.a(n.k).a(new we(we.a.d, "/tp @s " + $$7.u() + " " + $$9 + " " + $$7.w())).a(new wm(wm.a.a, wg.c("chat.coordinates.tooltip"))));
      $$0.a(() -> wg.a($$3, $$5, $$10, $$8), false);
      a.info("Locating element " + $$5 + " took " + $$6.toMillis() + " ms");
      return $$8;
   }

   private static float a(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$2 - $$0;
      int $$5 = $$3 - $$1;
      return axk.c((float)($$4 * $$4 + $$5 * $$5));
   }
}

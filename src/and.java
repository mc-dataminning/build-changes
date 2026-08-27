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

public class and {
   private static final Logger a = LogUtils.getLogger();
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wx.b("commands.locate.structure.not_found", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wx.b("commands.locate.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wx.b("commands.locate.biome.not_found", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> wx.b("commands.locate.poi.not_found", $$0));
   private static final int f = 100;
   private static final int g = 6400;
   private static final int h = 32;
   private static final int i = 64;
   private static final int j = 256;

   public static void a(CommandDispatcher<ee> $$0, ea $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("locate").requires($$0x -> $$0x.c(2)))
                  .then(ef.a("structure").then(ef.a("structure", fi.a(lf.aJ)).executes($$0x -> a((ee)$$0x.getSource(), fi.a($$0x, "structure", lf.aJ, c))))))
               .then(ef.a("biome").then(ef.a("biome", fh.a($$1, lf.az)).executes($$0x -> a((ee)$$0x.getSource(), fh.a($$0x, "biome", lf.az))))))
            .then(ef.a("poi").then(ef.a("poi", fh.a($$1, lf.V)).executes($$0x -> b((ee)$$0x.getSource(), fh.a($$0x, "poi", lf.V)))))
      );
   }

   private static Optional<? extends jb.b<ehl>> a(fi.c<ehl> $$0, jk<ehl> $$1) {
      return (Optional<? extends jb.b<ehl>>)$$0.a().map($$1x -> $$1.b($$1x).map($$0xx -> jb.a($$0xx)), $$1::b);
   }

   private static int a(ee $$0, fi.c<ehl> $$1) throws CommandSyntaxException {
      jk<ehl> $$2 = $$0.e().H_().d(lf.aJ);
      jb<ehl> $$3 = (jb<ehl>)a($$1, $$2).orElseThrow(() -> c.create($$1.b()));
      io $$4 = io.a($$0.d());
      aqn $$5 = $$0.e();
      Stopwatch $$6 = Stopwatch.createStarted(ac.d);
      Pair<io, ix<ehl>> $$7 = $$5.l().g().a($$5, $$3, $$4, 100, false);
      $$6.stop();
      if ($$7 == null) {
         throw b.create($$1.b());
      } else {
         return a($$0, $$1, $$4, $$7, "commands.locate.structure.success", false, $$6.elapsed());
      }
   }

   private static int a(ee $$0, fh.c<dby> $$1) throws CommandSyntaxException {
      io $$2 = io.a($$0.d());
      Stopwatch $$3 = Stopwatch.createStarted(ac.d);
      Pair<io, ix<dby>> $$4 = $$0.e().a($$1, $$2, 6400, 32, 64);
      $$3.stop();
      if ($$4 == null) {
         throw d.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$4, "commands.locate.biome.success", true, $$3.elapsed());
      }
   }

   private static int b(ee $$0, fh.c<cdx> $$1) throws CommandSyntaxException {
      io $$2 = io.a($$0.d());
      aqn $$3 = $$0.e();
      Stopwatch $$4 = Stopwatch.createStarted(ac.d);
      Optional<Pair<ix<cdx>, io>> $$5 = $$3.y().e($$1, $$2, 256, cdu.b.c);
      $$4.stop();
      if ($$5.isEmpty()) {
         throw e.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$5.get().swap(), "commands.locate.poi.success", false, $$4.elapsed());
      }
   }

   public static int a(ee $$0, fh.c<?> $$1, io $$2, Pair<io, ? extends ix<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$1x -> $$1.b(), $$2x -> $$1.b() + " (" + ((ix)$$3.getSecond()).g() + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   public static int a(ee $$0, fi.c<?> $$1, io $$2, Pair<io, ? extends ix<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$0x -> $$0x.a().toString(), $$1x -> "#" + $$1x.b() + " (" + ((ix)$$3.getSecond()).g() + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   private static int a(ee $$0, io $$1, Pair<io, ? extends ix<?>> $$2, String $$3, boolean $$4, String $$5, Duration $$6) {
      io $$7 = (io)$$2.getFirst();
      int $$8 = $$4 ? ayf.d(ayf.c((float)$$1.j($$7))) : ayf.d(a($$1.u(), $$1.w(), $$7.u(), $$7.w()));
      String $$9 = $$4 ? String.valueOf($$7.v()) : "~";
      wx $$10 = xa.a((wx)wx.a("chat.coordinates", $$7.u(), $$9, $$7.w()))
         .a($$2x -> $$2x.a(n.k).a(new wv(wv.a.d, "/tp @s " + $$7.u() + " " + $$9 + " " + $$7.w())).a(new xd(xd.a.a, wx.c("chat.coordinates.tooltip"))));
      $$0.a(() -> wx.a($$3, $$5, $$10, $$8), false);
      a.info("Locating element " + $$5 + " took " + $$6.toMillis() + " ms");
      return $$8;
   }

   private static float a(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$2 - $$0;
      int $$5 = $$3 - $$1;
      return ayf.c((float)($$4 * $$4 + $$5 * $$5));
   }
}

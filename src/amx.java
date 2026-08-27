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

public class amx {
   private static final Logger a = LogUtils.getLogger();
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wu.b("commands.locate.structure.not_found", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wu.b("commands.locate.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wu.b("commands.locate.biome.not_found", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> wu.b("commands.locate.poi.not_found", $$0));
   private static final int f = 100;
   private static final int g = 6400;
   private static final int h = 32;
   private static final int i = 64;
   private static final int j = 256;

   public static void a(CommandDispatcher<ed> $$0, dz $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("locate").requires($$0x -> $$0x.c(2)))
                  .then(ee.a("structure").then(ee.a("structure", fh.a(le.aJ)).executes($$0x -> a((ed)$$0x.getSource(), fh.a($$0x, "structure", le.aJ, c))))))
               .then(ee.a("biome").then(ee.a("biome", fg.a($$1, le.az)).executes($$0x -> a((ed)$$0x.getSource(), fg.a($$0x, "biome", le.az))))))
            .then(ee.a("poi").then(ee.a("poi", fg.a($$1, le.V)).executes($$0x -> b((ed)$$0x.getSource(), fg.a($$0x, "poi", le.V)))))
      );
   }

   private static Optional<? extends ja.b<egp>> a(fh.c<egp> $$0, jj<egp> $$1) {
      return (Optional<? extends ja.b<egp>>)$$0.a().map($$1x -> $$1.b($$1x).map($$0xx -> ja.a($$0xx)), $$1::b);
   }

   private static int a(ed $$0, fh.c<egp> $$1) throws CommandSyntaxException {
      jj<egp> $$2 = $$0.e().H_().d(le.aJ);
      ja<egp> $$3 = (ja<egp>)a($$1, $$2).orElseThrow(() -> c.create($$1.b()));
      in $$4 = in.a($$0.d());
      aqh $$5 = $$0.e();
      Stopwatch $$6 = Stopwatch.createStarted(ac.d);
      Pair<in, iw<egp>> $$7 = $$5.l().g().a($$5, $$3, $$4, 100, false);
      $$6.stop();
      if ($$7 == null) {
         throw b.create($$1.b());
      } else {
         return a($$0, $$1, $$4, $$7, "commands.locate.structure.success", false, $$6.elapsed());
      }
   }

   private static int a(ed $$0, fg.c<dbc> $$1) throws CommandSyntaxException {
      in $$2 = in.a($$0.d());
      Stopwatch $$3 = Stopwatch.createStarted(ac.d);
      Pair<in, iw<dbc>> $$4 = $$0.e().a($$1, $$2, 6400, 32, 64);
      $$3.stop();
      if ($$4 == null) {
         throw d.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$4, "commands.locate.biome.success", true, $$3.elapsed());
      }
   }

   private static int b(ed $$0, fg.c<cdg> $$1) throws CommandSyntaxException {
      in $$2 = in.a($$0.d());
      aqh $$3 = $$0.e();
      Stopwatch $$4 = Stopwatch.createStarted(ac.d);
      Optional<Pair<iw<cdg>, in>> $$5 = $$3.y().e($$1, $$2, 256, cdd.b.c);
      $$4.stop();
      if ($$5.isEmpty()) {
         throw e.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$5.get().swap(), "commands.locate.poi.success", false, $$4.elapsed());
      }
   }

   public static int a(ed $$0, fg.c<?> $$1, in $$2, Pair<in, ? extends iw<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$1x -> $$1.b(), $$2x -> $$1.b() + " (" + ((iw)$$3.getSecond()).g() + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   public static int a(ed $$0, fh.c<?> $$1, in $$2, Pair<in, ? extends iw<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$0x -> $$0x.a().toString(), $$1x -> "#" + $$1x.b() + " (" + ((iw)$$3.getSecond()).g() + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   private static int a(ed $$0, in $$1, Pair<in, ? extends iw<?>> $$2, String $$3, boolean $$4, String $$5, Duration $$6) {
      in $$7 = (in)$$2.getFirst();
      int $$8 = $$4 ? axz.d(axz.c((float)$$1.j($$7))) : axz.d(a($$1.u(), $$1.w(), $$7.u(), $$7.w()));
      String $$9 = $$4 ? String.valueOf($$7.v()) : "~";
      wu $$10 = wx.a((wu)wu.a("chat.coordinates", $$7.u(), $$9, $$7.w()))
         .a($$2x -> $$2x.a(n.k).a(new ws(ws.a.d, "/tp @s " + $$7.u() + " " + $$9 + " " + $$7.w())).a(new xa(xa.a.a, wu.c("chat.coordinates.tooltip"))));
      $$0.a(() -> wu.a($$3, $$5, $$10, $$8), false);
      a.info("Locating element " + $$5 + " took " + $$6.toMillis() + " ms");
      return $$8;
   }

   private static float a(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$2 - $$0;
      int $$5 = $$3 - $$1;
      return axz.c((float)($$4 * $$4 + $$5 * $$5));
   }
}

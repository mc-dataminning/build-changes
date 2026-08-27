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

public class ahd {
   private static final Logger a = LogUtils.getLogger();
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> te.a("commands.locate.structure.not_found", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> te.a("commands.locate.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> te.a("commands.locate.biome.not_found", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> te.a("commands.locate.poi.not_found", $$0));
   private static final int f = 100;
   private static final int g = 6400;
   private static final int h = 32;
   private static final int i = 64;
   private static final int j = 256;

   public static void a(CommandDispatcher<ds> $$0, dm $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("locate").requires($$0x -> $$0x.c(2)))
                  .then(dt.a("structure").then(dt.a("structure", et.a(jd.az)).executes($$0x -> a((ds)$$0x.getSource(), et.a($$0x, "structure", jd.az, c))))))
               .then(dt.a("biome").then(dt.a("biome", es.a($$1, jd.ap)).executes($$0x -> a((ds)$$0x.getSource(), es.a($$0x, "biome", jd.ap))))))
            .then(dt.a("poi").then(dt.a("poi", es.a($$1, jd.S)).executes($$0x -> b((ds)$$0x.getSource(), es.a($$0x, "poi", jd.S)))))
      );
   }

   private static Optional<? extends hj.b<dux>> a(et.c<dux> $$0, hs<dux> $$1) {
      return (Optional<? extends hj.b<dux>>)$$0.a().map($$1x -> $$1.b($$1x).map($$0xx -> hj.a($$0xx)), $$1::b);
   }

   private static int a(ds $$0, et.c<dux> $$1) throws CommandSyntaxException {
      hs<dux> $$2 = $$0.e().B_().d(jd.az);
      hj<dux> $$3 = (hj<dux>)a($$1, $$2).orElseThrow(() -> c.create($$1.b()));
      gv $$4 = gv.a($$0.d());
      aki $$5 = $$0.e();
      Stopwatch $$6 = Stopwatch.createStarted(ac.b);
      Pair<gv, hf<dux>> $$7 = $$5.k().g().a($$5, $$3, $$4, 100, false);
      $$6.stop();
      if ($$7 == null) {
         throw b.create($$1.b());
      } else {
         return a($$0, $$1, $$4, $$7, "commands.locate.structure.success", false, $$6.elapsed());
      }
   }

   private static int a(ds $$0, es.c<cqi> $$1) throws CommandSyntaxException {
      gv $$2 = gv.a($$0.d());
      Stopwatch $$3 = Stopwatch.createStarted(ac.b);
      Pair<gv, hf<cqi>> $$4 = $$0.e().a($$1, $$2, 6400, 32, 64);
      $$3.stop();
      if ($$4 == null) {
         throw d.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$4, "commands.locate.biome.success", true, $$3.elapsed());
      }
   }

   private static int b(ds $$0, es.c<btz> $$1) throws CommandSyntaxException {
      gv $$2 = gv.a($$0.d());
      aki $$3 = $$0.e();
      Stopwatch $$4 = Stopwatch.createStarted(ac.b);
      Optional<Pair<hf<btz>, gv>> $$5 = $$3.w().e($$1, $$2, 256, btw.b.c);
      $$4.stop();
      if ($$5.isEmpty()) {
         throw e.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$5.get().swap(), "commands.locate.poi.success", false, $$4.elapsed());
      }
   }

   private static String a(Pair<gv, ? extends hf<?>> $$0) {
      return ((hf)$$0.getSecond()).e().map($$0x -> $$0x.a().toString()).orElse("[unregistered]");
   }

   public static int a(ds $$0, es.c<?> $$1, gv $$2, Pair<gv, ? extends hf<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$1x -> $$1.b(), $$2x -> $$1.b() + " (" + a($$3) + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   public static int a(ds $$0, et.c<?> $$1, gv $$2, Pair<gv, ? extends hf<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$0x -> $$0x.a().toString(), $$1x -> "#" + $$1x.b() + " (" + a($$3) + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   private static int a(ds $$0, gv $$1, Pair<gv, ? extends hf<?>> $$2, String $$3, boolean $$4, String $$5, Duration $$6) {
      gv $$7 = (gv)$$2.getFirst();
      int $$8 = $$4 ? aro.d(aro.c((float)$$1.j($$7))) : aro.d(a($$1.u(), $$1.w(), $$7.u(), $$7.w()));
      String $$9 = $$4 ? String.valueOf($$7.v()) : "~";
      te $$10 = tg.a((te)te.a("chat.coordinates", $$7.u(), $$9, $$7.w()))
         .a($$2x -> $$2x.a(n.k).a(new tc(tc.a.d, "/tp @s " + $$7.u() + " " + $$9 + " " + $$7.w())).a(new tj(tj.a.a, te.c("chat.coordinates.tooltip"))));
      $$0.a(() -> te.a($$3, $$5, $$10, $$8), false);
      a.info("Locating element " + $$5 + " took " + $$6.toMillis() + " ms");
      return $$8;
   }

   private static float a(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$2 - $$0;
      int $$5 = $$3 - $$1;
      return aro.c((float)($$4 * $$4 + $$5 * $$5));
   }
}

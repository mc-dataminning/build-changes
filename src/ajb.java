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

public class ajb {
   private static final Logger a = LogUtils.getLogger();
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> uv.b("commands.locate.structure.not_found", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> uv.b("commands.locate.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> uv.b("commands.locate.biome.not_found", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> uv.b("commands.locate.poi.not_found", $$0));
   private static final int f = 100;
   private static final int g = 6400;
   private static final int h = 32;
   private static final int i = 64;
   private static final int j = 256;

   public static void a(CommandDispatcher<du> $$0, dp $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("locate").requires($$0x -> $$0x.c(2)))
                  .then(dv.a("structure").then(dv.a("structure", ew.a(kd.aB)).executes($$0x -> a((du)$$0x.getSource(), ew.a($$0x, "structure", kd.aB, c))))))
               .then(dv.a("biome").then(dv.a("biome", ev.a($$1, kd.ar)).executes($$0x -> a((du)$$0x.getSource(), ev.a($$0x, "biome", kd.ar))))))
            .then(dv.a("poi").then(dv.a("poi", ev.a($$1, kd.T)).executes($$0x -> b((du)$$0x.getSource(), ev.a($$0x, "poi", kd.T)))))
      );
   }

   private static Optional<? extends ik.b<dxm>> a(ew.c<dxm> $$0, is<dxm> $$1) {
      return (Optional<? extends ik.b<dxm>>)$$0.a().map($$1x -> $$1.b($$1x).map($$0xx -> ik.a($$0xx)), $$1::b);
   }

   private static int a(du $$0, ew.c<dxm> $$1) throws CommandSyntaxException {
      is<dxm> $$2 = $$0.e().I_().d(kd.aB);
      ik<dxm> $$3 = (ik<dxm>)a($$1, $$2).orElseThrow(() -> c.create($$1.b()));
      hx $$4 = hx.a($$0.d());
      ami $$5 = $$0.e();
      Stopwatch $$6 = Stopwatch.createStarted(ac.c);
      Pair<hx, ig<dxm>> $$7 = $$5.k().g().a($$5, $$3, $$4, 100, false);
      $$6.stop();
      if ($$7 == null) {
         throw b.create($$1.b());
      } else {
         return a($$0, $$1, $$4, $$7, "commands.locate.structure.success", false, $$6.elapsed());
      }
   }

   private static int a(du $$0, ev.c<ctd> $$1) throws CommandSyntaxException {
      hx $$2 = hx.a($$0.d());
      Stopwatch $$3 = Stopwatch.createStarted(ac.c);
      Pair<hx, ig<ctd>> $$4 = $$0.e().a($$1, $$2, 6400, 32, 64);
      $$3.stop();
      if ($$4 == null) {
         throw d.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$4, "commands.locate.biome.success", true, $$3.elapsed());
      }
   }

   private static int b(du $$0, ev.c<bwn> $$1) throws CommandSyntaxException {
      hx $$2 = hx.a($$0.d());
      ami $$3 = $$0.e();
      Stopwatch $$4 = Stopwatch.createStarted(ac.c);
      Optional<Pair<ig<bwn>, hx>> $$5 = $$3.x().e($$1, $$2, 256, bwk.b.c);
      $$4.stop();
      if ($$5.isEmpty()) {
         throw e.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$5.get().swap(), "commands.locate.poi.success", false, $$4.elapsed());
      }
   }

   private static String a(Pair<hx, ? extends ig<?>> $$0) {
      return ((ig)$$0.getSecond()).e().map($$0x -> $$0x.a().toString()).orElse("[unregistered]");
   }

   public static int a(du $$0, ev.c<?> $$1, hx $$2, Pair<hx, ? extends ig<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$1x -> $$1.b(), $$2x -> $$1.b() + " (" + a($$3) + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   public static int a(du $$0, ew.c<?> $$1, hx $$2, Pair<hx, ? extends ig<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$0x -> $$0x.a().toString(), $$1x -> "#" + $$1x.b() + " (" + a($$3) + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   private static int a(du $$0, hx $$1, Pair<hx, ? extends ig<?>> $$2, String $$3, boolean $$4, String $$5, Duration $$6) {
      hx $$7 = (hx)$$2.getFirst();
      int $$8 = $$4 ? atq.d(atq.c((float)$$1.j($$7))) : atq.d(a($$1.u(), $$1.w(), $$7.u(), $$7.w()));
      String $$9 = $$4 ? String.valueOf($$7.v()) : "~";
      uv $$10 = uy.a((uv)uv.a("chat.coordinates", $$7.u(), $$9, $$7.w()))
         .a($$2x -> $$2x.a(n.k).a(new ut(ut.a.d, "/tp @s " + $$7.u() + " " + $$9 + " " + $$7.w())).a(new vb(vb.a.a, uv.c("chat.coordinates.tooltip"))));
      $$0.a(() -> uv.a($$3, $$5, $$10, $$8), false);
      a.info("Locating element " + $$5 + " took " + $$6.toMillis() + " ms");
      return $$8;
   }

   private static float a(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$2 - $$0;
      int $$5 = $$3 - $$1;
      return atq.c((float)($$4 * $$4 + $$5 * $$5));
   }
}

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

public class ajv {
   private static final Logger a = LogUtils.getLogger();
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> vf.b("commands.locate.structure.not_found", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> vf.b("commands.locate.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> vf.b("commands.locate.biome.not_found", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> vf.b("commands.locate.poi.not_found", $$0));
   private static final int f = 100;
   private static final int g = 6400;
   private static final int h = 32;
   private static final int i = 64;
   private static final int j = 256;

   public static void a(CommandDispatcher<ds> $$0, dn $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("locate").requires($$0x -> $$0x.c(2)))
                  .then(dt.a("structure").then(dt.a("structure", ev.a(ke.aD)).executes($$0x -> a((ds)$$0x.getSource(), ev.a($$0x, "structure", ke.aD, c))))))
               .then(dt.a("biome").then(dt.a("biome", eu.a($$1, ke.at)).executes($$0x -> a((ds)$$0x.getSource(), eu.a($$0x, "biome", ke.at))))))
            .then(dt.a("poi").then(dt.a("poi", eu.a($$1, ke.U)).executes($$0x -> b((ds)$$0x.getSource(), eu.a($$0x, "poi", ke.U)))))
      );
   }

   private static Optional<? extends il.b<dzg>> a(ev.c<dzg> $$0, it<dzg> $$1) {
      return (Optional<? extends il.b<dzg>>)$$0.a().map($$1x -> $$1.b($$1x).map($$0xx -> il.a($$0xx)), $$1::b);
   }

   private static int a(ds $$0, ev.c<dzg> $$1) throws CommandSyntaxException {
      it<dzg> $$2 = $$0.e().I_().d(ke.aD);
      il<dzg> $$3 = (il<dzg>)a($$1, $$2).orElseThrow(() -> c.create($$1.b()));
      hx $$4 = hx.a($$0.d());
      and $$5 = $$0.e();
      Stopwatch $$6 = Stopwatch.createStarted(ac.c);
      Pair<hx, ih<dzg>> $$7 = $$5.l().g().a($$5, $$3, $$4, 100, false);
      $$6.stop();
      if ($$7 == null) {
         throw b.create($$1.b());
      } else {
         return a($$0, $$1, $$4, $$7, "commands.locate.structure.success", false, $$6.elapsed());
      }
   }

   private static int a(ds $$0, eu.c<cuo> $$1) throws CommandSyntaxException {
      hx $$2 = hx.a($$0.d());
      Stopwatch $$3 = Stopwatch.createStarted(ac.c);
      Pair<hx, ih<cuo>> $$4 = $$0.e().a($$1, $$2, 6400, 32, 64);
      $$3.stop();
      if ($$4 == null) {
         throw d.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$4, "commands.locate.biome.success", true, $$3.elapsed());
      }
   }

   private static int b(ds $$0, eu.c<bxp> $$1) throws CommandSyntaxException {
      hx $$2 = hx.a($$0.d());
      and $$3 = $$0.e();
      Stopwatch $$4 = Stopwatch.createStarted(ac.c);
      Optional<Pair<ih<bxp>, hx>> $$5 = $$3.y().e($$1, $$2, 256, bxm.b.c);
      $$4.stop();
      if ($$5.isEmpty()) {
         throw e.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$5.get().swap(), "commands.locate.poi.success", false, $$4.elapsed());
      }
   }

   private static String a(Pair<hx, ? extends ih<?>> $$0) {
      return ((ih)$$0.getSecond()).e().map($$0x -> $$0x.a().toString()).orElse("[unregistered]");
   }

   public static int a(ds $$0, eu.c<?> $$1, hx $$2, Pair<hx, ? extends ih<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$1x -> $$1.b(), $$2x -> $$1.b() + " (" + a($$3) + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   public static int a(ds $$0, ev.c<?> $$1, hx $$2, Pair<hx, ? extends ih<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$0x -> $$0x.a().toString(), $$1x -> "#" + $$1x.b() + " (" + a($$3) + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   private static int a(ds $$0, hx $$1, Pair<hx, ? extends ih<?>> $$2, String $$3, boolean $$4, String $$5, Duration $$6) {
      hx $$7 = (hx)$$2.getFirst();
      int $$8 = $$4 ? auo.d(auo.c((float)$$1.j($$7))) : auo.d(a($$1.u(), $$1.w(), $$7.u(), $$7.w()));
      String $$9 = $$4 ? String.valueOf($$7.v()) : "~";
      vf $$10 = vi.a((vf)vf.a("chat.coordinates", $$7.u(), $$9, $$7.w()))
         .a($$2x -> $$2x.a(n.k).a(new vd(vd.a.d, "/tp @s " + $$7.u() + " " + $$9 + " " + $$7.w())).a(new vl(vl.a.a, vf.c("chat.coordinates.tooltip"))));
      $$0.a(() -> vf.a($$3, $$5, $$10, $$8), false);
      a.info("Locating element " + $$5 + " took " + $$6.toMillis() + " ms");
      return $$8;
   }

   private static float a(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$2 - $$0;
      int $$5 = $$3 - $$1;
      return auo.c((float)($$4 * $$4 + $$5 * $$5));
   }
}

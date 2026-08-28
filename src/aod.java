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

public class aod {
   private static final Logger a = LogUtils.getLogger();
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xc.b("commands.locate.structure.not_found", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xc.b("commands.locate.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xc.b("commands.locate.biome.not_found", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xc.b("commands.locate.poi.not_found", $$0));
   private static final int f = 100;
   private static final int g = 6400;
   private static final int h = 32;
   private static final int i = 64;
   private static final int j = 256;

   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("locate").requires($$0x -> $$0x.c(2)))
                  .then(el.a("structure").then(el.a("structure", fo.a(mi.be)).executes($$0x -> a((ek)$$0x.getSource(), fo.a($$0x, "structure", mi.be, c))))))
               .then(el.a("biome").then(el.a("biome", fn.a($$1, mi.aG)).executes($$0x -> a((ek)$$0x.getSource(), fn.a($$0x, "biome", mi.aG))))))
            .then(el.a("poi").then(el.a("poi", fn.a($$1, mi.aa)).executes($$0x -> b((ek)$$0x.getSource(), fn.a($$0x, "poi", mi.aa)))))
      );
   }

   private static Optional<? extends jk.b<esd>> a(fo.c<esd> $$0, jt<esd> $$1) {
      return (Optional<? extends jk.b<esd>>)$$0.a().map($$1x -> $$1.a($$1x).map($$0xx -> jk.a($$0xx)), $$1::a);
   }

   private static int a(ek $$0, fo.c<esd> $$1) throws CommandSyntaxException {
      jt<esd> $$2 = $$0.e().J_().f(mi.be);
      jk<esd> $$3 = (jk<esd>)a($$1, $$2).orElseThrow(() -> c.create($$1.b()));
      iw $$4 = iw.a((jq)$$0.d());
      aru $$5 = $$0.e();
      Stopwatch $$6 = Stopwatch.createStarted(ag.d);
      Pair<iw, jg<esd>> $$7 = $$5.m().g().a($$5, $$3, $$4, 100, false);
      $$6.stop();
      if ($$7 == null) {
         throw b.create($$1.b());
      } else {
         return a($$0, $$1, $$4, $$7, "commands.locate.structure.success", false, $$6.elapsed());
      }
   }

   private static int a(ek $$0, fn.c<dlc> $$1) throws CommandSyntaxException {
      iw $$2 = iw.a((jq)$$0.d());
      Stopwatch $$3 = Stopwatch.createStarted(ag.d);
      Pair<iw, jg<dlc>> $$4 = $$0.e().a($$1, $$2, 6400, 32, 64);
      $$3.stop();
      if ($$4 == null) {
         throw d.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$4, "commands.locate.biome.success", true, $$3.elapsed());
      }
   }

   private static int b(ek $$0, fn.c<cjb> $$1) throws CommandSyntaxException {
      iw $$2 = iw.a((jq)$$0.d());
      aru $$3 = $$0.e();
      Stopwatch $$4 = Stopwatch.createStarted(ag.d);
      Optional<Pair<jg<cjb>, iw>> $$5 = $$3.A().e($$1, $$2, 256, ciy.b.c);
      $$4.stop();
      if ($$5.isEmpty()) {
         throw e.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$5.get().swap(), "commands.locate.poi.success", false, $$4.elapsed());
      }
   }

   public static int a(ek $$0, fn.c<?> $$1, iw $$2, Pair<iw, ? extends jg<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$1x -> $$1.b(), $$2x -> $$1.b() + " (" + ((jg)$$3.getSecond()).g() + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   public static int a(ek $$0, fo.c<?> $$1, iw $$2, Pair<iw, ? extends jg<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$0x -> $$0x.a().toString(), $$1x -> "#" + $$1x.b() + " (" + ((jg)$$3.getSecond()).g() + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   private static int a(ek $$0, iw $$1, Pair<iw, ? extends jg<?>> $$2, String $$3, boolean $$4, String $$5, Duration $$6) {
      iw $$7 = (iw)$$2.getFirst();
      int $$8 = $$4 ? azq.d(azq.c((float)$$1.j($$7))) : azq.d(a($$1.u(), $$1.w(), $$7.u(), $$7.w()));
      String $$9 = $$4 ? String.valueOf($$7.v()) : "~";
      xc $$10 = xf.a((xc)xc.a("chat.coordinates", $$7.u(), $$9, $$7.w()))
         .a($$2x -> $$2x.a(o.k).a(new xa.g("/tp @s " + $$7.u() + " " + $$9 + " " + $$7.w())).a(new xi.e(xc.c("chat.coordinates.tooltip"))));
      $$0.a(() -> xc.a($$3, $$5, $$10, $$8), false);
      a.info("Locating element " + $$5 + " took " + $$6.toMillis() + " ms");
      return $$8;
   }

   private static float a(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$2 - $$0;
      int $$5 = $$3 - $$1;
      return azq.c((float)($$4 * $$4 + $$5 * $$5));
   }
}

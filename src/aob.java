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

public class aob {
   private static final Logger a = LogUtils.getLogger();
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xa.b("commands.locate.structure.not_found", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xa.b("commands.locate.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xa.b("commands.locate.biome.not_found", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xa.b("commands.locate.poi.not_found", $$0));
   private static final int f = 100;
   private static final int g = 6400;
   private static final int h = 32;
   private static final int i = 64;
   private static final int j = 256;

   public static void a(CommandDispatcher<ej> $$0, ef $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("locate").requires($$0x -> $$0x.c(2)))
                  .then(ek.a("structure").then(ek.a("structure", fn.a(mh.be)).executes($$0x -> a((ej)$$0x.getSource(), fn.a($$0x, "structure", mh.be, c))))))
               .then(ek.a("biome").then(ek.a("biome", fm.a($$1, mh.aG)).executes($$0x -> a((ej)$$0x.getSource(), fm.a($$0x, "biome", mh.aG))))))
            .then(ek.a("poi").then(ek.a("poi", fm.a($$1, mh.aa)).executes($$0x -> b((ej)$$0x.getSource(), fm.a($$0x, "poi", mh.aa)))))
      );
   }

   private static Optional<? extends jj.b<esb>> a(fn.c<esb> $$0, js<esb> $$1) {
      return (Optional<? extends jj.b<esb>>)$$0.a().map($$1x -> $$1.a($$1x).map($$0xx -> jj.a($$0xx)), $$1::a);
   }

   private static int a(ej $$0, fn.c<esb> $$1) throws CommandSyntaxException {
      js<esb> $$2 = $$0.e().J_().f(mh.be);
      jj<esb> $$3 = (jj<esb>)a($$1, $$2).orElseThrow(() -> c.create($$1.b()));
      iv $$4 = iv.a((jp)$$0.d());
      ars $$5 = $$0.e();
      Stopwatch $$6 = Stopwatch.createStarted(ag.d);
      Pair<iv, jf<esb>> $$7 = $$5.m().g().a($$5, $$3, $$4, 100, false);
      $$6.stop();
      if ($$7 == null) {
         throw b.create($$1.b());
      } else {
         return a($$0, $$1, $$4, $$7, "commands.locate.structure.success", false, $$6.elapsed());
      }
   }

   private static int a(ej $$0, fm.c<dla> $$1) throws CommandSyntaxException {
      iv $$2 = iv.a((jp)$$0.d());
      Stopwatch $$3 = Stopwatch.createStarted(ag.d);
      Pair<iv, jf<dla>> $$4 = $$0.e().a($$1, $$2, 6400, 32, 64);
      $$3.stop();
      if ($$4 == null) {
         throw d.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$4, "commands.locate.biome.success", true, $$3.elapsed());
      }
   }

   private static int b(ej $$0, fm.c<ciz> $$1) throws CommandSyntaxException {
      iv $$2 = iv.a((jp)$$0.d());
      ars $$3 = $$0.e();
      Stopwatch $$4 = Stopwatch.createStarted(ag.d);
      Optional<Pair<jf<ciz>, iv>> $$5 = $$3.A().e($$1, $$2, 256, ciw.b.c);
      $$4.stop();
      if ($$5.isEmpty()) {
         throw e.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$5.get().swap(), "commands.locate.poi.success", false, $$4.elapsed());
      }
   }

   public static int a(ej $$0, fm.c<?> $$1, iv $$2, Pair<iv, ? extends jf<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$1x -> $$1.b(), $$2x -> $$1.b() + " (" + ((jf)$$3.getSecond()).g() + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   public static int a(ej $$0, fn.c<?> $$1, iv $$2, Pair<iv, ? extends jf<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$0x -> $$0x.a().toString(), $$1x -> "#" + $$1x.b() + " (" + ((jf)$$3.getSecond()).g() + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   private static int a(ej $$0, iv $$1, Pair<iv, ? extends jf<?>> $$2, String $$3, boolean $$4, String $$5, Duration $$6) {
      iv $$7 = (iv)$$2.getFirst();
      int $$8 = $$4 ? azo.d(azo.c((float)$$1.j($$7))) : azo.d(a($$1.u(), $$1.w(), $$7.u(), $$7.w()));
      String $$9 = $$4 ? String.valueOf($$7.v()) : "~";
      xa $$10 = xd.a((xa)xa.a("chat.coordinates", $$7.u(), $$9, $$7.w()))
         .a($$2x -> $$2x.a(o.k).a(new wy.g("/tp @s " + $$7.u() + " " + $$9 + " " + $$7.w())).a(new xg.e(xa.c("chat.coordinates.tooltip"))));
      $$0.a(() -> xa.a($$3, $$5, $$10, $$8), false);
      a.info("Locating element " + $$5 + " took " + $$6.toMillis() + " ms");
      return $$8;
   }

   private static float a(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$2 - $$0;
      int $$5 = $$3 - $$1;
      return azo.c((float)($$4 * $$4 + $$5 * $$5));
   }
}

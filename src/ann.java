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

public class ann {
   private static final Logger a = LogUtils.getLogger();
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wp.b("commands.locate.structure.not_found", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wp.b("commands.locate.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wp.b("commands.locate.biome.not_found", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> wp.b("commands.locate.poi.not_found", $$0));
   private static final int f = 100;
   private static final int g = 6400;
   private static final int h = 32;
   private static final int i = 64;
   private static final int j = 256;

   public static void a(CommandDispatcher<ex> $$0, et $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("locate").requires($$0x -> $$0x.c(2)))
                  .then(ey.a("structure").then(ey.a("structure", gb.a(mc.aU)).executes($$0x -> a((ex)$$0x.getSource(), gb.a($$0x, "structure", mc.aU, c))))))
               .then(ey.a("biome").then(ey.a("biome", ga.a($$1, mc.aI)).executes($$0x -> a((ex)$$0x.getSource(), ga.a($$0x, "biome", mc.aI))))))
            .then(ey.a("poi").then(ey.a("poi", ga.a($$1, mc.aa)).executes($$0x -> b((ex)$$0x.getSource(), ga.a($$0x, "poi", mc.aa)))))
      );
   }

   private static Optional<? extends jv.b<enl>> a(gb.c<enl> $$0, ke<enl> $$1) {
      return (Optional<? extends jv.b<enl>>)$$0.a().map($$1x -> $$1.a($$1x).map($$0xx -> jv.a($$0xx)), $$1::a);
   }

   private static int a(ex $$0, gb.c<enl> $$1) throws CommandSyntaxException {
      ke<enl> $$2 = $$0.e().K_().e(mc.aU);
      jv<enl> $$3 = (jv<enl>)a($$1, $$2).orElseThrow(() -> c.create($$1.b()));
      ji $$4 = ji.a((kb)$$0.d());
      ard $$5 = $$0.e();
      Stopwatch $$6 = Stopwatch.createStarted(af.d);
      Pair<ji, jr<enl>> $$7 = $$5.m().g().a($$5, $$3, $$4, 100, false);
      $$6.stop();
      if ($$7 == null) {
         throw b.create($$1.b());
      } else {
         return a($$0, $$1, $$4, $$7, "commands.locate.structure.success", false, $$6.elapsed());
      }
   }

   private static int a(ex $$0, ga.c<dhj> $$1) throws CommandSyntaxException {
      ji $$2 = ji.a((kb)$$0.d());
      Stopwatch $$3 = Stopwatch.createStarted(af.d);
      Pair<ji, jr<dhj>> $$4 = $$0.e().a($$1, $$2, 6400, 32, 64);
      $$3.stop();
      if ($$4 == null) {
         throw d.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$4, "commands.locate.biome.success", true, $$3.elapsed());
      }
   }

   private static int b(ex $$0, ga.c<cgn> $$1) throws CommandSyntaxException {
      ji $$2 = ji.a((kb)$$0.d());
      ard $$3 = $$0.e();
      Stopwatch $$4 = Stopwatch.createStarted(af.d);
      Optional<Pair<jr<cgn>, ji>> $$5 = $$3.A().e($$1, $$2, 256, cgk.b.c);
      $$4.stop();
      if ($$5.isEmpty()) {
         throw e.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$5.get().swap(), "commands.locate.poi.success", false, $$4.elapsed());
      }
   }

   public static int a(ex $$0, ga.c<?> $$1, ji $$2, Pair<ji, ? extends jr<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$1x -> $$1.b(), $$2x -> $$1.b() + " (" + ((jr)$$3.getSecond()).g() + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   public static int a(ex $$0, gb.c<?> $$1, ji $$2, Pair<ji, ? extends jr<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$0x -> $$0x.a().toString(), $$1x -> "#" + $$1x.b() + " (" + ((jr)$$3.getSecond()).g() + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   private static int a(ex $$0, ji $$1, Pair<ji, ? extends jr<?>> $$2, String $$3, boolean $$4, String $$5, Duration $$6) {
      ji $$7 = (ji)$$2.getFirst();
      int $$8 = $$4 ? ayz.d(ayz.c((float)$$1.j($$7))) : ayz.d(a($$1.u(), $$1.w(), $$7.u(), $$7.w()));
      String $$9 = $$4 ? String.valueOf($$7.v()) : "~";
      wp $$10 = ws.a((wp)wp.a("chat.coordinates", $$7.u(), $$9, $$7.w()))
         .a($$2x -> $$2x.a(n.k).a(new wn(wn.a.d, "/tp @s " + $$7.u() + " " + $$9 + " " + $$7.w())).a(new wv(wv.a.a, wp.c("chat.coordinates.tooltip"))));
      $$0.a(() -> wp.a($$3, $$5, $$10, $$8), false);
      a.info("Locating element " + $$5 + " took " + $$6.toMillis() + " ms");
      return $$8;
   }

   private static float a(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$2 - $$0;
      int $$5 = $$3 - $$1;
      return ayz.c((float)($$4 * $$4 + $$5 * $$5));
   }
}

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

public class aor {
   private static final Logger a = LogUtils.getLogger();
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xv.b("commands.locate.structure.not_found", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xv.b("commands.locate.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xv.b("commands.locate.biome.not_found", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xv.b("commands.locate.poi.not_found", $$0));
   private static final int f = 100;
   private static final int g = 6400;
   private static final int h = 32;
   private static final int i = 64;
   private static final int j = 256;

   public static void a(CommandDispatcher<ew> $$0, es $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("locate").requires($$0x -> $$0x.c(2)))
                  .then(ex.a("structure").then(ex.a("structure", ga.a(mb.aU)).executes($$0x -> a((ew)$$0x.getSource(), ga.a($$0x, "structure", mb.aU, c))))))
               .then(ex.a("biome").then(ex.a("biome", fz.a($$1, mb.aI)).executes($$0x -> a((ew)$$0x.getSource(), fz.a($$0x, "biome", mb.aI))))))
            .then(ex.a("poi").then(ex.a("poi", fz.a($$1, mb.aa)).executes($$0x -> b((ew)$$0x.getSource(), fz.a($$0x, "poi", mb.aa)))))
      );
   }

   private static Optional<? extends ju.b<eoj>> a(ga.c<eoj> $$0, kd<eoj> $$1) {
      return (Optional<? extends ju.b<eoj>>)$$0.a().map($$1x -> $$1.a($$1x).map($$0xx -> ju.a($$0xx)), $$1::a);
   }

   private static int a(ew $$0, ga.c<eoj> $$1) throws CommandSyntaxException {
      kd<eoj> $$2 = $$0.e().K_().e(mb.aU);
      ju<eoj> $$3 = (ju<eoj>)a($$1, $$2).orElseThrow(() -> c.create($$1.b()));
      jh $$4 = jh.a((ka)$$0.d());
      ash $$5 = $$0.e();
      Stopwatch $$6 = Stopwatch.createStarted(ae.d);
      Pair<jh, jq<eoj>> $$7 = $$5.m().g().a($$5, $$3, $$4, 100, false);
      $$6.stop();
      if ($$7 == null) {
         throw b.create($$1.b());
      } else {
         return a($$0, $$1, $$4, $$7, "commands.locate.structure.success", false, $$6.elapsed());
      }
   }

   private static int a(ew $$0, fz.c<dij> $$1) throws CommandSyntaxException {
      jh $$2 = jh.a((ka)$$0.d());
      Stopwatch $$3 = Stopwatch.createStarted(ae.d);
      Pair<jh, jq<dij>> $$4 = $$0.e().a($$1, $$2, 6400, 32, 64);
      $$3.stop();
      if ($$4 == null) {
         throw d.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$4, "commands.locate.biome.success", true, $$3.elapsed());
      }
   }

   private static int b(ew $$0, fz.c<chm> $$1) throws CommandSyntaxException {
      jh $$2 = jh.a((ka)$$0.d());
      ash $$3 = $$0.e();
      Stopwatch $$4 = Stopwatch.createStarted(ae.d);
      Optional<Pair<jq<chm>, jh>> $$5 = $$3.z().e($$1, $$2, 256, chj.b.c);
      $$4.stop();
      if ($$5.isEmpty()) {
         throw e.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$5.get().swap(), "commands.locate.poi.success", false, $$4.elapsed());
      }
   }

   public static int a(ew $$0, fz.c<?> $$1, jh $$2, Pair<jh, ? extends jq<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$1x -> $$1.b(), $$2x -> $$1.b() + " (" + ((jq)$$3.getSecond()).g() + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   public static int a(ew $$0, ga.c<?> $$1, jh $$2, Pair<jh, ? extends jq<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$0x -> $$0x.a().toString(), $$1x -> "#" + $$1x.b() + " (" + ((jq)$$3.getSecond()).g() + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   private static int a(ew $$0, jh $$1, Pair<jh, ? extends jq<?>> $$2, String $$3, boolean $$4, String $$5, Duration $$6) {
      jh $$7 = (jh)$$2.getFirst();
      int $$8 = $$4 ? bae.d(bae.c((float)$$1.j($$7))) : bae.d(a($$1.u(), $$1.w(), $$7.u(), $$7.w()));
      String $$9 = $$4 ? String.valueOf($$7.v()) : "~";
      xv $$10 = xy.a((xv)xv.a("chat.coordinates", $$7.u(), $$9, $$7.w()))
         .a($$2x -> $$2x.a(n.k).a(new xt(xt.a.d, "/tp @s " + $$7.u() + " " + $$9 + " " + $$7.w())).a(new yb(yb.a.a, xv.c("chat.coordinates.tooltip"))));
      $$0.a(() -> xv.a($$3, $$5, $$10, $$8), false);
      a.info("Locating element " + $$5 + " took " + $$6.toMillis() + " ms");
      return $$8;
   }

   private static float a(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$2 - $$0;
      int $$5 = $$3 - $$1;
      return bae.c((float)($$4 * $$4 + $$5 * $$5));
   }
}

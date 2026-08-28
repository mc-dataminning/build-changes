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

public class anv {
   private static final Logger a = LogUtils.getLogger();
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xp.b("commands.locate.structure.not_found", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xp.b("commands.locate.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xp.b("commands.locate.biome.not_found", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xp.b("commands.locate.poi.not_found", $$0));
   private static final int f = 100;
   private static final int g = 6400;
   private static final int h = 32;
   private static final int i = 64;
   private static final int j = 256;

   public static void a(CommandDispatcher<ep> $$0, el $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("locate").requires($$0x -> $$0x.c(2)))
                  .then(eq.a("structure").then(eq.a("structure", ft.a(lq.aJ)).executes($$0x -> a((ep)$$0x.getSource(), ft.a($$0x, "structure", lq.aJ, c))))))
               .then(eq.a("biome").then(eq.a("biome", fs.a($$1, lq.az)).executes($$0x -> a((ep)$$0x.getSource(), fs.a($$0x, "biome", lq.az))))))
            .then(eq.a("poi").then(eq.a("poi", fs.a($$1, lq.V)).executes($$0x -> b((ep)$$0x.getSource(), fs.a($$0x, "poi", lq.V)))))
      );
   }

   private static Optional<? extends jm.b<eil>> a(ft.c<eil> $$0, jv<eil> $$1) {
      return (Optional<? extends jm.b<eil>>)$$0.a().map($$1x -> $$1.b($$1x).map($$0xx -> jm.a($$0xx)), $$1::b);
   }

   private static int a(ep $$0, ft.c<eil> $$1) throws CommandSyntaxException {
      jv<eil> $$2 = $$0.e().H_().d(lq.aJ);
      jm<eil> $$3 = (jm<eil>)a($$1, $$2).orElseThrow(() -> c.create($$1.b()));
      iz $$4 = iz.a($$0.d());
      arf $$5 = $$0.e();
      Stopwatch $$6 = Stopwatch.createStarted(ac.d);
      Pair<iz, ji<eil>> $$7 = $$5.l().g().a($$5, $$3, $$4, 100, false);
      $$6.stop();
      if ($$7 == null) {
         throw b.create($$1.b());
      } else {
         return a($$0, $$1, $$4, $$7, "commands.locate.structure.success", false, $$6.elapsed());
      }
   }

   private static int a(ep $$0, fs.c<dcy> $$1) throws CommandSyntaxException {
      iz $$2 = iz.a($$0.d());
      Stopwatch $$3 = Stopwatch.createStarted(ac.d);
      Pair<iz, ji<dcy>> $$4 = $$0.e().a($$1, $$2, 6400, 32, 64);
      $$3.stop();
      if ($$4 == null) {
         throw d.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$4, "commands.locate.biome.success", true, $$3.elapsed());
      }
   }

   private static int b(ep $$0, fs.c<cex> $$1) throws CommandSyntaxException {
      iz $$2 = iz.a($$0.d());
      arf $$3 = $$0.e();
      Stopwatch $$4 = Stopwatch.createStarted(ac.d);
      Optional<Pair<ji<cex>, iz>> $$5 = $$3.y().e($$1, $$2, 256, ceu.b.c);
      $$4.stop();
      if ($$5.isEmpty()) {
         throw e.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$5.get().swap(), "commands.locate.poi.success", false, $$4.elapsed());
      }
   }

   public static int a(ep $$0, fs.c<?> $$1, iz $$2, Pair<iz, ? extends ji<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$1x -> $$1.b(), $$2x -> $$1.b() + " (" + ((ji)$$3.getSecond()).g() + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   public static int a(ep $$0, ft.c<?> $$1, iz $$2, Pair<iz, ? extends ji<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$0x -> $$0x.a().toString(), $$1x -> "#" + $$1x.b() + " (" + ((ji)$$3.getSecond()).g() + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   private static int a(ep $$0, iz $$1, Pair<iz, ? extends ji<?>> $$2, String $$3, boolean $$4, String $$5, Duration $$6) {
      iz $$7 = (iz)$$2.getFirst();
      int $$8 = $$4 ? ayz.d(ayz.c((float)$$1.j($$7))) : ayz.d(a($$1.u(), $$1.w(), $$7.u(), $$7.w()));
      String $$9 = $$4 ? String.valueOf($$7.v()) : "~";
      xp $$10 = xs.a((xp)xp.a("chat.coordinates", $$7.u(), $$9, $$7.w()))
         .a($$2x -> $$2x.a(n.k).a(new xn(xn.a.d, "/tp @s " + $$7.u() + " " + $$9 + " " + $$7.w())).a(new xv(xv.a.a, xp.c("chat.coordinates.tooltip"))));
      $$0.a(() -> xp.a($$3, $$5, $$10, $$8), false);
      a.info("Locating element " + $$5 + " took " + $$6.toMillis() + " ms");
      return $$8;
   }

   private static float a(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$2 - $$0;
      int $$5 = $$3 - $$1;
      return ayz.c((float)($$4 * $$4 + $$5 * $$5));
   }
}

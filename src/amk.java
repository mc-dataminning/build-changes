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

public class amk {
   private static final Logger a = LogUtils.getLogger();
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wi.b("commands.locate.structure.not_found", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wi.b("commands.locate.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wi.b("commands.locate.biome.not_found", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> wi.b("commands.locate.poi.not_found", $$0));
   private static final int f = 100;
   private static final int g = 6400;
   private static final int h = 32;
   private static final int i = 64;
   private static final int j = 256;

   public static void a(CommandDispatcher<dv> $$0, dr $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("locate").requires($$0x -> $$0x.c(2)))
                  .then(dw.a("structure").then(dw.a("structure", ey.a(ku.aG)).executes($$0x -> a((dv)$$0x.getSource(), ey.a($$0x, "structure", ku.aG, c))))))
               .then(dw.a("biome").then(dw.a("biome", ex.a($$1, ku.aw)).executes($$0x -> a((dv)$$0x.getSource(), ex.a($$0x, "biome", ku.aw))))))
            .then(dw.a("poi").then(dw.a("poi", ex.a($$1, ku.V)).executes($$0x -> b((dv)$$0x.getSource(), ex.a($$0x, "poi", ku.V)))))
      );
   }

   private static Optional<? extends ir.b<efq>> a(ey.c<efq> $$0, ja<efq> $$1) {
      return (Optional<? extends ir.b<efq>>)$$0.a().map($$1x -> $$1.b($$1x).map($$0xx -> ir.a($$0xx)), $$1::b);
   }

   private static int a(dv $$0, ey.c<efq> $$1) throws CommandSyntaxException {
      ja<efq> $$2 = $$0.e().H_().d(ku.aG);
      ir<efq> $$3 = (ir<efq>)a($$1, $$2).orElseThrow(() -> c.create($$1.b()));
      id $$4 = id.a($$0.d());
      apu $$5 = $$0.e();
      Stopwatch $$6 = Stopwatch.createStarted(ac.d);
      Pair<id, in<efq>> $$7 = $$5.l().g().a($$5, $$3, $$4, 100, false);
      $$6.stop();
      if ($$7 == null) {
         throw b.create($$1.b());
      } else {
         return a($$0, $$1, $$4, $$7, "commands.locate.structure.success", false, $$6.elapsed());
      }
   }

   private static int a(dv $$0, ex.c<daf> $$1) throws CommandSyntaxException {
      id $$2 = id.a($$0.d());
      Stopwatch $$3 = Stopwatch.createStarted(ac.d);
      Pair<id, in<daf>> $$4 = $$0.e().a($$1, $$2, 6400, 32, 64);
      $$3.stop();
      if ($$4 == null) {
         throw d.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$4, "commands.locate.biome.success", true, $$3.elapsed());
      }
   }

   private static int b(dv $$0, ex.c<cbz> $$1) throws CommandSyntaxException {
      id $$2 = id.a($$0.d());
      apu $$3 = $$0.e();
      Stopwatch $$4 = Stopwatch.createStarted(ac.d);
      Optional<Pair<in<cbz>, id>> $$5 = $$3.y().e($$1, $$2, 256, cbw.b.c);
      $$4.stop();
      if ($$5.isEmpty()) {
         throw e.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$5.get().swap(), "commands.locate.poi.success", false, $$4.elapsed());
      }
   }

   public static int a(dv $$0, ex.c<?> $$1, id $$2, Pair<id, ? extends in<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$1x -> $$1.b(), $$2x -> $$1.b() + " (" + ((in)$$3.getSecond()).g() + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   public static int a(dv $$0, ey.c<?> $$1, id $$2, Pair<id, ? extends in<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$0x -> $$0x.a().toString(), $$1x -> "#" + $$1x.b() + " (" + ((in)$$3.getSecond()).g() + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   private static int a(dv $$0, id $$1, Pair<id, ? extends in<?>> $$2, String $$3, boolean $$4, String $$5, Duration $$6) {
      id $$7 = (id)$$2.getFirst();
      int $$8 = $$4 ? axm.d(axm.c((float)$$1.j($$7))) : axm.d(a($$1.u(), $$1.w(), $$7.u(), $$7.w()));
      String $$9 = $$4 ? String.valueOf($$7.v()) : "~";
      wi $$10 = wl.a((wi)wi.a("chat.coordinates", $$7.u(), $$9, $$7.w()))
         .a($$2x -> $$2x.a(n.k).a(new wg(wg.a.d, "/tp @s " + $$7.u() + " " + $$9 + " " + $$7.w())).a(new wo(wo.a.a, wi.c("chat.coordinates.tooltip"))));
      $$0.a(() -> wi.a($$3, $$5, $$10, $$8), false);
      a.info("Locating element " + $$5 + " took " + $$6.toMillis() + " ms");
      return $$8;
   }

   private static float a(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$2 - $$0;
      int $$5 = $$3 - $$1;
      return axm.c((float)($$4 * $$4 + $$5 * $$5));
   }
}

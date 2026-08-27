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

public class alr {
   private static final Logger a = LogUtils.getLogger();
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> vs.b("commands.locate.structure.not_found", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> vs.b("commands.locate.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> vs.b("commands.locate.biome.not_found", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> vs.b("commands.locate.poi.not_found", $$0));
   private static final int f = 100;
   private static final int g = 6400;
   private static final int h = 32;
   private static final int i = 64;
   private static final int j = 256;

   public static void a(CommandDispatcher<du> $$0, dq $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("locate").requires($$0x -> $$0x.c(2)))
                  .then(dv.a("structure").then(dv.a("structure", ex.a(ki.aE)).executes($$0x -> a((du)$$0x.getSource(), ex.a($$0x, "structure", ki.aE, c))))))
               .then(dv.a("biome").then(dv.a("biome", ew.a($$1, ki.au)).executes($$0x -> a((du)$$0x.getSource(), ew.a($$0x, "biome", ki.au))))))
            .then(dv.a("poi").then(dv.a("poi", ew.a($$1, ki.U)).executes($$0x -> b((du)$$0x.getSource(), ew.a($$0x, "poi", ki.U)))))
      );
   }

   private static Optional<? extends ip.b<ecg>> a(ex.c<ecg> $$0, ix<ecg> $$1) {
      return (Optional<? extends ip.b<ecg>>)$$0.a().map($$1x -> $$1.b($$1x).map($$0xx -> ip.a($$0xx)), $$1::b);
   }

   private static int a(du $$0, ex.c<ecg> $$1) throws CommandSyntaxException {
      ix<ecg> $$2 = $$0.e().I_().d(ki.aE);
      ip<ecg> $$3 = (ip<ecg>)a($$1, $$2).orElseThrow(() -> c.create($$1.b()));
      ib $$4 = ib.a($$0.d());
      apa $$5 = $$0.e();
      Stopwatch $$6 = Stopwatch.createStarted(ac.c);
      Pair<ib, il<ecg>> $$7 = $$5.l().g().a($$5, $$3, $$4, 100, false);
      $$6.stop();
      if ($$7 == null) {
         throw b.create($$1.b());
      } else {
         return a($$0, $$1, $$4, $$7, "commands.locate.structure.success", false, $$6.elapsed());
      }
   }

   private static int a(du $$0, ew.c<cxd> $$1) throws CommandSyntaxException {
      ib $$2 = ib.a($$0.d());
      Stopwatch $$3 = Stopwatch.createStarted(ac.c);
      Pair<ib, il<cxd>> $$4 = $$0.e().a($$1, $$2, 6400, 32, 64);
      $$3.stop();
      if ($$4 == null) {
         throw d.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$4, "commands.locate.biome.success", true, $$3.elapsed());
      }
   }

   private static int b(du $$0, ew.c<cad> $$1) throws CommandSyntaxException {
      ib $$2 = ib.a($$0.d());
      apa $$3 = $$0.e();
      Stopwatch $$4 = Stopwatch.createStarted(ac.c);
      Optional<Pair<il<cad>, ib>> $$5 = $$3.y().e($$1, $$2, 256, caa.b.c);
      $$4.stop();
      if ($$5.isEmpty()) {
         throw e.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$5.get().swap(), "commands.locate.poi.success", false, $$4.elapsed());
      }
   }

   public static int a(du $$0, ew.c<?> $$1, ib $$2, Pair<ib, ? extends il<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$1x -> $$1.b(), $$2x -> $$1.b() + " (" + ((il)$$3.getSecond()).g() + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   public static int a(du $$0, ex.c<?> $$1, ib $$2, Pair<ib, ? extends il<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$0x -> $$0x.a().toString(), $$1x -> "#" + $$1x.b() + " (" + ((il)$$3.getSecond()).g() + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   private static int a(du $$0, ib $$1, Pair<ib, ? extends il<?>> $$2, String $$3, boolean $$4, String $$5, Duration $$6) {
      ib $$7 = (ib)$$2.getFirst();
      int $$8 = $$4 ? awm.d(awm.c((float)$$1.j($$7))) : awm.d(a($$1.u(), $$1.w(), $$7.u(), $$7.w()));
      String $$9 = $$4 ? String.valueOf($$7.v()) : "~";
      vs $$10 = vv.a((vs)vs.a("chat.coordinates", $$7.u(), $$9, $$7.w()))
         .a($$2x -> $$2x.a(n.k).a(new vq(vq.a.d, "/tp @s " + $$7.u() + " " + $$9 + " " + $$7.w())).a(new vy(vy.a.a, vs.c("chat.coordinates.tooltip"))));
      $$0.a(() -> vs.a($$3, $$5, $$10, $$8), false);
      a.info("Locating element " + $$5 + " took " + $$6.toMillis() + " ms");
      return $$8;
   }

   private static float a(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$2 - $$0;
      int $$5 = $$3 - $$1;
      return awm.c((float)($$4 * $$4 + $$5 * $$5));
   }
}

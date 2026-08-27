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

public class ajw {
   private static final Logger a = LogUtils.getLogger();
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> vg.b("commands.locate.structure.not_found", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> vg.b("commands.locate.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> vg.b("commands.locate.biome.not_found", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> vg.b("commands.locate.poi.not_found", $$0));
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

   private static Optional<? extends il.b<dzo>> a(ev.c<dzo> $$0, it<dzo> $$1) {
      return (Optional<? extends il.b<dzo>>)$$0.a().map($$1x -> $$1.b($$1x).map($$0xx -> il.a($$0xx)), $$1::b);
   }

   private static int a(ds $$0, ev.c<dzo> $$1) throws CommandSyntaxException {
      it<dzo> $$2 = $$0.e().I_().d(ke.aD);
      il<dzo> $$3 = (il<dzo>)a($$1, $$2).orElseThrow(() -> c.create($$1.b()));
      hx $$4 = hx.a($$0.d());
      ane $$5 = $$0.e();
      Stopwatch $$6 = Stopwatch.createStarted(ac.c);
      Pair<hx, ih<dzo>> $$7 = $$5.l().g().a($$5, $$3, $$4, 100, false);
      $$6.stop();
      if ($$7 == null) {
         throw b.create($$1.b());
      } else {
         return a($$0, $$1, $$4, $$7, "commands.locate.structure.success", false, $$6.elapsed());
      }
   }

   private static int a(ds $$0, eu.c<cuw> $$1) throws CommandSyntaxException {
      hx $$2 = hx.a($$0.d());
      Stopwatch $$3 = Stopwatch.createStarted(ac.c);
      Pair<hx, ih<cuw>> $$4 = $$0.e().a($$1, $$2, 6400, 32, 64);
      $$3.stop();
      if ($$4 == null) {
         throw d.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$4, "commands.locate.biome.success", true, $$3.elapsed());
      }
   }

   private static int b(ds $$0, eu.c<bxt> $$1) throws CommandSyntaxException {
      hx $$2 = hx.a($$0.d());
      ane $$3 = $$0.e();
      Stopwatch $$4 = Stopwatch.createStarted(ac.c);
      Optional<Pair<ih<bxt>, hx>> $$5 = $$3.y().e($$1, $$2, 256, bxq.b.c);
      $$4.stop();
      if ($$5.isEmpty()) {
         throw e.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$5.get().swap(), "commands.locate.poi.success", false, $$4.elapsed());
      }
   }

   public static int a(ds $$0, eu.c<?> $$1, hx $$2, Pair<hx, ? extends ih<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$1x -> $$1.b(), $$2x -> $$1.b() + " (" + ((ih)$$3.getSecond()).g() + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   public static int a(ds $$0, ev.c<?> $$1, hx $$2, Pair<hx, ? extends ih<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$0x -> $$0x.a().toString(), $$1x -> "#" + $$1x.b() + " (" + ((ih)$$3.getSecond()).g() + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   private static int a(ds $$0, hx $$1, Pair<hx, ? extends ih<?>> $$2, String $$3, boolean $$4, String $$5, Duration $$6) {
      hx $$7 = (hx)$$2.getFirst();
      int $$8 = $$4 ? aup.d(aup.c((float)$$1.j($$7))) : aup.d(a($$1.u(), $$1.w(), $$7.u(), $$7.w()));
      String $$9 = $$4 ? String.valueOf($$7.v()) : "~";
      vg $$10 = vj.a((vg)vg.a("chat.coordinates", $$7.u(), $$9, $$7.w()))
         .a($$2x -> $$2x.a(n.k).a(new ve(ve.a.d, "/tp @s " + $$7.u() + " " + $$9 + " " + $$7.w())).a(new vm(vm.a.a, vg.c("chat.coordinates.tooltip"))));
      $$0.a(() -> vg.a($$3, $$5, $$10, $$8), false);
      a.info("Locating element " + $$5 + " took " + $$6.toMillis() + " ms");
      return $$8;
   }

   private static float a(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$2 - $$0;
      int $$5 = $$3 - $$1;
      return aup.c((float)($$4 * $$4 + $$5 * $$5));
   }
}

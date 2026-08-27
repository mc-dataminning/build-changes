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

public class aji {
   private static final Logger a = LogUtils.getLogger();
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> vb.b("commands.locate.structure.not_found", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> vb.b("commands.locate.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> vb.b("commands.locate.biome.not_found", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> vb.b("commands.locate.poi.not_found", $$0));
   private static final int f = 100;
   private static final int g = 6400;
   private static final int h = 32;
   private static final int i = 64;
   private static final int j = 256;

   public static void a(CommandDispatcher<ds> $$0, dn $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("locate").requires($$0x -> $$0x.c(2)))
                  .then(dt.a("structure").then(dt.a("structure", eu.a(kc.aC)).executes($$0x -> a((ds)$$0x.getSource(), eu.a($$0x, "structure", kc.aC, c))))))
               .then(dt.a("biome").then(dt.a("biome", et.a($$1, kc.as)).executes($$0x -> a((ds)$$0x.getSource(), et.a($$0x, "biome", kc.as))))))
            .then(dt.a("poi").then(dt.a("poi", et.a($$1, kc.U)).executes($$0x -> b((ds)$$0x.getSource(), et.a($$0x, "poi", kc.U)))))
      );
   }

   private static Optional<? extends ij.b<dyo>> a(eu.c<dyo> $$0, ir<dyo> $$1) {
      return (Optional<? extends ij.b<dyo>>)$$0.a().map($$1x -> $$1.b($$1x).map($$0xx -> ij.a($$0xx)), $$1::b);
   }

   private static int a(ds $$0, eu.c<dyo> $$1) throws CommandSyntaxException {
      ir<dyo> $$2 = $$0.e().I_().d(kc.aC);
      ij<dyo> $$3 = (ij<dyo>)a($$1, $$2).orElseThrow(() -> c.create($$1.b()));
      hv $$4 = hv.a($$0.d());
      amp $$5 = $$0.e();
      Stopwatch $$6 = Stopwatch.createStarted(ac.c);
      Pair<hv, ie<dyo>> $$7 = $$5.k().g().a($$5, $$3, $$4, 100, false);
      $$6.stop();
      if ($$7 == null) {
         throw b.create($$1.b());
      } else {
         return a($$0, $$1, $$4, $$7, "commands.locate.structure.success", false, $$6.elapsed());
      }
   }

   private static int a(ds $$0, et.c<ctx> $$1) throws CommandSyntaxException {
      hv $$2 = hv.a($$0.d());
      Stopwatch $$3 = Stopwatch.createStarted(ac.c);
      Pair<hv, ie<ctx>> $$4 = $$0.e().a($$1, $$2, 6400, 32, 64);
      $$3.stop();
      if ($$4 == null) {
         throw d.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$4, "commands.locate.biome.success", true, $$3.elapsed());
      }
   }

   private static int b(ds $$0, et.c<bwz> $$1) throws CommandSyntaxException {
      hv $$2 = hv.a($$0.d());
      amp $$3 = $$0.e();
      Stopwatch $$4 = Stopwatch.createStarted(ac.c);
      Optional<Pair<ie<bwz>, hv>> $$5 = $$3.x().e($$1, $$2, 256, bww.b.c);
      $$4.stop();
      if ($$5.isEmpty()) {
         throw e.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$5.get().swap(), "commands.locate.poi.success", false, $$4.elapsed());
      }
   }

   private static String a(Pair<hv, ? extends ie<?>> $$0) {
      return ((ie)$$0.getSecond()).e().map($$0x -> $$0x.a().toString()).orElse("[unregistered]");
   }

   public static int a(ds $$0, et.c<?> $$1, hv $$2, Pair<hv, ? extends ie<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$1x -> $$1.b(), $$2x -> $$1.b() + " (" + a($$3) + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   public static int a(ds $$0, eu.c<?> $$1, hv $$2, Pair<hv, ? extends ie<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$0x -> $$0x.a().toString(), $$1x -> "#" + $$1x.b() + " (" + a($$3) + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   private static int a(ds $$0, hv $$1, Pair<hv, ? extends ie<?>> $$2, String $$3, boolean $$4, String $$5, Duration $$6) {
      hv $$7 = (hv)$$2.getFirst();
      int $$8 = $$4 ? aty.d(aty.c((float)$$1.j($$7))) : aty.d(a($$1.u(), $$1.w(), $$7.u(), $$7.w()));
      String $$9 = $$4 ? String.valueOf($$7.v()) : "~";
      vb $$10 = ve.a((vb)vb.a("chat.coordinates", $$7.u(), $$9, $$7.w()))
         .a($$2x -> $$2x.a(n.k).a(new uz(uz.a.d, "/tp @s " + $$7.u() + " " + $$9 + " " + $$7.w())).a(new vh(vh.a.a, vb.c("chat.coordinates.tooltip"))));
      $$0.a(() -> vb.a($$3, $$5, $$10, $$8), false);
      a.info("Locating element " + $$5 + " took " + $$6.toMillis() + " ms");
      return $$8;
   }

   private static float a(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$2 - $$0;
      int $$5 = $$3 - $$1;
      return aty.c((float)($$4 * $$4 + $$5 * $$5));
   }
}

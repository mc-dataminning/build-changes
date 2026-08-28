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

public class anz {
   private static final Logger a = LogUtils.getLogger();
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wy.b("commands.locate.structure.not_found", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wy.b("commands.locate.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wy.b("commands.locate.biome.not_found", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> wy.b("commands.locate.poi.not_found", $$0));
   private static final int f = 100;
   private static final int g = 6400;
   private static final int h = 32;
   private static final int i = 64;
   private static final int j = 256;

   public static void a(CommandDispatcher<ei> $$0, ee $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("locate").requires($$0x -> $$0x.c(2)))
                  .then(ej.a("structure").then(ej.a("structure", fm.a(mg.bd)).executes($$0x -> a((ei)$$0x.getSource(), fm.a($$0x, "structure", mg.bd, c))))))
               .then(ej.a("biome").then(ej.a("biome", fl.a($$1, mg.aG)).executes($$0x -> a((ei)$$0x.getSource(), fl.a($$0x, "biome", mg.aG))))))
            .then(ej.a("poi").then(ej.a("poi", fl.a($$1, mg.aa)).executes($$0x -> b((ei)$$0x.getSource(), fl.a($$0x, "poi", mg.aa)))))
      );
   }

   private static Optional<? extends ji.b<eqt>> a(fm.c<eqt> $$0, jr<eqt> $$1) {
      return (Optional<? extends ji.b<eqt>>)$$0.a().map($$1x -> $$1.a($$1x).map($$0xx -> ji.a($$0xx)), $$1::a);
   }

   private static int a(ei $$0, fm.c<eqt> $$1) throws CommandSyntaxException {
      jr<eqt> $$2 = $$0.e().F_().f(mg.bd);
      ji<eqt> $$3 = (ji<eqt>)a($$1, $$2).orElseThrow(() -> c.create($$1.b()));
      iu $$4 = iu.a((jo)$$0.d());
      arq $$5 = $$0.e();
      Stopwatch $$6 = Stopwatch.createStarted(af.d);
      Pair<iu, je<eqt>> $$7 = $$5.m().g().a($$5, $$3, $$4, 100, false);
      $$6.stop();
      if ($$7 == null) {
         throw b.create($$1.b());
      } else {
         return a($$0, $$1, $$4, $$7, "commands.locate.structure.success", false, $$6.elapsed());
      }
   }

   private static int a(ei $$0, fl.c<djy> $$1) throws CommandSyntaxException {
      iu $$2 = iu.a((jo)$$0.d());
      Stopwatch $$3 = Stopwatch.createStarted(af.d);
      Pair<iu, je<djy>> $$4 = $$0.e().a($$1, $$2, 6400, 32, 64);
      $$3.stop();
      if ($$4 == null) {
         throw d.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$4, "commands.locate.biome.success", true, $$3.elapsed());
      }
   }

   private static int b(ei $$0, fl.c<cih> $$1) throws CommandSyntaxException {
      iu $$2 = iu.a((jo)$$0.d());
      arq $$3 = $$0.e();
      Stopwatch $$4 = Stopwatch.createStarted(af.d);
      Optional<Pair<je<cih>, iu>> $$5 = $$3.A().e($$1, $$2, 256, cie.b.c);
      $$4.stop();
      if ($$5.isEmpty()) {
         throw e.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$5.get().swap(), "commands.locate.poi.success", false, $$4.elapsed());
      }
   }

   public static int a(ei $$0, fl.c<?> $$1, iu $$2, Pair<iu, ? extends je<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$1x -> $$1.b(), $$2x -> $$1.b() + " (" + ((je)$$3.getSecond()).g() + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   public static int a(ei $$0, fm.c<?> $$1, iu $$2, Pair<iu, ? extends je<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$0x -> $$0x.a().toString(), $$1x -> "#" + $$1x.b() + " (" + ((je)$$3.getSecond()).g() + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   private static int a(ei $$0, iu $$1, Pair<iu, ? extends je<?>> $$2, String $$3, boolean $$4, String $$5, Duration $$6) {
      iu $$7 = (iu)$$2.getFirst();
      int $$8 = $$4 ? azm.d(azm.c((float)$$1.j($$7))) : azm.d(a($$1.u(), $$1.w(), $$7.u(), $$7.w()));
      String $$9 = $$4 ? String.valueOf($$7.v()) : "~";
      wy $$10 = xb.a((wy)wy.a("chat.coordinates", $$7.u(), $$9, $$7.w()))
         .a($$2x -> $$2x.a(n.k).a(new ww.g("/tp @s " + $$7.u() + " " + $$9 + " " + $$7.w())).a(new xe.e(wy.c("chat.coordinates.tooltip"))));
      $$0.a(() -> wy.a($$3, $$5, $$10, $$8), false);
      a.info("Locating element " + $$5 + " took " + $$6.toMillis() + " ms");
      return $$8;
   }

   private static float a(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$2 - $$0;
      int $$5 = $$3 - $$1;
      return azm.c((float)($$4 * $$4 + $$5 * $$5));
   }
}

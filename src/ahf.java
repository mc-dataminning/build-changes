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

public class ahf {
   private static final Logger a = LogUtils.getLogger();
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> tf.a("commands.locate.structure.not_found", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> tf.a("commands.locate.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> tf.a("commands.locate.biome.not_found", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> tf.a("commands.locate.poi.not_found", $$0));
   private static final int f = 100;
   private static final int g = 6400;
   private static final int h = 32;
   private static final int i = 64;
   private static final int j = 256;

   public static void a(CommandDispatcher<dr> $$0, dl $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("locate").requires($$0x -> $$0x.c(2)))
                  .then(ds.a("structure").then(ds.a("structure", es.a(jc.az)).executes($$0x -> a((dr)$$0x.getSource(), es.a($$0x, "structure", jc.az, c))))))
               .then(ds.a("biome").then(ds.a("biome", er.a($$1, jc.ap)).executes($$0x -> a((dr)$$0x.getSource(), er.a($$0x, "biome", jc.ap))))))
            .then(ds.a("poi").then(ds.a("poi", er.a($$1, jc.S)).executes($$0x -> b((dr)$$0x.getSource(), er.a($$0x, "poi", jc.S)))))
      );
   }

   private static Optional<? extends hi.b<duy>> a(es.c<duy> $$0, hr<duy> $$1) {
      return (Optional<? extends hi.b<duy>>)$$0.a().map($$1x -> $$1.b($$1x).map($$0xx -> hi.a($$0xx)), $$1::b);
   }

   private static int a(dr $$0, es.c<duy> $$1) throws CommandSyntaxException {
      hr<duy> $$2 = $$0.e().B_().d(jc.az);
      hi<duy> $$3 = (hi<duy>)a($$1, $$2).orElseThrow(() -> c.create($$1.b()));
      gu $$4 = gu.a($$0.d());
      akk $$5 = $$0.e();
      Stopwatch $$6 = Stopwatch.createStarted(ac.c);
      Pair<gu, he<duy>> $$7 = $$5.k().g().a($$5, $$3, $$4, 100, false);
      $$6.stop();
      if ($$7 == null) {
         throw b.create($$1.b());
      } else {
         return a($$0, $$1, $$4, $$7, "commands.locate.structure.success", false, $$6.elapsed());
      }
   }

   private static int a(dr $$0, er.c<cqj> $$1) throws CommandSyntaxException {
      gu $$2 = gu.a($$0.d());
      Stopwatch $$3 = Stopwatch.createStarted(ac.c);
      Pair<gu, he<cqj>> $$4 = $$0.e().a($$1, $$2, 6400, 32, 64);
      $$3.stop();
      if ($$4 == null) {
         throw d.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$4, "commands.locate.biome.success", true, $$3.elapsed());
      }
   }

   private static int b(dr $$0, er.c<bua> $$1) throws CommandSyntaxException {
      gu $$2 = gu.a($$0.d());
      akk $$3 = $$0.e();
      Stopwatch $$4 = Stopwatch.createStarted(ac.c);
      Optional<Pair<he<bua>, gu>> $$5 = $$3.w().e($$1, $$2, 256, btx.b.c);
      $$4.stop();
      if ($$5.isEmpty()) {
         throw e.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$5.get().swap(), "commands.locate.poi.success", false, $$4.elapsed());
      }
   }

   private static String a(Pair<gu, ? extends he<?>> $$0) {
      return ((he)$$0.getSecond()).e().map($$0x -> $$0x.a().toString()).orElse("[unregistered]");
   }

   public static int a(dr $$0, er.c<?> $$1, gu $$2, Pair<gu, ? extends he<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$1x -> $$1.b(), $$2x -> $$1.b() + " (" + a($$3) + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   public static int a(dr $$0, es.c<?> $$1, gu $$2, Pair<gu, ? extends he<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$0x -> $$0x.a().toString(), $$1x -> "#" + $$1x.b() + " (" + a($$3) + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   private static int a(dr $$0, gu $$1, Pair<gu, ? extends he<?>> $$2, String $$3, boolean $$4, String $$5, Duration $$6) {
      gu $$7 = (gu)$$2.getFirst();
      int $$8 = $$4 ? arp.d(arp.c((float)$$1.j($$7))) : arp.d(a($$1.u(), $$1.w(), $$7.u(), $$7.w()));
      String $$9 = $$4 ? String.valueOf($$7.v()) : "~";
      tf $$10 = th.a((tf)tf.a("chat.coordinates", $$7.u(), $$9, $$7.w()))
         .a($$2x -> $$2x.a(n.k).a(new td(td.a.d, "/tp @s " + $$7.u() + " " + $$9 + " " + $$7.w())).a(new tk(tk.a.a, tf.c("chat.coordinates.tooltip"))));
      $$0.a(() -> tf.a($$3, $$5, $$10, $$8), false);
      a.info("Locating element " + $$5 + " took " + $$6.toMillis() + " ms");
      return $$8;
   }

   private static float a(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$2 - $$0;
      int $$5 = $$3 - $$1;
      return arp.c((float)($$4 * $$4 + $$5 * $$5));
   }
}

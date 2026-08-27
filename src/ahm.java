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

public class ahm {
   private static final Logger a = LogUtils.getLogger();
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> tn.a("commands.locate.structure.not_found", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> tn.a("commands.locate.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> tn.a("commands.locate.biome.not_found", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> tn.a("commands.locate.poi.not_found", $$0));
   private static final int f = 100;
   private static final int g = 6400;
   private static final int h = 32;
   private static final int i = 64;
   private static final int j = 256;

   public static void a(CommandDispatcher<dt> $$0, dn $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("locate").requires($$0x -> $$0x.c(2)))
                  .then(du.a("structure").then(du.a("structure", eu.a(je.az)).executes($$0x -> a((dt)$$0x.getSource(), eu.a($$0x, "structure", je.az, c))))))
               .then(du.a("biome").then(du.a("biome", et.a($$1, je.ap)).executes($$0x -> a((dt)$$0x.getSource(), et.a($$0x, "biome", je.ap))))))
            .then(du.a("poi").then(du.a("poi", et.a($$1, je.S)).executes($$0x -> b((dt)$$0x.getSource(), et.a($$0x, "poi", je.S)))))
      );
   }

   private static Optional<? extends hk.b<dvk>> a(eu.c<dvk> $$0, ht<dvk> $$1) {
      return (Optional<? extends hk.b<dvk>>)$$0.a().map($$1x -> $$1.b($$1x).map($$0xx -> hk.a($$0xx)), $$1::b);
   }

   private static int a(dt $$0, eu.c<dvk> $$1) throws CommandSyntaxException {
      ht<dvk> $$2 = $$0.e().G_().d(je.az);
      hk<dvk> $$3 = (hk<dvk>)a($$1, $$2).orElseThrow(() -> c.create($$1.b()));
      gw $$4 = gw.a($$0.d());
      aks $$5 = $$0.e();
      Stopwatch $$6 = Stopwatch.createStarted(ac.c);
      Pair<gw, hg<dvk>> $$7 = $$5.k().g().a($$5, $$3, $$4, 100, false);
      $$6.stop();
      if ($$7 == null) {
         throw b.create($$1.b());
      } else {
         return a($$0, $$1, $$4, $$7, "commands.locate.structure.success", false, $$6.elapsed());
      }
   }

   private static int a(dt $$0, et.c<cqv> $$1) throws CommandSyntaxException {
      gw $$2 = gw.a($$0.d());
      Stopwatch $$3 = Stopwatch.createStarted(ac.c);
      Pair<gw, hg<cqv>> $$4 = $$0.e().a($$1, $$2, 6400, 32, 64);
      $$3.stop();
      if ($$4 == null) {
         throw d.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$4, "commands.locate.biome.success", true, $$3.elapsed());
      }
   }

   private static int b(dt $$0, et.c<buk> $$1) throws CommandSyntaxException {
      gw $$2 = gw.a($$0.d());
      aks $$3 = $$0.e();
      Stopwatch $$4 = Stopwatch.createStarted(ac.c);
      Optional<Pair<hg<buk>, gw>> $$5 = $$3.w().e($$1, $$2, 256, buh.b.c);
      $$4.stop();
      if ($$5.isEmpty()) {
         throw e.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$5.get().swap(), "commands.locate.poi.success", false, $$4.elapsed());
      }
   }

   private static String a(Pair<gw, ? extends hg<?>> $$0) {
      return ((hg)$$0.getSecond()).e().map($$0x -> $$0x.a().toString()).orElse("[unregistered]");
   }

   public static int a(dt $$0, et.c<?> $$1, gw $$2, Pair<gw, ? extends hg<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$1x -> $$1.b(), $$2x -> $$1.b() + " (" + a($$3) + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   public static int a(dt $$0, eu.c<?> $$1, gw $$2, Pair<gw, ? extends hg<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$0x -> $$0x.a().toString(), $$1x -> "#" + $$1x.b() + " (" + a($$3) + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   private static int a(dt $$0, gw $$1, Pair<gw, ? extends hg<?>> $$2, String $$3, boolean $$4, String $$5, Duration $$6) {
      gw $$7 = (gw)$$2.getFirst();
      int $$8 = $$4 ? ary.d(ary.c((float)$$1.j($$7))) : ary.d(a($$1.u(), $$1.w(), $$7.u(), $$7.w()));
      String $$9 = $$4 ? String.valueOf($$7.v()) : "~";
      tn $$10 = tp.a((tn)tn.a("chat.coordinates", $$7.u(), $$9, $$7.w()))
         .a($$2x -> $$2x.a(n.k).a(new tl(tl.a.d, "/tp @s " + $$7.u() + " " + $$9 + " " + $$7.w())).a(new ts(ts.a.a, tn.c("chat.coordinates.tooltip"))));
      $$0.a(() -> tn.a($$3, $$5, $$10, $$8), false);
      a.info("Locating element " + $$5 + " took " + $$6.toMillis() + " ms");
      return $$8;
   }

   private static float a(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$2 - $$0;
      int $$5 = $$3 - $$1;
      return ary.c((float)($$4 * $$4 + $$5 * $$5));
   }
}

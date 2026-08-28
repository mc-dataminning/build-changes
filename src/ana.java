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

public class ana {
   private static final Logger a = LogUtils.getLogger();
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wu.b("commands.locate.structure.not_found", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wu.b("commands.locate.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wu.b("commands.locate.biome.not_found", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> wu.b("commands.locate.poi.not_found", $$0));
   private static final int f = 100;
   private static final int g = 6400;
   private static final int h = 32;
   private static final int i = 64;
   private static final int j = 256;

   public static void a(CommandDispatcher<eq> $$0, em $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("locate").requires($$0x -> $$0x.c(2)))
                  .then(er.a("structure").then(er.a("structure", fu.a(lr.aQ)).executes($$0x -> a((eq)$$0x.getSource(), fu.a($$0x, "structure", lr.aQ, c))))))
               .then(er.a("biome").then(er.a("biome", ft.a($$1, lr.aE)).executes($$0x -> a((eq)$$0x.getSource(), ft.a($$0x, "biome", lr.aE))))))
            .then(er.a("poi").then(er.a("poi", ft.a($$1, lr.Z)).executes($$0x -> b((eq)$$0x.getSource(), ft.a($$0x, "poi", lr.Z)))))
      );
   }

   private static Optional<? extends jn.b<eiq>> a(fu.c<eiq> $$0, jw<eiq> $$1) {
      return (Optional<? extends jn.b<eiq>>)$$0.a().map($$1x -> $$1.b($$1x).map($$0xx -> jn.a($$0xx)), $$1::b);
   }

   private static int a(eq $$0, fu.c<eiq> $$1) throws CommandSyntaxException {
      jw<eiq> $$2 = $$0.e().H_().d(lr.aQ);
      jn<eiq> $$3 = (jn<eiq>)a($$1, $$2).orElseThrow(() -> c.create($$1.b()));
      ja $$4 = ja.a($$0.d());
      aqk $$5 = $$0.e();
      Stopwatch $$6 = Stopwatch.createStarted(ac.d);
      Pair<ja, jj<eiq>> $$7 = $$5.l().g().a($$5, $$3, $$4, 100, false);
      $$6.stop();
      if ($$7 == null) {
         throw b.create($$1.b());
      } else {
         return a($$0, $$1, $$4, $$7, "commands.locate.structure.success", false, $$6.elapsed());
      }
   }

   private static int a(eq $$0, ft.c<ddd> $$1) throws CommandSyntaxException {
      ja $$2 = ja.a($$0.d());
      Stopwatch $$3 = Stopwatch.createStarted(ac.d);
      Pair<ja, jj<ddd>> $$4 = $$0.e().a($$1, $$2, 6400, 32, 64);
      $$3.stop();
      if ($$4 == null) {
         throw d.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$4, "commands.locate.biome.success", true, $$3.elapsed());
      }
   }

   private static int b(eq $$0, ft.c<cef> $$1) throws CommandSyntaxException {
      ja $$2 = ja.a($$0.d());
      aqk $$3 = $$0.e();
      Stopwatch $$4 = Stopwatch.createStarted(ac.d);
      Optional<Pair<jj<cef>, ja>> $$5 = $$3.y().e($$1, $$2, 256, cec.b.c);
      $$4.stop();
      if ($$5.isEmpty()) {
         throw e.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$5.get().swap(), "commands.locate.poi.success", false, $$4.elapsed());
      }
   }

   public static int a(eq $$0, ft.c<?> $$1, ja $$2, Pair<ja, ? extends jj<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$1x -> $$1.b(), $$2x -> $$1.b() + " (" + ((jj)$$3.getSecond()).g() + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   public static int a(eq $$0, fu.c<?> $$1, ja $$2, Pair<ja, ? extends jj<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$0x -> $$0x.a().toString(), $$1x -> "#" + $$1x.b() + " (" + ((jj)$$3.getSecond()).g() + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   private static int a(eq $$0, ja $$1, Pair<ja, ? extends jj<?>> $$2, String $$3, boolean $$4, String $$5, Duration $$6) {
      ja $$7 = (ja)$$2.getFirst();
      int $$8 = $$4 ? aye.d(aye.c((float)$$1.j($$7))) : aye.d(a($$1.u(), $$1.w(), $$7.u(), $$7.w()));
      String $$9 = $$4 ? String.valueOf($$7.v()) : "~";
      wu $$10 = wx.a((wu)wu.a("chat.coordinates", $$7.u(), $$9, $$7.w()))
         .a($$2x -> $$2x.a(n.k).a(new ws(ws.a.d, "/tp @s " + $$7.u() + " " + $$9 + " " + $$7.w())).a(new xa(xa.a.a, wu.c("chat.coordinates.tooltip"))));
      $$0.a(() -> wu.a($$3, $$5, $$10, $$8), false);
      a.info("Locating element " + $$5 + " took " + $$6.toMillis() + " ms");
      return $$8;
   }

   private static float a(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$2 - $$0;
      int $$5 = $$3 - $$1;
      return aye.c((float)($$4 * $$4 + $$5 * $$5));
   }
}

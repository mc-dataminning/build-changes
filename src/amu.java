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

public class amu {
   private static final Logger a = LogUtils.getLogger();
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> ws.b("commands.locate.structure.not_found", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> ws.b("commands.locate.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> ws.b("commands.locate.biome.not_found", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> ws.b("commands.locate.poi.not_found", $$0));
   private static final int f = 100;
   private static final int g = 6400;
   private static final int h = 32;
   private static final int i = 64;
   private static final int j = 256;

   public static void a(CommandDispatcher<ec> $$0, dy $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("locate").requires($$0x -> $$0x.c(2)))
                  .then(ed.a("structure").then(ed.a("structure", ff.a(ld.aI)).executes($$0x -> a((ec)$$0x.getSource(), ff.a($$0x, "structure", ld.aI, c))))))
               .then(ed.a("biome").then(ed.a("biome", fe.a($$1, ld.ay)).executes($$0x -> a((ec)$$0x.getSource(), fe.a($$0x, "biome", ld.ay))))))
            .then(ed.a("poi").then(ed.a("poi", fe.a($$1, ld.V)).executes($$0x -> b((ec)$$0x.getSource(), fe.a($$0x, "poi", ld.V)))))
      );
   }

   private static Optional<? extends iz.b<egg>> a(ff.c<egg> $$0, ji<egg> $$1) {
      return (Optional<? extends iz.b<egg>>)$$0.a().map($$1x -> $$1.b($$1x).map($$0xx -> iz.a($$0xx)), $$1::b);
   }

   private static int a(ec $$0, ff.c<egg> $$1) throws CommandSyntaxException {
      ji<egg> $$2 = $$0.e().H_().d(ld.aI);
      iz<egg> $$3 = (iz<egg>)a($$1, $$2).orElseThrow(() -> c.create($$1.b()));
      im $$4 = im.a($$0.d());
      aqe $$5 = $$0.e();
      Stopwatch $$6 = Stopwatch.createStarted(ac.d);
      Pair<im, iv<egg>> $$7 = $$5.l().g().a($$5, $$3, $$4, 100, false);
      $$6.stop();
      if ($$7 == null) {
         throw b.create($$1.b());
      } else {
         return a($$0, $$1, $$4, $$7, "commands.locate.structure.success", false, $$6.elapsed());
      }
   }

   private static int a(ec $$0, fe.c<dat> $$1) throws CommandSyntaxException {
      im $$2 = im.a($$0.d());
      Stopwatch $$3 = Stopwatch.createStarted(ac.d);
      Pair<im, iv<dat>> $$4 = $$0.e().a($$1, $$2, 6400, 32, 64);
      $$3.stop();
      if ($$4 == null) {
         throw d.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$4, "commands.locate.biome.success", true, $$3.elapsed());
      }
   }

   private static int b(ec $$0, fe.c<cck> $$1) throws CommandSyntaxException {
      im $$2 = im.a($$0.d());
      aqe $$3 = $$0.e();
      Stopwatch $$4 = Stopwatch.createStarted(ac.d);
      Optional<Pair<iv<cck>, im>> $$5 = $$3.y().e($$1, $$2, 256, cch.b.c);
      $$4.stop();
      if ($$5.isEmpty()) {
         throw e.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$5.get().swap(), "commands.locate.poi.success", false, $$4.elapsed());
      }
   }

   public static int a(ec $$0, fe.c<?> $$1, im $$2, Pair<im, ? extends iv<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$1x -> $$1.b(), $$2x -> $$1.b() + " (" + ((iv)$$3.getSecond()).g() + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   public static int a(ec $$0, ff.c<?> $$1, im $$2, Pair<im, ? extends iv<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$0x -> $$0x.a().toString(), $$1x -> "#" + $$1x.b() + " (" + ((iv)$$3.getSecond()).g() + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   private static int a(ec $$0, im $$1, Pair<im, ? extends iv<?>> $$2, String $$3, boolean $$4, String $$5, Duration $$6) {
      im $$7 = (im)$$2.getFirst();
      int $$8 = $$4 ? axw.d(axw.c((float)$$1.j($$7))) : axw.d(a($$1.u(), $$1.w(), $$7.u(), $$7.w()));
      String $$9 = $$4 ? String.valueOf($$7.v()) : "~";
      ws $$10 = wv.a((ws)ws.a("chat.coordinates", $$7.u(), $$9, $$7.w()))
         .a($$2x -> $$2x.a(n.k).a(new wq(wq.a.d, "/tp @s " + $$7.u() + " " + $$9 + " " + $$7.w())).a(new wy(wy.a.a, ws.c("chat.coordinates.tooltip"))));
      $$0.a(() -> ws.a($$3, $$5, $$10, $$8), false);
      a.info("Locating element " + $$5 + " took " + $$6.toMillis() + " ms");
      return $$8;
   }

   private static float a(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$2 - $$0;
      int $$5 = $$3 - $$1;
      return axw.c((float)($$4 * $$4 + $$5 * $$5));
   }
}

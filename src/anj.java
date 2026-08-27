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

public class anj {
   private static final Logger a = LogUtils.getLogger();
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xe.b("commands.locate.structure.not_found", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xe.b("commands.locate.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xe.b("commands.locate.biome.not_found", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xe.b("commands.locate.poi.not_found", $$0));
   private static final int f = 100;
   private static final int g = 6400;
   private static final int h = 32;
   private static final int i = 64;
   private static final int j = 256;

   public static void a(CommandDispatcher<eh> $$0, ed $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("locate").requires($$0x -> $$0x.c(2)))
                  .then(ei.a("structure").then(ei.a("structure", fl.a(li.aJ)).executes($$0x -> a((eh)$$0x.getSource(), fl.a($$0x, "structure", li.aJ, c))))))
               .then(ei.a("biome").then(ei.a("biome", fk.a($$1, li.az)).executes($$0x -> a((eh)$$0x.getSource(), fk.a($$0x, "biome", li.az))))))
            .then(ei.a("poi").then(ei.a("poi", fk.a($$1, li.V)).executes($$0x -> b((eh)$$0x.getSource(), fk.a($$0x, "poi", li.V)))))
      );
   }

   private static Optional<? extends je.b<ejt>> a(fl.c<ejt> $$0, jn<ejt> $$1) {
      return (Optional<? extends je.b<ejt>>)$$0.a().map($$1x -> $$1.b($$1x).map($$0xx -> je.a($$0xx)), $$1::b);
   }

   private static int a(eh $$0, fl.c<ejt> $$1) throws CommandSyntaxException {
      jn<ejt> $$2 = $$0.e().I_().d(li.aJ);
      je<ejt> $$3 = (je<ejt>)a($$1, $$2).orElseThrow(() -> c.create($$1.b()));
      ir $$4 = ir.a($$0.d());
      aqt $$5 = $$0.e();
      Stopwatch $$6 = Stopwatch.createStarted(ad.d);
      Pair<ir, ja<ejt>> $$7 = $$5.l().g().a($$5, $$3, $$4, 100, false);
      $$6.stop();
      if ($$7 == null) {
         throw b.create($$1.b());
      } else {
         return a($$0, $$1, $$4, $$7, "commands.locate.structure.success", false, $$6.elapsed());
      }
   }

   private static int a(eh $$0, fk.c<dcz> $$1) throws CommandSyntaxException {
      ir $$2 = ir.a($$0.d());
      Stopwatch $$3 = Stopwatch.createStarted(ad.d);
      Pair<ir, ja<dcz>> $$4 = $$0.e().a($$1, $$2, 6400, 32, 64);
      $$3.stop();
      if ($$4 == null) {
         throw d.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$4, "commands.locate.biome.success", true, $$3.elapsed());
      }
   }

   private static int b(eh $$0, fk.c<cdu> $$1) throws CommandSyntaxException {
      ir $$2 = ir.a($$0.d());
      aqt $$3 = $$0.e();
      Stopwatch $$4 = Stopwatch.createStarted(ad.d);
      Optional<Pair<ja<cdu>, ir>> $$5 = $$3.y().e($$1, $$2, 256, cdr.b.c);
      $$4.stop();
      if ($$5.isEmpty()) {
         throw e.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$5.get().swap(), "commands.locate.poi.success", false, $$4.elapsed());
      }
   }

   public static int a(eh $$0, fk.c<?> $$1, ir $$2, Pair<ir, ? extends ja<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$1x -> $$1.b(), $$2x -> $$1.b() + " (" + ((ja)$$3.getSecond()).g() + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   public static int a(eh $$0, fl.c<?> $$1, ir $$2, Pair<ir, ? extends ja<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$0x -> $$0x.a().toString(), $$1x -> "#" + $$1x.b() + " (" + ((ja)$$3.getSecond()).g() + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   private static int a(eh $$0, ir $$1, Pair<ir, ? extends ja<?>> $$2, String $$3, boolean $$4, String $$5, Duration $$6) {
      ir $$7 = (ir)$$2.getFirst();
      int $$8 = $$4 ? aym.d(aym.c((float)$$1.j($$7))) : aym.d(a($$1.u(), $$1.w(), $$7.u(), $$7.w()));
      String $$9 = $$4 ? String.valueOf($$7.v()) : "~";
      xe $$10 = xh.a((xe)xe.a("chat.coordinates", $$7.u(), $$9, $$7.w()))
         .a($$2x -> $$2x.a(n.k).a(new xc(xc.a.d, "/tp @s " + $$7.u() + " " + $$9 + " " + $$7.w())).a(new xk(xk.a.a, xe.c("chat.coordinates.tooltip"))));
      $$0.a(() -> xe.a($$3, $$5, $$10, $$8), false);
      a.info("Locating element " + $$5 + " took " + $$6.toMillis() + " ms");
      return $$8;
   }

   private static float a(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$2 - $$0;
      int $$5 = $$3 - $$1;
      return aym.c((float)($$4 * $$4 + $$5 * $$5));
   }
}

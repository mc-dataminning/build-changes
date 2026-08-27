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

public class aiu {
   private static final Logger a = LogUtils.getLogger();
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> ur.b("commands.locate.structure.not_found", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> ur.b("commands.locate.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> ur.b("commands.locate.biome.not_found", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> ur.b("commands.locate.poi.not_found", $$0));
   private static final int f = 100;
   private static final int g = 6400;
   private static final int h = 32;
   private static final int i = 64;
   private static final int j = 256;

   public static void a(CommandDispatcher<du> $$0, dp $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("locate").requires($$0x -> $$0x.c(2)))
                  .then(dv.a("structure").then(dv.a("structure", ew.a(jz.aB)).executes($$0x -> a((du)$$0x.getSource(), ew.a($$0x, "structure", jz.aB, c))))))
               .then(dv.a("biome").then(dv.a("biome", ev.a($$1, jz.ar)).executes($$0x -> a((du)$$0x.getSource(), ev.a($$0x, "biome", jz.ar))))))
            .then(dv.a("poi").then(dv.a("poi", ev.a($$1, jz.T)).executes($$0x -> b((du)$$0x.getSource(), ev.a($$0x, "poi", jz.T)))))
      );
   }

   private static Optional<? extends ig.b<dwv>> a(ew.c<dwv> $$0, io<dwv> $$1) {
      return (Optional<? extends ig.b<dwv>>)$$0.a().map($$1x -> $$1.b($$1x).map($$0xx -> ig.a($$0xx)), $$1::b);
   }

   private static int a(du $$0, ew.c<dwv> $$1) throws CommandSyntaxException {
      io<dwv> $$2 = $$0.f().H_().d(jz.aB);
      ig<dwv> $$3 = (ig<dwv>)a($$1, $$2).orElseThrow(() -> c.create($$1.b()));
      ht $$4 = ht.a($$0.e());
      ama $$5 = $$0.f();
      Stopwatch $$6 = Stopwatch.createStarted(ac.c);
      Pair<ht, ib<dwv>> $$7 = $$5.k().g().a($$5, $$3, $$4, 100, false);
      $$6.stop();
      if ($$7 == null) {
         throw b.create($$1.b());
      } else {
         return a($$0, $$1, $$4, $$7, "commands.locate.structure.success", false, $$6.elapsed());
      }
   }

   private static int a(du $$0, ev.c<csq> $$1) throws CommandSyntaxException {
      ht $$2 = ht.a($$0.e());
      Stopwatch $$3 = Stopwatch.createStarted(ac.c);
      Pair<ht, ib<csq>> $$4 = $$0.f().a($$1, $$2, 6400, 32, 64);
      $$3.stop();
      if ($$4 == null) {
         throw d.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$4, "commands.locate.biome.success", true, $$3.elapsed());
      }
   }

   private static int b(du $$0, ev.c<bwa> $$1) throws CommandSyntaxException {
      ht $$2 = ht.a($$0.e());
      ama $$3 = $$0.f();
      Stopwatch $$4 = Stopwatch.createStarted(ac.c);
      Optional<Pair<ib<bwa>, ht>> $$5 = $$3.w().e($$1, $$2, 256, bvx.b.c);
      $$4.stop();
      if ($$5.isEmpty()) {
         throw e.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$5.get().swap(), "commands.locate.poi.success", false, $$4.elapsed());
      }
   }

   private static String a(Pair<ht, ? extends ib<?>> $$0) {
      return ((ib)$$0.getSecond()).e().map($$0x -> $$0x.a().toString()).orElse("[unregistered]");
   }

   public static int a(du $$0, ev.c<?> $$1, ht $$2, Pair<ht, ? extends ib<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$1x -> $$1.b(), $$2x -> $$1.b() + " (" + a($$3) + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   public static int a(du $$0, ew.c<?> $$1, ht $$2, Pair<ht, ? extends ib<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$0x -> $$0x.a().toString(), $$1x -> "#" + $$1x.b() + " (" + a($$3) + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   private static int a(du $$0, ht $$1, Pair<ht, ? extends ib<?>> $$2, String $$3, boolean $$4, String $$5, Duration $$6) {
      ht $$7 = (ht)$$2.getFirst();
      int $$8 = $$4 ? ati.d(ati.c((float)$$1.j($$7))) : ati.d(a($$1.u(), $$1.w(), $$7.u(), $$7.w()));
      String $$9 = $$4 ? String.valueOf($$7.v()) : "~";
      ur $$10 = uu.a((ur)ur.a("chat.coordinates", $$7.u(), $$9, $$7.w()))
         .a($$2x -> $$2x.a(n.k).a(new up(up.a.d, "/tp @s " + $$7.u() + " " + $$9 + " " + $$7.w())).a(new ux(ux.a.a, ur.c("chat.coordinates.tooltip"))));
      $$0.a(() -> ur.a($$3, $$5, $$10, $$8), false);
      a.info("Locating element " + $$5 + " took " + $$6.toMillis() + " ms");
      return $$8;
   }

   private static float a(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$2 - $$0;
      int $$5 = $$3 - $$1;
      return ati.c((float)($$4 * $$4 + $$5 * $$5));
   }
}

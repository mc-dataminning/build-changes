import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class dtc {
   public static final int a = 8;
   private static final EnumSet<dvz.a> o = EnumSet.of(dvz.a.c, dvz.a.a);
   public static final EnumSet<dvz.a> b = EnumSet.of(dvz.a.d, dvz.a.b, dvz.a.e, dvz.a.f);
   public static final dtc c = a("empty", null, -1, false, o, dte.a, dtd::a, dtd::a);
   public static final dtc d = a("structure_starts", c, 0, false, o, dte.a, dtd::b, dtd::b);
   public static final dtc e = a("structure_references", d, 8, false, o, dte.a, dtd::c, dtd::a);
   public static final dtc f = a("biomes", e, 8, false, o, dte.a, dtd::d, dtd::a);
   public static final dtc g = a("noise", f, 8, false, o, dte.a, dtd::e, dtd::a);
   public static final dtc h = a("surface", g, 8, false, o, dte.a, dtd::f, dtd::a);
   public static final dtc i = a("carvers", h, 8, false, b, dte.a, dtd::g, dtd::a);
   public static final dtc j = a("features", i, 8, false, b, dte.a, dtd::h, dtd::a);
   public static final dtc k = a("initialize_light", j, 0, false, b, dte.a, dtd::i, dtd::c);
   public static final dtc l = a("light", k, 1, true, b, dte.a, dtd::j, dtd::d);
   public static final dtc m = a("spawn", l, 1, false, b, dte.a, dtd::k, dtd::a);
   public static final dtc n = a("full", m, 0, false, b, dte.b, dtd::l, dtd::e);
   private static final List<dtc> p = ImmutableList.of(n, k, i, f, d, d, d, d, d, d, d, d, new dtc[0]);
   private static final IntList q = ac.a(new IntArrayList(a().size()), $$0 -> {
      int $$1 = 0;

      for (int $$2 = a().size() - 1; $$2 >= 0; $$2--) {
         while ($$1 + 1 < p.size() && $$2 <= p.get($$1 + 1).c()) {
            $$1++;
         }

         $$0.add(0, $$1);
      }
   });
   private final int r;
   private final dtc s;
   private final dtc.a t;
   private final dtc.b u;
   private final int v;
   private final boolean w;
   private final dte x;
   private final EnumSet<dvz.a> y;

   private static dtc a(String $$0, @Nullable dtc $$1, int $$2, boolean $$3, EnumSet<dvz.a> $$4, dte $$5, dtc.a $$6, dtc.b $$7) {
      return jj.a(ld.n, $$0, new dtc($$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public static List<dtc> a() {
      List<dtc> $$0 = Lists.newArrayList();

      dtc $$1;
      for ($$1 = n; $$1.d() != $$1; $$1 = $$1.d()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   public static dtc a(int $$0) {
      if ($$0 >= p.size()) {
         return c;
      } else {
         return $$0 < 0 ? n : p.get($$0);
      }
   }

   public static int b() {
      return p.size();
   }

   public static int a(dtc $$0) {
      return q.getInt($$0.c());
   }

   dtc(@Nullable dtc $$0, int $$1, boolean $$2, EnumSet<dvz.a> $$3, dte $$4, dtc.a $$5, dtc.b $$6) {
      this.s = $$0 == null ? this : $$0;
      this.t = $$5;
      this.u = $$6;
      this.v = $$1;
      this.w = $$2;
      this.x = $$4;
      this.y = $$3;
      this.r = $$0 == null ? 0 : $$0.c() + 1;
   }

   public int c() {
      return this.r;
   }

   public dtc d() {
      return this.s;
   }

   public CompletableFuture<dsd> a(dtg $$0, Executor $$1, dtf $$2, List<dsd> $$3) {
      dsd $$4 = $$3.get($$3.size() / 2);
      bmj $$5 = bmg.f.a($$4.f(), $$0.a().ae(), this.toString());
      return this.t.doWork($$0, this, $$1, $$2, $$3, $$4).thenApply($$1x -> {
         if ($$1x instanceof dsx $$2x && !$$2x.j().b(this)) {
            $$2x.a(this);
         }

         if ($$5 != null) {
            $$5.finish();
         }

         return $$1x;
      });
   }

   public CompletableFuture<dsd> a(dtg $$0, dtf $$1, dsd $$2) {
      return this.u.doWork($$0, this, $$1, $$2);
   }

   public int e() {
      return this.v;
   }

   public boolean f() {
      return this.w;
   }

   public dte g() {
      return this.x;
   }

   public static dtc a(String $$0) {
      return ld.n.a(akh.a($$0));
   }

   public EnumSet<dvz.a> h() {
      return this.y;
   }

   public boolean b(dtc $$0) {
      return this.c() >= $$0.c();
   }

   @Override
   public String toString() {
      return ld.n.b(this).toString();
   }

   @FunctionalInterface
   protected interface a {
      CompletableFuture<dsd> doWork(dtg var1, dtc var2, Executor var3, dtf var4, List<dsd> var5, dsd var6);
   }

   @FunctionalInterface
   protected interface b {
      CompletableFuture<dsd> doWork(dtg var1, dtc var2, dtf var3, dsd var4);
   }
}

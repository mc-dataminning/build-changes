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

public class duy {
   public static final int a = 8;
   private static final EnumSet<dxv.a> o = EnumSet.of(dxv.a.c, dxv.a.a);
   public static final EnumSet<dxv.a> b = EnumSet.of(dxv.a.d, dxv.a.b, dxv.a.e, dxv.a.f);
   public static final duy c = a("empty", null, -1, false, o, dva.a, duz::a, duz::a);
   public static final duy d = a("structure_starts", c, 0, false, o, dva.a, duz::b, duz::b);
   public static final duy e = a("structure_references", d, 8, false, o, dva.a, duz::c, duz::a);
   public static final duy f = a("biomes", e, 8, false, o, dva.a, duz::d, duz::a);
   public static final duy g = a("noise", f, 8, false, o, dva.a, duz::e, duz::a);
   public static final duy h = a("surface", g, 8, false, o, dva.a, duz::f, duz::a);
   public static final duy i = a("carvers", h, 8, false, b, dva.a, duz::g, duz::a);
   public static final duy j = a("features", i, 8, false, b, dva.a, duz::h, duz::a);
   public static final duy k = a("initialize_light", j, 0, false, b, dva.a, duz::i, duz::c);
   public static final duy l = a("light", k, 1, true, b, dva.a, duz::j, duz::d);
   public static final duy m = a("spawn", l, 1, false, b, dva.a, duz::k, duz::a);
   public static final duy n = a("full", m, 0, false, b, dva.b, duz::l, duz::e);
   private static final List<duy> p = ImmutableList.of(n, k, i, f, d, d, d, d, d, d, d, d, new duy[0]);
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
   private final duy s;
   private final duy.a t;
   private final duy.b u;
   private final int v;
   private final boolean w;
   private final dva x;
   private final EnumSet<dxv.a> y;

   private static duy a(String $$0, @Nullable duy $$1, int $$2, boolean $$3, EnumSet<dxv.a> $$4, dva $$5, duy.a $$6, duy.b $$7) {
      return jv.a(lp.n, $$0, new duy($$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public static List<duy> a() {
      List<duy> $$0 = Lists.newArrayList();

      duy $$1;
      for ($$1 = n; $$1.d() != $$1; $$1 = $$1.d()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   public static duy a(int $$0) {
      if ($$0 >= p.size()) {
         return c;
      } else {
         return $$0 < 0 ? n : p.get($$0);
      }
   }

   public static int b() {
      return p.size();
   }

   public static int a(duy $$0) {
      return q.getInt($$0.c());
   }

   duy(@Nullable duy $$0, int $$1, boolean $$2, EnumSet<dxv.a> $$3, dva $$4, duy.a $$5, duy.b $$6) {
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

   public duy d() {
      return this.s;
   }

   public CompletableFuture<dtz> a(dvc $$0, Executor $$1, dvb $$2, List<dtz> $$3) {
      dtz $$4 = $$3.get($$3.size() / 2);
      bns $$5 = bnp.f.a($$4.f(), $$0.a().af(), this.toString());
      return this.t.doWork($$0, this, $$1, $$2, $$3, $$4).thenApply($$1x -> {
         if ($$1x instanceof dut $$2x && !$$2x.j().b(this)) {
            $$2x.a(this);
         }

         if ($$5 != null) {
            $$5.finish();
         }

         return $$1x;
      });
   }

   public CompletableFuture<dtz> a(dvc $$0, dvb $$1, dtz $$2) {
      return this.u.doWork($$0, this, $$1, $$2);
   }

   public int e() {
      return this.v;
   }

   public boolean f() {
      return this.w;
   }

   public dva g() {
      return this.x;
   }

   public static duy a(String $$0) {
      return lp.n.a(alf.a($$0));
   }

   public EnumSet<dxv.a> h() {
      return this.y;
   }

   public boolean b(duy $$0) {
      return this.c() >= $$0.c();
   }

   @Override
   public String toString() {
      return lp.n.b(this).toString();
   }

   @FunctionalInterface
   protected interface a {
      CompletableFuture<dtz> doWork(dvc var1, duy var2, Executor var3, dvb var4, List<dtz> var5, dtz var6);
   }

   @FunctionalInterface
   protected interface b {
      CompletableFuture<dtz> doWork(dvc var1, duy var2, dvb var3, dtz var4);
   }
}

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

public class duw {
   public static final int a = 8;
   private static final EnumSet<dxt.a> o = EnumSet.of(dxt.a.c, dxt.a.a);
   public static final EnumSet<dxt.a> b = EnumSet.of(dxt.a.d, dxt.a.b, dxt.a.e, dxt.a.f);
   public static final duw c = a("empty", null, -1, false, o, duy.a, dux::a, dux::a);
   public static final duw d = a("structure_starts", c, 0, false, o, duy.a, dux::b, dux::b);
   public static final duw e = a("structure_references", d, 8, false, o, duy.a, dux::c, dux::a);
   public static final duw f = a("biomes", e, 8, false, o, duy.a, dux::d, dux::a);
   public static final duw g = a("noise", f, 8, false, o, duy.a, dux::e, dux::a);
   public static final duw h = a("surface", g, 8, false, o, duy.a, dux::f, dux::a);
   public static final duw i = a("carvers", h, 8, false, b, duy.a, dux::g, dux::a);
   public static final duw j = a("features", i, 8, false, b, duy.a, dux::h, dux::a);
   public static final duw k = a("initialize_light", j, 0, false, b, duy.a, dux::i, dux::c);
   public static final duw l = a("light", k, 1, true, b, duy.a, dux::j, dux::d);
   public static final duw m = a("spawn", l, 1, false, b, duy.a, dux::k, dux::a);
   public static final duw n = a("full", m, 0, false, b, duy.b, dux::l, dux::e);
   private static final List<duw> p = ImmutableList.of(n, k, i, f, d, d, d, d, d, d, d, d, new duw[0]);
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
   private final duw s;
   private final duw.a t;
   private final duw.b u;
   private final int v;
   private final boolean w;
   private final duy x;
   private final EnumSet<dxt.a> y;

   private static duw a(String $$0, @Nullable duw $$1, int $$2, boolean $$3, EnumSet<dxt.a> $$4, duy $$5, duw.a $$6, duw.b $$7) {
      return jv.a(lp.n, $$0, new duw($$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public static List<duw> a() {
      List<duw> $$0 = Lists.newArrayList();

      duw $$1;
      for ($$1 = n; $$1.d() != $$1; $$1 = $$1.d()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   public static duw a(int $$0) {
      if ($$0 >= p.size()) {
         return c;
      } else {
         return $$0 < 0 ? n : p.get($$0);
      }
   }

   public static int b() {
      return p.size();
   }

   public static int a(duw $$0) {
      return q.getInt($$0.c());
   }

   duw(@Nullable duw $$0, int $$1, boolean $$2, EnumSet<dxt.a> $$3, duy $$4, duw.a $$5, duw.b $$6) {
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

   public duw d() {
      return this.s;
   }

   public CompletableFuture<dtx> a(dva $$0, Executor $$1, duz $$2, List<dtx> $$3) {
      dtx $$4 = $$3.get($$3.size() / 2);
      bnq $$5 = bnn.f.a($$4.f(), $$0.a().af(), this.toString());
      return this.t.doWork($$0, this, $$1, $$2, $$3, $$4).thenApply($$1x -> {
         if ($$1x instanceof dur $$2x && !$$2x.j().b(this)) {
            $$2x.a(this);
         }

         if ($$5 != null) {
            $$5.finish();
         }

         return $$1x;
      });
   }

   public CompletableFuture<dtx> a(dva $$0, duz $$1, dtx $$2) {
      return this.u.doWork($$0, this, $$1, $$2);
   }

   public int e() {
      return this.v;
   }

   public boolean f() {
      return this.w;
   }

   public duy g() {
      return this.x;
   }

   public static duw a(String $$0) {
      return lp.n.a(ale.a($$0));
   }

   public EnumSet<dxt.a> h() {
      return this.y;
   }

   public boolean b(duw $$0) {
      return this.c() >= $$0.c();
   }

   @Override
   public String toString() {
      return lp.n.b(this).toString();
   }

   @FunctionalInterface
   protected interface a {
      CompletableFuture<dtx> doWork(dva var1, duw var2, Executor var3, duz var4, List<dtx> var5, dtx var6);
   }

   @FunctionalInterface
   protected interface b {
      CompletableFuture<dtx> doWork(dva var1, duw var2, duz var3, dtx var4);
   }
}

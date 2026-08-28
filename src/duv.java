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

public class duv {
   public static final int a = 8;
   private static final EnumSet<dxs.a> o = EnumSet.of(dxs.a.c, dxs.a.a);
   public static final EnumSet<dxs.a> b = EnumSet.of(dxs.a.d, dxs.a.b, dxs.a.e, dxs.a.f);
   public static final duv c = a("empty", null, -1, false, o, dux.a, duw::a, duw::a);
   public static final duv d = a("structure_starts", c, 0, false, o, dux.a, duw::b, duw::b);
   public static final duv e = a("structure_references", d, 8, false, o, dux.a, duw::c, duw::a);
   public static final duv f = a("biomes", e, 8, false, o, dux.a, duw::d, duw::a);
   public static final duv g = a("noise", f, 8, false, o, dux.a, duw::e, duw::a);
   public static final duv h = a("surface", g, 8, false, o, dux.a, duw::f, duw::a);
   public static final duv i = a("carvers", h, 8, false, b, dux.a, duw::g, duw::a);
   public static final duv j = a("features", i, 8, false, b, dux.a, duw::h, duw::a);
   public static final duv k = a("initialize_light", j, 0, false, b, dux.a, duw::i, duw::c);
   public static final duv l = a("light", k, 1, true, b, dux.a, duw::j, duw::d);
   public static final duv m = a("spawn", l, 1, false, b, dux.a, duw::k, duw::a);
   public static final duv n = a("full", m, 0, false, b, dux.b, duw::l, duw::e);
   private static final List<duv> p = ImmutableList.of(n, k, i, f, d, d, d, d, d, d, d, d, new duv[0]);
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
   private final duv s;
   private final duv.a t;
   private final duv.b u;
   private final int v;
   private final boolean w;
   private final dux x;
   private final EnumSet<dxs.a> y;

   private static duv a(String $$0, @Nullable duv $$1, int $$2, boolean $$3, EnumSet<dxs.a> $$4, dux $$5, duv.a $$6, duv.b $$7) {
      return jv.a(lp.n, $$0, new duv($$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public static List<duv> a() {
      List<duv> $$0 = Lists.newArrayList();

      duv $$1;
      for ($$1 = n; $$1.d() != $$1; $$1 = $$1.d()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   public static duv a(int $$0) {
      if ($$0 >= p.size()) {
         return c;
      } else {
         return $$0 < 0 ? n : p.get($$0);
      }
   }

   public static int b() {
      return p.size();
   }

   public static int a(duv $$0) {
      return q.getInt($$0.c());
   }

   duv(@Nullable duv $$0, int $$1, boolean $$2, EnumSet<dxs.a> $$3, dux $$4, duv.a $$5, duv.b $$6) {
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

   public duv d() {
      return this.s;
   }

   public CompletableFuture<dtw> a(duz $$0, Executor $$1, duy $$2, List<dtw> $$3) {
      dtw $$4 = $$3.get($$3.size() / 2);
      bnp $$5 = bnm.f.a($$4.f(), $$0.a().af(), this.toString());
      return this.t.doWork($$0, this, $$1, $$2, $$3, $$4).thenApply($$1x -> {
         if ($$1x instanceof duq $$2x && !$$2x.j().b(this)) {
            $$2x.a(this);
         }

         if ($$5 != null) {
            $$5.finish();
         }

         return $$1x;
      });
   }

   public CompletableFuture<dtw> a(duz $$0, duy $$1, dtw $$2) {
      return this.u.doWork($$0, this, $$1, $$2);
   }

   public int e() {
      return this.v;
   }

   public boolean f() {
      return this.w;
   }

   public dux g() {
      return this.x;
   }

   public static duv a(String $$0) {
      return lp.n.a(ale.a($$0));
   }

   public EnumSet<dxs.a> h() {
      return this.y;
   }

   public boolean b(duv $$0) {
      return this.c() >= $$0.c();
   }

   @Override
   public String toString() {
      return lp.n.b(this).toString();
   }

   @FunctionalInterface
   protected interface a {
      CompletableFuture<dtw> doWork(duz var1, duv var2, Executor var3, duy var4, List<dtw> var5, dtw var6);
   }

   @FunctionalInterface
   protected interface b {
      CompletableFuture<dtw> doWork(duz var1, duv var2, duy var3, dtw var4);
   }
}

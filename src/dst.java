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

public class dst {
   public static final int a = 8;
   private static final EnumSet<dvq.a> o = EnumSet.of(dvq.a.c, dvq.a.a);
   public static final EnumSet<dvq.a> b = EnumSet.of(dvq.a.d, dvq.a.b, dvq.a.e, dvq.a.f);
   public static final dst c = a("empty", null, -1, false, o, dsv.a, dsu::a, dsu::a);
   public static final dst d = a("structure_starts", c, 0, false, o, dsv.a, dsu::b, dsu::b);
   public static final dst e = a("structure_references", d, 8, false, o, dsv.a, dsu::c, dsu::a);
   public static final dst f = a("biomes", e, 8, false, o, dsv.a, dsu::d, dsu::a);
   public static final dst g = a("noise", f, 8, false, o, dsv.a, dsu::e, dsu::a);
   public static final dst h = a("surface", g, 8, false, o, dsv.a, dsu::f, dsu::a);
   public static final dst i = a("carvers", h, 8, false, b, dsv.a, dsu::g, dsu::a);
   public static final dst j = a("features", i, 8, false, b, dsv.a, dsu::h, dsu::a);
   public static final dst k = a("initialize_light", j, 0, false, b, dsv.a, dsu::i, dsu::c);
   public static final dst l = a("light", k, 1, true, b, dsv.a, dsu::j, dsu::d);
   public static final dst m = a("spawn", l, 1, false, b, dsv.a, dsu::k, dsu::a);
   public static final dst n = a("full", m, 0, false, b, dsv.b, dsu::l, dsu::e);
   private static final List<dst> p = ImmutableList.of(n, k, i, f, d, d, d, d, d, d, d, d, new dst[0]);
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
   private final dst s;
   private final dst.a t;
   private final dst.b u;
   private final int v;
   private final boolean w;
   private final dsv x;
   private final EnumSet<dvq.a> y;

   private static dst a(String $$0, @Nullable dst $$1, int $$2, boolean $$3, EnumSet<dvq.a> $$4, dsv $$5, dst.a $$6, dst.b $$7) {
      return ji.a(lc.n, $$0, new dst($$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public static List<dst> a() {
      List<dst> $$0 = Lists.newArrayList();

      dst $$1;
      for ($$1 = n; $$1.d() != $$1; $$1 = $$1.d()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   public static dst a(int $$0) {
      if ($$0 >= p.size()) {
         return c;
      } else {
         return $$0 < 0 ? n : p.get($$0);
      }
   }

   public static int b() {
      return p.size();
   }

   public static int a(dst $$0) {
      return q.getInt($$0.c());
   }

   dst(@Nullable dst $$0, int $$1, boolean $$2, EnumSet<dvq.a> $$3, dsv $$4, dst.a $$5, dst.b $$6) {
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

   public dst d() {
      return this.s;
   }

   public CompletableFuture<dru> a(dsx $$0, Executor $$1, dsw $$2, List<dru> $$3) {
      dru $$4 = $$3.get($$3.size() / 2);
      bln $$5 = blk.f.a($$4.f(), $$0.a().ae(), this.toString());
      return this.t.doWork($$0, this, $$1, $$2, $$3, $$4).thenApply($$1x -> {
         if ($$1x instanceof dso $$2x && !$$2x.j().b(this)) {
            $$2x.a(this);
         }

         if ($$5 != null) {
            $$5.finish();
         }

         return $$1x;
      });
   }

   public CompletableFuture<dru> a(dsx $$0, dsw $$1, dru $$2) {
      return this.u.doWork($$0, this, $$1, $$2);
   }

   public int e() {
      return this.v;
   }

   public boolean f() {
      return this.w;
   }

   public dsv g() {
      return this.x;
   }

   public static dst a(String $$0) {
      return lc.n.a(akf.a($$0));
   }

   public EnumSet<dvq.a> h() {
      return this.y;
   }

   public boolean b(dst $$0) {
      return this.c() >= $$0.c();
   }

   @Override
   public String toString() {
      return lc.n.b(this).toString();
   }

   @FunctionalInterface
   protected interface a {
      CompletableFuture<dru> doWork(dsx var1, dst var2, Executor var3, dsw var4, List<dru> var5, dru var6);
   }

   @FunctionalInterface
   protected interface b {
      CompletableFuture<dru> doWork(dsx var1, dst var2, dsw var3, dru var4);
   }
}

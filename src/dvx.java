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

public class dvx {
   public static final int a = 8;
   private static final EnumSet<dyu.a> o = EnumSet.of(dyu.a.c, dyu.a.a);
   public static final EnumSet<dyu.a> b = EnumSet.of(dyu.a.d, dyu.a.b, dyu.a.e, dyu.a.f);
   public static final dvx c = a("empty", null, -1, false, o, dvz.a, dvy::a, dvy::a);
   public static final dvx d = a("structure_starts", c, 0, false, o, dvz.a, dvy::b, dvy::b);
   public static final dvx e = a("structure_references", d, 8, false, o, dvz.a, dvy::c, dvy::a);
   public static final dvx f = a("biomes", e, 8, false, o, dvz.a, dvy::d, dvy::a);
   public static final dvx g = a("noise", f, 8, false, o, dvz.a, dvy::e, dvy::a);
   public static final dvx h = a("surface", g, 8, false, o, dvz.a, dvy::f, dvy::a);
   public static final dvx i = a("carvers", h, 8, false, b, dvz.a, dvy::g, dvy::a);
   public static final dvx j = a("features", i, 8, false, b, dvz.a, dvy::h, dvy::a);
   public static final dvx k = a("initialize_light", j, 0, false, b, dvz.a, dvy::i, dvy::c);
   public static final dvx l = a("light", k, 1, true, b, dvz.a, dvy::j, dvy::d);
   public static final dvx m = a("spawn", l, 1, false, b, dvz.a, dvy::k, dvy::a);
   public static final dvx n = a("full", m, 0, false, b, dvz.b, dvy::l, dvy::e);
   private static final List<dvx> p = ImmutableList.of(n, k, i, f, d, d, d, d, d, d, d, d, new dvx[0]);
   private static final IntList q = ad.a(new IntArrayList(a().size()), $$0 -> {
      int $$1 = 0;

      for (int $$2 = a().size() - 1; $$2 >= 0; $$2--) {
         while ($$1 + 1 < p.size() && $$2 <= p.get($$1 + 1).c()) {
            $$1++;
         }

         $$0.add(0, $$1);
      }
   });
   private final int r;
   private final dvx s;
   private final dvx.a t;
   private final dvx.b u;
   private final int v;
   private final boolean w;
   private final dvz x;
   private final EnumSet<dyu.a> y;

   private static dvx a(String $$0, @Nullable dvx $$1, int $$2, boolean $$3, EnumSet<dyu.a> $$4, dvz $$5, dvx.a $$6, dvx.b $$7) {
      return jn.a(lh.n, $$0, new dvx($$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public static List<dvx> a() {
      List<dvx> $$0 = Lists.newArrayList();

      dvx $$1;
      for ($$1 = n; $$1.d() != $$1; $$1 = $$1.d()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   public static dvx a(int $$0) {
      if ($$0 >= p.size()) {
         return c;
      } else {
         return $$0 < 0 ? n : p.get($$0);
      }
   }

   public static int b() {
      return p.size();
   }

   public static int a(dvx $$0) {
      return q.getInt($$0.c());
   }

   dvx(@Nullable dvx $$0, int $$1, boolean $$2, EnumSet<dyu.a> $$3, dvz $$4, dvx.a $$5, dvx.b $$6) {
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

   public dvx d() {
      return this.s;
   }

   public CompletableFuture<duy> a(dwb $$0, Executor $$1, dwa $$2, List<duy> $$3) {
      duy $$4 = $$3.get($$3.size() / 2);
      bmx $$5 = bmu.f.a($$4.g(), $$0.a().af(), this.toString());
      return this.t.doWork($$0, this, $$1, $$2, $$3, $$4).thenApply($$1x -> {
         if ($$1x instanceof dvs $$2x && !$$2x.k().b(this)) {
            $$2x.a(this);
         }

         if ($$5 != null) {
            $$5.finish();
         }

         return $$1x;
      });
   }

   public CompletableFuture<duy> a(dwb $$0, dwa $$1, duy $$2) {
      return this.u.doWork($$0, this, $$1, $$2);
   }

   public int e() {
      return this.v;
   }

   public boolean f() {
      return this.w;
   }

   public dvz g() {
      return this.x;
   }

   public static dvx a(String $$0) {
      return lh.n.a(akt.a($$0));
   }

   public EnumSet<dyu.a> h() {
      return this.y;
   }

   public boolean b(dvx $$0) {
      return this.c() >= $$0.c();
   }

   @Override
   public String toString() {
      return lh.n.b(this).toString();
   }

   @FunctionalInterface
   protected interface a {
      CompletableFuture<duy> doWork(dwb var1, dvx var2, Executor var3, dwa var4, List<duy> var5, duy var6);
   }

   @FunctionalInterface
   protected interface b {
      CompletableFuture<duy> doWork(dwb var1, dvx var2, dwa var3, duy var4);
   }
}

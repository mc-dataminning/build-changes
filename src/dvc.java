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

public class dvc {
   public static final int a = 8;
   private static final EnumSet<dxz.a> o = EnumSet.of(dxz.a.c, dxz.a.a);
   public static final EnumSet<dxz.a> b = EnumSet.of(dxz.a.d, dxz.a.b, dxz.a.e, dxz.a.f);
   public static final dvc c = a("empty", null, -1, false, o, dve.a, dvd::a, dvd::a);
   public static final dvc d = a("structure_starts", c, 0, false, o, dve.a, dvd::b, dvd::b);
   public static final dvc e = a("structure_references", d, 8, false, o, dve.a, dvd::c, dvd::a);
   public static final dvc f = a("biomes", e, 8, false, o, dve.a, dvd::d, dvd::a);
   public static final dvc g = a("noise", f, 8, false, o, dve.a, dvd::e, dvd::a);
   public static final dvc h = a("surface", g, 8, false, o, dve.a, dvd::f, dvd::a);
   public static final dvc i = a("carvers", h, 8, false, b, dve.a, dvd::g, dvd::a);
   public static final dvc j = a("features", i, 8, false, b, dve.a, dvd::h, dvd::a);
   public static final dvc k = a("initialize_light", j, 0, false, b, dve.a, dvd::i, dvd::c);
   public static final dvc l = a("light", k, 1, true, b, dve.a, dvd::j, dvd::d);
   public static final dvc m = a("spawn", l, 1, false, b, dve.a, dvd::k, dvd::a);
   public static final dvc n = a("full", m, 0, false, b, dve.b, dvd::l, dvd::e);
   private static final List<dvc> p = ImmutableList.of(n, k, i, f, d, d, d, d, d, d, d, d, new dvc[0]);
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
   private final dvc s;
   private final dvc.a t;
   private final dvc.b u;
   private final int v;
   private final boolean w;
   private final dve x;
   private final EnumSet<dxz.a> y;

   private static dvc a(String $$0, @Nullable dvc $$1, int $$2, boolean $$3, EnumSet<dxz.a> $$4, dve $$5, dvc.a $$6, dvc.b $$7) {
      return jw.a(lq.l, $$0, new dvc($$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public static List<dvc> a() {
      List<dvc> $$0 = Lists.newArrayList();

      dvc $$1;
      for ($$1 = n; $$1.d() != $$1; $$1 = $$1.d()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   public static dvc a(int $$0) {
      if ($$0 >= p.size()) {
         return c;
      } else {
         return $$0 < 0 ? n : p.get($$0);
      }
   }

   public static int b() {
      return p.size();
   }

   public static int a(dvc $$0) {
      return q.getInt($$0.c());
   }

   dvc(@Nullable dvc $$0, int $$1, boolean $$2, EnumSet<dxz.a> $$3, dve $$4, dvc.a $$5, dvc.b $$6) {
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

   public dvc d() {
      return this.s;
   }

   public CompletableFuture<dud> a(dvg $$0, Executor $$1, dvf $$2, List<dud> $$3) {
      dud $$4 = $$3.get($$3.size() / 2);
      bna $$5 = bmx.f.a($$4.f(), $$0.a().af(), this.toString());
      return this.t.doWork($$0, this, $$1, $$2, $$3, $$4).thenApply($$1x -> {
         if ($$1x instanceof dux $$2x && !$$2x.j().b(this)) {
            $$2x.a(this);
         }

         if ($$5 != null) {
            $$5.finish();
         }

         return $$1x;
      });
   }

   public CompletableFuture<dud> a(dvg $$0, dvf $$1, dud $$2) {
      return this.u.doWork($$0, this, $$1, $$2);
   }

   public int e() {
      return this.v;
   }

   public boolean f() {
      return this.w;
   }

   public dve g() {
      return this.x;
   }

   public static dvc a(String $$0) {
      return lq.l.a(akk.a($$0));
   }

   public EnumSet<dxz.a> h() {
      return this.y;
   }

   public boolean b(dvc $$0) {
      return this.c() >= $$0.c();
   }

   @Override
   public String toString() {
      return lq.l.b(this).toString();
   }

   @FunctionalInterface
   protected interface a {
      CompletableFuture<dud> doWork(dvg var1, dvc var2, Executor var3, dvf var4, List<dud> var5, dud var6);
   }

   @FunctionalInterface
   protected interface b {
      CompletableFuture<dud> doWork(dvg var1, dvc var2, dvf var3, dud var4);
   }
}

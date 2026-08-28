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

public class duz {
   public static final int a = 8;
   private static final EnumSet<dxw.a> o = EnumSet.of(dxw.a.c, dxw.a.a);
   public static final EnumSet<dxw.a> b = EnumSet.of(dxw.a.d, dxw.a.b, dxw.a.e, dxw.a.f);
   public static final duz c = a("empty", null, -1, false, o, dvb.a, dva::a, dva::a);
   public static final duz d = a("structure_starts", c, 0, false, o, dvb.a, dva::b, dva::b);
   public static final duz e = a("structure_references", d, 8, false, o, dvb.a, dva::c, dva::a);
   public static final duz f = a("biomes", e, 8, false, o, dvb.a, dva::d, dva::a);
   public static final duz g = a("noise", f, 8, false, o, dvb.a, dva::e, dva::a);
   public static final duz h = a("surface", g, 8, false, o, dvb.a, dva::f, dva::a);
   public static final duz i = a("carvers", h, 8, false, b, dvb.a, dva::g, dva::a);
   public static final duz j = a("features", i, 8, false, b, dvb.a, dva::h, dva::a);
   public static final duz k = a("initialize_light", j, 0, false, b, dvb.a, dva::i, dva::c);
   public static final duz l = a("light", k, 1, true, b, dvb.a, dva::j, dva::d);
   public static final duz m = a("spawn", l, 1, false, b, dvb.a, dva::k, dva::a);
   public static final duz n = a("full", m, 0, false, b, dvb.b, dva::l, dva::e);
   private static final List<duz> p = ImmutableList.of(n, k, i, f, d, d, d, d, d, d, d, d, new duz[0]);
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
   private final duz s;
   private final duz.a t;
   private final duz.b u;
   private final int v;
   private final boolean w;
   private final dvb x;
   private final EnumSet<dxw.a> y;

   private static duz a(String $$0, @Nullable duz $$1, int $$2, boolean $$3, EnumSet<dxw.a> $$4, dvb $$5, duz.a $$6, duz.b $$7) {
      return jv.a(lp.n, $$0, new duz($$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public static List<duz> a() {
      List<duz> $$0 = Lists.newArrayList();

      duz $$1;
      for ($$1 = n; $$1.d() != $$1; $$1 = $$1.d()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   public static duz a(int $$0) {
      if ($$0 >= p.size()) {
         return c;
      } else {
         return $$0 < 0 ? n : p.get($$0);
      }
   }

   public static int b() {
      return p.size();
   }

   public static int a(duz $$0) {
      return q.getInt($$0.c());
   }

   duz(@Nullable duz $$0, int $$1, boolean $$2, EnumSet<dxw.a> $$3, dvb $$4, duz.a $$5, duz.b $$6) {
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

   public duz d() {
      return this.s;
   }

   public CompletableFuture<dua> a(dvd $$0, Executor $$1, dvc $$2, List<dua> $$3) {
      dua $$4 = $$3.get($$3.size() / 2);
      bnt $$5 = bnq.f.a($$4.f(), $$0.a().af(), this.toString());
      return this.t.doWork($$0, this, $$1, $$2, $$3, $$4).thenApply($$1x -> {
         if ($$1x instanceof duu $$2x && !$$2x.j().b(this)) {
            $$2x.a(this);
         }

         if ($$5 != null) {
            $$5.finish();
         }

         return $$1x;
      });
   }

   public CompletableFuture<dua> a(dvd $$0, dvc $$1, dua $$2) {
      return this.u.doWork($$0, this, $$1, $$2);
   }

   public int e() {
      return this.v;
   }

   public boolean f() {
      return this.w;
   }

   public dvb g() {
      return this.x;
   }

   public static duz a(String $$0) {
      return lp.n.a(alf.a($$0));
   }

   public EnumSet<dxw.a> h() {
      return this.y;
   }

   public boolean b(duz $$0) {
      return this.c() >= $$0.c();
   }

   @Override
   public String toString() {
      return lp.n.b(this).toString();
   }

   @FunctionalInterface
   protected interface a {
      CompletableFuture<dua> doWork(dvd var1, duz var2, Executor var3, dvc var4, List<dua> var5, dua var6);
   }

   @FunctionalInterface
   protected interface b {
      CompletableFuture<dua> doWork(dvd var1, duz var2, dvc var3, dua var4);
   }
}

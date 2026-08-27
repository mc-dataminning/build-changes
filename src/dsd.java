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

public class dsd {
   public static final int a = 8;
   private static final EnumSet<dva.a> o = EnumSet.of(dva.a.c, dva.a.a);
   public static final EnumSet<dva.a> b = EnumSet.of(dva.a.d, dva.a.b, dva.a.e, dva.a.f);
   public static final dsd c = a("empty", null, -1, false, o, dsf.a, dse::a, dse::a);
   public static final dsd d = a("structure_starts", c, 0, false, o, dsf.a, dse::b, dse::b);
   public static final dsd e = a("structure_references", d, 8, false, o, dsf.a, dse::c, dse::a);
   public static final dsd f = a("biomes", e, 8, false, o, dsf.a, dse::d, dse::a);
   public static final dsd g = a("noise", f, 8, false, o, dsf.a, dse::e, dse::a);
   public static final dsd h = a("surface", g, 8, false, o, dsf.a, dse::f, dse::a);
   public static final dsd i = a("carvers", h, 8, false, b, dsf.a, dse::g, dse::a);
   public static final dsd j = a("features", i, 8, false, b, dsf.a, dse::h, dse::a);
   public static final dsd k = a("initialize_light", j, 0, false, b, dsf.a, dse::i, dse::c);
   public static final dsd l = a("light", k, 1, true, b, dsf.a, dse::j, dse::d);
   public static final dsd m = a("spawn", l, 1, false, b, dsf.a, dse::k, dse::a);
   public static final dsd n = a("full", m, 0, false, b, dsf.b, dse::l, dse::e);
   private static final List<dsd> p = ImmutableList.of(n, k, i, f, d, d, d, d, d, d, d, d, new dsd[0]);
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
   private final dsd s;
   private final dsd.a t;
   private final dsd.b u;
   private final int v;
   private final boolean w;
   private final dsf x;
   private final EnumSet<dva.a> y;

   private static dsd a(String $$0, @Nullable dsd $$1, int $$2, boolean $$3, EnumSet<dva.a> $$4, dsf $$5, dsd.a $$6, dsd.b $$7) {
      return ja.a(kt.n, $$0, new dsd($$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public static List<dsd> a() {
      List<dsd> $$0 = Lists.newArrayList();

      dsd $$1;
      for ($$1 = n; $$1.d() != $$1; $$1 = $$1.d()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   public static dsd a(int $$0) {
      if ($$0 >= p.size()) {
         return c;
      } else {
         return $$0 < 0 ? n : p.get($$0);
      }
   }

   public static int b() {
      return p.size();
   }

   public static int a(dsd $$0) {
      return q.getInt($$0.c());
   }

   dsd(@Nullable dsd $$0, int $$1, boolean $$2, EnumSet<dva.a> $$3, dsf $$4, dsd.a $$5, dsd.b $$6) {
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

   public dsd d() {
      return this.s;
   }

   public CompletableFuture<dre> a(dsh $$0, Executor $$1, dsg $$2, List<dre> $$3) {
      dre $$4 = $$3.get($$3.size() / 2);
      blc $$5 = bkz.f.a($$4.f(), $$0.a().ae(), this.toString());
      return this.t.doWork($$0, this, $$1, $$2, $$3, $$4).thenApply($$1x -> {
         if ($$1x instanceof dry $$2x && !$$2x.j().b(this)) {
            $$2x.a(this);
         }

         if ($$5 != null) {
            $$5.finish();
         }

         return $$1x;
      });
   }

   public CompletableFuture<dre> a(dsh $$0, dsg $$1, dre $$2) {
      return this.u.doWork($$0, this, $$1, $$2);
   }

   public int e() {
      return this.v;
   }

   public boolean f() {
      return this.w;
   }

   public dsf g() {
      return this.x;
   }

   public static dsd a(String $$0) {
      return kt.n.a(ajv.a($$0));
   }

   public EnumSet<dva.a> h() {
      return this.y;
   }

   public boolean b(dsd $$0) {
      return this.c() >= $$0.c();
   }

   @Override
   public String toString() {
      return kt.n.b(this).toString();
   }

   @FunctionalInterface
   protected interface a {
      CompletableFuture<dre> doWork(dsh var1, dsd var2, Executor var3, dsg var4, List<dre> var5, dre var6);
   }

   @FunctionalInterface
   protected interface b {
      CompletableFuture<dre> doWork(dsh var1, dsd var2, dsg var3, dre var4);
   }
}

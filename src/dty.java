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

public class dty {
   public static final int a = 8;
   private static final EnumSet<dwv.a> o = EnumSet.of(dwv.a.c, dwv.a.a);
   public static final EnumSet<dwv.a> b = EnumSet.of(dwv.a.d, dwv.a.b, dwv.a.e, dwv.a.f);
   public static final dty c = a("empty", null, -1, false, o, dua.a, dtz::a, dtz::a);
   public static final dty d = a("structure_starts", c, 0, false, o, dua.a, dtz::b, dtz::b);
   public static final dty e = a("structure_references", d, 8, false, o, dua.a, dtz::c, dtz::a);
   public static final dty f = a("biomes", e, 8, false, o, dua.a, dtz::d, dtz::a);
   public static final dty g = a("noise", f, 8, false, o, dua.a, dtz::e, dtz::a);
   public static final dty h = a("surface", g, 8, false, o, dua.a, dtz::f, dtz::a);
   public static final dty i = a("carvers", h, 8, false, b, dua.a, dtz::g, dtz::a);
   public static final dty j = a("features", i, 8, false, b, dua.a, dtz::h, dtz::a);
   public static final dty k = a("initialize_light", j, 0, false, b, dua.a, dtz::i, dtz::c);
   public static final dty l = a("light", k, 1, true, b, dua.a, dtz::j, dtz::d);
   public static final dty m = a("spawn", l, 1, false, b, dua.a, dtz::k, dtz::a);
   public static final dty n = a("full", m, 0, false, b, dua.b, dtz::l, dtz::e);
   private static final List<dty> p = ImmutableList.of(n, k, i, f, d, d, d, d, d, d, d, d, new dty[0]);
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
   private final dty s;
   private final dty.a t;
   private final dty.b u;
   private final int v;
   private final boolean w;
   private final dua x;
   private final EnumSet<dwv.a> y;

   private static dty a(String $$0, @Nullable dty $$1, int $$2, boolean $$3, EnumSet<dwv.a> $$4, dua $$5, dty.a $$6, dty.b $$7) {
      return jk.a(le.n, $$0, new dty($$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public static List<dty> a() {
      List<dty> $$0 = Lists.newArrayList();

      dty $$1;
      for ($$1 = n; $$1.d() != $$1; $$1 = $$1.d()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   public static dty a(int $$0) {
      if ($$0 >= p.size()) {
         return c;
      } else {
         return $$0 < 0 ? n : p.get($$0);
      }
   }

   public static int b() {
      return p.size();
   }

   public static int a(dty $$0) {
      return q.getInt($$0.c());
   }

   dty(@Nullable dty $$0, int $$1, boolean $$2, EnumSet<dwv.a> $$3, dua $$4, dty.a $$5, dty.b $$6) {
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

   public dty d() {
      return this.s;
   }

   public CompletableFuture<dsz> a(duc $$0, Executor $$1, dub $$2, List<dsz> $$3) {
      dsz $$4 = $$3.get($$3.size() / 2);
      bmt $$5 = bmq.f.a($$4.f(), $$0.a().ae(), this.toString());
      return this.t.doWork($$0, this, $$1, $$2, $$3, $$4).thenApply($$1x -> {
         if ($$1x instanceof dtt $$2x && !$$2x.j().b(this)) {
            $$2x.a(this);
         }

         if ($$5 != null) {
            $$5.finish();
         }

         return $$1x;
      });
   }

   public CompletableFuture<dsz> a(duc $$0, dub $$1, dsz $$2) {
      return this.u.doWork($$0, this, $$1, $$2);
   }

   public int e() {
      return this.v;
   }

   public boolean f() {
      return this.w;
   }

   public dua g() {
      return this.x;
   }

   public static dty a(String $$0) {
      return le.n.a(akn.a($$0));
   }

   public EnumSet<dwv.a> h() {
      return this.y;
   }

   public boolean b(dty $$0) {
      return this.c() >= $$0.c();
   }

   @Override
   public String toString() {
      return le.n.b(this).toString();
   }

   @FunctionalInterface
   protected interface a {
      CompletableFuture<dsz> doWork(duc var1, dty var2, Executor var3, dub var4, List<dsz> var5, dsz var6);
   }

   @FunctionalInterface
   protected interface b {
      CompletableFuture<dsz> doWork(duc var1, dty var2, dub var3, dsz var4);
   }
}

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

public class dtw {
   public static final int a = 8;
   private static final EnumSet<dwt.a> o = EnumSet.of(dwt.a.c, dwt.a.a);
   public static final EnumSet<dwt.a> b = EnumSet.of(dwt.a.d, dwt.a.b, dwt.a.e, dwt.a.f);
   public static final dtw c = a("empty", null, -1, false, o, dty.a, dtx::a, dtx::a);
   public static final dtw d = a("structure_starts", c, 0, false, o, dty.a, dtx::b, dtx::b);
   public static final dtw e = a("structure_references", d, 8, false, o, dty.a, dtx::c, dtx::a);
   public static final dtw f = a("biomes", e, 8, false, o, dty.a, dtx::d, dtx::a);
   public static final dtw g = a("noise", f, 8, false, o, dty.a, dtx::e, dtx::a);
   public static final dtw h = a("surface", g, 8, false, o, dty.a, dtx::f, dtx::a);
   public static final dtw i = a("carvers", h, 8, false, b, dty.a, dtx::g, dtx::a);
   public static final dtw j = a("features", i, 8, false, b, dty.a, dtx::h, dtx::a);
   public static final dtw k = a("initialize_light", j, 0, false, b, dty.a, dtx::i, dtx::c);
   public static final dtw l = a("light", k, 1, true, b, dty.a, dtx::j, dtx::d);
   public static final dtw m = a("spawn", l, 1, false, b, dty.a, dtx::k, dtx::a);
   public static final dtw n = a("full", m, 0, false, b, dty.b, dtx::l, dtx::e);
   private static final List<dtw> p = ImmutableList.of(n, k, i, f, d, d, d, d, d, d, d, d, new dtw[0]);
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
   private final dtw s;
   private final dtw.a t;
   private final dtw.b u;
   private final int v;
   private final boolean w;
   private final dty x;
   private final EnumSet<dwt.a> y;

   private static dtw a(String $$0, @Nullable dtw $$1, int $$2, boolean $$3, EnumSet<dwt.a> $$4, dty $$5, dtw.a $$6, dtw.b $$7) {
      return jk.a(le.n, $$0, new dtw($$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public static List<dtw> a() {
      List<dtw> $$0 = Lists.newArrayList();

      dtw $$1;
      for ($$1 = n; $$1.d() != $$1; $$1 = $$1.d()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   public static dtw a(int $$0) {
      if ($$0 >= p.size()) {
         return c;
      } else {
         return $$0 < 0 ? n : p.get($$0);
      }
   }

   public static int b() {
      return p.size();
   }

   public static int a(dtw $$0) {
      return q.getInt($$0.c());
   }

   dtw(@Nullable dtw $$0, int $$1, boolean $$2, EnumSet<dwt.a> $$3, dty $$4, dtw.a $$5, dtw.b $$6) {
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

   public dtw d() {
      return this.s;
   }

   public CompletableFuture<dsx> a(dua $$0, Executor $$1, dtz $$2, List<dsx> $$3) {
      dsx $$4 = $$3.get($$3.size() / 2);
      bmr $$5 = bmo.f.a($$4.f(), $$0.a().ae(), this.toString());
      return this.t.doWork($$0, this, $$1, $$2, $$3, $$4).thenApply($$1x -> {
         if ($$1x instanceof dtr $$2x && !$$2x.j().b(this)) {
            $$2x.a(this);
         }

         if ($$5 != null) {
            $$5.finish();
         }

         return $$1x;
      });
   }

   public CompletableFuture<dsx> a(dua $$0, dtz $$1, dsx $$2) {
      return this.u.doWork($$0, this, $$1, $$2);
   }

   public int e() {
      return this.v;
   }

   public boolean f() {
      return this.w;
   }

   public dty g() {
      return this.x;
   }

   public static dtw a(String $$0) {
      return le.n.a(akm.a($$0));
   }

   public EnumSet<dwt.a> h() {
      return this.y;
   }

   public boolean b(dtw $$0) {
      return this.c() >= $$0.c();
   }

   @Override
   public String toString() {
      return le.n.b(this).toString();
   }

   @FunctionalInterface
   protected interface a {
      CompletableFuture<dsx> doWork(dua var1, dtw var2, Executor var3, dtz var4, List<dsx> var5, dsx var6);
   }

   @FunctionalInterface
   protected interface b {
      CompletableFuture<dsx> doWork(dua var1, dtw var2, dtz var3, dsx var4);
   }
}

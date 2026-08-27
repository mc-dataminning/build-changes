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

public class dru {
   public static final int a = 8;
   private static final EnumSet<dur.a> o = EnumSet.of(dur.a.c, dur.a.a);
   public static final EnumSet<dur.a> b = EnumSet.of(dur.a.d, dur.a.b, dur.a.e, dur.a.f);
   public static final dru c = a("empty", null, -1, false, o, drw.a, drv::a, drv::a);
   public static final dru d = a("structure_starts", c, 0, false, o, drw.a, drv::b, drv::b);
   public static final dru e = a("structure_references", d, 8, false, o, drw.a, drv::c, drv::a);
   public static final dru f = a("biomes", e, 8, false, o, drw.a, drv::d, drv::a);
   public static final dru g = a("noise", f, 8, false, o, drw.a, drv::e, drv::a);
   public static final dru h = a("surface", g, 8, false, o, drw.a, drv::f, drv::a);
   public static final dru i = a("carvers", h, 8, false, b, drw.a, drv::g, drv::a);
   public static final dru j = a("features", i, 8, false, b, drw.a, drv::h, drv::a);
   public static final dru k = a("initialize_light", j, 0, false, b, drw.a, drv::i, drv::c);
   public static final dru l = a("light", k, 1, true, b, drw.a, drv::j, drv::d);
   public static final dru m = a("spawn", l, 1, false, b, drw.a, drv::k, drv::a);
   public static final dru n = a("full", m, 0, false, b, drw.b, drv::l, drv::e);
   private static final List<dru> p = ImmutableList.of(n, k, i, f, d, d, d, d, d, d, d, d, new dru[0]);
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
   private final dru s;
   private final dru.a t;
   private final dru.b u;
   private final int v;
   private final boolean w;
   private final drw x;
   private final EnumSet<dur.a> y;

   private static dru a(String $$0, @Nullable dru $$1, int $$2, boolean $$3, EnumSet<dur.a> $$4, drw $$5, dru.a $$6, dru.b $$7) {
      return iy.a(kr.n, $$0, new dru($$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public static List<dru> a() {
      List<dru> $$0 = Lists.newArrayList();

      dru $$1;
      for ($$1 = n; $$1.d() != $$1; $$1 = $$1.d()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   public static dru a(int $$0) {
      if ($$0 >= p.size()) {
         return c;
      } else {
         return $$0 < 0 ? n : p.get($$0);
      }
   }

   public static int b() {
      return p.size();
   }

   public static int a(dru $$0) {
      return q.getInt($$0.c());
   }

   dru(@Nullable dru $$0, int $$1, boolean $$2, EnumSet<dur.a> $$3, drw $$4, dru.a $$5, dru.b $$6) {
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

   public dru d() {
      return this.s;
   }

   public CompletableFuture<dqv> a(dry $$0, Executor $$1, drx $$2, List<dqv> $$3) {
      dqv $$4 = $$3.get($$3.size() / 2);
      bkx $$5 = bku.f.a($$4.f(), $$0.a().ae(), this.toString());
      return this.t.doWork($$0, this, $$1, $$2, $$3, $$4).thenApply($$1x -> {
         if ($$1x instanceof drp $$2x && !$$2x.j().b(this)) {
            $$2x.a(this);
         }

         if ($$5 != null) {
            $$5.finish();
         }

         return $$1x;
      });
   }

   public CompletableFuture<dqv> a(dry $$0, drx $$1, dqv $$2) {
      return this.u.doWork($$0, this, $$1, $$2);
   }

   public int e() {
      return this.v;
   }

   public boolean f() {
      return this.w;
   }

   public drw g() {
      return this.x;
   }

   public static dru a(String $$0) {
      return kr.n.a(ajt.a($$0));
   }

   public EnumSet<dur.a> h() {
      return this.y;
   }

   public boolean b(dru $$0) {
      return this.c() >= $$0.c();
   }

   @Override
   public String toString() {
      return kr.n.b(this).toString();
   }

   @FunctionalInterface
   protected interface a {
      CompletableFuture<dqv> doWork(dry var1, dru var2, Executor var3, drx var4, List<dqv> var5, dqv var6);
   }

   @FunctionalInterface
   protected interface b {
      CompletableFuture<dqv> doWork(dry var1, dru var2, drx var3, dqv var4);
   }
}

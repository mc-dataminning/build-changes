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

public class dux {
   public static final int a = 8;
   private static final EnumSet<dxu.a> o = EnumSet.of(dxu.a.c, dxu.a.a);
   public static final EnumSet<dxu.a> b = EnumSet.of(dxu.a.d, dxu.a.b, dxu.a.e, dxu.a.f);
   public static final dux c = a("empty", null, -1, false, o, duz.a, duy::a, duy::a);
   public static final dux d = a("structure_starts", c, 0, false, o, duz.a, duy::b, duy::b);
   public static final dux e = a("structure_references", d, 8, false, o, duz.a, duy::c, duy::a);
   public static final dux f = a("biomes", e, 8, false, o, duz.a, duy::d, duy::a);
   public static final dux g = a("noise", f, 8, false, o, duz.a, duy::e, duy::a);
   public static final dux h = a("surface", g, 8, false, o, duz.a, duy::f, duy::a);
   public static final dux i = a("carvers", h, 8, false, b, duz.a, duy::g, duy::a);
   public static final dux j = a("features", i, 8, false, b, duz.a, duy::h, duy::a);
   public static final dux k = a("initialize_light", j, 0, false, b, duz.a, duy::i, duy::c);
   public static final dux l = a("light", k, 1, true, b, duz.a, duy::j, duy::d);
   public static final dux m = a("spawn", l, 1, false, b, duz.a, duy::k, duy::a);
   public static final dux n = a("full", m, 0, false, b, duz.b, duy::l, duy::e);
   private static final List<dux> p = ImmutableList.of(n, k, i, f, d, d, d, d, d, d, d, d, new dux[0]);
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
   private final dux s;
   private final dux.a t;
   private final dux.b u;
   private final int v;
   private final boolean w;
   private final duz x;
   private final EnumSet<dxu.a> y;

   private static dux a(String $$0, @Nullable dux $$1, int $$2, boolean $$3, EnumSet<dxu.a> $$4, duz $$5, dux.a $$6, dux.b $$7) {
      return jv.a(lp.n, $$0, new dux($$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public static List<dux> a() {
      List<dux> $$0 = Lists.newArrayList();

      dux $$1;
      for ($$1 = n; $$1.d() != $$1; $$1 = $$1.d()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   public static dux a(int $$0) {
      if ($$0 >= p.size()) {
         return c;
      } else {
         return $$0 < 0 ? n : p.get($$0);
      }
   }

   public static int b() {
      return p.size();
   }

   public static int a(dux $$0) {
      return q.getInt($$0.c());
   }

   dux(@Nullable dux $$0, int $$1, boolean $$2, EnumSet<dxu.a> $$3, duz $$4, dux.a $$5, dux.b $$6) {
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

   public dux d() {
      return this.s;
   }

   public CompletableFuture<dty> a(dvb $$0, Executor $$1, dva $$2, List<dty> $$3) {
      dty $$4 = $$3.get($$3.size() / 2);
      bnr $$5 = bno.f.a($$4.f(), $$0.a().af(), this.toString());
      return this.t.doWork($$0, this, $$1, $$2, $$3, $$4).thenApply($$1x -> {
         if ($$1x instanceof dus $$2x && !$$2x.j().b(this)) {
            $$2x.a(this);
         }

         if ($$5 != null) {
            $$5.finish();
         }

         return $$1x;
      });
   }

   public CompletableFuture<dty> a(dvb $$0, dva $$1, dty $$2) {
      return this.u.doWork($$0, this, $$1, $$2);
   }

   public int e() {
      return this.v;
   }

   public boolean f() {
      return this.w;
   }

   public duz g() {
      return this.x;
   }

   public static dux a(String $$0) {
      return lp.n.a(alf.a($$0));
   }

   public EnumSet<dxu.a> h() {
      return this.y;
   }

   public boolean b(dux $$0) {
      return this.c() >= $$0.c();
   }

   @Override
   public String toString() {
      return lp.n.b(this).toString();
   }

   @FunctionalInterface
   protected interface a {
      CompletableFuture<dty> doWork(dvb var1, dux var2, Executor var3, dva var4, List<dty> var5, dty var6);
   }

   @FunctionalInterface
   protected interface b {
      CompletableFuture<dty> doWork(dvb var1, dux var2, dva var3, dty var4);
   }
}

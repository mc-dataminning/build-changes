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

public class dus {
   public static final int a = 8;
   private static final EnumSet<dxp.a> o = EnumSet.of(dxp.a.c, dxp.a.a);
   public static final EnumSet<dxp.a> b = EnumSet.of(dxp.a.d, dxp.a.b, dxp.a.e, dxp.a.f);
   public static final dus c = a("empty", null, -1, false, o, duu.a, dut::a, dut::a);
   public static final dus d = a("structure_starts", c, 0, false, o, duu.a, dut::b, dut::b);
   public static final dus e = a("structure_references", d, 8, false, o, duu.a, dut::c, dut::a);
   public static final dus f = a("biomes", e, 8, false, o, duu.a, dut::d, dut::a);
   public static final dus g = a("noise", f, 8, false, o, duu.a, dut::e, dut::a);
   public static final dus h = a("surface", g, 8, false, o, duu.a, dut::f, dut::a);
   public static final dus i = a("carvers", h, 8, false, b, duu.a, dut::g, dut::a);
   public static final dus j = a("features", i, 8, false, b, duu.a, dut::h, dut::a);
   public static final dus k = a("initialize_light", j, 0, false, b, duu.a, dut::i, dut::c);
   public static final dus l = a("light", k, 1, true, b, duu.a, dut::j, dut::d);
   public static final dus m = a("spawn", l, 1, false, b, duu.a, dut::k, dut::a);
   public static final dus n = a("full", m, 0, false, b, duu.b, dut::l, dut::e);
   private static final List<dus> p = ImmutableList.of(n, k, i, f, d, d, d, d, d, d, d, d, new dus[0]);
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
   private final dus s;
   private final dus.a t;
   private final dus.b u;
   private final int v;
   private final boolean w;
   private final duu x;
   private final EnumSet<dxp.a> y;

   private static dus a(String $$0, @Nullable dus $$1, int $$2, boolean $$3, EnumSet<dxp.a> $$4, duu $$5, dus.a $$6, dus.b $$7) {
      return jv.a(lp.n, $$0, new dus($$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public static List<dus> a() {
      List<dus> $$0 = Lists.newArrayList();

      dus $$1;
      for ($$1 = n; $$1.d() != $$1; $$1 = $$1.d()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   public static dus a(int $$0) {
      if ($$0 >= p.size()) {
         return c;
      } else {
         return $$0 < 0 ? n : p.get($$0);
      }
   }

   public static int b() {
      return p.size();
   }

   public static int a(dus $$0) {
      return q.getInt($$0.c());
   }

   dus(@Nullable dus $$0, int $$1, boolean $$2, EnumSet<dxp.a> $$3, duu $$4, dus.a $$5, dus.b $$6) {
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

   public dus d() {
      return this.s;
   }

   public CompletableFuture<dtt> a(duw $$0, Executor $$1, duv $$2, List<dtt> $$3) {
      dtt $$4 = $$3.get($$3.size() / 2);
      bnm $$5 = bnj.f.a($$4.f(), $$0.a().af(), this.toString());
      return this.t.doWork($$0, this, $$1, $$2, $$3, $$4).thenApply($$1x -> {
         if ($$1x instanceof dun $$2x && !$$2x.j().b(this)) {
            $$2x.a(this);
         }

         if ($$5 != null) {
            $$5.finish();
         }

         return $$1x;
      });
   }

   public CompletableFuture<dtt> a(duw $$0, duv $$1, dtt $$2) {
      return this.u.doWork($$0, this, $$1, $$2);
   }

   public int e() {
      return this.v;
   }

   public boolean f() {
      return this.w;
   }

   public duu g() {
      return this.x;
   }

   public static dus a(String $$0) {
      return lp.n.a(alb.a($$0));
   }

   public EnumSet<dxp.a> h() {
      return this.y;
   }

   public boolean b(dus $$0) {
      return this.c() >= $$0.c();
   }

   @Override
   public String toString() {
      return lp.n.b(this).toString();
   }

   @FunctionalInterface
   protected interface a {
      CompletableFuture<dtt> doWork(duw var1, dus var2, Executor var3, duv var4, List<dtt> var5, dtt var6);
   }

   @FunctionalInterface
   protected interface b {
      CompletableFuture<dtt> doWork(duw var1, dus var2, duv var3, dtt var4);
   }
}

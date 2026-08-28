import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class dpe extends dpk implements bqt, cqy, crj {
   protected static final int b = 0;
   protected static final int c = 1;
   protected static final int d = 2;
   public static final int e = 0;
   private static final int[] q = new int[]{0};
   private static final int[] r = new int[]{2, 1};
   private static final int[] s = new int[]{1};
   public static final int f = 1;
   public static final int g = 2;
   public static final int h = 3;
   public static final int i = 4;
   public static final int j = 200;
   public static final int k = 2;
   protected js<cud> l = js.a(3, cud.l);
   int t;
   int u;
   int v;
   int w;
   @Nullable
   private static volatile Map<cty, Integer> x;
   protected final cpt m = new cpt() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dpe.this.t;
            case 1:
               return dpe.this.u;
            case 2:
               return dpe.this.v;
            case 3:
               return dpe.this.w;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dpe.this.t = $$1;
               break;
            case 1:
               dpe.this.u = $$1;
               break;
            case 2:
               dpe.this.v = $$1;
               break;
            case 3:
               dpe.this.w = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Object2IntOpenHashMap<akk> y = new Object2IntOpenHashMap();
   private final cyn.a<cyz, ? extends cxr> z;

   protected dpe(dps<?> $$0, ja $$1, dsl $$2, cyp<? extends cxr> $$3) {
      super($$0, $$1, $$2);
      this.z = cyn.b($$3);
   }

   public static void f() {
      x = null;
   }

   public static Map<cty, Integer> g() {
      Map<cty, Integer> $$0 = x;
      if ($$0 != null) {
         return $$0;
      } else {
         Map<cty, Integer> $$1 = Maps.newLinkedHashMap();
         a($$1, cug.qA, 20000);
         a($$1, dfk.iB, 16000);
         a($$1, cug.sg, 2400);
         a($$1, cug.ox, 1600);
         a($$1, cug.oy, 1600);
         a($$1, awf.r, 300);
         a($$1, awf.C, 300);
         a($$1, awf.b, 300);
         a($$1, dfk.w, 300);
         a($$1, awf.i, 300);
         a($$1, dfk.hU, 300);
         a($$1, awf.j, 150);
         a($$1, dfk.jC, 150);
         a($$1, awf.n, 300);
         a($$1, awf.m, 300);
         a($$1, awf.k, 300);
         a($$1, awf.l, 300);
         a($$1, dfk.aY, 300);
         a($$1, dfk.cl, 300);
         a($$1, dfk.cm, 300);
         a($$1, dfk.oa, 300);
         a($$1, dfk.dT, 300);
         a($$1, dfk.cv, 300);
         a($$1, dfk.gV, 300);
         a($$1, dfk.cA, 300);
         a($$1, dfk.gZ, 300);
         a($$1, awf.E, 300);
         a($$1, cug.ov, 300);
         a($$1, cug.qV, 300);
         a($$1, dfk.cO, 300);
         a($$1, awf.aQ, 200);
         a($$1, awf.be, 800);
         a($$1, cug.oN, 200);
         a($$1, cug.oM, 200);
         a($$1, cug.oQ, 200);
         a($$1, cug.oP, 200);
         a($$1, cug.oO, 200);
         a($$1, awf.h, 200);
         a($$1, awf.aN, 1200);
         a($$1, awf.a, 100);
         a($$1, awf.d, 100);
         a($$1, cug.pq, 100);
         a($$1, awf.p, 100);
         a($$1, cug.ot, 100);
         a($$1, awf.g, 67);
         a($$1, dfk.me, 4001);
         a($$1, cug.vW, 300);
         a($$1, dfk.mZ, 50);
         a($$1, dfk.bv, 100);
         a($$1, dfk.nS, 50);
         a($$1, dfk.nT, 300);
         a($$1, dfk.nU, 300);
         a($$1, dfk.nX, 300);
         a($$1, dfk.nY, 300);
         a($$1, dfk.ob, 300);
         a($$1, dfk.pc, 300);
         a($$1, dfk.sy, 100);
         a($$1, dfk.sz, 100);
         a($$1, dfk.ac, 300);
         x = $$1;
         return $$1;
      }
   }

   private static boolean b(cty $$0) {
      return $$0.o().a(awf.aH);
   }

   private static void a(Map<cty, Integer> $$0, awm<cty> $$1, int $$2) {
      for (jj<cty> $$3 : lq.g.c($$1)) {
         if (!b($$3.a())) {
            $$0.put($$3.a(), $$2);
         }
      }
   }

   private static void a(Map<cty, Integer> $$0, dcf $$1, int $$2) {
      cty $$3 = $$1.r();
      if (b($$3)) {
         if (aa.aU) {
            throw (IllegalStateException)ac.b(
               new IllegalStateException(
                  "A developer tried to explicitly make fire resistant item " + $$3.n(null).getString() + " a furnace fuel. That will not work!"
               )
            );
         }
      } else {
         $$0.put($$3, $$2);
      }
   }

   private boolean l() {
      return this.t > 0;
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      this.l = js.a(this.b(), cud.l);
      bqb.b($$0, this.l, $$1);
      this.t = $$0.g("BurnTime");
      this.v = $$0.g("CookTime");
      this.w = $$0.g("CookTimeTotal");
      this.u = this.b(this.l.get(1));
      tx $$2 = $$0.p("RecipesUsed");

      for (String $$3 : $$2.e()) {
         this.y.put(new akk($$3), $$2.h($$3));
      }
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
      super.b($$0, $$1);
      $$0.a("BurnTime", (short)this.t);
      $$0.a("CookTime", (short)this.v);
      $$0.a("CookTimeTotal", (short)this.w);
      bqb.a($$0, this.l, $$1);
      tx $$2 = new tx();
      this.y.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), $$2x));
      $$0.a("RecipesUsed", $$2);
   }

   public static void a(dcg $$0, ja $$1, dsl $$2, dpe $$3) {
      boolean $$4 = $$3.l();
      boolean $$5 = false;
      if ($$3.l()) {
         $$3.t--;
      }

      cud $$6 = $$3.l.get(1);
      cud $$7 = $$3.l.get(0);
      boolean $$8 = !$$7.e();
      boolean $$9 = !$$6.e();
      if ($$3.l() || $$9 && $$8) {
         cyl<?> $$10;
         if ($$8) {
            $$10 = $$3.z.a(new cyz($$7), $$0).orElse(null);
         } else {
            $$10 = null;
         }

         int $$12 = $$3.ah_();
         if (!$$3.l() && a($$0.H_(), $$10, $$3.l, $$12)) {
            $$3.t = $$3.b($$6);
            $$3.u = $$3.t;
            if ($$3.l()) {
               $$5 = true;
               if ($$9) {
                  cty $$13 = $$6.g();
                  $$6.h(1);
                  if ($$6.e()) {
                     cty $$14 = $$13.u();
                     $$3.l.set(1, $$14 == null ? cud.l : new cud($$14));
                  }
               }
            }
         }

         if ($$3.l() && a($$0.H_(), $$10, $$3.l, $$12)) {
            $$3.v++;
            if ($$3.v == $$3.w) {
               $$3.v = 0;
               $$3.w = a($$0, $$3);
               if (b($$0.H_(), $$10, $$3.l, $$12)) {
                  $$3.a($$10);
               }

               $$5 = true;
            }
         } else {
            $$3.v = 0;
         }
      } else if (!$$3.l() && $$3.v > 0) {
         $$3.v = ayg.a($$3.v - 2, 0, $$3.w);
      }

      if ($$4 != $$3.l()) {
         $$5 = true;
         $$2 = $$2.a(ded.b, Boolean.valueOf($$3.l()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(jx $$0, @Nullable cyl<?> $$1, js<cud> $$2, int $$3) {
      if (!$$2.get(0).e() && $$1 != null) {
         cud $$4 = $$1.b().a($$0);
         if ($$4.e()) {
            return false;
         } else {
            cud $$5 = $$2.get(2);
            if ($$5.e()) {
               return true;
            } else if (!cud.c($$5, $$4)) {
               return false;
            } else {
               return $$5.H() < $$3 && $$5.H() < $$5.j() ? true : $$5.H() < $$4.j();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(jx $$0, @Nullable cyl<?> $$1, js<cud> $$2, int $$3) {
      if ($$1 != null && a($$0, $$1, $$2, $$3)) {
         cud $$4 = $$2.get(0);
         cud $$5 = $$1.b().a($$0);
         cud $$6 = $$2.get(2);
         if ($$6.e()) {
            $$2.set(2, $$5.s());
         } else if (cud.c($$6, $$5)) {
            $$6.g(1);
         }

         if ($$4.a(dfk.aP.r()) && !$$2.get(1).e() && $$2.get(1).a(cug.qy)) {
            $$2.set(1, new cud(cug.qz));
         }

         $$4.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int b(cud $$0) {
      if ($$0.e()) {
         return 0;
      } else {
         cty $$1 = $$0.g();
         return g().getOrDefault($$1, 0);
      }
   }

   private static int a(dcg $$0, dpe $$1) {
      cyz $$2 = new cyz($$1.a(0));
      return $$1.z.a($$2, $$0).map($$0x -> ((cxr)$$0x.b()).d()).orElse(200);
   }

   public static boolean c(cud $$0) {
      return g().containsKey($$0.g());
   }

   @Override
   public int[] a(jf $$0) {
      if ($$0 == jf.a) {
         return r;
      } else {
         return $$0 == jf.b ? q : s;
      }
   }

   @Override
   public boolean a(int $$0, cud $$1, @Nullable jf $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cud $$1, jf $$2) {
      return $$2 == jf.a && $$0 == 1 ? $$1.a(cug.qz) || $$1.a(cug.qy) : true;
   }

   @Override
   public int b() {
      return this.l.size();
   }

   @Override
   protected js<cud> j() {
      return this.l;
   }

   @Override
   protected void a(js<cud> $$0) {
      this.l = $$0;
   }

   @Override
   public void a(int $$0, cud $$1) {
      cud $$2 = this.l.get($$0);
      boolean $$3 = !$$1.e() && cud.c($$2, $$1);
      this.l.set($$0, $$1);
      $$1.f(this.e_($$1));
      if ($$0 == 0 && !$$3) {
         this.w = a(this.n, this);
         this.v = 0;
         this.e();
      }
   }

   @Override
   public boolean b(int $$0, cud $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         cud $$2 = this.l.get(1);
         return c($$1) || $$1.a(cug.qy) && !$$2.a(cug.qy);
      }
   }

   @Override
   public void a(@Nullable cyl<?> $$0) {
      if ($$0 != null) {
         akk $$1 = $$0.a();
         this.y.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public cyl<?> d() {
      return null;
   }

   @Override
   public void a(cml $$0, List<cud> $$1) {
   }

   public void a(aqn $$0) {
      List<cyl<?>> $$1 = this.a($$0.A(), $$0.dp());
      $$0.a($$1);

      for (cyl<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.l);
         }
      }

      this.y.clear();
   }

   public List<cyl<?>> a(aqm $$0, ewh $$1) {
      List<cyl<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.y.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<akk> $$3 = (Entry<akk>)var4.next();
         $$0.r().a((akk)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((cyl<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((cxr)$$4.b()).b());
         });
      }

      return $$2;
   }

   private static void a(aqm $$0, ewh $$1, int $$2, float $$3) {
      int $$4 = ayg.d((float)$$2 * $$3);
      float $$5 = ayg.h((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      bss.a($$0, $$1, $$4);
   }

   @Override
   public void a(cmp $$0) {
      for (cud $$1 : this.l) {
         $$0.b($$1);
      }
   }
}

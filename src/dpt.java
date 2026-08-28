import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class dpt extends dpz implements brc, cri, crt {
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
   protected jv<cuo> l = jv.a(3, cuo.l);
   int t;
   int u;
   int v;
   int w;
   @Nullable
   private static volatile Map<cuj, Integer> x;
   protected final cqd m = new cqd() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dpt.this.t;
            case 1:
               return dpt.this.u;
            case 2:
               return dpt.this.v;
            case 3:
               return dpt.this.w;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dpt.this.t = $$1;
               break;
            case 1:
               dpt.this.u = $$1;
               break;
            case 2:
               dpt.this.v = $$1;
               break;
            case 3:
               dpt.this.w = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Object2IntOpenHashMap<akq> y = new Object2IntOpenHashMap();
   private final czb.a<czn, ? extends cyf> z;

   protected dpt(dqh<?> $$0, jd $$1, dta $$2, czd<? extends cyf> $$3) {
      super($$0, $$1, $$2);
      this.z = czb.b($$3);
   }

   public static void f() {
      x = null;
   }

   public static Map<cuj, Integer> g() {
      Map<cuj, Integer> $$0 = x;
      if ($$0 != null) {
         return $$0;
      } else {
         Map<cuj, Integer> $$1 = Maps.newLinkedHashMap();
         a($$1, cur.qA, 20000);
         a($$1, dfy.iB, 16000);
         a($$1, cur.sg, 2400);
         a($$1, cur.ox, 1600);
         a($$1, cur.oy, 1600);
         a($$1, awm.r, 300);
         a($$1, awm.C, 300);
         a($$1, awm.b, 300);
         a($$1, dfy.w, 300);
         a($$1, awm.i, 300);
         a($$1, dfy.hU, 300);
         a($$1, awm.j, 150);
         a($$1, dfy.jC, 150);
         a($$1, awm.n, 300);
         a($$1, awm.m, 300);
         a($$1, awm.k, 300);
         a($$1, awm.l, 300);
         a($$1, dfy.aY, 300);
         a($$1, dfy.cl, 300);
         a($$1, dfy.cm, 300);
         a($$1, dfy.oa, 300);
         a($$1, dfy.dT, 300);
         a($$1, dfy.cv, 300);
         a($$1, dfy.gV, 300);
         a($$1, dfy.cA, 300);
         a($$1, dfy.gZ, 300);
         a($$1, awm.E, 300);
         a($$1, cur.ov, 300);
         a($$1, cur.qV, 300);
         a($$1, dfy.cO, 300);
         a($$1, awm.aQ, 200);
         a($$1, awm.bd, 800);
         a($$1, cur.oN, 200);
         a($$1, cur.oM, 200);
         a($$1, cur.oQ, 200);
         a($$1, cur.oP, 200);
         a($$1, cur.oO, 200);
         a($$1, awm.h, 200);
         a($$1, awm.aN, 1200);
         a($$1, awm.a, 100);
         a($$1, awm.d, 100);
         a($$1, cur.pq, 100);
         a($$1, awm.p, 100);
         a($$1, cur.ot, 100);
         a($$1, awm.g, 67);
         a($$1, dfy.me, 4001);
         a($$1, cur.vW, 300);
         a($$1, dfy.mZ, 50);
         a($$1, dfy.bv, 100);
         a($$1, dfy.nS, 50);
         a($$1, dfy.nT, 300);
         a($$1, dfy.nU, 300);
         a($$1, dfy.nX, 300);
         a($$1, dfy.nY, 300);
         a($$1, dfy.ob, 300);
         a($$1, dfy.pc, 300);
         a($$1, dfy.sy, 100);
         a($$1, dfy.sz, 100);
         a($$1, dfy.ac, 300);
         x = $$1;
         return $$1;
      }
   }

   private static boolean b(cuj $$0) {
      return $$0.o().a(awm.aH);
   }

   private static void a(Map<cuj, Integer> $$0, awt<cuj> $$1, int $$2) {
      for (jm<cuj> $$3 : lt.g.c($$1)) {
         if (!b($$3.a())) {
            $$0.put($$3.a(), $$2);
         }
      }
   }

   private static void a(Map<cuj, Integer> $$0, dct $$1, int $$2) {
      cuj $$3 = $$1.r();
      if (b($$3)) {
         if (ab.aV) {
            throw (IllegalStateException)ad.b(
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
   protected void a(ua $$0, jo.a $$1) {
      super.a($$0, $$1);
      this.l = jv.a(this.b(), cuo.l);
      bqk.b($$0, this.l, $$1);
      this.t = $$0.g("BurnTime");
      this.v = $$0.g("CookTime");
      this.w = $$0.g("CookTimeTotal");
      this.u = this.b(this.l.get(1));
      ua $$2 = $$0.p("RecipesUsed");

      for (String $$3 : $$2.e()) {
         this.y.put(akq.a($$3), $$2.h($$3));
      }
   }

   @Override
   protected void b(ua $$0, jo.a $$1) {
      super.b($$0, $$1);
      $$0.a("BurnTime", (short)this.t);
      $$0.a("CookTime", (short)this.v);
      $$0.a("CookTimeTotal", (short)this.w);
      bqk.a($$0, this.l, $$1);
      ua $$2 = new ua();
      this.y.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), $$2x));
      $$0.a("RecipesUsed", $$2);
   }

   public static void a(dcu $$0, jd $$1, dta $$2, dpt $$3) {
      boolean $$4 = $$3.l();
      boolean $$5 = false;
      if ($$3.l()) {
         $$3.t--;
      }

      cuo $$6 = $$3.l.get(1);
      cuo $$7 = $$3.l.get(0);
      boolean $$8 = !$$7.e();
      boolean $$9 = !$$6.e();
      if ($$3.l() || $$9 && $$8) {
         cyz<?> $$10;
         if ($$8) {
            $$10 = $$3.z.a(new czn($$7), $$0).orElse(null);
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
                  cuj $$13 = $$6.g();
                  $$6.h(1);
                  if ($$6.e()) {
                     cuj $$14 = $$13.u();
                     $$3.l.set(1, $$14 == null ? cuo.l : new cuo($$14));
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
         $$3.v = ayn.a($$3.v - 2, 0, $$3.w);
      }

      if ($$4 != $$3.l()) {
         $$5 = true;
         $$2 = $$2.a(der.b, Boolean.valueOf($$3.l()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(ka $$0, @Nullable cyz<?> $$1, jv<cuo> $$2, int $$3) {
      if (!$$2.get(0).e() && $$1 != null) {
         cuo $$4 = $$1.b().a($$0);
         if ($$4.e()) {
            return false;
         } else {
            cuo $$5 = $$2.get(2);
            if ($$5.e()) {
               return true;
            } else if (!cuo.c($$5, $$4)) {
               return false;
            } else {
               return $$5.H() < $$3 && $$5.H() < $$5.j() ? true : $$5.H() < $$4.j();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(ka $$0, @Nullable cyz<?> $$1, jv<cuo> $$2, int $$3) {
      if ($$1 != null && a($$0, $$1, $$2, $$3)) {
         cuo $$4 = $$2.get(0);
         cuo $$5 = $$1.b().a($$0);
         cuo $$6 = $$2.get(2);
         if ($$6.e()) {
            $$2.set(2, $$5.s());
         } else if (cuo.c($$6, $$5)) {
            $$6.g(1);
         }

         if ($$4.a(dfy.aP.r()) && !$$2.get(1).e() && $$2.get(1).a(cur.qy)) {
            $$2.set(1, new cuo(cur.qz));
         }

         $$4.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int b(cuo $$0) {
      if ($$0.e()) {
         return 0;
      } else {
         cuj $$1 = $$0.g();
         return g().getOrDefault($$1, 0);
      }
   }

   private static int a(dcu $$0, dpt $$1) {
      czn $$2 = new czn($$1.a(0));
      return $$1.z.a($$2, $$0).map($$0x -> ((cyf)$$0x.b()).d()).orElse(200);
   }

   public static boolean c(cuo $$0) {
      return g().containsKey($$0.g());
   }

   @Override
   public int[] a(ji $$0) {
      if ($$0 == ji.a) {
         return r;
      } else {
         return $$0 == ji.b ? q : s;
      }
   }

   @Override
   public boolean a(int $$0, cuo $$1, @Nullable ji $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cuo $$1, ji $$2) {
      return $$2 == ji.a && $$0 == 1 ? $$1.a(cur.qz) || $$1.a(cur.qy) : true;
   }

   @Override
   public int b() {
      return this.l.size();
   }

   @Override
   protected jv<cuo> j() {
      return this.l;
   }

   @Override
   protected void a(jv<cuo> $$0) {
      this.l = $$0;
   }

   @Override
   public void a(int $$0, cuo $$1) {
      cuo $$2 = this.l.get($$0);
      boolean $$3 = !$$1.e() && cuo.c($$2, $$1);
      this.l.set($$0, $$1);
      $$1.f(this.e_($$1));
      if ($$0 == 0 && !$$3) {
         this.w = a(this.n, this);
         this.v = 0;
         this.e();
      }
   }

   @Override
   public boolean b(int $$0, cuo $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         cuo $$2 = this.l.get(1);
         return c($$1) || $$1.a(cur.qy) && !$$2.a(cur.qy);
      }
   }

   @Override
   public void a(@Nullable cyz<?> $$0) {
      if ($$0 != null) {
         akq $$1 = $$0.a();
         this.y.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public cyz<?> d() {
      return null;
   }

   @Override
   public void a(cmv $$0, List<cuo> $$1) {
   }

   public void a(aqu $$0) {
      List<cyz<?>> $$1 = this.a($$0.A(), $$0.do());
      $$0.a($$1);

      for (cyz<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.l);
         }
      }

      this.y.clear();
   }

   public List<cyz<?>> a(aqt $$0, eww $$1) {
      List<cyz<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.y.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<akq> $$3 = (Entry<akq>)var4.next();
         $$0.r().a((akq)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((cyz<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((cyf)$$4.b()).b());
         });
      }

      return $$2;
   }

   private static void a(aqt $$0, eww $$1, int $$2, float $$3) {
      int $$4 = ayn.d((float)$$2 * $$3);
      float $$5 = ayn.h((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      btb.a($$0, $$1, $$4);
   }

   @Override
   public void a(cmz $$0) {
      for (cuo $$1 : this.l) {
         $$0.b($$1);
      }
   }
}

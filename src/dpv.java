import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class dpv extends dqb implements brd, crk, crv {
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
   protected jv<cuq> l = jv.a(3, cuq.l);
   int t;
   int u;
   int v;
   int w;
   @Nullable
   private static volatile Map<cul, Integer> x;
   protected final cqf m = new cqf() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dpv.this.t;
            case 1:
               return dpv.this.u;
            case 2:
               return dpv.this.v;
            case 3:
               return dpv.this.w;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dpv.this.t = $$1;
               break;
            case 1:
               dpv.this.u = $$1;
               break;
            case 2:
               dpv.this.v = $$1;
               break;
            case 3:
               dpv.this.w = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Object2IntOpenHashMap<akr> y = new Object2IntOpenHashMap();
   private final czd.a<czp, ? extends cyh> z;

   protected dpv(dqj<?> $$0, jd $$1, dtc $$2, czf<? extends cyh> $$3) {
      super($$0, $$1, $$2);
      this.z = czd.b($$3);
   }

   public static void f() {
      x = null;
   }

   public static Map<cul, Integer> g() {
      Map<cul, Integer> $$0 = x;
      if ($$0 != null) {
         return $$0;
      } else {
         Map<cul, Integer> $$1 = Maps.newLinkedHashMap();
         a($$1, cut.qA, 20000);
         a($$1, dga.iB, 16000);
         a($$1, cut.sg, 2400);
         a($$1, cut.ox, 1600);
         a($$1, cut.oy, 1600);
         a($$1, awn.r, 300);
         a($$1, awn.C, 300);
         a($$1, awn.b, 300);
         a($$1, dga.w, 300);
         a($$1, awn.i, 300);
         a($$1, dga.hU, 300);
         a($$1, awn.j, 150);
         a($$1, dga.jC, 150);
         a($$1, awn.n, 300);
         a($$1, awn.m, 300);
         a($$1, awn.k, 300);
         a($$1, awn.l, 300);
         a($$1, dga.aY, 300);
         a($$1, dga.cl, 300);
         a($$1, dga.cm, 300);
         a($$1, dga.oa, 300);
         a($$1, dga.dT, 300);
         a($$1, dga.cv, 300);
         a($$1, dga.gV, 300);
         a($$1, dga.cA, 300);
         a($$1, dga.gZ, 300);
         a($$1, awn.E, 300);
         a($$1, cut.ov, 300);
         a($$1, cut.qV, 300);
         a($$1, dga.cO, 300);
         a($$1, awn.aQ, 200);
         a($$1, awn.bd, 800);
         a($$1, cut.oN, 200);
         a($$1, cut.oM, 200);
         a($$1, cut.oQ, 200);
         a($$1, cut.oP, 200);
         a($$1, cut.oO, 200);
         a($$1, awn.h, 200);
         a($$1, awn.aN, 1200);
         a($$1, awn.a, 100);
         a($$1, awn.d, 100);
         a($$1, cut.pq, 100);
         a($$1, awn.p, 100);
         a($$1, cut.ot, 100);
         a($$1, awn.g, 67);
         a($$1, dga.me, 4001);
         a($$1, cut.vW, 300);
         a($$1, dga.mZ, 50);
         a($$1, dga.bv, 100);
         a($$1, dga.nS, 50);
         a($$1, dga.nT, 300);
         a($$1, dga.nU, 300);
         a($$1, dga.nX, 300);
         a($$1, dga.nY, 300);
         a($$1, dga.ob, 300);
         a($$1, dga.pc, 300);
         a($$1, dga.sy, 100);
         a($$1, dga.sz, 100);
         a($$1, dga.ac, 300);
         x = $$1;
         return $$1;
      }
   }

   private static boolean b(cul $$0) {
      return $$0.o().a(awn.aH);
   }

   private static void a(Map<cul, Integer> $$0, awu<cul> $$1, int $$2) {
      for (jm<cul> $$3 : lt.g.c($$1)) {
         if (!b($$3.a())) {
            $$0.put($$3.a(), $$2);
         }
      }
   }

   private static void a(Map<cul, Integer> $$0, dcv $$1, int $$2) {
      cul $$3 = $$1.r();
      if (b($$3)) {
         if (ab.aU) {
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
   protected void a(ub $$0, jo.a $$1) {
      super.a($$0, $$1);
      this.l = jv.a(this.b(), cuq.l);
      bql.b($$0, this.l, $$1);
      this.t = $$0.g("BurnTime");
      this.v = $$0.g("CookTime");
      this.w = $$0.g("CookTimeTotal");
      this.u = this.b(this.l.get(1));
      ub $$2 = $$0.p("RecipesUsed");

      for (String $$3 : $$2.e()) {
         this.y.put(akr.a($$3), $$2.h($$3));
      }
   }

   @Override
   protected void b(ub $$0, jo.a $$1) {
      super.b($$0, $$1);
      $$0.a("BurnTime", (short)this.t);
      $$0.a("CookTime", (short)this.v);
      $$0.a("CookTimeTotal", (short)this.w);
      bql.a($$0, this.l, $$1);
      ub $$2 = new ub();
      this.y.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), $$2x));
      $$0.a("RecipesUsed", $$2);
   }

   public static void a(dcw $$0, jd $$1, dtc $$2, dpv $$3) {
      boolean $$4 = $$3.l();
      boolean $$5 = false;
      if ($$3.l()) {
         $$3.t--;
      }

      cuq $$6 = $$3.l.get(1);
      cuq $$7 = $$3.l.get(0);
      boolean $$8 = !$$7.e();
      boolean $$9 = !$$6.e();
      if ($$3.l() || $$9 && $$8) {
         czb<?> $$10;
         if ($$8) {
            $$10 = $$3.z.a(new czp($$7), $$0).orElse(null);
         } else {
            $$10 = null;
         }

         int $$12 = $$3.al_();
         if (!$$3.l() && a($$0.H_(), $$10, $$3.l, $$12)) {
            $$3.t = $$3.b($$6);
            $$3.u = $$3.t;
            if ($$3.l()) {
               $$5 = true;
               if ($$9) {
                  cul $$13 = $$6.g();
                  $$6.h(1);
                  if ($$6.e()) {
                     cul $$14 = $$13.u();
                     $$3.l.set(1, $$14 == null ? cuq.l : new cuq($$14));
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
         $$3.v = ayo.a($$3.v - 2, 0, $$3.w);
      }

      if ($$4 != $$3.l()) {
         $$5 = true;
         $$2 = $$2.a(det.b, Boolean.valueOf($$3.l()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(ka $$0, @Nullable czb<?> $$1, jv<cuq> $$2, int $$3) {
      if (!$$2.get(0).e() && $$1 != null) {
         cuq $$4 = $$1.b().a($$0);
         if ($$4.e()) {
            return false;
         } else {
            cuq $$5 = $$2.get(2);
            if ($$5.e()) {
               return true;
            } else if (!cuq.c($$5, $$4)) {
               return false;
            } else {
               return $$5.H() < $$3 && $$5.H() < $$5.j() ? true : $$5.H() < $$4.j();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(ka $$0, @Nullable czb<?> $$1, jv<cuq> $$2, int $$3) {
      if ($$1 != null && a($$0, $$1, $$2, $$3)) {
         cuq $$4 = $$2.get(0);
         cuq $$5 = $$1.b().a($$0);
         cuq $$6 = $$2.get(2);
         if ($$6.e()) {
            $$2.set(2, $$5.s());
         } else if (cuq.c($$6, $$5)) {
            $$6.g(1);
         }

         if ($$4.a(dga.aP.r()) && !$$2.get(1).e() && $$2.get(1).a(cut.qy)) {
            $$2.set(1, new cuq(cut.qz));
         }

         $$4.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int b(cuq $$0) {
      if ($$0.e()) {
         return 0;
      } else {
         cul $$1 = $$0.g();
         return g().getOrDefault($$1, 0);
      }
   }

   private static int a(dcw $$0, dpv $$1) {
      czp $$2 = new czp($$1.a(0));
      return $$1.z.a($$2, $$0).map($$0x -> ((cyh)$$0x.b()).d()).orElse(200);
   }

   public static boolean c(cuq $$0) {
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
   public boolean a(int $$0, cuq $$1, @Nullable ji $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cuq $$1, ji $$2) {
      return $$2 == ji.a && $$0 == 1 ? $$1.a(cut.qz) || $$1.a(cut.qy) : true;
   }

   @Override
   public int b() {
      return this.l.size();
   }

   @Override
   protected jv<cuq> j() {
      return this.l;
   }

   @Override
   protected void a(jv<cuq> $$0) {
      this.l = $$0;
   }

   @Override
   public void a(int $$0, cuq $$1) {
      cuq $$2 = this.l.get($$0);
      boolean $$3 = !$$1.e() && cuq.c($$2, $$1);
      this.l.set($$0, $$1);
      $$1.f(this.e_($$1));
      if ($$0 == 0 && !$$3) {
         this.w = a(this.n, this);
         this.v = 0;
         this.e();
      }
   }

   @Override
   public boolean b(int $$0, cuq $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         cuq $$2 = this.l.get(1);
         return c($$1) || $$1.a(cut.qy) && !$$2.a(cut.qy);
      }
   }

   @Override
   public void a(@Nullable czb<?> $$0) {
      if ($$0 != null) {
         akr $$1 = $$0.a();
         this.y.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public czb<?> d() {
      return null;
   }

   @Override
   public void a(cmx $$0, List<cuq> $$1) {
   }

   public void a(aqv $$0) {
      List<czb<?>> $$1 = this.a($$0.A(), $$0.dm());
      $$0.a($$1);

      for (czb<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.l);
         }
      }

      this.y.clear();
   }

   public List<czb<?>> a(aqu $$0, exc $$1) {
      List<czb<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.y.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<akr> $$3 = (Entry<akr>)var4.next();
         $$0.r().a((akr)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((czb<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((cyh)$$4.b()).b());
         });
      }

      return $$2;
   }

   private static void a(aqu $$0, exc $$1, int $$2, float $$3) {
      int $$4 = ayo.d((float)$$2 * $$3);
      float $$5 = ayo.h((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      btc.a($$0, $$1, $$4);
   }

   @Override
   public void a(cnb $$0) {
      for (cuq $$1 : this.l) {
         $$0.b($$1);
      }
   }
}

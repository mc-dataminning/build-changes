import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class dpb extends dph implements bqp, cqu, crf {
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
   protected js<cua> l = js.a(3, cua.l);
   int t;
   int u;
   int v;
   int w;
   @Nullable
   private static volatile Map<ctv, Integer> x;
   protected final cpp m = new cpp() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dpb.this.t;
            case 1:
               return dpb.this.u;
            case 2:
               return dpb.this.v;
            case 3:
               return dpb.this.w;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dpb.this.t = $$1;
               break;
            case 1:
               dpb.this.u = $$1;
               break;
            case 2:
               dpb.this.v = $$1;
               break;
            case 3:
               dpb.this.w = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Object2IntOpenHashMap<akk> y = new Object2IntOpenHashMap();
   private final cyk.a<cyw, ? extends cxo> z;

   protected dpb(dpp<?> $$0, ja $$1, dsh $$2, cym<? extends cxo> $$3) {
      super($$0, $$1, $$2);
      this.z = cyk.b($$3);
   }

   public static void f() {
      x = null;
   }

   public static Map<ctv, Integer> g() {
      Map<ctv, Integer> $$0 = x;
      if ($$0 != null) {
         return $$0;
      } else {
         Map<ctv, Integer> $$1 = Maps.newLinkedHashMap();
         a($$1, cud.qA, 20000);
         a($$1, dfh.iB, 16000);
         a($$1, cud.sg, 2400);
         a($$1, cud.ow, 1600);
         a($$1, cud.ox, 1600);
         a($$1, awd.r, 300);
         a($$1, awd.C, 300);
         a($$1, awd.b, 300);
         a($$1, dfh.w, 300);
         a($$1, awd.i, 300);
         a($$1, dfh.hU, 300);
         a($$1, awd.j, 150);
         a($$1, dfh.jC, 150);
         a($$1, awd.n, 300);
         a($$1, awd.m, 300);
         a($$1, awd.k, 300);
         a($$1, awd.l, 300);
         a($$1, dfh.aY, 300);
         a($$1, dfh.cl, 300);
         a($$1, dfh.cm, 300);
         a($$1, dfh.oa, 300);
         a($$1, dfh.dT, 300);
         a($$1, dfh.cv, 300);
         a($$1, dfh.gV, 300);
         a($$1, dfh.cA, 300);
         a($$1, dfh.gZ, 300);
         a($$1, awd.E, 300);
         a($$1, cud.ou, 300);
         a($$1, cud.qV, 300);
         a($$1, dfh.cO, 300);
         a($$1, awd.aQ, 200);
         a($$1, awd.be, 800);
         a($$1, cud.oM, 200);
         a($$1, cud.oL, 200);
         a($$1, cud.oP, 200);
         a($$1, cud.oO, 200);
         a($$1, cud.oN, 200);
         a($$1, awd.h, 200);
         a($$1, awd.aN, 1200);
         a($$1, awd.a, 100);
         a($$1, awd.d, 100);
         a($$1, cud.pp, 100);
         a($$1, awd.p, 100);
         a($$1, cud.pq, 100);
         a($$1, awd.g, 67);
         a($$1, dfh.me, 4001);
         a($$1, cud.vW, 300);
         a($$1, dfh.mZ, 50);
         a($$1, dfh.bv, 100);
         a($$1, dfh.nS, 50);
         a($$1, dfh.nT, 300);
         a($$1, dfh.nU, 300);
         a($$1, dfh.nX, 300);
         a($$1, dfh.nY, 300);
         a($$1, dfh.ob, 300);
         a($$1, dfh.pc, 300);
         a($$1, dfh.sy, 100);
         a($$1, dfh.sz, 100);
         a($$1, dfh.ac, 300);
         x = $$1;
         return $$1;
      }
   }

   private static boolean b(ctv $$0) {
      return $$0.o().a(awd.aH);
   }

   private static void a(Map<ctv, Integer> $$0, awk<ctv> $$1, int $$2) {
      for (jj<ctv> $$3 : lq.g.c($$1)) {
         if (!b($$3.a())) {
            $$0.put($$3.a(), $$2);
         }
      }
   }

   private static void a(Map<ctv, Integer> $$0, dcc $$1, int $$2) {
      ctv $$3 = $$1.r();
      if (b($$3)) {
         if (aa.aX) {
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
      this.l = js.a(this.b(), cua.l);
      bpx.b($$0, this.l, $$1);
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
      bpx.a($$0, this.l, $$1);
      tx $$2 = new tx();
      this.y.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), $$2x));
      $$0.a("RecipesUsed", $$2);
   }

   public static void a(dcd $$0, ja $$1, dsh $$2, dpb $$3) {
      boolean $$4 = $$3.l();
      boolean $$5 = false;
      if ($$3.l()) {
         $$3.t--;
      }

      cua $$6 = $$3.l.get(1);
      cua $$7 = $$3.l.get(0);
      boolean $$8 = !$$7.e();
      boolean $$9 = !$$6.e();
      if ($$3.l() || $$9 && $$8) {
         cyi<?> $$10;
         if ($$8) {
            $$10 = $$3.z.a(new cyw($$7), $$0).orElse(null);
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
                  ctv $$13 = $$6.g();
                  $$6.h(1);
                  if ($$6.e()) {
                     ctv $$14 = $$13.u();
                     $$3.l.set(1, $$14 == null ? cua.l : new cua($$14));
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
         $$3.v = aye.a($$3.v - 2, 0, $$3.w);
      }

      if ($$4 != $$3.l()) {
         $$5 = true;
         $$2 = $$2.a(dea.b, Boolean.valueOf($$3.l()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(jx $$0, @Nullable cyi<?> $$1, js<cua> $$2, int $$3) {
      if (!$$2.get(0).e() && $$1 != null) {
         cua $$4 = $$1.b().a($$0);
         if ($$4.e()) {
            return false;
         } else {
            cua $$5 = $$2.get(2);
            if ($$5.e()) {
               return true;
            } else if (!cua.c($$5, $$4)) {
               return false;
            } else {
               return $$5.H() < $$3 && $$5.H() < $$5.j() ? true : $$5.H() < $$4.j();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(jx $$0, @Nullable cyi<?> $$1, js<cua> $$2, int $$3) {
      if ($$1 != null && a($$0, $$1, $$2, $$3)) {
         cua $$4 = $$2.get(0);
         cua $$5 = $$1.b().a($$0);
         cua $$6 = $$2.get(2);
         if ($$6.e()) {
            $$2.set(2, $$5.s());
         } else if (cua.c($$6, $$5)) {
            $$6.g(1);
         }

         if ($$4.a(dfh.aP.r()) && !$$2.get(1).e() && $$2.get(1).a(cud.qy)) {
            $$2.set(1, new cua(cud.qz));
         }

         $$4.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int b(cua $$0) {
      if ($$0.e()) {
         return 0;
      } else {
         ctv $$1 = $$0.g();
         return g().getOrDefault($$1, 0);
      }
   }

   private static int a(dcd $$0, dpb $$1) {
      cyw $$2 = new cyw($$1.a(0));
      return $$1.z.a($$2, $$0).map($$0x -> ((cxo)$$0x.b()).d()).orElse(200);
   }

   public static boolean c(cua $$0) {
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
   public boolean a(int $$0, cua $$1, @Nullable jf $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cua $$1, jf $$2) {
      return $$2 == jf.a && $$0 == 1 ? $$1.a(cud.qz) || $$1.a(cud.qy) : true;
   }

   @Override
   public int b() {
      return this.l.size();
   }

   @Override
   protected js<cua> j() {
      return this.l;
   }

   @Override
   protected void a(js<cua> $$0) {
      this.l = $$0;
   }

   @Override
   public void a(int $$0, cua $$1) {
      cua $$2 = this.l.get($$0);
      boolean $$3 = !$$1.e() && cua.c($$2, $$1);
      this.l.set($$0, $$1);
      $$1.f(this.e_($$1));
      if ($$0 == 0 && !$$3) {
         this.w = a(this.n, this);
         this.v = 0;
         this.e();
      }
   }

   @Override
   public boolean b(int $$0, cua $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         cua $$2 = this.l.get(1);
         return c($$1) || $$1.a(cud.qy) && !$$2.a(cud.qy);
      }
   }

   @Override
   public void a(@Nullable cyi<?> $$0) {
      if ($$0 != null) {
         akk $$1 = $$0.a();
         this.y.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public cyi<?> d() {
      return null;
   }

   @Override
   public void a(cmh $$0, List<cua> $$1) {
   }

   public void a(aql $$0) {
      List<cyi<?>> $$1 = this.a($$0.z(), $$0.dn());
      $$0.a($$1);

      for (cyi<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.l);
         }
      }

      this.y.clear();
   }

   public List<cyi<?>> a(aqk $$0, evz $$1) {
      List<cyi<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.y.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<akk> $$3 = (Entry<akk>)var4.next();
         $$0.r().a((akk)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((cyi<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((cxo)$$4.b()).b());
         });
      }

      return $$2;
   }

   private static void a(aqk $$0, evz $$1, int $$2, float $$3) {
      int $$4 = aye.d((float)$$2 * $$3);
      float $$5 = aye.h((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      bso.a($$0, $$1, $$4);
   }

   @Override
   public void a(cml $$0) {
      for (cua $$1 : this.l) {
         $$0.b($$1);
      }
   }
}

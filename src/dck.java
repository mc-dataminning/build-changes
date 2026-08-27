import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class dck extends dcp implements bhh, cfx, cgg {
   protected static final int c = 0;
   protected static final int d = 1;
   protected static final int e = 2;
   public static final int f = 0;
   private static final int[] r = new int[]{0};
   private static final int[] s = new int[]{2, 1};
   private static final int[] t = new int[]{1};
   public static final int g = 1;
   public static final int h = 2;
   public static final int i = 3;
   public static final int j = 4;
   public static final int k = 200;
   public static final int l = 2;
   protected hp<cjf> m = hp.a(3, cjf.b);
   int u;
   int v;
   int w;
   int x;
   protected final cev n = new cev() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dck.this.u;
            case 1:
               return dck.this.v;
            case 2:
               return dck.this.w;
            case 3:
               return dck.this.x;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dck.this.u = $$1;
               break;
            case 1:
               dck.this.v = $$1;
               break;
            case 2:
               dck.this.w = $$1;
               break;
            case 3:
               dck.this.x = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Object2IntOpenHashMap<aex> y = new Object2IntOpenHashMap();
   private final cml.a<bgr, ? extends clr> z;

   protected dck(dcx<?> $$0, gw $$1, dfj $$2, cmn<? extends clr> $$3) {
      super($$0, $$1, $$2);
      this.z = cml.b($$3);
   }

   public static Map<cja, Integer> f() {
      Map<cja, Integer> $$0 = Maps.newLinkedHashMap();
      a($$0, cji.pM, 20000);
      a($$0, csw.iB, 16000);
      a($$0, cji.rr, 2400);
      a($$0, cji.nI, 1600);
      a($$0, cji.nJ, 1600);
      a($$0, aqb.r, 300);
      a($$0, aqb.C, 300);
      a($$0, aqb.b, 300);
      a($$0, csw.w, 300);
      a($$0, aqb.i, 300);
      a($$0, csw.hU, 300);
      a($$0, aqb.j, 150);
      a($$0, csw.jC, 150);
      a($$0, aqb.n, 300);
      a($$0, aqb.m, 300);
      a($$0, aqb.k, 300);
      a($$0, aqb.l, 300);
      a($$0, csw.aY, 300);
      a($$0, csw.cl, 300);
      a($$0, csw.cm, 300);
      a($$0, csw.oa, 300);
      a($$0, csw.dT, 300);
      a($$0, csw.cv, 300);
      a($$0, csw.gV, 300);
      a($$0, csw.cA, 300);
      a($$0, csw.gZ, 300);
      a($$0, aqb.E, 300);
      a($$0, cji.nG, 300);
      a($$0, cji.qh, 300);
      a($$0, csw.cO, 300);
      a($$0, aqb.ap, 200);
      a($$0, aqb.aE, 800);
      a($$0, cji.nY, 200);
      a($$0, cji.nX, 200);
      a($$0, cji.ob, 200);
      a($$0, cji.oa, 200);
      a($$0, cji.nZ, 200);
      a($$0, aqb.h, 200);
      a($$0, aqb.am, 1200);
      a($$0, aqb.a, 100);
      a($$0, aqb.d, 100);
      a($$0, cji.oB, 100);
      a($$0, aqb.p, 100);
      a($$0, cji.oC, 100);
      a($$0, aqb.g, 67);
      a($$0, csw.me, 4001);
      a($$0, cji.uZ, 300);
      a($$0, csw.mZ, 50);
      a($$0, csw.bv, 100);
      a($$0, csw.nS, 50);
      a($$0, csw.nT, 300);
      a($$0, csw.nU, 300);
      a($$0, csw.nX, 300);
      a($$0, csw.nY, 300);
      a($$0, csw.ob, 300);
      a($$0, csw.pc, 300);
      a($$0, csw.rx, 100);
      a($$0, csw.ry, 100);
      a($$0, csw.ac, 300);
      return $$0;
   }

   private static boolean b(cja $$0) {
      return $$0.j().a(aqb.ag);
   }

   private static void a(Map<cja, Integer> $$0, aqi<cja> $$1, int $$2) {
      for (hg<cja> $$3 : jd.i.c($$1)) {
         if (!b($$3.a())) {
            $$0.put($$3.a(), $$2);
         }
      }
   }

   private static void a(Map<cja, Integer> $$0, cpu $$1, int $$2) {
      cja $$3 = $$1.k();
      if (b($$3)) {
         if (aa.aT) {
            throw (IllegalStateException)ac.b(
               new IllegalStateException(
                  "A developer tried to explicitly make fire resistant item " + $$3.m(null).getString() + " a furnace fuel. That will not work!"
               )
            );
         }
      } else {
         $$0.put($$3, $$2);
      }
   }

   private boolean i() {
      return this.u > 0;
   }

   @Override
   public void a(qx $$0) {
      super.a($$0);
      this.m = hp.a(this.b(), cjf.b);
      bgs.b($$0, this.m);
      this.u = $$0.g("BurnTime");
      this.w = $$0.g("CookTime");
      this.x = $$0.g("CookTimeTotal");
      this.v = this.a(this.m.get(1));
      qx $$1 = $$0.p("RecipesUsed");

      for (String $$2 : $$1.e()) {
         this.y.put(new aex($$2), $$1.h($$2));
      }
   }

   @Override
   protected void b(qx $$0) {
      super.b($$0);
      $$0.a("BurnTime", (short)this.u);
      $$0.a("CookTime", (short)this.w);
      $$0.a("CookTimeTotal", (short)this.x);
      bgs.a($$0, this.m);
      qx $$1 = new qx();
      this.y.forEach(($$1x, $$2) -> $$1.a($$1x.toString(), $$2));
      $$0.a("RecipesUsed", $$1);
   }

   public static void a(cpv $$0, gw $$1, dfj $$2, dck $$3) {
      boolean $$4 = $$3.i();
      boolean $$5 = false;
      if ($$3.i()) {
         $$3.u--;
      }

      cjf $$6 = $$3.m.get(1);
      boolean $$7 = !$$3.m.get(0).b();
      boolean $$8 = !$$6.b();
      if ($$3.i() || $$8 && $$7) {
         cmk<?> $$9;
         if ($$7) {
            $$9 = $$3.z.a($$3, $$0).orElse(null);
         } else {
            $$9 = null;
         }

         int $$11 = $$3.ag_();
         if (!$$3.i() && a($$0.G_(), $$9, $$3.m, $$11)) {
            $$3.u = $$3.a($$6);
            $$3.v = $$3.u;
            if ($$3.i()) {
               $$5 = true;
               if ($$8) {
                  cja $$12 = $$6.d();
                  $$6.h(1);
                  if ($$6.b()) {
                     cja $$13 = $$12.s();
                     $$3.m.set(1, $$13 == null ? cjf.b : new cjf($$13));
                  }
               }
            }
         }

         if ($$3.i() && a($$0.G_(), $$9, $$3.m, $$11)) {
            $$3.w++;
            if ($$3.w == $$3.x) {
               $$3.w = 0;
               $$3.x = a($$0, $$3);
               if (b($$0.G_(), $$9, $$3.m, $$11)) {
                  $$3.a($$9);
               }

               $$5 = true;
            }
         } else {
            $$3.w = 0;
         }
      } else if (!$$3.i() && $$3.w > 0) {
         $$3.w = arx.a($$3.w - 2, 0, $$3.x);
      }

      if ($$4 != $$3.i()) {
         $$5 = true;
         $$2 = $$2.a(crq.b, Boolean.valueOf($$3.i()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(hu $$0, @Nullable cmk<?> $$1, hp<cjf> $$2, int $$3) {
      if (!$$2.get(0).b() && $$1 != null) {
         cjf $$4 = $$1.b().a($$0);
         if ($$4.b()) {
            return false;
         } else {
            cjf $$5 = $$2.get(2);
            if ($$5.b()) {
               return true;
            } else if (!cjf.b($$5, $$4)) {
               return false;
            } else {
               return $$5.L() < $$3 && $$5.L() < $$5.g() ? true : $$5.L() < $$4.g();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(hu $$0, @Nullable cmk<?> $$1, hp<cjf> $$2, int $$3) {
      if ($$1 != null && a($$0, $$1, $$2, $$3)) {
         cjf $$4 = $$2.get(0);
         cjf $$5 = $$1.b().a($$0);
         cjf $$6 = $$2.get(2);
         if ($$6.b()) {
            $$2.set(2, $$5.p());
         } else if ($$6.a($$5.d())) {
            $$6.g(1);
         }

         if ($$4.a(csw.aP.k()) && !$$2.get(1).b() && $$2.get(1).a(cji.pK)) {
            $$2.set(1, new cjf(cji.pL));
         }

         $$4.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int a(cjf $$0) {
      if ($$0.b()) {
         return 0;
      } else {
         cja $$1 = $$0.d();
         return f().getOrDefault($$1, 0);
      }
   }

   private static int a(cpv $$0, dck $$1) {
      return $$1.z.a($$1, $$0).map($$0x -> ((clr)$$0x.b()).d()).orElse(200);
   }

   public static boolean b(cjf $$0) {
      return f().containsKey($$0.d());
   }

   @Override
   public int[] a(hc $$0) {
      if ($$0 == hc.a) {
         return s;
      } else {
         return $$0 == hc.b ? r : t;
      }
   }

   @Override
   public boolean a(int $$0, cjf $$1, @Nullable hc $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cjf $$1, hc $$2) {
      return $$2 == hc.a && $$0 == 1 ? $$1.a(cji.pL) || $$1.a(cji.pK) : true;
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   public boolean af_() {
      for (cjf $$0 : this.m) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cjf a(int $$0) {
      return this.m.get($$0);
   }

   @Override
   public cjf a(int $$0, int $$1) {
      return bgs.a(this.m, $$0, $$1);
   }

   @Override
   public cjf b(int $$0) {
      return bgs.a(this.m, $$0);
   }

   @Override
   public void a(int $$0, cjf $$1) {
      cjf $$2 = this.m.get($$0);
      boolean $$3 = !$$1.b() && cjf.c($$2, $$1);
      this.m.set($$0, $$1);
      if ($$1.L() > this.ag_()) {
         $$1.f(this.ag_());
      }

      if ($$0 == 0 && !$$3) {
         this.x = a(this.o, this);
         this.w = 0;
         this.e();
      }
   }

   @Override
   public boolean a(cbu $$0) {
      return bgr.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cjf $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         cjf $$2 = this.m.get(1);
         return b($$1) || $$1.a(cji.pK) && !$$2.a(cji.pK);
      }
   }

   @Override
   public void a() {
      this.m.clear();
   }

   @Override
   public void a(@Nullable cmk<?> $$0) {
      if ($$0 != null) {
         aex $$1 = $$0.a();
         this.y.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public cmk<?> d() {
      return null;
   }

   @Override
   public void a(cbu $$0, List<cjf> $$1) {
   }

   public void a(aks $$0) {
      List<cmk<?>> $$1 = this.a($$0.x(), $$0.dj());
      $$0.a($$1);

      for (cmk<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.m);
         }
      }

      this.y.clear();
   }

   public List<cmk<?>> a(akr $$0, ehn $$1) {
      List<cmk<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.y.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<aex> $$3 = (Entry<aex>)var4.next();
         $$0.q().a((aex)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((cmk<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((clr)$$4.b()).b());
         });
      }

      return $$2;
   }

   private static void a(akr $$0, ehn $$1, int $$2, float $$3) {
      int $$4 = arx.d((float)$$2 * $$3);
      float $$5 = arx.h((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      biw.a($$0, $$1, $$4);
   }

   @Override
   public void a(cby $$0) {
      for (cjf $$1 : this.m) {
         $$0.b($$1);
      }
   }
}

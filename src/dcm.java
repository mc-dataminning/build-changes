import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class dcm extends dcr implements bhj, cfz, cgi {
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
   protected hp<cjh> m = hp.a(3, cjh.b);
   int u;
   int v;
   int w;
   int x;
   protected final cex n = new cex() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dcm.this.u;
            case 1:
               return dcm.this.v;
            case 2:
               return dcm.this.w;
            case 3:
               return dcm.this.x;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dcm.this.u = $$1;
               break;
            case 1:
               dcm.this.v = $$1;
               break;
            case 2:
               dcm.this.w = $$1;
               break;
            case 3:
               dcm.this.x = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Object2IntOpenHashMap<aey> y = new Object2IntOpenHashMap();
   private final cmn.a<bgt, ? extends clt> z;

   protected dcm(dcz<?> $$0, gw $$1, dfl $$2, cmp<? extends clt> $$3) {
      super($$0, $$1, $$2);
      this.z = cmn.b($$3);
   }

   public static Map<cjc, Integer> f() {
      Map<cjc, Integer> $$0 = Maps.newLinkedHashMap();
      a($$0, cjk.pM, 20000);
      a($$0, csy.iB, 16000);
      a($$0, cjk.rr, 2400);
      a($$0, cjk.nI, 1600);
      a($$0, cjk.nJ, 1600);
      a($$0, aqc.r, 300);
      a($$0, aqc.C, 300);
      a($$0, aqc.b, 300);
      a($$0, csy.w, 300);
      a($$0, aqc.i, 300);
      a($$0, csy.hU, 300);
      a($$0, aqc.j, 150);
      a($$0, csy.jC, 150);
      a($$0, aqc.n, 300);
      a($$0, aqc.m, 300);
      a($$0, aqc.k, 300);
      a($$0, aqc.l, 300);
      a($$0, csy.aY, 300);
      a($$0, csy.cl, 300);
      a($$0, csy.cm, 300);
      a($$0, csy.oa, 300);
      a($$0, csy.dT, 300);
      a($$0, csy.cv, 300);
      a($$0, csy.gV, 300);
      a($$0, csy.cA, 300);
      a($$0, csy.gZ, 300);
      a($$0, aqc.E, 300);
      a($$0, cjk.nG, 300);
      a($$0, cjk.qh, 300);
      a($$0, csy.cO, 300);
      a($$0, aqc.ap, 200);
      a($$0, aqc.aE, 800);
      a($$0, cjk.nY, 200);
      a($$0, cjk.nX, 200);
      a($$0, cjk.ob, 200);
      a($$0, cjk.oa, 200);
      a($$0, cjk.nZ, 200);
      a($$0, aqc.h, 200);
      a($$0, aqc.am, 1200);
      a($$0, aqc.a, 100);
      a($$0, aqc.d, 100);
      a($$0, cjk.oB, 100);
      a($$0, aqc.p, 100);
      a($$0, cjk.oC, 100);
      a($$0, aqc.g, 67);
      a($$0, csy.me, 4001);
      a($$0, cjk.uZ, 300);
      a($$0, csy.mZ, 50);
      a($$0, csy.bv, 100);
      a($$0, csy.nS, 50);
      a($$0, csy.nT, 300);
      a($$0, csy.nU, 300);
      a($$0, csy.nX, 300);
      a($$0, csy.nY, 300);
      a($$0, csy.ob, 300);
      a($$0, csy.pc, 300);
      a($$0, csy.rx, 100);
      a($$0, csy.ry, 100);
      a($$0, csy.ac, 300);
      return $$0;
   }

   private static boolean b(cjc $$0) {
      return $$0.j().a(aqc.ag);
   }

   private static void a(Map<cjc, Integer> $$0, aqj<cjc> $$1, int $$2) {
      for (hg<cjc> $$3 : jd.i.c($$1)) {
         if (!b($$3.a())) {
            $$0.put($$3.a(), $$2);
         }
      }
   }

   private static void a(Map<cjc, Integer> $$0, cpw $$1, int $$2) {
      cjc $$3 = $$1.k();
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
   public void a(qy $$0) {
      super.a($$0);
      this.m = hp.a(this.b(), cjh.b);
      bgu.b($$0, this.m);
      this.u = $$0.g("BurnTime");
      this.w = $$0.g("CookTime");
      this.x = $$0.g("CookTimeTotal");
      this.v = this.a(this.m.get(1));
      qy $$1 = $$0.p("RecipesUsed");

      for (String $$2 : $$1.e()) {
         this.y.put(new aey($$2), $$1.h($$2));
      }
   }

   @Override
   protected void b(qy $$0) {
      super.b($$0);
      $$0.a("BurnTime", (short)this.u);
      $$0.a("CookTime", (short)this.w);
      $$0.a("CookTimeTotal", (short)this.x);
      bgu.a($$0, this.m);
      qy $$1 = new qy();
      this.y.forEach(($$1x, $$2) -> $$1.a($$1x.toString(), $$2));
      $$0.a("RecipesUsed", $$1);
   }

   public static void a(cpx $$0, gw $$1, dfl $$2, dcm $$3) {
      boolean $$4 = $$3.i();
      boolean $$5 = false;
      if ($$3.i()) {
         $$3.u--;
      }

      cjh $$6 = $$3.m.get(1);
      boolean $$7 = !$$3.m.get(0).b();
      boolean $$8 = !$$6.b();
      if ($$3.i() || $$8 && $$7) {
         cmm<?> $$9;
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
                  cjc $$12 = $$6.d();
                  $$6.h(1);
                  if ($$6.b()) {
                     cjc $$13 = $$12.s();
                     $$3.m.set(1, $$13 == null ? cjh.b : new cjh($$13));
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
         $$3.w = ary.a($$3.w - 2, 0, $$3.x);
      }

      if ($$4 != $$3.i()) {
         $$5 = true;
         $$2 = $$2.a(crs.b, Boolean.valueOf($$3.i()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(hu $$0, @Nullable cmm<?> $$1, hp<cjh> $$2, int $$3) {
      if (!$$2.get(0).b() && $$1 != null) {
         cjh $$4 = $$1.b().a($$0);
         if ($$4.b()) {
            return false;
         } else {
            cjh $$5 = $$2.get(2);
            if ($$5.b()) {
               return true;
            } else if (!cjh.b($$5, $$4)) {
               return false;
            } else {
               return $$5.L() < $$3 && $$5.L() < $$5.g() ? true : $$5.L() < $$4.g();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(hu $$0, @Nullable cmm<?> $$1, hp<cjh> $$2, int $$3) {
      if ($$1 != null && a($$0, $$1, $$2, $$3)) {
         cjh $$4 = $$2.get(0);
         cjh $$5 = $$1.b().a($$0);
         cjh $$6 = $$2.get(2);
         if ($$6.b()) {
            $$2.set(2, $$5.p());
         } else if ($$6.a($$5.d())) {
            $$6.g(1);
         }

         if ($$4.a(csy.aP.k()) && !$$2.get(1).b() && $$2.get(1).a(cjk.pK)) {
            $$2.set(1, new cjh(cjk.pL));
         }

         $$4.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int a(cjh $$0) {
      if ($$0.b()) {
         return 0;
      } else {
         cjc $$1 = $$0.d();
         return f().getOrDefault($$1, 0);
      }
   }

   private static int a(cpx $$0, dcm $$1) {
      return $$1.z.a($$1, $$0).map($$0x -> ((clt)$$0x.b()).d()).orElse(200);
   }

   public static boolean b(cjh $$0) {
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
   public boolean a(int $$0, cjh $$1, @Nullable hc $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cjh $$1, hc $$2) {
      return $$2 == hc.a && $$0 == 1 ? $$1.a(cjk.pL) || $$1.a(cjk.pK) : true;
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   public boolean af_() {
      for (cjh $$0 : this.m) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cjh a(int $$0) {
      return this.m.get($$0);
   }

   @Override
   public cjh a(int $$0, int $$1) {
      return bgu.a(this.m, $$0, $$1);
   }

   @Override
   public cjh b(int $$0) {
      return bgu.a(this.m, $$0);
   }

   @Override
   public void a(int $$0, cjh $$1) {
      cjh $$2 = this.m.get($$0);
      boolean $$3 = !$$1.b() && cjh.c($$2, $$1);
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
   public boolean a(cbw $$0) {
      return bgt.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cjh $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         cjh $$2 = this.m.get(1);
         return b($$1) || $$1.a(cjk.pK) && !$$2.a(cjk.pK);
      }
   }

   @Override
   public void a() {
      this.m.clear();
   }

   @Override
   public void a(@Nullable cmm<?> $$0) {
      if ($$0 != null) {
         aey $$1 = $$0.a();
         this.y.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public cmm<?> d() {
      return null;
   }

   @Override
   public void a(cbw $$0, List<cjh> $$1) {
   }

   public void a(akt $$0) {
      List<cmm<?>> $$1 = this.a($$0.x(), $$0.dj());
      $$0.a($$1);

      for (cmm<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.m);
         }
      }

      this.y.clear();
   }

   public List<cmm<?>> a(aks $$0, ehp $$1) {
      List<cmm<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.y.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<aey> $$3 = (Entry<aey>)var4.next();
         $$0.q().a((aey)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((cmm<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((clt)$$4.b()).b());
         });
      }

      return $$2;
   }

   private static void a(aks $$0, ehp $$1, int $$2, float $$3) {
      int $$4 = ary.d((float)$$2 * $$3);
      float $$5 = ary.h((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      biy.a($$0, $$1, $$4);
   }

   @Override
   public void a(cca $$0) {
      for (cjh $$1 : this.m) {
         $$0.b($$1);
      }
   }
}

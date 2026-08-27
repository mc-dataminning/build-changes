import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class dmr extends dmx implements bpc, cox, cpi {
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
   protected je<csd> m = je.a(3, csd.i);
   int u;
   int v;
   int w;
   int x;
   @Nullable
   private static volatile Map<cry, Integer> y;
   protected final cnr n = new cnr() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dmr.this.u;
            case 1:
               return dmr.this.v;
            case 2:
               return dmr.this.w;
            case 3:
               return dmr.this.x;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dmr.this.u = $$1;
               break;
            case 1:
               dmr.this.v = $$1;
               break;
            case 2:
               dmr.this.w = $$1;
               break;
            case 3:
               dmr.this.x = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Object2IntOpenHashMap<akf> z = new Object2IntOpenHashMap();
   private final cwj.a<boj, ? extends cvp> A;

   protected dmr(dnf<?> $$0, im $$1, dpy $$2, cwl<? extends cvp> $$3) {
      super($$0, $$1, $$2);
      this.A = cwj.b($$3);
   }

   public static void f() {
      y = null;
   }

   public static Map<cry, Integer> g() {
      Map<cry, Integer> $$0 = y;
      if ($$0 != null) {
         return $$0;
      } else {
         Map<cry, Integer> $$1 = Maps.newLinkedHashMap();
         a($$1, csg.qA, 20000);
         a($$1, dcx.iB, 16000);
         a($$1, csg.sg, 2400);
         a($$1, csg.ow, 1600);
         a($$1, csg.ox, 1600);
         a($$1, avw.r, 300);
         a($$1, avw.C, 300);
         a($$1, avw.b, 300);
         a($$1, dcx.w, 300);
         a($$1, avw.i, 300);
         a($$1, dcx.hU, 300);
         a($$1, avw.j, 150);
         a($$1, dcx.jC, 150);
         a($$1, avw.n, 300);
         a($$1, avw.m, 300);
         a($$1, avw.k, 300);
         a($$1, avw.l, 300);
         a($$1, dcx.aY, 300);
         a($$1, dcx.cl, 300);
         a($$1, dcx.cm, 300);
         a($$1, dcx.oa, 300);
         a($$1, dcx.dT, 300);
         a($$1, dcx.cv, 300);
         a($$1, dcx.gV, 300);
         a($$1, dcx.cA, 300);
         a($$1, dcx.gZ, 300);
         a($$1, avw.E, 300);
         a($$1, csg.ou, 300);
         a($$1, csg.qV, 300);
         a($$1, dcx.cO, 300);
         a($$1, avw.ap, 200);
         a($$1, avw.aE, 800);
         a($$1, csg.oM, 200);
         a($$1, csg.oL, 200);
         a($$1, csg.oP, 200);
         a($$1, csg.oO, 200);
         a($$1, csg.oN, 200);
         a($$1, avw.h, 200);
         a($$1, avw.am, 1200);
         a($$1, avw.a, 100);
         a($$1, avw.d, 100);
         a($$1, csg.pp, 100);
         a($$1, avw.p, 100);
         a($$1, csg.pq, 100);
         a($$1, avw.g, 67);
         a($$1, dcx.me, 4001);
         a($$1, csg.vT, 300);
         a($$1, dcx.mZ, 50);
         a($$1, dcx.bv, 100);
         a($$1, dcx.nS, 50);
         a($$1, dcx.nT, 300);
         a($$1, dcx.nU, 300);
         a($$1, dcx.nX, 300);
         a($$1, dcx.nY, 300);
         a($$1, dcx.ob, 300);
         a($$1, dcx.pc, 300);
         a($$1, dcx.sy, 100);
         a($$1, dcx.sz, 100);
         a($$1, dcx.ac, 300);
         y = $$1;
         return $$1;
      }
   }

   private static boolean b(cry $$0) {
      return $$0.n().a(avw.ag);
   }

   private static void a(Map<cry, Integer> $$0, awd<cry> $$1, int $$2) {
      for (iv<cry> $$3 : lc.h.c($$1)) {
         if (!b($$3.a())) {
            $$0.put($$3.a(), $$2);
         }
      }
   }

   private static void a(Map<cry, Integer> $$0, czt $$1, int $$2) {
      cry $$3 = $$1.p();
      if (b($$3)) {
         if (aa.aX) {
            throw (IllegalStateException)ac.b(
               new IllegalStateException(
                  "A developer tried to explicitly make fire resistant item " + $$3.o(null).getString() + " a furnace fuel. That will not work!"
               )
            );
         }
      } else {
         $$0.put($$3, $$2);
      }
   }

   private boolean l() {
      return this.u > 0;
   }

   @Override
   public void a(ty $$0, ix.a $$1) {
      super.a($$0, $$1);
      this.m = je.a(this.b(), csd.i);
      bok.b($$0, this.m, $$1);
      this.u = $$0.g("BurnTime");
      this.w = $$0.g("CookTime");
      this.x = $$0.g("CookTimeTotal");
      this.v = this.a(this.m.get(1));
      ty $$2 = $$0.p("RecipesUsed");

      for (String $$3 : $$2.e()) {
         this.z.put(new akf($$3), $$2.h($$3));
      }
   }

   @Override
   protected void b(ty $$0, ix.a $$1) {
      super.b($$0, $$1);
      $$0.a("BurnTime", (short)this.u);
      $$0.a("CookTime", (short)this.w);
      $$0.a("CookTimeTotal", (short)this.x);
      bok.a($$0, this.m, $$1);
      ty $$2 = new ty();
      this.z.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), $$2x));
      $$0.a("RecipesUsed", $$2);
   }

   public static void a(czu $$0, im $$1, dpy $$2, dmr $$3) {
      boolean $$4 = $$3.l();
      boolean $$5 = false;
      if ($$3.l()) {
         $$3.u--;
      }

      csd $$6 = $$3.m.get(1);
      boolean $$7 = !$$3.m.get(0).d();
      boolean $$8 = !$$6.d();
      if ($$3.l() || $$8 && $$7) {
         cwi<?> $$9;
         if ($$7) {
            $$9 = $$3.A.a($$3, $$0).orElse(null);
         } else {
            $$9 = null;
         }

         int $$11 = $$3.ah_();
         if (!$$3.l() && a($$0.H_(), $$9, $$3.m, $$11)) {
            $$3.u = $$3.a($$6);
            $$3.v = $$3.u;
            if ($$3.l()) {
               $$5 = true;
               if ($$8) {
                  cry $$12 = $$6.f();
                  $$6.g(1);
                  if ($$6.d()) {
                     cry $$13 = $$12.v();
                     $$3.m.set(1, $$13 == null ? csd.i : new csd($$13));
                  }
               }
            }
         }

         if ($$3.l() && a($$0.H_(), $$9, $$3.m, $$11)) {
            $$3.w++;
            if ($$3.w == $$3.x) {
               $$3.w = 0;
               $$3.x = a($$0, $$3);
               if (b($$0.H_(), $$9, $$3.m, $$11)) {
                  $$3.a($$9);
               }

               $$5 = true;
            }
         } else {
            $$3.w = 0;
         }
      } else if (!$$3.l() && $$3.w > 0) {
         $$3.w = axw.a($$3.w - 2, 0, $$3.x);
      }

      if ($$4 != $$3.l()) {
         $$5 = true;
         $$2 = $$2.a(dbq.b, Boolean.valueOf($$3.l()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(jj $$0, @Nullable cwi<?> $$1, je<csd> $$2, int $$3) {
      if (!$$2.get(0).d() && $$1 != null) {
         csd $$4 = $$1.b().a($$0);
         if ($$4.d()) {
            return false;
         } else {
            csd $$5 = $$2.get(2);
            if ($$5.d()) {
               return true;
            } else if (!csd.c($$5, $$4)) {
               return false;
            } else {
               return $$5.G() < $$3 && $$5.G() < $$5.i() ? true : $$5.G() < $$4.i();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(jj $$0, @Nullable cwi<?> $$1, je<csd> $$2, int $$3) {
      if ($$1 != null && a($$0, $$1, $$2, $$3)) {
         csd $$4 = $$2.get(0);
         csd $$5 = $$1.b().a($$0);
         csd $$6 = $$2.get(2);
         if ($$6.d()) {
            $$2.set(2, $$5.r());
         } else if (csd.c($$6, $$5)) {
            $$6.f(1);
         }

         if ($$4.a(dcx.aP.p()) && !$$2.get(1).d() && $$2.get(1).a(csg.qy)) {
            $$2.set(1, new csd(csg.qz));
         }

         $$4.g(1);
         return true;
      } else {
         return false;
      }
   }

   protected int a(csd $$0) {
      if ($$0.d()) {
         return 0;
      } else {
         cry $$1 = $$0.f();
         return g().getOrDefault($$1, 0);
      }
   }

   private static int a(czu $$0, dmr $$1) {
      return $$1.A.a($$1, $$0).map($$0x -> ((cvp)$$0x.b()).d()).orElse(200);
   }

   public static boolean b(csd $$0) {
      return g().containsKey($$0.f());
   }

   @Override
   public int[] a(ir $$0) {
      if ($$0 == ir.a) {
         return s;
      } else {
         return $$0 == ir.b ? r : t;
      }
   }

   @Override
   public boolean a(int $$0, csd $$1, @Nullable ir $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, csd $$1, ir $$2) {
      return $$2 == ir.a && $$0 == 1 ? $$1.a(csg.qz) || $$1.a(csg.qy) : true;
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   protected je<csd> j() {
      return this.m;
   }

   @Override
   protected void a(je<csd> $$0) {
      this.m = $$0;
   }

   @Override
   public void a(int $$0, csd $$1) {
      csd $$2 = this.m.get($$0);
      boolean $$3 = !$$1.d() && csd.c($$2, $$1);
      this.m.set($$0, $$1);
      if ($$1.G() > this.ah_()) {
         $$1.e(this.ah_());
      }

      if ($$0 == 0 && !$$3) {
         this.x = a(this.o, this);
         this.w = 0;
         this.e();
      }
   }

   @Override
   public boolean b(int $$0, csd $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         csd $$2 = this.m.get(1);
         return b($$1) || $$1.a(csg.qy) && !$$2.a(csg.qy);
      }
   }

   @Override
   public void a(@Nullable cwi<?> $$0) {
      if ($$0 != null) {
         akf $$1 = $$0.a();
         this.z.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public cwi<?> d() {
      return null;
   }

   @Override
   public void a(ckl $$0, List<csd> $$1) {
   }

   public void a(aqf $$0) {
      List<cwi<?>> $$1 = this.a($$0.z(), $$0.dl());
      $$0.a($$1);

      for (cwi<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.m);
         }
      }

      this.z.clear();
   }

   public List<cwi<?>> a(aqe $$0, etf $$1) {
      List<cwi<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.z.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<akf> $$3 = (Entry<akf>)var4.next();
         $$0.r().a((akf)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((cwi<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((cvp)$$4.b()).b());
         });
      }

      return $$2;
   }

   private static void a(aqe $$0, etf $$1, int $$2, float $$3) {
      int $$4 = axw.d((float)$$2 * $$3);
      float $$5 = axw.h((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      bqu.a($$0, $$1, $$4);
   }

   @Override
   public void a(ckp $$0) {
      for (csd $$1 : this.m) {
         $$0.b($$1);
      }
   }
}

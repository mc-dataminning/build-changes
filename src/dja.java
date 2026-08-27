import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class dja extends djf implements bmx, cmj, cms {
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
   protected iu<cpq> m = iu.a(3, cpq.h);
   int u;
   int v;
   int w;
   int x;
   @Nullable
   private static volatile Map<cpl, Integer> y;
   protected final cle n = new cle() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dja.this.u;
            case 1:
               return dja.this.v;
            case 2:
               return dja.this.w;
            case 3:
               return dja.this.x;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dja.this.u = $$1;
               break;
            case 1:
               dja.this.v = $$1;
               break;
            case 2:
               dja.this.w = $$1;
               break;
            case 3:
               dja.this.x = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Object2IntOpenHashMap<ajc> z = new Object2IntOpenHashMap();
   private final csv.a<bme, ? extends csb> A;

   protected dja(djn<?> $$0, ib $$1, dme $$2, csx<? extends csb> $$3) {
      super($$0, $$1, $$2);
      this.A = csv.b($$3);
   }

   public static void f() {
      y = null;
   }

   public static Map<cpl, Integer> g() {
      Map<cpl, Integer> $$0 = y;
      if ($$0 != null) {
         return $$0;
      } else {
         Map<cpl, Integer> $$1 = Maps.newLinkedHashMap();
         a($$1, cpt.qz, 20000);
         a($$1, czh.iB, 16000);
         a($$1, cpt.sf, 2400);
         a($$1, cpt.ov, 1600);
         a($$1, cpt.ow, 1600);
         a($$1, aum.r, 300);
         a($$1, aum.C, 300);
         a($$1, aum.b, 300);
         a($$1, czh.w, 300);
         a($$1, aum.i, 300);
         a($$1, czh.hU, 300);
         a($$1, aum.j, 150);
         a($$1, czh.jC, 150);
         a($$1, aum.n, 300);
         a($$1, aum.m, 300);
         a($$1, aum.k, 300);
         a($$1, aum.l, 300);
         a($$1, czh.aY, 300);
         a($$1, czh.cl, 300);
         a($$1, czh.cm, 300);
         a($$1, czh.oa, 300);
         a($$1, czh.dT, 300);
         a($$1, czh.cv, 300);
         a($$1, czh.gV, 300);
         a($$1, czh.cA, 300);
         a($$1, czh.gZ, 300);
         a($$1, aum.E, 300);
         a($$1, cpt.ot, 300);
         a($$1, cpt.qU, 300);
         a($$1, czh.cO, 300);
         a($$1, aum.ap, 200);
         a($$1, aum.aE, 800);
         a($$1, cpt.oL, 200);
         a($$1, cpt.oK, 200);
         a($$1, cpt.oO, 200);
         a($$1, cpt.oN, 200);
         a($$1, cpt.oM, 200);
         a($$1, aum.h, 200);
         a($$1, aum.am, 1200);
         a($$1, aum.a, 100);
         a($$1, aum.d, 100);
         a($$1, cpt.po, 100);
         a($$1, aum.p, 100);
         a($$1, cpt.pp, 100);
         a($$1, aum.g, 67);
         a($$1, czh.me, 4001);
         a($$1, cpt.vP, 300);
         a($$1, czh.mZ, 50);
         a($$1, czh.bv, 100);
         a($$1, czh.nS, 50);
         a($$1, czh.nT, 300);
         a($$1, czh.nU, 300);
         a($$1, czh.nX, 300);
         a($$1, czh.nY, 300);
         a($$1, czh.ob, 300);
         a($$1, czh.pc, 300);
         a($$1, czh.sy, 100);
         a($$1, czh.sz, 100);
         a($$1, czh.ac, 300);
         y = $$1;
         return $$1;
      }
   }

   private static boolean b(cpl $$0) {
      return $$0.k().a(aum.ag);
   }

   private static void a(Map<cpl, Integer> $$0, aut<cpl> $$1, int $$2) {
      for (il<cpl> $$3 : kh.h.c($$1)) {
         if (!b($$3.a())) {
            $$0.put($$3.a(), $$2);
         }
      }
   }

   private static void a(Map<cpl, Integer> $$0, cwd $$1, int $$2) {
      cpl $$3 = $$1.l();
      if (b($$3)) {
         if (aa.aV) {
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

   private boolean j() {
      return this.u > 0;
   }

   @Override
   public void a(sy $$0, in.a $$1) {
      super.a($$0, $$1);
      this.m = iu.a(this.b(), cpq.h);
      bmf.b($$0, this.m);
      this.u = $$0.g("BurnTime");
      this.w = $$0.g("CookTime");
      this.x = $$0.g("CookTimeTotal");
      this.v = this.a(this.m.get(1));
      sy $$2 = $$0.p("RecipesUsed");

      for (String $$3 : $$2.e()) {
         this.z.put(new ajc($$3), $$2.h($$3));
      }
   }

   @Override
   protected void b(sy $$0, in.a $$1) {
      super.b($$0, $$1);
      $$0.a("BurnTime", (short)this.u);
      $$0.a("CookTime", (short)this.w);
      $$0.a("CookTimeTotal", (short)this.x);
      bmf.a($$0, this.m);
      sy $$2 = new sy();
      this.z.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), $$2x));
      $$0.a("RecipesUsed", $$2);
   }

   public static void a(cwe $$0, ib $$1, dme $$2, dja $$3) {
      boolean $$4 = $$3.j();
      boolean $$5 = false;
      if ($$3.j()) {
         $$3.u--;
      }

      cpq $$6 = $$3.m.get(1);
      boolean $$7 = !$$3.m.get(0).b();
      boolean $$8 = !$$6.b();
      if ($$3.j() || $$8 && $$7) {
         csu<?> $$9;
         if ($$7) {
            $$9 = $$3.A.a($$3, $$0).orElse(null);
         } else {
            $$9 = null;
         }

         int $$11 = $$3.al_();
         if (!$$3.j() && a($$0.I_(), $$9, $$3.m, $$11)) {
            $$3.u = $$3.a($$6);
            $$3.v = $$3.u;
            if ($$3.j()) {
               $$5 = true;
               if ($$8) {
                  cpl $$12 = $$6.d();
                  $$6.h(1);
                  if ($$6.b()) {
                     cpl $$13 = $$12.t();
                     $$3.m.set(1, $$13 == null ? cpq.h : new cpq($$13));
                  }
               }
            }
         }

         if ($$3.j() && a($$0.I_(), $$9, $$3.m, $$11)) {
            $$3.w++;
            if ($$3.w == $$3.x) {
               $$3.w = 0;
               $$3.x = a($$0, $$3);
               if (b($$0.I_(), $$9, $$3.m, $$11)) {
                  $$3.a($$9);
               }

               $$5 = true;
            }
         } else {
            $$3.w = 0;
         }
      } else if (!$$3.j() && $$3.w > 0) {
         $$3.w = awm.a($$3.w - 2, 0, $$3.x);
      }

      if ($$4 != $$3.j()) {
         $$5 = true;
         $$2 = $$2.a(cya.b, Boolean.valueOf($$3.j()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(iy $$0, @Nullable csu<?> $$1, iu<cpq> $$2, int $$3) {
      if (!$$2.get(0).b() && $$1 != null) {
         cpq $$4 = $$1.b().a($$0);
         if ($$4.b()) {
            return false;
         } else {
            cpq $$5 = $$2.get(2);
            if ($$5.b()) {
               return true;
            } else if (!cpq.b($$5, $$4)) {
               return false;
            } else {
               return $$5.M() < $$3 && $$5.M() < $$5.g() ? true : $$5.M() < $$4.g();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(iy $$0, @Nullable csu<?> $$1, iu<cpq> $$2, int $$3) {
      if ($$1 != null && a($$0, $$1, $$2, $$3)) {
         cpq $$4 = $$2.get(0);
         cpq $$5 = $$1.b().a($$0);
         cpq $$6 = $$2.get(2);
         if ($$6.b()) {
            $$2.set(2, $$5.q());
         } else if ($$6.a($$5.d())) {
            $$6.g(1);
         }

         if ($$4.a(czh.aP.l()) && !$$2.get(1).b() && $$2.get(1).a(cpt.qx)) {
            $$2.set(1, new cpq(cpt.qy));
         }

         $$4.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int a(cpq $$0) {
      if ($$0.b()) {
         return 0;
      } else {
         cpl $$1 = $$0.d();
         return g().getOrDefault($$1, 0);
      }
   }

   private static int a(cwe $$0, dja $$1) {
      return $$1.A.a($$1, $$0).map($$0x -> ((csb)$$0x.b()).d()).orElse(200);
   }

   public static boolean b(cpq $$0) {
      return g().containsKey($$0.d());
   }

   @Override
   public int[] a(ih $$0) {
      if ($$0 == ih.a) {
         return s;
      } else {
         return $$0 == ih.b ? r : t;
      }
   }

   @Override
   public boolean a(int $$0, cpq $$1, @Nullable ih $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cpq $$1, ih $$2) {
      return $$2 == ih.a && $$0 == 1 ? $$1.a(cpt.qy) || $$1.a(cpt.qx) : true;
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   public boolean aj_() {
      for (cpq $$0 : this.m) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cpq a(int $$0) {
      return this.m.get($$0);
   }

   @Override
   public cpq a(int $$0, int $$1) {
      return bmf.a(this.m, $$0, $$1);
   }

   @Override
   public cpq b(int $$0) {
      return bmf.a(this.m, $$0);
   }

   @Override
   public void a(int $$0, cpq $$1) {
      cpq $$2 = this.m.get($$0);
      boolean $$3 = !$$1.b() && cpq.c($$2, $$1);
      this.m.set($$0, $$1);
      if ($$1.M() > this.al_()) {
         $$1.f(this.al_());
      }

      if ($$0 == 0 && !$$3) {
         this.x = a(this.o, this);
         this.w = 0;
         this.e();
      }
   }

   @Override
   public boolean a(cia $$0) {
      return bme.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cpq $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         cpq $$2 = this.m.get(1);
         return b($$1) || $$1.a(cpt.qx) && !$$2.a(cpt.qx);
      }
   }

   @Override
   public void a() {
      this.m.clear();
   }

   @Override
   public void a(@Nullable csu<?> $$0) {
      if ($$0 != null) {
         ajc $$1 = $$0.a();
         this.z.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public csu<?> d() {
      return null;
   }

   @Override
   public void a(cia $$0, List<cpq> $$1) {
   }

   public void a(apb $$0) {
      List<csu<?>> $$1 = this.a($$0.z(), $$0.dh());
      $$0.a($$1);

      for (csu<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.m);
         }
      }

      this.z.clear();
   }

   public List<csu<?>> a(apa $$0, eov $$1) {
      List<csu<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.z.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<ajc> $$3 = (Entry<ajc>)var4.next();
         $$0.r().a((ajc)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((csu<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((csb)$$4.b()).b());
         });
      }

      return $$2;
   }

   private static void a(apa $$0, eov $$1, int $$2, float $$3) {
      int $$4 = awm.d((float)$$2 * $$3);
      float $$5 = awm.h((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      bon.a($$0, $$1, $$4);
   }

   @Override
   public void a(cie $$0) {
      for (cpq $$1 : this.m) {
         $$0.b($$1);
      }
   }
}

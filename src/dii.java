import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class dii extends din implements bmg, clq, clz {
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
   protected is<coz> m = is.a(3, coz.h);
   int u;
   int v;
   int w;
   int x;
   @Nullable
   private static volatile Map<cou, Integer> y;
   protected final ckl n = new ckl() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dii.this.u;
            case 1:
               return dii.this.v;
            case 2:
               return dii.this.w;
            case 3:
               return dii.this.x;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dii.this.u = $$1;
               break;
            case 1:
               dii.this.v = $$1;
               break;
            case 2:
               dii.this.w = $$1;
               break;
            case 3:
               dii.this.x = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Object2IntOpenHashMap<aiy> z = new Object2IntOpenHashMap();
   private final cse.a<bln, ? extends crk> A;

   protected dii(div<?> $$0, hz $$1, dlf $$2, csg<? extends crk> $$3) {
      super($$0, $$1, $$2);
      this.A = cse.b($$3);
   }

   public static void f() {
      y = null;
   }

   public static Map<cou, Integer> g() {
      Map<cou, Integer> $$0 = y;
      if ($$0 != null) {
         return $$0;
      } else {
         Map<cou, Integer> $$1 = Maps.newLinkedHashMap();
         a($$1, cpc.qz, 20000);
         a($$1, cyq.iB, 16000);
         a($$1, cpc.sf, 2400);
         a($$1, cpc.ov, 1600);
         a($$1, cpc.ow, 1600);
         a($$1, auh.r, 300);
         a($$1, auh.C, 300);
         a($$1, auh.b, 300);
         a($$1, cyq.w, 300);
         a($$1, auh.i, 300);
         a($$1, cyq.hU, 300);
         a($$1, auh.j, 150);
         a($$1, cyq.jC, 150);
         a($$1, auh.n, 300);
         a($$1, auh.m, 300);
         a($$1, auh.k, 300);
         a($$1, auh.l, 300);
         a($$1, cyq.aY, 300);
         a($$1, cyq.cl, 300);
         a($$1, cyq.cm, 300);
         a($$1, cyq.oa, 300);
         a($$1, cyq.dT, 300);
         a($$1, cyq.cv, 300);
         a($$1, cyq.gV, 300);
         a($$1, cyq.cA, 300);
         a($$1, cyq.gZ, 300);
         a($$1, auh.E, 300);
         a($$1, cpc.ot, 300);
         a($$1, cpc.qU, 300);
         a($$1, cyq.cO, 300);
         a($$1, auh.ap, 200);
         a($$1, auh.aE, 800);
         a($$1, cpc.oL, 200);
         a($$1, cpc.oK, 200);
         a($$1, cpc.oO, 200);
         a($$1, cpc.oN, 200);
         a($$1, cpc.oM, 200);
         a($$1, auh.h, 200);
         a($$1, auh.am, 1200);
         a($$1, auh.a, 100);
         a($$1, auh.d, 100);
         a($$1, cpc.po, 100);
         a($$1, auh.p, 100);
         a($$1, cpc.pp, 100);
         a($$1, auh.g, 67);
         a($$1, cyq.me, 4001);
         a($$1, cpc.vP, 300);
         a($$1, cyq.mZ, 50);
         a($$1, cyq.bv, 100);
         a($$1, cyq.nS, 50);
         a($$1, cyq.nT, 300);
         a($$1, cyq.nU, 300);
         a($$1, cyq.nX, 300);
         a($$1, cyq.nY, 300);
         a($$1, cyq.ob, 300);
         a($$1, cyq.pc, 300);
         a($$1, cyq.sy, 100);
         a($$1, cyq.sz, 100);
         a($$1, cyq.ac, 300);
         y = $$1;
         return $$1;
      }
   }

   private static boolean b(cou $$0) {
      return $$0.i().a(auh.ag);
   }

   private static void a(Map<cou, Integer> $$0, auo<cou> $$1, int $$2) {
      for (ij<cou> $$3 : kf.h.c($$1)) {
         if (!b($$3.a())) {
            $$0.put($$3.a(), $$2);
         }
      }
   }

   private static void a(Map<cou, Integer> $$0, cvm $$1, int $$2) {
      cou $$3 = $$1.j();
      if (b($$3)) {
         if (aa.aU) {
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

   private boolean k() {
      return this.u > 0;
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.m = is.a(this.b(), coz.h);
      blo.b($$0, this.m);
      this.u = $$0.g("BurnTime");
      this.w = $$0.g("CookTime");
      this.x = $$0.g("CookTimeTotal");
      this.v = this.a(this.m.get(1));
      sw $$1 = $$0.p("RecipesUsed");

      for (String $$2 : $$1.e()) {
         this.z.put(new aiy($$2), $$1.h($$2));
      }
   }

   @Override
   protected void b(sw $$0) {
      super.b($$0);
      $$0.a("BurnTime", (short)this.u);
      $$0.a("CookTime", (short)this.w);
      $$0.a("CookTimeTotal", (short)this.x);
      blo.a($$0, this.m);
      sw $$1 = new sw();
      this.z.forEach(($$1x, $$2) -> $$1.a($$1x.toString(), $$2));
      $$0.a("RecipesUsed", $$1);
   }

   public static void a(cvn $$0, hz $$1, dlf $$2, dii $$3) {
      boolean $$4 = $$3.k();
      boolean $$5 = false;
      if ($$3.k()) {
         $$3.u--;
      }

      coz $$6 = $$3.m.get(1);
      boolean $$7 = !$$3.m.get(0).b();
      boolean $$8 = !$$6.b();
      if ($$3.k() || $$8 && $$7) {
         csd<?> $$9;
         if ($$7) {
            $$9 = $$3.A.a($$3, $$0).orElse(null);
         } else {
            $$9 = null;
         }

         int $$11 = $$3.al_();
         if (!$$3.k() && a($$0.I_(), $$9, $$3.m, $$11)) {
            $$3.u = $$3.a($$6);
            $$3.v = $$3.u;
            if ($$3.k()) {
               $$5 = true;
               if ($$8) {
                  cou $$12 = $$6.d();
                  $$6.h(1);
                  if ($$6.b()) {
                     cou $$13 = $$12.r();
                     $$3.m.set(1, $$13 == null ? coz.h : new coz($$13));
                  }
               }
            }
         }

         if ($$3.k() && a($$0.I_(), $$9, $$3.m, $$11)) {
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
      } else if (!$$3.k() && $$3.w > 0) {
         $$3.w = awh.a($$3.w - 2, 0, $$3.x);
      }

      if ($$4 != $$3.k()) {
         $$5 = true;
         $$2 = $$2.a(cxj.b, Boolean.valueOf($$3.k()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(iw $$0, @Nullable csd<?> $$1, is<coz> $$2, int $$3) {
      if (!$$2.get(0).b() && $$1 != null) {
         coz $$4 = $$1.b().a($$0);
         if ($$4.b()) {
            return false;
         } else {
            coz $$5 = $$2.get(2);
            if ($$5.b()) {
               return true;
            } else if (!coz.b($$5, $$4)) {
               return false;
            } else {
               return $$5.M() < $$3 && $$5.M() < $$5.g() ? true : $$5.M() < $$4.g();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(iw $$0, @Nullable csd<?> $$1, is<coz> $$2, int $$3) {
      if ($$1 != null && a($$0, $$1, $$2, $$3)) {
         coz $$4 = $$2.get(0);
         coz $$5 = $$1.b().a($$0);
         coz $$6 = $$2.get(2);
         if ($$6.b()) {
            $$2.set(2, $$5.q());
         } else if ($$6.a($$5.d())) {
            $$6.g(1);
         }

         if ($$4.a(cyq.aP.j()) && !$$2.get(1).b() && $$2.get(1).a(cpc.qx)) {
            $$2.set(1, new coz(cpc.qy));
         }

         $$4.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int a(coz $$0) {
      if ($$0.b()) {
         return 0;
      } else {
         cou $$1 = $$0.d();
         return g().getOrDefault($$1, 0);
      }
   }

   private static int a(cvn $$0, dii $$1) {
      return $$1.A.a($$1, $$0).map($$0x -> ((crk)$$0x.b()).d()).orElse(200);
   }

   public static boolean b(coz $$0) {
      return g().containsKey($$0.d());
   }

   @Override
   public int[] a(ie $$0) {
      if ($$0 == ie.a) {
         return s;
      } else {
         return $$0 == ie.b ? r : t;
      }
   }

   @Override
   public boolean a(int $$0, coz $$1, @Nullable ie $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, coz $$1, ie $$2) {
      return $$2 == ie.a && $$0 == 1 ? $$1.a(cpc.qy) || $$1.a(cpc.qx) : true;
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   public boolean aj_() {
      for (coz $$0 : this.m) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public coz a(int $$0) {
      return this.m.get($$0);
   }

   @Override
   public coz a(int $$0, int $$1) {
      return blo.a(this.m, $$0, $$1);
   }

   @Override
   public coz b(int $$0) {
      return blo.a(this.m, $$0);
   }

   @Override
   public void a(int $$0, coz $$1) {
      coz $$2 = this.m.get($$0);
      boolean $$3 = !$$1.b() && coz.c($$2, $$1);
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
   public boolean a(chh $$0) {
      return bln.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, coz $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         coz $$2 = this.m.get(1);
         return b($$1) || $$1.a(cpc.qx) && !$$2.a(cpc.qx);
      }
   }

   @Override
   public void a() {
      this.m.clear();
   }

   @Override
   public void a(@Nullable csd<?> $$0) {
      if ($$0 != null) {
         aiy $$1 = $$0.a();
         this.z.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public csd<?> d() {
      return null;
   }

   @Override
   public void a(chh $$0, List<coz> $$1) {
   }

   public void a(aow $$0) {
      List<csd<?>> $$1 = this.a($$0.z(), $$0.dk());
      $$0.a($$1);

      for (csd<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.m);
         }
      }

      this.z.clear();
   }

   public List<csd<?>> a(aov $$0, ens $$1) {
      List<csd<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.z.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<aiy> $$3 = (Entry<aiy>)var4.next();
         $$0.r().a((aiy)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((csd<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((crk)$$4.b()).b());
         });
      }

      return $$2;
   }

   private static void a(aov $$0, ens $$1, int $$2, float $$3) {
      int $$4 = awh.d((float)$$2 * $$3);
      float $$5 = awh.h((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      bnw.a($$0, $$1, $$4);
   }

   @Override
   public void a(chl $$0) {
      for (coz $$1 : this.m) {
         $$0.b($$1);
      }
   }
}

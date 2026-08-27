import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class dmc extends dmi implements bor, col, cox {
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
   protected iw<crs> m = iw.a(3, crs.i);
   int u;
   int v;
   int w;
   int x;
   @Nullable
   private static volatile Map<crn, Integer> y;
   protected final cng n = new cng() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dmc.this.u;
            case 1:
               return dmc.this.v;
            case 2:
               return dmc.this.w;
            case 3:
               return dmc.this.x;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dmc.this.u = $$1;
               break;
            case 1:
               dmc.this.v = $$1;
               break;
            case 2:
               dmc.this.w = $$1;
               break;
            case 3:
               dmc.this.x = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Object2IntOpenHashMap<ajv> z = new Object2IntOpenHashMap();
   private final cvv.a<bny, ? extends cvb> A;

   protected dmc(dmq<?> $$0, id $$1, dpi $$2, cvx<? extends cvb> $$3) {
      super($$0, $$1, $$2);
      this.A = cvv.b($$3);
   }

   public static void f() {
      y = null;
   }

   public static Map<crn, Integer> g() {
      Map<crn, Integer> $$0 = y;
      if ($$0 != null) {
         return $$0;
      } else {
         Map<crn, Integer> $$1 = Maps.newLinkedHashMap();
         a($$1, crv.qz, 20000);
         a($$1, dcj.iB, 16000);
         a($$1, crv.sf, 2400);
         a($$1, crv.ov, 1600);
         a($$1, crv.ow, 1600);
         a($$1, avm.r, 300);
         a($$1, avm.C, 300);
         a($$1, avm.b, 300);
         a($$1, dcj.w, 300);
         a($$1, avm.i, 300);
         a($$1, dcj.hU, 300);
         a($$1, avm.j, 150);
         a($$1, dcj.jC, 150);
         a($$1, avm.n, 300);
         a($$1, avm.m, 300);
         a($$1, avm.k, 300);
         a($$1, avm.l, 300);
         a($$1, dcj.aY, 300);
         a($$1, dcj.cl, 300);
         a($$1, dcj.cm, 300);
         a($$1, dcj.oa, 300);
         a($$1, dcj.dT, 300);
         a($$1, dcj.cv, 300);
         a($$1, dcj.gV, 300);
         a($$1, dcj.cA, 300);
         a($$1, dcj.gZ, 300);
         a($$1, avm.E, 300);
         a($$1, crv.ot, 300);
         a($$1, crv.qU, 300);
         a($$1, dcj.cO, 300);
         a($$1, avm.ap, 200);
         a($$1, avm.aE, 800);
         a($$1, crv.oL, 200);
         a($$1, crv.oK, 200);
         a($$1, crv.oO, 200);
         a($$1, crv.oN, 200);
         a($$1, crv.oM, 200);
         a($$1, avm.h, 200);
         a($$1, avm.am, 1200);
         a($$1, avm.a, 100);
         a($$1, avm.d, 100);
         a($$1, crv.po, 100);
         a($$1, avm.p, 100);
         a($$1, crv.pp, 100);
         a($$1, avm.g, 67);
         a($$1, dcj.me, 4001);
         a($$1, crv.vR, 300);
         a($$1, dcj.mZ, 50);
         a($$1, dcj.bv, 100);
         a($$1, dcj.nS, 50);
         a($$1, dcj.nT, 300);
         a($$1, dcj.nU, 300);
         a($$1, dcj.nX, 300);
         a($$1, dcj.nY, 300);
         a($$1, dcj.ob, 300);
         a($$1, dcj.pc, 300);
         a($$1, dcj.sy, 100);
         a($$1, dcj.sz, 100);
         a($$1, dcj.ac, 300);
         y = $$1;
         return $$1;
      }
   }

   private static boolean b(crn $$0) {
      return $$0.n().a(avm.ag);
   }

   private static void a(Map<crn, Integer> $$0, avt<crn> $$1, int $$2) {
      for (in<crn> $$3 : kt.h.c($$1)) {
         if (!b($$3.a())) {
            $$0.put($$3.a(), $$2);
         }
      }
   }

   private static void a(Map<crn, Integer> $$0, czf $$1, int $$2) {
      crn $$3 = $$1.p();
      if (b($$3)) {
         if (aa.aW) {
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
   public void a(to $$0, ip.a $$1) {
      super.a($$0, $$1);
      this.m = iw.a(this.b(), crs.i);
      bnz.b($$0, this.m, $$1);
      this.u = $$0.g("BurnTime");
      this.w = $$0.g("CookTime");
      this.x = $$0.g("CookTimeTotal");
      this.v = this.a(this.m.get(1));
      to $$2 = $$0.p("RecipesUsed");

      for (String $$3 : $$2.e()) {
         this.z.put(new ajv($$3), $$2.h($$3));
      }
   }

   @Override
   protected void b(to $$0, ip.a $$1) {
      super.b($$0, $$1);
      $$0.a("BurnTime", (short)this.u);
      $$0.a("CookTime", (short)this.w);
      $$0.a("CookTimeTotal", (short)this.x);
      bnz.a($$0, this.m, $$1);
      to $$2 = new to();
      this.z.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), $$2x));
      $$0.a("RecipesUsed", $$2);
   }

   public static void a(czg $$0, id $$1, dpi $$2, dmc $$3) {
      boolean $$4 = $$3.l();
      boolean $$5 = false;
      if ($$3.l()) {
         $$3.u--;
      }

      crs $$6 = $$3.m.get(1);
      boolean $$7 = !$$3.m.get(0).d();
      boolean $$8 = !$$6.d();
      if ($$3.l() || $$8 && $$7) {
         cvu<?> $$9;
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
                  crn $$12 = $$6.f();
                  $$6.g(1);
                  if ($$6.d()) {
                     crn $$13 = $$12.v();
                     $$3.m.set(1, $$13 == null ? crs.i : new crs($$13));
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
         $$3.w = axm.a($$3.w - 2, 0, $$3.x);
      }

      if ($$4 != $$3.l()) {
         $$5 = true;
         $$2 = $$2.a(dbc.b, Boolean.valueOf($$3.l()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(jb $$0, @Nullable cvu<?> $$1, iw<crs> $$2, int $$3) {
      if (!$$2.get(0).d() && $$1 != null) {
         crs $$4 = $$1.b().a($$0);
         if ($$4.d()) {
            return false;
         } else {
            crs $$5 = $$2.get(2);
            if ($$5.d()) {
               return true;
            } else if (!crs.c($$5, $$4)) {
               return false;
            } else {
               return $$5.G() < $$3 && $$5.G() < $$5.i() ? true : $$5.G() < $$4.i();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(jb $$0, @Nullable cvu<?> $$1, iw<crs> $$2, int $$3) {
      if ($$1 != null && a($$0, $$1, $$2, $$3)) {
         crs $$4 = $$2.get(0);
         crs $$5 = $$1.b().a($$0);
         crs $$6 = $$2.get(2);
         if ($$6.d()) {
            $$2.set(2, $$5.r());
         } else if (crs.c($$6, $$5)) {
            $$6.f(1);
         }

         if ($$4.a(dcj.aP.p()) && !$$2.get(1).d() && $$2.get(1).a(crv.qx)) {
            $$2.set(1, new crs(crv.qy));
         }

         $$4.g(1);
         return true;
      } else {
         return false;
      }
   }

   protected int a(crs $$0) {
      if ($$0.d()) {
         return 0;
      } else {
         crn $$1 = $$0.f();
         return g().getOrDefault($$1, 0);
      }
   }

   private static int a(czg $$0, dmc $$1) {
      return $$1.A.a($$1, $$0).map($$0x -> ((cvb)$$0x.b()).d()).orElse(200);
   }

   public static boolean b(crs $$0) {
      return g().containsKey($$0.f());
   }

   @Override
   public int[] a(ij $$0) {
      if ($$0 == ij.a) {
         return s;
      } else {
         return $$0 == ij.b ? r : t;
      }
   }

   @Override
   public boolean a(int $$0, crs $$1, @Nullable ij $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, crs $$1, ij $$2) {
      return $$2 == ij.a && $$0 == 1 ? $$1.a(crv.qy) || $$1.a(crv.qx) : true;
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   protected iw<crs> j() {
      return this.m;
   }

   @Override
   protected void a(iw<crs> $$0) {
      this.m = $$0;
   }

   @Override
   public void a(int $$0, crs $$1) {
      crs $$2 = this.m.get($$0);
      boolean $$3 = !$$1.d() && crs.c($$2, $$1);
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
   public boolean b(int $$0, crs $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         crs $$2 = this.m.get(1);
         return b($$1) || $$1.a(crv.qx) && !$$2.a(crv.qx);
      }
   }

   @Override
   public void a(@Nullable cvu<?> $$0) {
      if ($$0 != null) {
         ajv $$1 = $$0.a();
         this.z.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public cvu<?> d() {
      return null;
   }

   @Override
   public void a(cka $$0, List<crs> $$1) {
   }

   public void a(apv $$0) {
      List<cvu<?>> $$1 = this.a($$0.z(), $$0.dk());
      $$0.a($$1);

      for (cvu<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.m);
         }
      }

      this.z.clear();
   }

   public List<cvu<?>> a(apu $$0, esj $$1) {
      List<cvu<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.z.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<ajv> $$3 = (Entry<ajv>)var4.next();
         $$0.r().a((ajv)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((cvu<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((cvb)$$4.b()).b());
         });
      }

      return $$2;
   }

   private static void a(apu $$0, esj $$1, int $$2, float $$3) {
      int $$4 = axm.d((float)$$2 * $$3);
      float $$5 = axm.h((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      bqj.a($$0, $$1, $$4);
   }

   @Override
   public void a(cke $$0) {
      for (crs $$1 : this.m) {
         $$0.b($$1);
      }
   }
}

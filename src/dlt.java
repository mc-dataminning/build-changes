import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class dlt extends dlz implements bom, coe, coo {
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
   protected iu<crj> m = iu.a(3, crj.i);
   int u;
   int v;
   int w;
   int x;
   @Nullable
   private static volatile Map<cre, Integer> y;
   protected final cmz n = new cmz() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dlt.this.u;
            case 1:
               return dlt.this.v;
            case 2:
               return dlt.this.w;
            case 3:
               return dlt.this.x;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dlt.this.u = $$1;
               break;
            case 1:
               dlt.this.v = $$1;
               break;
            case 2:
               dlt.this.w = $$1;
               break;
            case 3:
               dlt.this.x = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Object2IntOpenHashMap<ajt> z = new Object2IntOpenHashMap();
   private final cvm.a<bnt, ? extends cus> A;

   protected dlt(dmh<?> $$0, ib $$1, doz $$2, cvo<? extends cus> $$3) {
      super($$0, $$1, $$2);
      this.A = cvm.b($$3);
   }

   public static void f() {
      y = null;
   }

   public static Map<cre, Integer> g() {
      Map<cre, Integer> $$0 = y;
      if ($$0 != null) {
         return $$0;
      } else {
         Map<cre, Integer> $$1 = Maps.newLinkedHashMap();
         a($$1, crm.qz, 20000);
         a($$1, dca.iB, 16000);
         a($$1, crm.sf, 2400);
         a($$1, crm.ov, 1600);
         a($$1, crm.ow, 1600);
         a($$1, avk.r, 300);
         a($$1, avk.C, 300);
         a($$1, avk.b, 300);
         a($$1, dca.w, 300);
         a($$1, avk.i, 300);
         a($$1, dca.hU, 300);
         a($$1, avk.j, 150);
         a($$1, dca.jC, 150);
         a($$1, avk.n, 300);
         a($$1, avk.m, 300);
         a($$1, avk.k, 300);
         a($$1, avk.l, 300);
         a($$1, dca.aY, 300);
         a($$1, dca.cl, 300);
         a($$1, dca.cm, 300);
         a($$1, dca.oa, 300);
         a($$1, dca.dT, 300);
         a($$1, dca.cv, 300);
         a($$1, dca.gV, 300);
         a($$1, dca.cA, 300);
         a($$1, dca.gZ, 300);
         a($$1, avk.E, 300);
         a($$1, crm.ot, 300);
         a($$1, crm.qU, 300);
         a($$1, dca.cO, 300);
         a($$1, avk.ap, 200);
         a($$1, avk.aE, 800);
         a($$1, crm.oL, 200);
         a($$1, crm.oK, 200);
         a($$1, crm.oO, 200);
         a($$1, crm.oN, 200);
         a($$1, crm.oM, 200);
         a($$1, avk.h, 200);
         a($$1, avk.am, 1200);
         a($$1, avk.a, 100);
         a($$1, avk.d, 100);
         a($$1, crm.po, 100);
         a($$1, avk.p, 100);
         a($$1, crm.pp, 100);
         a($$1, avk.g, 67);
         a($$1, dca.me, 4001);
         a($$1, crm.vR, 300);
         a($$1, dca.mZ, 50);
         a($$1, dca.bv, 100);
         a($$1, dca.nS, 50);
         a($$1, dca.nT, 300);
         a($$1, dca.nU, 300);
         a($$1, dca.nX, 300);
         a($$1, dca.nY, 300);
         a($$1, dca.ob, 300);
         a($$1, dca.pc, 300);
         a($$1, dca.sy, 100);
         a($$1, dca.sz, 100);
         a($$1, dca.ac, 300);
         y = $$1;
         return $$1;
      }
   }

   private static boolean b(cre $$0) {
      return $$0.n().a(avk.ag);
   }

   private static void a(Map<cre, Integer> $$0, avr<cre> $$1, int $$2) {
      for (il<cre> $$3 : kr.h.c($$1)) {
         if (!b($$3.a())) {
            $$0.put($$3.a(), $$2);
         }
      }
   }

   private static void a(Map<cre, Integer> $$0, cyw $$1, int $$2) {
      cre $$3 = $$1.p();
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

   private boolean j() {
      return this.u > 0;
   }

   @Override
   public void a(tm $$0, in.a $$1) {
      super.a($$0, $$1);
      this.m = iu.a(this.b(), crj.i);
      bnu.b($$0, this.m, $$1);
      this.u = $$0.g("BurnTime");
      this.w = $$0.g("CookTime");
      this.x = $$0.g("CookTimeTotal");
      this.v = this.a(this.m.get(1));
      tm $$2 = $$0.p("RecipesUsed");

      for (String $$3 : $$2.e()) {
         this.z.put(new ajt($$3), $$2.h($$3));
      }
   }

   @Override
   protected void b(tm $$0, in.a $$1) {
      super.b($$0, $$1);
      $$0.a("BurnTime", (short)this.u);
      $$0.a("CookTime", (short)this.w);
      $$0.a("CookTimeTotal", (short)this.x);
      bnu.a($$0, this.m, $$1);
      tm $$2 = new tm();
      this.z.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), $$2x));
      $$0.a("RecipesUsed", $$2);
   }

   public static void a(cyx $$0, ib $$1, doz $$2, dlt $$3) {
      boolean $$4 = $$3.j();
      boolean $$5 = false;
      if ($$3.j()) {
         $$3.u--;
      }

      crj $$6 = $$3.m.get(1);
      boolean $$7 = !$$3.m.get(0).d();
      boolean $$8 = !$$6.d();
      if ($$3.j() || $$8 && $$7) {
         cvl<?> $$9;
         if ($$7) {
            $$9 = $$3.A.a($$3, $$0).orElse(null);
         } else {
            $$9 = null;
         }

         int $$11 = $$3.aj_();
         if (!$$3.j() && a($$0.H_(), $$9, $$3.m, $$11)) {
            $$3.u = $$3.a($$6);
            $$3.v = $$3.u;
            if ($$3.j()) {
               $$5 = true;
               if ($$8) {
                  cre $$12 = $$6.f();
                  $$6.g(1);
                  if ($$6.d()) {
                     cre $$13 = $$12.v();
                     $$3.m.set(1, $$13 == null ? crj.i : new crj($$13));
                  }
               }
            }
         }

         if ($$3.j() && a($$0.H_(), $$9, $$3.m, $$11)) {
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
      } else if (!$$3.j() && $$3.w > 0) {
         $$3.w = axk.a($$3.w - 2, 0, $$3.x);
      }

      if ($$4 != $$3.j()) {
         $$5 = true;
         $$2 = $$2.a(dat.b, Boolean.valueOf($$3.j()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(iz $$0, @Nullable cvl<?> $$1, iu<crj> $$2, int $$3) {
      if (!$$2.get(0).d() && $$1 != null) {
         crj $$4 = $$1.b().a($$0);
         if ($$4.d()) {
            return false;
         } else {
            crj $$5 = $$2.get(2);
            if ($$5.d()) {
               return true;
            } else if (!crj.b($$5, $$4)) {
               return false;
            } else {
               return $$5.G() < $$3 && $$5.G() < $$5.i() ? true : $$5.G() < $$4.i();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(iz $$0, @Nullable cvl<?> $$1, iu<crj> $$2, int $$3) {
      if ($$1 != null && a($$0, $$1, $$2, $$3)) {
         crj $$4 = $$2.get(0);
         crj $$5 = $$1.b().a($$0);
         crj $$6 = $$2.get(2);
         if ($$6.d()) {
            $$2.set(2, $$5.r());
         } else if ($$6.a($$5.f())) {
            $$6.f(1);
         }

         if ($$4.a(dca.aP.p()) && !$$2.get(1).d() && $$2.get(1).a(crm.qx)) {
            $$2.set(1, new crj(crm.qy));
         }

         $$4.g(1);
         return true;
      } else {
         return false;
      }
   }

   protected int a(crj $$0) {
      if ($$0.d()) {
         return 0;
      } else {
         cre $$1 = $$0.f();
         return g().getOrDefault($$1, 0);
      }
   }

   private static int a(cyx $$0, dlt $$1) {
      return $$1.A.a($$1, $$0).map($$0x -> ((cus)$$0x.b()).d()).orElse(200);
   }

   public static boolean b(crj $$0) {
      return g().containsKey($$0.f());
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
   public boolean a(int $$0, crj $$1, @Nullable ih $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, crj $$1, ih $$2) {
      return $$2 == ih.a && $$0 == 1 ? $$1.a(crm.qy) || $$1.a(crm.qx) : true;
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   public boolean ah_() {
      for (crj $$0 : this.m) {
         if (!$$0.d()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public crj a(int $$0) {
      return this.m.get($$0);
   }

   @Override
   public crj a(int $$0, int $$1) {
      return bnu.a(this.m, $$0, $$1);
   }

   @Override
   public crj b(int $$0) {
      return bnu.a(this.m, $$0);
   }

   @Override
   public void a(int $$0, crj $$1) {
      crj $$2 = this.m.get($$0);
      boolean $$3 = !$$1.d() && crj.c($$2, $$1);
      this.m.set($$0, $$1);
      if ($$1.G() > this.aj_()) {
         $$1.e(this.aj_());
      }

      if ($$0 == 0 && !$$3) {
         this.x = a(this.o, this);
         this.w = 0;
         this.e();
      }
   }

   @Override
   public boolean a(cjt $$0) {
      return bnt.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, crj $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         crj $$2 = this.m.get(1);
         return b($$1) || $$1.a(crm.qx) && !$$2.a(crm.qx);
      }
   }

   @Override
   public void a() {
      this.m.clear();
   }

   @Override
   public void a(@Nullable cvl<?> $$0) {
      if ($$0 != null) {
         ajt $$1 = $$0.a();
         this.z.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public cvl<?> d() {
      return null;
   }

   @Override
   public void a(cjt $$0, List<crj> $$1) {
   }

   public void a(apt $$0) {
      List<cvl<?>> $$1 = this.a($$0.z(), $$0.dk());
      $$0.a($$1);

      for (cvl<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.m);
         }
      }

      this.z.clear();
   }

   public List<cvl<?>> a(aps $$0, esa $$1) {
      List<cvl<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.z.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<ajt> $$3 = (Entry<ajt>)var4.next();
         $$0.r().a((ajt)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((cvl<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((cus)$$4.b()).b());
         });
      }

      return $$2;
   }

   private static void a(aps $$0, esa $$1, int $$2, float $$3) {
      int $$4 = axk.d((float)$$2 * $$3);
      float $$5 = axk.h((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      bqe.a($$0, $$1, $$4);
   }

   @Override
   public void a(cjx $$0) {
      for (crj $$1 : this.m) {
         $$0.b($$1);
      }
   }
}

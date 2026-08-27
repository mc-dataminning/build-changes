import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class deg extends del implements biz, cht, cic {
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
   protected il<clb> m = il.a(3, clb.b);
   int u;
   int v;
   int w;
   int x;
   protected final cgo n = new cgo() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return deg.this.u;
            case 1:
               return deg.this.v;
            case 2:
               return deg.this.w;
            case 3:
               return deg.this.x;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               deg.this.u = $$1;
               break;
            case 1:
               deg.this.v = $$1;
               break;
            case 2:
               deg.this.w = $$1;
               break;
            case 3:
               deg.this.x = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Object2IntOpenHashMap<agg> y = new Object2IntOpenHashMap();
   private final coi.a<bij, ? extends cnn> z;

   protected deg(det<?> $$0, ht $$1, dgw $$2, cok<? extends cnn> $$3) {
      super($$0, $$1, $$2);
      this.z = coi.b($$3);
   }

   public static Map<ckw, Integer> f() {
      Map<ckw, Integer> $$0 = Maps.newLinkedHashMap();
      a($$0, cle.pM, 20000);
      a($$0, cuv.iB, 16000);
      a($$0, cle.rs, 2400);
      a($$0, cle.nI, 1600);
      a($$0, cle.nJ, 1600);
      a($$0, ark.r, 300);
      a($$0, ark.C, 300);
      a($$0, ark.b, 300);
      a($$0, cuv.w, 300);
      a($$0, ark.i, 300);
      a($$0, cuv.hU, 300);
      a($$0, ark.j, 150);
      a($$0, cuv.jC, 150);
      a($$0, ark.n, 300);
      a($$0, ark.m, 300);
      a($$0, ark.k, 300);
      a($$0, ark.l, 300);
      a($$0, cuv.aY, 300);
      a($$0, cuv.cl, 300);
      a($$0, cuv.cm, 300);
      a($$0, cuv.oa, 300);
      a($$0, cuv.dT, 300);
      a($$0, cuv.cv, 300);
      a($$0, cuv.gV, 300);
      a($$0, cuv.cA, 300);
      a($$0, cuv.gZ, 300);
      a($$0, ark.E, 300);
      a($$0, cle.nG, 300);
      a($$0, cle.qh, 300);
      a($$0, cuv.cO, 300);
      a($$0, ark.ap, 200);
      a($$0, ark.aE, 800);
      a($$0, cle.nY, 200);
      a($$0, cle.nX, 200);
      a($$0, cle.ob, 200);
      a($$0, cle.oa, 200);
      a($$0, cle.nZ, 200);
      a($$0, ark.h, 200);
      a($$0, ark.am, 1200);
      a($$0, ark.a, 100);
      a($$0, ark.d, 100);
      a($$0, cle.oB, 100);
      a($$0, ark.p, 100);
      a($$0, cle.oC, 100);
      a($$0, ark.g, 67);
      a($$0, cuv.me, 4001);
      a($$0, cle.va, 300);
      a($$0, cuv.mZ, 50);
      a($$0, cuv.bv, 100);
      a($$0, cuv.nS, 50);
      a($$0, cuv.nT, 300);
      a($$0, cuv.nU, 300);
      a($$0, cuv.nX, 300);
      a($$0, cuv.nY, 300);
      a($$0, cuv.ob, 300);
      a($$0, cuv.pc, 300);
      a($$0, cuv.rx, 100);
      a($$0, cuv.ry, 100);
      a($$0, cuv.ac, 300);
      return $$0;
   }

   private static boolean b(ckw $$0) {
      return $$0.j().a(ark.ag);
   }

   private static void a(Map<ckw, Integer> $$0, arr<ckw> $$1, int $$2) {
      for (ib<ckw> $$3 : jy.i.c($$1)) {
         if (!b($$3.a())) {
            $$0.put($$3.a(), $$2);
         }
      }
   }

   private static void a(Map<ckw, Integer> $$0, crr $$1, int $$2) {
      ckw $$3 = $$1.k();
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
   public void a(rz $$0) {
      super.a($$0);
      this.m = il.a(this.b(), clb.b);
      bik.b($$0, this.m);
      this.u = $$0.g("BurnTime");
      this.w = $$0.g("CookTime");
      this.x = $$0.g("CookTimeTotal");
      this.v = this.a(this.m.get(1));
      rz $$1 = $$0.p("RecipesUsed");

      for (String $$2 : $$1.e()) {
         this.y.put(new agg($$2), $$1.h($$2));
      }
   }

   @Override
   protected void b(rz $$0) {
      super.b($$0);
      $$0.a("BurnTime", (short)this.u);
      $$0.a("CookTime", (short)this.w);
      $$0.a("CookTimeTotal", (short)this.x);
      bik.a($$0, this.m);
      rz $$1 = new rz();
      this.y.forEach(($$1x, $$2) -> $$1.a($$1x.toString(), $$2));
      $$0.a("RecipesUsed", $$1);
   }

   public static void a(crs $$0, ht $$1, dgw $$2, deg $$3) {
      boolean $$4 = $$3.i();
      boolean $$5 = false;
      if ($$3.i()) {
         $$3.u--;
      }

      clb $$6 = $$3.m.get(1);
      boolean $$7 = !$$3.m.get(0).b();
      boolean $$8 = !$$6.b();
      if ($$3.i() || $$8 && $$7) {
         coh<?> $$9;
         if ($$7) {
            $$9 = $$3.z.a($$3, $$0).orElse(null);
         } else {
            $$9 = null;
         }

         int $$11 = $$3.aj_();
         if (!$$3.i() && a($$0.H_(), $$9, $$3.m, $$11)) {
            $$3.u = $$3.a($$6);
            $$3.v = $$3.u;
            if ($$3.i()) {
               $$5 = true;
               if ($$8) {
                  ckw $$12 = $$6.d();
                  $$6.h(1);
                  if ($$6.b()) {
                     ckw $$13 = $$12.s();
                     $$3.m.set(1, $$13 == null ? clb.b : new clb($$13));
                  }
               }
            }
         }

         if ($$3.i() && a($$0.H_(), $$9, $$3.m, $$11)) {
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
      } else if (!$$3.i() && $$3.w > 0) {
         $$3.w = ati.a($$3.w - 2, 0, $$3.x);
      }

      if ($$4 != $$3.i()) {
         $$5 = true;
         $$2 = $$2.a(ctn.b, Boolean.valueOf($$3.i()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(ip $$0, @Nullable coh<?> $$1, il<clb> $$2, int $$3) {
      if (!$$2.get(0).b() && $$1 != null) {
         clb $$4 = $$1.b().a($$0);
         if ($$4.b()) {
            return false;
         } else {
            clb $$5 = $$2.get(2);
            if ($$5.b()) {
               return true;
            } else if (!clb.b($$5, $$4)) {
               return false;
            } else {
               return $$5.L() < $$3 && $$5.L() < $$5.g() ? true : $$5.L() < $$4.g();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(ip $$0, @Nullable coh<?> $$1, il<clb> $$2, int $$3) {
      if ($$1 != null && a($$0, $$1, $$2, $$3)) {
         clb $$4 = $$2.get(0);
         clb $$5 = $$1.b().a($$0);
         clb $$6 = $$2.get(2);
         if ($$6.b()) {
            $$2.set(2, $$5.p());
         } else if ($$6.a($$5.d())) {
            $$6.g(1);
         }

         if ($$4.a(cuv.aP.k()) && !$$2.get(1).b() && $$2.get(1).a(cle.pK)) {
            $$2.set(1, new clb(cle.pL));
         }

         $$4.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int a(clb $$0) {
      if ($$0.b()) {
         return 0;
      } else {
         ckw $$1 = $$0.d();
         return f().getOrDefault($$1, 0);
      }
   }

   private static int a(crs $$0, deg $$1) {
      return $$1.z.a($$1, $$0).map($$0x -> ((cnn)$$0x.b()).d()).orElse(200);
   }

   public static boolean b(clb $$0) {
      return f().containsKey($$0.d());
   }

   @Override
   public int[] a(hx $$0) {
      if ($$0 == hx.a) {
         return s;
      } else {
         return $$0 == hx.b ? r : t;
      }
   }

   @Override
   public boolean a(int $$0, clb $$1, @Nullable hx $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, clb $$1, hx $$2) {
      return $$2 == hx.a && $$0 == 1 ? $$1.a(cle.pL) || $$1.a(cle.pK) : true;
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   public boolean ai_() {
      for (clb $$0 : this.m) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public clb a(int $$0) {
      return this.m.get($$0);
   }

   @Override
   public clb a(int $$0, int $$1) {
      return bik.a(this.m, $$0, $$1);
   }

   @Override
   public clb b(int $$0) {
      return bik.a(this.m, $$0);
   }

   @Override
   public void a(int $$0, clb $$1) {
      clb $$2 = this.m.get($$0);
      boolean $$3 = !$$1.b() && clb.c($$2, $$1);
      this.m.set($$0, $$1);
      if ($$1.L() > this.aj_()) {
         $$1.f(this.aj_());
      }

      if ($$0 == 0 && !$$3) {
         this.x = a(this.o, this);
         this.w = 0;
         this.e();
      }
   }

   @Override
   public boolean a(cdm $$0) {
      return bij.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, clb $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         clb $$2 = this.m.get(1);
         return b($$1) || $$1.a(cle.pK) && !$$2.a(cle.pK);
      }
   }

   @Override
   public void a() {
      this.m.clear();
   }

   @Override
   public void a(@Nullable coh<?> $$0) {
      if ($$0 != null) {
         agg $$1 = $$0.a();
         this.y.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public coh<?> d() {
      return null;
   }

   @Override
   public void a(cdm $$0, List<clb> $$1) {
   }

   public void a(amb $$0) {
      List<coh<?>> $$1 = this.a($$0.x(), $$0.dj());
      $$0.a($$1);

      for (coh<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.m);
         }
      }

      this.y.clear();
   }

   public List<coh<?>> a(ama $$0, eji $$1) {
      List<coh<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.y.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<agg> $$3 = (Entry<agg>)var4.next();
         $$0.q().a((agg)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((coh<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((cnn)$$4.b()).b());
         });
      }

      return $$2;
   }

   private static void a(ama $$0, eji $$1, int $$2, float $$3) {
      int $$4 = ati.d((float)$$2 * $$3);
      float $$5 = ati.h((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      bko.a($$0, $$1, $$4);
   }

   @Override
   public void a(cdq $$0) {
      for (clb $$1 : this.m) {
         $$0.b($$1);
      }
   }
}

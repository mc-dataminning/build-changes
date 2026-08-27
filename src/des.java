import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class des extends dex implements bjh, cib, cik {
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
   protected il<clj> m = il.a(3, clj.b);
   int u;
   int v;
   int w;
   int x;
   protected final cgw n = new cgw() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return des.this.u;
            case 1:
               return des.this.v;
            case 2:
               return des.this.w;
            case 3:
               return des.this.x;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               des.this.u = $$1;
               break;
            case 1:
               des.this.v = $$1;
               break;
            case 2:
               des.this.w = $$1;
               break;
            case 3:
               des.this.x = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Object2IntOpenHashMap<agi> y = new Object2IntOpenHashMap();
   private final cor.a<biq, ? extends cnv> z;

   protected des(dff<?> $$0, ht $$1, dhi $$2, cot<? extends cnv> $$3) {
      super($$0, $$1, $$2);
      this.z = cor.b($$3);
   }

   public static Map<cle, Integer> f() {
      Map<cle, Integer> $$0 = Maps.newLinkedHashMap();
      a($$0, clm.qx, 20000);
      a($$0, cvc.iB, 16000);
      a($$0, clm.sd, 2400);
      a($$0, clm.ot, 1600);
      a($$0, clm.ou, 1600);
      a($$0, aro.r, 300);
      a($$0, aro.C, 300);
      a($$0, aro.b, 300);
      a($$0, cvc.w, 300);
      a($$0, aro.i, 300);
      a($$0, cvc.hU, 300);
      a($$0, aro.j, 150);
      a($$0, cvc.jC, 150);
      a($$0, aro.n, 300);
      a($$0, aro.m, 300);
      a($$0, aro.k, 300);
      a($$0, aro.l, 300);
      a($$0, cvc.aY, 300);
      a($$0, cvc.cl, 300);
      a($$0, cvc.cm, 300);
      a($$0, cvc.oa, 300);
      a($$0, cvc.dT, 300);
      a($$0, cvc.cv, 300);
      a($$0, cvc.gV, 300);
      a($$0, cvc.cA, 300);
      a($$0, cvc.gZ, 300);
      a($$0, aro.E, 300);
      a($$0, clm.or, 300);
      a($$0, clm.qS, 300);
      a($$0, cvc.cO, 300);
      a($$0, aro.ap, 200);
      a($$0, aro.aE, 800);
      a($$0, clm.oJ, 200);
      a($$0, clm.oI, 200);
      a($$0, clm.oM, 200);
      a($$0, clm.oL, 200);
      a($$0, clm.oK, 200);
      a($$0, aro.h, 200);
      a($$0, aro.am, 1200);
      a($$0, aro.a, 100);
      a($$0, aro.d, 100);
      a($$0, clm.pm, 100);
      a($$0, aro.p, 100);
      a($$0, clm.pn, 100);
      a($$0, aro.g, 67);
      a($$0, cvc.me, 4001);
      a($$0, clm.vL, 300);
      a($$0, cvc.mZ, 50);
      a($$0, cvc.bv, 100);
      a($$0, cvc.nS, 50);
      a($$0, cvc.nT, 300);
      a($$0, cvc.nU, 300);
      a($$0, cvc.nX, 300);
      a($$0, cvc.nY, 300);
      a($$0, cvc.ob, 300);
      a($$0, cvc.pc, 300);
      a($$0, cvc.sy, 100);
      a($$0, cvc.sz, 100);
      a($$0, cvc.ac, 300);
      return $$0;
   }

   private static boolean b(cle $$0) {
      return $$0.j().a(aro.ag);
   }

   private static void a(Map<cle, Integer> $$0, arv<cle> $$1, int $$2) {
      for (ib<cle> $$3 : jy.i.c($$1)) {
         if (!b($$3.a())) {
            $$0.put($$3.a(), $$2);
         }
      }
   }

   private static void a(Map<cle, Integer> $$0, crz $$1, int $$2) {
      cle $$3 = $$1.k();
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
      this.m = il.a(this.b(), clj.b);
      bir.b($$0, this.m);
      this.u = $$0.g("BurnTime");
      this.w = $$0.g("CookTime");
      this.x = $$0.g("CookTimeTotal");
      this.v = this.a(this.m.get(1));
      rz $$1 = $$0.p("RecipesUsed");

      for (String $$2 : $$1.e()) {
         this.y.put(new agi($$2), $$1.h($$2));
      }
   }

   @Override
   protected void b(rz $$0) {
      super.b($$0);
      $$0.a("BurnTime", (short)this.u);
      $$0.a("CookTime", (short)this.w);
      $$0.a("CookTimeTotal", (short)this.x);
      bir.a($$0, this.m);
      rz $$1 = new rz();
      this.y.forEach(($$1x, $$2) -> $$1.a($$1x.toString(), $$2));
      $$0.a("RecipesUsed", $$1);
   }

   public static void a(csa $$0, ht $$1, dhi $$2, des $$3) {
      boolean $$4 = $$3.i();
      boolean $$5 = false;
      if ($$3.i()) {
         $$3.u--;
      }

      clj $$6 = $$3.m.get(1);
      boolean $$7 = !$$3.m.get(0).b();
      boolean $$8 = !$$6.b();
      if ($$3.i() || $$8 && $$7) {
         coq<?> $$9;
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
                  cle $$12 = $$6.d();
                  $$6.h(1);
                  if ($$6.b()) {
                     cle $$13 = $$12.s();
                     $$3.m.set(1, $$13 == null ? clj.b : new clj($$13));
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
         $$3.w = atm.a($$3.w - 2, 0, $$3.x);
      }

      if ($$4 != $$3.i()) {
         $$5 = true;
         $$2 = $$2.a(ctv.b, Boolean.valueOf($$3.i()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(ip $$0, @Nullable coq<?> $$1, il<clj> $$2, int $$3) {
      if (!$$2.get(0).b() && $$1 != null) {
         clj $$4 = $$1.b().a($$0);
         if ($$4.b()) {
            return false;
         } else {
            clj $$5 = $$2.get(2);
            if ($$5.b()) {
               return true;
            } else if (!clj.b($$5, $$4)) {
               return false;
            } else {
               return $$5.L() < $$3 && $$5.L() < $$5.g() ? true : $$5.L() < $$4.g();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(ip $$0, @Nullable coq<?> $$1, il<clj> $$2, int $$3) {
      if ($$1 != null && a($$0, $$1, $$2, $$3)) {
         clj $$4 = $$2.get(0);
         clj $$5 = $$1.b().a($$0);
         clj $$6 = $$2.get(2);
         if ($$6.b()) {
            $$2.set(2, $$5.p());
         } else if ($$6.a($$5.d())) {
            $$6.g(1);
         }

         if ($$4.a(cvc.aP.k()) && !$$2.get(1).b() && $$2.get(1).a(clm.qv)) {
            $$2.set(1, new clj(clm.qw));
         }

         $$4.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int a(clj $$0) {
      if ($$0.b()) {
         return 0;
      } else {
         cle $$1 = $$0.d();
         return f().getOrDefault($$1, 0);
      }
   }

   private static int a(csa $$0, des $$1) {
      return $$1.z.a($$1, $$0).map($$0x -> ((cnv)$$0x.b()).d()).orElse(200);
   }

   public static boolean b(clj $$0) {
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
   public boolean a(int $$0, clj $$1, @Nullable hx $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, clj $$1, hx $$2) {
      return $$2 == hx.a && $$0 == 1 ? $$1.a(clm.qw) || $$1.a(clm.qv) : true;
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   public boolean ai_() {
      for (clj $$0 : this.m) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public clj a(int $$0) {
      return this.m.get($$0);
   }

   @Override
   public clj a(int $$0, int $$1) {
      return bir.a(this.m, $$0, $$1);
   }

   @Override
   public clj b(int $$0) {
      return bir.a(this.m, $$0);
   }

   @Override
   public void a(int $$0, clj $$1) {
      clj $$2 = this.m.get($$0);
      boolean $$3 = !$$1.b() && clj.c($$2, $$1);
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
   public boolean a(cdu $$0) {
      return biq.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, clj $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         clj $$2 = this.m.get(1);
         return b($$1) || $$1.a(clm.qv) && !$$2.a(clm.qv);
      }
   }

   @Override
   public void a() {
      this.m.clear();
   }

   @Override
   public void a(@Nullable coq<?> $$0) {
      if ($$0 != null) {
         agi $$1 = $$0.a();
         this.y.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public coq<?> d() {
      return null;
   }

   @Override
   public void a(cdu $$0, List<clj> $$1) {
   }

   public void a(amf $$0) {
      List<coq<?>> $$1 = this.a($$0.z(), $$0.dl());
      $$0.a($$1);

      for (coq<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.m);
         }
      }

      this.y.clear();
   }

   public List<coq<?>> a(ame $$0, eju $$1) {
      List<coq<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.y.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<agi> $$3 = (Entry<agi>)var4.next();
         $$0.q().a((agi)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((coq<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((cnv)$$4.b()).b());
         });
      }

      return $$2;
   }

   private static void a(ame $$0, eju $$1, int $$2, float $$3) {
      int $$4 = atm.d((float)$$2 * $$3);
      float $$5 = atm.h((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      bkw.a($$0, $$1, $$4);
   }

   @Override
   public void a(cdy $$0) {
      for (clj $$1 : this.m) {
         $$0.b($$1);
      }
   }
}

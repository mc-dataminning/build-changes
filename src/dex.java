import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class dex extends dfc implements bjm, cig, cip {
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
   protected ip<clo> m = ip.a(3, clo.b);
   int u;
   int v;
   int w;
   int x;
   protected final chb n = new chb() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dex.this.u;
            case 1:
               return dex.this.v;
            case 2:
               return dex.this.w;
            case 3:
               return dex.this.x;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dex.this.u = $$1;
               break;
            case 1:
               dex.this.v = $$1;
               break;
            case 2:
               dex.this.w = $$1;
               break;
            case 3:
               dex.this.x = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Object2IntOpenHashMap<agm> y = new Object2IntOpenHashMap();
   private final cow.a<biu, ? extends coa> z;

   protected dex(dfk<?> $$0, hx $$1, dhn $$2, coy<? extends coa> $$3) {
      super($$0, $$1, $$2);
      this.z = cow.b($$3);
   }

   public static Map<clj, Integer> f() {
      Map<clj, Integer> $$0 = Maps.newLinkedHashMap();
      a($$0, clr.qx, 20000);
      a($$0, cvh.iB, 16000);
      a($$0, clr.sd, 2400);
      a($$0, clr.ot, 1600);
      a($$0, clr.ou, 1600);
      a($$0, ars.r, 300);
      a($$0, ars.C, 300);
      a($$0, ars.b, 300);
      a($$0, cvh.w, 300);
      a($$0, ars.i, 300);
      a($$0, cvh.hU, 300);
      a($$0, ars.j, 150);
      a($$0, cvh.jC, 150);
      a($$0, ars.n, 300);
      a($$0, ars.m, 300);
      a($$0, ars.k, 300);
      a($$0, ars.l, 300);
      a($$0, cvh.aY, 300);
      a($$0, cvh.cl, 300);
      a($$0, cvh.cm, 300);
      a($$0, cvh.oa, 300);
      a($$0, cvh.dT, 300);
      a($$0, cvh.cv, 300);
      a($$0, cvh.gV, 300);
      a($$0, cvh.cA, 300);
      a($$0, cvh.gZ, 300);
      a($$0, ars.E, 300);
      a($$0, clr.or, 300);
      a($$0, clr.qS, 300);
      a($$0, cvh.cO, 300);
      a($$0, ars.ap, 200);
      a($$0, ars.aE, 800);
      a($$0, clr.oJ, 200);
      a($$0, clr.oI, 200);
      a($$0, clr.oM, 200);
      a($$0, clr.oL, 200);
      a($$0, clr.oK, 200);
      a($$0, ars.h, 200);
      a($$0, ars.am, 1200);
      a($$0, ars.a, 100);
      a($$0, ars.d, 100);
      a($$0, clr.pm, 100);
      a($$0, ars.p, 100);
      a($$0, clr.pn, 100);
      a($$0, ars.g, 67);
      a($$0, cvh.me, 4001);
      a($$0, clr.vL, 300);
      a($$0, cvh.mZ, 50);
      a($$0, cvh.bv, 100);
      a($$0, cvh.nS, 50);
      a($$0, cvh.nT, 300);
      a($$0, cvh.nU, 300);
      a($$0, cvh.nX, 300);
      a($$0, cvh.nY, 300);
      a($$0, cvh.ob, 300);
      a($$0, cvh.pc, 300);
      a($$0, cvh.sy, 100);
      a($$0, cvh.sz, 100);
      a($$0, cvh.ac, 300);
      return $$0;
   }

   private static boolean b(clj $$0) {
      return $$0.j().a(ars.ag);
   }

   private static void a(Map<clj, Integer> $$0, arz<clj> $$1, int $$2) {
      for (ig<clj> $$3 : kc.i.c($$1)) {
         if (!b($$3.a())) {
            $$0.put($$3.a(), $$2);
         }
      }
   }

   private static void a(Map<clj, Integer> $$0, cse $$1, int $$2) {
      clj $$3 = $$1.k();
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

   private boolean g() {
      return this.u > 0;
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.m = ip.a(this.b(), clo.b);
      biv.b($$0, this.m);
      this.u = $$0.g("BurnTime");
      this.w = $$0.g("CookTime");
      this.x = $$0.g("CookTimeTotal");
      this.v = this.a(this.m.get(1));
      sd $$1 = $$0.p("RecipesUsed");

      for (String $$2 : $$1.e()) {
         this.y.put(new agm($$2), $$1.h($$2));
      }
   }

   @Override
   protected void b(sd $$0) {
      super.b($$0);
      $$0.a("BurnTime", (short)this.u);
      $$0.a("CookTime", (short)this.w);
      $$0.a("CookTimeTotal", (short)this.x);
      biv.a($$0, this.m);
      sd $$1 = new sd();
      this.y.forEach(($$1x, $$2) -> $$1.a($$1x.toString(), $$2));
      $$0.a("RecipesUsed", $$1);
   }

   public static void a(csf $$0, hx $$1, dhn $$2, dex $$3) {
      boolean $$4 = $$3.g();
      boolean $$5 = false;
      if ($$3.g()) {
         $$3.u--;
      }

      clo $$6 = $$3.m.get(1);
      boolean $$7 = !$$3.m.get(0).b();
      boolean $$8 = !$$6.b();
      if ($$3.g() || $$8 && $$7) {
         cov<?> $$9;
         if ($$7) {
            $$9 = $$3.z.a($$3, $$0).orElse(null);
         } else {
            $$9 = null;
         }

         int $$11 = $$3.al_();
         if (!$$3.g() && a($$0.I_(), $$9, $$3.m, $$11)) {
            $$3.u = $$3.a($$6);
            $$3.v = $$3.u;
            if ($$3.g()) {
               $$5 = true;
               if ($$8) {
                  clj $$12 = $$6.d();
                  $$6.h(1);
                  if ($$6.b()) {
                     clj $$13 = $$12.s();
                     $$3.m.set(1, $$13 == null ? clo.b : new clo($$13));
                  }
               }
            }
         }

         if ($$3.g() && a($$0.I_(), $$9, $$3.m, $$11)) {
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
      } else if (!$$3.g() && $$3.w > 0) {
         $$3.w = atq.a($$3.w - 2, 0, $$3.x);
      }

      if ($$4 != $$3.g()) {
         $$5 = true;
         $$2 = $$2.a(cua.b, Boolean.valueOf($$3.g()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(it $$0, @Nullable cov<?> $$1, ip<clo> $$2, int $$3) {
      if (!$$2.get(0).b() && $$1 != null) {
         clo $$4 = $$1.b().a($$0);
         if ($$4.b()) {
            return false;
         } else {
            clo $$5 = $$2.get(2);
            if ($$5.b()) {
               return true;
            } else if (!clo.b($$5, $$4)) {
               return false;
            } else {
               return $$5.L() < $$3 && $$5.L() < $$5.g() ? true : $$5.L() < $$4.g();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(it $$0, @Nullable cov<?> $$1, ip<clo> $$2, int $$3) {
      if ($$1 != null && a($$0, $$1, $$2, $$3)) {
         clo $$4 = $$2.get(0);
         clo $$5 = $$1.b().a($$0);
         clo $$6 = $$2.get(2);
         if ($$6.b()) {
            $$2.set(2, $$5.p());
         } else if ($$6.a($$5.d())) {
            $$6.g(1);
         }

         if ($$4.a(cvh.aP.k()) && !$$2.get(1).b() && $$2.get(1).a(clr.qv)) {
            $$2.set(1, new clo(clr.qw));
         }

         $$4.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int a(clo $$0) {
      if ($$0.b()) {
         return 0;
      } else {
         clj $$1 = $$0.d();
         return f().getOrDefault($$1, 0);
      }
   }

   private static int a(csf $$0, dex $$1) {
      return $$1.z.a($$1, $$0).map($$0x -> ((coa)$$0x.b()).d()).orElse(200);
   }

   public static boolean b(clo $$0) {
      return f().containsKey($$0.d());
   }

   @Override
   public int[] a(ib $$0) {
      if ($$0 == ib.a) {
         return s;
      } else {
         return $$0 == ib.b ? r : t;
      }
   }

   @Override
   public boolean a(int $$0, clo $$1, @Nullable ib $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, clo $$1, ib $$2) {
      return $$2 == ib.a && $$0 == 1 ? $$1.a(clr.qw) || $$1.a(clr.qv) : true;
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   public boolean aj_() {
      for (clo $$0 : this.m) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public clo a(int $$0) {
      return this.m.get($$0);
   }

   @Override
   public clo a(int $$0, int $$1) {
      return biv.a(this.m, $$0, $$1);
   }

   @Override
   public clo b(int $$0) {
      return biv.a(this.m, $$0);
   }

   @Override
   public void a(int $$0, clo $$1) {
      clo $$2 = this.m.get($$0);
      boolean $$3 = !$$1.b() && clo.c($$2, $$1);
      this.m.set($$0, $$1);
      if ($$1.L() > this.al_()) {
         $$1.f(this.al_());
      }

      if ($$0 == 0 && !$$3) {
         this.x = a(this.o, this);
         this.w = 0;
         this.e();
      }
   }

   @Override
   public boolean a(cdz $$0) {
      return biu.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, clo $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         clo $$2 = this.m.get(1);
         return b($$1) || $$1.a(clr.qv) && !$$2.a(clr.qv);
      }
   }

   @Override
   public void a() {
      this.m.clear();
   }

   @Override
   public void a(@Nullable cov<?> $$0) {
      if ($$0 != null) {
         agm $$1 = $$0.a();
         this.y.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public cov<?> d() {
      return null;
   }

   @Override
   public void a(cdz $$0, List<clo> $$1) {
   }

   public void a(amj $$0) {
      List<cov<?>> $$1 = this.a($$0.z(), $$0.dl());
      $$0.a($$1);

      for (cov<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.m);
         }
      }

      this.y.clear();
   }

   public List<cov<?>> a(ami $$0, ejz $$1) {
      List<cov<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.y.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<agm> $$3 = (Entry<agm>)var4.next();
         $$0.q().a((agm)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((cov<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((coa)$$4.b()).b());
         });
      }

      return $$2;
   }

   private static void a(ami $$0, ejz $$1, int $$2, float $$3) {
      int $$4 = atq.d((float)$$2 * $$3);
      float $$5 = atq.h((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      blb.a($$0, $$1, $$4);
   }

   @Override
   public void a(ced $$0) {
      for (clo $$1 : this.m) {
         $$0.b($$1);
      }
   }
}

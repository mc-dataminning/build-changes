import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class dca extends dcf implements bgz, cfp, cfy {
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
   protected hn<cix> m = hn.a(3, cix.b);
   int u;
   int v;
   int w;
   int x;
   protected final cen n = new cen() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dca.this.u;
            case 1:
               return dca.this.v;
            case 2:
               return dca.this.w;
            case 3:
               return dca.this.x;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dca.this.u = $$1;
               break;
            case 1:
               dca.this.v = $$1;
               break;
            case 2:
               dca.this.w = $$1;
               break;
            case 3:
               dca.this.x = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Object2IntOpenHashMap<aer> y = new Object2IntOpenHashMap();
   private final cmb.a<bgj, ? extends clj> z;

   protected dca(dcn<?> $$0, gu $$1, dez $$2, cmd<? extends clj> $$3) {
      super($$0, $$1, $$2);
      this.z = cmb.b($$3);
   }

   public static Map<cis, Integer> f() {
      Map<cis, Integer> $$0 = Maps.newLinkedHashMap();
      a($$0, cja.pM, 20000);
      a($$0, csm.iB, 16000);
      a($$0, cja.rr, 2400);
      a($$0, cja.nI, 1600);
      a($$0, cja.nJ, 1600);
      a($$0, apt.r, 300);
      a($$0, apt.C, 300);
      a($$0, apt.b, 300);
      a($$0, csm.w, 300);
      a($$0, apt.i, 300);
      a($$0, csm.hU, 300);
      a($$0, apt.j, 150);
      a($$0, csm.jC, 150);
      a($$0, apt.n, 300);
      a($$0, apt.m, 300);
      a($$0, apt.k, 300);
      a($$0, apt.l, 300);
      a($$0, csm.aY, 300);
      a($$0, csm.cl, 300);
      a($$0, csm.cm, 300);
      a($$0, csm.oa, 300);
      a($$0, csm.dT, 300);
      a($$0, csm.cv, 300);
      a($$0, csm.gV, 300);
      a($$0, csm.cA, 300);
      a($$0, csm.gZ, 300);
      a($$0, apt.E, 300);
      a($$0, cja.nG, 300);
      a($$0, cja.qh, 300);
      a($$0, csm.cO, 300);
      a($$0, apt.ap, 200);
      a($$0, apt.aE, 800);
      a($$0, cja.nY, 200);
      a($$0, cja.nX, 200);
      a($$0, cja.ob, 200);
      a($$0, cja.oa, 200);
      a($$0, cja.nZ, 200);
      a($$0, apt.h, 200);
      a($$0, apt.am, 1200);
      a($$0, apt.a, 100);
      a($$0, apt.d, 100);
      a($$0, cja.oB, 100);
      a($$0, apt.p, 100);
      a($$0, cja.oC, 100);
      a($$0, apt.g, 67);
      a($$0, csm.me, 4001);
      a($$0, cja.uZ, 300);
      a($$0, csm.mZ, 50);
      a($$0, csm.bv, 100);
      a($$0, csm.nS, 50);
      a($$0, csm.nT, 300);
      a($$0, csm.nU, 300);
      a($$0, csm.nX, 300);
      a($$0, csm.nY, 300);
      a($$0, csm.ob, 300);
      a($$0, csm.pc, 300);
      a($$0, csm.rx, 100);
      a($$0, csm.ry, 100);
      a($$0, csm.ac, 300);
      return $$0;
   }

   private static boolean b(cis $$0) {
      return $$0.j().a(apt.ag);
   }

   private static void a(Map<cis, Integer> $$0, aqa<cis> $$1, int $$2) {
      for (he<cis> $$3 : jb.i.c($$1)) {
         if (!b($$3.a())) {
            $$0.put($$3.a(), $$2);
         }
      }
   }

   private static void a(Map<cis, Integer> $$0, cpk $$1, int $$2) {
      cis $$3 = $$1.k();
      if (b($$3)) {
         if (aa.aS) {
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
   public void a(qr $$0) {
      super.a($$0);
      this.m = hn.a(this.b(), cix.b);
      bgk.b($$0, this.m);
      this.u = $$0.g("BurnTime");
      this.w = $$0.g("CookTime");
      this.x = $$0.g("CookTimeTotal");
      this.v = this.a(this.m.get(1));
      qr $$1 = $$0.p("RecipesUsed");

      for (String $$2 : $$1.e()) {
         this.y.put(new aer($$2), $$1.h($$2));
      }
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      $$0.a("BurnTime", (short)this.u);
      $$0.a("CookTime", (short)this.w);
      $$0.a("CookTimeTotal", (short)this.x);
      bgk.a($$0, this.m);
      qr $$1 = new qr();
      this.y.forEach(($$1x, $$2) -> $$1.a($$1x.toString(), $$2));
      $$0.a("RecipesUsed", $$1);
   }

   public static void a(cpl $$0, gu $$1, dez $$2, dca $$3) {
      boolean $$4 = $$3.i();
      boolean $$5 = false;
      if ($$3.i()) {
         $$3.u--;
      }

      cix $$6 = $$3.m.get(1);
      boolean $$7 = !$$3.m.get(0).b();
      boolean $$8 = !$$6.b();
      if ($$3.i() || $$8 && $$7) {
         cma<?> $$9;
         if ($$7) {
            $$9 = (cma<?>)$$3.z.a($$3, $$0).orElse(null);
         } else {
            $$9 = null;
         }

         int $$11 = $$3.ab_();
         if (!$$3.i() && a($$0.B_(), $$9, $$3.m, $$11)) {
            $$3.u = $$3.a($$6);
            $$3.v = $$3.u;
            if ($$3.i()) {
               $$5 = true;
               if ($$8) {
                  cis $$12 = $$6.d();
                  $$6.h(1);
                  if ($$6.b()) {
                     cis $$13 = $$12.s();
                     $$3.m.set(1, $$13 == null ? cix.b : new cix($$13));
                  }
               }
            }
         }

         if ($$3.i() && a($$0.B_(), $$9, $$3.m, $$11)) {
            $$3.w++;
            if ($$3.w == $$3.x) {
               $$3.w = 0;
               $$3.x = a($$0, $$3);
               if (b($$0.B_(), $$9, $$3.m, $$11)) {
                  $$3.a($$9);
               }

               $$5 = true;
            }
         } else {
            $$3.w = 0;
         }
      } else if (!$$3.i() && $$3.w > 0) {
         $$3.w = arp.a($$3.w - 2, 0, $$3.x);
      }

      if ($$4 != $$3.i()) {
         $$5 = true;
         $$2 = $$2.a(crg.b, Boolean.valueOf($$3.i()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(hs $$0, @Nullable cma<?> $$1, hn<cix> $$2, int $$3) {
      if (!$$2.get(0).b() && $$1 != null) {
         cix $$4 = $$1.a($$0);
         if ($$4.b()) {
            return false;
         } else {
            cix $$5 = $$2.get(2);
            if ($$5.b()) {
               return true;
            } else if (!cix.b($$5, $$4)) {
               return false;
            } else {
               return $$5.L() < $$3 && $$5.L() < $$5.g() ? true : $$5.L() < $$4.g();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(hs $$0, @Nullable cma<?> $$1, hn<cix> $$2, int $$3) {
      if ($$1 != null && a($$0, $$1, $$2, $$3)) {
         cix $$4 = $$2.get(0);
         cix $$5 = $$1.a($$0);
         cix $$6 = $$2.get(2);
         if ($$6.b()) {
            $$2.set(2, $$5.p());
         } else if ($$6.a($$5.d())) {
            $$6.g(1);
         }

         if ($$4.a(csm.aP.k()) && !$$2.get(1).b() && $$2.get(1).a(cja.pK)) {
            $$2.set(1, new cix(cja.pL));
         }

         $$4.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int a(cix $$0) {
      if ($$0.b()) {
         return 0;
      } else {
         cis $$1 = $$0.d();
         return f().getOrDefault($$1, 0);
      }
   }

   private static int a(cpl $$0, dca $$1) {
      return $$1.z.a($$1, $$0).map(clj::d).orElse(200);
   }

   public static boolean b(cix $$0) {
      return f().containsKey($$0.d());
   }

   @Override
   public int[] a(ha $$0) {
      if ($$0 == ha.a) {
         return s;
      } else {
         return $$0 == ha.b ? r : t;
      }
   }

   @Override
   public boolean a(int $$0, cix $$1, @Nullable ha $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cix $$1, ha $$2) {
      return $$2 == ha.a && $$0 == 1 ? $$1.a(cja.pL) || $$1.a(cja.pK) : true;
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   public boolean aa_() {
      for (cix $$0 : this.m) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cix a(int $$0) {
      return this.m.get($$0);
   }

   @Override
   public cix a(int $$0, int $$1) {
      return bgk.a(this.m, $$0, $$1);
   }

   @Override
   public cix b(int $$0) {
      return bgk.a(this.m, $$0);
   }

   @Override
   public void a(int $$0, cix $$1) {
      cix $$2 = this.m.get($$0);
      boolean $$3 = !$$1.b() && cix.c($$2, $$1);
      this.m.set($$0, $$1);
      if ($$1.L() > this.ab_()) {
         $$1.f(this.ab_());
      }

      if ($$0 == 0 && !$$3) {
         this.x = a(this.o, this);
         this.w = 0;
         this.e();
      }
   }

   @Override
   public boolean a(cbm $$0) {
      return bgj.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cix $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         cix $$2 = this.m.get(1);
         return b($$1) || $$1.a(cja.pK) && !$$2.a(cja.pK);
      }
   }

   @Override
   public void a() {
      this.m.clear();
   }

   @Override
   public void a(@Nullable cma<?> $$0) {
      if ($$0 != null) {
         aer $$1 = $$0.e();
         this.y.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public cma<?> d() {
      return null;
   }

   @Override
   public void a(cbm $$0, List<cix> $$1) {
   }

   public void a(akl $$0) {
      List<cma<?>> $$1 = this.a($$0.x(), $$0.di());
      $$0.a($$1);

      for (cma<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.m);
         }
      }

      this.y.clear();
   }

   public List<cma<?>> a(akk $$0, ehd $$1) {
      List<cma<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.y.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<aer> $$3 = (Entry<aer>)var4.next();
         $$0.q().a((aer)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((cma<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((clj)$$4).b());
         });
      }

      return $$2;
   }

   private static void a(akk $$0, ehd $$1, int $$2, float $$3) {
      int $$4 = arp.d((float)$$2 * $$3);
      float $$5 = arp.h((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      bio.a($$0, $$1, $$4);
   }

   @Override
   public void a(cbq $$0) {
      for (cix $$1 : this.m) {
         $$0.b($$1);
      }
   }
}

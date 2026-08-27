import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class dcf extends dck implements bhc, cfs, cgb {
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
   protected hp<cja> m = hp.a(3, cja.b);
   int u;
   int v;
   int w;
   int x;
   protected final ceq n = new ceq() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dcf.this.u;
            case 1:
               return dcf.this.v;
            case 2:
               return dcf.this.w;
            case 3:
               return dcf.this.x;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dcf.this.u = $$1;
               break;
            case 1:
               dcf.this.v = $$1;
               break;
            case 2:
               dcf.this.w = $$1;
               break;
            case 3:
               dcf.this.x = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Object2IntOpenHashMap<aeu> y = new Object2IntOpenHashMap();
   private final cmg.a<bgm, ? extends clm> z;

   protected dcf(dcs<?> $$0, gw $$1, dfe $$2, cmi<? extends clm> $$3) {
      super($$0, $$1, $$2);
      this.z = cmg.b($$3);
   }

   public static Map<civ, Integer> f() {
      Map<civ, Integer> $$0 = Maps.newLinkedHashMap();
      a($$0, cjd.pM, 20000);
      a($$0, csr.iB, 16000);
      a($$0, cjd.rr, 2400);
      a($$0, cjd.nI, 1600);
      a($$0, cjd.nJ, 1600);
      a($$0, apw.r, 300);
      a($$0, apw.C, 300);
      a($$0, apw.b, 300);
      a($$0, csr.w, 300);
      a($$0, apw.i, 300);
      a($$0, csr.hU, 300);
      a($$0, apw.j, 150);
      a($$0, csr.jC, 150);
      a($$0, apw.n, 300);
      a($$0, apw.m, 300);
      a($$0, apw.k, 300);
      a($$0, apw.l, 300);
      a($$0, csr.aY, 300);
      a($$0, csr.cl, 300);
      a($$0, csr.cm, 300);
      a($$0, csr.oa, 300);
      a($$0, csr.dT, 300);
      a($$0, csr.cv, 300);
      a($$0, csr.gV, 300);
      a($$0, csr.cA, 300);
      a($$0, csr.gZ, 300);
      a($$0, apw.E, 300);
      a($$0, cjd.nG, 300);
      a($$0, cjd.qh, 300);
      a($$0, csr.cO, 300);
      a($$0, apw.ap, 200);
      a($$0, apw.aE, 800);
      a($$0, cjd.nY, 200);
      a($$0, cjd.nX, 200);
      a($$0, cjd.ob, 200);
      a($$0, cjd.oa, 200);
      a($$0, cjd.nZ, 200);
      a($$0, apw.h, 200);
      a($$0, apw.am, 1200);
      a($$0, apw.a, 100);
      a($$0, apw.d, 100);
      a($$0, cjd.oB, 100);
      a($$0, apw.p, 100);
      a($$0, cjd.oC, 100);
      a($$0, apw.g, 67);
      a($$0, csr.me, 4001);
      a($$0, cjd.uZ, 300);
      a($$0, csr.mZ, 50);
      a($$0, csr.bv, 100);
      a($$0, csr.nS, 50);
      a($$0, csr.nT, 300);
      a($$0, csr.nU, 300);
      a($$0, csr.nX, 300);
      a($$0, csr.nY, 300);
      a($$0, csr.ob, 300);
      a($$0, csr.pc, 300);
      a($$0, csr.rx, 100);
      a($$0, csr.ry, 100);
      a($$0, csr.ac, 300);
      return $$0;
   }

   private static boolean b(civ $$0) {
      return $$0.j().a(apw.ag);
   }

   private static void a(Map<civ, Integer> $$0, aqd<civ> $$1, int $$2) {
      for (hg<civ> $$3 : jd.i.c($$1)) {
         if (!b($$3.a())) {
            $$0.put($$3.a(), $$2);
         }
      }
   }

   private static void a(Map<civ, Integer> $$0, cpp $$1, int $$2) {
      civ $$3 = $$1.k();
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
   public void a(qu $$0) {
      super.a($$0);
      this.m = hp.a(this.b(), cja.b);
      bgn.b($$0, this.m);
      this.u = $$0.g("BurnTime");
      this.w = $$0.g("CookTime");
      this.x = $$0.g("CookTimeTotal");
      this.v = this.a(this.m.get(1));
      qu $$1 = $$0.p("RecipesUsed");

      for (String $$2 : $$1.e()) {
         this.y.put(new aeu($$2), $$1.h($$2));
      }
   }

   @Override
   protected void b(qu $$0) {
      super.b($$0);
      $$0.a("BurnTime", (short)this.u);
      $$0.a("CookTime", (short)this.w);
      $$0.a("CookTimeTotal", (short)this.x);
      bgn.a($$0, this.m);
      qu $$1 = new qu();
      this.y.forEach(($$1x, $$2) -> $$1.a($$1x.toString(), $$2));
      $$0.a("RecipesUsed", $$1);
   }

   public static void a(cpq $$0, gw $$1, dfe $$2, dcf $$3) {
      boolean $$4 = $$3.i();
      boolean $$5 = false;
      if ($$3.i()) {
         $$3.u--;
      }

      cja $$6 = $$3.m.get(1);
      boolean $$7 = !$$3.m.get(0).b();
      boolean $$8 = !$$6.b();
      if ($$3.i() || $$8 && $$7) {
         cmf<?> $$9;
         if ($$7) {
            $$9 = $$3.z.a($$3, $$0).orElse(null);
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
                  civ $$12 = $$6.d();
                  $$6.h(1);
                  if ($$6.b()) {
                     civ $$13 = $$12.s();
                     $$3.m.set(1, $$13 == null ? cja.b : new cja($$13));
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
         $$3.w = ars.a($$3.w - 2, 0, $$3.x);
      }

      if ($$4 != $$3.i()) {
         $$5 = true;
         $$2 = $$2.a(crl.b, Boolean.valueOf($$3.i()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(hu $$0, @Nullable cmf<?> $$1, hp<cja> $$2, int $$3) {
      if (!$$2.get(0).b() && $$1 != null) {
         cja $$4 = $$1.b().a($$0);
         if ($$4.b()) {
            return false;
         } else {
            cja $$5 = $$2.get(2);
            if ($$5.b()) {
               return true;
            } else if (!cja.b($$5, $$4)) {
               return false;
            } else {
               return $$5.L() < $$3 && $$5.L() < $$5.g() ? true : $$5.L() < $$4.g();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(hu $$0, @Nullable cmf<?> $$1, hp<cja> $$2, int $$3) {
      if ($$1 != null && a($$0, $$1, $$2, $$3)) {
         cja $$4 = $$2.get(0);
         cja $$5 = $$1.b().a($$0);
         cja $$6 = $$2.get(2);
         if ($$6.b()) {
            $$2.set(2, $$5.p());
         } else if ($$6.a($$5.d())) {
            $$6.g(1);
         }

         if ($$4.a(csr.aP.k()) && !$$2.get(1).b() && $$2.get(1).a(cjd.pK)) {
            $$2.set(1, new cja(cjd.pL));
         }

         $$4.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int a(cja $$0) {
      if ($$0.b()) {
         return 0;
      } else {
         civ $$1 = $$0.d();
         return f().getOrDefault($$1, 0);
      }
   }

   private static int a(cpq $$0, dcf $$1) {
      return $$1.z.a($$1, $$0).map($$0x -> ((clm)$$0x.b()).d()).orElse(200);
   }

   public static boolean b(cja $$0) {
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
   public boolean a(int $$0, cja $$1, @Nullable hc $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cja $$1, hc $$2) {
      return $$2 == hc.a && $$0 == 1 ? $$1.a(cjd.pL) || $$1.a(cjd.pK) : true;
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   public boolean aa_() {
      for (cja $$0 : this.m) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cja a(int $$0) {
      return this.m.get($$0);
   }

   @Override
   public cja a(int $$0, int $$1) {
      return bgn.a(this.m, $$0, $$1);
   }

   @Override
   public cja b(int $$0) {
      return bgn.a(this.m, $$0);
   }

   @Override
   public void a(int $$0, cja $$1) {
      cja $$2 = this.m.get($$0);
      boolean $$3 = !$$1.b() && cja.c($$2, $$1);
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
   public boolean a(cbp $$0) {
      return bgm.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cja $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         cja $$2 = this.m.get(1);
         return b($$1) || $$1.a(cjd.pK) && !$$2.a(cjd.pK);
      }
   }

   @Override
   public void a() {
      this.m.clear();
   }

   @Override
   public void a(@Nullable cmf<?> $$0) {
      if ($$0 != null) {
         aeu $$1 = $$0.a();
         this.y.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public cmf<?> d() {
      return null;
   }

   @Override
   public void a(cbp $$0, List<cja> $$1) {
   }

   public void a(ako $$0) {
      List<cmf<?>> $$1 = this.a($$0.x(), $$0.di());
      $$0.a($$1);

      for (cmf<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.m);
         }
      }

      this.y.clear();
   }

   public List<cmf<?>> a(akn $$0, ehi $$1) {
      List<cmf<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.y.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<aeu> $$3 = (Entry<aeu>)var4.next();
         $$0.q().a((aeu)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((cmf<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((clm)$$4.b()).b());
         });
      }

      return $$2;
   }

   private static void a(akn $$0, ehi $$1, int $$2, float $$3) {
      int $$4 = ars.d((float)$$2 * $$3);
      float $$5 = ars.h((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      bir.a($$0, $$1, $$4);
   }

   @Override
   public void a(cbt $$0) {
      for (cja $$1 : this.m) {
         $$0.b($$1);
      }
   }
}

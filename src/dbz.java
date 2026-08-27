import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class dbz extends dce implements bgx, cfo, cfx {
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
   protected ho<ciw> m = ho.a(3, ciw.b);
   int u;
   int v;
   int w;
   int x;
   protected final cem n = new cem() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dbz.this.u;
            case 1:
               return dbz.this.v;
            case 2:
               return dbz.this.w;
            case 3:
               return dbz.this.x;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dbz.this.u = $$1;
               break;
            case 1:
               dbz.this.v = $$1;
               break;
            case 2:
               dbz.this.w = $$1;
               break;
            case 3:
               dbz.this.x = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Object2IntOpenHashMap<aep> y = new Object2IntOpenHashMap();
   private final cma.a<bgh, ? extends cli> z;

   protected dbz(dcm<?> $$0, gv $$1, dey $$2, cmc<? extends cli> $$3) {
      super($$0, $$1, $$2);
      this.z = cma.b($$3);
   }

   public static Map<cir, Integer> f() {
      Map<cir, Integer> $$0 = Maps.newLinkedHashMap();
      a($$0, ciz.pM, 20000);
      a($$0, csl.iB, 16000);
      a($$0, ciz.rr, 2400);
      a($$0, ciz.nI, 1600);
      a($$0, ciz.nJ, 1600);
      a($$0, apr.r, 300);
      a($$0, apr.C, 300);
      a($$0, apr.b, 300);
      a($$0, csl.w, 300);
      a($$0, apr.i, 300);
      a($$0, csl.hU, 300);
      a($$0, apr.j, 150);
      a($$0, csl.jC, 150);
      a($$0, apr.n, 300);
      a($$0, apr.m, 300);
      a($$0, apr.k, 300);
      a($$0, apr.l, 300);
      a($$0, csl.aY, 300);
      a($$0, csl.cl, 300);
      a($$0, csl.cm, 300);
      a($$0, csl.oa, 300);
      a($$0, csl.dT, 300);
      a($$0, csl.cv, 300);
      a($$0, csl.gV, 300);
      a($$0, csl.cA, 300);
      a($$0, csl.gZ, 300);
      a($$0, apr.E, 300);
      a($$0, ciz.nG, 300);
      a($$0, ciz.qh, 300);
      a($$0, csl.cO, 300);
      a($$0, apr.ap, 200);
      a($$0, apr.aE, 800);
      a($$0, ciz.nY, 200);
      a($$0, ciz.nX, 200);
      a($$0, ciz.ob, 200);
      a($$0, ciz.oa, 200);
      a($$0, ciz.nZ, 200);
      a($$0, apr.h, 200);
      a($$0, apr.am, 1200);
      a($$0, apr.a, 100);
      a($$0, apr.d, 100);
      a($$0, ciz.oB, 100);
      a($$0, apr.p, 100);
      a($$0, ciz.oC, 100);
      a($$0, apr.g, 67);
      a($$0, csl.me, 4001);
      a($$0, ciz.uZ, 300);
      a($$0, csl.mZ, 50);
      a($$0, csl.bv, 100);
      a($$0, csl.nS, 50);
      a($$0, csl.nT, 300);
      a($$0, csl.nU, 300);
      a($$0, csl.nX, 300);
      a($$0, csl.nY, 300);
      a($$0, csl.ob, 300);
      a($$0, csl.pc, 300);
      a($$0, csl.rx, 100);
      a($$0, csl.ry, 100);
      a($$0, csl.ac, 300);
      return $$0;
   }

   private static boolean b(cir $$0) {
      return $$0.j().a(apr.ag);
   }

   private static void a(Map<cir, Integer> $$0, apy<cir> $$1, int $$2) {
      for (hf<cir> $$3 : jc.i.c($$1)) {
         if (!b($$3.a())) {
            $$0.put($$3.a(), $$2);
         }
      }
   }

   private static void a(Map<cir, Integer> $$0, cpj $$1, int $$2) {
      cir $$3 = $$1.k();
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
   public void a(qs $$0) {
      super.a($$0);
      this.m = ho.a(this.b(), ciw.b);
      bgi.b($$0, this.m);
      this.u = $$0.g("BurnTime");
      this.w = $$0.g("CookTime");
      this.x = $$0.g("CookTimeTotal");
      this.v = this.a(this.m.get(1));
      qs $$1 = $$0.p("RecipesUsed");

      for (String $$2 : $$1.e()) {
         this.y.put(new aep($$2), $$1.h($$2));
      }
   }

   @Override
   protected void b(qs $$0) {
      super.b($$0);
      $$0.a("BurnTime", (short)this.u);
      $$0.a("CookTime", (short)this.w);
      $$0.a("CookTimeTotal", (short)this.x);
      bgi.a($$0, this.m);
      qs $$1 = new qs();
      this.y.forEach(($$1x, $$2) -> $$1.a($$1x.toString(), $$2));
      $$0.a("RecipesUsed", $$1);
   }

   public static void a(cpk $$0, gv $$1, dey $$2, dbz $$3) {
      boolean $$4 = $$3.i();
      boolean $$5 = false;
      if ($$3.i()) {
         $$3.u--;
      }

      ciw $$6 = $$3.m.get(1);
      boolean $$7 = !$$3.m.get(0).b();
      boolean $$8 = !$$6.b();
      if ($$3.i() || $$8 && $$7) {
         clz<?> $$9;
         if ($$7) {
            $$9 = (clz<?>)$$3.z.a($$3, $$0).orElse(null);
         } else {
            $$9 = null;
         }

         int $$11 = $$3.ac_();
         if (!$$3.i() && a($$0.B_(), $$9, $$3.m, $$11)) {
            $$3.u = $$3.a($$6);
            $$3.v = $$3.u;
            if ($$3.i()) {
               $$5 = true;
               if ($$8) {
                  cir $$12 = $$6.d();
                  $$6.h(1);
                  if ($$6.b()) {
                     cir $$13 = $$12.s();
                     $$3.m.set(1, $$13 == null ? ciw.b : new ciw($$13));
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
         $$3.w = aro.a($$3.w - 2, 0, $$3.x);
      }

      if ($$4 != $$3.i()) {
         $$5 = true;
         $$2 = $$2.a(crf.b, Boolean.valueOf($$3.i()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(ht $$0, @Nullable clz<?> $$1, ho<ciw> $$2, int $$3) {
      if (!$$2.get(0).b() && $$1 != null) {
         ciw $$4 = $$1.a($$0);
         if ($$4.b()) {
            return false;
         } else {
            ciw $$5 = $$2.get(2);
            if ($$5.b()) {
               return true;
            } else if (!ciw.b($$5, $$4)) {
               return false;
            } else {
               return $$5.L() < $$3 && $$5.L() < $$5.g() ? true : $$5.L() < $$4.g();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(ht $$0, @Nullable clz<?> $$1, ho<ciw> $$2, int $$3) {
      if ($$1 != null && a($$0, $$1, $$2, $$3)) {
         ciw $$4 = $$2.get(0);
         ciw $$5 = $$1.a($$0);
         ciw $$6 = $$2.get(2);
         if ($$6.b()) {
            $$2.set(2, $$5.p());
         } else if ($$6.a($$5.d())) {
            $$6.g(1);
         }

         if ($$4.a(csl.aP.k()) && !$$2.get(1).b() && $$2.get(1).a(ciz.pK)) {
            $$2.set(1, new ciw(ciz.pL));
         }

         $$4.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int a(ciw $$0) {
      if ($$0.b()) {
         return 0;
      } else {
         cir $$1 = $$0.d();
         return f().getOrDefault($$1, 0);
      }
   }

   private static int a(cpk $$0, dbz $$1) {
      return $$1.z.a($$1, $$0).map(cli::d).orElse(200);
   }

   public static boolean b(ciw $$0) {
      return f().containsKey($$0.d());
   }

   @Override
   public int[] a(hb $$0) {
      if ($$0 == hb.a) {
         return s;
      } else {
         return $$0 == hb.b ? r : t;
      }
   }

   @Override
   public boolean a(int $$0, ciw $$1, @Nullable hb $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, ciw $$1, hb $$2) {
      return $$2 == hb.a && $$0 == 1 ? $$1.a(ciz.pL) || $$1.a(ciz.pK) : true;
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   public boolean ab_() {
      for (ciw $$0 : this.m) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ciw a(int $$0) {
      return this.m.get($$0);
   }

   @Override
   public ciw a(int $$0, int $$1) {
      return bgi.a(this.m, $$0, $$1);
   }

   @Override
   public ciw b(int $$0) {
      return bgi.a(this.m, $$0);
   }

   @Override
   public void a(int $$0, ciw $$1) {
      ciw $$2 = this.m.get($$0);
      boolean $$3 = !$$1.b() && ciw.c($$2, $$1);
      this.m.set($$0, $$1);
      if ($$1.L() > this.ac_()) {
         $$1.f(this.ac_());
      }

      if ($$0 == 0 && !$$3) {
         this.x = a(this.o, this);
         this.w = 0;
         this.e();
      }
   }

   @Override
   public boolean a(cbl $$0) {
      return bgh.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, ciw $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         ciw $$2 = this.m.get(1);
         return b($$1) || $$1.a(ciz.pK) && !$$2.a(ciz.pK);
      }
   }

   @Override
   public void a() {
      this.m.clear();
   }

   @Override
   public void a(@Nullable clz<?> $$0) {
      if ($$0 != null) {
         aep $$1 = $$0.e();
         this.y.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public clz<?> d() {
      return null;
   }

   @Override
   public void a(cbl $$0, List<ciw> $$1) {
   }

   public void a(akj $$0) {
      List<clz<?>> $$1 = this.a($$0.x(), $$0.di());
      $$0.a($$1);

      for (clz<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.m);
         }
      }

      this.y.clear();
   }

   public List<clz<?>> a(aki $$0, ehf $$1) {
      List<clz<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.y.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<aep> $$3 = (Entry<aep>)var4.next();
         $$0.q().a((aep)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((clz<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((cli)$$4).b());
         });
      }

      return $$2;
   }

   private static void a(aki $$0, ehf $$1, int $$2, float $$3) {
      int $$4 = aro.d((float)$$2 * $$3);
      float $$5 = aro.h((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      bim.a($$0, $$1, $$4);
   }

   @Override
   public void a(cbp $$0) {
      for (ciw $$1 : this.m) {
         $$0.b($$1);
      }
   }
}

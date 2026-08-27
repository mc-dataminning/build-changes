import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class dco extends dct implements bhn, cgd, cgm {
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
   protected hn<cjl> m = hn.a(3, cjl.b);
   int u;
   int v;
   int w;
   int x;
   protected final cfb n = new cfb() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dco.this.u;
            case 1:
               return dco.this.v;
            case 2:
               return dco.this.w;
            case 3:
               return dco.this.x;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dco.this.u = $$1;
               break;
            case 1:
               dco.this.v = $$1;
               break;
            case 2:
               dco.this.w = $$1;
               break;
            case 3:
               dco.this.x = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Object2IntOpenHashMap<aez> y = new Object2IntOpenHashMap();
   private final cmr.a<bgx, ? extends clx> z;

   protected dco(ddb<?> $$0, gw $$1, dfd $$2, cmt<? extends clx> $$3) {
      super($$0, $$1, $$2);
      this.z = cmr.b($$3);
   }

   public static Map<cjg, Integer> f() {
      Map<cjg, Integer> $$0 = Maps.newLinkedHashMap();
      a($$0, cjo.pM, 20000);
      a($$0, cte.iB, 16000);
      a($$0, cjo.rr, 2400);
      a($$0, cjo.nI, 1600);
      a($$0, cjo.nJ, 1600);
      a($$0, aqd.r, 300);
      a($$0, aqd.C, 300);
      a($$0, aqd.b, 300);
      a($$0, cte.w, 300);
      a($$0, aqd.i, 300);
      a($$0, cte.hU, 300);
      a($$0, aqd.j, 150);
      a($$0, cte.jC, 150);
      a($$0, aqd.n, 300);
      a($$0, aqd.m, 300);
      a($$0, aqd.k, 300);
      a($$0, aqd.l, 300);
      a($$0, cte.aY, 300);
      a($$0, cte.cl, 300);
      a($$0, cte.cm, 300);
      a($$0, cte.oa, 300);
      a($$0, cte.dT, 300);
      a($$0, cte.cv, 300);
      a($$0, cte.gV, 300);
      a($$0, cte.cA, 300);
      a($$0, cte.gZ, 300);
      a($$0, aqd.E, 300);
      a($$0, cjo.nG, 300);
      a($$0, cjo.qh, 300);
      a($$0, cte.cO, 300);
      a($$0, aqd.ap, 200);
      a($$0, aqd.aE, 800);
      a($$0, cjo.nY, 200);
      a($$0, cjo.nX, 200);
      a($$0, cjo.ob, 200);
      a($$0, cjo.oa, 200);
      a($$0, cjo.nZ, 200);
      a($$0, aqd.h, 200);
      a($$0, aqd.am, 1200);
      a($$0, aqd.a, 100);
      a($$0, aqd.d, 100);
      a($$0, cjo.oB, 100);
      a($$0, aqd.p, 100);
      a($$0, cjo.oC, 100);
      a($$0, aqd.g, 67);
      a($$0, cte.me, 4001);
      a($$0, cjo.uZ, 300);
      a($$0, cte.mZ, 50);
      a($$0, cte.bv, 100);
      a($$0, cte.nS, 50);
      a($$0, cte.nT, 300);
      a($$0, cte.nU, 300);
      a($$0, cte.nX, 300);
      a($$0, cte.nY, 300);
      a($$0, cte.ob, 300);
      a($$0, cte.pc, 300);
      a($$0, cte.rx, 100);
      a($$0, cte.ry, 100);
      a($$0, cte.ac, 300);
      return $$0;
   }

   private static boolean b(cjg $$0) {
      return $$0.j().a(aqd.ag);
   }

   private static void a(Map<cjg, Integer> $$0, aqk<cjg> $$1, int $$2) {
      for (he<cjg> $$3 : jb.i.c($$1)) {
         if (!b($$3.a())) {
            $$0.put($$3.a(), $$2);
         }
      }
   }

   private static void a(Map<cjg, Integer> $$0, cqa $$1, int $$2) {
      cjg $$3 = $$1.k();
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
   public void a(qw $$0) {
      super.a($$0);
      this.m = hn.a(this.b(), cjl.b);
      bgy.b($$0, this.m);
      this.u = $$0.g("BurnTime");
      this.w = $$0.g("CookTime");
      this.x = $$0.g("CookTimeTotal");
      this.v = this.a(this.m.get(1));
      qw $$1 = $$0.p("RecipesUsed");

      for (String $$2 : $$1.e()) {
         this.y.put(new aez($$2), $$1.h($$2));
      }
   }

   @Override
   protected void b(qw $$0) {
      super.b($$0);
      $$0.a("BurnTime", (short)this.u);
      $$0.a("CookTime", (short)this.w);
      $$0.a("CookTimeTotal", (short)this.x);
      bgy.a($$0, this.m);
      qw $$1 = new qw();
      this.y.forEach(($$1x, $$2) -> $$1.a($$1x.toString(), $$2));
      $$0.a("RecipesUsed", $$1);
   }

   public static void a(cqb $$0, gw $$1, dfd $$2, dco $$3) {
      boolean $$4 = $$3.i();
      boolean $$5 = false;
      if ($$3.i()) {
         $$3.u--;
      }

      cjl $$6 = $$3.m.get(1);
      boolean $$7 = !$$3.m.get(0).b();
      boolean $$8 = !$$6.b();
      if ($$3.i() || $$8 && $$7) {
         cmq<?> $$9;
         if ($$7) {
            $$9 = $$3.z.a($$3, $$0).orElse(null);
         } else {
            $$9 = null;
         }

         int $$11 = $$3.ag_();
         if (!$$3.i() && a($$0.G_(), $$9, $$3.m, $$11)) {
            $$3.u = $$3.a($$6);
            $$3.v = $$3.u;
            if ($$3.i()) {
               $$5 = true;
               if ($$8) {
                  cjg $$12 = $$6.d();
                  $$6.h(1);
                  if ($$6.b()) {
                     cjg $$13 = $$12.s();
                     $$3.m.set(1, $$13 == null ? cjl.b : new cjl($$13));
                  }
               }
            }
         }

         if ($$3.i() && a($$0.G_(), $$9, $$3.m, $$11)) {
            $$3.w++;
            if ($$3.w == $$3.x) {
               $$3.w = 0;
               $$3.x = a($$0, $$3);
               if (b($$0.G_(), $$9, $$3.m, $$11)) {
                  $$3.a($$9);
               }

               $$5 = true;
            }
         } else {
            $$3.w = 0;
         }
      } else if (!$$3.i() && $$3.w > 0) {
         $$3.w = asb.a($$3.w - 2, 0, $$3.x);
      }

      if ($$4 != $$3.i()) {
         $$5 = true;
         $$2 = $$2.a(crw.b, Boolean.valueOf($$3.i()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(hr $$0, @Nullable cmq<?> $$1, hn<cjl> $$2, int $$3) {
      if (!$$2.get(0).b() && $$1 != null) {
         cjl $$4 = $$1.b().a($$0);
         if ($$4.b()) {
            return false;
         } else {
            cjl $$5 = $$2.get(2);
            if ($$5.b()) {
               return true;
            } else if (!cjl.b($$5, $$4)) {
               return false;
            } else {
               return $$5.L() < $$3 && $$5.L() < $$5.g() ? true : $$5.L() < $$4.g();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(hr $$0, @Nullable cmq<?> $$1, hn<cjl> $$2, int $$3) {
      if ($$1 != null && a($$0, $$1, $$2, $$3)) {
         cjl $$4 = $$2.get(0);
         cjl $$5 = $$1.b().a($$0);
         cjl $$6 = $$2.get(2);
         if ($$6.b()) {
            $$2.set(2, $$5.p());
         } else if ($$6.a($$5.d())) {
            $$6.g(1);
         }

         if ($$4.a(cte.aP.k()) && !$$2.get(1).b() && $$2.get(1).a(cjo.pK)) {
            $$2.set(1, new cjl(cjo.pL));
         }

         $$4.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int a(cjl $$0) {
      if ($$0.b()) {
         return 0;
      } else {
         cjg $$1 = $$0.d();
         return f().getOrDefault($$1, 0);
      }
   }

   private static int a(cqb $$0, dco $$1) {
      return $$1.z.a($$1, $$0).map($$0x -> ((clx)$$0x.b()).d()).orElse(200);
   }

   public static boolean b(cjl $$0) {
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
   public boolean a(int $$0, cjl $$1, @Nullable ha $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cjl $$1, ha $$2) {
      return $$2 == ha.a && $$0 == 1 ? $$1.a(cjo.pL) || $$1.a(cjo.pK) : true;
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   public boolean af_() {
      for (cjl $$0 : this.m) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cjl a(int $$0) {
      return this.m.get($$0);
   }

   @Override
   public cjl a(int $$0, int $$1) {
      return bgy.a(this.m, $$0, $$1);
   }

   @Override
   public cjl b(int $$0) {
      return bgy.a(this.m, $$0);
   }

   @Override
   public void a(int $$0, cjl $$1) {
      cjl $$2 = this.m.get($$0);
      boolean $$3 = !$$1.b() && cjl.c($$2, $$1);
      this.m.set($$0, $$1);
      if ($$1.L() > this.ag_()) {
         $$1.f(this.ag_());
      }

      if ($$0 == 0 && !$$3) {
         this.x = a(this.o, this);
         this.w = 0;
         this.e();
      }
   }

   @Override
   public boolean a(cca $$0) {
      return bgx.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cjl $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         cjl $$2 = this.m.get(1);
         return b($$1) || $$1.a(cjo.pK) && !$$2.a(cjo.pK);
      }
   }

   @Override
   public void a() {
      this.m.clear();
   }

   @Override
   public void a(@Nullable cmq<?> $$0) {
      if ($$0 != null) {
         aez $$1 = $$0.a();
         this.y.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public cmq<?> d() {
      return null;
   }

   @Override
   public void a(cca $$0, List<cjl> $$1) {
   }

   public void a(aku $$0) {
      List<cmq<?>> $$1 = this.a($$0.x(), $$0.dj());
      $$0.a($$1);

      for (cmq<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.m);
         }
      }

      this.y.clear();
   }

   public List<cmq<?>> a(akt $$0, ehh $$1) {
      List<cmq<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.y.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<aez> $$3 = (Entry<aez>)var4.next();
         $$0.q().a((aez)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((cmq<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((clx)$$4.b()).b());
         });
      }

      return $$2;
   }

   private static void a(akt $$0, ehh $$1, int $$2, float $$3) {
      int $$4 = asb.d((float)$$2 * $$3);
      float $$5 = asb.h((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      bjc.a($$0, $$1, $$4);
   }

   @Override
   public void a(cce $$0) {
      for (cjl $$1 : this.m) {
         $$0.b($$1);
      }
   }
}

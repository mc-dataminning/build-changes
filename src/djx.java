import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class djx extends dkc implements bnp, cnf, cno {
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
   protected iu<cqm> m = iu.a(3, cqm.h);
   int u;
   int v;
   int w;
   int x;
   @Nullable
   private static volatile Map<cqh, Integer> y;
   protected final cma n = new cma() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return djx.this.u;
            case 1:
               return djx.this.v;
            case 2:
               return djx.this.w;
            case 3:
               return djx.this.x;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               djx.this.u = $$1;
               break;
            case 1:
               djx.this.v = $$1;
               break;
            case 2:
               djx.this.w = $$1;
               break;
            case 3:
               djx.this.x = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Object2IntOpenHashMap<ajh> z = new Object2IntOpenHashMap();
   private final cts.a<bmw, ? extends csy> A;

   protected djx(dkk<?> $$0, ib $$1, dnb $$2, ctu<? extends csy> $$3) {
      super($$0, $$1, $$2);
      this.A = cts.b($$3);
   }

   public static void f() {
      y = null;
   }

   public static Map<cqh, Integer> g() {
      Map<cqh, Integer> $$0 = y;
      if ($$0 != null) {
         return $$0;
      } else {
         Map<cqh, Integer> $$1 = Maps.newLinkedHashMap();
         a($$1, cqp.qz, 20000);
         a($$1, dae.iB, 16000);
         a($$1, cqp.sf, 2400);
         a($$1, cqp.ov, 1600);
         a($$1, cqp.ow, 1600);
         a($$1, auv.r, 300);
         a($$1, auv.C, 300);
         a($$1, auv.b, 300);
         a($$1, dae.w, 300);
         a($$1, auv.i, 300);
         a($$1, dae.hU, 300);
         a($$1, auv.j, 150);
         a($$1, dae.jC, 150);
         a($$1, auv.n, 300);
         a($$1, auv.m, 300);
         a($$1, auv.k, 300);
         a($$1, auv.l, 300);
         a($$1, dae.aY, 300);
         a($$1, dae.cl, 300);
         a($$1, dae.cm, 300);
         a($$1, dae.oa, 300);
         a($$1, dae.dT, 300);
         a($$1, dae.cv, 300);
         a($$1, dae.gV, 300);
         a($$1, dae.cA, 300);
         a($$1, dae.gZ, 300);
         a($$1, auv.E, 300);
         a($$1, cqp.ot, 300);
         a($$1, cqp.qU, 300);
         a($$1, dae.cO, 300);
         a($$1, auv.ap, 200);
         a($$1, auv.aE, 800);
         a($$1, cqp.oL, 200);
         a($$1, cqp.oK, 200);
         a($$1, cqp.oO, 200);
         a($$1, cqp.oN, 200);
         a($$1, cqp.oM, 200);
         a($$1, auv.h, 200);
         a($$1, auv.am, 1200);
         a($$1, auv.a, 100);
         a($$1, auv.d, 100);
         a($$1, cqp.po, 100);
         a($$1, auv.p, 100);
         a($$1, cqp.pp, 100);
         a($$1, auv.g, 67);
         a($$1, dae.me, 4001);
         a($$1, cqp.vR, 300);
         a($$1, dae.mZ, 50);
         a($$1, dae.bv, 100);
         a($$1, dae.nS, 50);
         a($$1, dae.nT, 300);
         a($$1, dae.nU, 300);
         a($$1, dae.nX, 300);
         a($$1, dae.nY, 300);
         a($$1, dae.ob, 300);
         a($$1, dae.pc, 300);
         a($$1, dae.sy, 100);
         a($$1, dae.sz, 100);
         a($$1, dae.ac, 300);
         y = $$1;
         return $$1;
      }
   }

   private static boolean b(cqh $$0) {
      return $$0.k().a(auv.ag);
   }

   private static void a(Map<cqh, Integer> $$0, avd<cqh> $$1, int $$2) {
      for (il<cqh> $$3 : ki.h.c($$1)) {
         if (!b($$3.a())) {
            $$0.put($$3.a(), $$2);
         }
      }
   }

   private static void a(Map<cqh, Integer> $$0, cxa $$1, int $$2) {
      cqh $$3 = $$1.l();
      if (b($$3)) {
         if (aa.aW) {
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

   private boolean j() {
      return this.u > 0;
   }

   @Override
   public void a(ta $$0, in.a $$1) {
      super.a($$0, $$1);
      this.m = iu.a(this.b(), cqm.h);
      bmx.b($$0, this.m);
      this.u = $$0.g("BurnTime");
      this.w = $$0.g("CookTime");
      this.x = $$0.g("CookTimeTotal");
      this.v = this.a(this.m.get(1));
      ta $$2 = $$0.p("RecipesUsed");

      for (String $$3 : $$2.e()) {
         this.z.put(new ajh($$3), $$2.h($$3));
      }
   }

   @Override
   protected void b(ta $$0, in.a $$1) {
      super.b($$0, $$1);
      $$0.a("BurnTime", (short)this.u);
      $$0.a("CookTime", (short)this.w);
      $$0.a("CookTimeTotal", (short)this.x);
      bmx.a($$0, this.m);
      ta $$2 = new ta();
      this.z.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), $$2x));
      $$0.a("RecipesUsed", $$2);
   }

   public static void a(cxb $$0, ib $$1, dnb $$2, djx $$3) {
      boolean $$4 = $$3.j();
      boolean $$5 = false;
      if ($$3.j()) {
         $$3.u--;
      }

      cqm $$6 = $$3.m.get(1);
      boolean $$7 = !$$3.m.get(0).b();
      boolean $$8 = !$$6.b();
      if ($$3.j() || $$8 && $$7) {
         ctr<?> $$9;
         if ($$7) {
            $$9 = $$3.A.a($$3, $$0).orElse(null);
         } else {
            $$9 = null;
         }

         int $$11 = $$3.ak_();
         if (!$$3.j() && a($$0.H_(), $$9, $$3.m, $$11)) {
            $$3.u = $$3.a($$6);
            $$3.v = $$3.u;
            if ($$3.j()) {
               $$5 = true;
               if ($$8) {
                  cqh $$12 = $$6.d();
                  $$6.h(1);
                  if ($$6.b()) {
                     cqh $$13 = $$12.t();
                     $$3.m.set(1, $$13 == null ? cqm.h : new cqm($$13));
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
         $$3.w = aww.a($$3.w - 2, 0, $$3.x);
      }

      if ($$4 != $$3.j()) {
         $$5 = true;
         $$2 = $$2.a(cyx.b, Boolean.valueOf($$3.j()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(iz $$0, @Nullable ctr<?> $$1, iu<cqm> $$2, int $$3) {
      if (!$$2.get(0).b() && $$1 != null) {
         cqm $$4 = $$1.b().a($$0);
         if ($$4.b()) {
            return false;
         } else {
            cqm $$5 = $$2.get(2);
            if ($$5.b()) {
               return true;
            } else if (!cqm.b($$5, $$4)) {
               return false;
            } else {
               return $$5.M() < $$3 && $$5.M() < $$5.g() ? true : $$5.M() < $$4.g();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(iz $$0, @Nullable ctr<?> $$1, iu<cqm> $$2, int $$3) {
      if ($$1 != null && a($$0, $$1, $$2, $$3)) {
         cqm $$4 = $$2.get(0);
         cqm $$5 = $$1.b().a($$0);
         cqm $$6 = $$2.get(2);
         if ($$6.b()) {
            $$2.set(2, $$5.q());
         } else if ($$6.a($$5.d())) {
            $$6.g(1);
         }

         if ($$4.a(dae.aP.l()) && !$$2.get(1).b() && $$2.get(1).a(cqp.qx)) {
            $$2.set(1, new cqm(cqp.qy));
         }

         $$4.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int a(cqm $$0) {
      if ($$0.b()) {
         return 0;
      } else {
         cqh $$1 = $$0.d();
         return g().getOrDefault($$1, 0);
      }
   }

   private static int a(cxb $$0, djx $$1) {
      return $$1.A.a($$1, $$0).map($$0x -> ((csy)$$0x.b()).d()).orElse(200);
   }

   public static boolean b(cqm $$0) {
      return g().containsKey($$0.d());
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
   public boolean a(int $$0, cqm $$1, @Nullable ih $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cqm $$1, ih $$2) {
      return $$2 == ih.a && $$0 == 1 ? $$1.a(cqp.qy) || $$1.a(cqp.qx) : true;
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   public boolean ai_() {
      for (cqm $$0 : this.m) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cqm a(int $$0) {
      return this.m.get($$0);
   }

   @Override
   public cqm a(int $$0, int $$1) {
      return bmx.a(this.m, $$0, $$1);
   }

   @Override
   public cqm b(int $$0) {
      return bmx.a(this.m, $$0);
   }

   @Override
   public void a(int $$0, cqm $$1) {
      cqm $$2 = this.m.get($$0);
      boolean $$3 = !$$1.b() && cqm.c($$2, $$1);
      this.m.set($$0, $$1);
      if ($$1.M() > this.ak_()) {
         $$1.f(this.ak_());
      }

      if ($$0 == 0 && !$$3) {
         this.x = a(this.o, this);
         this.w = 0;
         this.e();
      }
   }

   @Override
   public boolean a(ciu $$0) {
      return bmw.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cqm $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         cqm $$2 = this.m.get(1);
         return b($$1) || $$1.a(cqp.qx) && !$$2.a(cqp.qx);
      }
   }

   @Override
   public void a() {
      this.m.clear();
   }

   @Override
   public void a(@Nullable ctr<?> $$0) {
      if ($$0 != null) {
         ajh $$1 = $$0.a();
         this.z.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public ctr<?> d() {
      return null;
   }

   @Override
   public void a(ciu $$0, List<cqm> $$1) {
   }

   public void a(apg $$0) {
      List<ctr<?>> $$1 = this.a($$0.z(), $$0.dk());
      $$0.a($$1);

      for (ctr<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.m);
         }
      }

      this.z.clear();
   }

   public List<ctr<?>> a(apf $$0, ept $$1) {
      List<ctr<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.z.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<ajh> $$3 = (Entry<ajh>)var4.next();
         $$0.r().a((ajh)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((ctr<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((csy)$$4.b()).b());
         });
      }

      return $$2;
   }

   private static void a(apf $$0, ept $$1, int $$2, float $$3) {
      int $$4 = aww.d((float)$$2 * $$3);
      float $$5 = aww.h((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      bpf.a($$0, $$1, $$4);
   }

   @Override
   public void a(ciy $$0) {
      for (cqm $$1 : this.m) {
         $$0.b($$1);
      }
   }
}

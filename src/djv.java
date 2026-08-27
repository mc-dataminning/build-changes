import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class djv extends dka implements bno, cnd, cnm {
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
   protected iu<cqk> m = iu.a(3, cqk.h);
   int u;
   int v;
   int w;
   int x;
   @Nullable
   private static volatile Map<cqf, Integer> y;
   protected final cly n = new cly() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return djv.this.u;
            case 1:
               return djv.this.v;
            case 2:
               return djv.this.w;
            case 3:
               return djv.this.x;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               djv.this.u = $$1;
               break;
            case 1:
               djv.this.v = $$1;
               break;
            case 2:
               djv.this.w = $$1;
               break;
            case 3:
               djv.this.x = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Object2IntOpenHashMap<ajh> z = new Object2IntOpenHashMap();
   private final ctq.a<bmv, ? extends csw> A;

   protected djv(dki<?> $$0, ib $$1, dmz $$2, cts<? extends csw> $$3) {
      super($$0, $$1, $$2);
      this.A = ctq.b($$3);
   }

   public static void f() {
      y = null;
   }

   public static Map<cqf, Integer> g() {
      Map<cqf, Integer> $$0 = y;
      if ($$0 != null) {
         return $$0;
      } else {
         Map<cqf, Integer> $$1 = Maps.newLinkedHashMap();
         a($$1, cqn.qz, 20000);
         a($$1, dac.iB, 16000);
         a($$1, cqn.sf, 2400);
         a($$1, cqn.ov, 1600);
         a($$1, cqn.ow, 1600);
         a($$1, auv.r, 300);
         a($$1, auv.C, 300);
         a($$1, auv.b, 300);
         a($$1, dac.w, 300);
         a($$1, auv.i, 300);
         a($$1, dac.hU, 300);
         a($$1, auv.j, 150);
         a($$1, dac.jC, 150);
         a($$1, auv.n, 300);
         a($$1, auv.m, 300);
         a($$1, auv.k, 300);
         a($$1, auv.l, 300);
         a($$1, dac.aY, 300);
         a($$1, dac.cl, 300);
         a($$1, dac.cm, 300);
         a($$1, dac.oa, 300);
         a($$1, dac.dT, 300);
         a($$1, dac.cv, 300);
         a($$1, dac.gV, 300);
         a($$1, dac.cA, 300);
         a($$1, dac.gZ, 300);
         a($$1, auv.E, 300);
         a($$1, cqn.ot, 300);
         a($$1, cqn.qU, 300);
         a($$1, dac.cO, 300);
         a($$1, auv.ap, 200);
         a($$1, auv.aE, 800);
         a($$1, cqn.oL, 200);
         a($$1, cqn.oK, 200);
         a($$1, cqn.oO, 200);
         a($$1, cqn.oN, 200);
         a($$1, cqn.oM, 200);
         a($$1, auv.h, 200);
         a($$1, auv.am, 1200);
         a($$1, auv.a, 100);
         a($$1, auv.d, 100);
         a($$1, cqn.po, 100);
         a($$1, auv.p, 100);
         a($$1, cqn.pp, 100);
         a($$1, auv.g, 67);
         a($$1, dac.me, 4001);
         a($$1, cqn.vQ, 300);
         a($$1, dac.mZ, 50);
         a($$1, dac.bv, 100);
         a($$1, dac.nS, 50);
         a($$1, dac.nT, 300);
         a($$1, dac.nU, 300);
         a($$1, dac.nX, 300);
         a($$1, dac.nY, 300);
         a($$1, dac.ob, 300);
         a($$1, dac.pc, 300);
         a($$1, dac.sy, 100);
         a($$1, dac.sz, 100);
         a($$1, dac.ac, 300);
         y = $$1;
         return $$1;
      }
   }

   private static boolean b(cqf $$0) {
      return $$0.k().a(auv.ag);
   }

   private static void a(Map<cqf, Integer> $$0, avd<cqf> $$1, int $$2) {
      for (il<cqf> $$3 : ki.h.c($$1)) {
         if (!b($$3.a())) {
            $$0.put($$3.a(), $$2);
         }
      }
   }

   private static void a(Map<cqf, Integer> $$0, cwy $$1, int $$2) {
      cqf $$3 = $$1.l();
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
      this.m = iu.a(this.b(), cqk.h);
      bmw.b($$0, this.m);
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
      bmw.a($$0, this.m);
      ta $$2 = new ta();
      this.z.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), $$2x));
      $$0.a("RecipesUsed", $$2);
   }

   public static void a(cwz $$0, ib $$1, dmz $$2, djv $$3) {
      boolean $$4 = $$3.j();
      boolean $$5 = false;
      if ($$3.j()) {
         $$3.u--;
      }

      cqk $$6 = $$3.m.get(1);
      boolean $$7 = !$$3.m.get(0).b();
      boolean $$8 = !$$6.b();
      if ($$3.j() || $$8 && $$7) {
         ctp<?> $$9;
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
                  cqf $$12 = $$6.d();
                  $$6.h(1);
                  if ($$6.b()) {
                     cqf $$13 = $$12.t();
                     $$3.m.set(1, $$13 == null ? cqk.h : new cqk($$13));
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
         $$2 = $$2.a(cyv.b, Boolean.valueOf($$3.j()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(iz $$0, @Nullable ctp<?> $$1, iu<cqk> $$2, int $$3) {
      if (!$$2.get(0).b() && $$1 != null) {
         cqk $$4 = $$1.b().a($$0);
         if ($$4.b()) {
            return false;
         } else {
            cqk $$5 = $$2.get(2);
            if ($$5.b()) {
               return true;
            } else if (!cqk.b($$5, $$4)) {
               return false;
            } else {
               return $$5.M() < $$3 && $$5.M() < $$5.g() ? true : $$5.M() < $$4.g();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(iz $$0, @Nullable ctp<?> $$1, iu<cqk> $$2, int $$3) {
      if ($$1 != null && a($$0, $$1, $$2, $$3)) {
         cqk $$4 = $$2.get(0);
         cqk $$5 = $$1.b().a($$0);
         cqk $$6 = $$2.get(2);
         if ($$6.b()) {
            $$2.set(2, $$5.q());
         } else if ($$6.a($$5.d())) {
            $$6.g(1);
         }

         if ($$4.a(dac.aP.l()) && !$$2.get(1).b() && $$2.get(1).a(cqn.qx)) {
            $$2.set(1, new cqk(cqn.qy));
         }

         $$4.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int a(cqk $$0) {
      if ($$0.b()) {
         return 0;
      } else {
         cqf $$1 = $$0.d();
         return g().getOrDefault($$1, 0);
      }
   }

   private static int a(cwz $$0, djv $$1) {
      return $$1.A.a($$1, $$0).map($$0x -> ((csw)$$0x.b()).d()).orElse(200);
   }

   public static boolean b(cqk $$0) {
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
   public boolean a(int $$0, cqk $$1, @Nullable ih $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cqk $$1, ih $$2) {
      return $$2 == ih.a && $$0 == 1 ? $$1.a(cqn.qy) || $$1.a(cqn.qx) : true;
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   public boolean ai_() {
      for (cqk $$0 : this.m) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cqk a(int $$0) {
      return this.m.get($$0);
   }

   @Override
   public cqk a(int $$0, int $$1) {
      return bmw.a(this.m, $$0, $$1);
   }

   @Override
   public cqk b(int $$0) {
      return bmw.a(this.m, $$0);
   }

   @Override
   public void a(int $$0, cqk $$1) {
      cqk $$2 = this.m.get($$0);
      boolean $$3 = !$$1.b() && cqk.c($$2, $$1);
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
   public boolean a(cis $$0) {
      return bmv.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cqk $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         cqk $$2 = this.m.get(1);
         return b($$1) || $$1.a(cqn.qx) && !$$2.a(cqn.qx);
      }
   }

   @Override
   public void a() {
      this.m.clear();
   }

   @Override
   public void a(@Nullable ctp<?> $$0) {
      if ($$0 != null) {
         ajh $$1 = $$0.a();
         this.z.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public ctp<?> d() {
      return null;
   }

   @Override
   public void a(cis $$0, List<cqk> $$1) {
   }

   public void a(apg $$0) {
      List<ctp<?>> $$1 = this.a($$0.z(), $$0.dk());
      $$0.a($$1);

      for (ctp<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.m);
         }
      }

      this.z.clear();
   }

   public List<ctp<?>> a(apf $$0, epr $$1) {
      List<ctp<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.z.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<ajh> $$3 = (Entry<ajh>)var4.next();
         $$0.r().a((ajh)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((ctp<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((csw)$$4.b()).b());
         });
      }

      return $$2;
   }

   private static void a(apf $$0, epr $$1, int $$2, float $$3) {
      int $$4 = aww.d((float)$$2 * $$3);
      float $$5 = aww.h((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      bpe.a($$0, $$1, $$4);
   }

   @Override
   public void a(ciw $$0) {
      for (cqk $$1 : this.m) {
         $$0.b($$1);
      }
   }
}

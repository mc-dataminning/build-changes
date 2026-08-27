import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class dgs extends dgx implements bko, cjy, ckh {
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
   protected iq<cng> m = iq.a(3, cng.f);
   int u;
   int v;
   int w;
   int x;
   protected final cit n = new cit() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dgs.this.u;
            case 1:
               return dgs.this.v;
            case 2:
               return dgs.this.w;
            case 3:
               return dgs.this.x;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dgs.this.u = $$1;
               break;
            case 1:
               dgs.this.v = $$1;
               break;
            case 2:
               dgs.this.w = $$1;
               break;
            case 3:
               dgs.this.x = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Object2IntOpenHashMap<ahh> y = new Object2IntOpenHashMap();
   private final cqn.a<bjv, ? extends cpt> z;

   protected dgs(dhf<?> $$0, hx $$1, djp $$2, cqp<? extends cpt> $$3) {
      super($$0, $$1, $$2);
      this.z = cqn.b($$3);
   }

   public static Map<cnb, Integer> f() {
      Map<cnb, Integer> $$0 = Maps.newLinkedHashMap();
      a($$0, cnj.qz, 20000);
      a($$0, cxa.iB, 16000);
      a($$0, cnj.sf, 2400);
      a($$0, cnj.ov, 1600);
      a($$0, cnj.ow, 1600);
      a($$0, asq.r, 300);
      a($$0, asq.C, 300);
      a($$0, asq.b, 300);
      a($$0, cxa.w, 300);
      a($$0, asq.i, 300);
      a($$0, cxa.hU, 300);
      a($$0, asq.j, 150);
      a($$0, cxa.jC, 150);
      a($$0, asq.n, 300);
      a($$0, asq.m, 300);
      a($$0, asq.k, 300);
      a($$0, asq.l, 300);
      a($$0, cxa.aY, 300);
      a($$0, cxa.cl, 300);
      a($$0, cxa.cm, 300);
      a($$0, cxa.oa, 300);
      a($$0, cxa.dT, 300);
      a($$0, cxa.cv, 300);
      a($$0, cxa.gV, 300);
      a($$0, cxa.cA, 300);
      a($$0, cxa.gZ, 300);
      a($$0, asq.E, 300);
      a($$0, cnj.ot, 300);
      a($$0, cnj.qU, 300);
      a($$0, cxa.cO, 300);
      a($$0, asq.ap, 200);
      a($$0, asq.aE, 800);
      a($$0, cnj.oL, 200);
      a($$0, cnj.oK, 200);
      a($$0, cnj.oO, 200);
      a($$0, cnj.oN, 200);
      a($$0, cnj.oM, 200);
      a($$0, asq.h, 200);
      a($$0, asq.am, 1200);
      a($$0, asq.a, 100);
      a($$0, asq.d, 100);
      a($$0, cnj.po, 100);
      a($$0, asq.p, 100);
      a($$0, cnj.pp, 100);
      a($$0, asq.g, 67);
      a($$0, cxa.me, 4001);
      a($$0, cnj.vP, 300);
      a($$0, cxa.mZ, 50);
      a($$0, cxa.bv, 100);
      a($$0, cxa.nS, 50);
      a($$0, cxa.nT, 300);
      a($$0, cxa.nU, 300);
      a($$0, cxa.nX, 300);
      a($$0, cxa.nY, 300);
      a($$0, cxa.ob, 300);
      a($$0, cxa.pc, 300);
      a($$0, cxa.sy, 100);
      a($$0, cxa.sz, 100);
      a($$0, cxa.ac, 300);
      return $$0;
   }

   private static boolean b(cnb $$0) {
      return $$0.i().a(asq.ag);
   }

   private static void a(Map<cnb, Integer> $$0, asx<cnb> $$1, int $$2) {
      for (ih<cnb> $$3 : kd.h.c($$1)) {
         if (!b($$3.a())) {
            $$0.put($$3.a(), $$2);
         }
      }
   }

   private static void a(Map<cnb, Integer> $$0, ctw $$1, int $$2) {
      cnb $$3 = $$1.j();
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

   private boolean g() {
      return this.u > 0;
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.m = iq.a(this.b(), cng.f);
      bjw.b($$0, this.m);
      this.u = $$0.g("BurnTime");
      this.w = $$0.g("CookTime");
      this.x = $$0.g("CookTimeTotal");
      this.v = this.a(this.m.get(1));
      so $$1 = $$0.p("RecipesUsed");

      for (String $$2 : $$1.e()) {
         this.y.put(new ahh($$2), $$1.h($$2));
      }
   }

   @Override
   protected void b(so $$0) {
      super.b($$0);
      $$0.a("BurnTime", (short)this.u);
      $$0.a("CookTime", (short)this.w);
      $$0.a("CookTimeTotal", (short)this.x);
      bjw.a($$0, this.m);
      so $$1 = new so();
      this.y.forEach(($$1x, $$2) -> $$1.a($$1x.toString(), $$2));
      $$0.a("RecipesUsed", $$1);
   }

   public static void a(ctx $$0, hx $$1, djp $$2, dgs $$3) {
      boolean $$4 = $$3.g();
      boolean $$5 = false;
      if ($$3.g()) {
         $$3.u--;
      }

      cng $$6 = $$3.m.get(1);
      boolean $$7 = !$$3.m.get(0).b();
      boolean $$8 = !$$6.b();
      if ($$3.g() || $$8 && $$7) {
         cqm<?> $$9;
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
                  cnb $$12 = $$6.d();
                  $$6.h(1);
                  if ($$6.b()) {
                     cnb $$13 = $$12.r();
                     $$3.m.set(1, $$13 == null ? cng.f : new cng($$13));
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
         $$3.w = aup.a($$3.w - 2, 0, $$3.x);
      }

      if ($$4 != $$3.g()) {
         $$5 = true;
         $$2 = $$2.a(cvt.b, Boolean.valueOf($$3.g()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(iu $$0, @Nullable cqm<?> $$1, iq<cng> $$2, int $$3) {
      if (!$$2.get(0).b() && $$1 != null) {
         cng $$4 = $$1.b().a($$0);
         if ($$4.b()) {
            return false;
         } else {
            cng $$5 = $$2.get(2);
            if ($$5.b()) {
               return true;
            } else if (!cng.b($$5, $$4)) {
               return false;
            } else {
               return $$5.L() < $$3 && $$5.L() < $$5.g() ? true : $$5.L() < $$4.g();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(iu $$0, @Nullable cqm<?> $$1, iq<cng> $$2, int $$3) {
      if ($$1 != null && a($$0, $$1, $$2, $$3)) {
         cng $$4 = $$2.get(0);
         cng $$5 = $$1.b().a($$0);
         cng $$6 = $$2.get(2);
         if ($$6.b()) {
            $$2.set(2, $$5.p());
         } else if ($$6.a($$5.d())) {
            $$6.g(1);
         }

         if ($$4.a(cxa.aP.j()) && !$$2.get(1).b() && $$2.get(1).a(cnj.qx)) {
            $$2.set(1, new cng(cnj.qy));
         }

         $$4.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int a(cng $$0) {
      if ($$0.b()) {
         return 0;
      } else {
         cnb $$1 = $$0.d();
         return f().getOrDefault($$1, 0);
      }
   }

   private static int a(ctx $$0, dgs $$1) {
      return $$1.z.a($$1, $$0).map($$0x -> ((cpt)$$0x.b()).d()).orElse(200);
   }

   public static boolean b(cng $$0) {
      return f().containsKey($$0.d());
   }

   @Override
   public int[] a(ic $$0) {
      if ($$0 == ic.a) {
         return s;
      } else {
         return $$0 == ic.b ? r : t;
      }
   }

   @Override
   public boolean a(int $$0, cng $$1, @Nullable ic $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cng $$1, ic $$2) {
      return $$2 == ic.a && $$0 == 1 ? $$1.a(cnj.qy) || $$1.a(cnj.qx) : true;
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   public boolean aj_() {
      for (cng $$0 : this.m) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cng a(int $$0) {
      return this.m.get($$0);
   }

   @Override
   public cng a(int $$0, int $$1) {
      return bjw.a(this.m, $$0, $$1);
   }

   @Override
   public cng b(int $$0) {
      return bjw.a(this.m, $$0);
   }

   @Override
   public void a(int $$0, cng $$1) {
      cng $$2 = this.m.get($$0);
      boolean $$3 = !$$1.b() && cng.c($$2, $$1);
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
   public boolean a(cfq $$0) {
      return bjv.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cng $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         cng $$2 = this.m.get(1);
         return b($$1) || $$1.a(cnj.qx) && !$$2.a(cnj.qx);
      }
   }

   @Override
   public void a() {
      this.m.clear();
   }

   @Override
   public void a(@Nullable cqm<?> $$0) {
      if ($$0 != null) {
         ahh $$1 = $$0.a();
         this.y.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public cqm<?> d() {
      return null;
   }

   @Override
   public void a(cfq $$0, List<cng> $$1) {
   }

   public void a(anf $$0) {
      List<cqm<?>> $$1 = this.a($$0.z(), $$0.dj());
      $$0.a($$1);

      for (cqm<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.m);
         }
      }

      this.y.clear();
   }

   public List<cqm<?>> a(ane $$0, emc $$1) {
      List<cqm<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.y.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<ahh> $$3 = (Entry<ahh>)var4.next();
         $$0.r().a((ahh)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((cqm<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((cpt)$$4.b()).b());
         });
      }

      return $$2;
   }

   private static void a(ane $$0, emc $$1, int $$2, float $$3) {
      int $$4 = aup.d((float)$$2 * $$3);
      float $$5 = aup.h((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      bme.a($$0, $$1, $$4);
   }

   @Override
   public void a(cfu $$0) {
      for (cng $$1 : this.m) {
         $$0.b($$1);
      }
   }
}

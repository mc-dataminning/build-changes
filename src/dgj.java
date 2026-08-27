import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class dgj extends dgo implements bkl, cjp, cjy {
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
   protected iq<cmx> m = iq.a(3, cmx.f);
   int u;
   int v;
   int w;
   int x;
   protected final cik n = new cik() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dgj.this.u;
            case 1:
               return dgj.this.v;
            case 2:
               return dgj.this.w;
            case 3:
               return dgj.this.x;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dgj.this.u = $$1;
               break;
            case 1:
               dgj.this.v = $$1;
               break;
            case 2:
               dgj.this.w = $$1;
               break;
            case 3:
               dgj.this.x = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Object2IntOpenHashMap<ahg> y = new Object2IntOpenHashMap();
   private final cqe.a<bjt, ? extends cpk> z;

   protected dgj(dgw<?> $$0, hx $$1, djg $$2, cqg<? extends cpk> $$3) {
      super($$0, $$1, $$2);
      this.z = cqe.b($$3);
   }

   public static Map<cms, Integer> f() {
      Map<cms, Integer> $$0 = Maps.newLinkedHashMap();
      a($$0, cna.qx, 20000);
      a($$0, cwr.iB, 16000);
      a($$0, cna.sd, 2400);
      a($$0, cna.ot, 1600);
      a($$0, cna.ou, 1600);
      a($$0, aso.r, 300);
      a($$0, aso.C, 300);
      a($$0, aso.b, 300);
      a($$0, cwr.w, 300);
      a($$0, aso.i, 300);
      a($$0, cwr.hU, 300);
      a($$0, aso.j, 150);
      a($$0, cwr.jC, 150);
      a($$0, aso.n, 300);
      a($$0, aso.m, 300);
      a($$0, aso.k, 300);
      a($$0, aso.l, 300);
      a($$0, cwr.aY, 300);
      a($$0, cwr.cl, 300);
      a($$0, cwr.cm, 300);
      a($$0, cwr.oa, 300);
      a($$0, cwr.dT, 300);
      a($$0, cwr.cv, 300);
      a($$0, cwr.gV, 300);
      a($$0, cwr.cA, 300);
      a($$0, cwr.gZ, 300);
      a($$0, aso.E, 300);
      a($$0, cna.or, 300);
      a($$0, cna.qS, 300);
      a($$0, cwr.cO, 300);
      a($$0, aso.ap, 200);
      a($$0, aso.aE, 800);
      a($$0, cna.oJ, 200);
      a($$0, cna.oI, 200);
      a($$0, cna.oM, 200);
      a($$0, cna.oL, 200);
      a($$0, cna.oK, 200);
      a($$0, aso.h, 200);
      a($$0, aso.am, 1200);
      a($$0, aso.a, 100);
      a($$0, aso.d, 100);
      a($$0, cna.pm, 100);
      a($$0, aso.p, 100);
      a($$0, cna.pn, 100);
      a($$0, aso.g, 67);
      a($$0, cwr.me, 4001);
      a($$0, cna.vM, 300);
      a($$0, cwr.mZ, 50);
      a($$0, cwr.bv, 100);
      a($$0, cwr.nS, 50);
      a($$0, cwr.nT, 300);
      a($$0, cwr.nU, 300);
      a($$0, cwr.nX, 300);
      a($$0, cwr.nY, 300);
      a($$0, cwr.ob, 300);
      a($$0, cwr.pc, 300);
      a($$0, cwr.sy, 100);
      a($$0, cwr.sz, 100);
      a($$0, cwr.ac, 300);
      return $$0;
   }

   private static boolean b(cms $$0) {
      return $$0.j().a(aso.ag);
   }

   private static void a(Map<cms, Integer> $$0, asv<cms> $$1, int $$2) {
      for (ih<cms> $$3 : kd.h.c($$1)) {
         if (!b($$3.a())) {
            $$0.put($$3.a(), $$2);
         }
      }
   }

   private static void a(Map<cms, Integer> $$0, ctn $$1, int $$2) {
      cms $$3 = $$1.k();
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
   public void a(sn $$0) {
      super.a($$0);
      this.m = iq.a(this.b(), cmx.f);
      bju.b($$0, this.m);
      this.u = $$0.g("BurnTime");
      this.w = $$0.g("CookTime");
      this.x = $$0.g("CookTimeTotal");
      this.v = this.a(this.m.get(1));
      sn $$1 = $$0.p("RecipesUsed");

      for (String $$2 : $$1.e()) {
         this.y.put(new ahg($$2), $$1.h($$2));
      }
   }

   @Override
   protected void b(sn $$0) {
      super.b($$0);
      $$0.a("BurnTime", (short)this.u);
      $$0.a("CookTime", (short)this.w);
      $$0.a("CookTimeTotal", (short)this.x);
      bju.a($$0, this.m);
      sn $$1 = new sn();
      this.y.forEach(($$1x, $$2) -> $$1.a($$1x.toString(), $$2));
      $$0.a("RecipesUsed", $$1);
   }

   public static void a(cto $$0, hx $$1, djg $$2, dgj $$3) {
      boolean $$4 = $$3.g();
      boolean $$5 = false;
      if ($$3.g()) {
         $$3.u--;
      }

      cmx $$6 = $$3.m.get(1);
      boolean $$7 = !$$3.m.get(0).b();
      boolean $$8 = !$$6.b();
      if ($$3.g() || $$8 && $$7) {
         cqd<?> $$9;
         if ($$7) {
            $$9 = $$3.z.a($$3, $$0).orElse(null);
         } else {
            $$9 = null;
         }

         int $$11 = $$3.ak_();
         if (!$$3.g() && a($$0.I_(), $$9, $$3.m, $$11)) {
            $$3.u = $$3.a($$6);
            $$3.v = $$3.u;
            if ($$3.g()) {
               $$5 = true;
               if ($$8) {
                  cms $$12 = $$6.d();
                  $$6.h(1);
                  if ($$6.b()) {
                     cms $$13 = $$12.s();
                     $$3.m.set(1, $$13 == null ? cmx.f : new cmx($$13));
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
         $$3.w = aun.a($$3.w - 2, 0, $$3.x);
      }

      if ($$4 != $$3.g()) {
         $$5 = true;
         $$2 = $$2.a(cvk.b, Boolean.valueOf($$3.g()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(iu $$0, @Nullable cqd<?> $$1, iq<cmx> $$2, int $$3) {
      if (!$$2.get(0).b() && $$1 != null) {
         cmx $$4 = $$1.b().a($$0);
         if ($$4.b()) {
            return false;
         } else {
            cmx $$5 = $$2.get(2);
            if ($$5.b()) {
               return true;
            } else if (!cmx.b($$5, $$4)) {
               return false;
            } else {
               return $$5.L() < $$3 && $$5.L() < $$5.g() ? true : $$5.L() < $$4.g();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(iu $$0, @Nullable cqd<?> $$1, iq<cmx> $$2, int $$3) {
      if ($$1 != null && a($$0, $$1, $$2, $$3)) {
         cmx $$4 = $$2.get(0);
         cmx $$5 = $$1.b().a($$0);
         cmx $$6 = $$2.get(2);
         if ($$6.b()) {
            $$2.set(2, $$5.p());
         } else if ($$6.a($$5.d())) {
            $$6.g(1);
         }

         if ($$4.a(cwr.aP.k()) && !$$2.get(1).b() && $$2.get(1).a(cna.qv)) {
            $$2.set(1, new cmx(cna.qw));
         }

         $$4.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int a(cmx $$0) {
      if ($$0.b()) {
         return 0;
      } else {
         cms $$1 = $$0.d();
         return f().getOrDefault($$1, 0);
      }
   }

   private static int a(cto $$0, dgj $$1) {
      return $$1.z.a($$1, $$0).map($$0x -> ((cpk)$$0x.b()).d()).orElse(200);
   }

   public static boolean b(cmx $$0) {
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
   public boolean a(int $$0, cmx $$1, @Nullable ic $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cmx $$1, ic $$2) {
      return $$2 == ic.a && $$0 == 1 ? $$1.a(cna.qw) || $$1.a(cna.qv) : true;
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   public boolean ai_() {
      for (cmx $$0 : this.m) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cmx a(int $$0) {
      return this.m.get($$0);
   }

   @Override
   public cmx a(int $$0, int $$1) {
      return bju.a(this.m, $$0, $$1);
   }

   @Override
   public cmx b(int $$0) {
      return bju.a(this.m, $$0);
   }

   @Override
   public void a(int $$0, cmx $$1) {
      cmx $$2 = this.m.get($$0);
      boolean $$3 = !$$1.b() && cmx.c($$2, $$1);
      this.m.set($$0, $$1);
      if ($$1.L() > this.ak_()) {
         $$1.f(this.ak_());
      }

      if ($$0 == 0 && !$$3) {
         this.x = a(this.o, this);
         this.w = 0;
         this.e();
      }
   }

   @Override
   public boolean a(cfh $$0) {
      return bjt.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cmx $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         cmx $$2 = this.m.get(1);
         return b($$1) || $$1.a(cna.qv) && !$$2.a(cna.qv);
      }
   }

   @Override
   public void a() {
      this.m.clear();
   }

   @Override
   public void a(@Nullable cqd<?> $$0) {
      if ($$0 != null) {
         ahg $$1 = $$0.a();
         this.y.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public cqd<?> d() {
      return null;
   }

   @Override
   public void a(cfh $$0, List<cmx> $$1) {
   }

   public void a(ane $$0) {
      List<cqd<?>> $$1 = this.a($$0.z(), $$0.dk());
      $$0.a($$1);

      for (cqd<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.m);
         }
      }

      this.y.clear();
   }

   public List<cqd<?>> a(and $$0, els $$1) {
      List<cqd<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.y.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<ahg> $$3 = (Entry<ahg>)var4.next();
         $$0.r().a((ahg)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((cqd<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((cpk)$$4.b()).b());
         });
      }

      return $$2;
   }

   private static void a(and $$0, els $$1, int $$2, float $$3) {
      int $$4 = aun.d((float)$$2 * $$3);
      float $$5 = aun.h((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      bma.a($$0, $$1, $$4);
   }

   @Override
   public void a(cfl $$0) {
      for (cmx $$1 : this.m) {
         $$0.b($$1);
      }
   }
}

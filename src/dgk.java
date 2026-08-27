import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class dgk extends dgp implements bkm, cjq, cjz {
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
   protected iq<cmy> m = iq.a(3, cmy.f);
   int u;
   int v;
   int w;
   int x;
   protected final cil n = new cil() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dgk.this.u;
            case 1:
               return dgk.this.v;
            case 2:
               return dgk.this.w;
            case 3:
               return dgk.this.x;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dgk.this.u = $$1;
               break;
            case 1:
               dgk.this.v = $$1;
               break;
            case 2:
               dgk.this.w = $$1;
               break;
            case 3:
               dgk.this.x = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Object2IntOpenHashMap<ahg> y = new Object2IntOpenHashMap();
   private final cqf.a<bju, ? extends cpl> z;

   protected dgk(dgx<?> $$0, hx $$1, djh $$2, cqh<? extends cpl> $$3) {
      super($$0, $$1, $$2);
      this.z = cqf.b($$3);
   }

   public static Map<cmt, Integer> f() {
      Map<cmt, Integer> $$0 = Maps.newLinkedHashMap();
      a($$0, cnb.qx, 20000);
      a($$0, cws.iB, 16000);
      a($$0, cnb.sd, 2400);
      a($$0, cnb.ot, 1600);
      a($$0, cnb.ou, 1600);
      a($$0, asp.r, 300);
      a($$0, asp.C, 300);
      a($$0, asp.b, 300);
      a($$0, cws.w, 300);
      a($$0, asp.i, 300);
      a($$0, cws.hU, 300);
      a($$0, asp.j, 150);
      a($$0, cws.jC, 150);
      a($$0, asp.n, 300);
      a($$0, asp.m, 300);
      a($$0, asp.k, 300);
      a($$0, asp.l, 300);
      a($$0, cws.aY, 300);
      a($$0, cws.cl, 300);
      a($$0, cws.cm, 300);
      a($$0, cws.oa, 300);
      a($$0, cws.dT, 300);
      a($$0, cws.cv, 300);
      a($$0, cws.gV, 300);
      a($$0, cws.cA, 300);
      a($$0, cws.gZ, 300);
      a($$0, asp.E, 300);
      a($$0, cnb.or, 300);
      a($$0, cnb.qS, 300);
      a($$0, cws.cO, 300);
      a($$0, asp.ap, 200);
      a($$0, asp.aE, 800);
      a($$0, cnb.oJ, 200);
      a($$0, cnb.oI, 200);
      a($$0, cnb.oM, 200);
      a($$0, cnb.oL, 200);
      a($$0, cnb.oK, 200);
      a($$0, asp.h, 200);
      a($$0, asp.am, 1200);
      a($$0, asp.a, 100);
      a($$0, asp.d, 100);
      a($$0, cnb.pm, 100);
      a($$0, asp.p, 100);
      a($$0, cnb.pn, 100);
      a($$0, asp.g, 67);
      a($$0, cws.me, 4001);
      a($$0, cnb.vM, 300);
      a($$0, cws.mZ, 50);
      a($$0, cws.bv, 100);
      a($$0, cws.nS, 50);
      a($$0, cws.nT, 300);
      a($$0, cws.nU, 300);
      a($$0, cws.nX, 300);
      a($$0, cws.nY, 300);
      a($$0, cws.ob, 300);
      a($$0, cws.pc, 300);
      a($$0, cws.sy, 100);
      a($$0, cws.sz, 100);
      a($$0, cws.ac, 300);
      return $$0;
   }

   private static boolean b(cmt $$0) {
      return $$0.j().a(asp.ag);
   }

   private static void a(Map<cmt, Integer> $$0, asw<cmt> $$1, int $$2) {
      for (ih<cmt> $$3 : kd.h.c($$1)) {
         if (!b($$3.a())) {
            $$0.put($$3.a(), $$2);
         }
      }
   }

   private static void a(Map<cmt, Integer> $$0, cto $$1, int $$2) {
      cmt $$3 = $$1.k();
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
      this.m = iq.a(this.b(), cmy.f);
      bjv.b($$0, this.m);
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
      bjv.a($$0, this.m);
      sn $$1 = new sn();
      this.y.forEach(($$1x, $$2) -> $$1.a($$1x.toString(), $$2));
      $$0.a("RecipesUsed", $$1);
   }

   public static void a(ctp $$0, hx $$1, djh $$2, dgk $$3) {
      boolean $$4 = $$3.g();
      boolean $$5 = false;
      if ($$3.g()) {
         $$3.u--;
      }

      cmy $$6 = $$3.m.get(1);
      boolean $$7 = !$$3.m.get(0).b();
      boolean $$8 = !$$6.b();
      if ($$3.g() || $$8 && $$7) {
         cqe<?> $$9;
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
                  cmt $$12 = $$6.d();
                  $$6.h(1);
                  if ($$6.b()) {
                     cmt $$13 = $$12.s();
                     $$3.m.set(1, $$13 == null ? cmy.f : new cmy($$13));
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
         $$3.w = auo.a($$3.w - 2, 0, $$3.x);
      }

      if ($$4 != $$3.g()) {
         $$5 = true;
         $$2 = $$2.a(cvl.b, Boolean.valueOf($$3.g()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(iu $$0, @Nullable cqe<?> $$1, iq<cmy> $$2, int $$3) {
      if (!$$2.get(0).b() && $$1 != null) {
         cmy $$4 = $$1.b().a($$0);
         if ($$4.b()) {
            return false;
         } else {
            cmy $$5 = $$2.get(2);
            if ($$5.b()) {
               return true;
            } else if (!cmy.b($$5, $$4)) {
               return false;
            } else {
               return $$5.L() < $$3 && $$5.L() < $$5.g() ? true : $$5.L() < $$4.g();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(iu $$0, @Nullable cqe<?> $$1, iq<cmy> $$2, int $$3) {
      if ($$1 != null && a($$0, $$1, $$2, $$3)) {
         cmy $$4 = $$2.get(0);
         cmy $$5 = $$1.b().a($$0);
         cmy $$6 = $$2.get(2);
         if ($$6.b()) {
            $$2.set(2, $$5.p());
         } else if ($$6.a($$5.d())) {
            $$6.g(1);
         }

         if ($$4.a(cws.aP.k()) && !$$2.get(1).b() && $$2.get(1).a(cnb.qv)) {
            $$2.set(1, new cmy(cnb.qw));
         }

         $$4.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int a(cmy $$0) {
      if ($$0.b()) {
         return 0;
      } else {
         cmt $$1 = $$0.d();
         return f().getOrDefault($$1, 0);
      }
   }

   private static int a(ctp $$0, dgk $$1) {
      return $$1.z.a($$1, $$0).map($$0x -> ((cpl)$$0x.b()).d()).orElse(200);
   }

   public static boolean b(cmy $$0) {
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
   public boolean a(int $$0, cmy $$1, @Nullable ic $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cmy $$1, ic $$2) {
      return $$2 == ic.a && $$0 == 1 ? $$1.a(cnb.qw) || $$1.a(cnb.qv) : true;
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   public boolean ai_() {
      for (cmy $$0 : this.m) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cmy a(int $$0) {
      return this.m.get($$0);
   }

   @Override
   public cmy a(int $$0, int $$1) {
      return bjv.a(this.m, $$0, $$1);
   }

   @Override
   public cmy b(int $$0) {
      return bjv.a(this.m, $$0);
   }

   @Override
   public void a(int $$0, cmy $$1) {
      cmy $$2 = this.m.get($$0);
      boolean $$3 = !$$1.b() && cmy.c($$2, $$1);
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
   public boolean a(cfi $$0) {
      return bju.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cmy $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         cmy $$2 = this.m.get(1);
         return b($$1) || $$1.a(cnb.qv) && !$$2.a(cnb.qv);
      }
   }

   @Override
   public void a() {
      this.m.clear();
   }

   @Override
   public void a(@Nullable cqe<?> $$0) {
      if ($$0 != null) {
         ahg $$1 = $$0.a();
         this.y.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public cqe<?> d() {
      return null;
   }

   @Override
   public void a(cfi $$0, List<cmy> $$1) {
   }

   public void a(ane $$0) {
      List<cqe<?>> $$1 = this.a($$0.z(), $$0.dk());
      $$0.a($$1);

      for (cqe<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.m);
         }
      }

      this.y.clear();
   }

   public List<cqe<?>> a(and $$0, elt $$1) {
      List<cqe<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.y.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<ahg> $$3 = (Entry<ahg>)var4.next();
         $$0.r().a((ahg)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((cqe<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((cpl)$$4.b()).b());
         });
      }

      return $$2;
   }

   private static void a(and $$0, elt $$1, int $$2, float $$3) {
      int $$4 = auo.d((float)$$2 * $$3);
      float $$5 = auo.h((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      bmb.a($$0, $$1, $$4);
   }

   @Override
   public void a(cfm $$0) {
      for (cmy $$1 : this.m) {
         $$0.b($$1);
      }
   }
}

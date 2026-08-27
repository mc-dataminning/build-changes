import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class dfs extends dfx implements bjw, ciz, cji {
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
   protected io<cmh> m = io.a(3, cmh.f);
   int u;
   int v;
   int w;
   int x;
   protected final chu n = new chu() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dfs.this.u;
            case 1:
               return dfs.this.v;
            case 2:
               return dfs.this.w;
            case 3:
               return dfs.this.x;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dfs.this.u = $$1;
               break;
            case 1:
               dfs.this.v = $$1;
               break;
            case 2:
               dfs.this.w = $$1;
               break;
            case 3:
               dfs.this.x = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Object2IntOpenHashMap<agt> y = new Object2IntOpenHashMap();
   private final cpo.a<bje, ? extends cou> z;

   protected dfs(dgf<?> $$0, hv $$1, dip $$2, cpq<? extends cou> $$3) {
      super($$0, $$1, $$2);
      this.z = cpo.b($$3);
   }

   public static Map<cmc, Integer> f() {
      Map<cmc, Integer> $$0 = Maps.newLinkedHashMap();
      a($$0, cmk.qx, 20000);
      a($$0, cwb.iB, 16000);
      a($$0, cmk.sd, 2400);
      a($$0, cmk.ot, 1600);
      a($$0, cmk.ou, 1600);
      a($$0, arz.r, 300);
      a($$0, arz.C, 300);
      a($$0, arz.b, 300);
      a($$0, cwb.w, 300);
      a($$0, arz.i, 300);
      a($$0, cwb.hU, 300);
      a($$0, arz.j, 150);
      a($$0, cwb.jC, 150);
      a($$0, arz.n, 300);
      a($$0, arz.m, 300);
      a($$0, arz.k, 300);
      a($$0, arz.l, 300);
      a($$0, cwb.aY, 300);
      a($$0, cwb.cl, 300);
      a($$0, cwb.cm, 300);
      a($$0, cwb.oa, 300);
      a($$0, cwb.dT, 300);
      a($$0, cwb.cv, 300);
      a($$0, cwb.gV, 300);
      a($$0, cwb.cA, 300);
      a($$0, cwb.gZ, 300);
      a($$0, arz.E, 300);
      a($$0, cmk.or, 300);
      a($$0, cmk.qS, 300);
      a($$0, cwb.cO, 300);
      a($$0, arz.ap, 200);
      a($$0, arz.aE, 800);
      a($$0, cmk.oJ, 200);
      a($$0, cmk.oI, 200);
      a($$0, cmk.oM, 200);
      a($$0, cmk.oL, 200);
      a($$0, cmk.oK, 200);
      a($$0, arz.h, 200);
      a($$0, arz.am, 1200);
      a($$0, arz.a, 100);
      a($$0, arz.d, 100);
      a($$0, cmk.pm, 100);
      a($$0, arz.p, 100);
      a($$0, cmk.pn, 100);
      a($$0, arz.g, 67);
      a($$0, cwb.me, 4001);
      a($$0, cmk.vM, 300);
      a($$0, cwb.mZ, 50);
      a($$0, cwb.bv, 100);
      a($$0, cwb.nS, 50);
      a($$0, cwb.nT, 300);
      a($$0, cwb.nU, 300);
      a($$0, cwb.nX, 300);
      a($$0, cwb.nY, 300);
      a($$0, cwb.ob, 300);
      a($$0, cwb.pc, 300);
      a($$0, cwb.sy, 100);
      a($$0, cwb.sz, 100);
      a($$0, cwb.ac, 300);
      return $$0;
   }

   private static boolean b(cmc $$0) {
      return $$0.j().a(arz.ag);
   }

   private static void a(Map<cmc, Integer> $$0, asg<cmc> $$1, int $$2) {
      for (ie<cmc> $$3 : kb.h.c($$1)) {
         if (!b($$3.a())) {
            $$0.put($$3.a(), $$2);
         }
      }
   }

   private static void a(Map<cmc, Integer> $$0, csx $$1, int $$2) {
      cmc $$3 = $$1.k();
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
   public void a(sj $$0) {
      super.a($$0);
      this.m = io.a(this.b(), cmh.f);
      bjf.b($$0, this.m);
      this.u = $$0.g("BurnTime");
      this.w = $$0.g("CookTime");
      this.x = $$0.g("CookTimeTotal");
      this.v = this.a(this.m.get(1));
      sj $$1 = $$0.p("RecipesUsed");

      for (String $$2 : $$1.e()) {
         this.y.put(new agt($$2), $$1.h($$2));
      }
   }

   @Override
   protected void b(sj $$0) {
      super.b($$0);
      $$0.a("BurnTime", (short)this.u);
      $$0.a("CookTime", (short)this.w);
      $$0.a("CookTimeTotal", (short)this.x);
      bjf.a($$0, this.m);
      sj $$1 = new sj();
      this.y.forEach(($$1x, $$2) -> $$1.a($$1x.toString(), $$2));
      $$0.a("RecipesUsed", $$1);
   }

   public static void a(csy $$0, hv $$1, dip $$2, dfs $$3) {
      boolean $$4 = $$3.g();
      boolean $$5 = false;
      if ($$3.g()) {
         $$3.u--;
      }

      cmh $$6 = $$3.m.get(1);
      boolean $$7 = !$$3.m.get(0).b();
      boolean $$8 = !$$6.b();
      if ($$3.g() || $$8 && $$7) {
         cpn<?> $$9;
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
                  cmc $$12 = $$6.d();
                  $$6.h(1);
                  if ($$6.b()) {
                     cmc $$13 = $$12.s();
                     $$3.m.set(1, $$13 == null ? cmh.f : new cmh($$13));
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
         $$3.w = aty.a($$3.w - 2, 0, $$3.x);
      }

      if ($$4 != $$3.g()) {
         $$5 = true;
         $$2 = $$2.a(cuu.b, Boolean.valueOf($$3.g()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(is $$0, @Nullable cpn<?> $$1, io<cmh> $$2, int $$3) {
      if (!$$2.get(0).b() && $$1 != null) {
         cmh $$4 = $$1.b().a($$0);
         if ($$4.b()) {
            return false;
         } else {
            cmh $$5 = $$2.get(2);
            if ($$5.b()) {
               return true;
            } else if (!cmh.b($$5, $$4)) {
               return false;
            } else {
               return $$5.L() < $$3 && $$5.L() < $$5.g() ? true : $$5.L() < $$4.g();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(is $$0, @Nullable cpn<?> $$1, io<cmh> $$2, int $$3) {
      if ($$1 != null && a($$0, $$1, $$2, $$3)) {
         cmh $$4 = $$2.get(0);
         cmh $$5 = $$1.b().a($$0);
         cmh $$6 = $$2.get(2);
         if ($$6.b()) {
            $$2.set(2, $$5.p());
         } else if ($$6.a($$5.d())) {
            $$6.g(1);
         }

         if ($$4.a(cwb.aP.k()) && !$$2.get(1).b() && $$2.get(1).a(cmk.qv)) {
            $$2.set(1, new cmh(cmk.qw));
         }

         $$4.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int a(cmh $$0) {
      if ($$0.b()) {
         return 0;
      } else {
         cmc $$1 = $$0.d();
         return f().getOrDefault($$1, 0);
      }
   }

   private static int a(csy $$0, dfs $$1) {
      return $$1.z.a($$1, $$0).map($$0x -> ((cou)$$0x.b()).d()).orElse(200);
   }

   public static boolean b(cmh $$0) {
      return f().containsKey($$0.d());
   }

   @Override
   public int[] a(ia $$0) {
      if ($$0 == ia.a) {
         return s;
      } else {
         return $$0 == ia.b ? r : t;
      }
   }

   @Override
   public boolean a(int $$0, cmh $$1, @Nullable ia $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cmh $$1, ia $$2) {
      return $$2 == ia.a && $$0 == 1 ? $$1.a(cmk.qw) || $$1.a(cmk.qv) : true;
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   public boolean ai_() {
      for (cmh $$0 : this.m) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cmh a(int $$0) {
      return this.m.get($$0);
   }

   @Override
   public cmh a(int $$0, int $$1) {
      return bjf.a(this.m, $$0, $$1);
   }

   @Override
   public cmh b(int $$0) {
      return bjf.a(this.m, $$0);
   }

   @Override
   public void a(int $$0, cmh $$1) {
      cmh $$2 = this.m.get($$0);
      boolean $$3 = !$$1.b() && cmh.c($$2, $$1);
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
   public boolean a(cer $$0) {
      return bje.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cmh $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         cmh $$2 = this.m.get(1);
         return b($$1) || $$1.a(cmk.qv) && !$$2.a(cmk.qv);
      }
   }

   @Override
   public void a() {
      this.m.clear();
   }

   @Override
   public void a(@Nullable cpn<?> $$0) {
      if ($$0 != null) {
         agt $$1 = $$0.a();
         this.y.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public cpn<?> d() {
      return null;
   }

   @Override
   public void a(cer $$0, List<cmh> $$1) {
   }

   public void a(amq $$0) {
      List<cpn<?>> $$1 = this.a($$0.z(), $$0.dk());
      $$0.a($$1);

      for (cpn<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.m);
         }
      }

      this.y.clear();
   }

   public List<cpn<?>> a(amp $$0, elb $$1) {
      List<cpn<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.y.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<agt> $$3 = (Entry<agt>)var4.next();
         $$0.q().a((agt)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((cpn<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((cou)$$4.b()).b());
         });
      }

      return $$2;
   }

   private static void a(amp $$0, elb $$1, int $$2, float $$3) {
      int $$4 = aty.d((float)$$2 * $$3);
      float $$5 = aty.h((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      bll.a($$0, $$1, $$4);
   }

   @Override
   public void a(cev $$0) {
      for (cmh $$1 : this.m) {
         $$0.b($$1);
      }
   }
}

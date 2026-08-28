import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class doq extends dow implements brb, cre, crp {
   protected static final int b = 0;
   protected static final int c = 1;
   protected static final int d = 2;
   public static final int e = 0;
   private static final int[] q = new int[]{0};
   private static final int[] r = new int[]{2, 1};
   private static final int[] s = new int[]{1};
   public static final int f = 1;
   public static final int g = 2;
   public static final int h = 3;
   public static final int i = 4;
   public static final int j = 200;
   public static final int k = 2;
   protected jr<cuk> l = jr.a(3, cuk.l);
   int t;
   int u;
   int v;
   int w;
   @Nullable
   private static volatile Map<cuf, Integer> x;
   protected final cpz m = new cpz() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return doq.this.t;
            case 1:
               return doq.this.u;
            case 2:
               return doq.this.v;
            case 3:
               return doq.this.w;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               doq.this.t = $$1;
               break;
            case 1:
               doq.this.u = $$1;
               break;
            case 2:
               doq.this.v = $$1;
               break;
            case 3:
               doq.this.w = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Object2IntOpenHashMap<alb> y = new Object2IntOpenHashMap();
   private final cyt.a<bqi, ? extends cxz> z;

   protected doq(dpe<?> $$0, iz $$1, drx $$2, cyv<? extends cxz> $$3) {
      super($$0, $$1, $$2);
      this.z = cyt.b($$3);
   }

   public static void f() {
      x = null;
   }

   public static Map<cuf, Integer> g() {
      Map<cuf, Integer> $$0 = x;
      if ($$0 != null) {
         return $$0;
      } else {
         Map<cuf, Integer> $$1 = Maps.newLinkedHashMap();
         a($$1, cun.qA, 20000);
         a($$1, dew.iB, 16000);
         a($$1, cun.sg, 2400);
         a($$1, cun.ow, 1600);
         a($$1, cun.ox, 1600);
         a($$1, awu.r, 300);
         a($$1, awu.C, 300);
         a($$1, awu.b, 300);
         a($$1, dew.w, 300);
         a($$1, awu.i, 300);
         a($$1, dew.hU, 300);
         a($$1, awu.j, 150);
         a($$1, dew.jC, 150);
         a($$1, awu.n, 300);
         a($$1, awu.m, 300);
         a($$1, awu.k, 300);
         a($$1, awu.l, 300);
         a($$1, dew.aY, 300);
         a($$1, dew.cl, 300);
         a($$1, dew.cm, 300);
         a($$1, dew.oa, 300);
         a($$1, dew.dT, 300);
         a($$1, dew.cv, 300);
         a($$1, dew.gV, 300);
         a($$1, dew.cA, 300);
         a($$1, dew.gZ, 300);
         a($$1, awu.E, 300);
         a($$1, cun.ou, 300);
         a($$1, cun.qV, 300);
         a($$1, dew.cO, 300);
         a($$1, awu.aQ, 200);
         a($$1, awu.be, 800);
         a($$1, cun.oM, 200);
         a($$1, cun.oL, 200);
         a($$1, cun.oP, 200);
         a($$1, cun.oO, 200);
         a($$1, cun.oN, 200);
         a($$1, awu.h, 200);
         a($$1, awu.aN, 1200);
         a($$1, awu.a, 100);
         a($$1, awu.d, 100);
         a($$1, cun.pp, 100);
         a($$1, awu.p, 100);
         a($$1, cun.pq, 100);
         a($$1, awu.g, 67);
         a($$1, dew.me, 4001);
         a($$1, cun.vT, 300);
         a($$1, dew.mZ, 50);
         a($$1, dew.bv, 100);
         a($$1, dew.nS, 50);
         a($$1, dew.nT, 300);
         a($$1, dew.nU, 300);
         a($$1, dew.nX, 300);
         a($$1, dew.nY, 300);
         a($$1, dew.ob, 300);
         a($$1, dew.pc, 300);
         a($$1, dew.sy, 100);
         a($$1, dew.sz, 100);
         a($$1, dew.ac, 300);
         x = $$1;
         return $$1;
      }
   }

   private static boolean b(cuf $$0) {
      return $$0.o().a(awu.aH);
   }

   private static void a(Map<cuf, Integer> $$0, axb<cuf> $$1, int $$2) {
      for (ji<cuf> $$3 : lp.h.c($$1)) {
         if (!b($$3.a())) {
            $$0.put($$3.a(), $$2);
         }
      }
   }

   private static void a(Map<cuf, Integer> $$0, dbs $$1, int $$2) {
      cuf $$3 = $$1.r();
      if (b($$3)) {
         if (aa.aX) {
            throw (IllegalStateException)ac.b(
               new IllegalStateException(
                  "A developer tried to explicitly make fire resistant item " + $$3.o(null).getString() + " a furnace fuel. That will not work!"
               )
            );
         }
      } else {
         $$0.put($$3, $$2);
      }
   }

   private boolean l() {
      return this.t > 0;
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.l = jr.a(this.b(), cuk.l);
      bqj.b($$0, this.l, $$1);
      this.t = $$0.g("BurnTime");
      this.v = $$0.g("CookTime");
      this.w = $$0.g("CookTimeTotal");
      this.u = this.b(this.l.get(1));
      ur $$2 = $$0.p("RecipesUsed");

      for (String $$3 : $$2.e()) {
         this.y.put(new alb($$3), $$2.h($$3));
      }
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
      super.b($$0, $$1);
      $$0.a("BurnTime", (short)this.t);
      $$0.a("CookTime", (short)this.v);
      $$0.a("CookTimeTotal", (short)this.w);
      bqj.a($$0, this.l, $$1);
      ur $$2 = new ur();
      this.y.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), $$2x));
      $$0.a("RecipesUsed", $$2);
   }

   public static void a(dbt $$0, iz $$1, drx $$2, doq $$3) {
      boolean $$4 = $$3.l();
      boolean $$5 = false;
      if ($$3.l()) {
         $$3.t--;
      }

      cuk $$6 = $$3.l.get(1);
      boolean $$7 = !$$3.l.get(0).e();
      boolean $$8 = !$$6.e();
      if ($$3.l() || $$8 && $$7) {
         cys<?> $$9;
         if ($$7) {
            $$9 = $$3.z.a($$3, $$0).orElse(null);
         } else {
            $$9 = null;
         }

         int $$11 = $$3.ai_();
         if (!$$3.l() && a($$0.H_(), $$9, $$3.l, $$11)) {
            $$3.t = $$3.b($$6);
            $$3.u = $$3.t;
            if ($$3.l()) {
               $$5 = true;
               if ($$8) {
                  cuf $$12 = $$6.g();
                  $$6.h(1);
                  if ($$6.e()) {
                     cuf $$13 = $$12.u();
                     $$3.l.set(1, $$13 == null ? cuk.l : new cuk($$13));
                  }
               }
            }
         }

         if ($$3.l() && a($$0.H_(), $$9, $$3.l, $$11)) {
            $$3.v++;
            if ($$3.v == $$3.w) {
               $$3.v = 0;
               $$3.w = a($$0, $$3);
               if (b($$0.H_(), $$9, $$3.l, $$11)) {
                  $$3.a($$9);
               }

               $$5 = true;
            }
         } else {
            $$3.v = 0;
         }
      } else if (!$$3.l() && $$3.v > 0) {
         $$3.v = ayu.a($$3.v - 2, 0, $$3.w);
      }

      if ($$4 != $$3.l()) {
         $$5 = true;
         $$2 = $$2.a(ddp.b, Boolean.valueOf($$3.l()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(jw $$0, @Nullable cys<?> $$1, jr<cuk> $$2, int $$3) {
      if (!$$2.get(0).e() && $$1 != null) {
         cuk $$4 = $$1.b().a($$0);
         if ($$4.e()) {
            return false;
         } else {
            cuk $$5 = $$2.get(2);
            if ($$5.e()) {
               return true;
            } else if (!cuk.c($$5, $$4)) {
               return false;
            } else {
               return $$5.I() < $$3 && $$5.I() < $$5.j() ? true : $$5.I() < $$4.j();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(jw $$0, @Nullable cys<?> $$1, jr<cuk> $$2, int $$3) {
      if ($$1 != null && a($$0, $$1, $$2, $$3)) {
         cuk $$4 = $$2.get(0);
         cuk $$5 = $$1.b().a($$0);
         cuk $$6 = $$2.get(2);
         if ($$6.e()) {
            $$2.set(2, $$5.s());
         } else if (cuk.c($$6, $$5)) {
            $$6.g(1);
         }

         if ($$4.a(dew.aP.r()) && !$$2.get(1).e() && $$2.get(1).a(cun.qy)) {
            $$2.set(1, new cuk(cun.qz));
         }

         $$4.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int b(cuk $$0) {
      if ($$0.e()) {
         return 0;
      } else {
         cuf $$1 = $$0.g();
         return g().getOrDefault($$1, 0);
      }
   }

   private static int a(dbt $$0, doq $$1) {
      return $$1.z.a($$1, $$0).map($$0x -> ((cxz)$$0x.b()).d()).orElse(200);
   }

   public static boolean c(cuk $$0) {
      return g().containsKey($$0.g());
   }

   @Override
   public int[] a(je $$0) {
      if ($$0 == je.a) {
         return r;
      } else {
         return $$0 == je.b ? q : s;
      }
   }

   @Override
   public boolean a(int $$0, cuk $$1, @Nullable je $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cuk $$1, je $$2) {
      return $$2 == je.a && $$0 == 1 ? $$1.a(cun.qz) || $$1.a(cun.qy) : true;
   }

   @Override
   public int b() {
      return this.l.size();
   }

   @Override
   protected jr<cuk> j() {
      return this.l;
   }

   @Override
   protected void a(jr<cuk> $$0) {
      this.l = $$0;
   }

   @Override
   public void a(int $$0, cuk $$1) {
      cuk $$2 = this.l.get($$0);
      boolean $$3 = !$$1.e() && cuk.c($$2, $$1);
      this.l.set($$0, $$1);
      $$1.f(this.e_($$1));
      if ($$0 == 0 && !$$3) {
         this.w = a(this.n, this);
         this.v = 0;
         this.e();
      }
   }

   @Override
   public boolean b(int $$0, cuk $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         cuk $$2 = this.l.get(1);
         return c($$1) || $$1.a(cun.qy) && !$$2.a(cun.qy);
      }
   }

   @Override
   public void a(@Nullable cys<?> $$0) {
      if ($$0 != null) {
         alb $$1 = $$0.a();
         this.y.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public cys<?> d() {
      return null;
   }

   @Override
   public void a(cms $$0, List<cuk> $$1) {
   }

   public void a(arc $$0) {
      List<cys<?>> $$1 = this.a($$0.z(), $$0.dn());
      $$0.a($$1);

      for (cys<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.l);
         }
      }

      this.y.clear();
   }

   public List<cys<?>> a(arb $$0, evm $$1) {
      List<cys<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.y.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<alb> $$3 = (Entry<alb>)var4.next();
         $$0.r().a((alb)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((cys<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((cxz)$$4.b()).b());
         });
      }

      return $$2;
   }

   private static void a(arb $$0, evm $$1, int $$2, float $$3) {
      int $$4 = ayu.d((float)$$2 * $$3);
      float $$5 = ayu.h((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      bta.a($$0, $$1, $$4);
   }

   @Override
   public void a(cmw $$0) {
      for (cuk $$1 : this.l) {
         $$0.b($$1);
      }
   }
}

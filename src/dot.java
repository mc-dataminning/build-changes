import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class dot extends doz implements bre, crh, crs {
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
   protected jr<cun> l = jr.a(3, cun.l);
   int t;
   int u;
   int v;
   int w;
   @Nullable
   private static volatile Map<cui, Integer> x;
   protected final cqc m = new cqc() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dot.this.t;
            case 1:
               return dot.this.u;
            case 2:
               return dot.this.v;
            case 3:
               return dot.this.w;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dot.this.t = $$1;
               break;
            case 1:
               dot.this.u = $$1;
               break;
            case 2:
               dot.this.v = $$1;
               break;
            case 3:
               dot.this.w = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Object2IntOpenHashMap<ale> y = new Object2IntOpenHashMap();
   private final cyw.a<bql, ? extends cyc> z;

   protected dot(dph<?> $$0, iz $$1, dsa $$2, cyy<? extends cyc> $$3) {
      super($$0, $$1, $$2);
      this.z = cyw.b($$3);
   }

   public static void f() {
      x = null;
   }

   public static Map<cui, Integer> g() {
      Map<cui, Integer> $$0 = x;
      if ($$0 != null) {
         return $$0;
      } else {
         Map<cui, Integer> $$1 = Maps.newLinkedHashMap();
         a($$1, cuq.qA, 20000);
         a($$1, dez.iB, 16000);
         a($$1, cuq.sg, 2400);
         a($$1, cuq.ow, 1600);
         a($$1, cuq.ox, 1600);
         a($$1, awx.r, 300);
         a($$1, awx.C, 300);
         a($$1, awx.b, 300);
         a($$1, dez.w, 300);
         a($$1, awx.i, 300);
         a($$1, dez.hU, 300);
         a($$1, awx.j, 150);
         a($$1, dez.jC, 150);
         a($$1, awx.n, 300);
         a($$1, awx.m, 300);
         a($$1, awx.k, 300);
         a($$1, awx.l, 300);
         a($$1, dez.aY, 300);
         a($$1, dez.cl, 300);
         a($$1, dez.cm, 300);
         a($$1, dez.oa, 300);
         a($$1, dez.dT, 300);
         a($$1, dez.cv, 300);
         a($$1, dez.gV, 300);
         a($$1, dez.cA, 300);
         a($$1, dez.gZ, 300);
         a($$1, awx.E, 300);
         a($$1, cuq.ou, 300);
         a($$1, cuq.qV, 300);
         a($$1, dez.cO, 300);
         a($$1, awx.aQ, 200);
         a($$1, awx.be, 800);
         a($$1, cuq.oM, 200);
         a($$1, cuq.oL, 200);
         a($$1, cuq.oP, 200);
         a($$1, cuq.oO, 200);
         a($$1, cuq.oN, 200);
         a($$1, awx.h, 200);
         a($$1, awx.aN, 1200);
         a($$1, awx.a, 100);
         a($$1, awx.d, 100);
         a($$1, cuq.pp, 100);
         a($$1, awx.p, 100);
         a($$1, cuq.pq, 100);
         a($$1, awx.g, 67);
         a($$1, dez.me, 4001);
         a($$1, cuq.vT, 300);
         a($$1, dez.mZ, 50);
         a($$1, dez.bv, 100);
         a($$1, dez.nS, 50);
         a($$1, dez.nT, 300);
         a($$1, dez.nU, 300);
         a($$1, dez.nX, 300);
         a($$1, dez.nY, 300);
         a($$1, dez.ob, 300);
         a($$1, dez.pc, 300);
         a($$1, dez.sy, 100);
         a($$1, dez.sz, 100);
         a($$1, dez.ac, 300);
         x = $$1;
         return $$1;
      }
   }

   private static boolean b(cui $$0) {
      return $$0.o().a(awx.aH);
   }

   private static void a(Map<cui, Integer> $$0, axe<cui> $$1, int $$2) {
      for (ji<cui> $$3 : lp.h.c($$1)) {
         if (!b($$3.a())) {
            $$0.put($$3.a(), $$2);
         }
      }
   }

   private static void a(Map<cui, Integer> $$0, dbv $$1, int $$2) {
      cui $$3 = $$1.r();
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
      this.l = jr.a(this.b(), cun.l);
      bqm.b($$0, this.l, $$1);
      this.t = $$0.g("BurnTime");
      this.v = $$0.g("CookTime");
      this.w = $$0.g("CookTimeTotal");
      this.u = this.b(this.l.get(1));
      ur $$2 = $$0.p("RecipesUsed");

      for (String $$3 : $$2.e()) {
         this.y.put(new ale($$3), $$2.h($$3));
      }
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
      super.b($$0, $$1);
      $$0.a("BurnTime", (short)this.t);
      $$0.a("CookTime", (short)this.v);
      $$0.a("CookTimeTotal", (short)this.w);
      bqm.a($$0, this.l, $$1);
      ur $$2 = new ur();
      this.y.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), $$2x));
      $$0.a("RecipesUsed", $$2);
   }

   public static void a(dbw $$0, iz $$1, dsa $$2, dot $$3) {
      boolean $$4 = $$3.l();
      boolean $$5 = false;
      if ($$3.l()) {
         $$3.t--;
      }

      cun $$6 = $$3.l.get(1);
      boolean $$7 = !$$3.l.get(0).e();
      boolean $$8 = !$$6.e();
      if ($$3.l() || $$8 && $$7) {
         cyv<?> $$9;
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
                  cui $$12 = $$6.g();
                  $$6.h(1);
                  if ($$6.e()) {
                     cui $$13 = $$12.u();
                     $$3.l.set(1, $$13 == null ? cun.l : new cun($$13));
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
         $$3.v = ayx.a($$3.v - 2, 0, $$3.w);
      }

      if ($$4 != $$3.l()) {
         $$5 = true;
         $$2 = $$2.a(dds.b, Boolean.valueOf($$3.l()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(jw $$0, @Nullable cyv<?> $$1, jr<cun> $$2, int $$3) {
      if (!$$2.get(0).e() && $$1 != null) {
         cun $$4 = $$1.b().a($$0);
         if ($$4.e()) {
            return false;
         } else {
            cun $$5 = $$2.get(2);
            if ($$5.e()) {
               return true;
            } else if (!cun.c($$5, $$4)) {
               return false;
            } else {
               return $$5.I() < $$3 && $$5.I() < $$5.j() ? true : $$5.I() < $$4.j();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(jw $$0, @Nullable cyv<?> $$1, jr<cun> $$2, int $$3) {
      if ($$1 != null && a($$0, $$1, $$2, $$3)) {
         cun $$4 = $$2.get(0);
         cun $$5 = $$1.b().a($$0);
         cun $$6 = $$2.get(2);
         if ($$6.e()) {
            $$2.set(2, $$5.s());
         } else if (cun.c($$6, $$5)) {
            $$6.g(1);
         }

         if ($$4.a(dez.aP.r()) && !$$2.get(1).e() && $$2.get(1).a(cuq.qy)) {
            $$2.set(1, new cun(cuq.qz));
         }

         $$4.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int b(cun $$0) {
      if ($$0.e()) {
         return 0;
      } else {
         cui $$1 = $$0.g();
         return g().getOrDefault($$1, 0);
      }
   }

   private static int a(dbw $$0, dot $$1) {
      return $$1.z.a($$1, $$0).map($$0x -> ((cyc)$$0x.b()).d()).orElse(200);
   }

   public static boolean c(cun $$0) {
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
   public boolean a(int $$0, cun $$1, @Nullable je $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cun $$1, je $$2) {
      return $$2 == je.a && $$0 == 1 ? $$1.a(cuq.qz) || $$1.a(cuq.qy) : true;
   }

   @Override
   public int b() {
      return this.l.size();
   }

   @Override
   protected jr<cun> j() {
      return this.l;
   }

   @Override
   protected void a(jr<cun> $$0) {
      this.l = $$0;
   }

   @Override
   public void a(int $$0, cun $$1) {
      cun $$2 = this.l.get($$0);
      boolean $$3 = !$$1.e() && cun.c($$2, $$1);
      this.l.set($$0, $$1);
      $$1.f(this.e_($$1));
      if ($$0 == 0 && !$$3) {
         this.w = a(this.n, this);
         this.v = 0;
         this.e();
      }
   }

   @Override
   public boolean b(int $$0, cun $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         cun $$2 = this.l.get(1);
         return c($$1) || $$1.a(cuq.qy) && !$$2.a(cuq.qy);
      }
   }

   @Override
   public void a(@Nullable cyv<?> $$0) {
      if ($$0 != null) {
         ale $$1 = $$0.a();
         this.y.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public cyv<?> d() {
      return null;
   }

   @Override
   public void a(cmv $$0, List<cun> $$1) {
   }

   public void a(arf $$0) {
      List<cyv<?>> $$1 = this.a($$0.z(), $$0.dn());
      $$0.a($$1);

      for (cyv<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.l);
         }
      }

      this.y.clear();
   }

   public List<cyv<?>> a(are $$0, evp $$1) {
      List<cyv<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.y.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<ale> $$3 = (Entry<ale>)var4.next();
         $$0.r().a((ale)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((cyv<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((cyc)$$4.b()).b());
         });
      }

      return $$2;
   }

   private static void a(are $$0, evp $$1, int $$2, float $$3) {
      int $$4 = ayx.d((float)$$2 * $$3);
      float $$5 = ayx.h((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      btd.a($$0, $$1, $$4);
   }

   @Override
   public void a(cmz $$0) {
      for (cun $$1 : this.l) {
         $$0.b($$1);
      }
   }
}

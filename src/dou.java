import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class dou extends dpa implements brf, cri, crt {
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
   protected jr<cuo> l = jr.a(3, cuo.l);
   int t;
   int u;
   int v;
   int w;
   @Nullable
   private static volatile Map<cuj, Integer> x;
   protected final cqd m = new cqd() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dou.this.t;
            case 1:
               return dou.this.u;
            case 2:
               return dou.this.v;
            case 3:
               return dou.this.w;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dou.this.t = $$1;
               break;
            case 1:
               dou.this.u = $$1;
               break;
            case 2:
               dou.this.v = $$1;
               break;
            case 3:
               dou.this.w = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Object2IntOpenHashMap<ale> y = new Object2IntOpenHashMap();
   private final cyx.a<bqm, ? extends cyd> z;

   protected dou(dpi<?> $$0, iz $$1, dsb $$2, cyz<? extends cyd> $$3) {
      super($$0, $$1, $$2);
      this.z = cyx.b($$3);
   }

   public static void f() {
      x = null;
   }

   public static Map<cuj, Integer> g() {
      Map<cuj, Integer> $$0 = x;
      if ($$0 != null) {
         return $$0;
      } else {
         Map<cuj, Integer> $$1 = Maps.newLinkedHashMap();
         a($$1, cur.qA, 20000);
         a($$1, dfa.iB, 16000);
         a($$1, cur.sg, 2400);
         a($$1, cur.ow, 1600);
         a($$1, cur.ox, 1600);
         a($$1, awx.r, 300);
         a($$1, awx.C, 300);
         a($$1, awx.b, 300);
         a($$1, dfa.w, 300);
         a($$1, awx.i, 300);
         a($$1, dfa.hU, 300);
         a($$1, awx.j, 150);
         a($$1, dfa.jC, 150);
         a($$1, awx.n, 300);
         a($$1, awx.m, 300);
         a($$1, awx.k, 300);
         a($$1, awx.l, 300);
         a($$1, dfa.aY, 300);
         a($$1, dfa.cl, 300);
         a($$1, dfa.cm, 300);
         a($$1, dfa.oa, 300);
         a($$1, dfa.dT, 300);
         a($$1, dfa.cv, 300);
         a($$1, dfa.gV, 300);
         a($$1, dfa.cA, 300);
         a($$1, dfa.gZ, 300);
         a($$1, awx.E, 300);
         a($$1, cur.ou, 300);
         a($$1, cur.qV, 300);
         a($$1, dfa.cO, 300);
         a($$1, awx.aQ, 200);
         a($$1, awx.be, 800);
         a($$1, cur.oM, 200);
         a($$1, cur.oL, 200);
         a($$1, cur.oP, 200);
         a($$1, cur.oO, 200);
         a($$1, cur.oN, 200);
         a($$1, awx.h, 200);
         a($$1, awx.aN, 1200);
         a($$1, awx.a, 100);
         a($$1, awx.d, 100);
         a($$1, cur.pp, 100);
         a($$1, awx.p, 100);
         a($$1, cur.pq, 100);
         a($$1, awx.g, 67);
         a($$1, dfa.me, 4001);
         a($$1, cur.vT, 300);
         a($$1, dfa.mZ, 50);
         a($$1, dfa.bv, 100);
         a($$1, dfa.nS, 50);
         a($$1, dfa.nT, 300);
         a($$1, dfa.nU, 300);
         a($$1, dfa.nX, 300);
         a($$1, dfa.nY, 300);
         a($$1, dfa.ob, 300);
         a($$1, dfa.pc, 300);
         a($$1, dfa.sy, 100);
         a($$1, dfa.sz, 100);
         a($$1, dfa.ac, 300);
         x = $$1;
         return $$1;
      }
   }

   private static boolean b(cuj $$0) {
      return $$0.o().a(awx.aH);
   }

   private static void a(Map<cuj, Integer> $$0, axe<cuj> $$1, int $$2) {
      for (ji<cuj> $$3 : lp.h.c($$1)) {
         if (!b($$3.a())) {
            $$0.put($$3.a(), $$2);
         }
      }
   }

   private static void a(Map<cuj, Integer> $$0, dbw $$1, int $$2) {
      cuj $$3 = $$1.r();
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
      this.l = jr.a(this.b(), cuo.l);
      bqn.b($$0, this.l, $$1);
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
      bqn.a($$0, this.l, $$1);
      ur $$2 = new ur();
      this.y.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), $$2x));
      $$0.a("RecipesUsed", $$2);
   }

   public static void a(dbx $$0, iz $$1, dsb $$2, dou $$3) {
      boolean $$4 = $$3.l();
      boolean $$5 = false;
      if ($$3.l()) {
         $$3.t--;
      }

      cuo $$6 = $$3.l.get(1);
      boolean $$7 = !$$3.l.get(0).e();
      boolean $$8 = !$$6.e();
      if ($$3.l() || $$8 && $$7) {
         cyw<?> $$9;
         if ($$7) {
            $$9 = $$3.z.a($$3, $$0).orElse(null);
         } else {
            $$9 = null;
         }

         int $$11 = $$3.ah_();
         if (!$$3.l() && a($$0.H_(), $$9, $$3.l, $$11)) {
            $$3.t = $$3.b($$6);
            $$3.u = $$3.t;
            if ($$3.l()) {
               $$5 = true;
               if ($$8) {
                  cuj $$12 = $$6.g();
                  $$6.h(1);
                  if ($$6.e()) {
                     cuj $$13 = $$12.u();
                     $$3.l.set(1, $$13 == null ? cuo.l : new cuo($$13));
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
         $$3.v = ayy.a($$3.v - 2, 0, $$3.w);
      }

      if ($$4 != $$3.l()) {
         $$5 = true;
         $$2 = $$2.a(ddt.b, Boolean.valueOf($$3.l()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(jw $$0, @Nullable cyw<?> $$1, jr<cuo> $$2, int $$3) {
      if (!$$2.get(0).e() && $$1 != null) {
         cuo $$4 = $$1.b().a($$0);
         if ($$4.e()) {
            return false;
         } else {
            cuo $$5 = $$2.get(2);
            if ($$5.e()) {
               return true;
            } else if (!cuo.c($$5, $$4)) {
               return false;
            } else {
               return $$5.I() < $$3 && $$5.I() < $$5.j() ? true : $$5.I() < $$4.j();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(jw $$0, @Nullable cyw<?> $$1, jr<cuo> $$2, int $$3) {
      if ($$1 != null && a($$0, $$1, $$2, $$3)) {
         cuo $$4 = $$2.get(0);
         cuo $$5 = $$1.b().a($$0);
         cuo $$6 = $$2.get(2);
         if ($$6.e()) {
            $$2.set(2, $$5.s());
         } else if (cuo.c($$6, $$5)) {
            $$6.g(1);
         }

         if ($$4.a(dfa.aP.r()) && !$$2.get(1).e() && $$2.get(1).a(cur.qy)) {
            $$2.set(1, new cuo(cur.qz));
         }

         $$4.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int b(cuo $$0) {
      if ($$0.e()) {
         return 0;
      } else {
         cuj $$1 = $$0.g();
         return g().getOrDefault($$1, 0);
      }
   }

   private static int a(dbx $$0, dou $$1) {
      return $$1.z.a($$1, $$0).map($$0x -> ((cyd)$$0x.b()).d()).orElse(200);
   }

   public static boolean c(cuo $$0) {
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
   public boolean a(int $$0, cuo $$1, @Nullable je $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cuo $$1, je $$2) {
      return $$2 == je.a && $$0 == 1 ? $$1.a(cur.qz) || $$1.a(cur.qy) : true;
   }

   @Override
   public int b() {
      return this.l.size();
   }

   @Override
   protected jr<cuo> j() {
      return this.l;
   }

   @Override
   protected void a(jr<cuo> $$0) {
      this.l = $$0;
   }

   @Override
   public void a(int $$0, cuo $$1) {
      cuo $$2 = this.l.get($$0);
      boolean $$3 = !$$1.e() && cuo.c($$2, $$1);
      this.l.set($$0, $$1);
      $$1.f(this.e_($$1));
      if ($$0 == 0 && !$$3) {
         this.w = a(this.n, this);
         this.v = 0;
         this.e();
      }
   }

   @Override
   public boolean b(int $$0, cuo $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         cuo $$2 = this.l.get(1);
         return c($$1) || $$1.a(cur.qy) && !$$2.a(cur.qy);
      }
   }

   @Override
   public void a(@Nullable cyw<?> $$0) {
      if ($$0 != null) {
         ale $$1 = $$0.a();
         this.y.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public cyw<?> d() {
      return null;
   }

   @Override
   public void a(cmw $$0, List<cuo> $$1) {
   }

   public void a(arf $$0) {
      List<cyw<?>> $$1 = this.a($$0.z(), $$0.dn());
      $$0.a($$1);

      for (cyw<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.l);
         }
      }

      this.y.clear();
   }

   public List<cyw<?>> a(are $$0, evq $$1) {
      List<cyw<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.y.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<ale> $$3 = (Entry<ale>)var4.next();
         $$0.r().a((ale)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((cyw<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((cyd)$$4.b()).b());
         });
      }

      return $$2;
   }

   private static void a(are $$0, evq $$1, int $$2, float $$3) {
      int $$4 = ayy.d((float)$$2 * $$3);
      float $$5 = ayy.h((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      bte.a($$0, $$1, $$4);
   }

   @Override
   public void a(cna $$0) {
      for (cuo $$1 : this.l) {
         $$0.b($$1);
      }
   }
}

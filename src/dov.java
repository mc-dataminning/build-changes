import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class dov extends dpb implements brg, crj, cru {
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
   protected jr<cup> l = jr.a(3, cup.l);
   int t;
   int u;
   int v;
   int w;
   @Nullable
   private static volatile Map<cuk, Integer> x;
   protected final cqe m = new cqe() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dov.this.t;
            case 1:
               return dov.this.u;
            case 2:
               return dov.this.v;
            case 3:
               return dov.this.w;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dov.this.t = $$1;
               break;
            case 1:
               dov.this.u = $$1;
               break;
            case 2:
               dov.this.v = $$1;
               break;
            case 3:
               dov.this.w = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Object2IntOpenHashMap<alf> y = new Object2IntOpenHashMap();
   private final cyy.a<bqn, ? extends cye> z;

   protected dov(dpj<?> $$0, iz $$1, dsc $$2, cza<? extends cye> $$3) {
      super($$0, $$1, $$2);
      this.z = cyy.b($$3);
   }

   public static void f() {
      x = null;
   }

   public static Map<cuk, Integer> g() {
      Map<cuk, Integer> $$0 = x;
      if ($$0 != null) {
         return $$0;
      } else {
         Map<cuk, Integer> $$1 = Maps.newLinkedHashMap();
         a($$1, cus.qA, 20000);
         a($$1, dfb.iB, 16000);
         a($$1, cus.sg, 2400);
         a($$1, cus.ow, 1600);
         a($$1, cus.ox, 1600);
         a($$1, awy.r, 300);
         a($$1, awy.C, 300);
         a($$1, awy.b, 300);
         a($$1, dfb.w, 300);
         a($$1, awy.i, 300);
         a($$1, dfb.hU, 300);
         a($$1, awy.j, 150);
         a($$1, dfb.jC, 150);
         a($$1, awy.n, 300);
         a($$1, awy.m, 300);
         a($$1, awy.k, 300);
         a($$1, awy.l, 300);
         a($$1, dfb.aY, 300);
         a($$1, dfb.cl, 300);
         a($$1, dfb.cm, 300);
         a($$1, dfb.oa, 300);
         a($$1, dfb.dT, 300);
         a($$1, dfb.cv, 300);
         a($$1, dfb.gV, 300);
         a($$1, dfb.cA, 300);
         a($$1, dfb.gZ, 300);
         a($$1, awy.E, 300);
         a($$1, cus.ou, 300);
         a($$1, cus.qV, 300);
         a($$1, dfb.cO, 300);
         a($$1, awy.aQ, 200);
         a($$1, awy.be, 800);
         a($$1, cus.oM, 200);
         a($$1, cus.oL, 200);
         a($$1, cus.oP, 200);
         a($$1, cus.oO, 200);
         a($$1, cus.oN, 200);
         a($$1, awy.h, 200);
         a($$1, awy.aN, 1200);
         a($$1, awy.a, 100);
         a($$1, awy.d, 100);
         a($$1, cus.pp, 100);
         a($$1, awy.p, 100);
         a($$1, cus.pq, 100);
         a($$1, awy.g, 67);
         a($$1, dfb.me, 4001);
         a($$1, cus.vT, 300);
         a($$1, dfb.mZ, 50);
         a($$1, dfb.bv, 100);
         a($$1, dfb.nS, 50);
         a($$1, dfb.nT, 300);
         a($$1, dfb.nU, 300);
         a($$1, dfb.nX, 300);
         a($$1, dfb.nY, 300);
         a($$1, dfb.ob, 300);
         a($$1, dfb.pc, 300);
         a($$1, dfb.sy, 100);
         a($$1, dfb.sz, 100);
         a($$1, dfb.ac, 300);
         x = $$1;
         return $$1;
      }
   }

   private static boolean b(cuk $$0) {
      return $$0.o().a(awy.aH);
   }

   private static void a(Map<cuk, Integer> $$0, axf<cuk> $$1, int $$2) {
      for (ji<cuk> $$3 : lp.h.c($$1)) {
         if (!b($$3.a())) {
            $$0.put($$3.a(), $$2);
         }
      }
   }

   private static void a(Map<cuk, Integer> $$0, dbx $$1, int $$2) {
      cuk $$3 = $$1.r();
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
   protected void a(us $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.l = jr.a(this.b(), cup.l);
      bqo.b($$0, this.l, $$1);
      this.t = $$0.g("BurnTime");
      this.v = $$0.g("CookTime");
      this.w = $$0.g("CookTimeTotal");
      this.u = this.b(this.l.get(1));
      us $$2 = $$0.p("RecipesUsed");

      for (String $$3 : $$2.e()) {
         this.y.put(new alf($$3), $$2.h($$3));
      }
   }

   @Override
   protected void b(us $$0, jk.a $$1) {
      super.b($$0, $$1);
      $$0.a("BurnTime", (short)this.t);
      $$0.a("CookTime", (short)this.v);
      $$0.a("CookTimeTotal", (short)this.w);
      bqo.a($$0, this.l, $$1);
      us $$2 = new us();
      this.y.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), $$2x));
      $$0.a("RecipesUsed", $$2);
   }

   public static void a(dby $$0, iz $$1, dsc $$2, dov $$3) {
      boolean $$4 = $$3.l();
      boolean $$5 = false;
      if ($$3.l()) {
         $$3.t--;
      }

      cup $$6 = $$3.l.get(1);
      boolean $$7 = !$$3.l.get(0).e();
      boolean $$8 = !$$6.e();
      if ($$3.l() || $$8 && $$7) {
         cyx<?> $$9;
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
                  cuk $$12 = $$6.g();
                  $$6.h(1);
                  if ($$6.e()) {
                     cuk $$13 = $$12.u();
                     $$3.l.set(1, $$13 == null ? cup.l : new cup($$13));
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
         $$3.v = ayz.a($$3.v - 2, 0, $$3.w);
      }

      if ($$4 != $$3.l()) {
         $$5 = true;
         $$2 = $$2.a(ddu.b, Boolean.valueOf($$3.l()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(jw $$0, @Nullable cyx<?> $$1, jr<cup> $$2, int $$3) {
      if (!$$2.get(0).e() && $$1 != null) {
         cup $$4 = $$1.b().a($$0);
         if ($$4.e()) {
            return false;
         } else {
            cup $$5 = $$2.get(2);
            if ($$5.e()) {
               return true;
            } else if (!cup.c($$5, $$4)) {
               return false;
            } else {
               return $$5.I() < $$3 && $$5.I() < $$5.j() ? true : $$5.I() < $$4.j();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(jw $$0, @Nullable cyx<?> $$1, jr<cup> $$2, int $$3) {
      if ($$1 != null && a($$0, $$1, $$2, $$3)) {
         cup $$4 = $$2.get(0);
         cup $$5 = $$1.b().a($$0);
         cup $$6 = $$2.get(2);
         if ($$6.e()) {
            $$2.set(2, $$5.s());
         } else if (cup.c($$6, $$5)) {
            $$6.g(1);
         }

         if ($$4.a(dfb.aP.r()) && !$$2.get(1).e() && $$2.get(1).a(cus.qy)) {
            $$2.set(1, new cup(cus.qz));
         }

         $$4.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int b(cup $$0) {
      if ($$0.e()) {
         return 0;
      } else {
         cuk $$1 = $$0.g();
         return g().getOrDefault($$1, 0);
      }
   }

   private static int a(dby $$0, dov $$1) {
      return $$1.z.a($$1, $$0).map($$0x -> ((cye)$$0x.b()).d()).orElse(200);
   }

   public static boolean c(cup $$0) {
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
   public boolean a(int $$0, cup $$1, @Nullable je $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cup $$1, je $$2) {
      return $$2 == je.a && $$0 == 1 ? $$1.a(cus.qz) || $$1.a(cus.qy) : true;
   }

   @Override
   public int b() {
      return this.l.size();
   }

   @Override
   protected jr<cup> j() {
      return this.l;
   }

   @Override
   protected void a(jr<cup> $$0) {
      this.l = $$0;
   }

   @Override
   public void a(int $$0, cup $$1) {
      cup $$2 = this.l.get($$0);
      boolean $$3 = !$$1.e() && cup.c($$2, $$1);
      this.l.set($$0, $$1);
      $$1.f(this.e_($$1));
      if ($$0 == 0 && !$$3) {
         this.w = a(this.n, this);
         this.v = 0;
         this.e();
      }
   }

   @Override
   public boolean b(int $$0, cup $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         cup $$2 = this.l.get(1);
         return c($$1) || $$1.a(cus.qy) && !$$2.a(cus.qy);
      }
   }

   @Override
   public void a(@Nullable cyx<?> $$0) {
      if ($$0 != null) {
         alf $$1 = $$0.a();
         this.y.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public cyx<?> d() {
      return null;
   }

   @Override
   public void a(cmx $$0, List<cup> $$1) {
   }

   public void a(arg $$0) {
      List<cyx<?>> $$1 = this.a($$0.z(), $$0.dn());
      $$0.a($$1);

      for (cyx<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.l);
         }
      }

      this.y.clear();
   }

   public List<cyx<?>> a(arf $$0, evr $$1) {
      List<cyx<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.y.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<alf> $$3 = (Entry<alf>)var4.next();
         $$0.r().a((alf)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((cyx<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((cye)$$4.b()).b());
         });
      }

      return $$2;
   }

   private static void a(arf $$0, evr $$1, int $$2, float $$3) {
      int $$4 = ayz.d((float)$$2 * $$3);
      float $$5 = ayz.h((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      btf.a($$0, $$1, $$4);
   }

   @Override
   public void a(cnb $$0) {
      for (cup $$1 : this.l) {
         $$0.b($$1);
      }
   }
}

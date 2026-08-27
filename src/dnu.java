import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class dnu extends doa implements bqg, cqi, cqt {
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
   protected jg<cto> l = jg.a(3, cto.i);
   int t;
   int u;
   int v;
   int w;
   @Nullable
   private static volatile Map<ctj, Integer> x;
   protected final cpd m = new cpd() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dnu.this.t;
            case 1:
               return dnu.this.u;
            case 2:
               return dnu.this.v;
            case 3:
               return dnu.this.w;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dnu.this.t = $$1;
               break;
            case 1:
               dnu.this.u = $$1;
               break;
            case 2:
               dnu.this.v = $$1;
               break;
            case 3:
               dnu.this.w = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Object2IntOpenHashMap<akm> y = new Object2IntOpenHashMap();
   private final cxx.a<bpn, ? extends cxd> z;

   protected dnu(doi<?> $$0, io $$1, drb $$2, cxz<? extends cxd> $$3) {
      super($$0, $$1, $$2);
      this.z = cxx.b($$3);
   }

   public static void f() {
      x = null;
   }

   public static Map<ctj, Integer> g() {
      Map<ctj, Integer> $$0 = x;
      if ($$0 != null) {
         return $$0;
      } else {
         Map<ctj, Integer> $$1 = Maps.newLinkedHashMap();
         a($$1, ctr.qA, 20000);
         a($$1, dea.iB, 16000);
         a($$1, ctr.sg, 2400);
         a($$1, ctr.ow, 1600);
         a($$1, ctr.ox, 1600);
         a($$1, awe.r, 300);
         a($$1, awe.C, 300);
         a($$1, awe.b, 300);
         a($$1, dea.w, 300);
         a($$1, awe.i, 300);
         a($$1, dea.hU, 300);
         a($$1, awe.j, 150);
         a($$1, dea.jC, 150);
         a($$1, awe.n, 300);
         a($$1, awe.m, 300);
         a($$1, awe.k, 300);
         a($$1, awe.l, 300);
         a($$1, dea.aY, 300);
         a($$1, dea.cl, 300);
         a($$1, dea.cm, 300);
         a($$1, dea.oa, 300);
         a($$1, dea.dT, 300);
         a($$1, dea.cv, 300);
         a($$1, dea.gV, 300);
         a($$1, dea.cA, 300);
         a($$1, dea.gZ, 300);
         a($$1, awe.E, 300);
         a($$1, ctr.ou, 300);
         a($$1, ctr.qV, 300);
         a($$1, dea.cO, 300);
         a($$1, awe.aQ, 200);
         a($$1, awe.be, 800);
         a($$1, ctr.oM, 200);
         a($$1, ctr.oL, 200);
         a($$1, ctr.oP, 200);
         a($$1, ctr.oO, 200);
         a($$1, ctr.oN, 200);
         a($$1, awe.h, 200);
         a($$1, awe.aN, 1200);
         a($$1, awe.a, 100);
         a($$1, awe.d, 100);
         a($$1, ctr.pp, 100);
         a($$1, awe.p, 100);
         a($$1, ctr.pq, 100);
         a($$1, awe.g, 67);
         a($$1, dea.me, 4001);
         a($$1, ctr.vT, 300);
         a($$1, dea.mZ, 50);
         a($$1, dea.bv, 100);
         a($$1, dea.nS, 50);
         a($$1, dea.nT, 300);
         a($$1, dea.nU, 300);
         a($$1, dea.nX, 300);
         a($$1, dea.nY, 300);
         a($$1, dea.ob, 300);
         a($$1, dea.pc, 300);
         a($$1, dea.sy, 100);
         a($$1, dea.sz, 100);
         a($$1, dea.ac, 300);
         x = $$1;
         return $$1;
      }
   }

   private static boolean b(ctj $$0) {
      return $$0.n().a(awe.aH);
   }

   private static void a(Map<ctj, Integer> $$0, awl<ctj> $$1, int $$2) {
      for (ix<ctj> $$3 : le.h.c($$1)) {
         if (!b($$3.a())) {
            $$0.put($$3.a(), $$2);
         }
      }
   }

   private static void a(Map<ctj, Integer> $$0, daw $$1, int $$2) {
      ctj $$3 = $$1.q();
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
   protected void a(ud $$0, iz.a $$1) {
      super.a($$0, $$1);
      this.l = jg.a(this.b(), cto.i);
      bpo.b($$0, this.l, $$1);
      this.t = $$0.g("BurnTime");
      this.v = $$0.g("CookTime");
      this.w = $$0.g("CookTimeTotal");
      this.u = this.b(this.l.get(1));
      ud $$2 = $$0.p("RecipesUsed");

      for (String $$3 : $$2.e()) {
         this.y.put(new akm($$3), $$2.h($$3));
      }
   }

   @Override
   protected void b(ud $$0, iz.a $$1) {
      super.b($$0, $$1);
      $$0.a("BurnTime", (short)this.t);
      $$0.a("CookTime", (short)this.v);
      $$0.a("CookTimeTotal", (short)this.w);
      bpo.a($$0, this.l, $$1);
      ud $$2 = new ud();
      this.y.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), $$2x));
      $$0.a("RecipesUsed", $$2);
   }

   public static void a(dax $$0, io $$1, drb $$2, dnu $$3) {
      boolean $$4 = $$3.l();
      boolean $$5 = false;
      if ($$3.l()) {
         $$3.t--;
      }

      cto $$6 = $$3.l.get(1);
      boolean $$7 = !$$3.l.get(0).e();
      boolean $$8 = !$$6.e();
      if ($$3.l() || $$8 && $$7) {
         cxw<?> $$9;
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
                  ctj $$12 = $$6.g();
                  $$6.h(1);
                  if ($$6.e()) {
                     ctj $$13 = $$12.t();
                     $$3.l.set(1, $$13 == null ? cto.i : new cto($$13));
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
         $$3.v = ayd.a($$3.v - 2, 0, $$3.w);
      }

      if ($$4 != $$3.l()) {
         $$5 = true;
         $$2 = $$2.a(dct.b, Boolean.valueOf($$3.l()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(jl $$0, @Nullable cxw<?> $$1, jg<cto> $$2, int $$3) {
      if (!$$2.get(0).e() && $$1 != null) {
         cto $$4 = $$1.b().a($$0);
         if ($$4.e()) {
            return false;
         } else {
            cto $$5 = $$2.get(2);
            if ($$5.e()) {
               return true;
            } else if (!cto.c($$5, $$4)) {
               return false;
            } else {
               return $$5.I() < $$3 && $$5.I() < $$5.j() ? true : $$5.I() < $$4.j();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(jl $$0, @Nullable cxw<?> $$1, jg<cto> $$2, int $$3) {
      if ($$1 != null && a($$0, $$1, $$2, $$3)) {
         cto $$4 = $$2.get(0);
         cto $$5 = $$1.b().a($$0);
         cto $$6 = $$2.get(2);
         if ($$6.e()) {
            $$2.set(2, $$5.s());
         } else if (cto.c($$6, $$5)) {
            $$6.g(1);
         }

         if ($$4.a(dea.aP.q()) && !$$2.get(1).e() && $$2.get(1).a(ctr.qy)) {
            $$2.set(1, new cto(ctr.qz));
         }

         $$4.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int b(cto $$0) {
      if ($$0.e()) {
         return 0;
      } else {
         ctj $$1 = $$0.g();
         return g().getOrDefault($$1, 0);
      }
   }

   private static int a(dax $$0, dnu $$1) {
      return $$1.z.a($$1, $$0).map($$0x -> ((cxd)$$0x.b()).d()).orElse(200);
   }

   public static boolean c(cto $$0) {
      return g().containsKey($$0.g());
   }

   @Override
   public int[] a(it $$0) {
      if ($$0 == it.a) {
         return r;
      } else {
         return $$0 == it.b ? q : s;
      }
   }

   @Override
   public boolean a(int $$0, cto $$1, @Nullable it $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cto $$1, it $$2) {
      return $$2 == it.a && $$0 == 1 ? $$1.a(ctr.qz) || $$1.a(ctr.qy) : true;
   }

   @Override
   public int b() {
      return this.l.size();
   }

   @Override
   protected jg<cto> j() {
      return this.l;
   }

   @Override
   protected void a(jg<cto> $$0) {
      this.l = $$0;
   }

   @Override
   public void a(int $$0, cto $$1) {
      cto $$2 = this.l.get($$0);
      boolean $$3 = !$$1.e() && cto.c($$2, $$1);
      this.l.set($$0, $$1);
      $$1.f(this.e_($$1));
      if ($$0 == 0 && !$$3) {
         this.w = a(this.n, this);
         this.v = 0;
         this.e();
      }
   }

   @Override
   public boolean b(int $$0, cto $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         cto $$2 = this.l.get(1);
         return c($$1) || $$1.a(ctr.qy) && !$$2.a(ctr.qy);
      }
   }

   @Override
   public void a(@Nullable cxw<?> $$0) {
      if ($$0 != null) {
         akm $$1 = $$0.a();
         this.y.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public cxw<?> d() {
      return null;
   }

   @Override
   public void a(clw $$0, List<cto> $$1) {
   }

   public void a(aqn $$0) {
      List<cxw<?>> $$1 = this.a($$0.z(), $$0.dn());
      $$0.a($$1);

      for (cxw<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.l);
         }
      }

      this.y.clear();
   }

   public List<cxw<?>> a(aqm $$0, euk $$1) {
      List<cxw<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.y.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<akm> $$3 = (Entry<akm>)var4.next();
         $$0.r().a((akm)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((cxw<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((cxd)$$4.b()).b());
         });
      }

      return $$2;
   }

   private static void a(aqm $$0, euk $$1, int $$2, float $$3) {
      int $$4 = ayd.d((float)$$2 * $$3);
      float $$5 = ayd.h((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      bse.a($$0, $$1, $$4);
   }

   @Override
   public void a(cma $$0) {
      for (cto $$1 : this.l) {
         $$0.b($$1);
      }
   }
}

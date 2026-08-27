import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class dpp extends dpv implements bqm, cqy, crj {
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
   protected jj<cuh> l = jj.a(3, cuh.i);
   int t;
   int u;
   int v;
   int w;
   @Nullable
   private static volatile Map<cuc, Integer> x;
   protected final cpq m = new cpq() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dpp.this.t;
            case 1:
               return dpp.this.u;
            case 2:
               return dpp.this.v;
            case 3:
               return dpp.this.w;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dpp.this.t = $$1;
               break;
            case 1:
               dpp.this.u = $$1;
               break;
            case 2:
               dpp.this.v = $$1;
               break;
            case 3:
               dpp.this.w = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Object2IntOpenHashMap<akt> y = new Object2IntOpenHashMap();
   private final czd.a<bpt, ? extends cyh> z;

   protected dpp(dqe<?> $$0, ir $$1, dtc $$2, czf<? extends cyh> $$3) {
      super($$0, $$1, $$2);
      this.z = czd.b($$3);
   }

   public static void f() {
      x = null;
   }

   public static Map<cuc, Integer> g() {
      Map<cuc, Integer> $$0 = x;
      if ($$0 != null) {
         return $$0;
      } else {
         Map<cuc, Integer> $$1 = Maps.newLinkedHashMap();
         a($$1, cuk.rX, 20000);
         a($$1, dfe.jv, 16000);
         a($$1, cuk.tD, 2400);
         a($$1, cuk.pM, 1600);
         a($$1, cuk.pN, 1600);
         a($$1, awm.r, 300);
         a($$1, awm.C, 300);
         a($$1, awm.b, 300);
         a($$1, dfe.ab, 300);
         a($$1, awm.i, 300);
         a($$1, dfe.iO, 300);
         a($$1, awm.j, 150);
         a($$1, dfe.kw, 150);
         a($$1, awm.n, 300);
         a($$1, awm.m, 300);
         a($$1, awm.k, 300);
         a($$1, awm.l, 300);
         a($$1, dfe.bI, 300);
         a($$1, dfe.cW, 300);
         a($$1, dfe.cX, 300);
         a($$1, dfe.oY, 300);
         a($$1, dfe.eH, 300);
         a($$1, dfe.dg, 300);
         a($$1, dfe.hP, 300);
         a($$1, dfe.dl, 300);
         a($$1, dfe.hT, 300);
         a($$1, awm.E, 300);
         a($$1, cuk.pK, 300);
         a($$1, cuk.ss, 300);
         a($$1, dfe.dA, 300);
         a($$1, awm.aR, 200);
         a($$1, awm.bf, 800);
         a($$1, cuk.qf, 200);
         a($$1, cuk.qe, 200);
         a($$1, cuk.qi, 200);
         a($$1, cuk.qh, 200);
         a($$1, cuk.qg, 200);
         a($$1, awm.h, 200);
         a($$1, awm.aO, 1200);
         a($$1, awm.a, 100);
         a($$1, awm.d, 100);
         a($$1, cuk.qI, 100);
         a($$1, awm.p, 100);
         a($$1, cuk.qJ, 100);
         a($$1, awm.g, 67);
         a($$1, dfe.nc, 4001);
         a($$1, cuk.xE, 300);
         a($$1, dfe.nX, 50);
         a($$1, dfe.cf, 100);
         a($$1, dfe.oQ, 50);
         a($$1, dfe.oR, 300);
         a($$1, dfe.oS, 300);
         a($$1, dfe.oV, 300);
         a($$1, dfe.oW, 300);
         a($$1, dfe.oZ, 300);
         a($$1, dfe.qn, 300);
         a($$1, dfe.tV, 100);
         a($$1, dfe.tW, 100);
         a($$1, dfe.aK, 300);
         x = $$1;
         return $$1;
      }
   }

   private static boolean b(cuc $$0) {
      return $$0.n().a(awm.aH);
   }

   private static void a(Map<cuc, Integer> $$0, awt<cuc> $$1, int $$2) {
      for (ja<cuc> $$3 : lh.h.c($$1)) {
         if (!b($$3.a())) {
            $$0.put($$3.a(), $$2);
         }
      }
   }

   private static void a(Map<cuc, Integer> $$0, dbz $$1, int $$2) {
      cuc $$3 = $$1.q();
      if (b($$3)) {
         if (ab.aX) {
            throw (IllegalStateException)ad.b(
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
   public void a(uk $$0, jc.a $$1) {
      super.a($$0, $$1);
      this.l = jj.a(this.b(), cuh.i);
      bpu.b($$0, this.l, $$1);
      this.t = $$0.g("BurnTime");
      this.v = $$0.g("CookTime");
      this.w = $$0.g("CookTimeTotal");
      this.u = this.b(this.l.get(1));
      uk $$2 = $$0.p("RecipesUsed");

      for (String $$3 : $$2.e()) {
         this.y.put(new akt($$3), $$2.h($$3));
      }
   }

   @Override
   protected void b(uk $$0, jc.a $$1) {
      super.b($$0, $$1);
      $$0.a("BurnTime", (short)this.t);
      $$0.a("CookTime", (short)this.v);
      $$0.a("CookTimeTotal", (short)this.w);
      bpu.a($$0, this.l, $$1);
      uk $$2 = new uk();
      this.y.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), $$2x));
      $$0.a("RecipesUsed", $$2);
   }

   public static void a(dca $$0, ir $$1, dtc $$2, dpp $$3) {
      boolean $$4 = $$3.l();
      boolean $$5 = false;
      if ($$3.l()) {
         $$3.t--;
      }

      cuh $$6 = $$3.l.get(1);
      boolean $$7 = !$$3.l.get(0).d();
      boolean $$8 = !$$6.d();
      if ($$3.l() || $$8 && $$7) {
         czc<?> $$9;
         if ($$7) {
            $$9 = $$3.z.a($$3, $$0).orElse(null);
         } else {
            $$9 = null;
         }

         int $$11 = $$3.ai_();
         if (!$$3.l() && a($$0.I_(), $$9, $$3.l, $$11)) {
            $$3.t = $$3.b($$6);
            $$3.u = $$3.t;
            if ($$3.l()) {
               $$5 = true;
               if ($$8) {
                  cuc $$12 = $$6.f();
                  $$6.h(1);
                  if ($$6.d()) {
                     cuc $$13 = $$12.t();
                     $$3.l.set(1, $$13 == null ? cuh.i : new cuh($$13));
                  }
               }
            }
         }

         if ($$3.l() && a($$0.I_(), $$9, $$3.l, $$11)) {
            $$3.v++;
            if ($$3.v == $$3.w) {
               $$3.v = 0;
               $$3.w = a($$0, $$3);
               if (a($$0, $$9, $$3.l, $$11)) {
                  $$3.a($$9);
               }

               $$5 = true;
            }
         } else {
            $$3.v = 0;
         }
      } else if (!$$3.l() && $$3.v > 0) {
         $$3.v = aym.a($$3.v - 2, 0, $$3.w);
      }

      if ($$4 != $$3.l()) {
         $$5 = true;
         $$2 = $$2.a(ddw.b, Boolean.valueOf($$3.l()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(jo $$0, @Nullable czc<?> $$1, jj<cuh> $$2, int $$3) {
      if (!$$2.get(0).d() && $$1 != null) {
         cuh $$4 = $$1.b().a($$0);
         if ($$4.d()) {
            return false;
         } else {
            cuh $$5 = $$2.get(2);
            if ($$5.d()) {
               return true;
            } else if ($$5.a(cuk.pT)) {
               return false;
            } else if (!cuh.c($$5, $$4)) {
               return false;
            } else {
               return $$5.G() < $$3 && $$5.G() < $$5.i() ? true : $$5.G() < $$4.i();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean a(dca $$0, @Nullable czc<?> $$1, jj<cuh> $$2, int $$3) {
      jo $$4 = $$0.I_();
      if ($$1 != null && a($$4, $$1, $$2, $$3)) {
         cuh $$5 = $$2.get(0);
         cuh $$6 = $$1.b().a($$4);
         if ($$6.a(cuk.pT)) {
            $$6.b(ke.M, new dqy.b('a', dqy.b.a($$0.F_())));
         }

         cuh $$7 = $$2.get(2);
         if ($$7.d()) {
            $$2.set(2, $$6.r());
         } else if (cuh.c($$7, $$6)) {
            $$7.g(1);
         }

         if ($$5.a(dfe.bx.q()) && !$$2.get(1).d() && $$2.get(1).a(cuk.rV)) {
            $$2.set(1, new cuh(cuk.rW));
         }

         $$5.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int b(cuh $$0) {
      if ($$0.d()) {
         return 0;
      } else {
         cuc $$1 = $$0.f();
         return g().getOrDefault($$1, 0);
      }
   }

   private static int a(dca $$0, dpp $$1) {
      return $$1.z.a($$1, $$0).map($$0x -> ((cyh)$$0x.b()).d()).orElse(200);
   }

   public static boolean c(cuh $$0) {
      return g().containsKey($$0.f());
   }

   @Override
   public int[] a(iw $$0) {
      if ($$0 == iw.a) {
         return r;
      } else {
         return $$0 == iw.b ? q : s;
      }
   }

   @Override
   public boolean a(int $$0, cuh $$1, @Nullable iw $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cuh $$1, iw $$2) {
      return $$2 == iw.a && $$0 == 1 ? $$1.a(cuk.rW) || $$1.a(cuk.rV) : true;
   }

   @Override
   public int b() {
      return this.l.size();
   }

   @Override
   protected jj<cuh> j() {
      return this.l;
   }

   @Override
   protected void a(jj<cuh> $$0) {
      this.l = $$0;
   }

   @Override
   public void a(int $$0, cuh $$1) {
      cuh $$2 = this.l.get($$0);
      boolean $$3 = !$$1.d() && cuh.c($$2, $$1);
      this.l.set($$0, $$1);
      $$1.f(this.a($$1));
      if ($$0 == 0 && !$$3) {
         this.w = a(this.n, this);
         this.v = 0;
         this.e();
      }
   }

   @Override
   public boolean b(int $$0, cuh $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         cuh $$2 = this.l.get(1);
         return c($$1) || $$1.a(cuk.rV) && !$$2.a(cuk.rV);
      }
   }

   @Override
   public void a(@Nullable czc<?> $$0) {
      if ($$0 != null) {
         akt $$1 = $$0.a();
         this.y.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public czc<?> d() {
      return null;
   }

   @Override
   public void a(cly $$0, List<cuh> $$1) {
   }

   public void a(aqu $$0) {
      List<czc<?>> $$1 = this.a($$0.B(), $$0.ds());
      $$0.a($$1);

      for (czc<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.l);
         }
      }

      this.y.clear();
   }

   public List<czc<?>> a(aqt $$0, ewu $$1) {
      List<czc<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.y.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<akt> $$3 = (Entry<akt>)var4.next();
         $$0.r().a((akt)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((czc<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((cyh)$$4.b()).b());
         });
      }

      return $$2;
   }

   private static void a(aqt $$0, ewu $$1, int $$2, float $$3) {
      int $$4 = aym.d((float)$$2 * $$3);
      float $$5 = aym.h((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      bse.a($$0, $$1, $$4);
   }

   @Override
   public void a(cmc $$0) {
      for (cuh $$1 : this.l) {
         $$0.b($$1);
      }
   }
}

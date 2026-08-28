import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class dpd extends dpj implements bqs, cqx, cri {
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
   protected js<cuc> l = js.a(3, cuc.l);
   int t;
   int u;
   int v;
   int w;
   @Nullable
   private static volatile Map<ctx, Integer> x;
   protected final cps m = new cps() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dpd.this.t;
            case 1:
               return dpd.this.u;
            case 2:
               return dpd.this.v;
            case 3:
               return dpd.this.w;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dpd.this.t = $$1;
               break;
            case 1:
               dpd.this.u = $$1;
               break;
            case 2:
               dpd.this.v = $$1;
               break;
            case 3:
               dpd.this.w = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Object2IntOpenHashMap<akk> y = new Object2IntOpenHashMap();
   private final cym.a<cyy, ? extends cxq> z;

   protected dpd(dpr<?> $$0, ja $$1, dsk $$2, cyo<? extends cxq> $$3) {
      super($$0, $$1, $$2);
      this.z = cym.b($$3);
   }

   public static void f() {
      x = null;
   }

   public static Map<ctx, Integer> g() {
      Map<ctx, Integer> $$0 = x;
      if ($$0 != null) {
         return $$0;
      } else {
         Map<ctx, Integer> $$1 = Maps.newLinkedHashMap();
         a($$1, cuf.qA, 20000);
         a($$1, dfj.iB, 16000);
         a($$1, cuf.sg, 2400);
         a($$1, cuf.ox, 1600);
         a($$1, cuf.oy, 1600);
         a($$1, awf.r, 300);
         a($$1, awf.C, 300);
         a($$1, awf.b, 300);
         a($$1, dfj.w, 300);
         a($$1, awf.i, 300);
         a($$1, dfj.hU, 300);
         a($$1, awf.j, 150);
         a($$1, dfj.jC, 150);
         a($$1, awf.n, 300);
         a($$1, awf.m, 300);
         a($$1, awf.k, 300);
         a($$1, awf.l, 300);
         a($$1, dfj.aY, 300);
         a($$1, dfj.cl, 300);
         a($$1, dfj.cm, 300);
         a($$1, dfj.oa, 300);
         a($$1, dfj.dT, 300);
         a($$1, dfj.cv, 300);
         a($$1, dfj.gV, 300);
         a($$1, dfj.cA, 300);
         a($$1, dfj.gZ, 300);
         a($$1, awf.E, 300);
         a($$1, cuf.ov, 300);
         a($$1, cuf.qV, 300);
         a($$1, dfj.cO, 300);
         a($$1, awf.aQ, 200);
         a($$1, awf.be, 800);
         a($$1, cuf.oN, 200);
         a($$1, cuf.oM, 200);
         a($$1, cuf.oQ, 200);
         a($$1, cuf.oP, 200);
         a($$1, cuf.oO, 200);
         a($$1, awf.h, 200);
         a($$1, awf.aN, 1200);
         a($$1, awf.a, 100);
         a($$1, awf.d, 100);
         a($$1, cuf.pq, 100);
         a($$1, awf.p, 100);
         a($$1, cuf.ot, 100);
         a($$1, awf.g, 67);
         a($$1, dfj.me, 4001);
         a($$1, cuf.vW, 300);
         a($$1, dfj.mZ, 50);
         a($$1, dfj.bv, 100);
         a($$1, dfj.nS, 50);
         a($$1, dfj.nT, 300);
         a($$1, dfj.nU, 300);
         a($$1, dfj.nX, 300);
         a($$1, dfj.nY, 300);
         a($$1, dfj.ob, 300);
         a($$1, dfj.pc, 300);
         a($$1, dfj.sy, 100);
         a($$1, dfj.sz, 100);
         a($$1, dfj.ac, 300);
         x = $$1;
         return $$1;
      }
   }

   private static boolean b(ctx $$0) {
      return $$0.o().a(awf.aH);
   }

   private static void a(Map<ctx, Integer> $$0, awm<ctx> $$1, int $$2) {
      for (jj<ctx> $$3 : lq.g.c($$1)) {
         if (!b($$3.a())) {
            $$0.put($$3.a(), $$2);
         }
      }
   }

   private static void a(Map<ctx, Integer> $$0, dce $$1, int $$2) {
      ctx $$3 = $$1.r();
      if (b($$3)) {
         if (aa.aW) {
            throw (IllegalStateException)ac.b(
               new IllegalStateException(
                  "A developer tried to explicitly make fire resistant item " + $$3.n(null).getString() + " a furnace fuel. That will not work!"
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
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      this.l = js.a(this.b(), cuc.l);
      bqa.b($$0, this.l, $$1);
      this.t = $$0.g("BurnTime");
      this.v = $$0.g("CookTime");
      this.w = $$0.g("CookTimeTotal");
      this.u = this.b(this.l.get(1));
      tx $$2 = $$0.p("RecipesUsed");

      for (String $$3 : $$2.e()) {
         this.y.put(new akk($$3), $$2.h($$3));
      }
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
      super.b($$0, $$1);
      $$0.a("BurnTime", (short)this.t);
      $$0.a("CookTime", (short)this.v);
      $$0.a("CookTimeTotal", (short)this.w);
      bqa.a($$0, this.l, $$1);
      tx $$2 = new tx();
      this.y.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), $$2x));
      $$0.a("RecipesUsed", $$2);
   }

   public static void a(dcf $$0, ja $$1, dsk $$2, dpd $$3) {
      boolean $$4 = $$3.l();
      boolean $$5 = false;
      if ($$3.l()) {
         $$3.t--;
      }

      cuc $$6 = $$3.l.get(1);
      cuc $$7 = $$3.l.get(0);
      boolean $$8 = !$$7.e();
      boolean $$9 = !$$6.e();
      if ($$3.l() || $$9 && $$8) {
         cyk<?> $$10;
         if ($$8) {
            $$10 = $$3.z.a(new cyy($$7), $$0).orElse(null);
         } else {
            $$10 = null;
         }

         int $$12 = $$3.ah_();
         if (!$$3.l() && a($$0.H_(), $$10, $$3.l, $$12)) {
            $$3.t = $$3.b($$6);
            $$3.u = $$3.t;
            if ($$3.l()) {
               $$5 = true;
               if ($$9) {
                  ctx $$13 = $$6.g();
                  $$6.h(1);
                  if ($$6.e()) {
                     ctx $$14 = $$13.u();
                     $$3.l.set(1, $$14 == null ? cuc.l : new cuc($$14));
                  }
               }
            }
         }

         if ($$3.l() && a($$0.H_(), $$10, $$3.l, $$12)) {
            $$3.v++;
            if ($$3.v == $$3.w) {
               $$3.v = 0;
               $$3.w = a($$0, $$3);
               if (b($$0.H_(), $$10, $$3.l, $$12)) {
                  $$3.a($$10);
               }

               $$5 = true;
            }
         } else {
            $$3.v = 0;
         }
      } else if (!$$3.l() && $$3.v > 0) {
         $$3.v = ayg.a($$3.v - 2, 0, $$3.w);
      }

      if ($$4 != $$3.l()) {
         $$5 = true;
         $$2 = $$2.a(dec.b, Boolean.valueOf($$3.l()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(jx $$0, @Nullable cyk<?> $$1, js<cuc> $$2, int $$3) {
      if (!$$2.get(0).e() && $$1 != null) {
         cuc $$4 = $$1.b().a($$0);
         if ($$4.e()) {
            return false;
         } else {
            cuc $$5 = $$2.get(2);
            if ($$5.e()) {
               return true;
            } else if (!cuc.c($$5, $$4)) {
               return false;
            } else {
               return $$5.H() < $$3 && $$5.H() < $$5.j() ? true : $$5.H() < $$4.j();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(jx $$0, @Nullable cyk<?> $$1, js<cuc> $$2, int $$3) {
      if ($$1 != null && a($$0, $$1, $$2, $$3)) {
         cuc $$4 = $$2.get(0);
         cuc $$5 = $$1.b().a($$0);
         cuc $$6 = $$2.get(2);
         if ($$6.e()) {
            $$2.set(2, $$5.s());
         } else if (cuc.c($$6, $$5)) {
            $$6.g(1);
         }

         if ($$4.a(dfj.aP.r()) && !$$2.get(1).e() && $$2.get(1).a(cuf.qy)) {
            $$2.set(1, new cuc(cuf.qz));
         }

         $$4.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int b(cuc $$0) {
      if ($$0.e()) {
         return 0;
      } else {
         ctx $$1 = $$0.g();
         return g().getOrDefault($$1, 0);
      }
   }

   private static int a(dcf $$0, dpd $$1) {
      cyy $$2 = new cyy($$1.a(0));
      return $$1.z.a($$2, $$0).map($$0x -> ((cxq)$$0x.b()).d()).orElse(200);
   }

   public static boolean c(cuc $$0) {
      return g().containsKey($$0.g());
   }

   @Override
   public int[] a(jf $$0) {
      if ($$0 == jf.a) {
         return r;
      } else {
         return $$0 == jf.b ? q : s;
      }
   }

   @Override
   public boolean a(int $$0, cuc $$1, @Nullable jf $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cuc $$1, jf $$2) {
      return $$2 == jf.a && $$0 == 1 ? $$1.a(cuf.qz) || $$1.a(cuf.qy) : true;
   }

   @Override
   public int b() {
      return this.l.size();
   }

   @Override
   protected js<cuc> j() {
      return this.l;
   }

   @Override
   protected void a(js<cuc> $$0) {
      this.l = $$0;
   }

   @Override
   public void a(int $$0, cuc $$1) {
      cuc $$2 = this.l.get($$0);
      boolean $$3 = !$$1.e() && cuc.c($$2, $$1);
      this.l.set($$0, $$1);
      $$1.f(this.e_($$1));
      if ($$0 == 0 && !$$3) {
         this.w = a(this.n, this);
         this.v = 0;
         this.e();
      }
   }

   @Override
   public boolean b(int $$0, cuc $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         cuc $$2 = this.l.get(1);
         return c($$1) || $$1.a(cuf.qy) && !$$2.a(cuf.qy);
      }
   }

   @Override
   public void a(@Nullable cyk<?> $$0) {
      if ($$0 != null) {
         akk $$1 = $$0.a();
         this.y.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public cyk<?> d() {
      return null;
   }

   @Override
   public void a(cmk $$0, List<cuc> $$1) {
   }

   public void a(aqn $$0) {
      List<cyk<?>> $$1 = this.a($$0.z(), $$0.do());
      $$0.a($$1);

      for (cyk<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.l);
         }
      }

      this.y.clear();
   }

   public List<cyk<?>> a(aqm $$0, ewf $$1) {
      List<cyk<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.y.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<akk> $$3 = (Entry<akk>)var4.next();
         $$0.r().a((akk)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((cyk<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((cxq)$$4.b()).b());
         });
      }

      return $$2;
   }

   private static void a(aqm $$0, ewf $$1, int $$2, float $$3) {
      int $$4 = ayg.d((float)$$2 * $$3);
      float $$5 = ayg.h((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      bsr.a($$0, $$1, $$4);
   }

   @Override
   public void a(cmo $$0) {
      for (cuc $$1 : this.l) {
         $$0.b($$1);
      }
   }
}

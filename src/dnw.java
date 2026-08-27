import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class dnw extends doc implements bqi, cqk, cqv {
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
   protected jg<ctq> l = jg.a(3, ctq.i);
   int t;
   int u;
   int v;
   int w;
   @Nullable
   private static volatile Map<ctl, Integer> x;
   protected final cpf m = new cpf() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dnw.this.t;
            case 1:
               return dnw.this.u;
            case 2:
               return dnw.this.v;
            case 3:
               return dnw.this.w;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dnw.this.t = $$1;
               break;
            case 1:
               dnw.this.u = $$1;
               break;
            case 2:
               dnw.this.v = $$1;
               break;
            case 3:
               dnw.this.w = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Object2IntOpenHashMap<akn> y = new Object2IntOpenHashMap();
   private final cxz.a<bpp, ? extends cxf> z;

   protected dnw(dok<?> $$0, io $$1, drd $$2, cyb<? extends cxf> $$3) {
      super($$0, $$1, $$2);
      this.z = cxz.b($$3);
   }

   public static void f() {
      x = null;
   }

   public static Map<ctl, Integer> g() {
      Map<ctl, Integer> $$0 = x;
      if ($$0 != null) {
         return $$0;
      } else {
         Map<ctl, Integer> $$1 = Maps.newLinkedHashMap();
         a($$1, ctt.qA, 20000);
         a($$1, dec.iB, 16000);
         a($$1, ctt.sg, 2400);
         a($$1, ctt.ow, 1600);
         a($$1, ctt.ox, 1600);
         a($$1, awf.r, 300);
         a($$1, awf.C, 300);
         a($$1, awf.b, 300);
         a($$1, dec.w, 300);
         a($$1, awf.i, 300);
         a($$1, dec.hU, 300);
         a($$1, awf.j, 150);
         a($$1, dec.jC, 150);
         a($$1, awf.n, 300);
         a($$1, awf.m, 300);
         a($$1, awf.k, 300);
         a($$1, awf.l, 300);
         a($$1, dec.aY, 300);
         a($$1, dec.cl, 300);
         a($$1, dec.cm, 300);
         a($$1, dec.oa, 300);
         a($$1, dec.dT, 300);
         a($$1, dec.cv, 300);
         a($$1, dec.gV, 300);
         a($$1, dec.cA, 300);
         a($$1, dec.gZ, 300);
         a($$1, awf.E, 300);
         a($$1, ctt.ou, 300);
         a($$1, ctt.qV, 300);
         a($$1, dec.cO, 300);
         a($$1, awf.aQ, 200);
         a($$1, awf.be, 800);
         a($$1, ctt.oM, 200);
         a($$1, ctt.oL, 200);
         a($$1, ctt.oP, 200);
         a($$1, ctt.oO, 200);
         a($$1, ctt.oN, 200);
         a($$1, awf.h, 200);
         a($$1, awf.aN, 1200);
         a($$1, awf.a, 100);
         a($$1, awf.d, 100);
         a($$1, ctt.pp, 100);
         a($$1, awf.p, 100);
         a($$1, ctt.pq, 100);
         a($$1, awf.g, 67);
         a($$1, dec.me, 4001);
         a($$1, ctt.vT, 300);
         a($$1, dec.mZ, 50);
         a($$1, dec.bv, 100);
         a($$1, dec.nS, 50);
         a($$1, dec.nT, 300);
         a($$1, dec.nU, 300);
         a($$1, dec.nX, 300);
         a($$1, dec.nY, 300);
         a($$1, dec.ob, 300);
         a($$1, dec.pc, 300);
         a($$1, dec.sy, 100);
         a($$1, dec.sz, 100);
         a($$1, dec.ac, 300);
         x = $$1;
         return $$1;
      }
   }

   private static boolean b(ctl $$0) {
      return $$0.o().a(awf.aH);
   }

   private static void a(Map<ctl, Integer> $$0, awm<ctl> $$1, int $$2) {
      for (ix<ctl> $$3 : le.h.c($$1)) {
         if (!b($$3.a())) {
            $$0.put($$3.a(), $$2);
         }
      }
   }

   private static void a(Map<ctl, Integer> $$0, day $$1, int $$2) {
      ctl $$3 = $$1.r();
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
      this.l = jg.a(this.b(), ctq.i);
      bpq.b($$0, this.l, $$1);
      this.t = $$0.g("BurnTime");
      this.v = $$0.g("CookTime");
      this.w = $$0.g("CookTimeTotal");
      this.u = this.b(this.l.get(1));
      ud $$2 = $$0.p("RecipesUsed");

      for (String $$3 : $$2.e()) {
         this.y.put(new akn($$3), $$2.h($$3));
      }
   }

   @Override
   protected void b(ud $$0, iz.a $$1) {
      super.b($$0, $$1);
      $$0.a("BurnTime", (short)this.t);
      $$0.a("CookTime", (short)this.v);
      $$0.a("CookTimeTotal", (short)this.w);
      bpq.a($$0, this.l, $$1);
      ud $$2 = new ud();
      this.y.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), $$2x));
      $$0.a("RecipesUsed", $$2);
   }

   public static void a(daz $$0, io $$1, drd $$2, dnw $$3) {
      boolean $$4 = $$3.l();
      boolean $$5 = false;
      if ($$3.l()) {
         $$3.t--;
      }

      ctq $$6 = $$3.l.get(1);
      boolean $$7 = !$$3.l.get(0).e();
      boolean $$8 = !$$6.e();
      if ($$3.l() || $$8 && $$7) {
         cxy<?> $$9;
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
                  ctl $$12 = $$6.g();
                  $$6.h(1);
                  if ($$6.e()) {
                     ctl $$13 = $$12.u();
                     $$3.l.set(1, $$13 == null ? ctq.i : new ctq($$13));
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
         $$3.v = ayf.a($$3.v - 2, 0, $$3.w);
      }

      if ($$4 != $$3.l()) {
         $$5 = true;
         $$2 = $$2.a(dcv.b, Boolean.valueOf($$3.l()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(jl $$0, @Nullable cxy<?> $$1, jg<ctq> $$2, int $$3) {
      if (!$$2.get(0).e() && $$1 != null) {
         ctq $$4 = $$1.b().a($$0);
         if ($$4.e()) {
            return false;
         } else {
            ctq $$5 = $$2.get(2);
            if ($$5.e()) {
               return true;
            } else if (!ctq.c($$5, $$4)) {
               return false;
            } else {
               return $$5.I() < $$3 && $$5.I() < $$5.j() ? true : $$5.I() < $$4.j();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(jl $$0, @Nullable cxy<?> $$1, jg<ctq> $$2, int $$3) {
      if ($$1 != null && a($$0, $$1, $$2, $$3)) {
         ctq $$4 = $$2.get(0);
         ctq $$5 = $$1.b().a($$0);
         ctq $$6 = $$2.get(2);
         if ($$6.e()) {
            $$2.set(2, $$5.s());
         } else if (ctq.c($$6, $$5)) {
            $$6.g(1);
         }

         if ($$4.a(dec.aP.r()) && !$$2.get(1).e() && $$2.get(1).a(ctt.qy)) {
            $$2.set(1, new ctq(ctt.qz));
         }

         $$4.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int b(ctq $$0) {
      if ($$0.e()) {
         return 0;
      } else {
         ctl $$1 = $$0.g();
         return g().getOrDefault($$1, 0);
      }
   }

   private static int a(daz $$0, dnw $$1) {
      return $$1.z.a($$1, $$0).map($$0x -> ((cxf)$$0x.b()).d()).orElse(200);
   }

   public static boolean c(ctq $$0) {
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
   public boolean a(int $$0, ctq $$1, @Nullable it $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, ctq $$1, it $$2) {
      return $$2 == it.a && $$0 == 1 ? $$1.a(ctt.qz) || $$1.a(ctt.qy) : true;
   }

   @Override
   public int b() {
      return this.l.size();
   }

   @Override
   protected jg<ctq> j() {
      return this.l;
   }

   @Override
   protected void a(jg<ctq> $$0) {
      this.l = $$0;
   }

   @Override
   public void a(int $$0, ctq $$1) {
      ctq $$2 = this.l.get($$0);
      boolean $$3 = !$$1.e() && ctq.c($$2, $$1);
      this.l.set($$0, $$1);
      $$1.f(this.e_($$1));
      if ($$0 == 0 && !$$3) {
         this.w = a(this.n, this);
         this.v = 0;
         this.e();
      }
   }

   @Override
   public boolean b(int $$0, ctq $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         ctq $$2 = this.l.get(1);
         return c($$1) || $$1.a(ctt.qy) && !$$2.a(ctt.qy);
      }
   }

   @Override
   public void a(@Nullable cxy<?> $$0) {
      if ($$0 != null) {
         akn $$1 = $$0.a();
         this.y.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public cxy<?> d() {
      return null;
   }

   @Override
   public void a(cly $$0, List<ctq> $$1) {
   }

   public void a(aqo $$0) {
      List<cxy<?>> $$1 = this.a($$0.z(), $$0.dn());
      $$0.a($$1);

      for (cxy<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.l);
         }
      }

      this.y.clear();
   }

   public List<cxy<?>> a(aqn $$0, eum $$1) {
      List<cxy<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.y.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<akn> $$3 = (Entry<akn>)var4.next();
         $$0.r().a((akn)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((cxy<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((cxf)$$4.b()).b());
         });
      }

      return $$2;
   }

   private static void a(aqn $$0, eum $$1, int $$2, float $$3) {
      int $$4 = ayf.d((float)$$2 * $$3);
      float $$5 = ayf.h((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      bsg.a($$0, $$1, $$4);
   }

   @Override
   public void a(cmc $$0) {
      for (ctq $$1 : this.l) {
         $$0.b($$1);
      }
   }
}

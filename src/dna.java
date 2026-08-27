import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class dna extends dng implements bpy, cpt, cqe {
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
   protected jf<csz> l = jf.a(3, csz.i);
   int t;
   int u;
   int v;
   int w;
   @Nullable
   private static volatile Map<csu, Integer> x;
   protected final coo m = new coo() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dna.this.t;
            case 1:
               return dna.this.u;
            case 2:
               return dna.this.v;
            case 3:
               return dna.this.w;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dna.this.t = $$1;
               break;
            case 1:
               dna.this.u = $$1;
               break;
            case 2:
               dna.this.v = $$1;
               break;
            case 3:
               dna.this.w = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Object2IntOpenHashMap<akh> y = new Object2IntOpenHashMap();
   private final cxg.a<bpf, ? extends cwm> z;

   protected dna(dno<?> $$0, in $$1, dqh $$2, cxi<? extends cwm> $$3) {
      super($$0, $$1, $$2);
      this.z = cxg.b($$3);
   }

   public static void f() {
      x = null;
   }

   public static Map<csu, Integer> g() {
      Map<csu, Integer> $$0 = x;
      if ($$0 != null) {
         return $$0;
      } else {
         Map<csu, Integer> $$1 = Maps.newLinkedHashMap();
         a($$1, ctc.qA, 20000);
         a($$1, ddg.iB, 16000);
         a($$1, ctc.sg, 2400);
         a($$1, ctc.ow, 1600);
         a($$1, ctc.ox, 1600);
         a($$1, avz.r, 300);
         a($$1, avz.C, 300);
         a($$1, avz.b, 300);
         a($$1, ddg.w, 300);
         a($$1, avz.i, 300);
         a($$1, ddg.hU, 300);
         a($$1, avz.j, 150);
         a($$1, ddg.jC, 150);
         a($$1, avz.n, 300);
         a($$1, avz.m, 300);
         a($$1, avz.k, 300);
         a($$1, avz.l, 300);
         a($$1, ddg.aY, 300);
         a($$1, ddg.cl, 300);
         a($$1, ddg.cm, 300);
         a($$1, ddg.oa, 300);
         a($$1, ddg.dT, 300);
         a($$1, ddg.cv, 300);
         a($$1, ddg.gV, 300);
         a($$1, ddg.cA, 300);
         a($$1, ddg.gZ, 300);
         a($$1, avz.E, 300);
         a($$1, ctc.ou, 300);
         a($$1, ctc.qV, 300);
         a($$1, ddg.cO, 300);
         a($$1, avz.aQ, 200);
         a($$1, avz.be, 800);
         a($$1, ctc.oM, 200);
         a($$1, ctc.oL, 200);
         a($$1, ctc.oP, 200);
         a($$1, ctc.oO, 200);
         a($$1, ctc.oN, 200);
         a($$1, avz.h, 200);
         a($$1, avz.aN, 1200);
         a($$1, avz.a, 100);
         a($$1, avz.d, 100);
         a($$1, ctc.pp, 100);
         a($$1, avz.p, 100);
         a($$1, ctc.pq, 100);
         a($$1, avz.g, 67);
         a($$1, ddg.me, 4001);
         a($$1, ctc.vT, 300);
         a($$1, ddg.mZ, 50);
         a($$1, ddg.bv, 100);
         a($$1, ddg.nS, 50);
         a($$1, ddg.nT, 300);
         a($$1, ddg.nU, 300);
         a($$1, ddg.nX, 300);
         a($$1, ddg.nY, 300);
         a($$1, ddg.ob, 300);
         a($$1, ddg.pc, 300);
         a($$1, ddg.sy, 100);
         a($$1, ddg.sz, 100);
         a($$1, ddg.ac, 300);
         x = $$1;
         return $$1;
      }
   }

   private static boolean b(csu $$0) {
      return $$0.n().a(avz.aH);
   }

   private static void a(Map<csu, Integer> $$0, awg<csu> $$1, int $$2) {
      for (iw<csu> $$3 : ld.h.c($$1)) {
         if (!b($$3.a())) {
            $$0.put($$3.a(), $$2);
         }
      }
   }

   private static void a(Map<csu, Integer> $$0, dac $$1, int $$2) {
      csu $$3 = $$1.q();
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
   public void a(ua $$0, iy.a $$1) {
      super.a($$0, $$1);
      this.l = jf.a(this.b(), csz.i);
      bpg.b($$0, this.l, $$1);
      this.t = $$0.g("BurnTime");
      this.v = $$0.g("CookTime");
      this.w = $$0.g("CookTimeTotal");
      this.u = this.b(this.l.get(1));
      ua $$2 = $$0.p("RecipesUsed");

      for (String $$3 : $$2.e()) {
         this.y.put(new akh($$3), $$2.h($$3));
      }
   }

   @Override
   protected void b(ua $$0, iy.a $$1) {
      super.b($$0, $$1);
      $$0.a("BurnTime", (short)this.t);
      $$0.a("CookTime", (short)this.v);
      $$0.a("CookTimeTotal", (short)this.w);
      bpg.a($$0, this.l, $$1);
      ua $$2 = new ua();
      this.y.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), $$2x));
      $$0.a("RecipesUsed", $$2);
   }

   public static void a(dad $$0, in $$1, dqh $$2, dna $$3) {
      boolean $$4 = $$3.l();
      boolean $$5 = false;
      if ($$3.l()) {
         $$3.t--;
      }

      csz $$6 = $$3.l.get(1);
      boolean $$7 = !$$3.l.get(0).d();
      boolean $$8 = !$$6.d();
      if ($$3.l() || $$8 && $$7) {
         cxf<?> $$9;
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
                  csu $$12 = $$6.f();
                  $$6.h(1);
                  if ($$6.d()) {
                     csu $$13 = $$12.t();
                     $$3.l.set(1, $$13 == null ? csz.i : new csz($$13));
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
         $$3.v = axz.a($$3.v - 2, 0, $$3.w);
      }

      if ($$4 != $$3.l()) {
         $$5 = true;
         $$2 = $$2.a(dbz.b, Boolean.valueOf($$3.l()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(jk $$0, @Nullable cxf<?> $$1, jf<csz> $$2, int $$3) {
      if (!$$2.get(0).d() && $$1 != null) {
         csz $$4 = $$1.b().a($$0);
         if ($$4.d()) {
            return false;
         } else {
            csz $$5 = $$2.get(2);
            if ($$5.d()) {
               return true;
            } else if (!csz.c($$5, $$4)) {
               return false;
            } else {
               return $$5.G() < $$3 && $$5.G() < $$5.i() ? true : $$5.G() < $$4.i();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(jk $$0, @Nullable cxf<?> $$1, jf<csz> $$2, int $$3) {
      if ($$1 != null && a($$0, $$1, $$2, $$3)) {
         csz $$4 = $$2.get(0);
         csz $$5 = $$1.b().a($$0);
         csz $$6 = $$2.get(2);
         if ($$6.d()) {
            $$2.set(2, $$5.r());
         } else if (csz.c($$6, $$5)) {
            $$6.g(1);
         }

         if ($$4.a(ddg.aP.q()) && !$$2.get(1).d() && $$2.get(1).a(ctc.qy)) {
            $$2.set(1, new csz(ctc.qz));
         }

         $$4.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int b(csz $$0) {
      if ($$0.d()) {
         return 0;
      } else {
         csu $$1 = $$0.f();
         return g().getOrDefault($$1, 0);
      }
   }

   private static int a(dad $$0, dna $$1) {
      return $$1.z.a($$1, $$0).map($$0x -> ((cwm)$$0x.b()).d()).orElse(200);
   }

   public static boolean c(csz $$0) {
      return g().containsKey($$0.f());
   }

   @Override
   public int[] a(is $$0) {
      if ($$0 == is.a) {
         return r;
      } else {
         return $$0 == is.b ? q : s;
      }
   }

   @Override
   public boolean a(int $$0, csz $$1, @Nullable is $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, csz $$1, is $$2) {
      return $$2 == is.a && $$0 == 1 ? $$1.a(ctc.qz) || $$1.a(ctc.qy) : true;
   }

   @Override
   public int b() {
      return this.l.size();
   }

   @Override
   protected jf<csz> j() {
      return this.l;
   }

   @Override
   protected void a(jf<csz> $$0) {
      this.l = $$0;
   }

   @Override
   public void a(int $$0, csz $$1) {
      csz $$2 = this.l.get($$0);
      boolean $$3 = !$$1.d() && csz.c($$2, $$1);
      this.l.set($$0, $$1);
      $$1.f(this.a($$1));
      if ($$0 == 0 && !$$3) {
         this.w = a(this.n, this);
         this.v = 0;
         this.e();
      }
   }

   @Override
   public boolean b(int $$0, csz $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         csz $$2 = this.l.get(1);
         return c($$1) || $$1.a(ctc.qy) && !$$2.a(ctc.qy);
      }
   }

   @Override
   public void a(@Nullable cxf<?> $$0) {
      if ($$0 != null) {
         akh $$1 = $$0.a();
         this.y.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public cxf<?> d() {
      return null;
   }

   @Override
   public void a(clh $$0, List<csz> $$1) {
   }

   public void a(aqi $$0) {
      List<cxf<?>> $$1 = this.a($$0.z(), $$0.dl());
      $$0.a($$1);

      for (cxf<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.l);
         }
      }

      this.y.clear();
   }

   public List<cxf<?>> a(aqh $$0, etp $$1) {
      List<cxf<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.y.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<akh> $$3 = (Entry<akh>)var4.next();
         $$0.r().a((akh)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((cxf<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((cwm)$$4.b()).b());
         });
      }

      return $$2;
   }

   private static void a(aqh $$0, etp $$1, int $$2, float $$3) {
      int $$4 = axz.d((float)$$2 * $$3);
      float $$5 = axz.h((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      brq.a($$0, $$1, $$4);
   }

   @Override
   public void a(cll $$0) {
      for (csz $$1 : this.l) {
         $$0.b($$1);
      }
   }
}

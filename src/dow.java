import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class dow extends dpc implements brh, crk, crv {
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
   protected jr<cuq> l = jr.a(3, cuq.l);
   int t;
   int u;
   int v;
   int w;
   @Nullable
   private static volatile Map<cul, Integer> x;
   protected final cqf m = new cqf() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dow.this.t;
            case 1:
               return dow.this.u;
            case 2:
               return dow.this.v;
            case 3:
               return dow.this.w;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dow.this.t = $$1;
               break;
            case 1:
               dow.this.u = $$1;
               break;
            case 2:
               dow.this.v = $$1;
               break;
            case 3:
               dow.this.w = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Object2IntOpenHashMap<alf> y = new Object2IntOpenHashMap();
   private final cyz.a<bqo, ? extends cyf> z;

   protected dow(dpk<?> $$0, iz $$1, dsd $$2, czb<? extends cyf> $$3) {
      super($$0, $$1, $$2);
      this.z = cyz.b($$3);
   }

   public static void f() {
      x = null;
   }

   public static Map<cul, Integer> g() {
      Map<cul, Integer> $$0 = x;
      if ($$0 != null) {
         return $$0;
      } else {
         Map<cul, Integer> $$1 = Maps.newLinkedHashMap();
         a($$1, cut.qA, 20000);
         a($$1, dfc.iB, 16000);
         a($$1, cut.sg, 2400);
         a($$1, cut.ow, 1600);
         a($$1, cut.ox, 1600);
         a($$1, awy.r, 300);
         a($$1, awy.C, 300);
         a($$1, awy.b, 300);
         a($$1, dfc.w, 300);
         a($$1, awy.i, 300);
         a($$1, dfc.hU, 300);
         a($$1, awy.j, 150);
         a($$1, dfc.jC, 150);
         a($$1, awy.n, 300);
         a($$1, awy.m, 300);
         a($$1, awy.k, 300);
         a($$1, awy.l, 300);
         a($$1, dfc.aY, 300);
         a($$1, dfc.cl, 300);
         a($$1, dfc.cm, 300);
         a($$1, dfc.oa, 300);
         a($$1, dfc.dT, 300);
         a($$1, dfc.cv, 300);
         a($$1, dfc.gV, 300);
         a($$1, dfc.cA, 300);
         a($$1, dfc.gZ, 300);
         a($$1, awy.E, 300);
         a($$1, cut.ou, 300);
         a($$1, cut.qV, 300);
         a($$1, dfc.cO, 300);
         a($$1, awy.aQ, 200);
         a($$1, awy.be, 800);
         a($$1, cut.oM, 200);
         a($$1, cut.oL, 200);
         a($$1, cut.oP, 200);
         a($$1, cut.oO, 200);
         a($$1, cut.oN, 200);
         a($$1, awy.h, 200);
         a($$1, awy.aN, 1200);
         a($$1, awy.a, 100);
         a($$1, awy.d, 100);
         a($$1, cut.pp, 100);
         a($$1, awy.p, 100);
         a($$1, cut.pq, 100);
         a($$1, awy.g, 67);
         a($$1, dfc.me, 4001);
         a($$1, cut.vT, 300);
         a($$1, dfc.mZ, 50);
         a($$1, dfc.bv, 100);
         a($$1, dfc.nS, 50);
         a($$1, dfc.nT, 300);
         a($$1, dfc.nU, 300);
         a($$1, dfc.nX, 300);
         a($$1, dfc.nY, 300);
         a($$1, dfc.ob, 300);
         a($$1, dfc.pc, 300);
         a($$1, dfc.sy, 100);
         a($$1, dfc.sz, 100);
         a($$1, dfc.ac, 300);
         x = $$1;
         return $$1;
      }
   }

   private static boolean b(cul $$0) {
      return $$0.o().a(awy.aH);
   }

   private static void a(Map<cul, Integer> $$0, axf<cul> $$1, int $$2) {
      for (ji<cul> $$3 : lp.h.c($$1)) {
         if (!b($$3.a())) {
            $$0.put($$3.a(), $$2);
         }
      }
   }

   private static void a(Map<cul, Integer> $$0, dby $$1, int $$2) {
      cul $$3 = $$1.r();
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
      this.l = jr.a(this.b(), cuq.l);
      bqp.b($$0, this.l, $$1);
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
      bqp.a($$0, this.l, $$1);
      us $$2 = new us();
      this.y.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), $$2x));
      $$0.a("RecipesUsed", $$2);
   }

   public static void a(dbz $$0, iz $$1, dsd $$2, dow $$3) {
      boolean $$4 = $$3.l();
      boolean $$5 = false;
      if ($$3.l()) {
         $$3.t--;
      }

      cuq $$6 = $$3.l.get(1);
      boolean $$7 = !$$3.l.get(0).e();
      boolean $$8 = !$$6.e();
      if ($$3.l() || $$8 && $$7) {
         cyy<?> $$9;
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
                  cul $$12 = $$6.g();
                  $$6.h(1);
                  if ($$6.e()) {
                     cul $$13 = $$12.u();
                     $$3.l.set(1, $$13 == null ? cuq.l : new cuq($$13));
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
         $$2 = $$2.a(ddv.b, Boolean.valueOf($$3.l()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(jw $$0, @Nullable cyy<?> $$1, jr<cuq> $$2, int $$3) {
      if (!$$2.get(0).e() && $$1 != null) {
         cuq $$4 = $$1.b().a($$0);
         if ($$4.e()) {
            return false;
         } else {
            cuq $$5 = $$2.get(2);
            if ($$5.e()) {
               return true;
            } else if (!cuq.c($$5, $$4)) {
               return false;
            } else {
               return $$5.I() < $$3 && $$5.I() < $$5.j() ? true : $$5.I() < $$4.j();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(jw $$0, @Nullable cyy<?> $$1, jr<cuq> $$2, int $$3) {
      if ($$1 != null && a($$0, $$1, $$2, $$3)) {
         cuq $$4 = $$2.get(0);
         cuq $$5 = $$1.b().a($$0);
         cuq $$6 = $$2.get(2);
         if ($$6.e()) {
            $$2.set(2, $$5.s());
         } else if (cuq.c($$6, $$5)) {
            $$6.g(1);
         }

         if ($$4.a(dfc.aP.r()) && !$$2.get(1).e() && $$2.get(1).a(cut.qy)) {
            $$2.set(1, new cuq(cut.qz));
         }

         $$4.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int b(cuq $$0) {
      if ($$0.e()) {
         return 0;
      } else {
         cul $$1 = $$0.g();
         return g().getOrDefault($$1, 0);
      }
   }

   private static int a(dbz $$0, dow $$1) {
      return $$1.z.a($$1, $$0).map($$0x -> ((cyf)$$0x.b()).d()).orElse(200);
   }

   public static boolean c(cuq $$0) {
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
   public boolean a(int $$0, cuq $$1, @Nullable je $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cuq $$1, je $$2) {
      return $$2 == je.a && $$0 == 1 ? $$1.a(cut.qz) || $$1.a(cut.qy) : true;
   }

   @Override
   public int b() {
      return this.l.size();
   }

   @Override
   protected jr<cuq> j() {
      return this.l;
   }

   @Override
   protected void a(jr<cuq> $$0) {
      this.l = $$0;
   }

   @Override
   public void a(int $$0, cuq $$1) {
      cuq $$2 = this.l.get($$0);
      boolean $$3 = !$$1.e() && cuq.c($$2, $$1);
      this.l.set($$0, $$1);
      $$1.f(this.e_($$1));
      if ($$0 == 0 && !$$3) {
         this.w = a(this.n, this);
         this.v = 0;
         this.e();
      }
   }

   @Override
   public boolean b(int $$0, cuq $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         cuq $$2 = this.l.get(1);
         return c($$1) || $$1.a(cut.qy) && !$$2.a(cut.qy);
      }
   }

   @Override
   public void a(@Nullable cyy<?> $$0) {
      if ($$0 != null) {
         alf $$1 = $$0.a();
         this.y.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public cyy<?> d() {
      return null;
   }

   @Override
   public void a(cmy $$0, List<cuq> $$1) {
   }

   public void a(arg $$0) {
      List<cyy<?>> $$1 = this.a($$0.z(), $$0.dn());
      $$0.a($$1);

      for (cyy<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.l);
         }
      }

      this.y.clear();
   }

   public List<cyy<?>> a(arf $$0, evs $$1) {
      List<cyy<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.y.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<alf> $$3 = (Entry<alf>)var4.next();
         $$0.r().a((alf)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((cyy<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((cyf)$$4.b()).b());
         });
      }

      return $$2;
   }

   private static void a(arf $$0, evs $$1, int $$2, float $$3) {
      int $$4 = ayz.d((float)$$2 * $$3);
      float $$5 = ayz.h((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      btg.a($$0, $$1, $$4);
   }

   @Override
   public void a(cnc $$0) {
      for (cuq $$1 : this.l) {
         $$0.b($$1);
      }
   }
}

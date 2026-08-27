import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class dim extends dir implements bmi, clu, cmd {
   protected static final int c = 0;
   protected static final int d = 1;
   protected static final int e = 2;
   public static final int f = 0;
   private static final int[] r = new int[]{0};
   private static final int[] s = new int[]{2, 1};
   private static final int[] t = new int[]{1};
   public static final int g = 1;
   public static final int h = 2;
   public static final int i = 3;
   public static final int j = 4;
   public static final int k = 200;
   public static final int l = 2;
   protected is<cpd> m = is.a(3, cpd.h);
   int u;
   int v;
   int w;
   int x;
   @Nullable
   private static volatile Map<coy, Integer> y;
   protected final ckp n = new ckp() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dim.this.u;
            case 1:
               return dim.this.v;
            case 2:
               return dim.this.w;
            case 3:
               return dim.this.x;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dim.this.u = $$1;
               break;
            case 1:
               dim.this.v = $$1;
               break;
            case 2:
               dim.this.w = $$1;
               break;
            case 3:
               dim.this.x = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Object2IntOpenHashMap<aiy> z = new Object2IntOpenHashMap();
   private final csi.a<blp, ? extends cro> A;

   protected dim(diz<?> $$0, hz $$1, dlj $$2, csk<? extends cro> $$3) {
      super($$0, $$1, $$2);
      this.A = csi.b($$3);
   }

   public static void f() {
      y = null;
   }

   public static Map<coy, Integer> g() {
      Map<coy, Integer> $$0 = y;
      if ($$0 != null) {
         return $$0;
      } else {
         Map<coy, Integer> $$1 = Maps.newLinkedHashMap();
         a($$1, cpg.qz, 20000);
         a($$1, cyu.iB, 16000);
         a($$1, cpg.sf, 2400);
         a($$1, cpg.ov, 1600);
         a($$1, cpg.ow, 1600);
         a($$1, aui.r, 300);
         a($$1, aui.C, 300);
         a($$1, aui.b, 300);
         a($$1, cyu.w, 300);
         a($$1, aui.i, 300);
         a($$1, cyu.hU, 300);
         a($$1, aui.j, 150);
         a($$1, cyu.jC, 150);
         a($$1, aui.n, 300);
         a($$1, aui.m, 300);
         a($$1, aui.k, 300);
         a($$1, aui.l, 300);
         a($$1, cyu.aY, 300);
         a($$1, cyu.cl, 300);
         a($$1, cyu.cm, 300);
         a($$1, cyu.oa, 300);
         a($$1, cyu.dT, 300);
         a($$1, cyu.cv, 300);
         a($$1, cyu.gV, 300);
         a($$1, cyu.cA, 300);
         a($$1, cyu.gZ, 300);
         a($$1, aui.E, 300);
         a($$1, cpg.ot, 300);
         a($$1, cpg.qU, 300);
         a($$1, cyu.cO, 300);
         a($$1, aui.ap, 200);
         a($$1, aui.aE, 800);
         a($$1, cpg.oL, 200);
         a($$1, cpg.oK, 200);
         a($$1, cpg.oO, 200);
         a($$1, cpg.oN, 200);
         a($$1, cpg.oM, 200);
         a($$1, aui.h, 200);
         a($$1, aui.am, 1200);
         a($$1, aui.a, 100);
         a($$1, aui.d, 100);
         a($$1, cpg.po, 100);
         a($$1, aui.p, 100);
         a($$1, cpg.pp, 100);
         a($$1, aui.g, 67);
         a($$1, cyu.me, 4001);
         a($$1, cpg.vP, 300);
         a($$1, cyu.mZ, 50);
         a($$1, cyu.bv, 100);
         a($$1, cyu.nS, 50);
         a($$1, cyu.nT, 300);
         a($$1, cyu.nU, 300);
         a($$1, cyu.nX, 300);
         a($$1, cyu.nY, 300);
         a($$1, cyu.ob, 300);
         a($$1, cyu.pc, 300);
         a($$1, cyu.sy, 100);
         a($$1, cyu.sz, 100);
         a($$1, cyu.ac, 300);
         y = $$1;
         return $$1;
      }
   }

   private static boolean b(coy $$0) {
      return $$0.i().a(aui.ag);
   }

   private static void a(Map<coy, Integer> $$0, aup<coy> $$1, int $$2) {
      for (ij<coy> $$3 : kf.h.c($$1)) {
         if (!b($$3.a())) {
            $$0.put($$3.a(), $$2);
         }
      }
   }

   private static void a(Map<coy, Integer> $$0, cvq $$1, int $$2) {
      coy $$3 = $$1.j();
      if (b($$3)) {
         if (aa.aU) {
            throw (IllegalStateException)ac.b(
               new IllegalStateException(
                  "A developer tried to explicitly make fire resistant item " + $$3.m(null).getString() + " a furnace fuel. That will not work!"
               )
            );
         }
      } else {
         $$0.put($$3, $$2);
      }
   }

   private boolean k() {
      return this.u > 0;
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.m = is.a(this.b(), cpd.h);
      blq.b($$0, this.m);
      this.u = $$0.g("BurnTime");
      this.w = $$0.g("CookTime");
      this.x = $$0.g("CookTimeTotal");
      this.v = this.a(this.m.get(1));
      sw $$1 = $$0.p("RecipesUsed");

      for (String $$2 : $$1.e()) {
         this.z.put(new aiy($$2), $$1.h($$2));
      }
   }

   @Override
   protected void b(sw $$0) {
      super.b($$0);
      $$0.a("BurnTime", (short)this.u);
      $$0.a("CookTime", (short)this.w);
      $$0.a("CookTimeTotal", (short)this.x);
      blq.a($$0, this.m);
      sw $$1 = new sw();
      this.z.forEach(($$1x, $$2) -> $$1.a($$1x.toString(), $$2));
      $$0.a("RecipesUsed", $$1);
   }

   public static void a(cvr $$0, hz $$1, dlj $$2, dim $$3) {
      boolean $$4 = $$3.k();
      boolean $$5 = false;
      if ($$3.k()) {
         $$3.u--;
      }

      cpd $$6 = $$3.m.get(1);
      boolean $$7 = !$$3.m.get(0).b();
      boolean $$8 = !$$6.b();
      if ($$3.k() || $$8 && $$7) {
         csh<?> $$9;
         if ($$7) {
            $$9 = $$3.A.a($$3, $$0).orElse(null);
         } else {
            $$9 = null;
         }

         int $$11 = $$3.al_();
         if (!$$3.k() && a($$0.I_(), $$9, $$3.m, $$11)) {
            $$3.u = $$3.a($$6);
            $$3.v = $$3.u;
            if ($$3.k()) {
               $$5 = true;
               if ($$8) {
                  coy $$12 = $$6.d();
                  $$6.h(1);
                  if ($$6.b()) {
                     coy $$13 = $$12.r();
                     $$3.m.set(1, $$13 == null ? cpd.h : new cpd($$13));
                  }
               }
            }
         }

         if ($$3.k() && a($$0.I_(), $$9, $$3.m, $$11)) {
            $$3.w++;
            if ($$3.w == $$3.x) {
               $$3.w = 0;
               $$3.x = a($$0, $$3);
               if (b($$0.I_(), $$9, $$3.m, $$11)) {
                  $$3.a($$9);
               }

               $$5 = true;
            }
         } else {
            $$3.w = 0;
         }
      } else if (!$$3.k() && $$3.w > 0) {
         $$3.w = awi.a($$3.w - 2, 0, $$3.x);
      }

      if ($$4 != $$3.k()) {
         $$5 = true;
         $$2 = $$2.a(cxn.b, Boolean.valueOf($$3.k()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(iw $$0, @Nullable csh<?> $$1, is<cpd> $$2, int $$3) {
      if (!$$2.get(0).b() && $$1 != null) {
         cpd $$4 = $$1.b().a($$0);
         if ($$4.b()) {
            return false;
         } else {
            cpd $$5 = $$2.get(2);
            if ($$5.b()) {
               return true;
            } else if (!cpd.b($$5, $$4)) {
               return false;
            } else {
               return $$5.M() < $$3 && $$5.M() < $$5.g() ? true : $$5.M() < $$4.g();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(iw $$0, @Nullable csh<?> $$1, is<cpd> $$2, int $$3) {
      if ($$1 != null && a($$0, $$1, $$2, $$3)) {
         cpd $$4 = $$2.get(0);
         cpd $$5 = $$1.b().a($$0);
         cpd $$6 = $$2.get(2);
         if ($$6.b()) {
            $$2.set(2, $$5.q());
         } else if ($$6.a($$5.d())) {
            $$6.g(1);
         }

         if ($$4.a(cyu.aP.j()) && !$$2.get(1).b() && $$2.get(1).a(cpg.qx)) {
            $$2.set(1, new cpd(cpg.qy));
         }

         $$4.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int a(cpd $$0) {
      if ($$0.b()) {
         return 0;
      } else {
         coy $$1 = $$0.d();
         return g().getOrDefault($$1, 0);
      }
   }

   private static int a(cvr $$0, dim $$1) {
      return $$1.A.a($$1, $$0).map($$0x -> ((cro)$$0x.b()).d()).orElse(200);
   }

   public static boolean b(cpd $$0) {
      return g().containsKey($$0.d());
   }

   @Override
   public int[] a(ie $$0) {
      if ($$0 == ie.a) {
         return s;
      } else {
         return $$0 == ie.b ? r : t;
      }
   }

   @Override
   public boolean a(int $$0, cpd $$1, @Nullable ie $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cpd $$1, ie $$2) {
      return $$2 == ie.a && $$0 == 1 ? $$1.a(cpg.qy) || $$1.a(cpg.qx) : true;
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   public boolean aj_() {
      for (cpd $$0 : this.m) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cpd a(int $$0) {
      return this.m.get($$0);
   }

   @Override
   public cpd a(int $$0, int $$1) {
      return blq.a(this.m, $$0, $$1);
   }

   @Override
   public cpd b(int $$0) {
      return blq.a(this.m, $$0);
   }

   @Override
   public void a(int $$0, cpd $$1) {
      cpd $$2 = this.m.get($$0);
      boolean $$3 = !$$1.b() && cpd.c($$2, $$1);
      this.m.set($$0, $$1);
      if ($$1.M() > this.al_()) {
         $$1.f(this.al_());
      }

      if ($$0 == 0 && !$$3) {
         this.x = a(this.o, this);
         this.w = 0;
         this.e();
      }
   }

   @Override
   public boolean a(chl $$0) {
      return blp.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cpd $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         cpd $$2 = this.m.get(1);
         return b($$1) || $$1.a(cpg.qx) && !$$2.a(cpg.qx);
      }
   }

   @Override
   public void a() {
      this.m.clear();
   }

   @Override
   public void a(@Nullable csh<?> $$0) {
      if ($$0 != null) {
         aiy $$1 = $$0.a();
         this.z.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public csh<?> d() {
      return null;
   }

   @Override
   public void a(chl $$0, List<cpd> $$1) {
   }

   public void a(aox $$0) {
      List<csh<?>> $$1 = this.a($$0.z(), $$0.dk());
      $$0.a($$1);

      for (csh<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.m);
         }
      }

      this.z.clear();
   }

   public List<csh<?>> a(aow $$0, enz $$1) {
      List<csh<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.z.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<aiy> $$3 = (Entry<aiy>)var4.next();
         $$0.r().a((aiy)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((csh<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((cro)$$4.b()).b());
         });
      }

      return $$2;
   }

   private static void a(aow $$0, enz $$1, int $$2, float $$3) {
      int $$4 = awi.d((float)$$2 * $$3);
      float $$5 = awi.h((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      bny.a($$0, $$1, $$4);
   }

   @Override
   public void a(chp $$0) {
      for (cpd $$1 : this.m) {
         $$0.b($$1);
      }
   }
}

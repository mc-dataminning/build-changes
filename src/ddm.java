import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class ddm extends ddr implements bik, chb, chk {
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
   protected il<ckj> m = il.a(3, ckj.b);
   int u;
   int v;
   int w;
   int x;
   protected final cfz n = new cfz() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return ddm.this.u;
            case 1:
               return ddm.this.v;
            case 2:
               return ddm.this.w;
            case 3:
               return ddm.this.x;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               ddm.this.u = $$1;
               break;
            case 1:
               ddm.this.v = $$1;
               break;
            case 2:
               ddm.this.w = $$1;
               break;
            case 3:
               ddm.this.x = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Object2IntOpenHashMap<afw> y = new Object2IntOpenHashMap();
   private final cnp.a<bhu, ? extends cmv> z;

   protected ddm(ddz<?> $$0, ht $$1, dgb $$2, cnr<? extends cmv> $$3) {
      super($$0, $$1, $$2);
      this.z = cnp.b($$3);
   }

   public static Map<cke, Integer> f() {
      Map<cke, Integer> $$0 = Maps.newLinkedHashMap();
      a($$0, ckm.pM, 20000);
      a($$0, cuc.iB, 16000);
      a($$0, ckm.rr, 2400);
      a($$0, ckm.nI, 1600);
      a($$0, ckm.nJ, 1600);
      a($$0, ara.r, 300);
      a($$0, ara.C, 300);
      a($$0, ara.b, 300);
      a($$0, cuc.w, 300);
      a($$0, ara.i, 300);
      a($$0, cuc.hU, 300);
      a($$0, ara.j, 150);
      a($$0, cuc.jC, 150);
      a($$0, ara.n, 300);
      a($$0, ara.m, 300);
      a($$0, ara.k, 300);
      a($$0, ara.l, 300);
      a($$0, cuc.aY, 300);
      a($$0, cuc.cl, 300);
      a($$0, cuc.cm, 300);
      a($$0, cuc.oa, 300);
      a($$0, cuc.dT, 300);
      a($$0, cuc.cv, 300);
      a($$0, cuc.gV, 300);
      a($$0, cuc.cA, 300);
      a($$0, cuc.gZ, 300);
      a($$0, ara.E, 300);
      a($$0, ckm.nG, 300);
      a($$0, ckm.qh, 300);
      a($$0, cuc.cO, 300);
      a($$0, ara.ap, 200);
      a($$0, ara.aE, 800);
      a($$0, ckm.nY, 200);
      a($$0, ckm.nX, 200);
      a($$0, ckm.ob, 200);
      a($$0, ckm.oa, 200);
      a($$0, ckm.nZ, 200);
      a($$0, ara.h, 200);
      a($$0, ara.am, 1200);
      a($$0, ara.a, 100);
      a($$0, ara.d, 100);
      a($$0, ckm.oB, 100);
      a($$0, ara.p, 100);
      a($$0, ckm.oC, 100);
      a($$0, ara.g, 67);
      a($$0, cuc.me, 4001);
      a($$0, ckm.uZ, 300);
      a($$0, cuc.mZ, 50);
      a($$0, cuc.bv, 100);
      a($$0, cuc.nS, 50);
      a($$0, cuc.nT, 300);
      a($$0, cuc.nU, 300);
      a($$0, cuc.nX, 300);
      a($$0, cuc.nY, 300);
      a($$0, cuc.ob, 300);
      a($$0, cuc.pc, 300);
      a($$0, cuc.rx, 100);
      a($$0, cuc.ry, 100);
      a($$0, cuc.ac, 300);
      return $$0;
   }

   private static boolean b(cke $$0) {
      return $$0.j().a(ara.ag);
   }

   private static void a(Map<cke, Integer> $$0, arh<cke> $$1, int $$2) {
      for (ib<cke> $$3 : jy.i.c($$1)) {
         if (!b($$3.a())) {
            $$0.put($$3.a(), $$2);
         }
      }
   }

   private static void a(Map<cke, Integer> $$0, cqy $$1, int $$2) {
      cke $$3 = $$1.k();
      if (b($$3)) {
         if (aa.aT) {
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

   private boolean i() {
      return this.u > 0;
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      this.m = il.a(this.b(), ckj.b);
      bhv.b($$0, this.m);
      this.u = $$0.g("BurnTime");
      this.w = $$0.g("CookTime");
      this.x = $$0.g("CookTimeTotal");
      this.v = this.a(this.m.get(1));
      rt $$1 = $$0.p("RecipesUsed");

      for (String $$2 : $$1.e()) {
         this.y.put(new afw($$2), $$1.h($$2));
      }
   }

   @Override
   protected void b(rt $$0) {
      super.b($$0);
      $$0.a("BurnTime", (short)this.u);
      $$0.a("CookTime", (short)this.w);
      $$0.a("CookTimeTotal", (short)this.x);
      bhv.a($$0, this.m);
      rt $$1 = new rt();
      this.y.forEach(($$1x, $$2) -> $$1.a($$1x.toString(), $$2));
      $$0.a("RecipesUsed", $$1);
   }

   public static void a(cqz $$0, ht $$1, dgb $$2, ddm $$3) {
      boolean $$4 = $$3.i();
      boolean $$5 = false;
      if ($$3.i()) {
         $$3.u--;
      }

      ckj $$6 = $$3.m.get(1);
      boolean $$7 = !$$3.m.get(0).b();
      boolean $$8 = !$$6.b();
      if ($$3.i() || $$8 && $$7) {
         cno<?> $$9;
         if ($$7) {
            $$9 = $$3.z.a($$3, $$0).orElse(null);
         } else {
            $$9 = null;
         }

         int $$11 = $$3.aj_();
         if (!$$3.i() && a($$0.H_(), $$9, $$3.m, $$11)) {
            $$3.u = $$3.a($$6);
            $$3.v = $$3.u;
            if ($$3.i()) {
               $$5 = true;
               if ($$8) {
                  cke $$12 = $$6.d();
                  $$6.h(1);
                  if ($$6.b()) {
                     cke $$13 = $$12.s();
                     $$3.m.set(1, $$13 == null ? ckj.b : new ckj($$13));
                  }
               }
            }
         }

         if ($$3.i() && a($$0.H_(), $$9, $$3.m, $$11)) {
            $$3.w++;
            if ($$3.w == $$3.x) {
               $$3.w = 0;
               $$3.x = a($$0, $$3);
               if (b($$0.H_(), $$9, $$3.m, $$11)) {
                  $$3.a($$9);
               }

               $$5 = true;
            }
         } else {
            $$3.w = 0;
         }
      } else if (!$$3.i() && $$3.w > 0) {
         $$3.w = asy.a($$3.w - 2, 0, $$3.x);
      }

      if ($$4 != $$3.i()) {
         $$5 = true;
         $$2 = $$2.a(csu.b, Boolean.valueOf($$3.i()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(ip $$0, @Nullable cno<?> $$1, il<ckj> $$2, int $$3) {
      if (!$$2.get(0).b() && $$1 != null) {
         ckj $$4 = $$1.b().a($$0);
         if ($$4.b()) {
            return false;
         } else {
            ckj $$5 = $$2.get(2);
            if ($$5.b()) {
               return true;
            } else if (!ckj.b($$5, $$4)) {
               return false;
            } else {
               return $$5.L() < $$3 && $$5.L() < $$5.g() ? true : $$5.L() < $$4.g();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(ip $$0, @Nullable cno<?> $$1, il<ckj> $$2, int $$3) {
      if ($$1 != null && a($$0, $$1, $$2, $$3)) {
         ckj $$4 = $$2.get(0);
         ckj $$5 = $$1.b().a($$0);
         ckj $$6 = $$2.get(2);
         if ($$6.b()) {
            $$2.set(2, $$5.p());
         } else if ($$6.a($$5.d())) {
            $$6.g(1);
         }

         if ($$4.a(cuc.aP.k()) && !$$2.get(1).b() && $$2.get(1).a(ckm.pK)) {
            $$2.set(1, new ckj(ckm.pL));
         }

         $$4.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int a(ckj $$0) {
      if ($$0.b()) {
         return 0;
      } else {
         cke $$1 = $$0.d();
         return f().getOrDefault($$1, 0);
      }
   }

   private static int a(cqz $$0, ddm $$1) {
      return $$1.z.a($$1, $$0).map($$0x -> ((cmv)$$0x.b()).d()).orElse(200);
   }

   public static boolean b(ckj $$0) {
      return f().containsKey($$0.d());
   }

   @Override
   public int[] a(hx $$0) {
      if ($$0 == hx.a) {
         return s;
      } else {
         return $$0 == hx.b ? r : t;
      }
   }

   @Override
   public boolean a(int $$0, ckj $$1, @Nullable hx $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, ckj $$1, hx $$2) {
      return $$2 == hx.a && $$0 == 1 ? $$1.a(ckm.pL) || $$1.a(ckm.pK) : true;
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   public boolean ai_() {
      for (ckj $$0 : this.m) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ckj a(int $$0) {
      return this.m.get($$0);
   }

   @Override
   public ckj a(int $$0, int $$1) {
      return bhv.a(this.m, $$0, $$1);
   }

   @Override
   public ckj b(int $$0) {
      return bhv.a(this.m, $$0);
   }

   @Override
   public void a(int $$0, ckj $$1) {
      ckj $$2 = this.m.get($$0);
      boolean $$3 = !$$1.b() && ckj.c($$2, $$1);
      this.m.set($$0, $$1);
      if ($$1.L() > this.aj_()) {
         $$1.f(this.aj_());
      }

      if ($$0 == 0 && !$$3) {
         this.x = a(this.o, this);
         this.w = 0;
         this.e();
      }
   }

   @Override
   public boolean a(ccx $$0) {
      return bhu.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, ckj $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         ckj $$2 = this.m.get(1);
         return b($$1) || $$1.a(ckm.pK) && !$$2.a(ckm.pK);
      }
   }

   @Override
   public void a() {
      this.m.clear();
   }

   @Override
   public void a(@Nullable cno<?> $$0) {
      if ($$0 != null) {
         afw $$1 = $$0.a();
         this.y.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public cno<?> d() {
      return null;
   }

   @Override
   public void a(ccx $$0, List<ckj> $$1) {
   }

   public void a(alr $$0) {
      List<cno<?>> $$1 = this.a($$0.x(), $$0.dj());
      $$0.a($$1);

      for (cno<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.m);
         }
      }

      this.y.clear();
   }

   public List<cno<?>> a(alq $$0, eif $$1) {
      List<cno<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.y.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<afw> $$3 = (Entry<afw>)var4.next();
         $$0.q().a((afw)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((cno<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((cmv)$$4.b()).b());
         });
      }

      return $$2;
   }

   private static void a(alq $$0, eif $$1, int $$2, float $$3) {
      int $$4 = asy.d((float)$$2 * $$3);
      float $$5 = asy.h((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      bjz.a($$0, $$1, $$4);
   }

   @Override
   public void a(cdb $$0) {
      for (ckj $$1 : this.m) {
         $$0.b($$1);
      }
   }
}

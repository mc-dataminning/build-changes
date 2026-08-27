import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class dcb extends dcg implements bgz, cfq, cfz {
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
   protected hn<ciy> m = hn.a(3, ciy.b);
   int u;
   int v;
   int w;
   int x;
   protected final ceo n = new ceo() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dcb.this.u;
            case 1:
               return dcb.this.v;
            case 2:
               return dcb.this.w;
            case 3:
               return dcb.this.x;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dcb.this.u = $$1;
               break;
            case 1:
               dcb.this.v = $$1;
               break;
            case 2:
               dcb.this.w = $$1;
               break;
            case 3:
               dcb.this.x = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Object2IntOpenHashMap<aer> y = new Object2IntOpenHashMap();
   private final cmc.a<bgj, ? extends clk> z;

   protected dcb(dco<?> $$0, gu $$1, dfa $$2, cme<? extends clk> $$3) {
      super($$0, $$1, $$2);
      this.z = cmc.b($$3);
   }

   public static Map<cit, Integer> f() {
      Map<cit, Integer> $$0 = Maps.newLinkedHashMap();
      a($$0, cjb.pM, 20000);
      a($$0, csn.iB, 16000);
      a($$0, cjb.rr, 2400);
      a($$0, cjb.nI, 1600);
      a($$0, cjb.nJ, 1600);
      a($$0, apt.r, 300);
      a($$0, apt.C, 300);
      a($$0, apt.b, 300);
      a($$0, csn.w, 300);
      a($$0, apt.i, 300);
      a($$0, csn.hU, 300);
      a($$0, apt.j, 150);
      a($$0, csn.jC, 150);
      a($$0, apt.n, 300);
      a($$0, apt.m, 300);
      a($$0, apt.k, 300);
      a($$0, apt.l, 300);
      a($$0, csn.aY, 300);
      a($$0, csn.cl, 300);
      a($$0, csn.cm, 300);
      a($$0, csn.oa, 300);
      a($$0, csn.dT, 300);
      a($$0, csn.cv, 300);
      a($$0, csn.gV, 300);
      a($$0, csn.cA, 300);
      a($$0, csn.gZ, 300);
      a($$0, apt.E, 300);
      a($$0, cjb.nG, 300);
      a($$0, cjb.qh, 300);
      a($$0, csn.cO, 300);
      a($$0, apt.ap, 200);
      a($$0, apt.aE, 800);
      a($$0, cjb.nY, 200);
      a($$0, cjb.nX, 200);
      a($$0, cjb.ob, 200);
      a($$0, cjb.oa, 200);
      a($$0, cjb.nZ, 200);
      a($$0, apt.h, 200);
      a($$0, apt.am, 1200);
      a($$0, apt.a, 100);
      a($$0, apt.d, 100);
      a($$0, cjb.oB, 100);
      a($$0, apt.p, 100);
      a($$0, cjb.oC, 100);
      a($$0, apt.g, 67);
      a($$0, csn.me, 4001);
      a($$0, cjb.uZ, 300);
      a($$0, csn.mZ, 50);
      a($$0, csn.bv, 100);
      a($$0, csn.nS, 50);
      a($$0, csn.nT, 300);
      a($$0, csn.nU, 300);
      a($$0, csn.nX, 300);
      a($$0, csn.nY, 300);
      a($$0, csn.ob, 300);
      a($$0, csn.pc, 300);
      a($$0, csn.rx, 100);
      a($$0, csn.ry, 100);
      a($$0, csn.ac, 300);
      return $$0;
   }

   private static boolean b(cit $$0) {
      return $$0.j().a(apt.ag);
   }

   private static void a(Map<cit, Integer> $$0, aqa<cit> $$1, int $$2) {
      for (he<cit> $$3 : jb.i.c($$1)) {
         if (!b($$3.a())) {
            $$0.put($$3.a(), $$2);
         }
      }
   }

   private static void a(Map<cit, Integer> $$0, cpl $$1, int $$2) {
      cit $$3 = $$1.k();
      if (b($$3)) {
         if (aa.aS) {
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
   public void a(qr $$0) {
      super.a($$0);
      this.m = hn.a(this.b(), ciy.b);
      bgk.b($$0, this.m);
      this.u = $$0.g("BurnTime");
      this.w = $$0.g("CookTime");
      this.x = $$0.g("CookTimeTotal");
      this.v = this.a(this.m.get(1));
      qr $$1 = $$0.p("RecipesUsed");

      for (String $$2 : $$1.e()) {
         this.y.put(new aer($$2), $$1.h($$2));
      }
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      $$0.a("BurnTime", (short)this.u);
      $$0.a("CookTime", (short)this.w);
      $$0.a("CookTimeTotal", (short)this.x);
      bgk.a($$0, this.m);
      qr $$1 = new qr();
      this.y.forEach(($$1x, $$2) -> $$1.a($$1x.toString(), $$2));
      $$0.a("RecipesUsed", $$1);
   }

   public static void a(cpm $$0, gu $$1, dfa $$2, dcb $$3) {
      boolean $$4 = $$3.i();
      boolean $$5 = false;
      if ($$3.i()) {
         $$3.u--;
      }

      ciy $$6 = $$3.m.get(1);
      boolean $$7 = !$$3.m.get(0).b();
      boolean $$8 = !$$6.b();
      if ($$3.i() || $$8 && $$7) {
         cmb<?> $$9;
         if ($$7) {
            $$9 = (cmb<?>)$$3.z.a($$3, $$0).orElse(null);
         } else {
            $$9 = null;
         }

         int $$11 = $$3.ac_();
         if (!$$3.i() && a($$0.B_(), $$9, $$3.m, $$11)) {
            $$3.u = $$3.a($$6);
            $$3.v = $$3.u;
            if ($$3.i()) {
               $$5 = true;
               if ($$8) {
                  cit $$12 = $$6.d();
                  $$6.h(1);
                  if ($$6.b()) {
                     cit $$13 = $$12.s();
                     $$3.m.set(1, $$13 == null ? ciy.b : new ciy($$13));
                  }
               }
            }
         }

         if ($$3.i() && a($$0.B_(), $$9, $$3.m, $$11)) {
            $$3.w++;
            if ($$3.w == $$3.x) {
               $$3.w = 0;
               $$3.x = a($$0, $$3);
               if (b($$0.B_(), $$9, $$3.m, $$11)) {
                  $$3.a($$9);
               }

               $$5 = true;
            }
         } else {
            $$3.w = 0;
         }
      } else if (!$$3.i() && $$3.w > 0) {
         $$3.w = arp.a($$3.w - 2, 0, $$3.x);
      }

      if ($$4 != $$3.i()) {
         $$5 = true;
         $$2 = $$2.a(crh.b, Boolean.valueOf($$3.i()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(hs $$0, @Nullable cmb<?> $$1, hn<ciy> $$2, int $$3) {
      if (!$$2.get(0).b() && $$1 != null) {
         ciy $$4 = $$1.a($$0);
         if ($$4.b()) {
            return false;
         } else {
            ciy $$5 = $$2.get(2);
            if ($$5.b()) {
               return true;
            } else if (!ciy.b($$5, $$4)) {
               return false;
            } else {
               return $$5.L() < $$3 && $$5.L() < $$5.g() ? true : $$5.L() < $$4.g();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(hs $$0, @Nullable cmb<?> $$1, hn<ciy> $$2, int $$3) {
      if ($$1 != null && a($$0, $$1, $$2, $$3)) {
         ciy $$4 = $$2.get(0);
         ciy $$5 = $$1.a($$0);
         ciy $$6 = $$2.get(2);
         if ($$6.b()) {
            $$2.set(2, $$5.p());
         } else if ($$6.a($$5.d())) {
            $$6.g(1);
         }

         if ($$4.a(csn.aP.k()) && !$$2.get(1).b() && $$2.get(1).a(cjb.pK)) {
            $$2.set(1, new ciy(cjb.pL));
         }

         $$4.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int a(ciy $$0) {
      if ($$0.b()) {
         return 0;
      } else {
         cit $$1 = $$0.d();
         return f().getOrDefault($$1, 0);
      }
   }

   private static int a(cpm $$0, dcb $$1) {
      return $$1.z.a($$1, $$0).map(clk::d).orElse(200);
   }

   public static boolean b(ciy $$0) {
      return f().containsKey($$0.d());
   }

   @Override
   public int[] a(ha $$0) {
      if ($$0 == ha.a) {
         return s;
      } else {
         return $$0 == ha.b ? r : t;
      }
   }

   @Override
   public boolean a(int $$0, ciy $$1, @Nullable ha $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, ciy $$1, ha $$2) {
      return $$2 == ha.a && $$0 == 1 ? $$1.a(cjb.pL) || $$1.a(cjb.pK) : true;
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   public boolean ab_() {
      for (ciy $$0 : this.m) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ciy a(int $$0) {
      return this.m.get($$0);
   }

   @Override
   public ciy a(int $$0, int $$1) {
      return bgk.a(this.m, $$0, $$1);
   }

   @Override
   public ciy b(int $$0) {
      return bgk.a(this.m, $$0);
   }

   @Override
   public void a(int $$0, ciy $$1) {
      ciy $$2 = this.m.get($$0);
      boolean $$3 = !$$1.b() && ciy.c($$2, $$1);
      this.m.set($$0, $$1);
      if ($$1.L() > this.ac_()) {
         $$1.f(this.ac_());
      }

      if ($$0 == 0 && !$$3) {
         this.x = a(this.o, this);
         this.w = 0;
         this.e();
      }
   }

   @Override
   public boolean a(cbn $$0) {
      return bgj.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, ciy $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         ciy $$2 = this.m.get(1);
         return b($$1) || $$1.a(cjb.pK) && !$$2.a(cjb.pK);
      }
   }

   @Override
   public void a() {
      this.m.clear();
   }

   @Override
   public void a(@Nullable cmb<?> $$0) {
      if ($$0 != null) {
         aer $$1 = $$0.e();
         this.y.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public cmb<?> d() {
      return null;
   }

   @Override
   public void a(cbn $$0, List<ciy> $$1) {
   }

   public void a(akl $$0) {
      List<cmb<?>> $$1 = this.a($$0.x(), $$0.di());
      $$0.a($$1);

      for (cmb<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.m);
         }
      }

      this.y.clear();
   }

   public List<cmb<?>> a(akk $$0, ehe $$1) {
      List<cmb<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.y.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<aer> $$3 = (Entry<aer>)var4.next();
         $$0.q().a((aer)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((cmb<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((clk)$$4).b());
         });
      }

      return $$2;
   }

   private static void a(akk $$0, ehe $$1, int $$2, float $$3) {
      int $$4 = arp.d((float)$$2 * $$3);
      float $$5 = arp.h((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      bio.a($$0, $$1, $$4);
   }

   @Override
   public void a(cbr $$0) {
      for (ciy $$1 : this.m) {
         $$0.b($$1);
      }
   }
}

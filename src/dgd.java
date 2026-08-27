import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class dgd extends dgi implements bkg, cjj, cjs {
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
   protected iq<cmr> m = iq.a(3, cmr.f);
   int u;
   int v;
   int w;
   int x;
   protected final cie n = new cie() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dgd.this.u;
            case 1:
               return dgd.this.v;
            case 2:
               return dgd.this.w;
            case 3:
               return dgd.this.x;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dgd.this.u = $$1;
               break;
            case 1:
               dgd.this.v = $$1;
               break;
            case 2:
               dgd.this.w = $$1;
               break;
            case 3:
               dgd.this.x = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Object2IntOpenHashMap<ahd> y = new Object2IntOpenHashMap();
   private final cpy.a<bjo, ? extends cpe> z;

   protected dgd(dgq<?> $$0, hx $$1, dja $$2, cqa<? extends cpe> $$3) {
      super($$0, $$1, $$2);
      this.z = cpy.b($$3);
   }

   public static Map<cmm, Integer> f() {
      Map<cmm, Integer> $$0 = Maps.newLinkedHashMap();
      a($$0, cmu.qx, 20000);
      a($$0, cwl.iB, 16000);
      a($$0, cmu.sd, 2400);
      a($$0, cmu.ot, 1600);
      a($$0, cmu.ou, 1600);
      a($$0, asj.r, 300);
      a($$0, asj.C, 300);
      a($$0, asj.b, 300);
      a($$0, cwl.w, 300);
      a($$0, asj.i, 300);
      a($$0, cwl.hU, 300);
      a($$0, asj.j, 150);
      a($$0, cwl.jC, 150);
      a($$0, asj.n, 300);
      a($$0, asj.m, 300);
      a($$0, asj.k, 300);
      a($$0, asj.l, 300);
      a($$0, cwl.aY, 300);
      a($$0, cwl.cl, 300);
      a($$0, cwl.cm, 300);
      a($$0, cwl.oa, 300);
      a($$0, cwl.dT, 300);
      a($$0, cwl.cv, 300);
      a($$0, cwl.gV, 300);
      a($$0, cwl.cA, 300);
      a($$0, cwl.gZ, 300);
      a($$0, asj.E, 300);
      a($$0, cmu.or, 300);
      a($$0, cmu.qS, 300);
      a($$0, cwl.cO, 300);
      a($$0, asj.ap, 200);
      a($$0, asj.aE, 800);
      a($$0, cmu.oJ, 200);
      a($$0, cmu.oI, 200);
      a($$0, cmu.oM, 200);
      a($$0, cmu.oL, 200);
      a($$0, cmu.oK, 200);
      a($$0, asj.h, 200);
      a($$0, asj.am, 1200);
      a($$0, asj.a, 100);
      a($$0, asj.d, 100);
      a($$0, cmu.pm, 100);
      a($$0, asj.p, 100);
      a($$0, cmu.pn, 100);
      a($$0, asj.g, 67);
      a($$0, cwl.me, 4001);
      a($$0, cmu.vM, 300);
      a($$0, cwl.mZ, 50);
      a($$0, cwl.bv, 100);
      a($$0, cwl.nS, 50);
      a($$0, cwl.nT, 300);
      a($$0, cwl.nU, 300);
      a($$0, cwl.nX, 300);
      a($$0, cwl.nY, 300);
      a($$0, cwl.ob, 300);
      a($$0, cwl.pc, 300);
      a($$0, cwl.sy, 100);
      a($$0, cwl.sz, 100);
      a($$0, cwl.ac, 300);
      return $$0;
   }

   private static boolean b(cmm $$0) {
      return $$0.j().a(asj.ag);
   }

   private static void a(Map<cmm, Integer> $$0, asq<cmm> $$1, int $$2) {
      for (ih<cmm> $$3 : kd.h.c($$1)) {
         if (!b($$3.a())) {
            $$0.put($$3.a(), $$2);
         }
      }
   }

   private static void a(Map<cmm, Integer> $$0, cth $$1, int $$2) {
      cmm $$3 = $$1.k();
      if (b($$3)) {
         if (aa.aW) {
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

   private boolean g() {
      return this.u > 0;
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      this.m = iq.a(this.b(), cmr.f);
      bjp.b($$0, this.m);
      this.u = $$0.g("BurnTime");
      this.w = $$0.g("CookTime");
      this.x = $$0.g("CookTimeTotal");
      this.v = this.a(this.m.get(1));
      sl $$1 = $$0.p("RecipesUsed");

      for (String $$2 : $$1.e()) {
         this.y.put(new ahd($$2), $$1.h($$2));
      }
   }

   @Override
   protected void b(sl $$0) {
      super.b($$0);
      $$0.a("BurnTime", (short)this.u);
      $$0.a("CookTime", (short)this.w);
      $$0.a("CookTimeTotal", (short)this.x);
      bjp.a($$0, this.m);
      sl $$1 = new sl();
      this.y.forEach(($$1x, $$2) -> $$1.a($$1x.toString(), $$2));
      $$0.a("RecipesUsed", $$1);
   }

   public static void a(cti $$0, hx $$1, dja $$2, dgd $$3) {
      boolean $$4 = $$3.g();
      boolean $$5 = false;
      if ($$3.g()) {
         $$3.u--;
      }

      cmr $$6 = $$3.m.get(1);
      boolean $$7 = !$$3.m.get(0).b();
      boolean $$8 = !$$6.b();
      if ($$3.g() || $$8 && $$7) {
         cpx<?> $$9;
         if ($$7) {
            $$9 = $$3.z.a($$3, $$0).orElse(null);
         } else {
            $$9 = null;
         }

         int $$11 = $$3.ak_();
         if (!$$3.g() && a($$0.I_(), $$9, $$3.m, $$11)) {
            $$3.u = $$3.a($$6);
            $$3.v = $$3.u;
            if ($$3.g()) {
               $$5 = true;
               if ($$8) {
                  cmm $$12 = $$6.d();
                  $$6.h(1);
                  if ($$6.b()) {
                     cmm $$13 = $$12.s();
                     $$3.m.set(1, $$13 == null ? cmr.f : new cmr($$13));
                  }
               }
            }
         }

         if ($$3.g() && a($$0.I_(), $$9, $$3.m, $$11)) {
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
      } else if (!$$3.g() && $$3.w > 0) {
         $$3.w = aui.a($$3.w - 2, 0, $$3.x);
      }

      if ($$4 != $$3.g()) {
         $$5 = true;
         $$2 = $$2.a(cve.b, Boolean.valueOf($$3.g()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(iu $$0, @Nullable cpx<?> $$1, iq<cmr> $$2, int $$3) {
      if (!$$2.get(0).b() && $$1 != null) {
         cmr $$4 = $$1.b().a($$0);
         if ($$4.b()) {
            return false;
         } else {
            cmr $$5 = $$2.get(2);
            if ($$5.b()) {
               return true;
            } else if (!cmr.b($$5, $$4)) {
               return false;
            } else {
               return $$5.L() < $$3 && $$5.L() < $$5.g() ? true : $$5.L() < $$4.g();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(iu $$0, @Nullable cpx<?> $$1, iq<cmr> $$2, int $$3) {
      if ($$1 != null && a($$0, $$1, $$2, $$3)) {
         cmr $$4 = $$2.get(0);
         cmr $$5 = $$1.b().a($$0);
         cmr $$6 = $$2.get(2);
         if ($$6.b()) {
            $$2.set(2, $$5.p());
         } else if ($$6.a($$5.d())) {
            $$6.g(1);
         }

         if ($$4.a(cwl.aP.k()) && !$$2.get(1).b() && $$2.get(1).a(cmu.qv)) {
            $$2.set(1, new cmr(cmu.qw));
         }

         $$4.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int a(cmr $$0) {
      if ($$0.b()) {
         return 0;
      } else {
         cmm $$1 = $$0.d();
         return f().getOrDefault($$1, 0);
      }
   }

   private static int a(cti $$0, dgd $$1) {
      return $$1.z.a($$1, $$0).map($$0x -> ((cpe)$$0x.b()).d()).orElse(200);
   }

   public static boolean b(cmr $$0) {
      return f().containsKey($$0.d());
   }

   @Override
   public int[] a(ic $$0) {
      if ($$0 == ic.a) {
         return s;
      } else {
         return $$0 == ic.b ? r : t;
      }
   }

   @Override
   public boolean a(int $$0, cmr $$1, @Nullable ic $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cmr $$1, ic $$2) {
      return $$2 == ic.a && $$0 == 1 ? $$1.a(cmu.qw) || $$1.a(cmu.qv) : true;
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   public boolean ai_() {
      for (cmr $$0 : this.m) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cmr a(int $$0) {
      return this.m.get($$0);
   }

   @Override
   public cmr a(int $$0, int $$1) {
      return bjp.a(this.m, $$0, $$1);
   }

   @Override
   public cmr b(int $$0) {
      return bjp.a(this.m, $$0);
   }

   @Override
   public void a(int $$0, cmr $$1) {
      cmr $$2 = this.m.get($$0);
      boolean $$3 = !$$1.b() && cmr.c($$2, $$1);
      this.m.set($$0, $$1);
      if ($$1.L() > this.ak_()) {
         $$1.f(this.ak_());
      }

      if ($$0 == 0 && !$$3) {
         this.x = a(this.o, this);
         this.w = 0;
         this.e();
      }
   }

   @Override
   public boolean a(cfb $$0) {
      return bjo.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cmr $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         cmr $$2 = this.m.get(1);
         return b($$1) || $$1.a(cmu.qv) && !$$2.a(cmu.qv);
      }
   }

   @Override
   public void a() {
      this.m.clear();
   }

   @Override
   public void a(@Nullable cpx<?> $$0) {
      if ($$0 != null) {
         ahd $$1 = $$0.a();
         this.y.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public cpx<?> d() {
      return null;
   }

   @Override
   public void a(cfb $$0, List<cmr> $$1) {
   }

   public void a(ana $$0) {
      List<cpx<?>> $$1 = this.a($$0.z(), $$0.dk());
      $$0.a($$1);

      for (cpx<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.m);
         }
      }

      this.y.clear();
   }

   public List<cpx<?>> a(amz $$0, elm $$1) {
      List<cpx<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.y.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<ahd> $$3 = (Entry<ahd>)var4.next();
         $$0.r().a((ahd)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((cpx<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((cpe)$$4.b()).b());
         });
      }

      return $$2;
   }

   private static void a(amz $$0, elm $$1, int $$2, float $$3) {
      int $$4 = aui.d((float)$$2 * $$3);
      float $$5 = aui.h((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      blv.a($$0, $$1, $$4);
   }

   @Override
   public void a(cff $$0) {
      for (cmr $$1 : this.m) {
         $$0.b($$1);
      }
   }
}

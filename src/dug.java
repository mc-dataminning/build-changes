import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2IntMap.Entry;
import java.util.List;
import javax.annotation.Nullable;

public abstract class dug extends dum implements bti, cun, cuy {
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
   protected ka<cxh> l = ka.a(3, cxh.k);
   int t;
   int u;
   int v;
   int w;
   protected final cti m = new cti() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dug.this.t;
            case 1:
               return dug.this.u;
            case 2:
               return dug.this.v;
            case 3:
               return dug.this.w;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dug.this.t = $$1;
               break;
            case 1:
               dug.this.u = $$1;
               break;
            case 2:
               dug.this.v = $$1;
               break;
            case 3:
               dug.this.w = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Reference2IntOpenHashMap<akt<dbv<?>>> x = new Reference2IntOpenHashMap();
   private final dcc.a<dco, ? extends dbb> y;

   protected dug(duu<?> $$0, ji $$1, dxq $$2, dcg<? extends dbb> $$3) {
      super($$0, $$1, $$2);
      this.y = dcc.a($$3);
   }

   private boolean k() {
      return this.t > 0;
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.l = ka.a(this.b(), cxh.k);
      bss.b($$0, this.l, $$1);
      this.v = $$0.g("cooking_time_spent");
      this.w = $$0.g("cooking_total_time");
      this.t = $$0.g("lit_time_remaining");
      this.u = $$0.g("lit_total_time");
      tq $$2 = $$0.p("RecipesUsed");

      for (String $$3 : $$2.e()) {
         this.x.put(akt.a(mc.bm, aku.a($$3)), $$2.h($$3));
      }
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      $$0.a("cooking_time_spent", (short)this.v);
      $$0.a("cooking_total_time", (short)this.w);
      $$0.a("lit_time_remaining", (short)this.t);
      $$0.a("lit_total_time", (short)this.u);
      bss.a($$0, this.l, $$1);
      tq $$2 = new tq();
      this.x.forEach(($$1x, $$2x) -> $$2.a($$1x.a().toString(), $$2x));
      $$0.a("RecipesUsed", $$2);
   }

   public static void a(ard $$0, ji $$1, dxq $$2, dug $$3) {
      boolean $$4 = $$3.k();
      boolean $$5 = false;
      if ($$3.k()) {
         $$3.t--;
      }

      cxh $$6 = $$3.l.get(1);
      cxh $$7 = $$3.l.get(0);
      boolean $$8 = !$$7.f();
      boolean $$9 = !$$6.f();
      if ($$3.k() || $$9 && $$8) {
         dco $$10 = new dco($$7);
         dca<? extends dbb> $$11;
         if ($$8) {
            $$11 = $$3.y.a($$10, $$0).orElse(null);
         } else {
            $$11 = null;
         }

         int $$13 = $$3.an_();
         if (!$$3.k() && a($$0.F_(), $$11, $$10, $$3.l, $$13)) {
            $$3.t = $$3.a($$0.M(), $$6);
            $$3.u = $$3.t;
            if ($$3.k()) {
               $$5 = true;
               if ($$9) {
                  cxd $$14 = $$6.h();
                  $$6.h(1);
                  if ($$6.f()) {
                     $$3.l.set(1, $$14.j());
                  }
               }
            }
         }

         if ($$3.k() && a($$0.F_(), $$11, $$10, $$3.l, $$13)) {
            $$3.v++;
            if ($$3.v == $$3.w) {
               $$3.v = 0;
               $$3.w = a($$0, $$3);
               if (b($$0.F_(), $$11, $$10, $$3.l, $$13)) {
                  $$3.a($$11);
               }

               $$5 = true;
            }
         } else {
            $$3.v = 0;
         }
      } else if (!$$3.k() && $$3.v > 0) {
         $$3.v = ayz.a($$3.v - 2, 0, $$3.w);
      }

      if ($$4 != $$3.k()) {
         $$5 = true;
         $$2 = $$2.b(diz.b, Boolean.valueOf($$3.k()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(kf $$0, @Nullable dca<? extends dbb> $$1, dco $$2, ka<cxh> $$3, int $$4) {
      if (!$$3.get(0).f() && $$1 != null) {
         cxh $$5 = $$1.b().a($$2, $$0);
         if ($$5.f()) {
            return false;
         } else {
            cxh $$6 = $$3.get(2);
            if ($$6.f()) {
               return true;
            } else if (!cxh.c($$6, $$5)) {
               return false;
            } else {
               return $$6.M() < $$4 && $$6.M() < $$6.k() ? true : $$6.M() < $$5.k();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(kf $$0, @Nullable dca<? extends dbb> $$1, dco $$2, ka<cxh> $$3, int $$4) {
      if ($$1 != null && a($$0, $$1, $$2, $$3, $$4)) {
         cxh $$5 = $$3.get(0);
         cxh $$6 = $$1.b().a($$2, $$0);
         cxh $$7 = $$3.get(2);
         if ($$7.f()) {
            $$3.set(2, $$6.v());
         } else if (cxh.c($$7, $$6)) {
            $$7.g(1);
         }

         if ($$5.a(dkg.aW.i()) && !$$3.get(1).f() && $$3.get(1).a(cxl.rh)) {
            $$3.set(1, new cxh(cxl.ri));
         }

         $$5.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int a(dvq $$0, cxh $$1) {
      return $$0.b($$1);
   }

   private static int a(ard $$0, dug $$1) {
      dco $$2 = new dco($$1.a(0));
      return $$1.y.a($$2, $$0).map($$0x -> ((dbb)$$0x.b()).d()).orElse(200);
   }

   @Override
   public int[] a(jn $$0) {
      if ($$0 == jn.a) {
         return r;
      } else {
         return $$0 == jn.b ? q : s;
      }
   }

   @Override
   public boolean a(int $$0, cxh $$1, @Nullable jn $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cxh $$1, jn $$2) {
      return $$2 == jn.a && $$0 == 1 ? $$1.a(cxl.ri) || $$1.a(cxl.rh) : true;
   }

   @Override
   public int b() {
      return this.l.size();
   }

   @Override
   protected ka<cxh> f() {
      return this.l;
   }

   @Override
   protected void a(ka<cxh> $$0) {
      this.l = $$0;
   }

   @Override
   public void a(int $$0, cxh $$1) {
      cxh $$2 = this.l.get($$0);
      boolean $$3 = !$$1.f() && cxh.c($$2, $$1);
      this.l.set($$0, $$1);
      $$1.f(this.e_($$1));
      if ($$0 == 0 && !$$3 && this.n instanceof ard $$4) {
         this.w = a($$4, this);
         this.v = 0;
         this.e();
      }
   }

   @Override
   public boolean b(int $$0, cxh $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         cxh $$2 = this.l.get(1);
         return this.n.M().a($$1) || $$1.a(cxl.rh) && !$$2.a(cxl.rh);
      }
   }

   @Override
   public void a(@Nullable dca<?> $$0) {
      if ($$0 != null) {
         akt<dbv<?>> $$1 = $$0.a();
         this.x.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public dca<?> d() {
      return null;
   }

   @Override
   public void a(cpr $$0, List<cxh> $$1) {
   }

   public void a(are $$0) {
      List<dca<?>> $$1 = this.a($$0.y(), $$0.ds());
      $$0.a($$1);

      for (dca<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.l);
         }
      }

      this.x.clear();
   }

   public List<dca<?>> a(ard $$0, fbx $$1) {
      List<dca<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.x.reference2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<akt<dbv<?>>> $$3 = (Entry<akt<dbv<?>>>)var4.next();
         $$0.t().b((akt<dbv<?>>)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((dca<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((dbb)$$4.b()).c());
         });
      }

      return $$2;
   }

   private static void a(ard $$0, fbx $$1, int $$2, float $$3) {
      int $$4 = ayz.d((float)$$2 * $$3);
      float $$5 = ayz.i((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      bvn.a($$0, $$1, $$4);
   }

   @Override
   public void fillStackedContents(cpw $$0) {
      for (cxh $$1 : this.l) {
         $$0.b($$1);
      }
   }

   @Override
   public void a(ji $$0, dxq $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if (this.n instanceof ard $$3) {
         this.a($$3, fbx.b($$0));
      }
   }
}

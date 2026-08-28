import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import javax.annotation.Nullable;

public abstract class dqs extends dqy implements bru, csh, css {
   protected static final int b = 0;
   protected static final int c = 1;
   protected static final int d = 2;
   public static final int e = 0;
   private static final int[] r = new int[]{0};
   private static final int[] s = new int[]{2, 1};
   private static final int[] t = new int[]{1};
   public static final int f = 1;
   public static final int g = 2;
   public static final int h = 3;
   public static final int i = 4;
   public static final int j = 200;
   public static final int k = 2;
   public static final int l = 0;
   protected jw<cvl> m = jw.a(3, cvl.k);
   int u;
   int v = 0;
   int w;
   int x;
   protected final crc n = new crc() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dqs.this.u;
            case 1:
               return dqs.this.v;
            case 2:
               return dqs.this.w;
            case 3:
               return dqs.this.x;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dqs.this.u = $$1;
               break;
            case 1:
               dqs.this.v = $$1;
               break;
            case 2:
               dqs.this.w = $$1;
               break;
            case 3:
               dqs.this.x = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Object2IntOpenHashMap<alb> y = new Object2IntOpenHashMap();
   private final czx.a<daj, ? extends cza> z;

   protected dqs(drg<?> $$0, je $$1, dua $$2, czz<? extends cza> $$3) {
      super($$0, $$1, $$2);
      this.z = czx.b($$3);
   }

   private boolean k() {
      return this.u > 0;
   }

   @Override
   protected void a(uf $$0, jp.a $$1) {
      super.a($$0, $$1);
      this.m = jw.a(this.b(), cvl.k);
      bre.b($$0, this.m, $$1);
      this.u = $$0.g("BurnTime");
      this.w = $$0.g("CookTime");
      this.x = $$0.g("CookTimeTotal");
      this.v = 0;
      uf $$2 = $$0.p("RecipesUsed");

      for (String $$3 : $$2.e()) {
         this.y.put(alb.a($$3), $$2.h($$3));
      }
   }

   @Override
   protected void b(uf $$0, jp.a $$1) {
      super.b($$0, $$1);
      $$0.a("BurnTime", (short)this.u);
      $$0.a("CookTime", (short)this.w);
      $$0.a("CookTimeTotal", (short)this.x);
      bre.a($$0, this.m, $$1);
      uf $$2 = new uf();
      this.y.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), $$2x));
      $$0.a("RecipesUsed", $$2);
   }

   public static void a(dds $$0, je $$1, dua $$2, dqs $$3) {
      boolean $$4 = $$3.k();
      boolean $$5 = false;
      if ($$3.k()) {
         $$3.u--;
      }

      cvl $$6 = $$3.m.get(1);
      cvl $$7 = $$3.m.get(0);
      boolean $$8 = !$$7.f();
      boolean $$9 = !$$6.f();
      if ($$3.v == 0) {
         $$3.v = $$3.a($$0.L(), $$6);
      }

      if ($$3.k() || $$9 && $$8) {
         czv<?> $$10;
         if ($$8) {
            $$10 = $$3.z.a(new daj($$7), $$0).orElse(null);
         } else {
            $$10 = null;
         }

         int $$12 = $$3.ak_();
         if (!$$3.k() && a($$0.F_(), $$10, $$3.m, $$12)) {
            $$3.u = $$3.a($$0.L(), $$6);
            $$3.v = $$3.u;
            if ($$3.k()) {
               $$5 = true;
               if ($$9) {
                  cvg $$13 = $$6.h();
                  $$6.h(1);
                  if ($$6.f()) {
                     cvg $$14 = $$13.u();
                     $$3.m.set(1, $$14 == null ? cvl.k : new cvl($$14));
                  }
               }
            }
         }

         if ($$3.k() && a($$0.F_(), $$10, $$3.m, $$12)) {
            $$3.w++;
            if ($$3.w == $$3.x) {
               $$3.w = 0;
               $$3.x = a($$0, $$3);
               if (b($$0.F_(), $$10, $$3.m, $$12)) {
                  $$3.a($$10);
               }

               $$5 = true;
            }
         } else {
            $$3.w = 0;
         }
      } else if (!$$3.k() && $$3.w > 0) {
         $$3.w = azc.a($$3.w - 2, 0, $$3.x);
      }

      if ($$4 != $$3.k()) {
         $$5 = true;
         $$2 = $$2.b(dfq.b, Boolean.valueOf($$3.k()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(kb $$0, @Nullable czv<?> $$1, jw<cvl> $$2, int $$3) {
      if (!$$2.get(0).f() && $$1 != null) {
         cvl $$4 = $$1.b().a($$0);
         if ($$4.f()) {
            return false;
         } else {
            cvl $$5 = $$2.get(2);
            if ($$5.f()) {
               return true;
            } else if (!cvl.c($$5, $$4)) {
               return false;
            } else {
               return $$5.J() < $$3 && $$5.J() < $$5.k() ? true : $$5.J() < $$4.k();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(kb $$0, @Nullable czv<?> $$1, jw<cvl> $$2, int $$3) {
      if ($$1 != null && a($$0, $$1, $$2, $$3)) {
         cvl $$4 = $$2.get(0);
         cvl $$5 = $$1.b().a($$0);
         cvl $$6 = $$2.get(2);
         if ($$6.f()) {
            $$2.set(2, $$5.u());
         } else if (cvl.c($$6, $$5)) {
            $$6.g(1);
         }

         if ($$4.a(dgx.aP.r()) && !$$2.get(1).f() && $$2.get(1).a(cvo.qz)) {
            $$2.set(1, new cvl(cvo.qA));
         }

         $$4.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int a(dsb $$0, cvl $$1) {
      return $$0.b($$1);
   }

   private static int a(dds $$0, dqs $$1) {
      daj $$2 = new daj($$1.a(0));
      return $$1.z.a($$2, $$0).map($$0x -> ((cza)$$0x.b()).d()).orElse(200);
   }

   @Override
   public int[] a(jj $$0) {
      if ($$0 == jj.a) {
         return s;
      } else {
         return $$0 == jj.b ? r : t;
      }
   }

   @Override
   public boolean a(int $$0, cvl $$1, @Nullable jj $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cvl $$1, jj $$2) {
      return $$2 == jj.a && $$0 == 1 ? $$1.a(cvo.qA) || $$1.a(cvo.qz) : true;
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   protected jw<cvl> f() {
      return this.m;
   }

   @Override
   protected void a(jw<cvl> $$0) {
      this.m = $$0;
   }

   @Override
   public void a(int $$0, cvl $$1) {
      cvl $$2 = this.m.get($$0);
      boolean $$3 = !$$1.f() && cvl.c($$2, $$1);
      this.m.set($$0, $$1);
      $$1.f(this.f_($$1));
      if ($$0 == 0 && !$$3) {
         this.x = a(this.o, this);
         this.w = 0;
         this.e();
      }
   }

   @Override
   public boolean b(int $$0, cvl $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         cvl $$2 = this.m.get(1);
         return this.o.L().a($$1) || $$1.a(cvo.qz) && !$$2.a(cvo.qz);
      }
   }

   @Override
   public void a(@Nullable czv<?> $$0) {
      if ($$0 != null) {
         alb $$1 = $$0.a();
         this.y.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public czv<?> d() {
      return null;
   }

   @Override
   public void a(cnp $$0, List<cvl> $$1) {
   }

   public void a(arh $$0) {
      List<czv<?>> $$1 = this.a($$0.B(), $$0.dq());
      $$0.a($$1);

      for (czv<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.m);
         }
      }

      this.y.clear();
   }

   public List<czv<?>> a(arg $$0, eye $$1) {
      List<czv<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.y.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<alb> $$3 = (Entry<alb>)var4.next();
         $$0.r().a((alb)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((czv<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((cza)$$4.b()).b());
         });
      }

      return $$2;
   }

   private static void a(arg $$0, eye $$1, int $$2, float $$3) {
      int $$4 = azc.d((float)$$2 * $$3);
      float $$5 = azc.h((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      btv.a($$0, $$1, $$4);
   }

   @Override
   public void fillStackedContents(cnu $$0) {
      for (cvl $$1 : this.m) {
         $$0.b($$1);
      }
   }
}

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2IntMap.Entry;
import java.util.List;
import javax.annotation.Nullable;

public abstract class dtl extends dtr implements bss, ctr, cuc {
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
   protected ka<cwn> m = ka.a(3, cwn.j);
   int u;
   int v = 0;
   int w;
   int x;
   protected final csm n = new csm() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dtl.this.u;
            case 1:
               return dtl.this.v;
            case 2:
               return dtl.this.w;
            case 3:
               return dtl.this.x;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dtl.this.u = $$1;
               break;
            case 1:
               dtl.this.v = $$1;
               break;
            case 2:
               dtl.this.w = $$1;
               break;
            case 3:
               dtl.this.x = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Reference2IntOpenHashMap<akt<dbc<?>>> y = new Reference2IntOpenHashMap();
   private final dbj.a<dbv, ? extends dai> z;

   protected dtl(dtz<?> $$0, ji $$1, dwv $$2, dbn<? extends dai> $$3) {
      super($$0, $$1, $$2);
      this.z = dbj.a($$3);
   }

   private boolean k() {
      return this.u > 0;
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.m = ka.a(this.b(), cwn.j);
      bsc.b($$0, this.m, $$1);
      this.u = $$0.g("BurnTime");
      this.w = $$0.g("CookTime");
      this.x = $$0.g("CookTimeTotal");
      this.v = 0;
      tq $$2 = $$0.p("RecipesUsed");

      for (String $$3 : $$2.e()) {
         this.y.put(akt.a(mc.bk, aku.a($$3)), $$2.h($$3));
      }
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      $$0.a("BurnTime", (short)this.u);
      $$0.a("CookTime", (short)this.w);
      $$0.a("CookTimeTotal", (short)this.x);
      bsc.a($$0, this.m, $$1);
      tq $$2 = new tq();
      this.y.forEach(($$1x, $$2x) -> $$2.a($$1x.a().toString(), $$2x));
      $$0.a("RecipesUsed", $$2);
   }

   public static void a(arc $$0, ji $$1, dwv $$2, dtl $$3) {
      boolean $$4 = $$3.k();
      boolean $$5 = false;
      if ($$3.k()) {
         $$3.u--;
      }

      cwn $$6 = $$3.m.get(1);
      cwn $$7 = $$3.m.get(0);
      boolean $$8 = !$$7.f();
      boolean $$9 = !$$6.f();
      if ($$3.v == 0) {
         $$3.v = $$3.a($$0.M(), $$6);
      }

      if ($$3.k() || $$9 && $$8) {
         dbv $$10 = new dbv($$7);
         dbh<? extends dai> $$11;
         if ($$8) {
            $$11 = $$3.z.a($$10, $$0).orElse(null);
         } else {
            $$11 = null;
         }

         int $$13 = $$3.an_();
         if (!$$3.k() && a($$0.K_(), $$11, $$10, $$3.m, $$13)) {
            $$3.u = $$3.a($$0.M(), $$6);
            $$3.v = $$3.u;
            if ($$3.k()) {
               $$5 = true;
               if ($$9) {
                  cwj $$14 = $$6.h();
                  $$6.h(1);
                  if ($$6.f()) {
                     $$3.m.set(1, $$14.k());
                  }
               }
            }
         }

         if ($$3.k() && a($$0.K_(), $$11, $$10, $$3.m, $$13)) {
            $$3.w++;
            if ($$3.w == $$3.x) {
               $$3.w = 0;
               $$3.x = a($$0, $$3);
               if (b($$0.K_(), $$11, $$10, $$3.m, $$13)) {
                  $$3.a($$11);
               }

               $$5 = true;
            }
         } else {
            $$3.w = 0;
         }
      } else if (!$$3.k() && $$3.w > 0) {
         $$3.w = ayy.a($$3.w - 2, 0, $$3.x);
      }

      if ($$4 != $$3.k()) {
         $$5 = true;
         $$2 = $$2.b(dif.b, Boolean.valueOf($$3.k()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(kf $$0, @Nullable dbh<? extends dai> $$1, dbv $$2, ka<cwn> $$3, int $$4) {
      if (!$$3.get(0).f() && $$1 != null) {
         cwn $$5 = $$1.b().a($$2, $$0);
         if ($$5.f()) {
            return false;
         } else {
            cwn $$6 = $$3.get(2);
            if ($$6.f()) {
               return true;
            } else if (!cwn.c($$6, $$5)) {
               return false;
            } else {
               return $$6.M() < $$4 && $$6.M() < $$6.k() ? true : $$6.M() < $$5.k();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(kf $$0, @Nullable dbh<? extends dai> $$1, dbv $$2, ka<cwn> $$3, int $$4) {
      if ($$1 != null && a($$0, $$1, $$2, $$3, $$4)) {
         cwn $$5 = $$3.get(0);
         cwn $$6 = $$1.b().a($$2, $$0);
         cwn $$7 = $$3.get(2);
         if ($$7.f()) {
            $$3.set(2, $$6.v());
         } else if (cwn.c($$7, $$6)) {
            $$7.g(1);
         }

         if ($$5.a(djm.aW.j()) && !$$3.get(1).f() && $$3.get(1).a(cwr.rf)) {
            $$3.set(1, new cwn(cwr.rg));
         }

         $$5.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int a(duv $$0, cwn $$1) {
      return $$0.b($$1);
   }

   private static int a(arc $$0, dtl $$1) {
      dbv $$2 = new dbv($$1.a(0));
      return $$1.z.a($$2, $$0).map($$0x -> ((dai)$$0x.b()).d()).orElse(200);
   }

   @Override
   public int[] a(jn $$0) {
      if ($$0 == jn.a) {
         return s;
      } else {
         return $$0 == jn.b ? r : t;
      }
   }

   @Override
   public boolean a(int $$0, cwn $$1, @Nullable jn $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cwn $$1, jn $$2) {
      return $$2 == jn.a && $$0 == 1 ? $$1.a(cwr.rg) || $$1.a(cwr.rf) : true;
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   protected ka<cwn> f() {
      return this.m;
   }

   @Override
   protected void a(ka<cwn> $$0) {
      this.m = $$0;
   }

   @Override
   public void a(int $$0, cwn $$1) {
      cwn $$2 = this.m.get($$0);
      boolean $$3 = !$$1.f() && cwn.c($$2, $$1);
      this.m.set($$0, $$1);
      $$1.f(this.e_($$1));
      if ($$0 == 0 && !$$3 && this.o instanceof arc $$4) {
         this.x = a($$4, this);
         this.w = 0;
         this.e();
      }
   }

   @Override
   public boolean b(int $$0, cwn $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         cwn $$2 = this.m.get(1);
         return this.o.M().a($$1) || $$1.a(cwr.rf) && !$$2.a(cwr.rf);
      }
   }

   @Override
   public void a(@Nullable dbh<?> $$0) {
      if ($$0 != null) {
         akt<dbc<?>> $$1 = $$0.a();
         this.y.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public dbh<?> d() {
      return null;
   }

   @Override
   public void a(cov $$0, List<cwn> $$1) {
   }

   public void a(ard $$0) {
      List<dbh<?>> $$1 = this.a($$0.y(), $$0.du());
      $$0.a($$1);

      for (dbh<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.m);
         }
      }

      this.y.clear();
   }

   public List<dbh<?>> a(arc $$0, fay $$1) {
      List<dbh<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.y.reference2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<akt<dbc<?>>> $$3 = (Entry<akt<dbc<?>>>)var4.next();
         $$0.t().b((akt<dbc<?>>)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((dbh<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((dai)$$4.b()).c());
         });
      }

      return $$2;
   }

   private static void a(arc $$0, fay $$1, int $$2, float $$3) {
      int $$4 = ayy.d((float)$$2 * $$3);
      float $$5 = ayy.i((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      buv.a($$0, $$1, $$4);
   }

   @Override
   public void fillStackedContents(cpa $$0) {
      for (cwn $$1 : this.m) {
         $$0.b($$1);
      }
   }
}

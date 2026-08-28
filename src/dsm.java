import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import javax.annotation.Nullable;

public abstract class dsm extends dss implements bsu, ctq, cub {
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
   protected jz<cwm> m = jz.a(3, cwm.k);
   int u;
   int v = 0;
   int w;
   int x;
   protected final csl n = new csl() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dsm.this.u;
            case 1:
               return dsm.this.v;
            case 2:
               return dsm.this.w;
            case 3:
               return dsm.this.x;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dsm.this.u = $$1;
               break;
            case 1:
               dsm.this.v = $$1;
               break;
            case 2:
               dsm.this.w = $$1;
               break;
            case 3:
               dsm.this.x = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Object2IntOpenHashMap<alj> y = new Object2IntOpenHashMap();
   private final dbe.a<dbp, ? extends dah> z;

   protected dsm(dta<?> $$0, jh $$1, dvv $$2, dbg<? extends dah> $$3) {
      super($$0, $$1, $$2);
      this.z = dbe.b($$3);
   }

   private boolean k() {
      return this.u > 0;
   }

   @Override
   protected void a(ul $$0, js.a $$1) {
      super.a($$0, $$1);
      this.m = jz.a(this.b(), cwm.k);
      bse.b($$0, this.m, $$1);
      this.u = $$0.g("BurnTime");
      this.w = $$0.g("CookTime");
      this.x = $$0.g("CookTimeTotal");
      this.v = 0;
      ul $$2 = $$0.p("RecipesUsed");

      for (String $$3 : $$2.e()) {
         this.y.put(alj.a($$3), $$2.h($$3));
      }
   }

   @Override
   protected void b(ul $$0, js.a $$1) {
      super.b($$0, $$1);
      $$0.a("BurnTime", (short)this.u);
      $$0.a("CookTime", (short)this.w);
      $$0.a("CookTimeTotal", (short)this.x);
      bse.a($$0, this.m, $$1);
      ul $$2 = new ul();
      this.y.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), $$2x));
      $$0.a("RecipesUsed", $$2);
   }

   public static void a(dfm $$0, jh $$1, dvv $$2, dsm $$3) {
      boolean $$4 = $$3.k();
      boolean $$5 = false;
      if ($$3.k()) {
         $$3.u--;
      }

      cwm $$6 = $$3.m.get(1);
      cwm $$7 = $$3.m.get(0);
      boolean $$8 = !$$7.f();
      boolean $$9 = !$$6.f();
      if ($$3.v == 0) {
         $$3.v = $$3.a($$0.L(), $$6);
      }

      if ($$3.k() || $$9 && $$8) {
         dbc<?> $$10;
         if ($$8) {
            $$10 = $$3.z.a(new dbp($$7), $$0).orElse(null);
         } else {
            $$10 = null;
         }

         int $$12 = $$3.an_();
         if (!$$3.k() && a($$0.J_(), $$10, $$3.m, $$12)) {
            $$3.u = $$3.a($$0.L(), $$6);
            $$3.v = $$3.u;
            if ($$3.k()) {
               $$5 = true;
               if ($$9) {
                  cwi $$13 = $$6.h();
                  $$6.h(1);
                  if ($$6.f()) {
                     cwi $$14 = $$13.k();
                     $$3.m.set(1, $$14 == null ? cwm.k : new cwm($$14));
                  }
               }
            }
         }

         if ($$3.k() && a($$0.J_(), $$10, $$3.m, $$12)) {
            $$3.w++;
            if ($$3.w == $$3.x) {
               $$3.w = 0;
               $$3.x = a($$0, $$3);
               if (b($$0.J_(), $$10, $$3.m, $$12)) {
                  $$3.a($$10);
               }

               $$5 = true;
            }
         } else {
            $$3.w = 0;
         }
      } else if (!$$3.k() && $$3.w > 0) {
         $$3.w = azm.a($$3.w - 2, 0, $$3.x);
      }

      if ($$4 != $$3.k()) {
         $$5 = true;
         $$2 = $$2.b(dhl.b, Boolean.valueOf($$3.k()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(ke $$0, @Nullable dbc<?> $$1, jz<cwm> $$2, int $$3) {
      if (!$$2.get(0).f() && $$1 != null) {
         cwm $$4 = $$1.b().a($$0);
         if ($$4.f()) {
            return false;
         } else {
            cwm $$5 = $$2.get(2);
            if ($$5.f()) {
               return true;
            } else if (!cwm.c($$5, $$4)) {
               return false;
            } else {
               return $$5.L() < $$3 && $$5.L() < $$5.k() ? true : $$5.L() < $$4.k();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(ke $$0, @Nullable dbc<?> $$1, jz<cwm> $$2, int $$3) {
      if ($$1 != null && a($$0, $$1, $$2, $$3)) {
         cwm $$4 = $$2.get(0);
         cwm $$5 = $$1.b().a($$0);
         cwm $$6 = $$2.get(2);
         if ($$6.f()) {
            $$2.set(2, $$5.v());
         } else if (cwm.c($$6, $$5)) {
            $$6.g(1);
         }

         if ($$4.a(dis.aP.j()) && !$$2.get(1).f() && $$2.get(1).a(cwq.qz)) {
            $$2.set(1, new cwm(cwq.qA));
         }

         $$4.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int a(dtv $$0, cwm $$1) {
      return $$0.b($$1);
   }

   private static int a(dfm $$0, dsm $$1) {
      dbp $$2 = new dbp($$1.a(0));
      return $$1.z.a($$2, $$0).map($$0x -> ((dah)$$0x.b()).d()).orElse(200);
   }

   @Override
   public int[] a(jm $$0) {
      if ($$0 == jm.a) {
         return s;
      } else {
         return $$0 == jm.b ? r : t;
      }
   }

   @Override
   public boolean a(int $$0, cwm $$1, @Nullable jm $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cwm $$1, jm $$2) {
      return $$2 == jm.a && $$0 == 1 ? $$1.a(cwq.qA) || $$1.a(cwq.qz) : true;
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   protected jz<cwm> f() {
      return this.m;
   }

   @Override
   protected void a(jz<cwm> $$0) {
      this.m = $$0;
   }

   @Override
   public void a(int $$0, cwm $$1) {
      cwm $$2 = this.m.get($$0);
      boolean $$3 = !$$1.f() && cwm.c($$2, $$1);
      this.m.set($$0, $$1);
      $$1.f(this.e_($$1));
      if ($$0 == 0 && !$$3) {
         this.x = a(this.o, this);
         this.w = 0;
         this.e();
      }
   }

   @Override
   public boolean b(int $$0, cwm $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         cwm $$2 = this.m.get(1);
         return this.o.L().a($$1) || $$1.a(cwq.qz) && !$$2.a(cwq.qz);
      }
   }

   @Override
   public void a(@Nullable dbc<?> $$0) {
      if ($$0 != null) {
         alj $$1 = $$0.a();
         this.y.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public dbc<?> d() {
      return null;
   }

   @Override
   public void a(cou $$0, List<cwm> $$1) {
   }

   public void a(arq $$0) {
      List<dbc<?>> $$1 = this.a($$0.y(), $$0.dt());
      $$0.a($$1);

      for (dbc<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.m);
         }
      }

      this.y.clear();
   }

   public List<dbc<?>> a(arp $$0, ezy $$1) {
      List<dbc<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.y.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<alj> $$3 = (Entry<alj>)var4.next();
         $$0.s().a((alj)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((dbc<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((dah)$$4.b()).b());
         });
      }

      return $$2;
   }

   private static void a(arp $$0, ezy $$1, int $$2, float $$3) {
      int $$4 = azm.d((float)$$2 * $$3);
      float $$5 = azm.i((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      bux.a($$0, $$1, $$4);
   }

   @Override
   public void fillStackedContents(coz $$0) {
      for (cwm $$1 : this.m) {
         $$0.b($$1);
      }
   }
}

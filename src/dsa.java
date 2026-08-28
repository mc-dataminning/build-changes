import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import javax.annotation.Nullable;

public abstract class dsa extends dsg implements bsn, ctf, ctq {
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
   protected jz<cwb> m = jz.a(3, cwb.k);
   int u;
   int v = 0;
   int w;
   int x;
   protected final csa n = new csa() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dsa.this.u;
            case 1:
               return dsa.this.v;
            case 2:
               return dsa.this.w;
            case 3:
               return dsa.this.x;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dsa.this.u = $$1;
               break;
            case 1:
               dsa.this.v = $$1;
               break;
            case 2:
               dsa.this.w = $$1;
               break;
            case 3:
               dsa.this.x = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Object2IntOpenHashMap<ali> y = new Object2IntOpenHashMap();
   private final dat.a<dbf, ? extends czw> z;

   protected dsa(dso<?> $$0, jh $$1, dvj $$2, dav<? extends czw> $$3) {
      super($$0, $$1, $$2);
      this.z = dat.b($$3);
   }

   private boolean k() {
      return this.u > 0;
   }

   @Override
   protected void a(uk $$0, js.a $$1) {
      super.a($$0, $$1);
      this.m = jz.a(this.b(), cwb.k);
      brx.b($$0, this.m, $$1);
      this.u = $$0.g("BurnTime");
      this.w = $$0.g("CookTime");
      this.x = $$0.g("CookTimeTotal");
      this.v = 0;
      uk $$2 = $$0.p("RecipesUsed");

      for (String $$3 : $$2.e()) {
         this.y.put(ali.a($$3), $$2.h($$3));
      }
   }

   @Override
   protected void b(uk $$0, js.a $$1) {
      super.b($$0, $$1);
      $$0.a("BurnTime", (short)this.u);
      $$0.a("CookTime", (short)this.w);
      $$0.a("CookTimeTotal", (short)this.x);
      brx.a($$0, this.m, $$1);
      uk $$2 = new uk();
      this.y.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), $$2x));
      $$0.a("RecipesUsed", $$2);
   }

   public static void a(dfb $$0, jh $$1, dvj $$2, dsa $$3) {
      boolean $$4 = $$3.k();
      boolean $$5 = false;
      if ($$3.k()) {
         $$3.u--;
      }

      cwb $$6 = $$3.m.get(1);
      cwb $$7 = $$3.m.get(0);
      boolean $$8 = !$$7.f();
      boolean $$9 = !$$6.f();
      if ($$3.v == 0) {
         $$3.v = $$3.a($$0.L(), $$6);
      }

      if ($$3.k() || $$9 && $$8) {
         dar<?> $$10;
         if ($$8) {
            $$10 = $$3.z.a(new dbf($$7), $$0).orElse(null);
         } else {
            $$10 = null;
         }

         int $$12 = $$3.am_();
         if (!$$3.k() && a($$0.H_(), $$10, $$3.m, $$12)) {
            $$3.u = $$3.a($$0.L(), $$6);
            $$3.v = $$3.u;
            if ($$3.k()) {
               $$5 = true;
               if ($$9) {
                  cvx $$13 = $$6.h();
                  $$6.h(1);
                  if ($$6.f()) {
                     cvx $$14 = $$13.k();
                     $$3.m.set(1, $$14 == null ? cwb.k : new cwb($$14));
                  }
               }
            }
         }

         if ($$3.k() && a($$0.H_(), $$10, $$3.m, $$12)) {
            $$3.w++;
            if ($$3.w == $$3.x) {
               $$3.w = 0;
               $$3.x = a($$0, $$3);
               if (b($$0.H_(), $$10, $$3.m, $$12)) {
                  $$3.a($$10);
               }

               $$5 = true;
            }
         } else {
            $$3.w = 0;
         }
      } else if (!$$3.k() && $$3.w > 0) {
         $$3.w = azk.a($$3.w - 2, 0, $$3.x);
      }

      if ($$4 != $$3.k()) {
         $$5 = true;
         $$2 = $$2.b(dgz.b, Boolean.valueOf($$3.k()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(ke $$0, @Nullable dar<?> $$1, jz<cwb> $$2, int $$3) {
      if (!$$2.get(0).f() && $$1 != null) {
         cwb $$4 = $$1.b().a($$0);
         if ($$4.f()) {
            return false;
         } else {
            cwb $$5 = $$2.get(2);
            if ($$5.f()) {
               return true;
            } else if (!cwb.c($$5, $$4)) {
               return false;
            } else {
               return $$5.L() < $$3 && $$5.L() < $$5.k() ? true : $$5.L() < $$4.k();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(ke $$0, @Nullable dar<?> $$1, jz<cwb> $$2, int $$3) {
      if ($$1 != null && a($$0, $$1, $$2, $$3)) {
         cwb $$4 = $$2.get(0);
         cwb $$5 = $$1.b().a($$0);
         cwb $$6 = $$2.get(2);
         if ($$6.f()) {
            $$2.set(2, $$5.v());
         } else if (cwb.c($$6, $$5)) {
            $$6.g(1);
         }

         if ($$4.a(dig.aP.j()) && !$$2.get(1).f() && $$2.get(1).a(cwf.qz)) {
            $$2.set(1, new cwb(cwf.qA));
         }

         $$4.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int a(dtj $$0, cwb $$1) {
      return $$0.b($$1);
   }

   private static int a(dfb $$0, dsa $$1) {
      dbf $$2 = new dbf($$1.a(0));
      return $$1.z.a($$2, $$0).map($$0x -> ((czw)$$0x.b()).d()).orElse(200);
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
   public boolean a(int $$0, cwb $$1, @Nullable jm $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cwb $$1, jm $$2) {
      return $$2 == jm.a && $$0 == 1 ? $$1.a(cwf.qA) || $$1.a(cwf.qz) : true;
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   protected jz<cwb> f() {
      return this.m;
   }

   @Override
   protected void a(jz<cwb> $$0) {
      this.m = $$0;
   }

   @Override
   public void a(int $$0, cwb $$1) {
      cwb $$2 = this.m.get($$0);
      boolean $$3 = !$$1.f() && cwb.c($$2, $$1);
      this.m.set($$0, $$1);
      $$1.f(this.e_($$1));
      if ($$0 == 0 && !$$3) {
         this.x = a(this.o, this);
         this.w = 0;
         this.e();
      }
   }

   @Override
   public boolean b(int $$0, cwb $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         cwb $$2 = this.m.get(1);
         return this.o.L().a($$1) || $$1.a(cwf.qz) && !$$2.a(cwf.qz);
      }
   }

   @Override
   public void a(@Nullable dar<?> $$0) {
      if ($$0 != null) {
         ali $$1 = $$0.a();
         this.y.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public dar<?> d() {
      return null;
   }

   @Override
   public void a(com $$0, List<cwb> $$1) {
   }

   public void a(aro $$0) {
      List<dar<?>> $$1 = this.a($$0.B(), $$0.dv());
      $$0.a($$1);

      for (dar<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.m);
         }
      }

      this.y.clear();
   }

   public List<dar<?>> a(arn $$0, ezn $$1) {
      List<dar<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.y.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<ali> $$3 = (Entry<ali>)var4.next();
         $$0.r().a((ali)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((dar<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((czw)$$4.b()).b());
         });
      }

      return $$2;
   }

   private static void a(arn $$0, ezn $$1, int $$2, float $$3) {
      int $$4 = azk.d((float)$$2 * $$3);
      float $$5 = azk.i((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      buq.a($$0, $$1, $$4);
   }

   @Override
   public void fillStackedContents(cos $$0) {
      for (cwb $$1 : this.m) {
         $$0.b($$1);
      }
   }
}

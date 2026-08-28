import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2IntMap.Entry;
import java.util.List;
import javax.annotation.Nullable;

public abstract class duk extends duq implements bts, cus, cvd {
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
   protected jz<cxo> m = jz.a(3, cxo.k);
   int u;
   int v = 0;
   int w;
   int x;
   protected final ctn n = new ctn() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return duk.this.u;
            case 1:
               return duk.this.v;
            case 2:
               return duk.this.w;
            case 3:
               return duk.this.x;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               duk.this.u = $$1;
               break;
            case 1:
               duk.this.v = $$1;
               break;
            case 2:
               duk.this.w = $$1;
               break;
            case 3:
               duk.this.x = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Reference2IntOpenHashMap<aly<dcd<?>>> y = new Reference2IntOpenHashMap();
   private final dck.a<dcw, ? extends dbj> z;

   protected duk(duy<?> $$0, jh $$1, dxu $$2, dco<? extends dbj> $$3) {
      super($$0, $$1, $$2);
      this.z = dck.a($$3);
   }

   private boolean k() {
      return this.u > 0;
   }

   @Override
   protected void a(ux $$0, js.a $$1) {
      super.a($$0, $$1);
      this.m = jz.a(this.b(), cxo.k);
      btc.b($$0, this.m, $$1);
      this.u = $$0.g("BurnTime");
      this.w = $$0.g("CookTime");
      this.x = $$0.g("CookTimeTotal");
      this.v = 0;
      ux $$2 = $$0.p("RecipesUsed");

      for (String $$3 : $$2.e()) {
         this.y.put(aly.a(mb.bk, alz.a($$3)), $$2.h($$3));
      }
   }

   @Override
   protected void b(ux $$0, js.a $$1) {
      super.b($$0, $$1);
      $$0.a("BurnTime", (short)this.u);
      $$0.a("CookTime", (short)this.w);
      $$0.a("CookTimeTotal", (short)this.x);
      btc.a($$0, this.m, $$1);
      ux $$2 = new ux();
      this.y.forEach(($$1x, $$2x) -> $$2.a($$1x.a().toString(), $$2x));
      $$0.a("RecipesUsed", $$2);
   }

   public static void a(ash $$0, jh $$1, dxu $$2, duk $$3) {
      boolean $$4 = $$3.k();
      boolean $$5 = false;
      if ($$3.k()) {
         $$3.u--;
      }

      cxo $$6 = $$3.m.get(1);
      cxo $$7 = $$3.m.get(0);
      boolean $$8 = !$$7.f();
      boolean $$9 = !$$6.f();
      if ($$3.v == 0) {
         $$3.v = $$3.a($$0.L(), $$6);
      }

      if ($$3.k() || $$9 && $$8) {
         dcw $$10 = new dcw($$7);
         dci<? extends dbj> $$11;
         if ($$8) {
            $$11 = $$3.z.a($$10, $$0).orElse(null);
         } else {
            $$11 = null;
         }

         int $$13 = $$3.ao_();
         if (!$$3.k() && a($$0.K_(), $$11, $$10, $$3.m, $$13)) {
            $$3.u = $$3.a($$0.L(), $$6);
            $$3.v = $$3.u;
            if ($$3.k()) {
               $$5 = true;
               if ($$9) {
                  cxk $$14 = $$6.h();
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
         $$3.w = bae.a($$3.w - 2, 0, $$3.x);
      }

      if ($$4 != $$3.k()) {
         $$5 = true;
         $$2 = $$2.b(djg.b, Boolean.valueOf($$3.k()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(ke $$0, @Nullable dci<? extends dbj> $$1, dcw $$2, jz<cxo> $$3, int $$4) {
      if (!$$3.get(0).f() && $$1 != null) {
         cxo $$5 = $$1.b().a($$2, $$0);
         if ($$5.f()) {
            return false;
         } else {
            cxo $$6 = $$3.get(2);
            if ($$6.f()) {
               return true;
            } else if (!cxo.c($$6, $$5)) {
               return false;
            } else {
               return $$6.L() < $$4 && $$6.L() < $$6.k() ? true : $$6.L() < $$5.k();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(ke $$0, @Nullable dci<? extends dbj> $$1, dcw $$2, jz<cxo> $$3, int $$4) {
      if ($$1 != null && a($$0, $$1, $$2, $$3, $$4)) {
         cxo $$5 = $$3.get(0);
         cxo $$6 = $$1.b().a($$2, $$0);
         cxo $$7 = $$3.get(2);
         if ($$7.f()) {
            $$3.set(2, $$6.v());
         } else if (cxo.c($$7, $$6)) {
            $$7.g(1);
         }

         if ($$5.a(dkn.aW.j()) && !$$3.get(1).f() && $$3.get(1).a(cxs.qW)) {
            $$3.set(1, new cxo(cxs.qX));
         }

         $$5.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int a(dvu $$0, cxo $$1) {
      return $$0.b($$1);
   }

   private static int a(ash $$0, duk $$1) {
      dcw $$2 = new dcw($$1.a(0));
      return $$1.z.a($$2, $$0).map($$0x -> ((dbj)$$0x.b()).d()).orElse(200);
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
   public boolean a(int $$0, cxo $$1, @Nullable jm $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cxo $$1, jm $$2) {
      return $$2 == jm.a && $$0 == 1 ? $$1.a(cxs.qX) || $$1.a(cxs.qW) : true;
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   protected jz<cxo> f() {
      return this.m;
   }

   @Override
   protected void a(jz<cxo> $$0) {
      this.m = $$0;
   }

   @Override
   public void a(int $$0, cxo $$1) {
      cxo $$2 = this.m.get($$0);
      boolean $$3 = !$$1.f() && cxo.c($$2, $$1);
      this.m.set($$0, $$1);
      $$1.f(this.e_($$1));
      if ($$0 == 0 && !$$3 && this.o instanceof ash $$4) {
         this.x = a($$4, this);
         this.w = 0;
         this.e();
      }
   }

   @Override
   public boolean b(int $$0, cxo $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         cxo $$2 = this.m.get(1);
         return this.o.L().a($$1) || $$1.a(cxs.qW) && !$$2.a(cxs.qW);
      }
   }

   @Override
   public void a(@Nullable dci<?> $$0) {
      if ($$0 != null) {
         aly<dcd<?>> $$1 = $$0.a();
         this.y.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public dci<?> d() {
      return null;
   }

   @Override
   public void a(cpw $$0, List<cxo> $$1) {
   }

   public void a(asi $$0) {
      List<dci<?>> $$1 = this.a($$0.y(), $$0.dt());
      $$0.a($$1);

      for (dci<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.m);
         }
      }

      this.y.clear();
   }

   public List<dci<?>> a(ash $$0, fbx $$1) {
      List<dci<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.y.reference2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<aly<dcd<?>>> $$3 = (Entry<aly<dcd<?>>>)var4.next();
         $$0.s().b((aly<dcd<?>>)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((dci<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((dbj)$$4.b()).c());
         });
      }

      return $$2;
   }

   private static void a(ash $$0, fbx $$1, int $$2, float $$3) {
      int $$4 = bae.d((float)$$2 * $$3);
      float $$5 = bae.i((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      bvv.a($$0, $$1, $$4);
   }

   @Override
   public void fillStackedContents(cqb $$0) {
      for (cxo $$1 : this.m) {
         $$0.b($$1);
      }
   }
}

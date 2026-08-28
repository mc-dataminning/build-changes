import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2IntMap.Entry;
import java.util.List;
import javax.annotation.Nullable;

public abstract class due extends duk implements btk, cuk, cuv {
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
   protected jz<cxg> m = jz.a(3, cxg.j);
   int u;
   int v = 0;
   int w;
   int x;
   protected final ctf n = new ctf() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return due.this.u;
            case 1:
               return due.this.v;
            case 2:
               return due.this.w;
            case 3:
               return due.this.x;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               due.this.u = $$1;
               break;
            case 1:
               due.this.v = $$1;
               break;
            case 2:
               due.this.w = $$1;
               break;
            case 3:
               due.this.x = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Reference2IntOpenHashMap<alo<dbv<?>>> y = new Reference2IntOpenHashMap();
   private final dcc.a<dco, ? extends dbb> z;

   protected due(dus<?> $$0, jh $$1, dxo $$2, dcg<? extends dbb> $$3) {
      super($$0, $$1, $$2);
      this.z = dcc.a($$3);
   }

   private boolean k() {
      return this.u > 0;
   }

   @Override
   protected void a(um $$0, js.a $$1) {
      super.a($$0, $$1);
      this.m = jz.a(this.b(), cxg.j);
      bsu.b($$0, this.m, $$1);
      this.u = $$0.g("BurnTime");
      this.w = $$0.g("CookTime");
      this.x = $$0.g("CookTimeTotal");
      this.v = 0;
      um $$2 = $$0.p("RecipesUsed");

      for (String $$3 : $$2.e()) {
         this.y.put(alo.a(mb.bk, alp.a($$3)), $$2.h($$3));
      }
   }

   @Override
   protected void b(um $$0, js.a $$1) {
      super.b($$0, $$1);
      $$0.a("BurnTime", (short)this.u);
      $$0.a("CookTime", (short)this.w);
      $$0.a("CookTimeTotal", (short)this.x);
      bsu.a($$0, this.m, $$1);
      um $$2 = new um();
      this.y.forEach(($$1x, $$2x) -> $$2.a($$1x.a().toString(), $$2x));
      $$0.a("RecipesUsed", $$2);
   }

   public static void a(arx $$0, jh $$1, dxo $$2, due $$3) {
      boolean $$4 = $$3.k();
      boolean $$5 = false;
      if ($$3.k()) {
         $$3.u--;
      }

      cxg $$6 = $$3.m.get(1);
      cxg $$7 = $$3.m.get(0);
      boolean $$8 = !$$7.f();
      boolean $$9 = !$$6.f();
      if ($$3.v == 0) {
         $$3.v = $$3.a($$0.M(), $$6);
      }

      if ($$3.k() || $$9 && $$8) {
         dco $$10 = new dco($$7);
         dca<? extends dbb> $$11;
         if ($$8) {
            $$11 = $$3.z.a($$10, $$0).orElse(null);
         } else {
            $$11 = null;
         }

         int $$13 = $$3.ao_();
         if (!$$3.k() && a($$0.K_(), $$11, $$10, $$3.m, $$13)) {
            $$3.u = $$3.a($$0.M(), $$6);
            $$3.v = $$3.u;
            if ($$3.k()) {
               $$5 = true;
               if ($$9) {
                  cxc $$14 = $$6.h();
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
         $$3.w = azu.a($$3.w - 2, 0, $$3.x);
      }

      if ($$4 != $$3.k()) {
         $$5 = true;
         $$2 = $$2.b(diy.b, Boolean.valueOf($$3.k()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(ke $$0, @Nullable dca<? extends dbb> $$1, dco $$2, jz<cxg> $$3, int $$4) {
      if (!$$3.get(0).f() && $$1 != null) {
         cxg $$5 = $$1.b().a($$2, $$0);
         if ($$5.f()) {
            return false;
         } else {
            cxg $$6 = $$3.get(2);
            if ($$6.f()) {
               return true;
            } else if (!cxg.c($$6, $$5)) {
               return false;
            } else {
               return $$6.M() < $$4 && $$6.M() < $$6.k() ? true : $$6.M() < $$5.k();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(ke $$0, @Nullable dca<? extends dbb> $$1, dco $$2, jz<cxg> $$3, int $$4) {
      if ($$1 != null && a($$0, $$1, $$2, $$3, $$4)) {
         cxg $$5 = $$3.get(0);
         cxg $$6 = $$1.b().a($$2, $$0);
         cxg $$7 = $$3.get(2);
         if ($$7.f()) {
            $$3.set(2, $$6.v());
         } else if (cxg.c($$7, $$6)) {
            $$7.g(1);
         }

         if ($$5.a(dkf.aW.j()) && !$$3.get(1).f() && $$3.get(1).a(cxk.rf)) {
            $$3.set(1, new cxg(cxk.rg));
         }

         $$5.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int a(dvo $$0, cxg $$1) {
      return $$0.b($$1);
   }

   private static int a(arx $$0, due $$1) {
      dco $$2 = new dco($$1.a(0));
      return $$1.z.a($$2, $$0).map($$0x -> ((dbb)$$0x.b()).d()).orElse(200);
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
   public boolean a(int $$0, cxg $$1, @Nullable jm $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cxg $$1, jm $$2) {
      return $$2 == jm.a && $$0 == 1 ? $$1.a(cxk.rg) || $$1.a(cxk.rf) : true;
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   protected jz<cxg> f() {
      return this.m;
   }

   @Override
   protected void a(jz<cxg> $$0) {
      this.m = $$0;
   }

   @Override
   public void a(int $$0, cxg $$1) {
      cxg $$2 = this.m.get($$0);
      boolean $$3 = !$$1.f() && cxg.c($$2, $$1);
      this.m.set($$0, $$1);
      $$1.f(this.e_($$1));
      if ($$0 == 0 && !$$3 && this.o instanceof arx $$4) {
         this.x = a($$4, this);
         this.w = 0;
         this.e();
      }
   }

   @Override
   public boolean b(int $$0, cxg $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         cxg $$2 = this.m.get(1);
         return this.o.M().a($$1) || $$1.a(cxk.rf) && !$$2.a(cxk.rf);
      }
   }

   @Override
   public void a(@Nullable dca<?> $$0) {
      if ($$0 != null) {
         alo<dbv<?>> $$1 = $$0.a();
         this.y.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public dca<?> d() {
      return null;
   }

   @Override
   public void a(cpo $$0, List<cxg> $$1) {
   }

   public void a(ary $$0) {
      List<dca<?>> $$1 = this.a($$0.y(), $$0.du());
      $$0.a($$1);

      for (dca<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.m);
         }
      }

      this.y.clear();
   }

   public List<dca<?>> a(arx $$0, fbr $$1) {
      List<dca<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.y.reference2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<alo<dbv<?>>> $$3 = (Entry<alo<dbv<?>>>)var4.next();
         $$0.t().b((alo<dbv<?>>)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((dca<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((dbb)$$4.b()).c());
         });
      }

      return $$2;
   }

   private static void a(arx $$0, fbr $$1, int $$2, float $$3) {
      int $$4 = azu.d((float)$$2 * $$3);
      float $$5 = azu.i((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      bvn.a($$0, $$1, $$4);
   }

   @Override
   public void fillStackedContents(cpt $$0) {
      for (cxg $$1 : this.m) {
         $$0.b($$1);
      }
   }
}

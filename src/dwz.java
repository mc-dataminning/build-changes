import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2IntMap.Entry;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class dwz extends dxf implements buq, cwt, cxe {
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
   private static final Codec<Map<alf<deb<?>>, Integer>> t = Codec.unboundedMap(deb.b, Codec.INT);
   protected jo<czk> l = jo.a(3, czk.k);
   int u;
   int v;
   int w;
   int x;
   protected final cvo m = new cvo() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dwz.this.u;
            case 1:
               return dwz.this.v;
            case 2:
               return dwz.this.w;
            case 3:
               return dwz.this.x;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dwz.this.u = $$1;
               break;
            case 1:
               dwz.this.v = $$1;
               break;
            case 2:
               dwz.this.w = $$1;
               break;
            case 3:
               dwz.this.x = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Reference2IntOpenHashMap<alf<deb<?>>> y = new Reference2IntOpenHashMap();
   private final dei.a<deu, ? extends ddh> z;

   protected dwz(dxo<?> $$0, iv $$1, eao $$2, dem<? extends ddh> $$3) {
      super($$0, $$1, $$2);
      this.z = dei.a($$3);
   }

   private boolean k() {
      return this.u > 0;
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.l = jo.a(this.b(), czk.k);
      bua.b($$0, this.l, $$1);
      this.w = $$0.e("cooking_time_spent");
      this.x = $$0.e("cooking_total_time");
      this.u = $$0.e("lit_time_remaining");
      this.v = $$0.e("lit_total_time");
      this.y.clear();
      this.y.putAll($$0.<Map>a("RecipesUsed", t).orElse(Map.of()));
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      $$0.a("cooking_time_spent", (short)this.w);
      $$0.a("cooking_total_time", (short)this.x);
      $$0.a("lit_time_remaining", (short)this.u);
      $$0.a("lit_total_time", (short)this.v);
      bua.a($$0, this.l, $$1);
      $$0.a("RecipesUsed", t, this.y);
   }

   public static void a(arq $$0, iv $$1, eao $$2, dwz $$3) {
      boolean $$4 = $$3.k();
      boolean $$5 = false;
      if ($$3.k()) {
         $$3.u--;
      }

      czk $$6 = $$3.l.get(1);
      czk $$7 = $$3.l.get(0);
      boolean $$8 = !$$7.f();
      boolean $$9 = !$$6.f();
      if ($$3.k() || $$9 && $$8) {
         deu $$10 = new deu($$7);
         deg<? extends ddh> $$11;
         if ($$8) {
            $$11 = $$3.z.a($$10, $$0).orElse(null);
         } else {
            $$11 = null;
         }

         int $$13 = $$3.ak_();
         if (!$$3.k() && a($$0.F_(), $$11, $$10, $$3.l, $$13)) {
            $$3.u = $$3.a($$0.M(), $$6);
            $$3.v = $$3.u;
            if ($$3.k()) {
               $$5 = true;
               if ($$9) {
                  czg $$14 = $$6.h();
                  $$6.h(1);
                  if ($$6.f()) {
                     $$3.l.set(1, $$14.i());
                  }
               }
            }
         }

         if ($$3.k() && a($$0.F_(), $$11, $$10, $$3.l, $$13)) {
            $$3.w++;
            if ($$3.w == $$3.x) {
               $$3.w = 0;
               $$3.x = a($$0, $$3);
               if (b($$0.F_(), $$11, $$10, $$3.l, $$13)) {
                  $$3.a($$11);
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
         $$2 = $$2.b(dlh.b, Boolean.valueOf($$3.k()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(jt $$0, @Nullable deg<? extends ddh> $$1, deu $$2, jo<czk> $$3, int $$4) {
      if (!$$3.get(0).f() && $$1 != null) {
         czk $$5 = $$1.b().a($$2, $$0);
         if ($$5.f()) {
            return false;
         } else {
            czk $$6 = $$3.get(2);
            if ($$6.f()) {
               return true;
            } else if (!czk.c($$6, $$5)) {
               return false;
            } else {
               return $$6.M() < $$4 && $$6.M() < $$6.k() ? true : $$6.M() < $$5.k();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(jt $$0, @Nullable deg<? extends ddh> $$1, deu $$2, jo<czk> $$3, int $$4) {
      if ($$1 != null && a($$0, $$1, $$2, $$3, $$4)) {
         czk $$5 = $$3.get(0);
         czk $$6 = $$1.b().a($$2, $$0);
         czk $$7 = $$3.get(2);
         if ($$7.f()) {
            $$3.set(2, $$6.v());
         } else if (czk.c($$7, $$6)) {
            $$7.g(1);
         }

         if ($$5.a(dmo.aW.h()) && !$$3.get(1).f() && $$3.get(1).a(czo.ro)) {
            $$3.set(1, new czk(czo.rp));
         }

         $$5.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int a(dyl $$0, czk $$1) {
      return $$0.b($$1);
   }

   private static int a(arq $$0, dwz $$1) {
      deu $$2 = new deu($$1.a(0));
      return $$1.z.a($$2, $$0).map($$0x -> ((ddh)$$0x.b()).d()).orElse(200);
   }

   @Override
   public int[] a(jb $$0) {
      if ($$0 == jb.a) {
         return r;
      } else {
         return $$0 == jb.b ? q : s;
      }
   }

   @Override
   public boolean a(int $$0, czk $$1, @Nullable jb $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, czk $$1, jb $$2) {
      return $$2 == jb.a && $$0 == 1 ? $$1.a(czo.rp) || $$1.a(czo.ro) : true;
   }

   @Override
   public int b() {
      return this.l.size();
   }

   @Override
   protected jo<czk> f() {
      return this.l;
   }

   @Override
   protected void a(jo<czk> $$0) {
      this.l = $$0;
   }

   @Override
   public void a(int $$0, czk $$1) {
      czk $$2 = this.l.get($$0);
      boolean $$3 = !$$1.f() && czk.c($$2, $$1);
      this.l.set($$0, $$1);
      $$1.f(this.f_($$1));
      if ($$0 == 0 && !$$3 && this.n instanceof arq $$4) {
         this.x = a($$4, this);
         this.w = 0;
         this.e();
      }
   }

   @Override
   public boolean b(int $$0, czk $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         czk $$2 = this.l.get(1);
         return this.n.M().a($$1) || $$1.a(czo.ro) && !$$2.a(czo.ro);
      }
   }

   @Override
   public void a(@Nullable deg<?> $$0) {
      if ($$0 != null) {
         alf<deb<?>> $$1 = $$0.a();
         this.y.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public deg<?> d() {
      return null;
   }

   @Override
   public void a(crj $$0, List<czk> $$1) {
   }

   public void a(arr $$0) {
      List<deg<?>> $$1 = this.a($$0.y(), $$0.ds());
      $$0.a($$1);

      for (deg<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.l);
         }
      }

      this.y.clear();
   }

   public List<deg<?>> a(arq $$0, fex $$1) {
      List<deg<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.y.reference2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<alf<deb<?>>> $$3 = (Entry<alf<deb<?>>>)var4.next();
         $$0.t().b((alf<deb<?>>)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((deg<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((ddh)$$4.b()).c());
         });
      }

      return $$2;
   }

   private static void a(arq $$0, fex $$1, int $$2, float $$3) {
      int $$4 = azm.d((float)$$2 * $$3);
      float $$5 = azm.i((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      bww.a($$0, $$1, $$4);
   }

   @Override
   public void fillStackedContents(crp $$0) {
      for (czk $$1 : this.l) {
         $$0.b($$1);
      }
   }

   @Override
   public void a(iv $$0, eao $$1) {
      super.a($$0, $$1);
      if (this.n instanceof arq $$2) {
         this.a($$2, fex.b($$0));
      }
   }
}

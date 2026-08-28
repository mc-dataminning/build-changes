import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2IntMap.Entry;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class dxe extends dxk implements buq, cww, cxh {
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
   private static final Codec<Map<alf<dee<?>>, Integer>> t = Codec.unboundedMap(dee.b, Codec.INT);
   protected jo<czn> l = jo.a(3, czn.k);
   int u;
   int v;
   int w;
   int x;
   protected final cvr m = new cvr() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dxe.this.u;
            case 1:
               return dxe.this.v;
            case 2:
               return dxe.this.w;
            case 3:
               return dxe.this.x;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dxe.this.u = $$1;
               break;
            case 1:
               dxe.this.v = $$1;
               break;
            case 2:
               dxe.this.w = $$1;
               break;
            case 3:
               dxe.this.x = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Reference2IntOpenHashMap<alf<dee<?>>> y = new Reference2IntOpenHashMap();
   private final del.a<dex, ? extends ddk> z;

   protected dxe(dxt<?> $$0, iv $$1, eat $$2, dep<? extends ddk> $$3) {
      super($$0, $$1, $$2);
      this.z = del.a($$3);
   }

   private boolean k() {
      return this.u > 0;
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.l = jo.a(this.b(), czn.k);
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

   public static void a(arq $$0, iv $$1, eat $$2, dxe $$3) {
      boolean $$4 = $$3.k();
      boolean $$5 = false;
      if ($$3.k()) {
         $$3.u--;
      }

      czn $$6 = $$3.l.get(1);
      czn $$7 = $$3.l.get(0);
      boolean $$8 = !$$7.f();
      boolean $$9 = !$$6.f();
      if ($$3.k() || $$9 && $$8) {
         dex $$10 = new dex($$7);
         dej<? extends ddk> $$11;
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
                  czj $$14 = $$6.h();
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
         $$2 = $$2.b(dlm.b, Boolean.valueOf($$3.k()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(jt $$0, @Nullable dej<? extends ddk> $$1, dex $$2, jo<czn> $$3, int $$4) {
      if (!$$3.get(0).f() && $$1 != null) {
         czn $$5 = $$1.b().a($$2, $$0);
         if ($$5.f()) {
            return false;
         } else {
            czn $$6 = $$3.get(2);
            if ($$6.f()) {
               return true;
            } else if (!czn.c($$6, $$5)) {
               return false;
            } else {
               return $$6.M() < $$4 && $$6.M() < $$6.k() ? true : $$6.M() < $$5.k();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(jt $$0, @Nullable dej<? extends ddk> $$1, dex $$2, jo<czn> $$3, int $$4) {
      if ($$1 != null && a($$0, $$1, $$2, $$3, $$4)) {
         czn $$5 = $$3.get(0);
         czn $$6 = $$1.b().a($$2, $$0);
         czn $$7 = $$3.get(2);
         if ($$7.f()) {
            $$3.set(2, $$6.v());
         } else if (czn.c($$7, $$6)) {
            $$7.g(1);
         }

         if ($$5.a(dmt.aW.h()) && !$$3.get(1).f() && $$3.get(1).a(czr.ro)) {
            $$3.set(1, new czn(czr.rp));
         }

         $$5.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int a(dyq $$0, czn $$1) {
      return $$0.b($$1);
   }

   private static int a(arq $$0, dxe $$1) {
      dex $$2 = new dex($$1.a(0));
      return $$1.z.a($$2, $$0).map($$0x -> ((ddk)$$0x.b()).d()).orElse(200);
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
   public boolean a(int $$0, czn $$1, @Nullable jb $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, czn $$1, jb $$2) {
      return $$2 == jb.a && $$0 == 1 ? $$1.a(czr.rp) || $$1.a(czr.ro) : true;
   }

   @Override
   public int b() {
      return this.l.size();
   }

   @Override
   protected jo<czn> f() {
      return this.l;
   }

   @Override
   protected void a(jo<czn> $$0) {
      this.l = $$0;
   }

   @Override
   public void a(int $$0, czn $$1) {
      czn $$2 = this.l.get($$0);
      boolean $$3 = !$$1.f() && czn.c($$2, $$1);
      this.l.set($$0, $$1);
      $$1.f(this.f_($$1));
      if ($$0 == 0 && !$$3 && this.n instanceof arq $$4) {
         this.x = a($$4, this);
         this.w = 0;
         this.e();
      }
   }

   @Override
   public boolean b(int $$0, czn $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         czn $$2 = this.l.get(1);
         return this.n.M().a($$1) || $$1.a(czr.ro) && !$$2.a(czr.ro);
      }
   }

   @Override
   public void a(@Nullable dej<?> $$0) {
      if ($$0 != null) {
         alf<dee<?>> $$1 = $$0.a();
         this.y.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public dej<?> d() {
      return null;
   }

   @Override
   public void a(crm $$0, List<czn> $$1) {
   }

   public void a(arr $$0) {
      List<dej<?>> $$1 = this.a($$0.y(), $$0.ds());
      $$0.a($$1);

      for (dej<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.l);
         }
      }

      this.y.clear();
   }

   public List<dej<?>> a(arq $$0, ffc $$1) {
      List<dej<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.y.reference2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<alf<dee<?>>> $$3 = (Entry<alf<dee<?>>>)var4.next();
         $$0.t().b((alf<dee<?>>)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((dej<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((ddk)$$4.b()).c());
         });
      }

      return $$2;
   }

   private static void a(arq $$0, ffc $$1, int $$2, float $$3) {
      int $$4 = azm.d((float)$$2 * $$3);
      float $$5 = azm.i((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      bww.a($$0, $$1, $$4);
   }

   @Override
   public void fillStackedContents(crs $$0) {
      for (czn $$1 : this.l) {
         $$0.b($$1);
      }
   }

   @Override
   public void a(iv $$0, eat $$1) {
      super.a($$0, $$1);
      if (this.n instanceof arq $$2) {
         this.a($$2, ffc.b($$0));
      }
   }
}

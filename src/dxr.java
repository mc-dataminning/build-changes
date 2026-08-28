import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2IntMap.Entry;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class dxr extends dxx implements bvd, cxj, cxu {
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
   private static final Codec<Map<alj<der<?>>, Integer>> t = Codec.unboundedMap(der.b, Codec.INT);
   private static final short u = 0;
   private static final short v = 0;
   private static final short w = 0;
   private static final short x = 0;
   protected jp<daa> l = jp.a(3, daa.k);
   int y;
   int z;
   int A;
   int B;
   protected final cwe m = new cwe() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dxr.this.y;
            case 1:
               return dxr.this.z;
            case 2:
               return dxr.this.A;
            case 3:
               return dxr.this.B;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dxr.this.y = $$1;
               break;
            case 1:
               dxr.this.z = $$1;
               break;
            case 2:
               dxr.this.A = $$1;
               break;
            case 3:
               dxr.this.B = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Reference2IntOpenHashMap<alj<der<?>>> C = new Reference2IntOpenHashMap();
   private final dey.a<dfk, ? extends ddx> D;

   protected dxr(dyg<?> $$0, iw $$1, ebg $$2, dfc<? extends ddx> $$3) {
      super($$0, $$1, $$2);
      this.D = dey.a($$3);
   }

   private boolean k() {
      return this.y > 0;
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      this.l = jp.a(this.b(), daa.k);
      bun.b($$0, this.l, $$1);
      this.A = $$0.b("cooking_time_spent", (short)0);
      this.B = $$0.b("cooking_total_time", (short)0);
      this.y = $$0.b("lit_time_remaining", (short)0);
      this.z = $$0.b("lit_total_time", (short)0);
      this.C.clear();
      this.C.putAll($$0.<Map>a("RecipesUsed", t).orElse(Map.of()));
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      $$0.a("cooking_time_spent", (short)this.A);
      $$0.a("cooking_total_time", (short)this.B);
      $$0.a("lit_time_remaining", (short)this.y);
      $$0.a("lit_total_time", (short)this.z);
      bun.a($$0, this.l, $$1);
      $$0.a("RecipesUsed", t, this.C);
   }

   public static void a(aru $$0, iw $$1, ebg $$2, dxr $$3) {
      boolean $$4 = $$3.k();
      boolean $$5 = false;
      if ($$3.k()) {
         $$3.y--;
      }

      daa $$6 = $$3.l.get(1);
      daa $$7 = $$3.l.get(0);
      boolean $$8 = !$$7.f();
      boolean $$9 = !$$6.f();
      if ($$3.k() || $$9 && $$8) {
         dfk $$10 = new dfk($$7);
         dew<? extends ddx> $$11;
         if ($$8) {
            $$11 = $$3.D.a($$10, $$0).orElse(null);
         } else {
            $$11 = null;
         }

         int $$13 = $$3.ao_();
         if (!$$3.k() && a($$0.J_(), $$11, $$10, $$3.l, $$13)) {
            $$3.y = $$3.a($$0.M(), $$6);
            $$3.z = $$3.y;
            if ($$3.k()) {
               $$5 = true;
               if ($$9) {
                  czw $$14 = $$6.h();
                  $$6.h(1);
                  if ($$6.f()) {
                     $$3.l.set(1, $$14.i());
                  }
               }
            }
         }

         if ($$3.k() && a($$0.J_(), $$11, $$10, $$3.l, $$13)) {
            $$3.A++;
            if ($$3.A == $$3.B) {
               $$3.A = 0;
               $$3.B = a($$0, $$3);
               if (b($$0.J_(), $$11, $$10, $$3.l, $$13)) {
                  $$3.a($$11);
               }

               $$5 = true;
            }
         } else {
            $$3.A = 0;
         }
      } else if (!$$3.k() && $$3.A > 0) {
         $$3.A = azq.a($$3.A - 2, 0, $$3.B);
      }

      if ($$4 != $$3.k()) {
         $$5 = true;
         $$2 = $$2.b(dlz.b, Boolean.valueOf($$3.k()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(ju $$0, @Nullable dew<? extends ddx> $$1, dfk $$2, jp<daa> $$3, int $$4) {
      if (!$$3.get(0).f() && $$1 != null) {
         daa $$5 = $$1.b().a($$2, $$0);
         if ($$5.f()) {
            return false;
         } else {
            daa $$6 = $$3.get(2);
            if ($$6.f()) {
               return true;
            } else if (!daa.c($$6, $$5)) {
               return false;
            } else {
               return $$6.M() < $$4 && $$6.M() < $$6.k() ? true : $$6.M() < $$5.k();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(ju $$0, @Nullable dew<? extends ddx> $$1, dfk $$2, jp<daa> $$3, int $$4) {
      if ($$1 != null && a($$0, $$1, $$2, $$3, $$4)) {
         daa $$5 = $$3.get(0);
         daa $$6 = $$1.b().a($$2, $$0);
         daa $$7 = $$3.get(2);
         if ($$7.f()) {
            $$3.set(2, $$6.v());
         } else if (daa.c($$7, $$6)) {
            $$7.g(1);
         }

         if ($$5.a(dng.aW.h()) && !$$3.get(1).f() && $$3.get(1).a(dae.ro)) {
            $$3.set(1, new daa(dae.rp));
         }

         $$5.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int a(dzd $$0, daa $$1) {
      return $$0.b($$1);
   }

   private static int a(aru $$0, dxr $$1) {
      dfk $$2 = new dfk($$1.a(0));
      return $$1.D.a($$2, $$0).map($$0x -> ((ddx)$$0x.b()).d()).orElse(200);
   }

   @Override
   public int[] a(jc $$0) {
      if ($$0 == jc.a) {
         return r;
      } else {
         return $$0 == jc.b ? q : s;
      }
   }

   @Override
   public boolean a(int $$0, daa $$1, @Nullable jc $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, daa $$1, jc $$2) {
      return $$2 == jc.a && $$0 == 1 ? $$1.a(dae.rp) || $$1.a(dae.ro) : true;
   }

   @Override
   public int b() {
      return this.l.size();
   }

   @Override
   protected jp<daa> f() {
      return this.l;
   }

   @Override
   protected void a(jp<daa> $$0) {
      this.l = $$0;
   }

   @Override
   public void a(int $$0, daa $$1) {
      daa $$2 = this.l.get($$0);
      boolean $$3 = !$$1.f() && daa.c($$2, $$1);
      this.l.set($$0, $$1);
      $$1.f(this.f_($$1));
      if ($$0 == 0 && !$$3 && this.n instanceof aru $$4) {
         this.B = a($$4, this);
         this.A = 0;
         this.e();
      }
   }

   @Override
   public boolean b(int $$0, daa $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         daa $$2 = this.l.get(1);
         return this.n.M().a($$1) || $$1.a(dae.ro) && !$$2.a(dae.ro);
      }
   }

   @Override
   public void a(@Nullable dew<?> $$0) {
      if ($$0 != null) {
         alj<der<?>> $$1 = $$0.a();
         this.C.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public dew<?> d() {
      return null;
   }

   @Override
   public void a(crz $$0, List<daa> $$1) {
   }

   public void a(arv $$0) {
      List<dew<?>> $$1 = this.a($$0.y(), $$0.dt());
      $$0.a($$1);

      for (dew<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.l);
         }
      }

      this.C.clear();
   }

   public List<dew<?>> a(aru $$0, ffs $$1) {
      List<dew<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.C.reference2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<alj<der<?>>> $$3 = (Entry<alj<der<?>>>)var4.next();
         $$0.t().b((alj<der<?>>)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((dew<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((ddx)$$4.b()).c());
         });
      }

      return $$2;
   }

   private static void a(aru $$0, ffs $$1, int $$2, float $$3) {
      int $$4 = azq.d((float)$$2 * $$3);
      float $$5 = azq.i((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      bxj.a($$0, $$1, $$4);
   }

   @Override
   public void fillStackedContents(csf $$0) {
      for (daa $$1 : this.l) {
         $$0.b($$1);
      }
   }

   @Override
   public void a(iw $$0, ebg $$1) {
      super.a($$0, $$1);
      if (this.n instanceof aru $$2) {
         this.a($$2, ffs.b($$0));
      }
   }
}

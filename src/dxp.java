import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2IntMap.Entry;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class dxp extends dxv implements bvb, cxh, cxs {
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
   private static final Codec<Map<alh<dep<?>>, Integer>> t = Codec.unboundedMap(dep.b, Codec.INT);
   private static final short u = 0;
   private static final short v = 0;
   private static final short w = 0;
   private static final short x = 0;
   protected jo<czy> l = jo.a(3, czy.k);
   int y;
   int z;
   int A;
   int B;
   protected final cwc m = new cwc() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dxp.this.y;
            case 1:
               return dxp.this.z;
            case 2:
               return dxp.this.A;
            case 3:
               return dxp.this.B;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dxp.this.y = $$1;
               break;
            case 1:
               dxp.this.z = $$1;
               break;
            case 2:
               dxp.this.A = $$1;
               break;
            case 3:
               dxp.this.B = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Reference2IntOpenHashMap<alh<dep<?>>> C = new Reference2IntOpenHashMap();
   private final dew.a<dfi, ? extends ddv> D;

   protected dxp(dye<?> $$0, iv $$1, ebe $$2, dfa<? extends ddv> $$3) {
      super($$0, $$1, $$2);
      this.D = dew.a($$3);
   }

   private boolean k() {
      return this.y > 0;
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.l = jo.a(this.b(), czy.k);
      bul.b($$0, this.l, $$1);
      this.A = $$0.b("cooking_time_spent", (short)0);
      this.B = $$0.b("cooking_total_time", (short)0);
      this.y = $$0.b("lit_time_remaining", (short)0);
      this.z = $$0.b("lit_total_time", (short)0);
      this.C.clear();
      this.C.putAll($$0.<Map>a("RecipesUsed", t).orElse(Map.of()));
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      $$0.a("cooking_time_spent", (short)this.A);
      $$0.a("cooking_total_time", (short)this.B);
      $$0.a("lit_time_remaining", (short)this.y);
      $$0.a("lit_total_time", (short)this.z);
      bul.a($$0, this.l, $$1);
      $$0.a("RecipesUsed", t, this.C);
   }

   public static void a(ars $$0, iv $$1, ebe $$2, dxp $$3) {
      boolean $$4 = $$3.k();
      boolean $$5 = false;
      if ($$3.k()) {
         $$3.y--;
      }

      czy $$6 = $$3.l.get(1);
      czy $$7 = $$3.l.get(0);
      boolean $$8 = !$$7.f();
      boolean $$9 = !$$6.f();
      if ($$3.k() || $$9 && $$8) {
         dfi $$10 = new dfi($$7);
         deu<? extends ddv> $$11;
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
                  czu $$14 = $$6.h();
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
         $$3.A = azo.a($$3.A - 2, 0, $$3.B);
      }

      if ($$4 != $$3.k()) {
         $$5 = true;
         $$2 = $$2.b(dlx.b, Boolean.valueOf($$3.k()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(jt $$0, @Nullable deu<? extends ddv> $$1, dfi $$2, jo<czy> $$3, int $$4) {
      if (!$$3.get(0).f() && $$1 != null) {
         czy $$5 = $$1.b().a($$2, $$0);
         if ($$5.f()) {
            return false;
         } else {
            czy $$6 = $$3.get(2);
            if ($$6.f()) {
               return true;
            } else if (!czy.c($$6, $$5)) {
               return false;
            } else {
               return $$6.M() < $$4 && $$6.M() < $$6.k() ? true : $$6.M() < $$5.k();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(jt $$0, @Nullable deu<? extends ddv> $$1, dfi $$2, jo<czy> $$3, int $$4) {
      if ($$1 != null && a($$0, $$1, $$2, $$3, $$4)) {
         czy $$5 = $$3.get(0);
         czy $$6 = $$1.b().a($$2, $$0);
         czy $$7 = $$3.get(2);
         if ($$7.f()) {
            $$3.set(2, $$6.v());
         } else if (czy.c($$7, $$6)) {
            $$7.g(1);
         }

         if ($$5.a(dne.aW.h()) && !$$3.get(1).f() && $$3.get(1).a(dac.ro)) {
            $$3.set(1, new czy(dac.rp));
         }

         $$5.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int a(dzb $$0, czy $$1) {
      return $$0.b($$1);
   }

   private static int a(ars $$0, dxp $$1) {
      dfi $$2 = new dfi($$1.a(0));
      return $$1.D.a($$2, $$0).map($$0x -> ((ddv)$$0x.b()).d()).orElse(200);
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
   public boolean a(int $$0, czy $$1, @Nullable jb $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, czy $$1, jb $$2) {
      return $$2 == jb.a && $$0 == 1 ? $$1.a(dac.rp) || $$1.a(dac.ro) : true;
   }

   @Override
   public int b() {
      return this.l.size();
   }

   @Override
   protected jo<czy> f() {
      return this.l;
   }

   @Override
   protected void a(jo<czy> $$0) {
      this.l = $$0;
   }

   @Override
   public void a(int $$0, czy $$1) {
      czy $$2 = this.l.get($$0);
      boolean $$3 = !$$1.f() && czy.c($$2, $$1);
      this.l.set($$0, $$1);
      $$1.f(this.f_($$1));
      if ($$0 == 0 && !$$3 && this.n instanceof ars $$4) {
         this.B = a($$4, this);
         this.A = 0;
         this.e();
      }
   }

   @Override
   public boolean b(int $$0, czy $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         czy $$2 = this.l.get(1);
         return this.n.M().a($$1) || $$1.a(dac.ro) && !$$2.a(dac.ro);
      }
   }

   @Override
   public void a(@Nullable deu<?> $$0) {
      if ($$0 != null) {
         alh<dep<?>> $$1 = $$0.a();
         this.C.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public deu<?> d() {
      return null;
   }

   @Override
   public void a(crx $$0, List<czy> $$1) {
   }

   public void a(art $$0) {
      List<deu<?>> $$1 = this.a($$0.y(), $$0.dt());
      $$0.a($$1);

      for (deu<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.l);
         }
      }

      this.C.clear();
   }

   public List<deu<?>> a(ars $$0, ffq $$1) {
      List<deu<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.C.reference2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<alh<dep<?>>> $$3 = (Entry<alh<dep<?>>>)var4.next();
         $$0.t().b((alh<dep<?>>)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((deu<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((ddv)$$4.b()).c());
         });
      }

      return $$2;
   }

   private static void a(ars $$0, ffq $$1, int $$2, float $$3) {
      int $$4 = azo.d((float)$$2 * $$3);
      float $$5 = azo.i((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      bxh.a($$0, $$1, $$4);
   }

   @Override
   public void fillStackedContents(csd $$0) {
      for (czy $$1 : this.l) {
         $$0.b($$1);
      }
   }

   @Override
   public void a(iv $$0, ebe $$1) {
      super.a($$0, $$1);
      if (this.n instanceof ars $$2) {
         this.a($$2, ffq.b($$0));
      }
   }
}

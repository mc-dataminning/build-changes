import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cwy extends cum {
   public static final MapCodec<cwy> a = b(cwy::new);
   public static final dii b = dhy.aT;
   public static final dhz c = dhy.p;
   protected static final ekn d = cva.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<cwy> a() {
      return a;
   }

   public cwy(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return d;
   }

   @Override
   public boolean g_(dhi $$0) {
      return true;
   }

   @Override
   public int a(dhi $$0, crg $$1, ht $$2, hx $$3) {
      return $$0.c(b);
   }

   private static void d(dhi $$0, csa $$1, ht $$2) {
      int $$3 = $$1.a(csj.a, $$2) - $$1.B_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * atm.b($$4));
      }

      $$3 = atm.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.a(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      if ($$3.gf()) {
         if ($$1.B) {
            return bix.a;
         } else {
            dhi $$6 = $$0.a(c);
            $$1.a($$2, $$6, 2);
            $$1.a(dls.c, $$2, dls.a.a($$3, $$6));
            d($$6, $$1, $$2);
            return bix.b;
         }
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public dbf b_(dhi $$0) {
      return dbf.c;
   }

   @Override
   public boolean f_(dhi $$0) {
      return true;
   }

   @Override
   public dfd a(ht $$0, dhi $$1) {
      return new dfs($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dfd> dfe<T> a(csa $$0, dhi $$1, dff<T> $$2) {
      return !$$0.B && $$0.D_().g() ? a($$2, dff.q, cwy::a) : null;
   }

   private static void a(csa $$0, ht $$1, dhi $$2, dfs $$3) {
      if ($$0.W() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b, c);
   }
}

import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dca extends czo {
   public static final MapCodec<dca> a = b(dca::new);
   public static final dob b = dnr.aT;
   public static final dns c = dnr.p;
   protected static final eqm d = dac.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<dca> a() {
      return a;
   }

   public dca(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return d;
   }

   @Override
   protected boolean g_(dnb $$0) {
      return true;
   }

   @Override
   protected int a(dnb $$0, cwh $$1, ib $$2, ih $$3) {
      return $$0.c(b);
   }

   private static void d(dnb $$0, cxb $$1, ib $$2) {
      int $$3 = $$1.a(cxk.a, $$2) - $$1.B_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * aww.b($$4));
      }

      $$3 = aww.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.a(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      if ($$3.gl()) {
         if ($$1.B) {
            return bnd.a;
         } else {
            dnb $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(drp.c, $$2, drp.a.a($$3, $$5));
            d($$5, $$1, $$2);
            return bnd.b;
         }
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected dgh b_(dnb $$0) {
      return dgh.c;
   }

   @Override
   protected boolean f_(dnb $$0) {
      return true;
   }

   @Override
   public dki a(ib $$0, dnb $$1) {
      return new dkx($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dki> dkj<T> a(cxb $$0, dnb $$1, dkk<T> $$2) {
      return !$$0.B && $$0.D_().g() ? a($$2, dkk.q, dca::a) : null;
   }

   private static void a(cxb $$0, ib $$1, dnb $$2, dkx $$3) {
      if ($$0.X() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b, c);
   }
}

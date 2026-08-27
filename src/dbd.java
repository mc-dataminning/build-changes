import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbd extends cyr {
   public static final MapCodec<dbd> a = b(dbd::new);
   public static final dne b = dmu.aT;
   public static final dmv c = dmu.p;
   protected static final epo d = czf.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<dbd> a() {
      return a;
   }

   public dbd(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return d;
   }

   @Override
   protected boolean g_(dme $$0) {
      return true;
   }

   @Override
   protected int a(dme $$0, cvk $$1, ib $$2, ih $$3) {
      return $$0.c(b);
   }

   private static void d(dme $$0, cwe $$1, ib $$2) {
      int $$3 = $$1.a(cwn.a, $$2) - $$1.C_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * awm.b($$4));
      }

      $$3 = awm.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.a(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      if ($$3.gh()) {
         if ($$1.B) {
            return bml.a;
         } else {
            dme $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(dqr.c, $$2, dqr.a.a($$3, $$5));
            d($$5, $$1, $$2);
            return bml.b;
         }
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected dfk b_(dme $$0) {
      return dfk.c;
   }

   @Override
   protected boolean f_(dme $$0) {
      return true;
   }

   @Override
   public djl a(ib $$0, dme $$1) {
      return new dka($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends djl> djm<T> a(cwe $$0, dme $$1, djn<T> $$2) {
      return !$$0.B && $$0.E_().g() ? a($$2, djn.q, dbd::a) : null;
   }

   private static void a(cwe $$0, ib $$1, dme $$2, dka $$3) {
      if ($$0.X() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b, c);
   }
}

import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhz extends czo implements ddk {
   public static final MapCodec<dhz> a = b(dhz::new);
   public static final dnz<dol> b = dnr.bj;

   @Override
   public MapCodec<dhz> a() {
      return a;
   }

   protected dhz(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dol.b));
   }

   @Override
   public dki a(ib $$0, dnb $$1) {
      return new dlw($$0, $$1);
   }

   @Override
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      dki $$5 = $$1.c_($$2);
      if ($$5 instanceof dlw) {
         return ((dlw)$$5).a($$3) ? bnd.a($$1.B) : bnd.d;
      } else {
         return bnd.d;
      }
   }

   @Override
   public void a(cxb $$0, ib $$1, dnb $$2, @Nullable bpp $$3, cqm $$4) {
      if (!$$0.B) {
         if ($$3 != null) {
            dki $$5 = $$0.c_($$1);
            if ($$5 instanceof dlw) {
               ((dlw)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected dgh b_(dnb $$0) {
      return dgh.c;
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dac $$3, ib $$4, boolean $$5) {
      if ($$1 instanceof apf) {
         if ($$1.c_($$2) instanceof dlw $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.B();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((apf)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(apf $$0, dlw $$1) {
      switch ($$1.t()) {
         case a:
            $$1.b(false);
            break;
         case b:
            $$1.c($$0);
            break;
         case c:
            $$1.z();
         case d:
      }
   }
}

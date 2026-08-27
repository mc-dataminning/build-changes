import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhx extends czm implements ddi {
   public static final MapCodec<dhx> a = b(dhx::new);
   public static final dnx<doj> b = dnp.bj;

   @Override
   public MapCodec<dhx> a() {
      return a;
   }

   protected dhx(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, doj.b));
   }

   @Override
   public dkg a(ib $$0, dmz $$1) {
      return new dlu($$0, $$1);
   }

   @Override
   protected bnc a(dmz $$0, cwz $$1, ib $$2, cis $$3, epn $$4) {
      dkg $$5 = $$1.c_($$2);
      if ($$5 instanceof dlu) {
         return ((dlu)$$5).a($$3) ? bnc.a($$1.B) : bnc.d;
      } else {
         return bnc.d;
      }
   }

   @Override
   public void a(cwz $$0, ib $$1, dmz $$2, @Nullable bpo $$3, cqk $$4) {
      if (!$$0.B) {
         if ($$3 != null) {
            dkg $$5 = $$0.c_($$1);
            if ($$5 instanceof dlu) {
               ((dlu)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected dgf b_(dmz $$0) {
      return dgf.c;
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, daa $$3, ib $$4, boolean $$5) {
      if ($$1 instanceof apf) {
         if ($$1.c_($$2) instanceof dlu $$7) {
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

   private void a(apf $$0, dlu $$1) {
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

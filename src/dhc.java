import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhc extends cyr implements dcn {
   public static final MapCodec<dhc> a = b(dhc::new);
   public static final dnc<dno> b = dmu.bj;

   @Override
   public MapCodec<dhc> a() {
      return a;
   }

   protected dhc(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dno.b));
   }

   @Override
   public djl a(ib $$0, dme $$1) {
      return new dkz($$0, $$1);
   }

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      djl $$5 = $$1.c_($$2);
      if ($$5 instanceof dkz) {
         return ((dkz)$$5).a($$3) ? bml.a($$1.B) : bml.d;
      } else {
         return bml.d;
      }
   }

   @Override
   public void a(cwe $$0, ib $$1, dme $$2, @Nullable box $$3, cpq $$4) {
      if (!$$0.B) {
         if ($$3 != null) {
            djl $$5 = $$0.c_($$1);
            if ($$5 instanceof dkz) {
               ((dkz)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected dfk b_(dme $$0) {
      return dfk.c;
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, czf $$3, ib $$4, boolean $$5) {
      if ($$1 instanceof apa) {
         if ($$1.c_($$2) instanceof dkz $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.B();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((apa)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(apa $$0, dkz $$1) {
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

import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnf extends det implements dip {
   public static final MapCodec<dnf> a = b(dnf::new);
   public static final dti<dtu> b = dta.bj;

   @Override
   public MapCodec<dnf> a() {
      return a;
   }

   protected dnf(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dtu.b));
   }

   @Override
   public dpp a(ja $$0, dsk $$1) {
      return new drf($$0, $$1);
   }

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      dpp $$5 = $$1.c_($$2);
      if ($$5 instanceof drf) {
         return ((drf)$$5).a($$3) ? bqg.a($$1.B) : bqg.e;
      } else {
         return bqg.e;
      }
   }

   @Override
   public void a(dcf $$0, ja $$1, dsk $$2, @Nullable btb $$3, cuc $$4) {
      if (!$$0.B) {
         if ($$3 != null) {
            dpp $$5 = $$0.c_($$1);
            if ($$5 instanceof drf) {
               ((drf)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected dln a_(dsk $$0) {
      return dln.c;
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dfh $$3, ja $$4, boolean $$5) {
      if ($$1 instanceof aqm) {
         if ($$1.c_($$2) instanceof drf $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.D();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((aqm)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(aqm $$0, drf $$1) {
      switch ($$1.v()) {
         case a:
            $$1.b(false);
            break;
         case b:
            $$1.c($$0);
            break;
         case c:
            $$1.B();
         case d:
      }
   }
}

import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class dmh extends det implements dmi {
   public static final dtb f = dta.C;
   protected static final float g = 4.0F;
   protected static final ewy h = dfh.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dtx a;

   protected dmh(dtx $$0, dsj.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dmh> a();

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eoi.c, eoi.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return h;
   }

   @Override
   public boolean a(dsk $$0) {
      return true;
   }

   @Override
   public dpp a(ja $$0, dsk $$1) {
      return new dra($$0, $$1);
   }

   @Override
   protected bqi a(cuc $$0, dsk $$1, dcf $$2, ja $$3, cmk $$4, bqf $$5, ewb $$6) {
      if ($$2.c_($$3) instanceof dra $$7) {
         cve $$10 = $$0.g() instanceof cve $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.gl();
         if (!$$2.B) {
            if ($$11 && !$$7.v() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(avr.c.b($$0.g()));
                  $$2.a(dxg.c, $$7.az_(), dxg.a.a($$4, $$7.n()));
                  $$0.a(1, $$4);
                  return bqi.a;
               } else {
                  return bqi.d;
               }
            } else {
               return bqi.d;
            }
         } else {
            return !$$11 && !$$7.v() ? bqi.b : bqi.a;
         }
      } else {
         return bqi.e;
      }
   }

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      if ($$1.c_($$2) instanceof dra $$5) {
         if ($$1.B) {
            ac.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.v()) {
            $$1.a(null, $$5.az_(), $$5.d(), avi.e);
            return bqg.a;
         } else if ($$8) {
            return bqg.a;
         } else if (!this.a($$3, $$5) && $$3.gl() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return bqg.a;
         } else {
            return bqg.e;
         }
      } else {
         return bqg.e;
      }
   }

   private boolean b(cmk $$0, dra $$1, boolean $$2) {
      drb $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.Y())).allMatch($$0x -> $$0x.equals(wt.a) || $$0x.b() instanceof yb);
   }

   public abstract float g(dsk var1);

   public ewf m(dsk $$0) {
      return new ewf(0.5, 0.5, 0.5);
   }

   @Override
   protected eoh b_(dsk $$0) {
      return $$0.c(f) ? eoi.c.a(false) : super.b_($$0);
   }

   public dtx d() {
      return this.a;
   }

   public static dtx a(dfh $$0) {
      dtx $$1;
      if ($$0 instanceof dmh) {
         $$1 = ((dmh)$$0).d();
      } else {
         $$1 = dtx.b;
      }

      return $$1;
   }

   public void a(cmk $$0, dra $$1, boolean $$2) {
      $$1.a($$0.cA());
      $$0.a($$1, $$2);
   }

   private boolean a(cmk $$0, dra $$1) {
      UUID $$2 = $$1.u();
      return $$2 != null && !$$2.equals($$0.cA());
   }

   @Nullable
   @Override
   public <T extends dpp> dpq<T> a(dcf $$0, dsk $$1, dpr<T> $$2) {
      return a($$2, dpr.h, dra::a);
   }
}

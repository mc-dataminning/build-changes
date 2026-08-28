import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnq extends dfh {
   public static final MapCodec<dnq> a = b(dnq::new);
   public static final dtb b = dta.B;

   @Override
   public MapCodec<dnq> a() {
      return a;
   }

   public dnq(dsj.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.C($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dfh $$3, ja $$4, boolean $$5) {
      if ($$1.C($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public dsk a(dcf $$0, ja $$1, dsk $$2, cmk $$3) {
      if (!$$0.x_() && !$$3.f() && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dcf $$0, ja $$1, dbx $$2) {
      if (!$$0.B) {
         civ $$3 = new civ($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.f());
         int $$4 = $$3.u();
         $$3.b((short)($$0.z.a($$4 / 4) + $$4 / 8));
         $$0.b($$3);
      }
   }

   public static void a(dcf $$0, ja $$1) {
      a($$0, $$1, null);
   }

   private static void a(dcf $$0, ja $$1, @Nullable btb $$2) {
      if (!$$0.B) {
         civ $$3 = new civ($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.dv(), $$3.dx(), $$3.dB(), avh.zy, avi.e, 1.0F, 1.0F);
         $$0.a($$2, dxg.I, $$1);
      }
   }

   @Override
   protected bqi a(cuc $$0, dsk $$1, dcf $$2, ja $$3, cmk $$4, bqf $$5, ewb $$6) {
      if (!$$0.a(cuf.os) && !$$0.a(cuf.tX)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         a($$2, $$3, $$4);
         $$2.a($$3, dfj.a.o(), 11);
         ctx $$7 = $$0.g();
         if ($$0.a(cuf.os)) {
            $$0.a(1, $$4, btb.d($$5));
         } else {
            $$0.a(1, $$4);
         }

         $$4.b(avr.c.b($$7));
         return bqi.a($$2.B);
      }
   }

   @Override
   protected void a(dcf $$0, dsk $$1, ewb $$2, cnc $$3) {
      if (!$$0.B) {
         ja $$4 = $$2.a();
         bsg $$5 = $$3.s();
         if ($$3.bR() && $$3.a($$0, $$4)) {
            a($$0, $$4, $$5 instanceof btb ? (btb)$$5 : null);
            $$0.a($$4, false);
         }
      }
   }

   @Override
   public boolean a(dbx $$0) {
      return false;
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b);
   }
}

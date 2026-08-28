import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkq extends dfh {
   public static final MapCodec<dkq> a = b(dkq::new);
   public static final dti<dtl> b = dta.bf;
   public static final dtb c = dta.w;
   public static final dtk d = dta.aR;
   public static final int e = 3;

   @Override
   public MapCodec<dkq> a() {
      return a;
   }

   public dkq(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dtl.a).a(d, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   private dsk b(dcg $$0, ja $$1, dsk $$2) {
      dtl $$3 = $$0.a_($$1.c()).A();
      if ($$3.e()) {
         return $$2.a(b, $$3);
      } else {
         dtl $$4 = $$0.a_($$1.d()).A();
         dtl $$5 = $$4.e() ? dtl.a : $$4;
         return $$2.a(b, $$5);
      }
   }

   @Override
   public dsk a(cxm $$0) {
      return this.b($$0.q(), $$0.a(), this.o());
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      boolean $$6 = $$1.o() == jf.a.b;
      return $$6 ? this.b($$3, $$4, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dfh $$3, ja $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable bsg $$0, dsk $$1, dcf $$2, ja $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.c()).i()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, dxg.H, $$3);
      }
   }

   @Override
   protected bqi a(cuc $$0, dsk $$1, dcf $$2, ja $$3, cmk $$4, bqf $$5, ewb $$6) {
      return $$0.a(awf.bg) && $$6.b() == jf.b ? bqi.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      if ($$1.B) {
         return bqg.a;
      } else {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(avr.ag);
         return bqg.c;
      }
   }

   @Override
   protected void a_(dsk $$0, dcf $$1, ja $$2, cmk $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(avr.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   protected boolean a(dsk $$0, dcf $$1, ja $$2, int $$3, int $$4) {
      dtl $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(lj.aa, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      jj<avg> $$10;
      if ($$5.d()) {
         akk $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = jj.a(avg.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, avi.c, 3.0F, $$7, $$1.z.g());
      return true;
   }

   @Nullable
   private akk a(dcf $$0, ja $$1) {
      return $$0.c_($$1.c()) instanceof drc $$2 ? $$2.d() : null;
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b, c, d);
   }
}

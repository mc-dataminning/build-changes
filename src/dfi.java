import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dfi extends dfy implements dna {
   public static final dtt d = dts.C;
   private static final ext a = dfy.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected dfi(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends dfi> a();

   protected void a(dtc $$0, dcx $$1, jd $$2) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this, 60 + $$1.E_().a(40));
      }
   }

   protected static boolean e(dtc $$0, dcc $$1, jd $$2) {
      if ($$0.c(d)) {
         return true;
      } else {
         for (ji $$3 : ji.values()) {
            if ($$1.b_($$2.a($$3)).a(awk.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      epc $$1 = $$0.q().b_($$0.a());
      return this.o().a(d, Boolean.valueOf($$1.a(awk.a) && $$1.e() == 8));
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return a;
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, epd.c, epd.c.a($$3));
      }

      return $$1 == ji.a && !this.a($$0, (dcz)$$3, $$4) ? dga.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      jd $$3 = $$2.e();
      return $$1.a_($$3).d($$1, $$3, ji.b);
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(d);
   }

   @Override
   protected epc b_(dtc $$0) {
      return $$0.c(d) ? epd.c.a(false) : super.b_($$0);
   }
}

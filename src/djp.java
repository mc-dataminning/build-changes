import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djp extends dfy implements dna {
   public static final MapCodec<djp> a = b(djp::new);
   private static final dtt c = dts.C;
   protected static final ext b = dfy.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<djp> a() {
      return a;
   }

   protected djp(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(c);
   }

   @Override
   protected epc b_(dtc $$0) {
      return $$0.c(c) ? epd.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      dtc $$1 = super.a($$0);
      if ($$1 != null) {
         epc $$2 = $$0.q().b_($$0.a());
         return $$1.a(c, Boolean.valueOf($$2.a() == epd.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      jd $$3 = $$2.d();
      dtc $$4 = $$1.a_($$3);
      return $$4.d($$1, $$3, ji.a);
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return b;
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$1 == ji.b && !this.a($$0, $$3, $$4)) {
         return dga.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, epd.c, epd.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}

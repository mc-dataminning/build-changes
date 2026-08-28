import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkf extends dfy implements dna {
   public static final MapCodec<dkf> a = b(dkf::new);
   public static final dtt b = dts.j;
   public static final dtt c = dts.C;
   protected static final exv d = exs.a(dfy.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), dfy.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final exv e = exs.a(dfy.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), dfy.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<dkf> a() {
      return a;
   }

   public dkf(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      epe $$1 = $$0.q().b_($$0.a());

      for (ji $$2 : $$0.f()) {
         if ($$2.o() == ji.a.b) {
            dtc $$3 = this.o().a(b, Boolean.valueOf($$2 == ji.b));
            if ($$3.a((dcz)$$0.q(), $$0.a())) {
               return $$3.a(c, Boolean.valueOf($$1.a() == epf.c));
            }
         }
      }

      return null;
   }

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      ji $$3 = m($$0).g();
      return dfy.a($$1, $$2.a($$3), $$3.g());
   }

   protected static ji m(dtc $$0) {
      return $$0.c(b) ? ji.a : ji.b;
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? dga.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(c) ? epf.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }
}

import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dke extends dfy implements dna {
   public static final MapCodec<dke> a = b(dke::new);
   public static final dtw b = dju.aE;
   public static final dtt c = dts.C;
   protected static final float d = 3.0F;
   protected static final exv e = dfy.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final exv f = dfy.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final exv g = dfy.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final exv h = dfy.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<dke> a() {
      return a;
   }

   protected dke(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ji.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      switch ((ji)$$0.c(b)) {
         case c:
            return h;
         case d:
            return g;
         case e:
            return f;
         case f:
         default:
            return e;
      }
   }

   private boolean a(dcc $$0, jd $$1, ji $$2) {
      dtc $$3 = $$0.a_($$1);
      return $$3.d($$0, $$1, $$2);
   }

   @Override
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      ji $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$1.g() == $$0.c(b) && !$$0.a($$3, $$4)) {
         return dga.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, epf.c, epf.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      if (!$$0.c()) {
         dtc $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      dtc $$2 = this.o();
      dcz $$3 = $$0.q();
      jd $$4 = $$0.a();
      epe $$5 = $$0.q().b_($$0.a());

      for (ji $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.a(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.a(c, Boolean.valueOf($$5.a() == epf.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dtc a(dtc $$0, dmm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dtc a(dtc $$0, dkv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(c) ? epf.c.a(false) : super.b_($$0);
   }
}

import com.mojang.serialization.MapCodec;

public class dnz extends dfy {
   public static final MapCodec<dnz> a = b(dnz::new);
   public static final duc b = dts.aw;
   protected static final float c = 6.0F;
   protected static final exv d = dfy.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dnz> a() {
      return a;
   }

   protected dnz(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      return d;
   }

   @Override
   protected void a(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      if ($$1.u($$2.d())) {
         int $$4 = 1;

         while ($$1.a_($$2.c($$4)).a(this)) {
            $$4++;
         }

         if ($$4 < 3) {
            int $$5 = $$0.c(b);
            if ($$5 == 15) {
               $$1.b($$2.d(), this.o());
               $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 4);
            } else {
               $$1.a($$2, $$0.a(b, Integer.valueOf($$5 + 1)), 4);
            }
         }
      }
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      dtc $$3 = $$1.a_($$2.e());
      if ($$3.a(this)) {
         return true;
      } else {
         if ($$3.a(awe.ag) || $$3.a(awe.I)) {
            jd $$4 = $$2.e();

            for (ji $$5 : ji.c.a) {
               dtc $$6 = $$1.a_($$4.a($$5));
               epe $$7 = $$1.b_($$4.a($$5));
               if ($$7.a(awk.a) || $$6.a(dga.kI)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(b);
   }
}

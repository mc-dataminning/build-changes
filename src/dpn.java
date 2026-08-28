import com.mojang.serialization.MapCodec;

public class dpn extends dhm {
   public static final MapCodec<dpn> a = b(dpn::new);
   public static final dvs b = dvi.aw;
   protected static final float c = 6.0F;
   protected static final ezq d = dhm.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dpn> a() {
      return a;
   }

   protected dpn(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return d;
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(dus $$0, arj $$1, jf $$2, azn $$3) {
      if ($$1.u($$2.d())) {
         int $$4 = 1;

         while ($$1.a_($$2.c($$4)).a(this)) {
            $$4++;
         }

         if ($$4 < 3) {
            int $$5 = $$0.c(b);
            if ($$5 == 15) {
               $$1.b($$2.d(), this.n());
               $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 4);
            } else {
               $$1.a($$2, $$0.b(b, Integer.valueOf($$5 + 1)), 4);
            }
         }
      }
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      dus $$3 = $$1.a_($$2.e());
      if ($$3.a(this)) {
         return true;
      } else {
         if ($$3.a(awv.ag) || $$3.a(awv.I)) {
            jf $$4 = $$2.e();

            for (jk $$5 : jk.c.a) {
               dus $$6 = $$1.a_($$4.a($$5));
               eqt $$7 = $$1.b_($$4.a($$5));
               if ($$7.a(axb.a) || $$6.a(dho.kI)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b);
   }
}

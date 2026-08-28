import com.mojang.serialization.MapCodec;

public class dvy extends dno {
   public static final MapCodec<dvy> a = b(dvy::new);
   public static final ecq b = ecg.az;
   private static final fgw c = dno.b(12.0, 0.0, 16.0);

   @Override
   public MapCodec<dvy> a() {
      return a;
   }

   protected dvy(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return c;
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if ($$1.v($$2.d())) {
         int $$4 = 1;

         while ($$1.a_($$2.c($$4)).a(this)) {
            $$4++;
         }

         if ($$4 < 3) {
            int $$5 = $$0.c(b);
            if ($$5 == 15) {
               $$1.b($$2.d(), this.m());
               $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 260);
            } else {
               $$1.a($$2, $$0.b(b, Integer.valueOf($$5 + 1)), 260);
            }
         }
      }
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      ebq $$3 = $$1.a_($$2.e());
      if ($$3.a(this)) {
         return true;
      } else {
         if ($$3.a(axn.ah) || $$3.a(axn.J)) {
            iw $$4 = $$2.e();

            for (jc $$5 : jc.c.a) {
               ebq $$6 = $$1.a_($$4.a($$5));
               eya $$7 = $$1.b_($$4.a($$5));
               if ($$7.a(axs.a) || $$6.a(dnq.lo)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b);
   }
}

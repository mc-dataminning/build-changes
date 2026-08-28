import com.mojang.serialization.MapCodec;

public class dvo extends dne {
   public static final MapCodec<dvo> a = b(dvo::new);
   public static final ecg b = ebw.az;
   private static final fgm c = dne.b(12.0, 0.0, 16.0);

   @Override
   public MapCodec<dvo> a() {
      return a;
   }

   protected dvo(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return c;
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(ebg $$0, aru $$1, iw $$2, azz $$3) {
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
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      ebg $$3 = $$1.a_($$2.e());
      if ($$3.a(this)) {
         return true;
      } else {
         if ($$3.a(axg.ah) || $$3.a(axg.J)) {
            iw $$4 = $$2.e();

            for (jc $$5 : jc.c.a) {
               ebg $$6 = $$1.a_($$4.a($$5));
               exq $$7 = $$1.b_($$4.a($$5));
               if ($$7.a(axl.a) || $$6.a(dng.lo)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b);
   }
}

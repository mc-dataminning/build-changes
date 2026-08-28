import com.mojang.serialization.MapCodec;

public class dvm extends dnc {
   public static final MapCodec<dvm> a = b(dvm::new);
   public static final ece b = ebu.az;
   private static final fgk c = dnc.b(12.0, 0.0, 16.0);

   @Override
   public MapCodec<dvm> a() {
      return a;
   }

   protected dvm(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return c;
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(ebe $$0, ars $$1, iv $$2, azx $$3) {
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
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      ebe $$3 = $$1.a_($$2.e());
      if ($$3.a(this)) {
         return true;
      } else {
         if ($$3.a(axe.ah) || $$3.a(axe.J)) {
            iv $$4 = $$2.e();

            for (jb $$5 : jb.c.a) {
               ebe $$6 = $$1.a_($$4.a($$5));
               exo $$7 = $$1.b_($$4.a($$5));
               if ($$7.a(axj.a) || $$6.a(dne.lo)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b);
   }
}

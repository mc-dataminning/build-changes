import com.mojang.serialization.MapCodec;

public class dde extends cvf {
   public static final MapCodec<dde> a = b(dde::new);
   public static final din b = did.aw;
   protected static final float c = 6.0F;
   protected static final eks d = cvf.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dde> a() {
      return a;
   }

   protected dde(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return d;
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public void b(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if ($$1.t($$2.c())) {
         int $$4 = 1;

         while ($$1.a_($$2.c($$4)).a(this)) {
            $$4++;
         }

         if ($$4 < 3) {
            int $$5 = $$0.c(b);
            if ($$5 == 15) {
               $$1.b($$2.c(), this.o());
               $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 4);
            } else {
               $$1.a($$2, $$0.a(b, Integer.valueOf($$5 + 1)), 4);
            }
         }
      }
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      dhn $$3 = $$1.a_($$2.d());
      if ($$3.a(this)) {
         return true;
      } else {
         if ($$3.a(ark.af) || $$3.a(ark.H)) {
            hx $$4 = $$2.d();

            for (ib $$5 : ib.c.a) {
               dhn $$6 = $$1.a_($$4.a($$5));
               ecx $$7 = $$1.b_($$4.a($$5));
               if ($$7.a(arp.a) || $$6.a(cvh.kI)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b);
   }
}

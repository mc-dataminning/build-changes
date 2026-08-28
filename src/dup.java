import com.mojang.serialization.MapCodec;

public class dup extends dmf {
   public static final MapCodec<dup> a = b(dup::new);
   public static final ebh b = eax.az;
   private static final ffk c = dmf.b(12.0, 0.0, 16.0);

   @Override
   public MapCodec<dup> a() {
      return a;
   }

   protected dup(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return c;
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, azv $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(eah $$0, arq $$1, iu $$2, azv $$3) {
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
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      eah $$3 = $$1.a_($$2.e());
      if ($$3.a(this)) {
         return true;
      } else {
         if ($$3.a(axc.ah) || $$3.a(axc.J)) {
            iu $$4 = $$2.e();

            for (ja $$5 : ja.c.a) {
               eah $$6 = $$1.a_($$4.a($$5));
               ewo $$7 = $$1.b_($$4.a($$5));
               if ($$7.a(axh.a) || $$6.a(dmh.lo)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b);
   }
}

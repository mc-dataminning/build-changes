import com.mojang.serialization.MapCodec;

public class dua extends dlu {
   public static final MapCodec<dua> a = b(dua::new);
   public static final eao b = eae.az;
   private static final feq c = dlu.b(12.0, 0.0, 16.0);

   @Override
   public MapCodec<dua> a() {
      return a;
   }

   protected dua(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return c;
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(dzo $$0, aro $$1, iu $$2, azt $$3) {
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
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      dzo $$3 = $$1.a_($$2.e());
      if ($$3.a(this)) {
         return true;
      } else {
         if ($$3.a(axa.ah) || $$3.a(axa.J)) {
            iu $$4 = $$2.e();

            for (ja $$5 : ja.c.a) {
               dzo $$6 = $$1.a_($$4.a($$5));
               evv $$7 = $$1.b_($$4.a($$5));
               if ($$7.a(axf.a) || $$6.a(dlw.lk)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b);
   }
}

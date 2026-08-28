import com.mojang.serialization.MapCodec;

public class dow extends dgv {
   public static final MapCodec<dow> a = b(dow::new);
   public static final dva b = duq.aw;
   protected static final float c = 6.0F;
   protected static final eyx d = dgv.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dow> a() {
      return a;
   }

   protected dow(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return d;
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, azk $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(dua $$0, arg $$1, je $$2, azk $$3) {
      if ($$1.u($$2.d())) {
         int $$4 = 1;

         while ($$1.a_($$2.c($$4)).a(this)) {
            $$4++;
         }

         if ($$4 < 3) {
            int $$5 = $$0.c(b);
            if ($$5 == 15) {
               $$1.b($$2.d(), this.o());
               $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 4);
            } else {
               $$1.a($$2, $$0.b(b, Integer.valueOf($$5 + 1)), 4);
            }
         }
      }
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      dua $$3 = $$1.a_($$2.e());
      if ($$3.a(this)) {
         return true;
      } else {
         if ($$3.a(aws.ag) || $$3.a(aws.I)) {
            je $$4 = $$2.e();

            for (jj $$5 : jj.c.a) {
               dua $$6 = $$1.a_($$4.a($$5));
               eqb $$7 = $$1.b_($$4.a($$5));
               if ($$7.a(awy.a) || $$6.a(dgx.kI)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b);
   }
}

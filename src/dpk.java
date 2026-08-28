import com.mojang.serialization.MapCodec;

public class dpk extends dhj {
   public static final MapCodec<dpk> a = b(dpk::new);
   public static final dvo b = dve.aw;
   protected static final float c = 6.0F;
   protected static final ezm d = dhj.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dpk> a() {
      return a;
   }

   protected dpk(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return d;
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(duo $$0, arh $$1, je $$2, azl $$3) {
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
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      duo $$3 = $$1.a_($$2.e());
      if ($$3.a(this)) {
         return true;
      } else {
         if ($$3.a(awt.ag) || $$3.a(awt.I)) {
            je $$4 = $$2.e();

            for (jj $$5 : jj.c.a) {
               duo $$6 = $$1.a_($$4.a($$5));
               eqp $$7 = $$1.b_($$4.a($$5));
               if ($$7.a(awz.a) || $$6.a(dhl.kI)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b);
   }
}

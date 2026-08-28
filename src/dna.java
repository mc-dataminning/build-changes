import com.mojang.serialization.MapCodec;

public class dna extends dfa {
   public static final MapCodec<dna> a = b(dna::new);
   public static final dtd b = dst.aw;
   protected static final float c = 6.0F;
   protected static final ewl d = dfa.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dna> a() {
      return a;
   }

   protected dna(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return d;
   }

   @Override
   protected void a(dsd $$0, arf $$1, iz $$2, azh $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(dsd $$0, arf $$1, iz $$2, azh $$3) {
      if ($$1.u($$2.c())) {
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
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      dsd $$3 = $$1.a_($$2.d());
      if ($$3.a(this)) {
         return true;
      } else {
         if ($$3.a(awp.af) || $$3.a(awp.H)) {
            iz $$4 = $$2.d();

            for (je $$5 : je.c.a) {
               dsd $$6 = $$1.a_($$4.a($$5));
               enw $$7 = $$1.b_($$4.a($$5));
               if ($$7.a(awv.a) || $$6.a(dfc.kI)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b);
   }
}

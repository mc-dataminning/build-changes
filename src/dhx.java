import com.mojang.serialization.MapCodec;

public class dhx extends dhm {
   public static final MapCodec<dhx> a = b(dhx::new);
   public static final dvs b = dvi.aw;
   public static final int c = 15;
   protected static final int d = 1;
   protected static final ezq e = dhm.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   protected static final ezq f = dhm.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dhx> a() {
      return a;
   }

   protected dhx(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(dus $$0, arj $$1, jf $$2, azn $$3) {
      jf $$4 = $$2.d();
      if ($$1.u($$4)) {
         int $$5 = 1;

         while ($$1.a_($$2.c($$5)).a(this)) {
            $$5++;
         }

         if ($$5 < 3) {
            int $$6 = $$0.c(b);
            if ($$6 == 15) {
               $$1.b($$4, this.n());
               dus $$7 = $$0.b(b, Integer.valueOf(0));
               $$1.a($$2, $$7, 4);
               $$1.a($$7, $$4, this, null, false);
            } else {
               $$1.a($$2, $$0.b(b, Integer.valueOf($$6 + 1)), 4);
            }
         }
      }
   }

   @Override
   protected ezq b(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return e;
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return f;
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
      for (jk $$3 : jk.c.a) {
         dus $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(axb.b)) {
            return false;
         }
      }

      dus $$5 = $$1.a_($$2.e());
      return ($$5.a(dho.dQ) || $$5.a(awv.I)) && !$$1.a_($$2.d()).n();
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, btr $$3) {
      $$3.a($$1.ak().k(), 1.0F);
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }
}

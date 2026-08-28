import com.mojang.serialization.MapCodec;

public class dhg extends dgv {
   public static final MapCodec<dhg> a = b(dhg::new);
   public static final dva b = duq.aw;
   public static final int c = 15;
   protected static final int d = 1;
   protected static final eyx e = dgv.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   protected static final eyx f = dgv.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dhg> a() {
      return a;
   }

   protected dhg(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, azk $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(dua $$0, arg $$1, je $$2, azk $$3) {
      je $$4 = $$2.d();
      if ($$1.u($$4)) {
         int $$5 = 1;

         while ($$1.a_($$2.c($$5)).a(this)) {
            $$5++;
         }

         if ($$5 < 3) {
            int $$6 = $$0.c(b);
            if ($$6 == 15) {
               $$1.b($$4, this.o());
               dua $$7 = $$0.b(b, Integer.valueOf(0));
               $$1.a($$2, $$7, 4);
               $$1.a($$7, $$4, this, null, false);
            } else {
               $$1.a($$2, $$0.b(b, Integer.valueOf($$6 + 1)), 4);
            }
         }
      }
   }

   @Override
   protected eyx b(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return e;
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return f;
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
      for (jj $$3 : jj.c.a) {
         dua $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(awy.b)) {
            return false;
         }
      }

      dua $$5 = $$1.a_($$2.e());
      return ($$5.a(dgx.dQ) || $$5.a(aws.I)) && !$$1.a_($$2.d()).n();
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, btj $$3) {
      $$3.a($$1.ak().k(), 1.0F);
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
      return false;
   }
}

import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class dhk extends dli implements dhp, doo {
   public static final MapCodec<dhk> a = b(dhk::new);
   private static final dvj f = dvi.C;
   private static final int g = 6;
   protected static final ezq b = dhm.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final ezq c = dhm.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final ezq d = dhm.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final ezq e = dhm.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<dhk> a() {
      return a;
   }

   protected dhk(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(f, Boolean.valueOf(false)).b(aF, jk.c));
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      switch ((jk)$$0.c(aF)) {
         case d:
            return c;
         case c:
         default:
            return b;
         case e:
            return e;
         case f:
            return d;
      }
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(f, aF);
   }

   @Override
   protected eqt b_(dus $$0) {
      return $$0.c(f) ? equ.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      jf $$3 = $$2.e();
      dus $$4 = $$1.a_($$3);
      dus $$5 = $$1.a_($$2.d());
      return ($$4.a(this) || $$4.a(awv.bz)) && ($$5.a(this) || $$5.a(dho.sD));
   }

   protected static boolean a(dek $$0, jf $$1, eqt $$2, jk $$3) {
      dus $$4 = dho.sE.n().b(f, Boolean.valueOf($$2.a(equ.c))).b(aF, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if (($$1 == jk.a || $$1 == jk.b) && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$0.c(f)) {
         $$3.a($$4, equ.c, equ.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean b(dem $$0, jf $$1, dus $$2) {
      Optional<jf> $$3 = l.a($$0, $$1, $$2.b(), jk.b, dho.sD);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jf $$4 = $$3.get().d();
         dus $$5 = $$0.a_($$4);
         return dhj.a($$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(dej $$0, azn $$1, jf $$2, dus $$3) {
      return true;
   }

   @Override
   public void a(arj $$0, azn $$1, jf $$2, dus $$3) {
      Optional<jf> $$4 = l.a($$0, $$2, $$3.b(), jk.b, dho.sD);
      if (!$$4.isEmpty()) {
         jf $$5 = $$4.get();
         jf $$6 = $$5.d();
         jk $$7 = $$3.c(aF);
         a($$0, $$5, $$0.b_($$5), $$7);
         dhj.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public cvs a(dem $$0, jf $$1, dus $$2) {
      return new cvs(dho.sD);
   }
}

import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class dhh extends dlf implements dhm, dol {
   public static final MapCodec<dhh> a = b(dhh::new);
   private static final dvf f = dve.C;
   private static final int g = 6;
   protected static final ezm b = dhj.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final ezm c = dhj.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final ezm d = dhj.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final ezm e = dhj.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<dhh> a() {
      return a;
   }

   protected dhh(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(f, Boolean.valueOf(false)).b(aF, jj.c));
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      switch ((jj)$$0.c(aF)) {
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
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(f, aF);
   }

   @Override
   protected eqp b_(duo $$0) {
      return $$0.c(f) ? eqq.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      je $$3 = $$2.e();
      duo $$4 = $$1.a_($$3);
      duo $$5 = $$1.a_($$2.d());
      return ($$4.a(this) || $$4.a(awt.bz)) && ($$5.a(this) || $$5.a(dhl.sD));
   }

   protected static boolean a(deh $$0, je $$1, eqp $$2, jj $$3) {
      duo $$4 = dhl.sE.o().b(f, Boolean.valueOf($$2.a(eqq.c))).b(aF, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if (($$1 == jj.a || $$1 == jj.b) && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$0.c(f)) {
         $$3.a($$4, eqq.c, eqq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean b(dej $$0, je $$1, duo $$2) {
      Optional<je> $$3 = l.a($$0, $$1, $$2.b(), jj.b, dhl.sD);
      if ($$3.isEmpty()) {
         return false;
      } else {
         je $$4 = $$3.get().d();
         duo $$5 = $$0.a_($$4);
         return dhg.a($$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(deg $$0, azl $$1, je $$2, duo $$3) {
      return true;
   }

   @Override
   public void a(arh $$0, azl $$1, je $$2, duo $$3) {
      Optional<je> $$4 = l.a($$0, $$2, $$3.b(), jj.b, dhl.sD);
      if (!$$4.isEmpty()) {
         je $$5 = $$4.get();
         je $$6 = $$5.d();
         jj $$7 = $$3.c(aF);
         a($$0, $$5, $$0.b_($$5), $$7);
         dhg.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public cvp a(dej $$0, je $$1, duo $$2) {
      return new cvp(dhl.sD);
   }
}

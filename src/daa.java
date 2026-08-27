import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class daa extends ddx implements daf, dhc {
   public static final MapCodec<daa> a = b(daa::new);
   private static final dns f = dnr.C;
   private static final int g = 6;
   protected static final eqm b = dac.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final eqm c = dac.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final eqm d = dac.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final eqm e = dac.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<daa> a() {
      return a;
   }

   protected daa(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(aE, ih.c));
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      switch ((ih)$$0.c(aE)) {
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
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(f, aE);
   }

   @Override
   protected eip c_(dnb $$0) {
      return $$0.c(f) ? eiq.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      ib $$3 = $$2.d();
      dnb $$4 = $$1.a_($$3);
      dnb $$5 = $$1.a_($$2.c());
      return ($$4.a(this) || $$4.a(aun.by)) && ($$5.a(this) || $$5.a(dae.sD));
   }

   protected static boolean a(cxc $$0, ib $$1, eip $$2, ih $$3) {
      dnb $$4 = dae.sE.o().a(f, Boolean.valueOf($$2.a(eiq.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if (($$1 == ih.a || $$1 == ih.b) && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$0.c(f)) {
         $$3.a($$4, eiq.c, eiq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dnb $$0, apf $$1, ib $$2, axd $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean b(cxe $$0, ib $$1, dnb $$2) {
      Optional<ib> $$3 = l.a($$0, $$1, $$2.b(), ih.b, dae.sD);
      if ($$3.isEmpty()) {
         return false;
      } else {
         ib $$4 = $$3.get().c();
         dnb $$5 = $$0.a_($$4);
         return czz.a($$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(cxb $$0, axd $$1, ib $$2, dnb $$3) {
      return true;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dnb $$3) {
      Optional<ib> $$4 = l.a($$0, $$2, $$3.b(), ih.b, dae.sD);
      if (!$$4.isEmpty()) {
         ib $$5 = $$4.get();
         ib $$6 = $$5.c();
         ih $$7 = $$3.c(aE);
         a($$0, $$5, $$0.b_($$5), $$7);
         czz.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public cqm a(cxe $$0, ib $$1, dnb $$2) {
      return new cqm(dae.sD);
   }
}

import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class czd extends dda implements czi, dgf {
   public static final MapCodec<czd> a = b(czd::new);
   private static final dmv f = dmu.C;
   private static final int g = 6;
   protected static final epo b = czf.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final epo c = czf.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final epo d = czf.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final epo e = czf.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<czd> a() {
      return a;
   }

   protected czd(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(aE, ih.c));
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
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
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(f, aE);
   }

   @Override
   protected ehr c_(dme $$0) {
      return $$0.c(f) ? ehs.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      ib $$3 = $$2.d();
      dme $$4 = $$1.a_($$3);
      dme $$5 = $$1.a_($$2.c());
      return ($$4.a(this) || $$4.a(aue.bx)) && ($$5.a(this) || $$5.a(czh.sD));
   }

   protected static boolean a(cwf $$0, ib $$1, ehr $$2, ih $$3) {
      dme $$4 = czh.sE.o().a(f, Boolean.valueOf($$2.a(ehs.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if (($$1 == ih.a || $$1 == ih.b) && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$0.c(f)) {
         $$3.a($$4, ehs.c, ehs.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dme $$0, apa $$1, ib $$2, awt $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean b(cwh $$0, ib $$1, dme $$2) {
      Optional<ib> $$3 = l.a($$0, $$1, $$2.b(), ih.b, czh.sD);
      if ($$3.isEmpty()) {
         return false;
      } else {
         ib $$4 = $$3.get().c();
         dme $$5 = $$0.a_($$4);
         return czc.a($$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(cwe $$0, awt $$1, ib $$2, dme $$3) {
      return true;
   }

   @Override
   public void a(apa $$0, awt $$1, ib $$2, dme $$3) {
      Optional<ib> $$4 = l.a($$0, $$2, $$3.b(), ih.b, czh.sD);
      if (!$$4.isEmpty()) {
         ib $$5 = $$4.get();
         ib $$6 = $$5.c();
         ih $$7 = $$3.c(aE);
         a($$0, $$5, $$0.b_($$5), $$7);
         czc.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public cpq a(cwh $$0, ib $$1, dme $$2) {
      return new cpq(czh.sD);
   }
}

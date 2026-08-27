import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class czy extends ddv implements dad, dha {
   public static final MapCodec<czy> a = b(czy::new);
   private static final dnq f = dnp.C;
   private static final int g = 6;
   protected static final eqk b = daa.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final eqk c = daa.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final eqk d = daa.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final eqk e = daa.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<czy> a() {
      return a;
   }

   protected czy(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(aE, ih.c));
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
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
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(f, aE);
   }

   @Override
   protected ein c_(dmz $$0) {
      return $$0.c(f) ? eio.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      ib $$3 = $$2.d();
      dmz $$4 = $$1.a_($$3);
      dmz $$5 = $$1.a_($$2.c());
      return ($$4.a(this) || $$4.a(aun.by)) && ($$5.a(this) || $$5.a(dac.sD));
   }

   protected static boolean a(cxa $$0, ib $$1, ein $$2, ih $$3) {
      dmz $$4 = dac.sE.o().a(f, Boolean.valueOf($$2.a(eio.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if (($$1 == ih.a || $$1 == ih.b) && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$0.c(f)) {
         $$3.a($$4, eio.c, eio.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dmz $$0, apf $$1, ib $$2, axd $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean b(cxc $$0, ib $$1, dmz $$2) {
      Optional<ib> $$3 = l.a($$0, $$1, $$2.b(), ih.b, dac.sD);
      if ($$3.isEmpty()) {
         return false;
      } else {
         ib $$4 = $$3.get().c();
         dmz $$5 = $$0.a_($$4);
         return czx.a($$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(cwz $$0, axd $$1, ib $$2, dmz $$3) {
      return true;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dmz $$3) {
      Optional<ib> $$4 = l.a($$0, $$2, $$3.b(), ih.b, dac.sD);
      if (!$$4.isEmpty()) {
         ib $$5 = $$4.get();
         ib $$6 = $$5.c();
         ih $$7 = $$3.c(aE);
         a($$0, $$5, $$0.b_($$5), $$7);
         czx.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public cqk a(cxc $$0, ib $$1, dmz $$2) {
      return new cqk(dac.sD);
   }
}

import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class dbw extends dft implements dcb, diy {
   public static final MapCodec<dbw> a = b(dbw::new);
   private static final dpq f = dpp.C;
   private static final int g = 6;
   protected static final est b = dby.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final est c = dby.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final est d = dby.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final est e = dby.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<dbw> a() {
      return a;
   }

   protected dbw(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(aE, ih.c));
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
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
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(f, aE);
   }

   @Override
   protected eks c_(doz $$0) {
      return $$0.c(f) ? ekt.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      ib $$3 = $$2.d();
      doz $$4 = $$1.a_($$3);
      doz $$5 = $$1.a_($$2.c());
      return ($$4.a(this) || $$4.a(avc.by)) && ($$5.a(this) || $$5.a(dca.sD));
   }

   protected static boolean a(cyy $$0, ib $$1, eks $$2, ih $$3) {
      doz $$4 = dca.sE.n().a(f, Boolean.valueOf($$2.a(ekt.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if (($$1 == ih.a || $$1 == ih.b) && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$0.c(f)) {
         $$3.a($$4, ekt.c, ekt.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(doz $$0, aps $$1, ib $$2, axr $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean b(cza $$0, ib $$1, doz $$2) {
      Optional<ib> $$3 = l.a($$0, $$1, $$2.b(), ih.b, dca.sD);
      if ($$3.isEmpty()) {
         return false;
      } else {
         ib $$4 = $$3.get().c();
         doz $$5 = $$0.a_($$4);
         return dbv.a($$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(cyx $$0, axr $$1, ib $$2, doz $$3) {
      return true;
   }

   @Override
   public void a(aps $$0, axr $$1, ib $$2, doz $$3) {
      Optional<ib> $$4 = l.a($$0, $$2, $$3.b(), ih.b, dca.sD);
      if (!$$4.isEmpty()) {
         ib $$5 = $$4.get();
         ib $$6 = $$5.c();
         ih $$7 = $$3.c(aE);
         a($$0, $$5, $$0.b_($$5), $$7);
         dbv.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public crj a(cza $$0, ib $$1, doz $$2) {
      return new crj(dca.sD);
   }
}

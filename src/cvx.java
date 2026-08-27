import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class cvx extends czu implements cwc, dcz {
   public static final MapCodec<cvx> a = b(cvx::new);
   private static final djg f = djf.C;
   private static final int g = 6;
   protected static final elu b = cvz.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final elu c = cvz.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final elu d = cvz.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final elu e = cvz.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<cvx> a() {
      return a;
   }

   protected cvx(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(aE, ia.c));
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      switch ((ia)$$0.c(aE)) {
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
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(f, aE);
   }

   @Override
   public edz c_(dip $$0) {
      return $$0.c(f) ? eea.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      hv $$3 = $$2.d();
      dip $$4 = $$1.a_($$3);
      dip $$5 = $$1.a_($$2.c());
      return ($$4.a(this) || $$4.a(arr.bx)) && ($$5.a(this) || $$5.a(cwb.sD));
   }

   protected static boolean a(csz $$0, hv $$1, edz $$2, ia $$3) {
      dip $$4 = cwb.sE.o().a(f, Boolean.valueOf($$2.a(eea.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if (($$1 == ia.a || $$1 == ia.b) && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$0.c(f)) {
         $$3.a($$4, eea.c, eea.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean b(ctb $$0, hv $$1, dip $$2) {
      Optional<hv> $$3 = l.a($$0, $$1, $$2.b(), ia.b, cwb.sD);
      if ($$3.isEmpty()) {
         return false;
      } else {
         hv $$4 = $$3.get().c();
         dip $$5 = $$0.a_($$4);
         return cvw.a($$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(csy $$0, auf $$1, hv $$2, dip $$3) {
      return true;
   }

   @Override
   public void a(amp $$0, auf $$1, hv $$2, dip $$3) {
      Optional<hv> $$4 = l.a($$0, $$2, $$3.b(), ia.b, cwb.sD);
      if (!$$4.isEmpty()) {
         hv $$5 = $$4.get();
         hv $$6 = $$5.c();
         ia $$7 = $$3.c(aE);
         a($$0, $$5, $$0.b_($$5), $$7);
         cvw.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public cmh a(ctb $$0, hv $$1, dip $$2) {
      return new cmh(cwb.sD);
   }
}

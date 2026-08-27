import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class cuy extends cyv implements cvd, dca {
   public static final MapCodec<cuy> a = b(cuy::new);
   private static final dhz f = dhy.C;
   private static final int g = 6;
   protected static final ekn b = cva.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final ekn c = cva.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final ekn d = cva.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final ekn e = cva.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<cuy> a() {
      return a;
   }

   protected cuy(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(aE, hx.c));
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      switch ((hx)$$0.c(aE)) {
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
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(f, aE);
   }

   @Override
   public ecs c_(dhi $$0) {
      return $$0.c(f) ? ect.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      ht $$3 = $$2.d();
      dhi $$4 = $$1.a_($$3);
      dhi $$5 = $$1.a_($$2.c());
      return ($$4.a(this) || $$4.a(arg.bx)) && ($$5.a(this) || $$5.a(cvc.sD));
   }

   protected static boolean a(csb $$0, ht $$1, ecs $$2, hx $$3) {
      dhi $$4 = cvc.sE.o().a(f, Boolean.valueOf($$2.a(ect.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if (($$1 == hx.a || $$1 == hx.b) && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$0.c(f)) {
         $$3.a($$4, ect.c, ect.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean b(csd $$0, ht $$1, dhi $$2) {
      Optional<ht> $$3 = l.a($$0, $$1, $$2.b(), hx.b, cvc.sD);
      if ($$3.isEmpty()) {
         return false;
      } else {
         ht $$4 = $$3.get().c();
         dhi $$5 = $$0.a_($$4);
         return cux.a($$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(csa $$0, ats $$1, ht $$2, dhi $$3) {
      return true;
   }

   @Override
   public void a(ame $$0, ats $$1, ht $$2, dhi $$3) {
      Optional<ht> $$4 = l.a($$0, $$2, $$3.b(), hx.b, cvc.sD);
      if (!$$4.isEmpty()) {
         ht $$5 = $$4.get();
         ht $$6 = $$5.c();
         hx $$7 = $$3.c(aE);
         a($$0, $$5, $$0.b_($$5), $$7);
         cux.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public clj a(csd $$0, ht $$1, dhi $$2) {
      return new clj(cvc.sD);
   }
}

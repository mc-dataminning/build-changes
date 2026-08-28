import java.util.List;

public class cxf extends cxu implements cys {
   public static final byte[] a = new byte[]{1, 2, 3};
   public static final double b = 0.15;

   public cxf(cxu.a $$0) {
      super($$0);
   }

   @Override
   public btq a(dbp $$0) {
      dhp $$1 = $$0.q();
      if ($$1 instanceof arn $$2) {
         cxy $$3 = $$0.n();
         fcu $$4 = $$0.l();
         jo $$5 = $$0.k();
         crb.a(new cqw($$1, $$0.o(), $$4.d + (double)$$5.j() * 0.15, $$4.e + (double)$$5.k() * 0.15, $$4.f + (double)$$5.l() * 0.15, $$3), $$2, $$3);
         $$3.h(1);
      }

      return btq.a;
   }

   @Override
   public btq a(dhp $$0, cqi $$1, btp $$2) {
      if ($$1.fI()) {
         cxy $$3 = $$1.b($$2);
         if ($$0 instanceof arn $$4) {
            crb.a(new cqw($$0, $$3, $$1), $$4, $$3);
            $$3.a(1, $$1);
            $$1.b(awu.c.b(this));
         }

         return btq.a;
      } else {
         return btq.e;
      }
   }

   @Override
   public void a(cxy $$0, cxu.b $$1, List<wv> $$2, czn $$3) {
      dal $$4 = $$0.a(kx.ah);
      if ($$4 != null) {
         $$4.a($$1, $$2::add, $$3);
      }
   }

   @Override
   public crb a(dhp $$0, kc $$1, cxy $$2, jo $$3) {
      return new cqw($$0, $$2.c(1), $$1.a(), $$1.b(), $$1.c(), true);
   }

   @Override
   public cys.a b() {
      return cys.a.a().a(cxf::a).a(1.0F).b(0.5F).a(1004).a();
   }

   private static fcu a(lb $$0, jo $$1) {
      return $$0.a().b((double)$$1.j() * 0.5000099999997474, (double)$$1.k() * 0.5000099999997474, (double)$$1.l() * 0.5000099999997474);
   }
}

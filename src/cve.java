import java.util.List;

public class cve extends cvt implements cws {
   public static final byte[] a = new byte[]{1, 2, 3};
   public static final double b = 0.15;

   public cve(cvt.a $$0) {
      super($$0);
   }

   @Override
   public bry a(czo $$0) {
      dev $$1 = $$0.q();
      if ($$1 instanceof arm $$2) {
         cvx $$3 = $$0.n();
         ezh $$4 = $$0.l();
         jl $$5 = $$0.k();
         cpb.a(new cow($$1, $$0.o(), $$4.d + (double)$$5.j() * 0.15, $$4.e + (double)$$5.k() * 0.15, $$4.f + (double)$$5.l() * 0.15, $$3), $$2, $$3);
         $$3.h(1);
      }

      return bry.a;
   }

   @Override
   public bry a(dev $$0, coh $$1, brx $$2) {
      if ($$1.fL()) {
         cvx $$3 = $$1.b($$2);
         if ($$0 instanceof arm $$4) {
            cpb.a(new cow($$0, $$3, $$1), $$4, $$3);
            $$3.a(1, $$1);
            $$1.b(awu.c.b(this));
         }

         return bry.a;
      } else {
         return bry.e;
      }
   }

   @Override
   public void a(cvx $$0, cvt.b $$1, List<xh> $$2, cxp $$3) {
      cyl $$4 = $$0.a(kt.ae);
      if ($$4 != null) {
         $$4.a($$1, $$2::add, $$3);
      }
   }

   @Override
   public cpb a(dev $$0, jz $$1, cvx $$2, jl $$3) {
      return new cow($$0, $$2.c(1), $$1.a(), $$1.b(), $$1.c(), true);
   }

   @Override
   public cws.a c() {
      return cws.a.a().a(cve::a).a(1.0F).b(0.5F).a(1004).a();
   }

   private static ezh a(kx $$0, jl $$1) {
      return $$0.a().b((double)$$1.j() * 0.5000099999997474, (double)$$1.k() * 0.5000099999997474, (double)$$1.l() * 0.5000099999997474);
   }
}

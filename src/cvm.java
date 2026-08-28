import java.util.List;

public class cvm extends cwb implements cxa {
   public static final byte[] a = new byte[]{1, 2, 3};
   public static final double b = 0.15;

   public cvm(cwb.a $$0) {
      super($$0);
   }

   @Override
   public bsh a(czy $$0) {
      dff $$1 = $$0.q();
      if ($$1 instanceof arq $$2) {
         cwf $$3 = $$0.n();
         ezr $$4 = $$0.l();
         jm $$5 = $$0.k();
         cpk.a(new cpf($$1, $$0.o(), $$4.d + (double)$$5.j() * 0.15, $$4.e + (double)$$5.k() * 0.15, $$4.f + (double)$$5.l() * 0.15, $$3), $$2, $$3);
         $$3.h(1);
      }

      return bsh.a;
   }

   @Override
   public bsh a(dff $$0, cor $$1, bsg $$2) {
      if ($$1.fM()) {
         cwf $$3 = $$1.b($$2);
         if ($$0 instanceof arq $$4) {
            cpk.a(new cpf($$0, $$3, $$1), $$4, $$3);
            $$3.a(1, $$1);
            $$1.b(awy.c.b(this));
         }

         return bsh.a;
      } else {
         return bsh.e;
      }
   }

   @Override
   public void a(cwf $$0, cwb.b $$1, List<xl> $$2, cxx $$3) {
      cyv $$4 = $$0.a(ku.af);
      if ($$4 != null) {
         $$4.a($$1, $$2::add, $$3);
      }
   }

   @Override
   public cpk a(dff $$0, ka $$1, cwf $$2, jm $$3) {
      return new cpf($$0, $$2.c(1), $$1.a(), $$1.b(), $$1.c(), true);
   }

   @Override
   public cxa.a b() {
      return cxa.a.a().a(cvm::a).a(1.0F).b(0.5F).a(1004).a();
   }

   private static ezr a(ky $$0, jm $$1) {
      return $$0.a().b((double)$$1.j() * 0.5000099999997474, (double)$$1.k() * 0.5000099999997474, (double)$$1.l() * 0.5000099999997474);
   }
}

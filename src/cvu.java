import java.util.List;

public class cvu extends cwj implements cxi {
   public static final byte[] a = new byte[]{1, 2, 3};
   public static final double b = 0.15;

   public cvu(cwj.a $$0) {
      super($$0);
   }

   @Override
   public bsi a(dag $$0) {
      dgg $$1 = $$0.q();
      if ($$1 instanceof arc $$2) {
         cwn $$3 = $$0.n();
         fay $$4 = $$0.l();
         jn $$5 = $$0.k();
         cpo.a(new cpj($$1, $$0.o(), $$4.d + (double)$$5.j() * 0.15, $$4.e + (double)$$5.k() * 0.15, $$4.f + (double)$$5.l() * 0.15, $$3), $$2, $$3);
         $$3.h(1);
      }

      return bsi.a;
   }

   @Override
   public bsi a(dgg $$0, cov $$1, bsh $$2) {
      if ($$1.fJ()) {
         cwn $$3 = $$1.b($$2);
         if ($$0 instanceof arc $$4) {
            cpo.a(new cpj($$0, $$3, $$1), $$4, $$3);
            $$3.a(1, $$1);
            $$1.b(awj.c.b(this));
         }

         return bsi.a;
      } else {
         return bsi.e;
      }
   }

   @Override
   public void a(cwn $$0, cwj.b $$1, List<wo> $$2, cyf $$3) {
      czd $$4 = $$0.a(kv.af);
      if ($$4 != null) {
         $$4.a($$1, $$2::add, $$3);
      }
   }

   @Override
   public cpo a(dgg $$0, kb $$1, cwn $$2, jn $$3) {
      return new cpj($$0, $$2.c(1), $$1.a(), $$1.b(), $$1.c(), true);
   }

   @Override
   public cxi.a b() {
      return cxi.a.a().a(cvu::a).a(1.0F).b(0.5F).a(1004).a();
   }

   private static fay a(kz $$0, jn $$1) {
      return $$0.a().b((double)$$1.j() * 0.5000099999997474, (double)$$1.k() * 0.5000099999997474, (double)$$1.l() * 0.5000099999997474);
   }
}

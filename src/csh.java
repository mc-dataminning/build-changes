import java.util.List;
import javax.annotation.Nullable;

public class csh extends crn {
   private static final int a = 32;

   public csh(crn.a $$0) {
      super($$0);
   }

   @Override
   public crs x() {
      crs $$0 = super.x();
      $$0.b(jr.x, new ctq(ctr.a));
      return $$0;
   }

   @Override
   public crs a(crs $$0, czg $$1, bqt $$2) {
      cka $$3 = $$2 instanceof cka ? (cka)$$2 : null;
      if ($$3 instanceof apv) {
         am.A.a((apv)$$3, $$0);
      }

      if (!$$1.B) {
         ctq $$4 = $$0.a(jr.x, ctq.a);
         $$4.a($$2x -> {
            if ($$2x.b().a().a()) {
               $$2x.b().a().a($$3, $$3, $$2, $$2x.d(), 1.0);
            } else {
               $$2.b($$2x);
            }
         });
      }

      if ($$3 != null) {
         $$3.b(auz.c.b(this));
         $$0.a(1, $$3);
      }

      if ($$3 == null || !$$3.fM()) {
         if ($$0.d()) {
            return new crs(crv.sk);
         }

         if ($$3 != null) {
            $$3.fZ().e(new crs(crv.sk));
         }
      }

      $$2.a(dub.l);
      return $$0;
   }

   @Override
   public bof a(cuz $$0) {
      czg $$1 = $$0.q();
      id $$2 = $$0.a();
      cka $$3 = $$0.o();
      crs $$4 = $$0.n();
      ctq $$5 = $$4.a(jr.x, ctq.a);
      dpi $$6 = $$1.a_($$2);
      if ($$0.k() != ij.a && $$6.a(ave.cc) && $$5.a(ctr.a)) {
         $$1.a(null, $$2, auo.kd, aup.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cru.a($$4, $$3, new crs(crv.sk)));
         $$3.b(auz.c.b($$4.f()));
         if (!$$1.B) {
            apu $$7 = (apu)$$1;

            for (int $$8 = 0; $$8 < 5; $$8++) {
               $$7.a(kn.ak, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, auo.cB, aup.e, 1.0F, 1.0F);
         $$1.a(null, dub.z, $$2);
         $$1.b($$2, dcj.sI.n());
         return bof.a($$1.B);
      } else {
         return bof.d;
      }
   }

   @Override
   public int b(crs $$0) {
      return 32;
   }

   @Override
   public ctk c(crs $$0) {
      return ctk.c;
   }

   @Override
   public bog<crs> a(czg $$0, cka $$1, boe $$2) {
      return cru.a($$0, $$1, $$2);
   }

   @Override
   public String i(crs $$0) {
      return cto.a($$0.a(jr.x, ctq.a).f(), this.a() + ".effect.");
   }

   @Override
   public void a(crs $$0, @Nullable czg $$1, List<wi> $$2, cti $$3) {
      ctq $$4 = $$0.a(jr.x);
      if ($$4 != null) {
         $$4.a($$2::add, 1.0F, $$1 == null ? 20.0F : $$1.s().f());
      }
   }
}

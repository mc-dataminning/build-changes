import java.util.List;
import javax.annotation.Nullable;

public class cry extends cre {
   private static final int a = 32;

   public cry(cre.a $$0) {
      super($$0);
   }

   @Override
   public crj x() {
      crj $$0 = super.x();
      $$0.b(jp.x, new cth(cti.a));
      return $$0;
   }

   @Override
   public crj a(crj $$0, cyx $$1, bqo $$2) {
      cjt $$3 = $$2 instanceof cjt ? (cjt)$$2 : null;
      if ($$3 instanceof apt) {
         am.A.a((apt)$$3, $$0);
      }

      if (!$$1.B) {
         cth $$4 = $$0.a(jp.x, cth.a);
         $$4.a($$2x -> {
            if ($$2x.b().a().a()) {
               $$2x.b().a().a($$3, $$3, $$2, $$2x.d(), 1.0);
            } else {
               $$2.b($$2x);
            }
         });
      }

      if ($$3 != null) {
         $$3.b(auw.c.b(this));
         $$0.a(1, $$3);
      }

      if ($$3 == null || !$$3.fM()) {
         if ($$0.d()) {
            return new crj(crm.sk);
         }

         if ($$3 != null) {
            $$3.fZ().e(new crj(crm.sk));
         }
      }

      $$2.a(dts.l);
      return $$0;
   }

   @Override
   public boa a(cuq $$0) {
      cyx $$1 = $$0.q();
      ib $$2 = $$0.a();
      cjt $$3 = $$0.o();
      crj $$4 = $$0.n();
      cth $$5 = $$4.a(jp.x, cth.a);
      doz $$6 = $$1.a_($$2);
      if ($$0.k() != ih.a && $$6.a(avc.cc) && $$5.a(cti.a)) {
         $$1.a(null, $$2, aum.kd, aun.e, 1.0F, 1.0F);
         $$3.a($$0.p(), crl.a($$4, $$3, new crj(crm.sk)));
         $$3.b(auw.c.b($$4.f()));
         if (!$$1.B) {
            aps $$7 = (aps)$$1;

            for (int $$8 = 0; $$8 < 5; $$8++) {
               $$7.a(kl.ak, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, aum.cB, aun.e, 1.0F, 1.0F);
         $$1.a(null, dts.z, $$2);
         $$1.b($$2, dca.sI.n());
         return boa.a($$1.B);
      } else {
         return boa.d;
      }
   }

   @Override
   public int b(crj $$0) {
      return 32;
   }

   @Override
   public ctb c(crj $$0) {
      return ctb.c;
   }

   @Override
   public bob<crj> a(cyx $$0, cjt $$1, bnz $$2) {
      return crl.a($$0, $$1, $$2);
   }

   @Override
   public String i(crj $$0) {
      return ctf.a($$0.a(jp.x, cth.a).f(), this.a() + ".effect.");
   }

   @Override
   public void a(crj $$0, @Nullable cyx $$1, List<wg> $$2, csz $$3) {
      cth $$4 = $$0.a(jp.x);
      if ($$4 != null) {
         $$4.a($$2::add, 1.0F, $$1 == null ? 20.0F : $$1.s().f());
      }
   }
}

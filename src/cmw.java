import java.util.List;
import javax.annotation.Nullable;

public class cmw extends cmc {
   private static final int a = 32;

   public cmw(cmc.a $$0) {
      super($$0);
   }

   @Override
   public cmh am_() {
      return cog.a(super.am_(), coh.c);
   }

   @Override
   public cmh a(cmh $$0, csy $$1, blv $$2) {
      cer $$3 = $$2 instanceof cer ? (cer)$$2 : null;
      if ($$3 instanceof amq) {
         am.A.a((amq)$$3, $$0);
      }

      if (!$$1.B) {
         for (bks $$5 : cog.a($$0)) {
            if ($$5.c().a()) {
               $$5.c().a($$3, $$3, $$2, $$5.e(), 1.0);
            } else {
               $$2.b(new bks($$5));
            }
         }
      }

      if ($$3 != null) {
         $$3.b(arm.c.b(this));
         if (!$$3.fT().d) {
            $$0.h(1);
         }
      }

      if ($$3 == null || !$$3.fT().d) {
         if ($$0.b()) {
            return new cmh(cmk.si);
         }

         if ($$3 != null) {
            $$3.fS().e(new cmh(cmk.si));
         }
      }

      $$2.a(dmz.l);
      return $$0;
   }

   @Override
   public bjl a(cos $$0) {
      csy $$1 = $$0.q();
      hv $$2 = $$0.a();
      cer $$3 = $$0.o();
      cmh $$4 = $$0.n();
      dip $$5 = $$1.a_($$2);
      if ($$0.k() != ia.a && $$5.a(arr.ca) && cog.d($$4) == coh.c) {
         $$1.a(null, $$2, arc.jE, ard.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cmj.a($$4, $$3, new cmh(cmk.si)));
         $$3.b(arm.c.b($$4.d()));
         if (!$$1.B) {
            amp $$6 = (amp)$$1;

            for (int $$7 = 0; $$7 < 5; $$7++) {
               $$6.a(jv.aj, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, arc.ch, ard.e, 1.0F, 1.0F);
         $$1.a(null, dmz.z, $$2);
         $$1.b($$2, cwb.sI.o());
         return bjl.a($$1.B);
      } else {
         return bjl.d;
      }
   }

   @Override
   public int b(cmh $$0) {
      return 32;
   }

   @Override
   public coa c(cmh $$0) {
      return coa.c;
   }

   @Override
   public bjm<cmh> a(csy $$0, cer $$1, bjk $$2) {
      return cmj.a($$0, $$1, $$2);
   }

   @Override
   public String j(cmh $$0) {
      return cog.d($$0).b(this.a() + ".effect.");
   }

   @Override
   public void a(cmh $$0, @Nullable csy $$1, List<vb> $$2, cny $$3) {
      cog.a($$0, $$2, 1.0F);
   }
}

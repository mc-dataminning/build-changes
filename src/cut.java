import java.util.List;

public class cut extends ctx {
   private static final int a = 32;

   public cut(ctx.a $$0) {
      super($$0);
   }

   @Override
   public cuc w() {
      cuc $$0 = super.w();
      $$0.b(kn.G, new cwd(cwe.a));
      return $$0;
   }

   @Override
   public cuc a(cuc $$0, dcf $$1, btb $$2) {
      cmk $$3 = $$2 instanceof cmk ? (cmk)$$2 : null;
      if ($$3 instanceof aqn) {
         am.A.a((aqn)$$3, $$0);
      }

      if (!$$1.B) {
         cwd $$4 = $$0.a(kn.G, cwd.a);
         $$4.a($$2x -> {
            if ($$2x.c().a().a()) {
               $$2x.c().a().a($$3, $$3, $$2, $$2x.e(), 1.0);
            } else {
               $$2.b($$2x);
            }
         });
      }

      if ($$3 != null) {
         $$3.b(avr.c.b(this));
         $$0.a(1, $$3);
      }

      if ($$3 == null || !$$3.fM()) {
         if ($$0.e()) {
            return new cuc(cuf.sl);
         }

         if ($$3 != null) {
            $$3.fZ().f(new cuc(cuf.sl));
         }
      }

      $$2.a(dxg.l);
      return $$0;
   }

   @Override
   public bqg a(cxo $$0) {
      dcf $$1 = $$0.q();
      ja $$2 = $$0.a();
      cmk $$3 = $$0.o();
      cuc $$4 = $$0.n();
      cwd $$5 = $$4.a(kn.G, cwd.a);
      dsk $$6 = $$1.a_($$2);
      if ($$0.k() != jf.a && $$6.a(avw.ci) && $$5.a(cwe.a)) {
         $$1.a(null, $$2, avh.ki, avi.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cue.a($$4, $$3, new cuc(cuf.sl)));
         $$3.b(avr.c.b($$4.g()));
         if (!$$1.B) {
            aqm $$7 = (aqm)$$1;

            for (int $$8 = 0; $$8 < 5; $$8++) {
               $$7.a(lj.am, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, avh.cB, avi.e, 1.0F, 1.0F);
         $$1.a(null, dxg.z, $$2);
         $$1.b($$2, dfj.sI.o());
         return bqg.a($$1.B);
      } else {
         return bqg.e;
      }
   }

   @Override
   public int a(cuc $$0, btb $$1) {
      return 32;
   }

   @Override
   public cvx b(cuc $$0) {
      return cvx.c;
   }

   @Override
   public bqh<cuc> a(dcf $$0, cmk $$1, bqf $$2) {
      return cue.a($$0, $$1, $$2);
   }

   @Override
   public String h(cuc $$0) {
      return cwb.a($$0.a(kn.G, cwd.a).e(), this.a() + ".effect.");
   }

   @Override
   public void a(cuc $$0, ctx.b $$1, List<wu> $$2, cvv $$3) {
      cwd $$4 = $$0.a(kn.G);
      if ($$4 != null) {
         $$4.a($$2::add, 1.0F, $$1.b());
      }
   }
}

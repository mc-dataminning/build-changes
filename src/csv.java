import java.util.List;

public class csv extends ctl implements cui {
   public static final byte[] a = new byte[]{1, 2, 3};
   public static final double b = 0.15;

   public csv(ctl.a $$0) {
      super($$0);
   }

   @Override
   public bpw a(cxd $$0) {
      daz $$1 = $$0.q();
      if (!$$1.B) {
         ctq $$2 = $$0.n();
         eum $$3 = $$0.l();
         it $$4 = $$0.k();
         cml $$5 = new cml($$1, $$0.o(), $$3.c + (double)$$4.j() * 0.15, $$3.d + (double)$$4.k() * 0.15, $$3.e + (double)$$4.l() * 0.15, $$2);
         $$1.b($$5);
         $$2.h(1);
      }

      return bpw.a($$1.B);
   }

   @Override
   public bpx<ctq> a(daz $$0, cly $$1, bpv $$2) {
      if ($$1.fE()) {
         ctq $$3 = $$1.b($$2);
         if (!$$0.B) {
            cml $$4 = new cml($$0, $$3, $$1);
            $$0.b($$4);
            $$3.a(1, $$1);
            $$1.b(avs.c.b(this));
         }

         return bpx.a($$1.b($$2), $$0.x_());
      } else {
         return bpx.c($$1.b($$2));
      }
   }

   @Override
   public void a(ctq $$0, ctl.b $$1, List<wx> $$2, cvj $$3) {
      cwk $$4 = $$0.a(kb.T);
      if ($$4 != null) {
         $$4.a($$2::add, $$3);
      }
   }

   @Override
   public cmq a(daz $$0, jh $$1, ctq $$2, it $$3) {
      return new cml($$0, $$2.c(1), $$1.a(), $$1.b(), $$1.c(), true);
   }

   @Override
   public cui.a c() {
      return cui.a.a().a(csv::a).a(0.5F).b(1.0F).a(1004).a();
   }

   private static eum a(kf $$0, it $$1) {
      return $$0.a()
         .b(
            (double)$$1.j() * (0.5000099999997474 - (double)bsc.P.l() / 2.0),
            (double)$$1.k() * (0.5000099999997474 - (double)bsc.P.m() / 2.0) - (double)bsc.P.m() / 2.0,
            (double)$$1.l() * (0.5000099999997474 - (double)bsc.P.l() / 2.0)
         );
   }
}

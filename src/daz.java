import java.util.List;

public class daz extends czw {
   public daz(czw.a $$0) {
      super($$0);
   }

   public static ddd a() {
      jh<dne> $$0 = mh.a(mh.e);
      return new ddd(
         List.of(ddd.a.a(jk.a(dng.bz.p()), 15.0F), ddd.a.b($$0.b(axg.Q), 15.0F), ddd.a.b($$0.b(axg.a), 5.0F), ddd.a.b(jk.a(dng.fx.p(), dng.fy.p()), 2.0F)),
         1.0F,
         1,
         true
      );
   }

   @Override
   public boolean a(daa $$0, djz $$1, ebg $$2, iw $$3, bxw $$4) {
      ddd $$5 = $$0.a(kl.A);
      if ($$5 == null) {
         return false;
      } else {
         if (!$$1.A_() && !$$2.a(axg.aN) && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, bxf.a);
         }

         return true;
      }
   }

   @Override
   public but a(ddv $$0) {
      djz $$1 = $$0.q();
      iw $$2 = $$0.a();
      ebg $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dqx $$5 && !$$5.q($$3)) {
         crz $$6 = $$0.o();
         daa $$7 = $$0.n();
         if ($$6 instanceof arv) {
            aq.N.a((arv)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, awr.lR, aws.e, 1.0F, 1.0F);
         ebg $$8 = $$5.p($$3);
         $$1.b($$2, $$8);
         $$1.a(egg.c, $$2, egg.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, bxw.d($$0.p()));
         }

         return but.a;
      }

      return super.a($$0);
   }
}

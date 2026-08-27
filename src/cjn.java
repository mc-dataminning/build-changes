import java.util.List;
import javax.annotation.Nullable;

public class cjn extends cit {
   private static final int a = 32;

   public cjn(cit.a $$0) {
      super($$0);
   }

   @Override
   public ciy ae_() {
      return ckx.a(super.ae_(), cky.c);
   }

   @Override
   public ciy a(ciy $$0, cpm $$1, biy $$2) {
      cbn $$3 = $$2 instanceof cbn ? (cbn)$$2 : null;
      if ($$3 instanceof akl) {
         ai.z.a((akl)$$3, $$0);
      }

      if (!$$1.B) {
         for (bhv $$5 : ckx.a($$0)) {
            if ($$5.c().a()) {
               $$5.c().a($$3, $$3, $$2, $$5.e(), 1.0);
            } else {
               $$2.b(new bhv($$5));
            }
         }
      }

      if ($$3 != null) {
         $$3.b(apg.c.b(this));
         if (!$$3.fR().d) {
            $$0.h(1);
         }
      }

      if ($$3 == null || !$$3.fR().d) {
         if ($$0.b()) {
            return new ciy(cjb.rw);
         }

         if ($$3 != null) {
            $$3.fQ().e(new ciy(cjb.rw));
         }
      }

      $$2.a(djk.l);
      return $$0;
   }

   @Override
   public bgq a(cli $$0) {
      cpm $$1 = $$0.q();
      gu $$2 = $$0.a();
      cbn $$3 = $$0.o();
      ciy $$4 = $$0.n();
      dfa $$5 = $$1.a_($$2);
      if ($$0.k() != ha.a && $$5.a(apl.ca) && ckx.d($$4) == cky.c) {
         $$1.a(null, $$2, aow.jb, aox.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cja.a($$4, $$3, new ciy(cjb.rw)));
         $$3.b(apg.c.b($$4.d()));
         if (!$$1.B) {
            akk $$6 = (akk)$$1;

            for (int $$7 = 0; $$7 < 5; $$7++) {
               $$6.a(iv.ag, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, aow.ch, aox.e, 1.0F, 1.0F);
         $$1.a(null, djk.z, $$2);
         $$1.b($$2, csn.rH.n());
         return bgq.a($$1.B);
      } else {
         return bgq.d;
      }
   }

   @Override
   public int b(ciy $$0) {
      return 32;
   }

   @Override
   public ckr c(ciy $$0) {
      return ckr.c;
   }

   @Override
   public bgr<ciy> a(cpm $$0, cbn $$1, bgp $$2) {
      return cja.a($$0, $$1, $$2);
   }

   @Override
   public String j(ciy $$0) {
      return ckx.d($$0).b(this.a() + ".effect.");
   }

   @Override
   public void a(ciy $$0, @Nullable cpm $$1, List<tf> $$2, ckp $$3) {
      ckx.a($$0, $$2, 1.0F);
   }
}

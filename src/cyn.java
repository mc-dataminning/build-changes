import java.util.List;
import javax.annotation.Nullable;

public class cyn extends cwl {
   private final bwb<? extends bwt> a;
   private final awj b;

   public cyn(bwb<? extends bwt> $$0, eus $$1, awj $$2, cxu.a $$3) {
      super($$1, $$3);
      this.a = $$0;
      this.b = $$2;
   }

   @Override
   public void a(@Nullable bwr $$0, dhp $$1, cxy $$2, jj $$3) {
      if ($$1 instanceof arn) {
         this.a((arn)$$1, $$2, $$3);
         $$1.a($$0, edm.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable bwr $$0, dhq $$1, jj $$2) {
      $$1.a($$0, $$2, this.b, awl.g, 1.0F, 1.0F);
   }

   private void a(arn $$0, cxy $$1, jj $$2) {
      bwt $$3 = this.a.b($$0, bwb.a($$0, $$1, null), $$2, bwa.l, true, false);
      if ($$3 instanceof cii $$4) {
         dae $$5 = $$1.a(kx.Z, dae.a);
         $$4.h($$5.d());
         $$4.w(true);
      }

      if ($$3 != null) {
         $$0.a_($$3);
         $$3.T();
      }
   }

   @Override
   public void a(cxy $$0, cxu.b $$1, List<wv> $$2, czn $$3) {
      if (this.a == bwb.bz) {
         cjj.b $$4 = $$0.a(kx.ay);
         if ($$4 == null) {
            return;
         }

         cwv $$5 = $$0.a(kx.az, cjj.a.c());
         cwv $$6 = $$0.a(kx.aA, cjj.a.d());
         n[] $$7 = new n[]{n.u, n.h};
         int $$8 = cjj.b.indexOf(new cjj.d($$4, $$5, $$6));
         if ($$8 != -1) {
            $$2.add(wv.c(cjj.b($$8)).a($$7));
            return;
         }

         $$2.add($$4.d().e().a($$7));
         xj $$9 = wv.c("color.minecraft." + $$5.b());
         if ($$5 != $$6) {
            $$9.f(", ").b(wv.c("color.minecraft." + $$6.b()));
         }

         $$9.a($$7);
         $$2.add($$9);
      }
   }
}

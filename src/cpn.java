import java.util.List;
import javax.annotation.Nullable;

public class cpn extends cne {
   private final bnw<?> a;
   private final atk b;

   public cpn(bnw<?> $$0, egv $$1, atk $$2, coy.a $$3) {
      super($$1, $$3);
      this.a = $$0;
      this.b = $$2;
   }

   @Override
   public void a(@Nullable chl $$0, cvr $$1, cpd $$2, hz $$3) {
      if ($$1 instanceof aow) {
         this.a((aow)$$1, $$2, $$3);
         $$1.a($$0, dpw.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable chl $$0, cvs $$1, hz $$2) {
      $$1.a($$0, $$2, this.b, atm.g, 1.0F, 1.0F);
   }

   private void a(aow $$0, cpd $$1, hz $$2) {
      if (this.a.a($$0, $$1, null, $$2, bom.l, true, false) instanceof bzz $$4) {
         $$4.c($$1.x());
         $$4.w(true);
      }
   }

   @Override
   public void a(cpd $$0, @Nullable cvr $$1, List<vq> $$2, cqu $$3) {
      if (this.a == bnw.be) {
         sw $$4 = $$0.w();
         if ($$4 != null && $$4.b("BucketVariantTag", 3)) {
            int $$5 = $$4.h("BucketVariantTag");
            n[] $$6 = new n[]{n.u, n.h};
            String $$7 = "color.minecraft." + cax.t($$5);
            String $$8 = "color.minecraft." + cax.u($$5);

            for (int $$9 = 0; $$9 < cax.c.size(); $$9++) {
               if ($$5 == cax.c.get($$9).a()) {
                  $$2.add(vq.c(cax.c($$9)).a($$6));
                  return;
               }
            }

            $$2.add(cax.v($$5).d().e().a($$6));
            we $$10 = vq.c($$7);
            if (!$$7.equals($$8)) {
               $$10.f(", ").b(vq.c($$8));
            }

            $$10.a($$6);
            $$2.add($$10);
         }
      }
   }
}

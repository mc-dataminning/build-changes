import java.util.List;
import javax.annotation.Nullable;

public class cmr extends cki {
   private final blj<?> a;
   private final arb b;

   public cmr(blj<?> $$0, edy $$1, arb $$2, cmc.a $$3) {
      super($$1, $$3);
      this.a = $$0;
      this.b = $$2;
   }

   @Override
   public void a(@Nullable cer $$0, csy $$1, cmh $$2, hv $$3) {
      if ($$1 instanceof amp) {
         this.a((amp)$$1, $$2, $$3);
         $$1.a($$0, dmz.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable cer $$0, csz $$1, hv $$2) {
      $$1.a($$0, $$2, this.b, ard.g, 1.0F, 1.0F);
   }

   private void a(amp $$0, cmh $$1, hv $$2) {
      if (this.a.a($$0, $$1, null, $$2, blz.l, true, false) instanceof bxk $$4) {
         $$4.c($$1.w());
         $$4.w(true);
      }
   }

   @Override
   public void a(cmh $$0, @Nullable csy $$1, List<vb> $$2, cny $$3) {
      if (this.a == blj.bd) {
         sj $$4 = $$0.v();
         if ($$4 != null && $$4.b("BucketVariantTag", 3)) {
            int $$5 = $$4.h("BucketVariantTag");
            n[] $$6 = new n[]{n.u, n.h};
            String $$7 = "color.minecraft." + byi.s($$5);
            String $$8 = "color.minecraft." + byi.t($$5);

            for (int $$9 = 0; $$9 < byi.c.size(); $$9++) {
               if ($$5 == byi.c.get($$9).a()) {
                  $$2.add(vb.c(byi.c($$9)).a($$6));
                  return;
               }
            }

            $$2.add(byi.u($$5).d().e().a($$6));
            vp $$10 = vb.c($$7);
            if (!$$7.equals($$8)) {
               $$10.f(", ").b(vb.c($$8));
            }

            $$10.a($$6);
            $$2.add($$10);
         }
      }
   }
}

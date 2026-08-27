import java.util.List;
import javax.annotation.Nullable;

public class cpj extends cna {
   private final bnu<?> a;
   private final atj b;

   public cpj(bnu<?> $$0, ego $$1, atj $$2, cou.a $$3) {
      super($$1, $$3);
      this.a = $$0;
      this.b = $$2;
   }

   @Override
   public void a(@Nullable chh $$0, cvn $$1, coz $$2, hz $$3) {
      if ($$1 instanceof aov) {
         this.a((aov)$$1, $$2, $$3);
         $$1.a($$0, dpp.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable chh $$0, cvo $$1, hz $$2) {
      $$1.a($$0, $$2, this.b, atl.g, 1.0F, 1.0F);
   }

   private void a(aov $$0, coz $$1, hz $$2) {
      if (this.a.a($$0, $$1, null, $$2, bok.l, true, false) instanceof bzv $$4) {
         $$4.c($$1.x());
         $$4.w(true);
      }
   }

   @Override
   public void a(coz $$0, @Nullable cvn $$1, List<vq> $$2, cqq $$3) {
      if (this.a == bnu.be) {
         sw $$4 = $$0.w();
         if ($$4 != null && $$4.b("BucketVariantTag", 3)) {
            int $$5 = $$4.h("BucketVariantTag");
            n[] $$6 = new n[]{n.u, n.h};
            String $$7 = "color.minecraft." + cat.t($$5);
            String $$8 = "color.minecraft." + cat.u($$5);

            for (int $$9 = 0; $$9 < cat.c.size(); $$9++) {
               if ($$5 == cat.c.get($$9).a()) {
                  $$2.add(vq.c(cat.c($$9)).a($$6));
                  return;
               }
            }

            $$2.add(cat.v($$5).d().e().a($$6));
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

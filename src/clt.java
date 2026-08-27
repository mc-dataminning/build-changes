import java.util.List;
import javax.annotation.Nullable;

public class clt extends cjk {
   private final bku<?> a;
   private final aqq b;

   public clt(bku<?> $$0, ecr $$1, aqq $$2, cle.a $$3) {
      super($$1, $$3);
      this.a = $$0;
      this.b = $$2;
   }

   @Override
   public void a(@Nullable cdu $$0, csa $$1, clj $$2, ht $$3) {
      if ($$1 instanceof ame) {
         this.a((ame)$$1, $$2, $$3);
         $$1.a($$0, dls.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable cdu $$0, csb $$1, ht $$2) {
      $$1.a($$0, $$2, this.b, aqs.g, 1.0F, 1.0F);
   }

   private void a(ame $$0, clj $$1, ht $$2) {
      if (this.a.a($$0, $$1, null, $$2, blk.l, true, false) instanceof bwt $$4) {
         $$4.c($$1.w());
         $$4.w(true);
      }
   }

   @Override
   public void a(clj $$0, @Nullable csa $$1, List<ur> $$2, cna $$3) {
      if (this.a == bku.bc) {
         rz $$4 = $$0.v();
         if ($$4 != null && $$4.b("BucketVariantTag", 3)) {
            int $$5 = $$4.h("BucketVariantTag");
            n[] $$6 = new n[]{n.u, n.h};
            String $$7 = "color.minecraft." + bxr.s($$5);
            String $$8 = "color.minecraft." + bxr.t($$5);

            for (int $$9 = 0; $$9 < bxr.c.size(); $$9++) {
               if ($$5 == bxr.c.get($$9).a()) {
                  $$2.add(ur.c(bxr.c($$9)).a($$6));
                  return;
               }
            }

            $$2.add(bxr.u($$5).d().e().a($$6));
            vf $$10 = ur.c($$7);
            if (!$$7.equals($$8)) {
               $$10.f(", ").b(ur.c($$8));
            }

            $$10.a($$6);
            $$2.add($$10);
         }
      }
   }
}

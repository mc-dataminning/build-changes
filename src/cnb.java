import java.util.List;
import javax.annotation.Nullable;

public class cnb extends cks {
   private final blt<?> a;
   private final arl b;

   public cnb(blt<?> $$0, eej $$1, arl $$2, cmm.a $$3) {
      super($$1, $$3);
      this.a = $$0;
      this.b = $$2;
   }

   @Override
   public void a(@Nullable cfb $$0, cti $$1, cmr $$2, hx $$3) {
      if ($$1 instanceof amz) {
         this.a((amz)$$1, $$2, $$3);
         $$1.a($$0, dnk.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable cfb $$0, ctj $$1, hx $$2) {
      $$1.a($$0, $$2, this.b, arn.g, 1.0F, 1.0F);
   }

   private void a(amz $$0, cmr $$1, hx $$2) {
      if (this.a.a($$0, $$1, null, $$2, bmj.l, true, false) instanceof bxu $$4) {
         $$4.c($$1.w());
         $$4.w(true);
      }
   }

   @Override
   public void a(cmr $$0, @Nullable cti $$1, List<vd> $$2, coi $$3) {
      if (this.a == blt.bd) {
         sl $$4 = $$0.v();
         if ($$4 != null && $$4.b("BucketVariantTag", 3)) {
            int $$5 = $$4.h("BucketVariantTag");
            n[] $$6 = new n[]{n.u, n.h};
            String $$7 = "color.minecraft." + bys.s($$5);
            String $$8 = "color.minecraft." + bys.t($$5);

            for (int $$9 = 0; $$9 < bys.c.size(); $$9++) {
               if ($$5 == bys.c.get($$9).a()) {
                  $$2.add(vd.c(bys.c($$9)).a($$6));
                  return;
               }
            }

            $$2.add(bys.u($$5).d().e().a($$6));
            vr $$10 = vd.c($$7);
            if (!$$7.equals($$8)) {
               $$10.f(", ").b(vd.c($$8));
            }

            $$10.a($$6);
            $$2.add($$10);
         }
      }
   }
}

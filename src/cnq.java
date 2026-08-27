import java.util.List;
import javax.annotation.Nullable;

public class cnq extends cli {
   private final bmc<?> a;
   private final ars b;

   public cnq(bmc<?> $$0, eey $$1, ars $$2, cnb.a $$3) {
      super($$1, $$3);
      this.a = $$0;
      this.b = $$2;
   }

   @Override
   public void a(@Nullable cfq $$0, ctx $$1, cng $$2, hx $$3) {
      if ($$1 instanceof ane) {
         this.a((ane)$$1, $$2, $$3);
         $$1.a($$0, dnz.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable cfq $$0, cty $$1, hx $$2) {
      $$1.a($$0, $$2, this.b, aru.g, 1.0F, 1.0F);
   }

   private void a(ane $$0, cng $$1, hx $$2) {
      if (this.a.a($$0, $$1, null, $$2, bms.l, true, false) instanceof bye $$4) {
         $$4.c($$1.w());
         $$4.w(true);
      }
   }

   @Override
   public void a(cng $$0, @Nullable ctx $$1, List<vg> $$2, coy $$3) {
      if (this.a == bmc.be) {
         so $$4 = $$0.v();
         if ($$4 != null && $$4.b("BucketVariantTag", 3)) {
            int $$5 = $$4.h("BucketVariantTag");
            n[] $$6 = new n[]{n.u, n.h};
            String $$7 = "color.minecraft." + bzc.s($$5);
            String $$8 = "color.minecraft." + bzc.t($$5);

            for (int $$9 = 0; $$9 < bzc.c.size(); $$9++) {
               if ($$5 == bzc.c.get($$9).a()) {
                  $$2.add(vg.c(bzc.c($$9)).a($$6));
                  return;
               }
            }

            $$2.add(bzc.u($$5).d().e().a($$6));
            vu $$10 = vg.c($$7);
            if (!$$7.equals($$8)) {
               $$10.f(", ").b(vg.c($$8));
            }

            $$10.a($$6);
            $$2.add($$10);
         }
      }
   }
}

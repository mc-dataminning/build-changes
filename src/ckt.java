import java.util.List;
import javax.annotation.Nullable;

public class ckt extends cik {
   private final bjx<?> a;
   private final aqc b;

   public ckt(bjx<?> $$0, ebd $$1, aqc $$2, cke.a $$3) {
      super($$1, $$3);
      this.a = $$0;
      this.b = $$2;
   }

   @Override
   public void a(@Nullable ccx $$0, cqz $$1, ckj $$2, ht $$3) {
      if ($$1 instanceof alq) {
         this.a((alq)$$1, $$2, $$3);
         $$1.a($$0, dkl.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable ccx $$0, cra $$1, ht $$2) {
      $$1.a($$0, $$2, this.b, aqe.g, 1.0F, 1.0F);
   }

   private void a(alq $$0, ckj $$1, ht $$2) {
      if (this.a.a($$0, $$1, null, $$2, bkn.l, true, false) instanceof bvw $$4) {
         $$4.c($$1.w());
         $$4.w(true);
      }
   }

   @Override
   public void a(ckj $$0, @Nullable cqz $$1, List<ui> $$2, cma $$3) {
      if (this.a == bjx.bc) {
         rt $$4 = $$0.v();
         if ($$4 != null && $$4.b("BucketVariantTag", 3)) {
            int $$5 = $$4.h("BucketVariantTag");
            n[] $$6 = new n[]{n.u, n.h};
            String $$7 = "color.minecraft." + bwu.s($$5);
            String $$8 = "color.minecraft." + bwu.t($$5);

            for (int $$9 = 0; $$9 < bwu.c.size(); $$9++) {
               if ($$5 == bwu.c.get($$9).a()) {
                  $$2.add(ui.c(bwu.c($$9)).a($$6));
                  return;
               }
            }

            $$2.add(bwu.u($$5).d().e().a($$6));
            uw $$10 = ui.c($$7);
            if (!$$7.equals($$8)) {
               $$10.f(", ").b(ui.c($$8));
            }

            $$10.a($$6);
            $$2.add($$10);
         }
      }
   }
}

import java.util.List;
import javax.annotation.Nullable;

public class cll extends cjc {
   private final bkm<?> a;
   private final aqm b;

   public cll(bkm<?> $$0, ecf $$1, aqm $$2, ckw.a $$3) {
      super($$1, $$3);
      this.a = $$0;
      this.b = $$2;
   }

   @Override
   public void a(@Nullable cdm $$0, crs $$1, clb $$2, ht $$3) {
      if ($$1 instanceof ama) {
         this.a((ama)$$1, $$2, $$3);
         $$1.a($$0, dlg.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable cdm $$0, crt $$1, ht $$2) {
      $$1.a($$0, $$2, this.b, aqo.g, 1.0F, 1.0F);
   }

   private void a(ama $$0, clb $$1, ht $$2) {
      if (this.a.a($$0, $$1, null, $$2, blc.l, true, false) instanceof bwl $$4) {
         $$4.c($$1.w());
         $$4.w(true);
      }
   }

   @Override
   public void a(clb $$0, @Nullable crs $$1, List<ur> $$2, cms $$3) {
      if (this.a == bkm.bc) {
         rz $$4 = $$0.v();
         if ($$4 != null && $$4.b("BucketVariantTag", 3)) {
            int $$5 = $$4.h("BucketVariantTag");
            n[] $$6 = new n[]{n.u, n.h};
            String $$7 = "color.minecraft." + bxj.s($$5);
            String $$8 = "color.minecraft." + bxj.t($$5);

            for (int $$9 = 0; $$9 < bxj.c.size(); $$9++) {
               if ($$5 == bxj.c.get($$9).a()) {
                  $$2.add(ur.c(bxj.c($$9)).a($$6));
                  return;
               }
            }

            $$2.add(bxj.u($$5).d().e().a($$6));
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

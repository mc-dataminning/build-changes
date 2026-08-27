import java.util.List;
import javax.annotation.Nullable;

public class cqw extends coq {
   private final bpd<?> a;
   private final atx b;

   public cqw(bpd<?> $$0, eio $$1, atx $$2, cqh.a $$3) {
      super($$1, $$3);
      this.a = $$0;
      this.b = $$2;
   }

   @Override
   public void a(@Nullable ciu $$0, cxb $$1, cqm $$2, ib $$3) {
      if ($$1 instanceof apf) {
         this.a((apf)$$1, $$2, $$3);
         $$1.a($$0, drp.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable ciu $$0, cxc $$1, ib $$2) {
      $$1.a($$0, $$2, this.b, atz.g, 1.0F, 1.0F);
   }

   private void a(apf $$0, cqm $$1, ib $$2) {
      if (this.a.a($$0, $$1, null, $$2, bpt.l, true, false) instanceof cbg $$4) {
         $$4.c($$1.x());
         $$4.w(true);
      }
   }

   @Override
   public void a(cqm $$0, @Nullable cxb $$1, List<vu> $$2, csd $$3) {
      if (this.a == bpd.bg) {
         ta $$4 = $$0.w();
         if ($$4 != null && $$4.b("BucketVariantTag", 3)) {
            int $$5 = $$4.h("BucketVariantTag");
            n[] $$6 = new n[]{n.u, n.h};
            String $$7 = "color.minecraft." + cce.t($$5);
            String $$8 = "color.minecraft." + cce.u($$5);

            for (int $$9 = 0; $$9 < cce.c.size(); $$9++) {
               if ($$5 == cce.c.get($$9).a()) {
                  $$2.add(vu.c(cce.c($$9)).a($$6));
                  return;
               }
            }

            $$2.add(cce.v($$5).d().e().a($$6));
            wi $$10 = vu.c($$7);
            if (!$$7.equals($$8)) {
               $$10.f(", ").b(vu.c($$8));
            }

            $$10.a($$6);
            $$2.add($$10);
         }
      }
   }
}

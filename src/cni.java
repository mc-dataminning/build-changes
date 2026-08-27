import java.util.List;
import javax.annotation.Nullable;

public class cni extends ckz {
   private final blz<?> a;
   private final arr b;

   public cni(blz<?> $$0, eeq $$1, arr $$2, cmt.a $$3) {
      super($$1, $$3);
      this.a = $$0;
      this.b = $$2;
   }

   @Override
   public void a(@Nullable cfi $$0, ctp $$1, cmy $$2, hx $$3) {
      if ($$1 instanceof and) {
         this.a((and)$$1, $$2, $$3);
         $$1.a($$0, dnr.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable cfi $$0, ctq $$1, hx $$2) {
      $$1.a($$0, $$2, this.b, art.g, 1.0F, 1.0F);
   }

   private void a(and $$0, cmy $$1, hx $$2) {
      if (this.a.a($$0, $$1, null, $$2, bmp.l, true, false) instanceof bya $$4) {
         $$4.c($$1.w());
         $$4.w(true);
      }
   }

   @Override
   public void a(cmy $$0, @Nullable ctp $$1, List<vf> $$2, coq $$3) {
      if (this.a == blz.bd) {
         sn $$4 = $$0.v();
         if ($$4 != null && $$4.b("BucketVariantTag", 3)) {
            int $$5 = $$4.h("BucketVariantTag");
            n[] $$6 = new n[]{n.u, n.h};
            String $$7 = "color.minecraft." + byy.s($$5);
            String $$8 = "color.minecraft." + byy.t($$5);

            for (int $$9 = 0; $$9 < byy.c.size(); $$9++) {
               if ($$5 == byy.c.get($$9).a()) {
                  $$2.add(vf.c(byy.c($$9)).a($$6));
                  return;
               }
            }

            $$2.add(byy.u($$5).d().e().a($$6));
            vt $$10 = vf.c($$7);
            if (!$$7.equals($$8)) {
               $$10.f(", ").b(vf.c($$8));
            }

            $$10.a($$6);
            $$2.add($$10);
         }
      }
   }
}

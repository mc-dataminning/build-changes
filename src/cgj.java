import java.util.List;
import javax.annotation.Nullable;

public class cgj extends cea {
   private final bfn<?> a;
   private final amg b;

   public cgj(bfn<?> $$0, dxd $$1, amg $$2, cfu.a $$3) {
      super($$1, $$3);
      this.a = $$0;
      this.b = $$2;
   }

   @Override
   public void a(@Nullable byo $$0, cmm $$1, cfz $$2, gu $$3) {
      if ($$1 instanceof aif) {
         this.a((aif)$$1, $$2, $$3);
         $$1.a($$0, dgl.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable byo $$0, cmn $$1, gu $$2) {
      $$1.a($$0, $$2, this.b, ami.g, 1.0F, 1.0F);
   }

   private void a(aif $$0, cfz $$1, gu $$2) {
      if (this.a.a($$0, $$1, null, $$2, bgd.l, true, false) instanceof brn $$4) {
         $$4.c($$1.w());
         $$4.w(true);
      }
   }

   @Override
   public void a(cfz $$0, @Nullable cmm $$1, List<sw> $$2, chq $$3) {
      if (this.a == bfn.bc) {
         qr $$4 = $$0.v();
         if ($$4 != null && $$4.b("BucketVariantTag", 3)) {
            int $$5 = $$4.h("BucketVariantTag");
            n[] $$6 = new n[]{n.u, n.h};
            String $$7 = "color.minecraft." + bsl.s($$5);
            String $$8 = "color.minecraft." + bsl.t($$5);

            for (int $$9 = 0; $$9 < bsl.c.size(); $$9++) {
               if ($$5 == bsl.c.get($$9).a()) {
                  $$2.add(sw.c(bsl.c($$9)).a($$6));
                  return;
               }
            }

            $$2.add(bsl.u($$5).d().d().a($$6));
            tj $$10 = sw.c($$7);
            if (!$$7.equals($$8)) {
               $$10.f(", ").b(sw.c($$8));
            }

            $$10.a($$6);
            $$2.add($$10);
         }
      }
   }
}

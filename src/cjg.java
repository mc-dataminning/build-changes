import java.util.List;
import javax.annotation.Nullable;

public class cjg extends cgx {
   private final bik<?> a;
   private final aot b;

   public cjg(bik<?> $$0, eaa $$1, aot $$2, cir.a $$3) {
      super($$1, $$3);
      this.a = $$0;
      this.b = $$2;
   }

   @Override
   public void a(@Nullable cbl $$0, cpk $$1, ciw $$2, gv $$3) {
      if ($$1 instanceof aki) {
         this.a((aki)$$1, $$2, $$3);
         $$1.a($$0, dji.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable cbl $$0, cpl $$1, gv $$2) {
      $$1.a($$0, $$2, this.b, aov.g, 1.0F, 1.0F);
   }

   private void a(aki $$0, ciw $$1, gv $$2) {
      if (this.a.a($$0, $$1, null, $$2, bja.l, true, false) instanceof buk $$4) {
         $$4.c($$1.w());
         $$4.w(true);
      }
   }

   @Override
   public void a(ciw $$0, @Nullable cpk $$1, List<te> $$2, ckn $$3) {
      if (this.a == bik.bc) {
         qs $$4 = $$0.v();
         if ($$4 != null && $$4.b("BucketVariantTag", 3)) {
            int $$5 = $$4.h("BucketVariantTag");
            n[] $$6 = new n[]{n.u, n.h};
            String $$7 = "color.minecraft." + bvi.s($$5);
            String $$8 = "color.minecraft." + bvi.t($$5);

            for (int $$9 = 0; $$9 < bvi.c.size(); $$9++) {
               if ($$5 == bvi.c.get($$9).a()) {
                  $$2.add(te.c(bvi.c($$9)).a($$6));
                  return;
               }
            }

            $$2.add(bvi.u($$5).d().d().a($$6));
            tr $$10 = te.c($$7);
            if (!$$7.equals($$8)) {
               $$10.f(", ").b(te.c($$8));
            }

            $$10.a($$6);
            $$2.add($$10);
         }
      }
   }
}

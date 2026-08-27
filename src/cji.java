import java.util.List;
import javax.annotation.Nullable;

public class cji extends cgz {
   private final bim<?> a;
   private final aov b;

   public cji(bim<?> $$0, eac $$1, aov $$2, cit.a $$3) {
      super($$1, $$3);
      this.a = $$0;
      this.b = $$2;
   }

   @Override
   public void a(@Nullable cbn $$0, cpm $$1, ciy $$2, gu $$3) {
      if ($$1 instanceof akk) {
         this.a((akk)$$1, $$2, $$3);
         $$1.a($$0, djk.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable cbn $$0, cpn $$1, gu $$2) {
      $$1.a($$0, $$2, this.b, aox.g, 1.0F, 1.0F);
   }

   private void a(akk $$0, ciy $$1, gu $$2) {
      if (this.a.a($$0, $$1, null, $$2, bjc.l, true, false) instanceof bum $$4) {
         $$4.c($$1.w());
         $$4.w(true);
      }
   }

   @Override
   public void a(ciy $$0, @Nullable cpm $$1, List<tf> $$2, ckp $$3) {
      if (this.a == bim.bc) {
         qr $$4 = $$0.v();
         if ($$4 != null && $$4.b("BucketVariantTag", 3)) {
            int $$5 = $$4.h("BucketVariantTag");
            n[] $$6 = new n[]{n.u, n.h};
            String $$7 = "color.minecraft." + bvk.s($$5);
            String $$8 = "color.minecraft." + bvk.t($$5);

            for (int $$9 = 0; $$9 < bvk.c.size(); $$9++) {
               if ($$5 == bvk.c.get($$9).a()) {
                  $$2.add(tf.c(bvk.c($$9)).a($$6));
                  return;
               }
            }

            $$2.add(bvk.u($$5).d().d().a($$6));
            ts $$10 = tf.c($$7);
            if (!$$7.equals($$8)) {
               $$10.f(", ").b(tf.c($$8));
            }

            $$10.a($$6);
            $$2.add($$10);
         }
      }
   }
}

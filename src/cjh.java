import java.util.List;
import javax.annotation.Nullable;

public class cjh extends cgy {
   private final bim<?> a;
   private final aov b;

   public cjh(bim<?> $$0, eab $$1, aov $$2, cis.a $$3) {
      super($$1, $$3);
      this.a = $$0;
      this.b = $$2;
   }

   @Override
   public void a(@Nullable cbm $$0, cpl $$1, cix $$2, gu $$3) {
      if ($$1 instanceof akk) {
         this.a((akk)$$1, $$2, $$3);
         $$1.a($$0, djj.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable cbm $$0, cpm $$1, gu $$2) {
      $$1.a($$0, $$2, this.b, aox.g, 1.0F, 1.0F);
   }

   private void a(akk $$0, cix $$1, gu $$2) {
      if (this.a.a($$0, $$1, null, $$2, bjc.l, true, false) instanceof bul $$4) {
         $$4.c($$1.w());
         $$4.w(true);
      }
   }

   @Override
   public void a(cix $$0, @Nullable cpl $$1, List<tf> $$2, cko $$3) {
      if (this.a == bim.bc) {
         qr $$4 = $$0.v();
         if ($$4 != null && $$4.b("BucketVariantTag", 3)) {
            int $$5 = $$4.h("BucketVariantTag");
            n[] $$6 = new n[]{n.u, n.h};
            String $$7 = "color.minecraft." + bvj.s($$5);
            String $$8 = "color.minecraft." + bvj.t($$5);

            for (int $$9 = 0; $$9 < bvj.c.size(); $$9++) {
               if ($$5 == bvj.c.get($$9).a()) {
                  $$2.add(tf.c(bvj.c($$9)).a($$6));
                  return;
               }
            }

            $$2.add(bvj.u($$5).d().d().a($$6));
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

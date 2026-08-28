import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cwq extends cun {
   private static final MapCodec<chr.d> a = chr.d.a.fieldOf("BucketVariantTag");
   private final bul<?> b;
   private final awk c;

   public cwq(bul<?> $$0, erj $$1, awk $$2, cvx.a $$3) {
      super($$1, $$3);
      this.b = $$0;
      this.c = $$2;
   }

   @Override
   public void a(@Nullable com $$0, dfb $$1, cwb $$2, jh $$3) {
      if ($$1 instanceof arn) {
         this.a((arn)$$1, $$2, $$3);
         $$1.a($$0, eag.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable com $$0, dfc $$1, jh $$2) {
      $$1.a($$0, $$2, this.c, awm.g, 1.0F, 1.0F);
   }

   private void a(arn $$0, cwb $$1, jh $$2) {
      bue $$3 = this.b.b($$0, bul.a($$0, $$1, null), $$2, buk.l, true, false);
      if ($$3 instanceof cgt $$4) {
         cyk $$5 = $$1.a(ku.X, cyk.a);
         $$4.h($$5.c());
         $$4.x(true);
      }

      if ($$3 != null) {
         $$0.a_($$3);
      }
   }

   @Override
   public void a(cwb $$0, cvx.b $$1, List<xi> $$2, cxt $$3) {
      if (this.b == bul.bg) {
         cyk $$4 = $$0.a(ku.X, cyk.a);
         if ($$4.b()) {
            return;
         }

         Optional<chr.d> $$5 = $$4.a(a).result();
         if ($$5.isPresent()) {
            chr.d $$6 = $$5.get();
            n[] $$7 = new n[]{n.u, n.h};
            String $$8 = "color.minecraft." + $$6.c();
            String $$9 = "color.minecraft." + $$6.d();
            int $$10 = chr.c.indexOf($$6);
            if ($$10 != -1) {
               $$2.add(xi.c(chr.b($$10)).a($$7));
               return;
            }

            $$2.add($$6.b().d().e().a($$7));
            xw $$11 = xi.c($$8);
            if (!$$8.equals($$9)) {
               $$11.f(", ").b(xi.c($$9));
            }

            $$11.a($$7);
            $$2.add($$11);
         }
      }
   }
}

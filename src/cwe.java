import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cwe extends ctx {
   private static final MapCodec<cha.d> a = cha.d.a.fieldOf("BucketVariantTag");
   private final btv<?> b;
   private final awd c;

   public cwe(btv<?> $$0, eqo $$1, awd $$2, cvk.a $$3) {
      super($$1, $$3);
      this.b = $$0;
      this.c = $$2;
   }

   @Override
   public void a(@Nullable cnu $$0, deg $$1, cvp $$2, je $$3) {
      if ($$1 instanceof arh) {
         this.a((arh)$$1, $$2, $$3);
         $$1.a($$0, dzl.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable cnu $$0, deh $$1, je $$2) {
      $$1.a($$0, $$2, this.c, awf.g, 1.0F, 1.0F);
   }

   private void a(arh $$0, cvp $$1, je $$2) {
      if (this.b.a($$0, $$1, null, $$2, btu.l, true, false) instanceof cgc $$4) {
         cye $$5 = $$1.a(kr.S, cye.a);
         $$4.h($$5.c());
         $$4.x(true);
      }
   }

   @Override
   public void a(cvp $$0, cvk.b $$1, List<xd> $$2, cxh $$3) {
      if (this.b == btv.bg) {
         cye $$4 = $$0.a(kr.S, cye.a);
         if ($$4.b()) {
            return;
         }

         Optional<cha.d> $$5 = $$4.a(a).result();
         if ($$5.isPresent()) {
            cha.d $$6 = $$5.get();
            n[] $$7 = new n[]{n.u, n.h};
            String $$8 = "color.minecraft." + $$6.c();
            String $$9 = "color.minecraft." + $$6.d();
            int $$10 = cha.c.indexOf($$6);
            if ($$10 != -1) {
               $$2.add(xd.c(cha.b($$10)).a($$7));
               return;
            }

            $$2.add($$6.b().d().e().a($$7));
            xr $$11 = xd.c($$8);
            if (!$$8.equals($$9)) {
               $$11.f(", ").b(xd.c($$9));
            }

            $$11.a($$7);
            $$2.add($$11);
         }
      }
   }
}

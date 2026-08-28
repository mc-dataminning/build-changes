import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cwm extends cui {
   private static final MapCodec<chm.d> a = chm.d.a.fieldOf("BucketVariantTag");
   private final bug<?> b;
   private final awj c;

   public cwm(bug<?> $$0, erd $$1, awj $$2, cvt.a $$3) {
      super($$1, $$3);
      this.b = $$0;
      this.c = $$2;
   }

   @Override
   public void a(@Nullable coh $$0, dev $$1, cvx $$2, jg $$3) {
      if ($$1 instanceof arm) {
         this.a((arm)$$1, $$2, $$3);
         $$1.a($$0, eaa.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable coh $$0, dew $$1, jg $$2) {
      $$1.a($$0, $$2, this.c, awl.g, 1.0F, 1.0F);
   }

   private void a(arm $$0, cvx $$1, jg $$2) {
      if (this.b.a($$0, $$1, null, $$2, buf.l, true, false) instanceof cgo $$4) {
         cyg $$5 = $$1.a(kt.W, cyg.a);
         $$4.h($$5.c());
         $$4.x(true);
      }
   }

   @Override
   public void a(cvx $$0, cvt.b $$1, List<xh> $$2, cxp $$3) {
      if (this.b == bug.bg) {
         cyg $$4 = $$0.a(kt.W, cyg.a);
         if ($$4.b()) {
            return;
         }

         Optional<chm.d> $$5 = $$4.a(a).result();
         if ($$5.isPresent()) {
            chm.d $$6 = $$5.get();
            n[] $$7 = new n[]{n.u, n.h};
            String $$8 = "color.minecraft." + $$6.c();
            String $$9 = "color.minecraft." + $$6.d();
            int $$10 = chm.c.indexOf($$6);
            if ($$10 != -1) {
               $$2.add(xh.c(chm.b($$10)).a($$7));
               return;
            }

            $$2.add($$6.b().d().e().a($$7));
            xv $$11 = xh.c($$8);
            if (!$$8.equals($$9)) {
               $$11.f(", ").b(xh.c($$9));
            }

            $$11.a($$7);
            $$2.add($$11);
         }
      }
   }
}

import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cwa extends ctr {
   private static final MapCodec<cgv.d> a = cgv.d.a.fieldOf("BucketVariantTag");
   private final btq<?> b;
   private final awc c;

   public cwa(btq<?> $$0, eqa $$1, awc $$2, cvg.a $$3) {
      super($$1, $$3);
      this.b = $$0;
      this.c = $$2;
   }

   @Override
   public void a(@Nullable cnp $$0, dds $$1, cvl $$2, je $$3) {
      if ($$1 instanceof arg) {
         this.a((arg)$$1, $$2, $$3);
         $$1.a($$0, dyx.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable cnp $$0, ddt $$1, je $$2) {
      $$1.a($$0, $$2, this.c, awe.g, 1.0F, 1.0F);
   }

   private void a(arg $$0, cvl $$1, je $$2) {
      if (this.b.a($$0, $$1, null, $$2, btp.l, true, false) instanceof cfx $$4) {
         cya $$5 = $$1.a(kr.P, cya.a);
         $$4.h($$5.c());
         $$4.x(true);
      }
   }

   @Override
   public void a(cvl $$0, cvg.b $$1, List<xd> $$2, cxf $$3) {
      if (this.b == btq.bg) {
         cya $$4 = $$0.a(kr.P, cya.a);
         if ($$4.b()) {
            return;
         }

         Optional<cgv.d> $$5 = $$4.a(a).result();
         if ($$5.isPresent()) {
            cgv.d $$6 = $$5.get();
            n[] $$7 = new n[]{n.u, n.h};
            String $$8 = "color.minecraft." + $$6.c();
            String $$9 = "color.minecraft." + $$6.d();
            int $$10 = cgv.c.indexOf($$6);
            if ($$10 != -1) {
               $$2.add(xd.c(cgv.b($$10)).a($$7));
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

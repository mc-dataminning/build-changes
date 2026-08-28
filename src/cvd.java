import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cvd extends cst {
   private static final MapCodec<cgc.d> a = cgc.d.a.fieldOf("BucketVariantTag");
   private final bsw<?> b;
   private final avn c;

   public cvd(bsw<?> $$0, eox $$1, avn $$2, cuj.a $$3) {
      super($$1, $$3);
      this.b = $$0;
      this.c = $$2;
   }

   @Override
   public void a(@Nullable cmv $$0, dcu $$1, cuo $$2, jd $$3) {
      if ($$1 instanceof aqt) {
         this.a((aqt)$$1, $$2, $$3);
         $$1.a($$0, dxw.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable cmv $$0, dcv $$1, jd $$2) {
      $$1.a($$0, $$2, this.c, avp.g, 1.0F, 1.0F);
   }

   private void a(aqt $$0, cuo $$1, jd $$2) {
      if (this.b.a($$0, $$1, null, $$2, btp.l, true, false) instanceof cfe $$4) {
         cxf $$5 = $$1.a(kq.N, cxf.a);
         $$4.c($$5.c());
         $$4.w(true);
      }
   }

   @Override
   public void a(cuo $$0, cuj.b $$1, List<wy> $$2, cwk $$3) {
      if (this.b == bsw.bg) {
         cxf $$4 = $$0.a(kq.N, cxf.a);
         if ($$4.b()) {
            return;
         }

         Optional<cgc.d> $$5 = $$4.a(a).result();
         if ($$5.isPresent()) {
            cgc.d $$6 = $$5.get();
            n[] $$7 = new n[]{n.u, n.h};
            String $$8 = "color.minecraft." + $$6.c();
            String $$9 = "color.minecraft." + $$6.d();
            int $$10 = cgc.c.indexOf($$6);
            if ($$10 != -1) {
               $$2.add(wy.c(cgc.c($$10)).a($$7));
               return;
            }

            $$2.add($$6.b().d().e().a($$7));
            xm $$11 = wy.c($$8);
            if (!$$8.equals($$9)) {
               $$11.f(", ").b(wy.c($$9));
            }

            $$11.a($$7);
            $$2.add($$11);
         }
      }
   }
}

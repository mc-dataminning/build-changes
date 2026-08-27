import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cut extends csk {
   private static final MapCodec<cfe.d> a = cfe.d.a.fieldOf("BucketVariantTag");
   private final bsb<?> b;
   private final avn c;

   public cut(bsb<?> $$0, epd $$1, avn $$2, cuc.a $$3) {
      super($$1, $$3);
      this.b = $$0;
      this.c = $$2;
   }

   @Override
   public void a(@Nullable cly $$0, dca $$1, cuh $$2, ir $$3) {
      if ($$1 instanceof aqt) {
         this.a((aqt)$$1, $$2, $$3);
         $$1.a($$0, dxv.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable cly $$0, dcb $$1, ir $$2) {
      $$1.a($$0, $$2, this.c, avq.g, 1.0F, 1.0F);
   }

   private void a(aqt $$0, cuh $$1, ir $$2) {
      if (this.b.a($$0, $$1, null, $$2, bss.l, true, false) instanceof ceg $$4) {
         cxf $$5 = $$1.a(ke.N, cxf.a);
         $$4.c($$5.c());
         $$4.w(true);
      }
   }

   @Override
   public void a(cuh $$0, @Nullable dca $$1, List<xe> $$2, cwi $$3) {
      if (this.b == bsb.bk) {
         cxf $$4 = $$0.a(ke.N, cxf.a);
         if ($$4.b()) {
            return;
         }

         Optional<cfe.d> $$5 = $$4.a(a).result();
         if ($$5.isPresent()) {
            cfe.d $$6 = $$5.get();
            n[] $$7 = new n[]{n.u, n.h};
            String $$8 = "color.minecraft." + $$6.c();
            String $$9 = "color.minecraft." + $$6.d();
            int $$10 = cfe.c.indexOf($$6);
            if ($$10 != -1) {
               $$2.add(xe.c(cfe.c($$10)).a($$7));
               return;
            }

            $$2.add($$6.b().d().e().a($$7));
            xs $$11 = xe.c($$8);
            if (!$$8.equals($$9)) {
               $$11.f(", ").a(xe.c($$9));
            }

            $$11.a($$7);
            $$2.add($$11);
         }
      }
   }
}

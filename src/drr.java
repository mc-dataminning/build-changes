import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drr extends diz {
   public static final MapCodec<drr> c = b(drr::new);

   @Override
   public MapCodec<drr> a() {
      return c;
   }

   protected drr(dxp.d $$0) {
      super($$0);
   }

   @Override
   public dus a(ji $$0, dxq $$1) {
      return new dwi($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dus> dut<T> a(dgz $$0, dxq $$1, duu<T> $$2) {
      return a($$0, $$2, duu.C);
   }

   @Override
   protected void a(dgz $$0, ji $$1, cpr $$2) {
      dus $$3 = $$0.c_($$1);
      if ($$3 instanceof dwi) {
         $$2.a((bta)$$3);
         $$2.a(awk.at);
      }
   }

   @Override
   public void a(dxq $$0, dgz $$1, ji $$2, azh $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, awa.zi, awb.e, 1.0F, 1.0F, false);
         }

         $$1.a(lt.ah, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}

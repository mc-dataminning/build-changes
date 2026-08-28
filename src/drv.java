import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drv extends djg {
   public static final MapCodec<drv> c = b(drv::new);

   @Override
   public MapCodec<drv> a() {
      return c;
   }

   protected drv(dxt.d $$0) {
      super($$0);
   }

   @Override
   public duw a(jh $$0, dxu $$1) {
      return new dwm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends duw> dux<T> a(dhh $$0, dxu $$1, duy<T> $$2) {
      return a($$0, $$2, duy.C);
   }

   @Override
   protected void a(dhh $$0, jh $$1, cpw $$2) {
      duw $$3 = $$0.c_($$1);
      if ($$3 instanceof dwm) {
         $$2.a((btk)$$3);
         $$2.a(axp.at);
      }
   }

   @Override
   public void a(dxu $$0, dhh $$1, jh $$2, bam $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, axf.yJ, axg.e, 1.0F, 1.0F, false);
         }

         $$1.a(ls.af, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}

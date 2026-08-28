import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dvf extends dmj {
   public static final MapCodec<dvf> c = b(dvf::new);

   @Override
   public MapCodec<dvf> a() {
      return c;
   }

   protected dvf(ebp.d $$0) {
      super($$0);
   }

   @Override
   public dyo a(iw $$0, ebq $$1) {
      return new eaf($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyo> dyp<T> a(dkj $$0, ebq $$1, dyq<T> $$2) {
      return a($$0, $$2, dyq.C);
   }

   @Override
   protected void a(dkj $$0, iw $$1, csi $$2) {
      dyo $$3 = $$0.c_($$1);
      if ($$3 instanceof eaf) {
         $$2.a((bve)$$3);
         $$2.a(axi.at);
      }
   }

   @Override
   public void a(ebq $$0, dkj $$1, iw $$2, bai $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, awy.zo, awz.e, 1.0F, 1.0F, false);
         }

         $$1.a(lz.ah, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}

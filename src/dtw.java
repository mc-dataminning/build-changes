import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtw extends dla {
   public static final MapCodec<dtw> c = b(dtw::new);

   @Override
   public MapCodec<dtw> a() {
      return c;
   }

   protected dtw(eag.d $$0) {
      super($$0);
   }

   @Override
   public dxf a(iu $$0, eah $$1) {
      return new dyw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxf> dxg<T> a(dja $$0, eah $$1, dxh<T> $$2) {
      return a($$0, $$2, dxh.C);
   }

   @Override
   protected void a(dja $$0, iu $$1, crc $$2) {
      dxf $$3 = $$0.c_($$1);
      if ($$3 instanceof dyw) {
         $$2.a((buf)$$3);
         $$2.a(awx.at);
      }
   }

   @Override
   public void a(eah $$0, dja $$1, iu $$2, azv $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, awn.zo, awo.e, 1.0F, 1.0F, false);
         }

         $$1.a(lx.ah, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}

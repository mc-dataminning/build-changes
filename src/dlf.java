import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlf extends dct {
   public static final MapCodec<dlf> c = b(dlf::new);

   @Override
   public MapCodec<dlf> a() {
      return c;
   }

   protected dlf(dra.d $$0) {
      super($$0);
   }

   @Override
   public dog a(io $$0, drb $$1) {
      return new dpt($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dog> doh<T> a(dax $$0, drb $$1, doi<T> $$2) {
      return a($$0, $$2, doi.B);
   }

   @Override
   protected void a(dax $$0, io $$1, clw $$2) {
      dog $$3 = $$0.c_($$1);
      if ($$3 instanceof dpt) {
         $$2.a((bpy)$$3);
         $$2.a(avr.at);
      }
   }

   @Override
   public void a(drb $$0, dax $$1, io $$2, ayk $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, avh.yh, avi.e, 1.0F, 1.0F, false);
         }

         $$1.a(ky.ae, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}

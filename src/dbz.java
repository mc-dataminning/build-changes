import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbz extends ctn {
   public static final MapCodec<dbz> c = b(dbz::new);

   @Override
   public MapCodec<dbz> a() {
      return c;
   }

   protected dbz(dgv.d $$0) {
      super($$0);
   }

   @Override
   public der a(ht $$0, dgw $$1) {
      return new dgd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends der> des<T> a(crs $$0, dgw $$1, det<T> $$2) {
      return a($$0, $$2, det.B);
   }

   @Override
   protected void a(crs $$0, ht $$1, cdm $$2) {
      der $$3 = $$0.c_($$1);
      if ($$3 instanceof dgd) {
         $$2.a((bit)$$3);
         $$2.a(aqx.at);
      }
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, ato $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, aqn.wB, aqo.e, 1.0F, 1.0F, false);
         }

         $$1.a(js.Z, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}

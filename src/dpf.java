import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpf extends dgt {
   public static final MapCodec<dpf> c = b(dpf::new);

   @Override
   public MapCodec<dpf> a() {
      return c;
   }

   protected dpf(dvc.d $$0) {
      super($$0);
   }

   @Override
   public dsg a(jg $$0, dvd $$1) {
      return new dtv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsg> dsh<T> a(dev $$0, dvd $$1, dsi<T> $$2) {
      return a($$0, $$2, dsi.B);
   }

   @Override
   protected void a(dev $$0, jg $$1, coh $$2) {
      dsg $$3 = $$0.c_($$1);
      if ($$3 instanceof dtv) {
         $$2.a((bsa)$$3);
         $$2.a(awu.at);
      }
   }

   @Override
   public void a(dvd $$0, dev $$1, jg $$2, azr $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, awk.yo, awl.e, 1.0F, 1.0F, false);
         }

         $$1.a(lq.ae, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}

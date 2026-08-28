import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dui extends dlm {
   public static final MapCodec<dui> c = b(dui::new);

   @Override
   public MapCodec<dui> a() {
      return c;
   }

   protected dui(eas.d $$0) {
      super($$0);
   }

   @Override
   public dxr a(iv $$0, eat $$1) {
      return new dzi($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxr> dxs<T> a(djm $$0, eat $$1, dxt<T> $$2) {
      return a($$0, $$2, dxt.C);
   }

   @Override
   protected void a(djm $$0, iv $$1, crm $$2) {
      dxr $$3 = $$0.c_($$1);
      if ($$3 instanceof dzi) {
         $$2.a((bui)$$3);
         $$2.a(awx.at);
      }
   }

   @Override
   public void a(eat $$0, djm $$1, iv $$2, azv $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, awn.zo, awo.e, 1.0F, 1.0F, false);
         }

         $$1.a(ly.ah, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}

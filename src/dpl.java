import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpl extends dgz {
   public static final MapCodec<dpl> c = b(dpl::new);

   @Override
   public MapCodec<dpl> a() {
      return c;
   }

   protected dpl(dvi.d $$0) {
      super($$0);
   }

   @Override
   public dsm a(jh $$0, dvj $$1) {
      return new dub($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsm> dsn<T> a(dfb $$0, dvj $$1, dso<T> $$2) {
      return a($$0, $$2, dso.B);
   }

   @Override
   protected void a(dfb $$0, jh $$1, com $$2) {
      dsm $$3 = $$0.c_($$1);
      if ($$3 instanceof dub) {
         $$2.a((bsf)$$3);
         $$2.a(awv.at);
      }
   }

   @Override
   public void a(dvj $$0, dfb $$1, jh $$2, azs $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, awl.yo, awm.e, 1.0F, 1.0F, false);
         }

         $$1.a(lr.ae, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}

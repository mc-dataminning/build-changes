import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqz extends dii {
   public static final MapCodec<dqz> c = b(dqz::new);

   @Override
   public MapCodec<dqz> a() {
      return c;
   }

   protected dqz(dwx.d $$0) {
      super($$0);
   }

   @Override
   public dua a(ji $$0, dwy $$1) {
      return new dvq($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dua> dub<T> a(dgj $$0, dwy $$1, duc<T> $$2) {
      return a($$0, $$2, duc.C);
   }

   @Override
   protected void a(dgj $$0, ji $$1, coy $$2) {
      dua $$3 = $$0.c_($$1);
      if ($$3 instanceof dvq) {
         $$2.a((bsn)$$3);
         $$2.a(awk.at);
      }
   }

   @Override
   public void a(dwy $$0, dgj $$1, ji $$2, azh $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, awa.yY, awb.e, 1.0F, 1.0F, false);
         }

         $$1.a(lt.ag, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}

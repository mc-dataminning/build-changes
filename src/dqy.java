import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqy extends dih {
   public static final MapCodec<dqy> c = b(dqy::new);

   @Override
   public MapCodec<dqy> a() {
      return c;
   }

   protected dqy(dww.d $$0) {
      super($$0);
   }

   @Override
   public dtz a(ji $$0, dwx $$1) {
      return new dvp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dtz> dua<T> a(dgi $$0, dwx $$1, dub<T> $$2) {
      return a($$0, $$2, dub.C);
   }

   @Override
   protected void a(dgi $$0, ji $$1, cox $$2) {
      dtz $$3 = $$0.c_($$1);
      if ($$3 instanceof dvp) {
         $$2.a((bsl)$$3);
         $$2.a(awk.at);
      }
   }

   @Override
   public void a(dwx $$0, dgi $$1, ji $$2, azh $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, awa.yZ, awb.e, 1.0F, 1.0F, false);
         }

         $$1.a(lt.ag, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}

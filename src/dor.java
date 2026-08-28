import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dor extends dge {
   public static final MapCodec<dor> c = b(dor::new);

   @Override
   public MapCodec<dor> a() {
      return c;
   }

   protected dor(dun.d $$0) {
      super($$0);
   }

   @Override
   public drs a(je $$0, duo $$1) {
      return new dth($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends drs> drt<T> a(deg $$0, duo $$1, dru<T> $$2) {
      return a($$0, $$2, dru.B);
   }

   @Override
   protected void a(deg $$0, je $$1, cnu $$2) {
      drs $$3 = $$0.c_($$1);
      if ($$3 instanceof dth) {
         $$2.a((brr)$$3);
         $$2.a(awo.at);
      }
   }

   @Override
   public void a(duo $$0, deg $$1, je $$2, azl $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, awe.yq, awf.e, 1.0F, 1.0F, false);
         }

         $$1.a(ln.ae, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}

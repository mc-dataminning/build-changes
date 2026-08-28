import com.mojang.serialization.MapCodec;

public class dmp extends dpe {
   public static final MapCodec<dmp> a = b(dmp::new);

   @Override
   public MapCodec<dmp> a() {
      return a;
   }

   public dmp(dur.d $$0) {
      super($$0);
   }

   @Override
   public void a(dus $$0, dej $$1, jf $$2, azn $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(lo.Z, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}

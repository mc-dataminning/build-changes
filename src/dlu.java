import com.mojang.serialization.MapCodec;

public class dlu extends dgf {
   public static final MapCodec<dlu> d = b(dlu::new);

   @Override
   public MapCodec<dlu> a() {
      return d;
   }

   public dlu(dur.d $$0) {
      super($$0, kl.e);
   }

   @Override
   protected double b(dus $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(dus $$0) {
      return true;
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, btr $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.aD();
      }
   }

   @Override
   protected int a(dus $$0, dej $$1, jf $$2) {
      return 3;
   }
}

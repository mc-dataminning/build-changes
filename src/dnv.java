import com.mojang.serialization.MapCodec;

public class dnv extends die {
   public static final MapCodec<dnv> d = b(dnv::new);

   @Override
   public MapCodec<dnv> a() {
      return d;
   }

   public dnv(dwv.d $$0) {
      super($$0, ko.e);
   }

   @Override
   protected double b(dww $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(dww $$0) {
      return true;
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, buk $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.aE();
      }
   }

   @Override
   protected int a(dww $$0, dgh $$1, ji $$2) {
      return 3;
   }
}

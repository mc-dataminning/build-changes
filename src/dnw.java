import com.mojang.serialization.MapCodec;

public class dnw extends dif {
   public static final MapCodec<dnw> d = b(dnw::new);

   @Override
   public MapCodec<dnw> a() {
      return d;
   }

   public dnw(dww.d $$0) {
      super($$0, ko.e);
   }

   @Override
   protected double b(dwx $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(dwx $$0) {
      return true;
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, buk $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.aE();
      }
   }

   @Override
   protected int a(dwx $$0, dgi $$1, ji $$2) {
      return 3;
   }
}

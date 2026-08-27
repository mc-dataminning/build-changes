import com.mojang.serialization.MapCodec;

public class dek extends dan {
   public static final MapCodec<dek> a = b(dek::new);
   private static final eos[] b = new eos[]{
      cys.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cys.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      cys.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cys.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      cys.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cys.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      cys.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cys.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<dek> a() {
      return a;
   }

   public dek(dli.d $$0) {
      super($$0);
   }

   @Override
   protected cvq d() {
      return cpg.uc;
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return b[this.g($$0)];
   }
}

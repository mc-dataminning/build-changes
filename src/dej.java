import com.mojang.serialization.MapCodec;

public class dej extends cyv {
   public static final MapCodec<dej> d = b(dej::new);

   @Override
   public MapCodec<dej> a() {
      return d;
   }

   public dej(dna.d $$0) {
      super($$0, ji.e);
   }

   @Override
   protected double b(dnb $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(dnb $$0) {
      return true;
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, box $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.ay();
      }
   }

   @Override
   protected int a(dnb $$0, cxb $$1, ib $$2) {
      return 3;
   }
}

import com.mojang.serialization.MapCodec;

public class dqs extends dky {
   public static final MapCodec<dqs> c = b(dqs::new);

   @Override
   public MapCodec<dqs> a() {
      return c;
   }

   public dqs(eag.d $$0) {
      super($$0, kb.e);
   }

   @Override
   protected double b(eah $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(eah $$0) {
      return true;
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, bwf $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.aE();
      }
   }

   @Override
   protected int a(eah $$0, dja $$1, iu $$2) {
      return 3;
   }
}

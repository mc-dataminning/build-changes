import com.mojang.serialization.MapCodec;

public class dld extends dfo {
   public static final MapCodec<dld> d = b(dld::new);

   @Override
   public MapCodec<dld> a() {
      return d;
   }

   public dld(dtz.d $$0) {
      super($$0, kk.e);
   }

   @Override
   protected double b(dua $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(dua $$0) {
      return true;
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, btj $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.aD();
      }
   }

   @Override
   protected int a(dua $$0, dds $$1, je $$2) {
      return 3;
   }
}

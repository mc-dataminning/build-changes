import com.mojang.serialization.MapCodec;

public class djc extends ddn {
   public static final MapCodec<djc> d = b(djc::new);

   @Override
   public MapCodec<djc> a() {
      return d;
   }

   public djc(drw.d $$0) {
      super($$0, kf.e);
   }

   @Override
   protected double b(drx $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(drx $$0) {
      return true;
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, bsp $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.aA();
      }
   }

   @Override
   protected int a(drx $$0, dbt $$1, iz $$2) {
      return 3;
   }
}

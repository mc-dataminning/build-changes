import com.mojang.serialization.MapCodec;

public class dgo extends dba {
   public static final MapCodec<dgo> d = b(dgo::new);

   @Override
   public MapCodec<dgo> a() {
      return d;
   }

   public dgo(dph.d $$0) {
      super($$0, jk.e);
   }

   @Override
   protected double b(dpi $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(dpi $$0) {
      return true;
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, bqa $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.ay();
      }
   }

   @Override
   protected int a(dpi $$0, czg $$1, id $$2) {
      return 3;
   }
}

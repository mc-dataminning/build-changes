import com.mojang.serialization.MapCodec;

public class dig extends dcr {
   public static final MapCodec<dig> d = b(dig::new);

   @Override
   public MapCodec<dig> a() {
      return d;
   }

   public dig(dra.d $$0) {
      super($$0, ju.e);
   }

   @Override
   protected double b(drb $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(drb $$0) {
      return true;
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, bru $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.aA();
      }
   }

   @Override
   protected int a(drb $$0, dax $$1, io $$2) {
      return 3;
   }
}

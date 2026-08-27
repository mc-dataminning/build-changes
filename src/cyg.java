import com.mojang.serialization.MapCodec;

public class cyg extends css {
   public static final MapCodec<cyg> d = b(cyg::new);

   @Override
   public MapCodec<cyg> a() {
      return d;
   }

   public cyg(dga.d $$0) {
      super($$0, iy.e);
   }

   @Override
   protected double b(dgb $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(dgb $$0) {
      return true;
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, bjt $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.aw();
      }
   }

   @Override
   public int a(dgb $$0, cqz $$1, ht $$2) {
      return 3;
   }
}

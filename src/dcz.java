import com.mojang.serialization.MapCodec;

public class dcz extends dec {
   public static final MapCodec<dcz> a = b(dcz::new);
   private static final etc[] b = new etc[]{
      dch.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dch.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      dch.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dch.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dch.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dch.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      dch.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dch.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<dcz> a() {
      return a;
   }

   public dcz(dph.d $$0) {
      super($$0);
   }

   @Override
   protected czf d() {
      return crv.ud;
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return b[this.g($$0)];
   }
}

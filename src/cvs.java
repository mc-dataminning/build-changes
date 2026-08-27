import com.mojang.serialization.MapCodec;

public class cvs extends cwv {
   public static final MapCodec<cvs> a = b(cvs::new);
   private static final ekn[] b = new ekn[]{
      cva.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cva.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      cva.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cva.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      cva.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cva.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      cva.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cva.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<cvs> a() {
      return a;
   }

   public cvs(dhh.d $$0) {
      super($$0);
   }

   @Override
   protected crz d() {
      return clm.tX;
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return b[this.g($$0)];
   }
}

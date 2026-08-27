import com.mojang.serialization.MapCodec;

public class deq extends dft {
   public static final MapCodec<deq> a = b(deq::new);
   private static final evd[] b = new evd[]{
      ddy.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      ddy.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      ddy.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      ddy.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      ddy.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      ddy.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      ddy.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      ddy.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<deq> a() {
      return a;
   }

   public deq(dra.d $$0) {
      super($$0);
   }

   @Override
   protected daw d() {
      return ctr.uf;
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return b[this.g($$0)];
   }
}

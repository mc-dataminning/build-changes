import com.mojang.serialization.MapCodec;

public class dmj extends dft {
   public static final MapCodec<dmj> a = b(dmj::new);
   public static final int b = 2;
   public static final dsb c = drr.aq;
   private static final float g = 3.0F;
   private static final evd[] h = new evd[]{ddy.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), ddy.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<dmj> a() {
      return a;
   }

   public dmj(dra.d $$0) {
      super($$0);
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(c);
   }

   @Override
   public evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return h[this.g($$0)];
   }

   @Override
   protected dsb b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected daw d() {
      return ctr.vi;
   }

   @Override
   public drb b(int $$0) {
      return $$0 == 2 ? dea.bS.n() : super.b($$0);
   }

   @Override
   public void b(drb $$0, aqm $$1, io $$2, ayk $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dax $$0) {
      return 1;
   }
}

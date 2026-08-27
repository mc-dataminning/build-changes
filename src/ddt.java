import com.mojang.serialization.MapCodec;

public class ddt extends dft {
   public static final MapCodec<ddt> a = b(ddt::new);
   public static final int b = 3;
   public static final dsb c = drr.as;
   private static final evd[] g = new evd[]{
      ddy.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      ddy.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      ddy.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      ddy.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<ddt> a() {
      return a;
   }

   public ddt(dra.d $$0) {
      super($$0);
   }

   @Override
   protected dsb b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected daw d() {
      return ctr.vl;
   }

   @Override
   protected void b(drb $$0, aqm $$1, io $$2, ayk $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dax $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(c);
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return g[this.g($$0)];
   }
}

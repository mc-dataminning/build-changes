import com.mojang.serialization.MapCodec;

public class czv extends dbv {
   public static final MapCodec<czv> a = b(czv::new);
   public static final int b = 3;
   public static final dnz c = dnp.as;
   private static final eqk[] g = new eqk[]{
      daa.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      daa.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      daa.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      daa.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<czv> a() {
      return a;
   }

   public czv(dmy.d $$0) {
      super($$0);
   }

   @Override
   protected dnz b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected cwy d() {
      return cqn.vi;
   }

   @Override
   protected void b(dmz $$0, apf $$1, ib $$2, axd $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(cwz $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(c);
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return g[this.g($$0)];
   }
}

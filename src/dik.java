import com.mojang.serialization.MapCodec;

public class dik extends dbv {
   public static final MapCodec<dik> a = b(dik::new);
   public static final int b = 2;
   public static final dnz c = dnp.aq;
   private static final float g = 3.0F;
   private static final eqk[] h = new eqk[]{daa.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), daa.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<dik> a() {
      return a;
   }

   public dik(dmy.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(c);
   }

   @Override
   public eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return h[this.g($$0)];
   }

   @Override
   protected dnz b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected cwy d() {
      return cqn.vf;
   }

   @Override
   public dmz b(int $$0) {
      return $$0 == 2 ? dac.bS.o() : super.b($$0);
   }

   @Override
   public void b(dmz $$0, apf $$1, ib $$2, axd $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(cwz $$0) {
      return 1;
   }
}

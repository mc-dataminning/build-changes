import com.mojang.serialization.MapCodec;

public class dev extends dgv {
   public static final MapCodec<dev> a = b(dev::new);
   public static final int b = 3;
   public static final dtd c = dst.as;
   private static final ewl[] g = new ewl[]{
      dfa.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dfa.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dfa.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dfa.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<dev> a() {
      return a;
   }

   public dev(dsc.d $$0) {
      super($$0);
   }

   @Override
   protected dtd b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected dby d() {
      return cut.vl;
   }

   @Override
   protected void b(dsd $$0, arf $$1, iz $$2, azh $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dbz $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(c);
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return g[this.g($$0)];
   }
}

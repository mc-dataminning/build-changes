import com.mojang.serialization.MapCodec;

public class dnl extends dgv {
   public static final MapCodec<dnl> a = b(dnl::new);
   public static final int b = 2;
   public static final dtd c = dst.aq;
   private static final float g = 3.0F;
   private static final ewl[] h = new ewl[]{dfa.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), dfa.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<dnl> a() {
      return a;
   }

   public dnl(dsc.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(c);
   }

   @Override
   public ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return h[this.g($$0)];
   }

   @Override
   protected dtd b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected dby d() {
      return cut.vi;
   }

   @Override
   public dsd b(int $$0) {
      return $$0 == 2 ? dfc.bS.o() : super.b($$0);
   }

   @Override
   public void b(dsd $$0, arf $$1, iz $$2, azh $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dbz $$0) {
      return 1;
   }
}

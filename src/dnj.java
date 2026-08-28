import com.mojang.serialization.MapCodec;

public class dnj extends dgt {
   public static final MapCodec<dnj> a = b(dnj::new);
   public static final int b = 2;
   public static final dtb c = dsr.aq;
   private static final float g = 3.0F;
   private static final ewj[] h = new ewj[]{dey.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), dey.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<dnj> a() {
      return a;
   }

   public dnj(dsa.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(c);
   }

   @Override
   public ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return h[this.g($$0)];
   }

   @Override
   protected dtb b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected dbw d() {
      return cur.vi;
   }

   @Override
   public dsb b(int $$0) {
      return $$0 == 2 ? dfa.bS.o() : super.b($$0);
   }

   @Override
   public void b(dsb $$0, are $$1, iz $$2, azg $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dbx $$0) {
      return 1;
   }
}

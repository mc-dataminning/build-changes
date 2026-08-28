import com.mojang.serialization.MapCodec;

public class dnk extends dgu {
   public static final MapCodec<dnk> a = b(dnk::new);
   public static final int b = 2;
   public static final dtc c = dss.aq;
   private static final float g = 3.0F;
   private static final ewk[] h = new ewk[]{dez.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), dez.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<dnk> a() {
      return a;
   }

   public dnk(dsb.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(c);
   }

   @Override
   public ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return h[this.g($$0)];
   }

   @Override
   protected dtc b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected dbx d() {
      return cus.vi;
   }

   @Override
   public dsc b(int $$0) {
      return $$0 == 2 ? dfb.bS.o() : super.b($$0);
   }

   @Override
   public void b(dsc $$0, arf $$1, iz $$2, azh $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dby $$0) {
      return 1;
   }
}

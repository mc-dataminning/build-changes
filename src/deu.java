import com.mojang.serialization.MapCodec;

public class deu extends dgu {
   public static final MapCodec<deu> a = b(deu::new);
   public static final int b = 3;
   public static final dtc c = dss.as;
   private static final ewk[] g = new ewk[]{
      dez.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dez.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dez.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dez.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<deu> a() {
      return a;
   }

   public deu(dsb.d $$0) {
      super($$0);
   }

   @Override
   protected dtc b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected dbx d() {
      return cus.vl;
   }

   @Override
   protected void b(dsc $$0, arf $$1, iz $$2, azh $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dby $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(c);
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return g[this.g($$0)];
   }
}

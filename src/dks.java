import com.mojang.serialization.MapCodec;

public class dks extends dgu {
   public static final MapCodec<dks> a = b(dks::new);
   private static final ewk[] b = new ewk[]{
      dez.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dez.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      dez.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dez.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dez.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dez.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      dez.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dez.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<dks> a() {
      return a;
   }

   public dks(dsb.d $$0) {
      super($$0);
   }

   @Override
   protected dbx d() {
      return cus.ug;
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return b[this.g($$0)];
   }
}

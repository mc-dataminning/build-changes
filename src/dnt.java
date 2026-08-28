import com.mojang.serialization.MapCodec;

public class dnt extends dhd {
   public static final MapCodec<dnt> a = b(dnt::new);
   public static final int b = 2;
   public static final dtl c = dtb.aq;
   private static final float g = 3.0F;
   private static final exa[] h = new exa[]{dfi.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), dfi.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<dnt> a() {
      return a;
   }

   public dnt(dsk.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(c);
   }

   @Override
   public exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return h[this.g($$0)];
   }

   @Override
   protected dtl b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected dcf d() {
      return cug.vi;
   }

   @Override
   public dsl b(int $$0) {
      return $$0 == 2 ? dfk.bS.o() : super.b($$0);
   }

   @Override
   public void b(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dcg $$0) {
      return 1;
   }
}

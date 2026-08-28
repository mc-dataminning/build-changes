import com.mojang.serialization.MapCodec;

public class dns extends dhc {
   public static final MapCodec<dns> a = b(dns::new);
   public static final int b = 2;
   public static final dtk c = dta.aq;
   private static final float g = 3.0F;
   private static final ewy[] h = new ewy[]{dfh.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), dfh.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<dns> a() {
      return a;
   }

   public dns(dsj.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(c);
   }

   @Override
   public ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return h[this.g($$0)];
   }

   @Override
   protected dtk b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected dce d() {
      return cuf.vi;
   }

   @Override
   public dsk b(int $$0) {
      return $$0 == 2 ? dfj.bS.o() : super.b($$0);
   }

   @Override
   public void b(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dcf $$0) {
      return 1;
   }
}

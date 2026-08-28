import com.mojang.serialization.MapCodec;

public class dil extends dkl {
   public static final MapCodec<dil> a = b(dil::new);
   public static final int b = 3;
   public static final dwu c = dwl.as;
   private static final fas[] g = new fas[]{
      diq.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      diq.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      diq.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      diq.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<dil> a() {
      return a;
   }

   public dil(dvu.d $$0) {
      super($$0);
   }

   @Override
   protected dwu b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected dfl d() {
      return cwq.vD;
   }

   @Override
   protected void b(dvv $$0, arp $$1, jh $$2, azu $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dfm $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(c);
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return g[this.h($$0)];
   }
}

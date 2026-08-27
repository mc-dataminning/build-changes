import com.mojang.serialization.MapCodec;

public class ddv extends dfv {
   public static final MapCodec<ddv> a = b(ddv::new);
   public static final int b = 3;
   public static final dsd c = drt.as;
   private static final evf[] g = new evf[]{
      dea.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dea.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dea.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dea.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<ddv> a() {
      return a;
   }

   public ddv(drc.d $$0) {
      super($$0);
   }

   @Override
   protected dsd b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected day d() {
      return ctt.vl;
   }

   @Override
   protected void b(drd $$0, aqn $$1, io $$2, aym $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(daz $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(c);
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return g[this.g($$0)];
   }
}

import com.mojang.serialization.MapCodec;

public class cxh extends cyk {
   public static final MapCodec<cxh> a = b(cxh::new);
   private static final eml[] b = new eml[]{
      cwp.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cwp.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      cwp.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cwp.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      cwp.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cwp.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      cwp.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cwp.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<cxh> a() {
      return a;
   }

   public cxh(djf.d $$0) {
      super($$0);
   }

   @Override
   protected ctn d() {
      return cna.tY;
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return b[this.g($$0)];
   }
}

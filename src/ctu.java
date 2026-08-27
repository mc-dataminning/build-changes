import com.mojang.serialization.MapCodec;

public class ctu extends cuv {
   public static final MapCodec<ctu> a = b(ctu::new);
   private static final eia[] b = new eia[]{
      ctc.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      ctc.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      ctc.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      ctc.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      ctc.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      ctc.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      ctc.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      ctc.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<ctu> a() {
      return a;
   }

   public ctu(dfc.d $$0) {
      super($$0);
   }

   @Override
   protected cqa d() {
      return cjo.tl;
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return b[this.g($$0)];
   }
}

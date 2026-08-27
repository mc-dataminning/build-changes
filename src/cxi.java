import com.mojang.serialization.MapCodec;

public class cxi extends cyl {
   public static final MapCodec<cxi> a = b(cxi::new);
   private static final emm[] b = new emm[]{
      cwq.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cwq.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      cwq.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cwq.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      cwq.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cwq.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      cwq.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cwq.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<cxi> a() {
      return a;
   }

   public cxi(djg.d $$0) {
      super($$0);
   }

   @Override
   protected cto d() {
      return cnb.tY;
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return b[this.g($$0)];
   }
}

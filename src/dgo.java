import com.mojang.serialization.MapCodec;

public class dgo extends dhr {
   public static final MapCodec<dgo> a = b(dgo::new);
   private static final exp[] b = new exp[]{
      dfw.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dfw.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      dfw.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dfw.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dfw.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dfw.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      dfw.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dfw.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<dgo> a() {
      return a;
   }

   public dgo(dsz.d $$0) {
      super($$0);
   }

   @Override
   protected dct d() {
      return cur.uf;
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return b[this.g($$0)];
   }
}

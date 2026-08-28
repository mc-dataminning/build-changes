import com.mojang.serialization.MapCodec;

public class dgq extends dht {
   public static final MapCodec<dgq> a = b(dgq::new);
   private static final ext[] b = new ext[]{
      dfy.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dfy.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      dfy.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dfy.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dfy.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dfy.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      dfy.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dfy.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<dgq> a() {
      return a;
   }

   public dgq(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected dcv d() {
      return cut.uf;
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return b[this.g($$0)];
   }
}

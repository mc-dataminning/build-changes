import com.mojang.serialization.MapCodec;

public class dib extends dje {
   public static final MapCodec<dib> a = b(dib::new);
   private static final ezm[] b = new ezm[]{
      dhj.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dhj.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      dhj.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dhj.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dhj.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dhj.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      dhj.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dhj.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<dib> a() {
      return a;
   }

   public dib(dun.d $$0) {
      super($$0);
   }

   @Override
   protected def d() {
      return cvt.uh;
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return b[this.h($$0)];
   }
}

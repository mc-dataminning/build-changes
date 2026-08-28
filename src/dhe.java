import com.mojang.serialization.MapCodec;

public class dhe extends dje {
   public static final MapCodec<dhe> a = b(dhe::new);
   public static final int b = 3;
   public static final dvo c = dve.as;
   private static final ezm[] g = new ezm[]{
      dhj.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dhj.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dhj.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dhj.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<dhe> a() {
      return a;
   }

   public dhe(dun.d $$0) {
      super($$0);
   }

   @Override
   protected dvo b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected def d() {
      return cvt.vn;
   }

   @Override
   protected void b(duo $$0, arh $$1, je $$2, azl $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(deg $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(c);
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return g[this.h($$0)];
   }
}

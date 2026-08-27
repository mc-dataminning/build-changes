import com.mojang.serialization.MapCodec;

public class cvu extends cxu {
   public static final MapCodec<cvu> a = b(cvu::new);
   public static final int b = 3;
   public static final djp c = djf.as;
   private static final elu[] g = new elu[]{
      cvz.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cvz.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cvz.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cvz.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<cvu> a() {
      return a;
   }

   public cvu(dio.d $$0) {
      super($$0);
   }

   @Override
   protected djp b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected csx d() {
      return cmk.ve;
   }

   @Override
   public void b(dip $$0, amp $$1, hv $$2, auf $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(csy $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(c);
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return g[this.g($$0)];
   }
}

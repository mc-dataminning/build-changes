import com.mojang.serialization.MapCodec;

public class dej extends cxu {
   public static final MapCodec<dej> a = b(dej::new);
   public static final int b = 2;
   public static final djp c = djf.aq;
   private static final float g = 3.0F;
   private static final elu[] h = new elu[]{cvz.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), cvz.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<dej> a() {
      return a;
   }

   public dej(dio.d $$0) {
      super($$0);
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(c);
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return h[this.g($$0)];
   }

   @Override
   protected djp b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected csx d() {
      return cmk.vb;
   }

   @Override
   public dip b(int $$0) {
      return $$0 == 2 ? cwb.bS.o() : super.b($$0);
   }

   @Override
   public void b(dip $$0, amp $$1, hv $$2, auf $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(csy $$0) {
      return 1;
   }
}

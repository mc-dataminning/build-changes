import com.mojang.serialization.MapCodec;

public class dhh extends djh {
   public static final MapCodec<dhh> a = b(dhh::new);
   public static final int b = 3;
   public static final dvs c = dvi.as;
   private static final ezq[] g = new ezq[]{
      dhm.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dhm.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dhm.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dhm.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<dhh> a() {
      return a;
   }

   public dhh(dur.d $$0) {
      super($$0);
   }

   @Override
   protected dvs b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected dei d() {
      return cvw.vn;
   }

   @Override
   protected void b(dus $$0, arj $$1, jf $$2, azn $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dej $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(c);
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return g[this.h($$0)];
   }
}

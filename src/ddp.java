import com.mojang.serialization.MapCodec;

public class ddp extends cxa {
   public static final MapCodec<ddp> a = b(ddp::new);
   public static final int b = 2;
   public static final din c = did.aq;
   private static final float g = 3.0F;
   private static final eks[] h = new eks[]{cvf.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), cvf.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<ddp> a() {
      return a;
   }

   public ddp(dhm.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(c);
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return h[this.g($$0)];
   }

   @Override
   protected din b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected cse d() {
      return clr.va;
   }

   @Override
   public dhn b(int $$0) {
      return $$0 == 2 ? cvh.bS.o() : super.b($$0);
   }

   @Override
   public void b(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(csf $$0) {
      return 1;
   }
}

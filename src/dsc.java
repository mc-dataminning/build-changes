import com.mojang.serialization.MapCodec;

public class dsc extends dli {
   public static final MapCodec<dsc> a = b(dsc::new);
   public static final int b = 2;
   public static final dxw c = dxn.at;
   private static final float g = 3.0F;
   private static final fbu[] h = new fbu[]{djm.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), djm.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<dsc> a() {
      return a;
   }

   public dsc(dww.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(c);
   }

   @Override
   public fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return h[this.h($$0)];
   }

   @Override
   protected dxw b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected dgh d() {
      return cwt.wi;
   }

   @Override
   public dwx b(int $$0) {
      return $$0 == 2 ? djo.bZ.m() : super.b($$0);
   }

   @Override
   public void b(dwx $$0, ard $$1, ji $$2, azh $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dgi $$0) {
      return 1;
   }
}

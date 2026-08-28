import com.mojang.serialization.MapCodec;

public class djh extends dli {
   public static final MapCodec<djh> a = b(djh::new);
   public static final int b = 3;
   public static final dxw c = dxn.av;
   private static final fbu[] g = new fbu[]{
      djm.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      djm.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      djm.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      djm.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<djh> a() {
      return a;
   }

   public djh(dww.d $$0) {
      super($$0);
   }

   @Override
   protected dxw b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected dgh d() {
      return cwt.wl;
   }

   @Override
   protected void b(dwx $$0, ard $$1, ji $$2, azh $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dgi $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(c);
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return g[this.h($$0)];
   }
}

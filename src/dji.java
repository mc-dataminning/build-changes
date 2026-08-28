import com.mojang.serialization.MapCodec;

public class dji extends dlj {
   public static final MapCodec<dji> a = b(dji::new);
   public static final int b = 3;
   public static final dxx c = dxo.av;
   private static final fbv[] g = new fbv[]{
      djn.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      djn.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      djn.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      djn.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<dji> a() {
      return a;
   }

   public dji(dwx.d $$0) {
      super($$0);
   }

   @Override
   protected dxx b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected dgi d() {
      return cwu.wl;
   }

   @Override
   protected void b(dwy $$0, ard $$1, ji $$2, azh $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dgj $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(c);
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return g[this.h($$0)];
   }
}

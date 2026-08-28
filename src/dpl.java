import com.mojang.serialization.MapCodec;

public class dpl extends dlj {
   public static final MapCodec<dpl> a = b(dpl::new);
   private static final fbv[] b = new fbv[]{
      djn.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      djn.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      djn.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      djn.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      djn.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      djn.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      djn.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      djn.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<dpl> a() {
      return a;
   }

   public dpl(dwx.d $$0) {
      super($$0);
   }

   @Override
   protected dgi d() {
      return cwu.vf;
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return b[this.h($$0)];
   }
}

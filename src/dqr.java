import com.mojang.serialization.MapCodec;

public class dqr extends dlm {
   public static final MapCodec<dqr> c = b(dqr::new);
   public static final fab g = dhy.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<dqr> a() {
      return c;
   }

   public dqr(dvc.d $$0) {
      super($$0, jl.b, g, false, 0.1);
   }

   @Override
   protected int a(azr $$0) {
      return dnd.a($$0);
   }

   @Override
   protected dhy b() {
      return dia.oC;
   }

   @Override
   protected boolean h(dvd $$0) {
      return dnd.a($$0);
   }
}

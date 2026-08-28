import com.mojang.serialization.MapCodec;

public class drn extends dll {
   public static final MapCodec<drn> c = b(drn::new);
   public static final fab e = dhy.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<drn> a() {
      return c;
   }

   public drn(dvc.d $$0) {
      super($$0, jl.a, e, false);
   }

   @Override
   protected dlm c() {
      return (dlm)dia.oz;
   }
}

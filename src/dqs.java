import com.mojang.serialization.MapCodec;

public class dqs extends dll {
   public static final MapCodec<dqs> c = b(dqs::new);
   public static final fab e = dhy.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dqs> a() {
      return c;
   }

   public dqs(dvc.d $$0) {
      super($$0, jl.b, e, false);
   }

   @Override
   protected dlm c() {
      return (dlm)dia.oB;
   }
}

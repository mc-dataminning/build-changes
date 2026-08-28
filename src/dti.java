import com.mojang.serialization.MapCodec;

public class dti extends doc {
   public static final MapCodec<dti> c = b(dti::new);
   public static final fcs g = dkm.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<dti> a() {
      return c;
   }

   public dti(dxu.d $$0) {
      super($$0, jm.b, g, false, 0.1);
   }

   @Override
   protected int a(bam $$0) {
      return dpu.a($$0);
   }

   @Override
   protected dkm b() {
      return dko.oX;
   }

   @Override
   protected boolean h(dxv $$0) {
      return dpu.a($$0);
   }
}

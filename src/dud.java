import com.mojang.serialization.MapCodec;

public class dud extends doc {
   public static final MapCodec<dud> c = b(dud::new);
   protected static final fcs g = dkm.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dud> a() {
      return c;
   }

   public dud(dxu.d $$0) {
      super($$0, jm.a, g, false, 0.1);
   }

   @Override
   protected int a(bam $$0) {
      return dpu.a($$0);
   }

   @Override
   protected dkm b() {
      return dko.oV;
   }

   @Override
   protected boolean h(dxv $$0) {
      return dpu.a($$0);
   }
}

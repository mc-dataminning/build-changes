import com.mojang.serialization.MapCodec;

public class dxh extends dqv {
   public static final MapCodec<dxh> c = b(dxh::new);
   private static final fgk g = dnc.b(8.0, 9.0, 16.0);

   @Override
   public MapCodec<dxh> a() {
      return c;
   }

   public dxh(ebd.d $$0) {
      super($$0, jb.a, g, false, 0.1);
   }

   @Override
   protected int a(azx $$0) {
      return dsp.a($$0);
   }

   @Override
   protected dnc b() {
      return dne.pg;
   }

   @Override
   protected boolean h(ebe $$0) {
      return dsp.a($$0);
   }
}

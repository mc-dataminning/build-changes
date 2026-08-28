import com.mojang.serialization.MapCodec;

public class dwk extends dqv {
   public static final MapCodec<dwk> c = b(dwk::new);
   private static final fgk g = dnc.b(8.0, 0.0, 15.0);

   @Override
   public MapCodec<dwk> a() {
      return c;
   }

   public dwk(ebd.d $$0) {
      super($$0, jb.b, g, false, 0.1);
   }

   @Override
   protected int a(azx $$0) {
      return dsp.a($$0);
   }

   @Override
   protected dnc b() {
      return dne.pi;
   }

   @Override
   protected boolean h(ebe $$0) {
      return dsp.a($$0);
   }
}

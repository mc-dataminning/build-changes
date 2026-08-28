import com.mojang.serialization.MapCodec;

public class dmx extends doz {
   public static final MapCodec<dmx> a = b(dmx::new);
   public static final int b = 3;
   public static final ece c = ebu.av;
   private static final fgk[] g = dnc.a(3, $$0 -> dnc.b(16.0, 0.0, (double)(2 + $$0 * 2)));

   @Override
   public MapCodec<dmx> a() {
      return a;
   }

   public dmx(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected ece b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected djw d() {
      return dac.ww;
   }

   @Override
   protected void b(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(djx $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(c);
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return g[this.h($$0)];
   }
}

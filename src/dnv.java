import com.mojang.serialization.MapCodec;

public class dnv extends dgk {
   public static final MapCodec<dnv> n = b(dnv::new);

   @Override
   public MapCodec<dnv> a() {
      return n;
   }

   public dnv(dsj.d $$0) {
      super($$0, () -> dpr.c);
   }

   @Override
   public dpp a(ja $$0, dsk $$1) {
      return new drj($$0, $$1);
   }

   @Override
   protected avo<akk> c() {
      return avr.i.b(avr.ai);
   }

   @Override
   protected boolean e_(dsk $$0) {
      return true;
   }

   @Override
   protected int a(dsk $$0, dbl $$1, ja $$2, jf $$3) {
      return ayg.a(dpw.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(dsk $$0, dbl $$1, ja $$2, jf $$3) {
      return $$3 == jf.b ? $$0.b($$1, $$2, $$3) : 0;
   }
}

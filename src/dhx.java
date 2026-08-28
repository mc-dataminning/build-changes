import com.mojang.serialization.MapCodec;

public class dhx extends dlf {
   public static final MapCodec<dhx> a = b(dhx::new);

   @Override
   public MapCodec<dhx> a() {
      return a;
   }

   public dhx(dtz.d $$0) {
      super($$0);
   }

   @Override
   public void a(dua $$0, dds $$1, je $$2, azk $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         je $$4 = $$2.e();
         dua $$5 = $$1.a_($$4);
         if (!a($$5.g($$1, $$4), jj.b)) {
            azg.a($$1, $$2, $$3, ln.H);
         }
      }
   }
}

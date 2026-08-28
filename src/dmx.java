import com.mojang.serialization.MapCodec;

public class dmx extends dnl {
   public static final MapCodec<dmx> a = b(dmx::new);

   @Override
   public MapCodec<dmx> a() {
      return a;
   }

   public dmx(dwx.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(aF);
   }

   @Override
   public dwy a(dah $$0) {
      return this.m().b(aF, $$0.g().g());
   }
}

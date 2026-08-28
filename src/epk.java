import com.mojang.serialization.MapCodec;

public class epk extends epc {
   public static final MapCodec<epk> a = axl.a(lw.f).fieldOf("tag").xmap(epk::new, $$0 -> $$0.b);
   private final axl<dhm> b;

   public epk(axl<dhm> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dus $$0, azn $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected epd<?> a() {
      return epd.d;
   }
}

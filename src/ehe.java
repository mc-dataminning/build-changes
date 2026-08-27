import com.mojang.serialization.Codec;

public class ehe extends egw {
   public static final Codec<ehe> a = avd.a(kj.f).fieldOf("tag").xmap(ehe::new, $$0 -> $$0.b).codec();
   private final avd<daa> b;

   public ehe(avd<daa> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dmz $$0, axd $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected egx<?> a() {
      return egx.d;
   }
}

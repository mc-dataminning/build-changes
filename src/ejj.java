import com.mojang.serialization.Codec;

public class ejj extends ejb {
   public static final Codec<ejj> a = avr.a(ks.f).fieldOf("tag").xmap(ejj::new, $$0 -> $$0.b).codec();
   private final avr<dby> b;

   public ejj(avr<dby> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(doz $$0, axr $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected ejc<?> a() {
      return ejc.d;
   }
}

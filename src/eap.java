import com.mojang.serialization.Codec;

public class eap extends ebg {
   public static final Codec<eap> a = kc.f.q().fieldOf("block").xmap(eap::new, $$0 -> $$0.b).codec();
   private final cvf b;

   public eap(cvf $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dhn $$0, atw $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected ebh<?> a() {
      return ebh.b;
   }
}

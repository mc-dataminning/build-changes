import com.mojang.serialization.Codec;

public class dzy extends eap {
   public static final Codec<dzy> a = jy.f.q().fieldOf("block").xmap(dzy::new, $$0 -> $$0.b).codec();
   private final cut b;

   public dzy(cut $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dgw $$0, ato $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected eaq<?> a() {
      return eaq.b;
   }
}

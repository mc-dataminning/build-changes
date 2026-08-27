import com.mojang.serialization.Codec;

public class eaa extends eap {
   public static final Codec<eaa> a = dgw.b.fieldOf("block_state").xmap(eaa::new, $$0 -> $$0.b).codec();
   private final dgw b;

   public eaa(dgw $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dgw $$0, ato $$1) {
      return $$0 == this.b;
   }

   @Override
   protected eaq<?> a() {
      return eaq.c;
   }
}

import com.mojang.serialization.Codec;

public class eax extends eap {
   public static final Codec<eax> a = arr.a(jz.e).fieldOf("tag").xmap(eax::new, $$0 -> $$0.b).codec();
   private final arr<cut> b;

   public eax(arr<cut> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dgw $$0, ato $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected eaq<?> a() {
      return eaq.d;
   }
}

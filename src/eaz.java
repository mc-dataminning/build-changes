import com.mojang.serialization.Codec;

public class eaz implements ebh {
   public static final Codec<eaz> a = edi.a.fieldOf("state_provider").xmap(eaz::new, $$0 -> $$0.b).codec();
   public final edi b;

   public eaz(edi $$0) {
      this.b = $$0;
   }
}

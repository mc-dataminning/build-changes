import com.mojang.serialization.Codec;

public class dpn implements dpv {
   public static final Codec<dpn> a = drw.a.fieldOf("state_provider").xmap(dpn::new, $$0 -> $$0.b).codec();
   public final drw b;

   public dpn(drw $$0) {
      this.b = $$0;
   }
}

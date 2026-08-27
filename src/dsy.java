import com.mojang.serialization.Codec;

public class dsy implements dtg {
   public static final Codec<dsy> a = dvh.a.fieldOf("state_provider").xmap(dsy::new, $$0 -> $$0.b).codec();
   public final dvh b;

   public dsy(dvh $$0) {
      this.b = $$0;
   }
}

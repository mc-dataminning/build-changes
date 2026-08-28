import com.mojang.serialization.Codec;

public class eir implements eiy {
   public static final Codec<eir> a = dxq.a.fieldOf("state").xmap(eir::new, $$0 -> $$0.b).codec();
   public final dxq b;

   public eir(dxq $$0) {
      this.b = $$0;
   }
}

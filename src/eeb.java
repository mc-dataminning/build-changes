import com.mojang.serialization.Codec;

public class eeb implements eei {
   public static final Codec<eeb> a = dtc.b.fieldOf("state").xmap(eeb::new, $$0 -> $$0.b).codec();
   public final dtc b;

   public eeb(dtc $$0) {
      this.b = $$0;
   }
}

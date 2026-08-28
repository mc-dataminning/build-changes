import com.mojang.serialization.Codec;

public class ehu implements eib {
   public static final Codec<ehu> a = dww.a.fieldOf("state").xmap(ehu::new, $$0 -> $$0.b).codec();
   public final dww b;

   public ehu(dww $$0) {
      this.b = $$0;
   }
}

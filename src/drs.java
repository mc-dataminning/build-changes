import com.mojang.serialization.Codec;

public class drs implements drz {
   public static final Codec<drs> a = dhi.b.fieldOf("state").xmap(drs::new, $$0 -> $$0.b).codec();
   public final dhi b;

   public drs(dhi $$0) {
      this.b = $$0;
   }
}

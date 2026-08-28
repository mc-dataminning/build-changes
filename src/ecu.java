import com.mojang.serialization.Codec;

public class ecu implements edb {
   public static final Codec<ecu> a = dsb.b.fieldOf("state").xmap(ecu::new, $$0 -> $$0.b).codec();
   public final dsb b;

   public ecu(dsb $$0) {
      this.b = $$0;
   }
}

import com.mojang.serialization.Codec;

public class edb implements edi {
   public static final Codec<edb> a = dsh.b.fieldOf("state").xmap(edb::new, $$0 -> $$0.b).codec();
   public final dsh b;

   public edb(dsh $$0) {
      this.b = $$0;
   }
}

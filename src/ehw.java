import com.mojang.serialization.Codec;

public class ehw implements eid {
   public static final Codec<ehw> a = dwy.a.fieldOf("state").xmap(ehw::new, $$0 -> $$0.b).codec();
   public final dwy b;

   public ehw(dwy $$0) {
      this.b = $$0;
   }
}

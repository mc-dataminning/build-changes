import com.mojang.serialization.Codec;

public class dxn implements dxu {
   public static final Codec<dxn> a = dmz.b.fieldOf("state").xmap(dxn::new, $$0 -> $$0.b).codec();
   public final dmz b;

   public dxn(dmz $$0) {
      this.b = $$0;
   }
}

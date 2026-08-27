import com.mojang.serialization.Codec;

public class dsz implements dtg {
   public static final Codec<dsz> a = dip.b.fieldOf("state").xmap(dsz::new, $$0 -> $$0.b).codec();
   public final dip b;

   public dsz(dip $$0) {
      this.b = $$0;
   }
}

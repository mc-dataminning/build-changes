import com.mojang.serialization.Codec;

public class elb implements eli {
   public static final Codec<elb> a = dzz.a.fieldOf("state").xmap(elb::new, $$0 -> $$0.b).codec();
   public final dzz b;

   public elb(dzz $$0) {
      this.b = $$0;
   }
}

import com.mojang.serialization.Codec;

public class elj implements elq {
   public static final Codec<elj> a = eah.a.fieldOf("state").xmap(elj::new, $$0 -> $$0.b).codec();
   public final eah b;

   public elj(eah $$0) {
      this.b = $$0;
   }
}

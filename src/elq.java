import com.mojang.serialization.Codec;

public class elq implements elx {
   public static final Codec<elq> a = eao.a.fieldOf("state").xmap(elq::new, $$0 -> $$0.b).codec();
   public final eao b;

   public elq(eao $$0) {
      this.b = $$0;
   }
}

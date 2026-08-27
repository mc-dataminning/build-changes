import com.mojang.serialization.Codec;

public class eeo extends eff {
   public static final Codec<eeo> a = kf.e.q().fieldOf("block").xmap(eeo::new, $$0 -> $$0.b).codec();
   private final cys b;

   public eeo(cys $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dlj $$0, awp $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected efg<?> a() {
      return efg.b;
   }
}

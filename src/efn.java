import com.mojang.serialization.Codec;

public class efn extends eff {
   public static final Codec<efn> a = aup.a(kg.f).fieldOf("tag").xmap(efn::new, $$0 -> $$0.b).codec();
   private final aup<cys> b;

   public efn(aup<cys> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dlj $$0, awp $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected efg<?> a() {
      return efg.d;
   }
}

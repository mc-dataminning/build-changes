import com.mojang.serialization.Codec;

public class ecr extends edi {
   public static final Codec<ecr> a = kd.e.q().fieldOf("block").xmap(ecr::new, $$0 -> $$0.b).codec();
   private final cwy b;

   public ecr(cwy $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(djp $$0, auw $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected edj<?> a() {
      return edj.b;
   }
}

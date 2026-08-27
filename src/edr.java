import com.mojang.serialization.Codec;

public class edr extends edi {
   public static final Codec<edr> b = dqh.b.fieldOf("state").xmap(edr::new, $$0 -> $$0.c).codec();
   private final dqh c;

   protected edr(dqh $$0) {
      this.c = $$0;
   }

   @Override
   protected edj<?> a() {
      return edj.a;
   }

   @Override
   public dqh a(ayg $$0, in $$1) {
      return this.c;
   }
}

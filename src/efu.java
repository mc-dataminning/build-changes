import com.mojang.serialization.Codec;

public interface efu<P extends eft> {
   efu<efs> a = a("always_true", efs.a);
   efu<efq> b = a("linear_pos", efq.a);
   efu<eff> c = a("axis_aligned_linear_pos", eff.a);

   Codec<P> codec();

   static <P extends eft> efu<P> a(String $$0, Codec<P> $$1) {
      return ix.a(kh.q, $$0, () -> $$1);
   }
}

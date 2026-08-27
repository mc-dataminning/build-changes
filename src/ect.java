import com.mojang.serialization.Codec;

public interface ect<P extends ecs> {
   ect<ecr> a = a("always_true", ecr.a);
   ect<ecp> b = a("linear_pos", ecp.a);
   ect<ece> c = a("axis_aligned_linear_pos", ece.a);

   Codec<P> codec();

   static <P extends ecs> ect<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.q, $$0, () -> $$1);
   }
}

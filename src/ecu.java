import com.mojang.serialization.Codec;

public interface ecu<P extends ect> {
   ecu<ecs> a = a("always_true", ecs.a);
   ecu<ecq> b = a("linear_pos", ecq.a);
   ecu<ecf> c = a("axis_aligned_linear_pos", ecf.a);

   Codec<P> codec();

   static <P extends ect> ecu<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.q, $$0, () -> $$1);
   }
}

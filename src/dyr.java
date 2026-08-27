import com.mojang.serialization.Codec;

public interface dyr<P extends dyq> {
   dyr<dyp> a = a("always_true", dyp.a);
   dyr<dyn> b = a("linear_pos", dyn.a);
   dyr<dyc> c = a("axis_aligned_linear_pos", dyc.a);

   Codec<P> codec();

   static <P extends dyq> dyr<P> a(String $$0, Codec<P> $$1) {
      return ht.a(jd.r, $$0, () -> $$1);
   }
}

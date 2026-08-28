import com.mojang.serialization.MapCodec;

public interface enf<P extends ene> {
   enf<enc> a = a("clear", enc.a);
   enf<end> b = a("passthrough", end.b);
   enf<enb> c = a("append_static", enb.a);
   enf<ena> d = a("append_loot", ena.a);

   MapCodec<P> codec();

   private static <P extends ene> enf<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.n, $$0, () -> $$1);
   }
}

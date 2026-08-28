import com.mojang.serialization.MapCodec;

public interface enh<P extends eng> {
   enh<ene> a = a("clear", ene.a);
   enh<enf> b = a("passthrough", enf.b);
   enh<end> c = a("append_static", end.a);
   enh<enc> d = a("append_loot", enc.a);

   MapCodec<P> codec();

   private static <P extends eng> enh<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.n, $$0, () -> $$1);
   }
}

import com.mojang.serialization.Codec;

public interface bpg<P extends bpf> {
   bpg<bpc> a = a("constant", bpc.b);
   bpg<bpl> b = a("uniform", bpl.a);
   bpg<box> c = a("biased_to_bottom", box.a);
   bpg<boy> d = a("clamped", boy.a);
   bpg<bpm> e = a("weighted_list", bpm.a);
   bpg<bpa> f = a("clamped_normal", bpa.a);

   Codec<P> codec();

   static <P extends bpf> bpg<P> a(String $$0, Codec<P> $$1) {
      return jn.a(lh.M, $$0, () -> $$1);
   }
}

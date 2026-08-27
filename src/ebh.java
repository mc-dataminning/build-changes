import com.mojang.serialization.Codec;

public interface ebh<P extends ebg> {
   ebh<eak> a = a("always_true", eak.a);
   ebh<eap> b = a("block_match", eap.a);
   ebh<ear> c = a("blockstate_match", ear.a);
   ebh<ebo> d = a("tag_match", ebo.a);
   ebh<ebd> e = a("random_block_match", ebd.a);
   ebh<ebe> f = a("random_blockstate_match", ebe.a);

   Codec<P> codec();

   static <P extends ebg> ebh<P> a(String $$0, Codec<P> $$1) {
      return is.a(kc.p, $$0, () -> $$1);
   }
}

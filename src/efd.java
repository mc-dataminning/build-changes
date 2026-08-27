import com.mojang.serialization.Codec;

public interface efd<P extends efb> {
   Codec<efb> a = kf.ah.q().dispatch("processor_type", efb::a, efd::codec);
   Codec<efc> b = a.listOf().xmap(efc::new, efc::a);
   Codec<efc> c = avp.e(b.fieldOf("processors").codec(), b);
   Codec<ij<efc>> d = aiu.a(kg.aE, c);
   efd<eeg> e = a("block_ignore", eeg.a);
   efd<eei> f = a("block_rot", eei.a);
   efd<eel> g = a("gravity", eel.a);
   efd<eem> h = a("jigsaw_replacement", eem.a);
   efd<eex> i = a("rule", eex.a);
   efd<eep> j = a("nop", eep.a);
   efd<eef> k = a("block_age", eef.a);
   efd<eee> l = a("blackstone_replace", eee.a);
   efd<een> m = a("lava_submerged_block", een.a);
   efd<eeu> n = a("protected_blocks", eeu.b);
   efd<eek> o = a("capped", eek.a);

   Codec<P> codec();

   static <P extends efb> efd<P> a(String $$0, Codec<P> $$1) {
      return iv.a(kf.ah, $$0, () -> $$1);
   }
}

import com.mojang.serialization.Codec;

public interface efk<P extends efi> {
   Codec<efi> a = kf.ah.q().dispatch("processor_type", efi::a, efk::codec);
   Codec<efj> b = a.listOf().xmap(efj::new, efj::a);
   Codec<efj> c = avq.e(b.fieldOf("processors").codec(), b);
   Codec<ij<efj>> d = aiu.a(kg.aE, c);
   efk<een> e = a("block_ignore", een.a);
   efk<eep> f = a("block_rot", eep.a);
   efk<ees> g = a("gravity", ees.a);
   efk<eet> h = a("jigsaw_replacement", eet.a);
   efk<efe> i = a("rule", efe.a);
   efk<eew> j = a("nop", eew.a);
   efk<eem> k = a("block_age", eem.a);
   efk<eel> l = a("blackstone_replace", eel.a);
   efk<eeu> m = a("lava_submerged_block", eeu.a);
   efk<efb> n = a("protected_blocks", efb.b);
   efk<eer> o = a("capped", eer.a);

   Codec<P> codec();

   static <P extends efi> efk<P> a(String $$0, Codec<P> $$1) {
      return iv.a(kf.ah, $$0, () -> $$1);
   }
}

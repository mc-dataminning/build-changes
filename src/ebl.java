import com.mojang.serialization.Codec;

public interface ebl<P extends ebj> {
   Codec<ebj> a = kc.ai.q().dispatch("processor_type", ebj::a, ebl::codec);
   Codec<ebk> b = a.listOf().xmap(ebk::new, ebk::a);
   Codec<ebk> c = asy.e(b.fieldOf("processors").codec(), b);
   Codec<ig<ebk>> d = agi.a(kd.aC, c);
   ebl<eao> e = a("block_ignore", eao.a);
   ebl<eaq> f = a("block_rot", eaq.a);
   ebl<eat> g = a("gravity", eat.a);
   ebl<eau> h = a("jigsaw_replacement", eau.a);
   ebl<ebf> i = a("rule", ebf.a);
   ebl<eax> j = a("nop", eax.a);
   ebl<ean> k = a("block_age", ean.a);
   ebl<eam> l = a("blackstone_replace", eam.a);
   ebl<eav> m = a("lava_submerged_block", eav.a);
   ebl<ebc> n = a("protected_blocks", ebc.b);
   ebl<eas> o = a("capped", eas.a);

   Codec<P> codec();

   static <P extends ebj> ebl<P> a(String $$0, Codec<P> $$1) {
      return is.a(kc.ai, $$0, () -> $$1);
   }
}

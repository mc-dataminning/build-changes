import com.mojang.serialization.Codec;

public interface cnq<T extends cnn<?>> {
   cnq<cnt> a = a("crafting_shaped", new cnt.a());
   cnq<cnu> b = a("crafting_shapeless", new cnu.a());
   cnq<cmw> c = a("crafting_special_armordye", new cny<>(cmw::new));
   cnq<cmz> d = a("crafting_special_bookcloning", new cny<>(cmz::new));
   cnq<cnl> e = a("crafting_special_mapcloning", new cny<>(cnl::new));
   cnq<cnm> f = a("crafting_special_mapextending", new cny<>(cnm::new));
   cnq<cnh> g = a("crafting_special_firework_rocket", new cny<>(cnh::new));
   cnq<cnj> h = a("crafting_special_firework_star", new cny<>(cnj::new));
   cnq<cni> i = a("crafting_special_firework_star_fade", new cny<>(cni::new));
   cnq<coh> j = a("crafting_special_tippedarrow", new cny<>(coh::new));
   cnq<cmx> k = a("crafting_special_bannerduplicate", new cny<>(cmx::new));
   cnq<cnv> l = a("crafting_special_shielddecoration", new cny<>(cnv::new));
   cnq<cnw> m = a("crafting_special_shulkerboxcoloring", new cny<>(cnw::new));
   cnq<cog> n = a("crafting_special_suspiciousstew", new cny<>(cog::new));
   cnq<cns> o = a("crafting_special_repairitem", new cny<>(cns::new));
   cnq<coa> p = a("smelting", new cnx<>(coa::new, 200));
   cnq<cmy> q = a("blasting", new cnx<>(cmy::new, 100));
   cnq<coe> r = a("smoking", new cnx<>(coe::new, 100));
   cnq<cna> s = a("campfire_cooking", new cnx<>(cna::new, 100));
   cnq<cof> t = a("stonecutting", new cnz.a<>(cof::new));
   cnq<coc> u = a("smithing_transform", new coc.a());
   cnq<cod> v = a("smithing_trim", new cod.a());
   cnq<cng> w = a("crafting_decorated_pot", new cny<>(cng::new));

   Codec<T> a();

   T a(tl var1);

   void a(tl var1, T var2);

   static <S extends cnq<T>, T extends cnn<?>> S a(String $$0, S $$1) {
      return io.a(jy.u, $$0, $$1);
   }
}

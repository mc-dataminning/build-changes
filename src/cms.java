import com.mojang.serialization.Codec;

public interface cms<T extends cmp<?>> {
   cms<cmv> a = a("crafting_shaped", new cmv.a());
   cms<cmw> b = a("crafting_shapeless", new cmw.a());
   cms<cly> c = a("crafting_special_armordye", new cna<>(cly::new));
   cms<cmb> d = a("crafting_special_bookcloning", new cna<>(cmb::new));
   cms<cmn> e = a("crafting_special_mapcloning", new cna<>(cmn::new));
   cms<cmo> f = a("crafting_special_mapextending", new cna<>(cmo::new));
   cms<cmj> g = a("crafting_special_firework_rocket", new cna<>(cmj::new));
   cms<cml> h = a("crafting_special_firework_star", new cna<>(cml::new));
   cms<cmk> i = a("crafting_special_firework_star_fade", new cna<>(cmk::new));
   cms<cnj> j = a("crafting_special_tippedarrow", new cna<>(cnj::new));
   cms<clz> k = a("crafting_special_bannerduplicate", new cna<>(clz::new));
   cms<cmx> l = a("crafting_special_shielddecoration", new cna<>(cmx::new));
   cms<cmy> m = a("crafting_special_shulkerboxcoloring", new cna<>(cmy::new));
   cms<cni> n = a("crafting_special_suspiciousstew", new cna<>(cni::new));
   cms<cmu> o = a("crafting_special_repairitem", new cna<>(cmu::new));
   cms<cnc> p = a("smelting", new cmz<>(cnc::new, 200));
   cms<cma> q = a("blasting", new cmz<>(cma::new, 100));
   cms<cng> r = a("smoking", new cmz<>(cng::new, 100));
   cms<cmc> s = a("campfire_cooking", new cmz<>(cmc::new, 100));
   cms<cnh> t = a("stonecutting", new cnb.a<>(cnh::new));
   cms<cne> u = a("smithing_transform", new cne.a());
   cms<cnf> v = a("smithing_trim", new cnf.a());
   cms<cmi> w = a("crafting_decorated_pot", new cna<>(cmi::new));

   Codec<T> a();

   T a(so var1);

   void a(so var1, T var2);

   static <S extends cms<T>, T extends cmp<?>> S a(String $$0, S $$1) {
      return hq.a(jb.u, $$0, $$1);
   }
}

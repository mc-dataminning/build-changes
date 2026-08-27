import com.mojang.serialization.Codec;

public interface cmm<T extends cmj<?>> {
   cmm<cmp> a = a("crafting_shaped", new cmp.a());
   cmm<cmq> b = a("crafting_shapeless", new cmq.a());
   cmm<cls> c = a("crafting_special_armordye", new cmu<>(cls::new));
   cmm<clv> d = a("crafting_special_bookcloning", new cmu<>(clv::new));
   cmm<cmh> e = a("crafting_special_mapcloning", new cmu<>(cmh::new));
   cmm<cmi> f = a("crafting_special_mapextending", new cmu<>(cmi::new));
   cmm<cmd> g = a("crafting_special_firework_rocket", new cmu<>(cmd::new));
   cmm<cmf> h = a("crafting_special_firework_star", new cmu<>(cmf::new));
   cmm<cme> i = a("crafting_special_firework_star_fade", new cmu<>(cme::new));
   cmm<cnd> j = a("crafting_special_tippedarrow", new cmu<>(cnd::new));
   cmm<clt> k = a("crafting_special_bannerduplicate", new cmu<>(clt::new));
   cmm<cmr> l = a("crafting_special_shielddecoration", new cmu<>(cmr::new));
   cmm<cms> m = a("crafting_special_shulkerboxcoloring", new cmu<>(cms::new));
   cmm<cnc> n = a("crafting_special_suspiciousstew", new cmu<>(cnc::new));
   cmm<cmo> o = a("crafting_special_repairitem", new cmu<>(cmo::new));
   cmm<cmw> p = a("smelting", new cmt<>(cmw::new, 200));
   cmm<clu> q = a("blasting", new cmt<>(clu::new, 100));
   cmm<cna> r = a("smoking", new cmt<>(cna::new, 100));
   cmm<clw> s = a("campfire_cooking", new cmt<>(clw::new, 100));
   cmm<cnb> t = a("stonecutting", new cmv.a<>(cnb::new));
   cmm<cmy> u = a("smithing_transform", new cmy.a());
   cmm<cmz> v = a("smithing_trim", new cmz.a());
   cmm<cmc> w = a("crafting_decorated_pot", new cmu<>(cmc::new));

   Codec<T> a();

   T a(sp var1);

   void a(sp var1, T var2);

   static <S extends cmm<T>, T extends cmj<?>> S a(String $$0, S $$1) {
      return ht.a(jd.u, $$0, $$1);
   }
}

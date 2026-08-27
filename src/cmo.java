import com.mojang.serialization.Codec;

public interface cmo<T extends cml<?>> {
   cmo<cmr> a = a("crafting_shaped", new cmr.a());
   cmo<cms> b = a("crafting_shapeless", new cms.a());
   cmo<clu> c = a("crafting_special_armordye", new cmw<>(clu::new));
   cmo<clx> d = a("crafting_special_bookcloning", new cmw<>(clx::new));
   cmo<cmj> e = a("crafting_special_mapcloning", new cmw<>(cmj::new));
   cmo<cmk> f = a("crafting_special_mapextending", new cmw<>(cmk::new));
   cmo<cmf> g = a("crafting_special_firework_rocket", new cmw<>(cmf::new));
   cmo<cmh> h = a("crafting_special_firework_star", new cmw<>(cmh::new));
   cmo<cmg> i = a("crafting_special_firework_star_fade", new cmw<>(cmg::new));
   cmo<cnf> j = a("crafting_special_tippedarrow", new cmw<>(cnf::new));
   cmo<clv> k = a("crafting_special_bannerduplicate", new cmw<>(clv::new));
   cmo<cmt> l = a("crafting_special_shielddecoration", new cmw<>(cmt::new));
   cmo<cmu> m = a("crafting_special_shulkerboxcoloring", new cmw<>(cmu::new));
   cmo<cne> n = a("crafting_special_suspiciousstew", new cmw<>(cne::new));
   cmo<cmq> o = a("crafting_special_repairitem", new cmw<>(cmq::new));
   cmo<cmy> p = a("smelting", new cmv<>(cmy::new, 200));
   cmo<clw> q = a("blasting", new cmv<>(clw::new, 100));
   cmo<cnc> r = a("smoking", new cmv<>(cnc::new, 100));
   cmo<cly> s = a("campfire_cooking", new cmv<>(cly::new, 100));
   cmo<cnd> t = a("stonecutting", new cmx.a<>(cnd::new));
   cmo<cna> u = a("smithing_transform", new cna.a());
   cmo<cnb> v = a("smithing_trim", new cnb.a());
   cmo<cme> w = a("crafting_decorated_pot", new cmw<>(cme::new));

   Codec<T> a();

   T a(sq var1);

   void a(sq var1, T var2);

   static <S extends cmo<T>, T extends cml<?>> S a(String $$0, S $$1) {
      return ht.a(jd.u, $$0, $$1);
   }
}

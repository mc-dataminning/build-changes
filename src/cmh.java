import com.mojang.serialization.Codec;

public interface cmh<T extends cme<?>> {
   cmh<cmk> a = a("crafting_shaped", new cmk.a());
   cmh<cml> b = a("crafting_shapeless", new cml.a());
   cmh<cln> c = a("crafting_special_armordye", new cmp<>(cln::new));
   cmh<clq> d = a("crafting_special_bookcloning", new cmp<>(clq::new));
   cmh<cmc> e = a("crafting_special_mapcloning", new cmp<>(cmc::new));
   cmh<cmd> f = a("crafting_special_mapextending", new cmp<>(cmd::new));
   cmh<cly> g = a("crafting_special_firework_rocket", new cmp<>(cly::new));
   cmh<cma> h = a("crafting_special_firework_star", new cmp<>(cma::new));
   cmh<clz> i = a("crafting_special_firework_star_fade", new cmp<>(clz::new));
   cmh<cmy> j = a("crafting_special_tippedarrow", new cmp<>(cmy::new));
   cmh<clo> k = a("crafting_special_bannerduplicate", new cmp<>(clo::new));
   cmh<cmm> l = a("crafting_special_shielddecoration", new cmp<>(cmm::new));
   cmh<cmn> m = a("crafting_special_shulkerboxcoloring", new cmp<>(cmn::new));
   cmh<cmx> n = a("crafting_special_suspiciousstew", new cmp<>(cmx::new));
   cmh<cmj> o = a("crafting_special_repairitem", new cmp<>(cmj::new));
   cmh<cmr> p = a("smelting", new cmo<>(cmr::new, 200));
   cmh<clp> q = a("blasting", new cmo<>(clp::new, 100));
   cmh<cmv> r = a("smoking", new cmo<>(cmv::new, 100));
   cmh<clr> s = a("campfire_cooking", new cmo<>(clr::new, 100));
   cmh<cmw> t = a("stonecutting", new cmq.a<>(cmw::new));
   cmh<cmt> u = a("smithing_transform", new cmt.a());
   cmh<cmu> v = a("smithing_trim", new cmu.a());
   cmh<clx> w = a("crafting_decorated_pot", new cmp<>(clx::new));

   Codec<T> a();

   T a(sl var1);

   void a(sl var1, T var2);

   static <S extends cmh<T>, T extends cme<?>> S a(String $$0, S $$1) {
      return ht.a(jd.u, $$0, $$1);
   }
}

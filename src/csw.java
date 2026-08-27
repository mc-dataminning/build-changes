import com.mojang.serialization.Codec;

public interface csw<T extends css<?>> {
   csw<csz> a = a("crafting_shaped", new csz.a());
   csw<ctb> b = a("crafting_shapeless", new ctb.a());
   csw<csc> c = a("crafting_special_armordye", new ctf<>(csc::new));
   csw<csf> d = a("crafting_special_bookcloning", new ctf<>(csf::new));
   csw<csq> e = a("crafting_special_mapcloning", new ctf<>(csq::new));
   csw<csr> f = a("crafting_special_mapextending", new ctf<>(csr::new));
   csw<csm> g = a("crafting_special_firework_rocket", new ctf<>(csm::new));
   csw<cso> h = a("crafting_special_firework_star", new ctf<>(cso::new));
   csw<csn> i = a("crafting_special_firework_star_fade", new ctf<>(csn::new));
   csw<cto> j = a("crafting_special_tippedarrow", new ctf<>(cto::new));
   csw<csd> k = a("crafting_special_bannerduplicate", new ctf<>(csd::new));
   csw<ctc> l = a("crafting_special_shielddecoration", new ctf<>(ctc::new));
   csw<ctd> m = a("crafting_special_shulkerboxcoloring", new ctf<>(ctd::new));
   csw<ctn> n = a("crafting_special_suspiciousstew", new ctf<>(ctn::new));
   csw<csy> o = a("crafting_special_repairitem", new ctf<>(csy::new));
   csw<cth> p = a("smelting", new cte<>(cth::new, 200));
   csw<cse> q = a("blasting", new cte<>(cse::new, 100));
   csw<ctl> r = a("smoking", new cte<>(ctl::new, 100));
   csw<csg> s = a("campfire_cooking", new cte<>(csg::new, 100));
   csw<ctm> t = a("stonecutting", new ctg.b<>(ctm::new));
   csw<ctj> u = a("smithing_transform", new ctj.a());
   csw<ctk> v = a("smithing_trim", new ctk.a());
   csw<csl> w = a("crafting_decorated_pot", new ctf<>(csl::new));

   Codec<T> a();

   xq<vd, T> b();

   static <S extends csw<T>, T extends css<?>> S a(String $$0, S $$1) {
      return ix.a(kh.t, $$0, $$1);
   }
}

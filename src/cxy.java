import com.mojang.serialization.MapCodec;

public interface cxy<T extends cxu<?>> {
   cxy<cyb> a = a("crafting_shaped", new cyb.a());
   cxy<cyd> b = a("crafting_shapeless", new cyd.a());
   cxy<cxe> c = a("crafting_special_armordye", new cyh<>(cxe::new));
   cxy<cxh> d = a("crafting_special_bookcloning", new cyh<>(cxh::new));
   cxy<cxs> e = a("crafting_special_mapcloning", new cyh<>(cxs::new));
   cxy<cxt> f = a("crafting_special_mapextending", new cyh<>(cxt::new));
   cxy<cxo> g = a("crafting_special_firework_rocket", new cyh<>(cxo::new));
   cxy<cxq> h = a("crafting_special_firework_star", new cyh<>(cxq::new));
   cxy<cxp> i = a("crafting_special_firework_star_fade", new cyh<>(cxp::new));
   cxy<cyq> j = a("crafting_special_tippedarrow", new cyh<>(cyq::new));
   cxy<cxf> k = a("crafting_special_bannerduplicate", new cyh<>(cxf::new));
   cxy<cye> l = a("crafting_special_shielddecoration", new cyh<>(cye::new));
   cxy<cyf> m = a("crafting_special_shulkerboxcoloring", new cyh<>(cyf::new));
   cxy<cyp> n = a("crafting_special_suspiciousstew", new cyh<>(cyp::new));
   cxy<cya> o = a("crafting_special_repairitem", new cyh<>(cya::new));
   cxy<cyj> p = a("smelting", new cyg<>(cyj::new, 200));
   cxy<cxg> q = a("blasting", new cyg<>(cxg::new, 100));
   cxy<cyn> r = a("smoking", new cyg<>(cyn::new, 100));
   cxy<cxi> s = a("campfire_cooking", new cyg<>(cxi::new, 100));
   cxy<cyo> t = a("stonecutting", new cyi.b<>(cyo::new));
   cxy<cyl> u = a("smithing_transform", new cyl.a());
   cxy<cym> v = a("smithing_trim", new cym.a());
   cxy<cxn> w = a("crafting_decorated_pot", new cyh<>(cxn::new));

   MapCodec<T> a();

   yv<wi, T> b();

   static <S extends cxy<T>, T extends cxu<?>> S a(String $$0, S $$1) {
      return jk.a(le.t, $$0, $$1);
   }
}

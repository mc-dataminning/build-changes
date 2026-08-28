import com.mojang.serialization.MapCodec;

public interface cyn<T extends cyi<?>> {
   cyn<cyq> a = a("crafting_shaped", new cyq.a());
   cyn<cys> b = a("crafting_shapeless", new cys.a());
   cyn<cxr> c = a("crafting_special_armordye", new cyw<>(cxr::new));
   cyn<cxu> d = a("crafting_special_bookcloning", new cyw<>(cxu::new));
   cyn<cyg> e = a("crafting_special_mapcloning", new cyw<>(cyg::new));
   cyn<cyh> f = a("crafting_special_mapextending", new cyw<>(cyh::new));
   cyn<cyc> g = a("crafting_special_firework_rocket", new cyw<>(cyc::new));
   cyn<cye> h = a("crafting_special_firework_star", new cyw<>(cye::new));
   cyn<cyd> i = a("crafting_special_firework_star_fade", new cyw<>(cyd::new));
   cyn<czh> j = a("crafting_special_tippedarrow", new cyw<>(czh::new));
   cyn<cxs> k = a("crafting_special_bannerduplicate", new cyw<>(cxs::new));
   cyn<cyt> l = a("crafting_special_shielddecoration", new cyw<>(cyt::new));
   cyn<cyu> m = a("crafting_special_shulkerboxcoloring", new cyw<>(cyu::new));
   cyn<czg> n = a("crafting_special_suspiciousstew", new cyw<>(czg::new));
   cyn<cyp> o = a("crafting_special_repairitem", new cyw<>(cyp::new));
   cyn<cyz> p = a("smelting", new cyv<>(cyz::new, 200));
   cyn<cxt> q = a("blasting", new cyv<>(cxt::new, 100));
   cyn<cze> r = a("smoking", new cyv<>(cze::new, 100));
   cyn<cxv> s = a("campfire_cooking", new cyv<>(cxv::new, 100));
   cyn<czf> t = a("stonecutting", new cyx.b<>(czf::new));
   cyn<czc> u = a("smithing_transform", new czc.a());
   cyn<czd> v = a("smithing_trim", new czd.a());
   cyn<cyb> w = a("crafting_decorated_pot", new cyw<>(cyb::new));

   MapCodec<T> a();

   ys<wf, T> b();

   static <S extends cyn<T>, T extends cyi<?>> S a(String $$0, S $$1) {
      return jw.a(lq.r, $$0, $$1);
   }
}

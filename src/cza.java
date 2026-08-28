import com.mojang.serialization.MapCodec;

public interface cza<T extends cyw<?>> {
   cza<czd> a = a("crafting_shaped", new czd.a());
   cza<czf> b = a("crafting_shapeless", new czf.a());
   cza<cyg> c = a("crafting_special_armordye", new czj<>(cyg::new));
   cza<cyj> d = a("crafting_special_bookcloning", new czj<>(cyj::new));
   cza<cyu> e = a("crafting_special_mapcloning", new czj<>(cyu::new));
   cza<cyv> f = a("crafting_special_mapextending", new czj<>(cyv::new));
   cza<cyq> g = a("crafting_special_firework_rocket", new czj<>(cyq::new));
   cza<cys> h = a("crafting_special_firework_star", new czj<>(cys::new));
   cza<cyr> i = a("crafting_special_firework_star_fade", new czj<>(cyr::new));
   cza<czs> j = a("crafting_special_tippedarrow", new czj<>(czs::new));
   cza<cyh> k = a("crafting_special_bannerduplicate", new czj<>(cyh::new));
   cza<czg> l = a("crafting_special_shielddecoration", new czj<>(czg::new));
   cza<czh> m = a("crafting_special_shulkerboxcoloring", new czj<>(czh::new));
   cza<czr> n = a("crafting_special_suspiciousstew", new czj<>(czr::new));
   cza<czc> o = a("crafting_special_repairitem", new czj<>(czc::new));
   cza<czl> p = a("smelting", new czi<>(czl::new, 200));
   cza<cyi> q = a("blasting", new czi<>(cyi::new, 100));
   cza<czp> r = a("smoking", new czi<>(czp::new, 100));
   cza<cyk> s = a("campfire_cooking", new czi<>(cyk::new, 100));
   cza<czq> t = a("stonecutting", new czk.b<>(czq::new));
   cza<czn> u = a("smithing_transform", new czn.a());
   cza<czo> v = a("smithing_trim", new czo.a());
   cza<cyp> w = a("crafting_decorated_pot", new czj<>(cyp::new));

   MapCodec<T> a();

   zn<xa, T> b();

   static <S extends cza<T>, T extends cyw<?>> S a(String $$0, S $$1) {
      return jv.a(lp.t, $$0, $$1);
   }
}

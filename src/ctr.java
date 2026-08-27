import com.mojang.serialization.Codec;

public interface ctr<T extends ctn<?>> {
   ctr<ctu> a = a("crafting_shaped", new ctu.a());
   ctr<ctw> b = a("crafting_shapeless", new ctw.a());
   ctr<csx> c = a("crafting_special_armordye", new cua<>(csx::new));
   ctr<cta> d = a("crafting_special_bookcloning", new cua<>(cta::new));
   ctr<ctl> e = a("crafting_special_mapcloning", new cua<>(ctl::new));
   ctr<ctm> f = a("crafting_special_mapextending", new cua<>(ctm::new));
   ctr<cth> g = a("crafting_special_firework_rocket", new cua<>(cth::new));
   ctr<ctj> h = a("crafting_special_firework_star", new cua<>(ctj::new));
   ctr<cti> i = a("crafting_special_firework_star_fade", new cua<>(cti::new));
   ctr<cuj> j = a("crafting_special_tippedarrow", new cua<>(cuj::new));
   ctr<csy> k = a("crafting_special_bannerduplicate", new cua<>(csy::new));
   ctr<ctx> l = a("crafting_special_shielddecoration", new cua<>(ctx::new));
   ctr<cty> m = a("crafting_special_shulkerboxcoloring", new cua<>(cty::new));
   ctr<cui> n = a("crafting_special_suspiciousstew", new cua<>(cui::new));
   ctr<ctt> o = a("crafting_special_repairitem", new cua<>(ctt::new));
   ctr<cuc> p = a("smelting", new ctz<>(cuc::new, 200));
   ctr<csz> q = a("blasting", new ctz<>(csz::new, 100));
   ctr<cug> r = a("smoking", new ctz<>(cug::new, 100));
   ctr<ctb> s = a("campfire_cooking", new ctz<>(ctb::new, 100));
   ctr<cuh> t = a("stonecutting", new cub.b<>(cuh::new));
   ctr<cue> u = a("smithing_transform", new cue.a());
   ctr<cuf> v = a("smithing_trim", new cuf.a());
   ctr<ctg> w = a("crafting_decorated_pot", new cua<>(ctg::new));

   Codec<T> a();

   xs<vf, T> b();

   static <S extends ctr<T>, T extends ctn<?>> S a(String $$0, S $$1) {
      return iy.a(ki.t, $$0, $$1);
   }
}

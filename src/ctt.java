import com.mojang.serialization.Codec;

public interface ctt<T extends ctp<?>> {
   ctt<ctw> a = a("crafting_shaped", new ctw.a());
   ctt<cty> b = a("crafting_shapeless", new cty.a());
   ctt<csz> c = a("crafting_special_armordye", new cuc<>(csz::new));
   ctt<ctc> d = a("crafting_special_bookcloning", new cuc<>(ctc::new));
   ctt<ctn> e = a("crafting_special_mapcloning", new cuc<>(ctn::new));
   ctt<cto> f = a("crafting_special_mapextending", new cuc<>(cto::new));
   ctt<ctj> g = a("crafting_special_firework_rocket", new cuc<>(ctj::new));
   ctt<ctl> h = a("crafting_special_firework_star", new cuc<>(ctl::new));
   ctt<ctk> i = a("crafting_special_firework_star_fade", new cuc<>(ctk::new));
   ctt<cul> j = a("crafting_special_tippedarrow", new cuc<>(cul::new));
   ctt<cta> k = a("crafting_special_bannerduplicate", new cuc<>(cta::new));
   ctt<ctz> l = a("crafting_special_shielddecoration", new cuc<>(ctz::new));
   ctt<cua> m = a("crafting_special_shulkerboxcoloring", new cuc<>(cua::new));
   ctt<cuk> n = a("crafting_special_suspiciousstew", new cuc<>(cuk::new));
   ctt<ctv> o = a("crafting_special_repairitem", new cuc<>(ctv::new));
   ctt<cue> p = a("smelting", new cub<>(cue::new, 200));
   ctt<ctb> q = a("blasting", new cub<>(ctb::new, 100));
   ctt<cui> r = a("smoking", new cub<>(cui::new, 100));
   ctt<ctd> s = a("campfire_cooking", new cub<>(ctd::new, 100));
   ctt<cuj> t = a("stonecutting", new cud.b<>(cuj::new));
   ctt<cug> u = a("smithing_transform", new cug.a());
   ctt<cuh> v = a("smithing_trim", new cuh.a());
   ctt<cti> w = a("crafting_decorated_pot", new cuc<>(cti::new));

   Codec<T> a();

   xs<vf, T> b();

   static <S extends ctt<T>, T extends ctp<?>> S a(String $$0, S $$1) {
      return iy.a(ki.t, $$0, $$1);
   }
}

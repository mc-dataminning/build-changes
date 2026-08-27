import com.mojang.serialization.Codec;

public interface coj<T extends cof<?>> {
   coj<com> a = a("crafting_shaped", new com.a());
   coj<coo> b = a("crafting_shapeless", new coo.a());
   coj<cno> c = a("crafting_special_armordye", new cos<>(cno::new));
   coj<cnr> d = a("crafting_special_bookcloning", new cos<>(cnr::new));
   coj<cod> e = a("crafting_special_mapcloning", new cos<>(cod::new));
   coj<coe> f = a("crafting_special_mapextending", new cos<>(coe::new));
   coj<cnz> g = a("crafting_special_firework_rocket", new cos<>(cnz::new));
   coj<cob> h = a("crafting_special_firework_star", new cos<>(cob::new));
   coj<coa> i = a("crafting_special_firework_star_fade", new cos<>(coa::new));
   coj<cpb> j = a("crafting_special_tippedarrow", new cos<>(cpb::new));
   coj<cnp> k = a("crafting_special_bannerduplicate", new cos<>(cnp::new));
   coj<cop> l = a("crafting_special_shielddecoration", new cos<>(cop::new));
   coj<coq> m = a("crafting_special_shulkerboxcoloring", new cos<>(coq::new));
   coj<cpa> n = a("crafting_special_suspiciousstew", new cos<>(cpa::new));
   coj<col> o = a("crafting_special_repairitem", new cos<>(col::new));
   coj<cou> p = a("smelting", new cor<>(cou::new, 200));
   coj<cnq> q = a("blasting", new cor<>(cnq::new, 100));
   coj<coy> r = a("smoking", new cor<>(coy::new, 100));
   coj<cns> s = a("campfire_cooking", new cor<>(cns::new, 100));
   coj<coz> t = a("stonecutting", new cot.a<>(coz::new));
   coj<cow> u = a("smithing_transform", new cow.a());
   coj<cox> v = a("smithing_trim", new cox.a());
   coj<cny> w = a("crafting_decorated_pot", new cos<>(cny::new));

   Codec<T> a();

   T a(tu var1);

   void a(tu var1, T var2);

   static <S extends coj<T>, T extends cof<?>> S a(String $$0, S $$1) {
      return io.a(jy.u, $$0, $$1);
   }
}

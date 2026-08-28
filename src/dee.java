import com.mojang.serialization.MapCodec;

public interface dee<T extends ddu<?>> {
   dee<dei> a = a("crafting_shaped", new dei.a());
   dee<dek> b = a("crafting_shapeless", new dek.a());
   dee<ddb> c = a("crafting_special_armordye", new ddk.a<>(ddb::new));
   dee<dde> d = a("crafting_special_bookcloning", new ddk.a<>(dde::new));
   dee<ddr> e = a("crafting_special_mapcloning", new ddk.a<>(ddr::new));
   dee<dds> f = a("crafting_special_mapextending", new ddk.a<>(dds::new));
   dee<ddn> g = a("crafting_special_firework_rocket", new ddk.a<>(ddn::new));
   dee<ddp> h = a("crafting_special_firework_star", new ddk.a<>(ddp::new));
   dee<ddo> i = a("crafting_special_firework_star_fade", new ddk.a<>(ddo::new));
   dee<dev> j = a("crafting_special_tippedarrow", new ddk.a<>(dev::new));
   dee<ddc> k = a("crafting_special_bannerduplicate", new ddk.a<>(ddc::new));
   dee<del> l = a("crafting_special_shielddecoration", new ddk.a<>(del::new));
   dee<dew> m = a("crafting_transmute", new dew.a());
   dee<deg> n = a("crafting_special_repairitem", new ddk.a<>(deg::new));
   dee<deo> o = a("smelting", new dda.b<>(deo::new, 200));
   dee<ddd> p = a("blasting", new dda.b<>(ddd::new, 100));
   dee<det> q = a("smoking", new dda.b<>(det::new, 100));
   dee<ddf> r = a("campfire_cooking", new dda.b<>(ddf::new, 100));
   dee<deu> s = a("stonecutting", new dem.b<>(deu::new));
   dee<der> t = a("smithing_transform", new der.a());
   dee<des> u = a("smithing_trim", new des.a());
   dee<ddl> v = a("crafting_decorated_pot", new ddk.a<>(ddl::new));

   MapCodec<T> a();

   @Deprecated
   yw<wj, T> b();

   static <S extends dee<T>, T extends ddu<?>> S a(String $$0, S $$1) {
      return jr.a(mf.r, $$0, $$1);
   }
}

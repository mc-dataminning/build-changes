public class efw {
   public static final ald<euy.a> a = a("temperature");
   public static final ald<euy.a> b = a("vegetation");
   public static final ald<euy.a> c = a("continentalness");
   public static final ald<euy.a> d = a("erosion");
   public static final ald<euy.a> e = a("temperature_large");
   public static final ald<euy.a> f = a("vegetation_large");
   public static final ald<euy.a> g = a("continentalness_large");
   public static final ald<euy.a> h = a("erosion_large");
   public static final ald<euy.a> i = a("ridge");
   public static final ald<euy.a> j = a("offset");
   public static final ald<euy.a> k = a("aquifer_barrier");
   public static final ald<euy.a> l = a("aquifer_fluid_level_floodedness");
   public static final ald<euy.a> m = a("aquifer_lava");
   public static final ald<euy.a> n = a("aquifer_fluid_level_spread");
   public static final ald<euy.a> o = a("pillar");
   public static final ald<euy.a> p = a("pillar_rareness");
   public static final ald<euy.a> q = a("pillar_thickness");
   public static final ald<euy.a> r = a("spaghetti_2d");
   public static final ald<euy.a> s = a("spaghetti_2d_elevation");
   public static final ald<euy.a> t = a("spaghetti_2d_modulator");
   public static final ald<euy.a> u = a("spaghetti_2d_thickness");
   public static final ald<euy.a> v = a("spaghetti_3d_1");
   public static final ald<euy.a> w = a("spaghetti_3d_2");
   public static final ald<euy.a> x = a("spaghetti_3d_rarity");
   public static final ald<euy.a> y = a("spaghetti_3d_thickness");
   public static final ald<euy.a> z = a("spaghetti_roughness");
   public static final ald<euy.a> A = a("spaghetti_roughness_modulator");
   public static final ald<euy.a> B = a("cave_entrance");
   public static final ald<euy.a> C = a("cave_layer");
   public static final ald<euy.a> D = a("cave_cheese");
   public static final ald<euy.a> E = a("ore_veininess");
   public static final ald<euy.a> F = a("ore_vein_a");
   public static final ald<euy.a> G = a("ore_vein_b");
   public static final ald<euy.a> H = a("ore_gap");
   public static final ald<euy.a> I = a("noodle");
   public static final ald<euy.a> J = a("noodle_thickness");
   public static final ald<euy.a> K = a("noodle_ridge_a");
   public static final ald<euy.a> L = a("noodle_ridge_b");
   public static final ald<euy.a> M = a("jagged");
   public static final ald<euy.a> N = a("surface");
   public static final ald<euy.a> O = a("surface_secondary");
   public static final ald<euy.a> P = a("clay_bands_offset");
   public static final ald<euy.a> Q = a("badlands_pillar");
   public static final ald<euy.a> R = a("badlands_pillar_roof");
   public static final ald<euy.a> S = a("badlands_surface");
   public static final ald<euy.a> T = a("iceberg_pillar");
   public static final ald<euy.a> U = a("iceberg_pillar_roof");
   public static final ald<euy.a> V = a("iceberg_surface");
   public static final ald<euy.a> W = a("surface_swamp");
   public static final ald<euy.a> X = a("calcite");
   public static final ald<euy.a> Y = a("gravel");
   public static final ald<euy.a> Z = a("powder_snow");
   public static final ald<euy.a> aa = a("packed_ice");
   public static final ald<euy.a> ab = a("ice");
   public static final ald<euy.a> ac = a("soul_sand_layer");
   public static final ald<euy.a> ad = a("gravel_layer");
   public static final ald<euy.a> ae = a("patch");
   public static final ald<euy.a> af = a("netherrack");
   public static final ald<euy.a> ag = a("nether_wart");
   public static final ald<euy.a> ah = a("nether_state_selector");

   private static ald<euy.a> a(String $$0) {
      return ald.a(mg.aW, ale.b($$0));
   }

   public static euy a(jf<euy.a> $$0, ega $$1, ald<euy.a> $$2) {
      je<euy.a> $$3 = $$0.b($$2);
      return euy.b($$1.a($$3.e().orElseThrow().a()), $$3.a());
   }
}

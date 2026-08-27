public class dmo {
   public static final agf<ebj.a> a = a("temperature");
   public static final agf<ebj.a> b = a("vegetation");
   public static final agf<ebj.a> c = a("continentalness");
   public static final agf<ebj.a> d = a("erosion");
   public static final agf<ebj.a> e = a("temperature_large");
   public static final agf<ebj.a> f = a("vegetation_large");
   public static final agf<ebj.a> g = a("continentalness_large");
   public static final agf<ebj.a> h = a("erosion_large");
   public static final agf<ebj.a> i = a("ridge");
   public static final agf<ebj.a> j = a("offset");
   public static final agf<ebj.a> k = a("aquifer_barrier");
   public static final agf<ebj.a> l = a("aquifer_fluid_level_floodedness");
   public static final agf<ebj.a> m = a("aquifer_lava");
   public static final agf<ebj.a> n = a("aquifer_fluid_level_spread");
   public static final agf<ebj.a> o = a("pillar");
   public static final agf<ebj.a> p = a("pillar_rareness");
   public static final agf<ebj.a> q = a("pillar_thickness");
   public static final agf<ebj.a> r = a("spaghetti_2d");
   public static final agf<ebj.a> s = a("spaghetti_2d_elevation");
   public static final agf<ebj.a> t = a("spaghetti_2d_modulator");
   public static final agf<ebj.a> u = a("spaghetti_2d_thickness");
   public static final agf<ebj.a> v = a("spaghetti_3d_1");
   public static final agf<ebj.a> w = a("spaghetti_3d_2");
   public static final agf<ebj.a> x = a("spaghetti_3d_rarity");
   public static final agf<ebj.a> y = a("spaghetti_3d_thickness");
   public static final agf<ebj.a> z = a("spaghetti_roughness");
   public static final agf<ebj.a> A = a("spaghetti_roughness_modulator");
   public static final agf<ebj.a> B = a("cave_entrance");
   public static final agf<ebj.a> C = a("cave_layer");
   public static final agf<ebj.a> D = a("cave_cheese");
   public static final agf<ebj.a> E = a("ore_veininess");
   public static final agf<ebj.a> F = a("ore_vein_a");
   public static final agf<ebj.a> G = a("ore_vein_b");
   public static final agf<ebj.a> H = a("ore_gap");
   public static final agf<ebj.a> I = a("noodle");
   public static final agf<ebj.a> J = a("noodle_thickness");
   public static final agf<ebj.a> K = a("noodle_ridge_a");
   public static final agf<ebj.a> L = a("noodle_ridge_b");
   public static final agf<ebj.a> M = a("jagged");
   public static final agf<ebj.a> N = a("surface");
   public static final agf<ebj.a> O = a("surface_secondary");
   public static final agf<ebj.a> P = a("clay_bands_offset");
   public static final agf<ebj.a> Q = a("badlands_pillar");
   public static final agf<ebj.a> R = a("badlands_pillar_roof");
   public static final agf<ebj.a> S = a("badlands_surface");
   public static final agf<ebj.a> T = a("iceberg_pillar");
   public static final agf<ebj.a> U = a("iceberg_pillar_roof");
   public static final agf<ebj.a> V = a("iceberg_surface");
   public static final agf<ebj.a> W = a("surface_swamp");
   public static final agf<ebj.a> X = a("calcite");
   public static final agf<ebj.a> Y = a("gravel");
   public static final agf<ebj.a> Z = a("powder_snow");
   public static final agf<ebj.a> aa = a("packed_ice");
   public static final agf<ebj.a> ab = a("ice");
   public static final agf<ebj.a> ac = a("soul_sand_layer");
   public static final agf<ebj.a> ad = a("gravel_layer");
   public static final agf<ebj.a> ae = a("patch");
   public static final agf<ebj.a> af = a("netherrack");
   public static final agf<ebj.a> ag = a("nether_wart");
   public static final agf<ebj.a> ah = a("nether_state_selector");

   private static agf<ebj.a> a(String $$0) {
      return agf.a(jz.az, new agg($$0));
   }

   public static ebj a(ic<ebj.a> $$0, dms $$1, agf<ebj.a> $$2) {
      ib<ebj.a> $$3 = $$0.b($$2);
      return ebj.b($$1.a($$3.e().orElseThrow().a()), $$3.a());
   }
}

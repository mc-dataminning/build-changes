public class eds {
   public static final alo<est.a> a = a("temperature");
   public static final alo<est.a> b = a("vegetation");
   public static final alo<est.a> c = a("continentalness");
   public static final alo<est.a> d = a("erosion");
   public static final alo<est.a> e = a("temperature_large");
   public static final alo<est.a> f = a("vegetation_large");
   public static final alo<est.a> g = a("continentalness_large");
   public static final alo<est.a> h = a("erosion_large");
   public static final alo<est.a> i = a("ridge");
   public static final alo<est.a> j = a("offset");
   public static final alo<est.a> k = a("aquifer_barrier");
   public static final alo<est.a> l = a("aquifer_fluid_level_floodedness");
   public static final alo<est.a> m = a("aquifer_lava");
   public static final alo<est.a> n = a("aquifer_fluid_level_spread");
   public static final alo<est.a> o = a("pillar");
   public static final alo<est.a> p = a("pillar_rareness");
   public static final alo<est.a> q = a("pillar_thickness");
   public static final alo<est.a> r = a("spaghetti_2d");
   public static final alo<est.a> s = a("spaghetti_2d_elevation");
   public static final alo<est.a> t = a("spaghetti_2d_modulator");
   public static final alo<est.a> u = a("spaghetti_2d_thickness");
   public static final alo<est.a> v = a("spaghetti_3d_1");
   public static final alo<est.a> w = a("spaghetti_3d_2");
   public static final alo<est.a> x = a("spaghetti_3d_rarity");
   public static final alo<est.a> y = a("spaghetti_3d_thickness");
   public static final alo<est.a> z = a("spaghetti_roughness");
   public static final alo<est.a> A = a("spaghetti_roughness_modulator");
   public static final alo<est.a> B = a("cave_entrance");
   public static final alo<est.a> C = a("cave_layer");
   public static final alo<est.a> D = a("cave_cheese");
   public static final alo<est.a> E = a("ore_veininess");
   public static final alo<est.a> F = a("ore_vein_a");
   public static final alo<est.a> G = a("ore_vein_b");
   public static final alo<est.a> H = a("ore_gap");
   public static final alo<est.a> I = a("noodle");
   public static final alo<est.a> J = a("noodle_thickness");
   public static final alo<est.a> K = a("noodle_ridge_a");
   public static final alo<est.a> L = a("noodle_ridge_b");
   public static final alo<est.a> M = a("jagged");
   public static final alo<est.a> N = a("surface");
   public static final alo<est.a> O = a("surface_secondary");
   public static final alo<est.a> P = a("clay_bands_offset");
   public static final alo<est.a> Q = a("badlands_pillar");
   public static final alo<est.a> R = a("badlands_pillar_roof");
   public static final alo<est.a> S = a("badlands_surface");
   public static final alo<est.a> T = a("iceberg_pillar");
   public static final alo<est.a> U = a("iceberg_pillar_roof");
   public static final alo<est.a> V = a("iceberg_surface");
   public static final alo<est.a> W = a("surface_swamp");
   public static final alo<est.a> X = a("calcite");
   public static final alo<est.a> Y = a("gravel");
   public static final alo<est.a> Z = a("powder_snow");
   public static final alo<est.a> aa = a("packed_ice");
   public static final alo<est.a> ab = a("ice");
   public static final alo<est.a> ac = a("soul_sand_layer");
   public static final alo<est.a> ad = a("gravel_layer");
   public static final alo<est.a> ae = a("patch");
   public static final alo<est.a> af = a("netherrack");
   public static final alo<est.a> ag = a("nether_wart");
   public static final alo<est.a> ah = a("nether_state_selector");

   private static alo<est.a> a(String $$0) {
      return alo.a(mb.aS, alp.b($$0));
   }

   public static est a(jr<est.a> $$0, edw $$1, alo<est.a> $$2) {
      jq<est.a> $$3 = $$0.b($$2);
      return est.b($$1.a($$3.e().orElseThrow().a()), $$3.a());
   }
}

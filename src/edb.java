public class edb {
   public static final akt<esc.a> a = a("temperature");
   public static final akt<esc.a> b = a("vegetation");
   public static final akt<esc.a> c = a("continentalness");
   public static final akt<esc.a> d = a("erosion");
   public static final akt<esc.a> e = a("temperature_large");
   public static final akt<esc.a> f = a("vegetation_large");
   public static final akt<esc.a> g = a("continentalness_large");
   public static final akt<esc.a> h = a("erosion_large");
   public static final akt<esc.a> i = a("ridge");
   public static final akt<esc.a> j = a("offset");
   public static final akt<esc.a> k = a("aquifer_barrier");
   public static final akt<esc.a> l = a("aquifer_fluid_level_floodedness");
   public static final akt<esc.a> m = a("aquifer_lava");
   public static final akt<esc.a> n = a("aquifer_fluid_level_spread");
   public static final akt<esc.a> o = a("pillar");
   public static final akt<esc.a> p = a("pillar_rareness");
   public static final akt<esc.a> q = a("pillar_thickness");
   public static final akt<esc.a> r = a("spaghetti_2d");
   public static final akt<esc.a> s = a("spaghetti_2d_elevation");
   public static final akt<esc.a> t = a("spaghetti_2d_modulator");
   public static final akt<esc.a> u = a("spaghetti_2d_thickness");
   public static final akt<esc.a> v = a("spaghetti_3d_1");
   public static final akt<esc.a> w = a("spaghetti_3d_2");
   public static final akt<esc.a> x = a("spaghetti_3d_rarity");
   public static final akt<esc.a> y = a("spaghetti_3d_thickness");
   public static final akt<esc.a> z = a("spaghetti_roughness");
   public static final akt<esc.a> A = a("spaghetti_roughness_modulator");
   public static final akt<esc.a> B = a("cave_entrance");
   public static final akt<esc.a> C = a("cave_layer");
   public static final akt<esc.a> D = a("cave_cheese");
   public static final akt<esc.a> E = a("ore_veininess");
   public static final akt<esc.a> F = a("ore_vein_a");
   public static final akt<esc.a> G = a("ore_vein_b");
   public static final akt<esc.a> H = a("ore_gap");
   public static final akt<esc.a> I = a("noodle");
   public static final akt<esc.a> J = a("noodle_thickness");
   public static final akt<esc.a> K = a("noodle_ridge_a");
   public static final akt<esc.a> L = a("noodle_ridge_b");
   public static final akt<esc.a> M = a("jagged");
   public static final akt<esc.a> N = a("surface");
   public static final akt<esc.a> O = a("surface_secondary");
   public static final akt<esc.a> P = a("clay_bands_offset");
   public static final akt<esc.a> Q = a("badlands_pillar");
   public static final akt<esc.a> R = a("badlands_pillar_roof");
   public static final akt<esc.a> S = a("badlands_surface");
   public static final akt<esc.a> T = a("iceberg_pillar");
   public static final akt<esc.a> U = a("iceberg_pillar_roof");
   public static final akt<esc.a> V = a("iceberg_surface");
   public static final akt<esc.a> W = a("surface_swamp");
   public static final akt<esc.a> X = a("calcite");
   public static final akt<esc.a> Y = a("gravel");
   public static final akt<esc.a> Z = a("powder_snow");
   public static final akt<esc.a> aa = a("packed_ice");
   public static final akt<esc.a> ab = a("ice");
   public static final akt<esc.a> ac = a("soul_sand_layer");
   public static final akt<esc.a> ad = a("gravel_layer");
   public static final akt<esc.a> ae = a("patch");
   public static final akt<esc.a> af = a("netherrack");
   public static final akt<esc.a> ag = a("nether_wart");
   public static final akt<esc.a> ah = a("nether_state_selector");

   private static akt<esc.a> a(String $$0) {
      return akt.a(mc.aS, aku.b($$0));
   }

   public static esc a(js<esc.a> $$0, edf $$1, akt<esc.a> $$2) {
      jr<esc.a> $$3 = $$0.b($$2);
      return esc.b($$1.a($$3.e().orElseThrow().a()), $$3.a());
   }
}

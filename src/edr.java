public class edr {
   public static final aly<ess.a> a = a("temperature");
   public static final aly<ess.a> b = a("vegetation");
   public static final aly<ess.a> c = a("continentalness");
   public static final aly<ess.a> d = a("erosion");
   public static final aly<ess.a> e = a("temperature_large");
   public static final aly<ess.a> f = a("vegetation_large");
   public static final aly<ess.a> g = a("continentalness_large");
   public static final aly<ess.a> h = a("erosion_large");
   public static final aly<ess.a> i = a("ridge");
   public static final aly<ess.a> j = a("offset");
   public static final aly<ess.a> k = a("aquifer_barrier");
   public static final aly<ess.a> l = a("aquifer_fluid_level_floodedness");
   public static final aly<ess.a> m = a("aquifer_lava");
   public static final aly<ess.a> n = a("aquifer_fluid_level_spread");
   public static final aly<ess.a> o = a("pillar");
   public static final aly<ess.a> p = a("pillar_rareness");
   public static final aly<ess.a> q = a("pillar_thickness");
   public static final aly<ess.a> r = a("spaghetti_2d");
   public static final aly<ess.a> s = a("spaghetti_2d_elevation");
   public static final aly<ess.a> t = a("spaghetti_2d_modulator");
   public static final aly<ess.a> u = a("spaghetti_2d_thickness");
   public static final aly<ess.a> v = a("spaghetti_3d_1");
   public static final aly<ess.a> w = a("spaghetti_3d_2");
   public static final aly<ess.a> x = a("spaghetti_3d_rarity");
   public static final aly<ess.a> y = a("spaghetti_3d_thickness");
   public static final aly<ess.a> z = a("spaghetti_roughness");
   public static final aly<ess.a> A = a("spaghetti_roughness_modulator");
   public static final aly<ess.a> B = a("cave_entrance");
   public static final aly<ess.a> C = a("cave_layer");
   public static final aly<ess.a> D = a("cave_cheese");
   public static final aly<ess.a> E = a("ore_veininess");
   public static final aly<ess.a> F = a("ore_vein_a");
   public static final aly<ess.a> G = a("ore_vein_b");
   public static final aly<ess.a> H = a("ore_gap");
   public static final aly<ess.a> I = a("noodle");
   public static final aly<ess.a> J = a("noodle_thickness");
   public static final aly<ess.a> K = a("noodle_ridge_a");
   public static final aly<ess.a> L = a("noodle_ridge_b");
   public static final aly<ess.a> M = a("jagged");
   public static final aly<ess.a> N = a("surface");
   public static final aly<ess.a> O = a("surface_secondary");
   public static final aly<ess.a> P = a("clay_bands_offset");
   public static final aly<ess.a> Q = a("badlands_pillar");
   public static final aly<ess.a> R = a("badlands_pillar_roof");
   public static final aly<ess.a> S = a("badlands_surface");
   public static final aly<ess.a> T = a("iceberg_pillar");
   public static final aly<ess.a> U = a("iceberg_pillar_roof");
   public static final aly<ess.a> V = a("iceberg_surface");
   public static final aly<ess.a> W = a("surface_swamp");
   public static final aly<ess.a> X = a("calcite");
   public static final aly<ess.a> Y = a("gravel");
   public static final aly<ess.a> Z = a("powder_snow");
   public static final aly<ess.a> aa = a("packed_ice");
   public static final aly<ess.a> ab = a("ice");
   public static final aly<ess.a> ac = a("soul_sand_layer");
   public static final aly<ess.a> ad = a("gravel_layer");
   public static final aly<ess.a> ae = a("patch");
   public static final aly<ess.a> af = a("netherrack");
   public static final aly<ess.a> ag = a("nether_wart");
   public static final aly<ess.a> ah = a("nether_state_selector");

   private static aly<ess.a> a(String $$0) {
      return aly.a(mb.aR, alz.b($$0));
   }

   public static ess a(jr<ess.a> $$0, edv $$1, aly<ess.a> $$2) {
      jq<ess.a> $$3 = $$0.b($$2);
      return ess.b($$1.a($$3.e().orElseThrow().a()), $$3.a());
   }
}

public class dnf {
   public static final agl<eca.a> a = a("temperature");
   public static final agl<eca.a> b = a("vegetation");
   public static final agl<eca.a> c = a("continentalness");
   public static final agl<eca.a> d = a("erosion");
   public static final agl<eca.a> e = a("temperature_large");
   public static final agl<eca.a> f = a("vegetation_large");
   public static final agl<eca.a> g = a("continentalness_large");
   public static final agl<eca.a> h = a("erosion_large");
   public static final agl<eca.a> i = a("ridge");
   public static final agl<eca.a> j = a("offset");
   public static final agl<eca.a> k = a("aquifer_barrier");
   public static final agl<eca.a> l = a("aquifer_fluid_level_floodedness");
   public static final agl<eca.a> m = a("aquifer_lava");
   public static final agl<eca.a> n = a("aquifer_fluid_level_spread");
   public static final agl<eca.a> o = a("pillar");
   public static final agl<eca.a> p = a("pillar_rareness");
   public static final agl<eca.a> q = a("pillar_thickness");
   public static final agl<eca.a> r = a("spaghetti_2d");
   public static final agl<eca.a> s = a("spaghetti_2d_elevation");
   public static final agl<eca.a> t = a("spaghetti_2d_modulator");
   public static final agl<eca.a> u = a("spaghetti_2d_thickness");
   public static final agl<eca.a> v = a("spaghetti_3d_1");
   public static final agl<eca.a> w = a("spaghetti_3d_2");
   public static final agl<eca.a> x = a("spaghetti_3d_rarity");
   public static final agl<eca.a> y = a("spaghetti_3d_thickness");
   public static final agl<eca.a> z = a("spaghetti_roughness");
   public static final agl<eca.a> A = a("spaghetti_roughness_modulator");
   public static final agl<eca.a> B = a("cave_entrance");
   public static final agl<eca.a> C = a("cave_layer");
   public static final agl<eca.a> D = a("cave_cheese");
   public static final agl<eca.a> E = a("ore_veininess");
   public static final agl<eca.a> F = a("ore_vein_a");
   public static final agl<eca.a> G = a("ore_vein_b");
   public static final agl<eca.a> H = a("ore_gap");
   public static final agl<eca.a> I = a("noodle");
   public static final agl<eca.a> J = a("noodle_thickness");
   public static final agl<eca.a> K = a("noodle_ridge_a");
   public static final agl<eca.a> L = a("noodle_ridge_b");
   public static final agl<eca.a> M = a("jagged");
   public static final agl<eca.a> N = a("surface");
   public static final agl<eca.a> O = a("surface_secondary");
   public static final agl<eca.a> P = a("clay_bands_offset");
   public static final agl<eca.a> Q = a("badlands_pillar");
   public static final agl<eca.a> R = a("badlands_pillar_roof");
   public static final agl<eca.a> S = a("badlands_surface");
   public static final agl<eca.a> T = a("iceberg_pillar");
   public static final agl<eca.a> U = a("iceberg_pillar_roof");
   public static final agl<eca.a> V = a("iceberg_surface");
   public static final agl<eca.a> W = a("surface_swamp");
   public static final agl<eca.a> X = a("calcite");
   public static final agl<eca.a> Y = a("gravel");
   public static final agl<eca.a> Z = a("powder_snow");
   public static final agl<eca.a> aa = a("packed_ice");
   public static final agl<eca.a> ab = a("ice");
   public static final agl<eca.a> ac = a("soul_sand_layer");
   public static final agl<eca.a> ad = a("gravel_layer");
   public static final agl<eca.a> ae = a("patch");
   public static final agl<eca.a> af = a("netherrack");
   public static final agl<eca.a> ag = a("nether_wart");
   public static final agl<eca.a> ah = a("nether_state_selector");

   private static agl<eca.a> a(String $$0) {
      return agl.a(kd.az, new agm($$0));
   }

   public static eca a(ih<eca.a> $$0, dnj $$1, agl<eca.a> $$2) {
      ig<eca.a> $$3 = $$0.b($$2);
      return eca.b($$1.a($$3.e().orElseThrow().a()), $$3.a());
   }
}

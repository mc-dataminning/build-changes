public class dht {
   public static final acp<dwh.a> a = a("temperature");
   public static final acp<dwh.a> b = a("vegetation");
   public static final acp<dwh.a> c = a("continentalness");
   public static final acp<dwh.a> d = a("erosion");
   public static final acp<dwh.a> e = a("temperature_large");
   public static final acp<dwh.a> f = a("vegetation_large");
   public static final acp<dwh.a> g = a("continentalness_large");
   public static final acp<dwh.a> h = a("erosion_large");
   public static final acp<dwh.a> i = a("ridge");
   public static final acp<dwh.a> j = a("offset");
   public static final acp<dwh.a> k = a("aquifer_barrier");
   public static final acp<dwh.a> l = a("aquifer_fluid_level_floodedness");
   public static final acp<dwh.a> m = a("aquifer_lava");
   public static final acp<dwh.a> n = a("aquifer_fluid_level_spread");
   public static final acp<dwh.a> o = a("pillar");
   public static final acp<dwh.a> p = a("pillar_rareness");
   public static final acp<dwh.a> q = a("pillar_thickness");
   public static final acp<dwh.a> r = a("spaghetti_2d");
   public static final acp<dwh.a> s = a("spaghetti_2d_elevation");
   public static final acp<dwh.a> t = a("spaghetti_2d_modulator");
   public static final acp<dwh.a> u = a("spaghetti_2d_thickness");
   public static final acp<dwh.a> v = a("spaghetti_3d_1");
   public static final acp<dwh.a> w = a("spaghetti_3d_2");
   public static final acp<dwh.a> x = a("spaghetti_3d_rarity");
   public static final acp<dwh.a> y = a("spaghetti_3d_thickness");
   public static final acp<dwh.a> z = a("spaghetti_roughness");
   public static final acp<dwh.a> A = a("spaghetti_roughness_modulator");
   public static final acp<dwh.a> B = a("cave_entrance");
   public static final acp<dwh.a> C = a("cave_layer");
   public static final acp<dwh.a> D = a("cave_cheese");
   public static final acp<dwh.a> E = a("ore_veininess");
   public static final acp<dwh.a> F = a("ore_vein_a");
   public static final acp<dwh.a> G = a("ore_vein_b");
   public static final acp<dwh.a> H = a("ore_gap");
   public static final acp<dwh.a> I = a("noodle");
   public static final acp<dwh.a> J = a("noodle_thickness");
   public static final acp<dwh.a> K = a("noodle_ridge_a");
   public static final acp<dwh.a> L = a("noodle_ridge_b");
   public static final acp<dwh.a> M = a("jagged");
   public static final acp<dwh.a> N = a("surface");
   public static final acp<dwh.a> O = a("surface_secondary");
   public static final acp<dwh.a> P = a("clay_bands_offset");
   public static final acp<dwh.a> Q = a("badlands_pillar");
   public static final acp<dwh.a> R = a("badlands_pillar_roof");
   public static final acp<dwh.a> S = a("badlands_surface");
   public static final acp<dwh.a> T = a("iceberg_pillar");
   public static final acp<dwh.a> U = a("iceberg_pillar_roof");
   public static final acp<dwh.a> V = a("iceberg_surface");
   public static final acp<dwh.a> W = a("surface_swamp");
   public static final acp<dwh.a> X = a("calcite");
   public static final acp<dwh.a> Y = a("gravel");
   public static final acp<dwh.a> Z = a("powder_snow");
   public static final acp<dwh.a> aa = a("packed_ice");
   public static final acp<dwh.a> ab = a("ice");
   public static final acp<dwh.a> ac = a("soul_sand_layer");
   public static final acp<dwh.a> ad = a("gravel_layer");
   public static final acp<dwh.a> ae = a("patch");
   public static final acp<dwh.a> af = a("netherrack");
   public static final acp<dwh.a> ag = a("nether_wart");
   public static final acp<dwh.a> ah = a("nether_state_selector");

   private static acp<dwh.a> a(String $$0) {
      return acp.a(jc.ax, new acq($$0));
   }

   public static dwh a(hf<dwh.a> $$0, dhx $$1, acp<dwh.a> $$2) {
      he<dwh.a> $$3 = $$0.b($$2);
      return dwh.b($$1.a($$3.e().orElseThrow().a()), $$3.a());
   }
}

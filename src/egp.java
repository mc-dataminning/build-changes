public class egp {
   public static final alf<evr.a> a = a("temperature");
   public static final alf<evr.a> b = a("vegetation");
   public static final alf<evr.a> c = a("continentalness");
   public static final alf<evr.a> d = a("erosion");
   public static final alf<evr.a> e = a("temperature_large");
   public static final alf<evr.a> f = a("vegetation_large");
   public static final alf<evr.a> g = a("continentalness_large");
   public static final alf<evr.a> h = a("erosion_large");
   public static final alf<evr.a> i = a("ridge");
   public static final alf<evr.a> j = a("offset");
   public static final alf<evr.a> k = a("aquifer_barrier");
   public static final alf<evr.a> l = a("aquifer_fluid_level_floodedness");
   public static final alf<evr.a> m = a("aquifer_lava");
   public static final alf<evr.a> n = a("aquifer_fluid_level_spread");
   public static final alf<evr.a> o = a("pillar");
   public static final alf<evr.a> p = a("pillar_rareness");
   public static final alf<evr.a> q = a("pillar_thickness");
   public static final alf<evr.a> r = a("spaghetti_2d");
   public static final alf<evr.a> s = a("spaghetti_2d_elevation");
   public static final alf<evr.a> t = a("spaghetti_2d_modulator");
   public static final alf<evr.a> u = a("spaghetti_2d_thickness");
   public static final alf<evr.a> v = a("spaghetti_3d_1");
   public static final alf<evr.a> w = a("spaghetti_3d_2");
   public static final alf<evr.a> x = a("spaghetti_3d_rarity");
   public static final alf<evr.a> y = a("spaghetti_3d_thickness");
   public static final alf<evr.a> z = a("spaghetti_roughness");
   public static final alf<evr.a> A = a("spaghetti_roughness_modulator");
   public static final alf<evr.a> B = a("cave_entrance");
   public static final alf<evr.a> C = a("cave_layer");
   public static final alf<evr.a> D = a("cave_cheese");
   public static final alf<evr.a> E = a("ore_veininess");
   public static final alf<evr.a> F = a("ore_vein_a");
   public static final alf<evr.a> G = a("ore_vein_b");
   public static final alf<evr.a> H = a("ore_gap");
   public static final alf<evr.a> I = a("noodle");
   public static final alf<evr.a> J = a("noodle_thickness");
   public static final alf<evr.a> K = a("noodle_ridge_a");
   public static final alf<evr.a> L = a("noodle_ridge_b");
   public static final alf<evr.a> M = a("jagged");
   public static final alf<evr.a> N = a("surface");
   public static final alf<evr.a> O = a("surface_secondary");
   public static final alf<evr.a> P = a("clay_bands_offset");
   public static final alf<evr.a> Q = a("badlands_pillar");
   public static final alf<evr.a> R = a("badlands_pillar_roof");
   public static final alf<evr.a> S = a("badlands_surface");
   public static final alf<evr.a> T = a("iceberg_pillar");
   public static final alf<evr.a> U = a("iceberg_pillar_roof");
   public static final alf<evr.a> V = a("iceberg_surface");
   public static final alf<evr.a> W = a("surface_swamp");
   public static final alf<evr.a> X = a("calcite");
   public static final alf<evr.a> Y = a("gravel");
   public static final alf<evr.a> Z = a("powder_snow");
   public static final alf<evr.a> aa = a("packed_ice");
   public static final alf<evr.a> ab = a("ice");
   public static final alf<evr.a> ac = a("soul_sand_layer");
   public static final alf<evr.a> ad = a("gravel_layer");
   public static final alf<evr.a> ae = a("patch");
   public static final alf<evr.a> af = a("netherrack");
   public static final alf<evr.a> ag = a("nether_wart");
   public static final alf<evr.a> ah = a("nether_state_selector");

   private static alf<evr.a> a(String $$0) {
      return alf.a(mg.aY, alg.b($$0));
   }

   public static evr a(jf<evr.a> $$0, egt $$1, alf<evr.a> $$2) {
      je<evr.a> $$3 = $$0.b($$2);
      return evr.b($$1.a($$3.e().orElseThrow().a()), $$3.a());
   }
}

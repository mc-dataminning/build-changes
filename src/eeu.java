public class eeu {
   public static final alc<etw.a> a = a("temperature");
   public static final alc<etw.a> b = a("vegetation");
   public static final alc<etw.a> c = a("continentalness");
   public static final alc<etw.a> d = a("erosion");
   public static final alc<etw.a> e = a("temperature_large");
   public static final alc<etw.a> f = a("vegetation_large");
   public static final alc<etw.a> g = a("continentalness_large");
   public static final alc<etw.a> h = a("erosion_large");
   public static final alc<etw.a> i = a("ridge");
   public static final alc<etw.a> j = a("offset");
   public static final alc<etw.a> k = a("aquifer_barrier");
   public static final alc<etw.a> l = a("aquifer_fluid_level_floodedness");
   public static final alc<etw.a> m = a("aquifer_lava");
   public static final alc<etw.a> n = a("aquifer_fluid_level_spread");
   public static final alc<etw.a> o = a("pillar");
   public static final alc<etw.a> p = a("pillar_rareness");
   public static final alc<etw.a> q = a("pillar_thickness");
   public static final alc<etw.a> r = a("spaghetti_2d");
   public static final alc<etw.a> s = a("spaghetti_2d_elevation");
   public static final alc<etw.a> t = a("spaghetti_2d_modulator");
   public static final alc<etw.a> u = a("spaghetti_2d_thickness");
   public static final alc<etw.a> v = a("spaghetti_3d_1");
   public static final alc<etw.a> w = a("spaghetti_3d_2");
   public static final alc<etw.a> x = a("spaghetti_3d_rarity");
   public static final alc<etw.a> y = a("spaghetti_3d_thickness");
   public static final alc<etw.a> z = a("spaghetti_roughness");
   public static final alc<etw.a> A = a("spaghetti_roughness_modulator");
   public static final alc<etw.a> B = a("cave_entrance");
   public static final alc<etw.a> C = a("cave_layer");
   public static final alc<etw.a> D = a("cave_cheese");
   public static final alc<etw.a> E = a("ore_veininess");
   public static final alc<etw.a> F = a("ore_vein_a");
   public static final alc<etw.a> G = a("ore_vein_b");
   public static final alc<etw.a> H = a("ore_gap");
   public static final alc<etw.a> I = a("noodle");
   public static final alc<etw.a> J = a("noodle_thickness");
   public static final alc<etw.a> K = a("noodle_ridge_a");
   public static final alc<etw.a> L = a("noodle_ridge_b");
   public static final alc<etw.a> M = a("jagged");
   public static final alc<etw.a> N = a("surface");
   public static final alc<etw.a> O = a("surface_secondary");
   public static final alc<etw.a> P = a("clay_bands_offset");
   public static final alc<etw.a> Q = a("badlands_pillar");
   public static final alc<etw.a> R = a("badlands_pillar_roof");
   public static final alc<etw.a> S = a("badlands_surface");
   public static final alc<etw.a> T = a("iceberg_pillar");
   public static final alc<etw.a> U = a("iceberg_pillar_roof");
   public static final alc<etw.a> V = a("iceberg_surface");
   public static final alc<etw.a> W = a("surface_swamp");
   public static final alc<etw.a> X = a("calcite");
   public static final alc<etw.a> Y = a("gravel");
   public static final alc<etw.a> Z = a("powder_snow");
   public static final alc<etw.a> aa = a("packed_ice");
   public static final alc<etw.a> ab = a("ice");
   public static final alc<etw.a> ac = a("soul_sand_layer");
   public static final alc<etw.a> ad = a("gravel_layer");
   public static final alc<etw.a> ae = a("patch");
   public static final alc<etw.a> af = a("netherrack");
   public static final alc<etw.a> ag = a("nether_wart");
   public static final alc<etw.a> ah = a("nether_state_selector");

   private static alc<etw.a> a(String $$0) {
      return alc.a(me.aW, ald.b($$0));
   }

   public static etw a(jt<etw.a> $$0, eey $$1, alc<etw.a> $$2) {
      js<etw.a> $$3 = $$0.b($$2);
      return etw.b($$1.a($$3.e().orElseThrow().a()), $$3.a());
   }
}

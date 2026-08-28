public class egw {
   public static final alf<evy.a> a = a("temperature");
   public static final alf<evy.a> b = a("vegetation");
   public static final alf<evy.a> c = a("continentalness");
   public static final alf<evy.a> d = a("erosion");
   public static final alf<evy.a> e = a("temperature_large");
   public static final alf<evy.a> f = a("vegetation_large");
   public static final alf<evy.a> g = a("continentalness_large");
   public static final alf<evy.a> h = a("erosion_large");
   public static final alf<evy.a> i = a("ridge");
   public static final alf<evy.a> j = a("offset");
   public static final alf<evy.a> k = a("aquifer_barrier");
   public static final alf<evy.a> l = a("aquifer_fluid_level_floodedness");
   public static final alf<evy.a> m = a("aquifer_lava");
   public static final alf<evy.a> n = a("aquifer_fluid_level_spread");
   public static final alf<evy.a> o = a("pillar");
   public static final alf<evy.a> p = a("pillar_rareness");
   public static final alf<evy.a> q = a("pillar_thickness");
   public static final alf<evy.a> r = a("spaghetti_2d");
   public static final alf<evy.a> s = a("spaghetti_2d_elevation");
   public static final alf<evy.a> t = a("spaghetti_2d_modulator");
   public static final alf<evy.a> u = a("spaghetti_2d_thickness");
   public static final alf<evy.a> v = a("spaghetti_3d_1");
   public static final alf<evy.a> w = a("spaghetti_3d_2");
   public static final alf<evy.a> x = a("spaghetti_3d_rarity");
   public static final alf<evy.a> y = a("spaghetti_3d_thickness");
   public static final alf<evy.a> z = a("spaghetti_roughness");
   public static final alf<evy.a> A = a("spaghetti_roughness_modulator");
   public static final alf<evy.a> B = a("cave_entrance");
   public static final alf<evy.a> C = a("cave_layer");
   public static final alf<evy.a> D = a("cave_cheese");
   public static final alf<evy.a> E = a("ore_veininess");
   public static final alf<evy.a> F = a("ore_vein_a");
   public static final alf<evy.a> G = a("ore_vein_b");
   public static final alf<evy.a> H = a("ore_gap");
   public static final alf<evy.a> I = a("noodle");
   public static final alf<evy.a> J = a("noodle_thickness");
   public static final alf<evy.a> K = a("noodle_ridge_a");
   public static final alf<evy.a> L = a("noodle_ridge_b");
   public static final alf<evy.a> M = a("jagged");
   public static final alf<evy.a> N = a("surface");
   public static final alf<evy.a> O = a("surface_secondary");
   public static final alf<evy.a> P = a("clay_bands_offset");
   public static final alf<evy.a> Q = a("badlands_pillar");
   public static final alf<evy.a> R = a("badlands_pillar_roof");
   public static final alf<evy.a> S = a("badlands_surface");
   public static final alf<evy.a> T = a("iceberg_pillar");
   public static final alf<evy.a> U = a("iceberg_pillar_roof");
   public static final alf<evy.a> V = a("iceberg_surface");
   public static final alf<evy.a> W = a("surface_swamp");
   public static final alf<evy.a> X = a("calcite");
   public static final alf<evy.a> Y = a("gravel");
   public static final alf<evy.a> Z = a("powder_snow");
   public static final alf<evy.a> aa = a("packed_ice");
   public static final alf<evy.a> ab = a("ice");
   public static final alf<evy.a> ac = a("soul_sand_layer");
   public static final alf<evy.a> ad = a("gravel_layer");
   public static final alf<evy.a> ae = a("patch");
   public static final alf<evy.a> af = a("netherrack");
   public static final alf<evy.a> ag = a("nether_wart");
   public static final alf<evy.a> ah = a("nether_state_selector");

   private static alf<evy.a> a(String $$0) {
      return alf.a(mh.aY, alg.b($$0));
   }

   public static evy a(jg<evy.a> $$0, eha $$1, alf<evy.a> $$2) {
      jf<evy.a> $$3 = $$0.b($$2);
      return evy.b($$1.a($$3.e().orElseThrow().a()), $$3.a());
   }
}

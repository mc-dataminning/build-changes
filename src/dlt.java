public class dlt {
   public static final afv<eah.a> a = a("temperature");
   public static final afv<eah.a> b = a("vegetation");
   public static final afv<eah.a> c = a("continentalness");
   public static final afv<eah.a> d = a("erosion");
   public static final afv<eah.a> e = a("temperature_large");
   public static final afv<eah.a> f = a("vegetation_large");
   public static final afv<eah.a> g = a("continentalness_large");
   public static final afv<eah.a> h = a("erosion_large");
   public static final afv<eah.a> i = a("ridge");
   public static final afv<eah.a> j = a("offset");
   public static final afv<eah.a> k = a("aquifer_barrier");
   public static final afv<eah.a> l = a("aquifer_fluid_level_floodedness");
   public static final afv<eah.a> m = a("aquifer_lava");
   public static final afv<eah.a> n = a("aquifer_fluid_level_spread");
   public static final afv<eah.a> o = a("pillar");
   public static final afv<eah.a> p = a("pillar_rareness");
   public static final afv<eah.a> q = a("pillar_thickness");
   public static final afv<eah.a> r = a("spaghetti_2d");
   public static final afv<eah.a> s = a("spaghetti_2d_elevation");
   public static final afv<eah.a> t = a("spaghetti_2d_modulator");
   public static final afv<eah.a> u = a("spaghetti_2d_thickness");
   public static final afv<eah.a> v = a("spaghetti_3d_1");
   public static final afv<eah.a> w = a("spaghetti_3d_2");
   public static final afv<eah.a> x = a("spaghetti_3d_rarity");
   public static final afv<eah.a> y = a("spaghetti_3d_thickness");
   public static final afv<eah.a> z = a("spaghetti_roughness");
   public static final afv<eah.a> A = a("spaghetti_roughness_modulator");
   public static final afv<eah.a> B = a("cave_entrance");
   public static final afv<eah.a> C = a("cave_layer");
   public static final afv<eah.a> D = a("cave_cheese");
   public static final afv<eah.a> E = a("ore_veininess");
   public static final afv<eah.a> F = a("ore_vein_a");
   public static final afv<eah.a> G = a("ore_vein_b");
   public static final afv<eah.a> H = a("ore_gap");
   public static final afv<eah.a> I = a("noodle");
   public static final afv<eah.a> J = a("noodle_thickness");
   public static final afv<eah.a> K = a("noodle_ridge_a");
   public static final afv<eah.a> L = a("noodle_ridge_b");
   public static final afv<eah.a> M = a("jagged");
   public static final afv<eah.a> N = a("surface");
   public static final afv<eah.a> O = a("surface_secondary");
   public static final afv<eah.a> P = a("clay_bands_offset");
   public static final afv<eah.a> Q = a("badlands_pillar");
   public static final afv<eah.a> R = a("badlands_pillar_roof");
   public static final afv<eah.a> S = a("badlands_surface");
   public static final afv<eah.a> T = a("iceberg_pillar");
   public static final afv<eah.a> U = a("iceberg_pillar_roof");
   public static final afv<eah.a> V = a("iceberg_surface");
   public static final afv<eah.a> W = a("surface_swamp");
   public static final afv<eah.a> X = a("calcite");
   public static final afv<eah.a> Y = a("gravel");
   public static final afv<eah.a> Z = a("powder_snow");
   public static final afv<eah.a> aa = a("packed_ice");
   public static final afv<eah.a> ab = a("ice");
   public static final afv<eah.a> ac = a("soul_sand_layer");
   public static final afv<eah.a> ad = a("gravel_layer");
   public static final afv<eah.a> ae = a("patch");
   public static final afv<eah.a> af = a("netherrack");
   public static final afv<eah.a> ag = a("nether_wart");
   public static final afv<eah.a> ah = a("nether_state_selector");

   private static afv<eah.a> a(String $$0) {
      return afv.a(jz.ay, new afw($$0));
   }

   public static eah a(ic<eah.a> $$0, dlx $$1, afv<eah.a> $$2) {
      ib<eah.a> $$3 = $$0.b($$2);
      return eah.b($$1.a($$3.e().orElseThrow().a()), $$3.a());
   }
}

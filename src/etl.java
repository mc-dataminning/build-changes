public class etl {
   private static final int J = 12741452;
   public static final jq<etk> a = a("player", "player", false, true);
   public static final jq<etk> b = a("frame", "frame", true, true);
   public static final jq<etk> c = a("red_marker", "red_marker", false, true);
   public static final jq<etk> d = a("blue_marker", "blue_marker", false, true);
   public static final jq<etk> e = a("target_x", "target_x", true, false);
   public static final jq<etk> f = a("target_point", "target_point", true, false);
   public static final jq<etk> g = a("player_off_map", "player_off_map", false, true);
   public static final jq<etk> h = a("player_off_limits", "player_off_limits", false, true);
   public static final jq<etk> i = a("mansion", "woodland_mansion", true, 5393476, false, true);
   public static final jq<etk> j = a("monument", "ocean_monument", true, 3830373, false, true);
   public static final jq<etk> k = a("banner_white", "white_banner", true, true);
   public static final jq<etk> l = a("banner_orange", "orange_banner", true, true);
   public static final jq<etk> m = a("banner_magenta", "magenta_banner", true, true);
   public static final jq<etk> n = a("banner_light_blue", "light_blue_banner", true, true);
   public static final jq<etk> o = a("banner_yellow", "yellow_banner", true, true);
   public static final jq<etk> p = a("banner_lime", "lime_banner", true, true);
   public static final jq<etk> q = a("banner_pink", "pink_banner", true, true);
   public static final jq<etk> r = a("banner_gray", "gray_banner", true, true);
   public static final jq<etk> s = a("banner_light_gray", "light_gray_banner", true, true);
   public static final jq<etk> t = a("banner_cyan", "cyan_banner", true, true);
   public static final jq<etk> u = a("banner_purple", "purple_banner", true, true);
   public static final jq<etk> v = a("banner_blue", "blue_banner", true, true);
   public static final jq<etk> w = a("banner_brown", "brown_banner", true, true);
   public static final jq<etk> x = a("banner_green", "green_banner", true, true);
   public static final jq<etk> y = a("banner_red", "red_banner", true, true);
   public static final jq<etk> z = a("banner_black", "black_banner", true, true);
   public static final jq<etk> A = a("red_x", "red_x", true, false);
   public static final jq<etk> B = a("village_desert", "desert_village", true, erz.w.ak, false, true);
   public static final jq<etk> C = a("village_plains", "plains_village", true, erz.w.ak, false, true);
   public static final jq<etk> D = a("village_savanna", "savanna_village", true, erz.w.ak, false, true);
   public static final jq<etk> E = a("village_snowy", "snowy_village", true, erz.w.ak, false, true);
   public static final jq<etk> F = a("village_taiga", "taiga_village", true, erz.w.ak, false, true);
   public static final jq<etk> G = a("jungle_temple", "jungle_temple", true, erz.w.ak, false, true);
   public static final jq<etk> H = a("swamp_hut", "swamp_hut", true, erz.w.ak, false, true);
   public static final jq<etk> I = a("trial_chambers", "trial_chambers", true, 12741452, false, true);

   public static jq<etk> a(kd<etk> $$0) {
      return a;
   }

   private static jq<etk> a(String $$0, String $$1, boolean $$2, boolean $$3) {
      return a($$0, $$1, $$2, -1, $$3, false);
   }

   private static jq<etk> a(String $$0, String $$1, boolean $$2, int $$3, boolean $$4, boolean $$5) {
      ali<etk> $$6 = ali.a(ma.aC, alj.b($$0));
      etk $$7 = new etk(alj.b($$1), $$2, $$3, $$5, $$4);
      return kd.b(lz.ar, $$6, $$7);
   }
}

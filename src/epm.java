public class epm {
   private static final int J = 12741452;
   public static final jj<epl> a = a("player", "player", false, true);
   public static final jj<epl> b = a("frame", "frame", true, true);
   public static final jj<epl> c = a("red_marker", "red_marker", false, true);
   public static final jj<epl> d = a("blue_marker", "blue_marker", false, true);
   public static final jj<epl> e = a("target_x", "target_x", true, false);
   public static final jj<epl> f = a("target_point", "target_point", true, false);
   public static final jj<epl> g = a("player_off_map", "player_off_map", false, true);
   public static final jj<epl> h = a("player_off_limits", "player_off_limits", false, true);
   public static final jj<epl> i = a("mansion", "woodland_mansion", true, 5393476, false, true);
   public static final jj<epl> j = a("monument", "ocean_monument", true, 3830373, false, true);
   public static final jj<epl> k = a("banner_white", "white_banner", true, true);
   public static final jj<epl> l = a("banner_orange", "orange_banner", true, true);
   public static final jj<epl> m = a("banner_magenta", "magenta_banner", true, true);
   public static final jj<epl> n = a("banner_light_blue", "light_blue_banner", true, true);
   public static final jj<epl> o = a("banner_yellow", "yellow_banner", true, true);
   public static final jj<epl> p = a("banner_lime", "lime_banner", true, true);
   public static final jj<epl> q = a("banner_pink", "pink_banner", true, true);
   public static final jj<epl> r = a("banner_gray", "gray_banner", true, true);
   public static final jj<epl> s = a("banner_light_gray", "light_gray_banner", true, true);
   public static final jj<epl> t = a("banner_cyan", "cyan_banner", true, true);
   public static final jj<epl> u = a("banner_purple", "purple_banner", true, true);
   public static final jj<epl> v = a("banner_blue", "blue_banner", true, true);
   public static final jj<epl> w = a("banner_brown", "brown_banner", true, true);
   public static final jj<epl> x = a("banner_green", "green_banner", true, true);
   public static final jj<epl> y = a("banner_red", "red_banner", true, true);
   public static final jj<epl> z = a("banner_black", "black_banner", true, true);
   public static final jj<epl> A = a("red_x", "red_x", true, false);
   public static final jj<epl> B = a("village_desert", "desert_village", true, eof.w.ak, false, true);
   public static final jj<epl> C = a("village_plains", "plains_village", true, eof.w.ak, false, true);
   public static final jj<epl> D = a("village_savanna", "savanna_village", true, eof.w.ak, false, true);
   public static final jj<epl> E = a("village_snowy", "snowy_village", true, eof.w.ak, false, true);
   public static final jj<epl> F = a("village_taiga", "taiga_village", true, eof.w.ak, false, true);
   public static final jj<epl> G = a("jungle_temple", "jungle_temple", true, eof.w.ak, false, true);
   public static final jj<epl> H = a("swamp_hut", "swamp_hut", true, eof.w.ak, false, true);
   public static final jj<epl> I = a("trial_chambers", "trial_chambers", true, 12741452, false, true);

   public static jj<epl> a(jw<epl> $$0) {
      return a;
   }

   private static jj<epl> a(String $$0, String $$1, boolean $$2, boolean $$3) {
      return a($$0, $$1, $$2, -1, $$3, false);
   }

   private static jj<epl> a(String $$0, String $$1, boolean $$2, int $$3, boolean $$4, boolean $$5) {
      akj<epl> $$6 = akj.a(lr.aC, new akk($$0));
      epl $$7 = new epl(new akk($$1), $$2, $$3, $$5, $$4);
      return jw.b(lq.at, $$6, $$7);
   }
}

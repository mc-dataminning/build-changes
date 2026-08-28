public class epg {
   private static final int J = 12741452;
   public static final ji<epf> a = a("player", "player", false, true);
   public static final ji<epf> b = a("frame", "frame", true, true);
   public static final ji<epf> c = a("red_marker", "red_marker", false, true);
   public static final ji<epf> d = a("blue_marker", "blue_marker", false, true);
   public static final ji<epf> e = a("target_x", "target_x", true, false);
   public static final ji<epf> f = a("target_point", "target_point", true, false);
   public static final ji<epf> g = a("player_off_map", "player_off_map", false, true);
   public static final ji<epf> h = a("player_off_limits", "player_off_limits", false, true);
   public static final ji<epf> i = a("mansion", "woodland_mansion", true, 5393476, false, true);
   public static final ji<epf> j = a("monument", "ocean_monument", true, 3830373, false, true);
   public static final ji<epf> k = a("banner_white", "white_banner", true, true);
   public static final ji<epf> l = a("banner_orange", "orange_banner", true, true);
   public static final ji<epf> m = a("banner_magenta", "magenta_banner", true, true);
   public static final ji<epf> n = a("banner_light_blue", "light_blue_banner", true, true);
   public static final ji<epf> o = a("banner_yellow", "yellow_banner", true, true);
   public static final ji<epf> p = a("banner_lime", "lime_banner", true, true);
   public static final ji<epf> q = a("banner_pink", "pink_banner", true, true);
   public static final ji<epf> r = a("banner_gray", "gray_banner", true, true);
   public static final ji<epf> s = a("banner_light_gray", "light_gray_banner", true, true);
   public static final ji<epf> t = a("banner_cyan", "cyan_banner", true, true);
   public static final ji<epf> u = a("banner_purple", "purple_banner", true, true);
   public static final ji<epf> v = a("banner_blue", "blue_banner", true, true);
   public static final ji<epf> w = a("banner_brown", "brown_banner", true, true);
   public static final ji<epf> x = a("banner_green", "green_banner", true, true);
   public static final ji<epf> y = a("banner_red", "red_banner", true, true);
   public static final ji<epf> z = a("banner_black", "black_banner", true, true);
   public static final ji<epf> A = a("red_x", "red_x", true, false);
   public static final ji<epf> B = a("village_desert", "desert_village", true, enz.w.ak, false, true);
   public static final ji<epf> C = a("village_plains", "plains_village", true, enz.w.ak, false, true);
   public static final ji<epf> D = a("village_savanna", "savanna_village", true, enz.w.ak, false, true);
   public static final ji<epf> E = a("village_snowy", "snowy_village", true, enz.w.ak, false, true);
   public static final ji<epf> F = a("village_taiga", "taiga_village", true, enz.w.ak, false, true);
   public static final ji<epf> G = a("jungle_temple", "jungle_temple", true, enz.w.ak, false, true);
   public static final ji<epf> H = a("swamp_hut", "swamp_hut", true, enz.w.ak, false, true);
   public static final ji<epf> I = a("trial_chambers", "trial_chambers", true, 12741452, false, true);

   public static ji<epf> a(jv<epf> $$0) {
      return a;
   }

   private static ji<epf> a(String $$0, String $$1, boolean $$2, boolean $$3) {
      return a($$0, $$1, $$2, -1, $$3, false);
   }

   private static ji<epf> a(String $$0, String $$1, boolean $$2, int $$3, boolean $$4, boolean $$5) {
      ale<epf> $$6 = ale.a(lq.ay, new alf($$0));
      epf $$7 = new epf(new alf($$1), $$2, $$3, $$5, $$4);
      return jv.b(lp.av, $$6, $$7);
   }
}

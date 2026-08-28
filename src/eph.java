public class eph {
   private static final int J = 12741452;
   public static final ji<epg> a = a("player", "player", false, true);
   public static final ji<epg> b = a("frame", "frame", true, true);
   public static final ji<epg> c = a("red_marker", "red_marker", false, true);
   public static final ji<epg> d = a("blue_marker", "blue_marker", false, true);
   public static final ji<epg> e = a("target_x", "target_x", true, false);
   public static final ji<epg> f = a("target_point", "target_point", true, false);
   public static final ji<epg> g = a("player_off_map", "player_off_map", false, true);
   public static final ji<epg> h = a("player_off_limits", "player_off_limits", false, true);
   public static final ji<epg> i = a("mansion", "woodland_mansion", true, 5393476, false, true);
   public static final ji<epg> j = a("monument", "ocean_monument", true, 3830373, false, true);
   public static final ji<epg> k = a("banner_white", "white_banner", true, true);
   public static final ji<epg> l = a("banner_orange", "orange_banner", true, true);
   public static final ji<epg> m = a("banner_magenta", "magenta_banner", true, true);
   public static final ji<epg> n = a("banner_light_blue", "light_blue_banner", true, true);
   public static final ji<epg> o = a("banner_yellow", "yellow_banner", true, true);
   public static final ji<epg> p = a("banner_lime", "lime_banner", true, true);
   public static final ji<epg> q = a("banner_pink", "pink_banner", true, true);
   public static final ji<epg> r = a("banner_gray", "gray_banner", true, true);
   public static final ji<epg> s = a("banner_light_gray", "light_gray_banner", true, true);
   public static final ji<epg> t = a("banner_cyan", "cyan_banner", true, true);
   public static final ji<epg> u = a("banner_purple", "purple_banner", true, true);
   public static final ji<epg> v = a("banner_blue", "blue_banner", true, true);
   public static final ji<epg> w = a("banner_brown", "brown_banner", true, true);
   public static final ji<epg> x = a("banner_green", "green_banner", true, true);
   public static final ji<epg> y = a("banner_red", "red_banner", true, true);
   public static final ji<epg> z = a("banner_black", "black_banner", true, true);
   public static final ji<epg> A = a("red_x", "red_x", true, false);
   public static final ji<epg> B = a("village_desert", "desert_village", true, eoa.w.ak, false, true);
   public static final ji<epg> C = a("village_plains", "plains_village", true, eoa.w.ak, false, true);
   public static final ji<epg> D = a("village_savanna", "savanna_village", true, eoa.w.ak, false, true);
   public static final ji<epg> E = a("village_snowy", "snowy_village", true, eoa.w.ak, false, true);
   public static final ji<epg> F = a("village_taiga", "taiga_village", true, eoa.w.ak, false, true);
   public static final ji<epg> G = a("jungle_temple", "jungle_temple", true, eoa.w.ak, false, true);
   public static final ji<epg> H = a("swamp_hut", "swamp_hut", true, eoa.w.ak, false, true);
   public static final ji<epg> I = a("trial_chambers", "trial_chambers", true, 12741452, false, true);

   public static ji<epg> a(jv<epg> $$0) {
      return a;
   }

   private static ji<epg> a(String $$0, String $$1, boolean $$2, boolean $$3) {
      return a($$0, $$1, $$2, -1, $$3, false);
   }

   private static ji<epg> a(String $$0, String $$1, boolean $$2, int $$3, boolean $$4, boolean $$5) {
      ale<epg> $$6 = ale.a(lq.ay, new alf($$0));
      epg $$7 = new epg(new alf($$1), $$2, $$3, $$5, $$4);
      return jv.b(lp.av, $$6, $$7);
   }
}

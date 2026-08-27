import java.util.Map;
import javax.annotation.Nullable;

public class dgu {
   private static final String b = "decorated_pot_base";
   public static final ags<String> a = a("decorated_pot_base");
   private static final String c = "decorated_pot_side";
   private static final String d = "angler_pottery_pattern";
   private static final String e = "archer_pottery_pattern";
   private static final String f = "arms_up_pottery_pattern";
   private static final String g = "blade_pottery_pattern";
   private static final String h = "brewer_pottery_pattern";
   private static final String i = "burn_pottery_pattern";
   private static final String j = "danger_pottery_pattern";
   private static final String k = "explorer_pottery_pattern";
   private static final String l = "friend_pottery_pattern";
   private static final String m = "heart_pottery_pattern";
   private static final String n = "heartbreak_pottery_pattern";
   private static final String o = "howl_pottery_pattern";
   private static final String p = "miner_pottery_pattern";
   private static final String q = "mourner_pottery_pattern";
   private static final String r = "plenty_pottery_pattern";
   private static final String s = "prize_pottery_pattern";
   private static final String t = "sheaf_pottery_pattern";
   private static final String u = "shelter_pottery_pattern";
   private static final String v = "skull_pottery_pattern";
   private static final String w = "snort_pottery_pattern";
   private static final ags<String> x = a("decorated_pot_side");
   private static final ags<String> y = a("angler_pottery_pattern");
   private static final ags<String> z = a("archer_pottery_pattern");
   private static final ags<String> A = a("arms_up_pottery_pattern");
   private static final ags<String> B = a("blade_pottery_pattern");
   private static final ags<String> C = a("brewer_pottery_pattern");
   private static final ags<String> D = a("burn_pottery_pattern");
   private static final ags<String> E = a("danger_pottery_pattern");
   private static final ags<String> F = a("explorer_pottery_pattern");
   private static final ags<String> G = a("friend_pottery_pattern");
   private static final ags<String> H = a("heart_pottery_pattern");
   private static final ags<String> I = a("heartbreak_pottery_pattern");
   private static final ags<String> J = a("howl_pottery_pattern");
   private static final ags<String> K = a("miner_pottery_pattern");
   private static final ags<String> L = a("mourner_pottery_pattern");
   private static final ags<String> M = a("plenty_pottery_pattern");
   private static final ags<String> N = a("prize_pottery_pattern");
   private static final ags<String> O = a("sheaf_pottery_pattern");
   private static final ags<String> P = a("shelter_pottery_pattern");
   private static final ags<String> Q = a("skull_pottery_pattern");
   private static final ags<String> R = a("snort_pottery_pattern");
   private static final Map<cmc, ags<String>> S = Map.ofEntries(
      Map.entry(cmk.qI, x),
      Map.entry(cmk.xA, y),
      Map.entry(cmk.xB, z),
      Map.entry(cmk.xC, A),
      Map.entry(cmk.xD, B),
      Map.entry(cmk.xE, C),
      Map.entry(cmk.xF, D),
      Map.entry(cmk.xG, E),
      Map.entry(cmk.xH, F),
      Map.entry(cmk.xI, G),
      Map.entry(cmk.xJ, H),
      Map.entry(cmk.xK, I),
      Map.entry(cmk.xL, J),
      Map.entry(cmk.xM, K),
      Map.entry(cmk.xN, L),
      Map.entry(cmk.xO, M),
      Map.entry(cmk.xP, N),
      Map.entry(cmk.xQ, O),
      Map.entry(cmk.xR, P),
      Map.entry(cmk.xS, Q),
      Map.entry(cmk.xT, R)
   );

   private static ags<String> a(String $$0) {
      return ags.a(kc.ar, new agt($$0));
   }

   public static agt a(ags<String> $$0) {
      return $$0.a().d("entity/decorated_pot/");
   }

   @Nullable
   public static ags<String> a(cmc $$0) {
      return S.get($$0);
   }

   public static String a(ir<String> $$0) {
      ir.a($$0, x, "decorated_pot_side");
      ir.a($$0, y, "angler_pottery_pattern");
      ir.a($$0, z, "archer_pottery_pattern");
      ir.a($$0, A, "arms_up_pottery_pattern");
      ir.a($$0, B, "blade_pottery_pattern");
      ir.a($$0, C, "brewer_pottery_pattern");
      ir.a($$0, D, "burn_pottery_pattern");
      ir.a($$0, E, "danger_pottery_pattern");
      ir.a($$0, F, "explorer_pottery_pattern");
      ir.a($$0, G, "friend_pottery_pattern");
      ir.a($$0, H, "heart_pottery_pattern");
      ir.a($$0, I, "heartbreak_pottery_pattern");
      ir.a($$0, J, "howl_pottery_pattern");
      ir.a($$0, K, "miner_pottery_pattern");
      ir.a($$0, L, "mourner_pottery_pattern");
      ir.a($$0, M, "plenty_pottery_pattern");
      ir.a($$0, N, "prize_pottery_pattern");
      ir.a($$0, O, "sheaf_pottery_pattern");
      ir.a($$0, P, "shelter_pottery_pattern");
      ir.a($$0, Q, "skull_pottery_pattern");
      ir.a($$0, R, "snort_pottery_pattern");
      return ir.a($$0, a, "decorated_pot_base");
   }
}

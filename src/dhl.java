import java.util.Map;
import javax.annotation.Nullable;

public class dhl {
   private static final String b = "decorated_pot_base";
   public static final ahf<String> a = a("decorated_pot_base");
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
   private static final ahf<String> x = a("decorated_pot_side");
   private static final ahf<String> y = a("angler_pottery_pattern");
   private static final ahf<String> z = a("archer_pottery_pattern");
   private static final ahf<String> A = a("arms_up_pottery_pattern");
   private static final ahf<String> B = a("blade_pottery_pattern");
   private static final ahf<String> C = a("brewer_pottery_pattern");
   private static final ahf<String> D = a("burn_pottery_pattern");
   private static final ahf<String> E = a("danger_pottery_pattern");
   private static final ahf<String> F = a("explorer_pottery_pattern");
   private static final ahf<String> G = a("friend_pottery_pattern");
   private static final ahf<String> H = a("heart_pottery_pattern");
   private static final ahf<String> I = a("heartbreak_pottery_pattern");
   private static final ahf<String> J = a("howl_pottery_pattern");
   private static final ahf<String> K = a("miner_pottery_pattern");
   private static final ahf<String> L = a("mourner_pottery_pattern");
   private static final ahf<String> M = a("plenty_pottery_pattern");
   private static final ahf<String> N = a("prize_pottery_pattern");
   private static final ahf<String> O = a("sheaf_pottery_pattern");
   private static final ahf<String> P = a("shelter_pottery_pattern");
   private static final ahf<String> Q = a("skull_pottery_pattern");
   private static final ahf<String> R = a("snort_pottery_pattern");
   private static final Map<cms, ahf<String>> S = Map.ofEntries(
      Map.entry(cna.qI, x),
      Map.entry(cna.xA, y),
      Map.entry(cna.xB, z),
      Map.entry(cna.xC, A),
      Map.entry(cna.xD, B),
      Map.entry(cna.xE, C),
      Map.entry(cna.xF, D),
      Map.entry(cna.xG, E),
      Map.entry(cna.xH, F),
      Map.entry(cna.xI, G),
      Map.entry(cna.xJ, H),
      Map.entry(cna.xK, I),
      Map.entry(cna.xL, J),
      Map.entry(cna.xM, K),
      Map.entry(cna.xN, L),
      Map.entry(cna.xO, M),
      Map.entry(cna.xP, N),
      Map.entry(cna.xQ, O),
      Map.entry(cna.xR, P),
      Map.entry(cna.xS, Q),
      Map.entry(cna.xT, R)
   );

   private static ahf<String> a(String $$0) {
      return ahf.a(ke.ar, new ahg($$0));
   }

   public static ahg a(ahf<String> $$0) {
      return $$0.a().d("entity/decorated_pot/");
   }

   @Nullable
   public static ahf<String> a(cms $$0) {
      return S.get($$0);
   }

   public static String a(it<String> $$0) {
      it.a($$0, x, "decorated_pot_side");
      it.a($$0, y, "angler_pottery_pattern");
      it.a($$0, z, "archer_pottery_pattern");
      it.a($$0, A, "arms_up_pottery_pattern");
      it.a($$0, B, "blade_pottery_pattern");
      it.a($$0, C, "brewer_pottery_pattern");
      it.a($$0, D, "burn_pottery_pattern");
      it.a($$0, E, "danger_pottery_pattern");
      it.a($$0, F, "explorer_pottery_pattern");
      it.a($$0, G, "friend_pottery_pattern");
      it.a($$0, H, "heart_pottery_pattern");
      it.a($$0, I, "heartbreak_pottery_pattern");
      it.a($$0, J, "howl_pottery_pattern");
      it.a($$0, K, "miner_pottery_pattern");
      it.a($$0, L, "mourner_pottery_pattern");
      it.a($$0, M, "plenty_pottery_pattern");
      it.a($$0, N, "prize_pottery_pattern");
      it.a($$0, O, "sheaf_pottery_pattern");
      it.a($$0, P, "shelter_pottery_pattern");
      it.a($$0, Q, "skull_pottery_pattern");
      it.a($$0, R, "snort_pottery_pattern");
      return it.a($$0, a, "decorated_pot_base");
   }
}

import java.util.Map;
import javax.annotation.Nullable;

public class dfi {
   private static final String b = "decorated_pot_base";
   public static final agf<String> a = a("decorated_pot_base");
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
   private static final agf<String> x = a("decorated_pot_side");
   private static final agf<String> y = a("angler_pottery_pattern");
   private static final agf<String> z = a("archer_pottery_pattern");
   private static final agf<String> A = a("arms_up_pottery_pattern");
   private static final agf<String> B = a("blade_pottery_pattern");
   private static final agf<String> C = a("brewer_pottery_pattern");
   private static final agf<String> D = a("burn_pottery_pattern");
   private static final agf<String> E = a("danger_pottery_pattern");
   private static final agf<String> F = a("explorer_pottery_pattern");
   private static final agf<String> G = a("friend_pottery_pattern");
   private static final agf<String> H = a("heart_pottery_pattern");
   private static final agf<String> I = a("heartbreak_pottery_pattern");
   private static final agf<String> J = a("howl_pottery_pattern");
   private static final agf<String> K = a("miner_pottery_pattern");
   private static final agf<String> L = a("mourner_pottery_pattern");
   private static final agf<String> M = a("plenty_pottery_pattern");
   private static final agf<String> N = a("prize_pottery_pattern");
   private static final agf<String> O = a("sheaf_pottery_pattern");
   private static final agf<String> P = a("shelter_pottery_pattern");
   private static final agf<String> Q = a("skull_pottery_pattern");
   private static final agf<String> R = a("snort_pottery_pattern");
   private static final Map<ckw, agf<String>> S = Map.ofEntries(
      Map.entry(cle.pX, x),
      Map.entry(cle.wO, y),
      Map.entry(cle.wP, z),
      Map.entry(cle.wQ, A),
      Map.entry(cle.wR, B),
      Map.entry(cle.wS, C),
      Map.entry(cle.wT, D),
      Map.entry(cle.wU, E),
      Map.entry(cle.wV, F),
      Map.entry(cle.wW, G),
      Map.entry(cle.wX, H),
      Map.entry(cle.wY, I),
      Map.entry(cle.wZ, J),
      Map.entry(cle.xa, K),
      Map.entry(cle.xb, L),
      Map.entry(cle.xc, M),
      Map.entry(cle.xd, N),
      Map.entry(cle.xe, O),
      Map.entry(cle.xf, P),
      Map.entry(cle.xg, Q),
      Map.entry(cle.xh, R)
   );

   private static agf<String> a(String $$0) {
      return agf.a(jz.aq, new agg($$0));
   }

   public static agg a(agf<String> $$0) {
      return $$0.a().d("entity/decorated_pot/");
   }

   @Nullable
   public static agf<String> a(ckw $$0) {
      return S.get($$0);
   }

   public static String a(io<String> $$0) {
      io.a($$0, x, "decorated_pot_side");
      io.a($$0, y, "angler_pottery_pattern");
      io.a($$0, z, "archer_pottery_pattern");
      io.a($$0, A, "arms_up_pottery_pattern");
      io.a($$0, B, "blade_pottery_pattern");
      io.a($$0, C, "brewer_pottery_pattern");
      io.a($$0, D, "burn_pottery_pattern");
      io.a($$0, E, "danger_pottery_pattern");
      io.a($$0, F, "explorer_pottery_pattern");
      io.a($$0, G, "friend_pottery_pattern");
      io.a($$0, H, "heart_pottery_pattern");
      io.a($$0, I, "heartbreak_pottery_pattern");
      io.a($$0, J, "howl_pottery_pattern");
      io.a($$0, K, "miner_pottery_pattern");
      io.a($$0, L, "mourner_pottery_pattern");
      io.a($$0, M, "plenty_pottery_pattern");
      io.a($$0, N, "prize_pottery_pattern");
      io.a($$0, O, "sheaf_pottery_pattern");
      io.a($$0, P, "shelter_pottery_pattern");
      io.a($$0, Q, "skull_pottery_pattern");
      io.a($$0, R, "snort_pottery_pattern");
      return io.a($$0, a, "decorated_pot_base");
   }
}

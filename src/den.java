import java.util.Map;
import javax.annotation.Nullable;

public class den {
   private static final String b = "decorated_pot_base";
   public static final afv<String> a = a("decorated_pot_base");
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
   private static final afv<String> x = a("decorated_pot_side");
   private static final afv<String> y = a("angler_pottery_pattern");
   private static final afv<String> z = a("archer_pottery_pattern");
   private static final afv<String> A = a("arms_up_pottery_pattern");
   private static final afv<String> B = a("blade_pottery_pattern");
   private static final afv<String> C = a("brewer_pottery_pattern");
   private static final afv<String> D = a("burn_pottery_pattern");
   private static final afv<String> E = a("danger_pottery_pattern");
   private static final afv<String> F = a("explorer_pottery_pattern");
   private static final afv<String> G = a("friend_pottery_pattern");
   private static final afv<String> H = a("heart_pottery_pattern");
   private static final afv<String> I = a("heartbreak_pottery_pattern");
   private static final afv<String> J = a("howl_pottery_pattern");
   private static final afv<String> K = a("miner_pottery_pattern");
   private static final afv<String> L = a("mourner_pottery_pattern");
   private static final afv<String> M = a("plenty_pottery_pattern");
   private static final afv<String> N = a("prize_pottery_pattern");
   private static final afv<String> O = a("sheaf_pottery_pattern");
   private static final afv<String> P = a("shelter_pottery_pattern");
   private static final afv<String> Q = a("skull_pottery_pattern");
   private static final afv<String> R = a("snort_pottery_pattern");
   private static final Map<cke, afv<String>> S = Map.ofEntries(
      Map.entry(ckm.pX, x),
      Map.entry(ckm.wN, y),
      Map.entry(ckm.wO, z),
      Map.entry(ckm.wP, A),
      Map.entry(ckm.wQ, B),
      Map.entry(ckm.wR, C),
      Map.entry(ckm.wS, D),
      Map.entry(ckm.wT, E),
      Map.entry(ckm.wU, F),
      Map.entry(ckm.wV, G),
      Map.entry(ckm.wW, H),
      Map.entry(ckm.wX, I),
      Map.entry(ckm.wY, J),
      Map.entry(ckm.wZ, K),
      Map.entry(ckm.xa, L),
      Map.entry(ckm.xb, M),
      Map.entry(ckm.xc, N),
      Map.entry(ckm.xd, O),
      Map.entry(ckm.xe, P),
      Map.entry(ckm.xf, Q),
      Map.entry(ckm.xg, R)
   );

   private static afv<String> a(String $$0) {
      return afv.a(jz.ap, new afw($$0));
   }

   public static afw a(afv<String> $$0) {
      return $$0.a().d("entity/decorated_pot/");
   }

   @Nullable
   public static afv<String> a(cke $$0) {
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

import javax.annotation.Nullable;

public final class fnv {
   public static final fnv a = a("all");
   public static final fnv b = a("texture", a);
   public static final fnv c = a("particle", b);
   public static final fnv d = a("end", a);
   public static final fnv e = a("bottom", d);
   public static final fnv f = a("top", d);
   public static final fnv g = a("front", a);
   public static final fnv h = a("back", a);
   public static final fnv i = a("side", a);
   public static final fnv j = a("north", i);
   public static final fnv k = a("south", i);
   public static final fnv l = a("east", i);
   public static final fnv m = a("west", i);
   public static final fnv n = a("up");
   public static final fnv o = a("down");
   public static final fnv p = a("cross");
   public static final fnv q = a("cross_emissive");
   public static final fnv r = a("plant");
   public static final fnv s = a("wall", a);
   public static final fnv t = a("rail");
   public static final fnv u = a("wool");
   public static final fnv v = a("pattern");
   public static final fnv w = a("pane");
   public static final fnv x = a("edge");
   public static final fnv y = a("fan");
   public static final fnv z = a("stem");
   public static final fnv A = a("upperstem");
   public static final fnv B = a("crop");
   public static final fnv C = a("dirt");
   public static final fnv D = a("fire");
   public static final fnv E = a("lantern");
   public static final fnv F = a("platform");
   public static final fnv G = a("unsticky");
   public static final fnv H = a("torch");
   public static final fnv I = a("layer0");
   public static final fnv J = a("layer1");
   public static final fnv K = a("layer2");
   public static final fnv L = a("lit_log");
   public static final fnv M = a("candle");
   public static final fnv N = a("inside");
   public static final fnv O = a("content");
   public static final fnv P = a("inner_top");
   public static final fnv Q = a("flowerbed");
   private final String R;
   @Nullable
   private final fnv S;

   private static fnv a(String $$0) {
      return new fnv($$0, null);
   }

   private static fnv a(String $$0, fnv $$1) {
      return new fnv($$0, $$1);
   }

   private fnv(String $$0, @Nullable fnv $$1) {
      this.R = $$0;
      this.S = $$1;
   }

   public String a() {
      return this.R;
   }

   @Nullable
   public fnv b() {
      return this.S;
   }

   @Override
   public String toString() {
      return "#" + this.R;
   }
}

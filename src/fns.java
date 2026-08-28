import javax.annotation.Nullable;

public final class fns {
   public static final fns a = a("all");
   public static final fns b = a("texture", a);
   public static final fns c = a("particle", b);
   public static final fns d = a("end", a);
   public static final fns e = a("bottom", d);
   public static final fns f = a("top", d);
   public static final fns g = a("front", a);
   public static final fns h = a("back", a);
   public static final fns i = a("side", a);
   public static final fns j = a("north", i);
   public static final fns k = a("south", i);
   public static final fns l = a("east", i);
   public static final fns m = a("west", i);
   public static final fns n = a("up");
   public static final fns o = a("down");
   public static final fns p = a("cross");
   public static final fns q = a("cross_emissive");
   public static final fns r = a("plant");
   public static final fns s = a("wall", a);
   public static final fns t = a("rail");
   public static final fns u = a("wool");
   public static final fns v = a("pattern");
   public static final fns w = a("pane");
   public static final fns x = a("edge");
   public static final fns y = a("fan");
   public static final fns z = a("stem");
   public static final fns A = a("upperstem");
   public static final fns B = a("crop");
   public static final fns C = a("dirt");
   public static final fns D = a("fire");
   public static final fns E = a("lantern");
   public static final fns F = a("platform");
   public static final fns G = a("unsticky");
   public static final fns H = a("torch");
   public static final fns I = a("layer0");
   public static final fns J = a("layer1");
   public static final fns K = a("layer2");
   public static final fns L = a("lit_log");
   public static final fns M = a("candle");
   public static final fns N = a("inside");
   public static final fns O = a("content");
   public static final fns P = a("inner_top");
   public static final fns Q = a("flowerbed");
   private final String R;
   @Nullable
   private final fns S;

   private static fns a(String $$0) {
      return new fns($$0, null);
   }

   private static fns a(String $$0, fns $$1) {
      return new fns($$0, $$1);
   }

   private fns(String $$0, @Nullable fns $$1) {
      this.R = $$0;
      this.S = $$1;
   }

   public String a() {
      return this.R;
   }

   @Nullable
   public fns b() {
      return this.S;
   }

   @Override
   public String toString() {
      return "#" + this.R;
   }
}

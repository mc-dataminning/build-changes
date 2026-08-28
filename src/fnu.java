import javax.annotation.Nullable;

public final class fnu {
   public static final fnu a = a("all");
   public static final fnu b = a("texture", a);
   public static final fnu c = a("particle", b);
   public static final fnu d = a("end", a);
   public static final fnu e = a("bottom", d);
   public static final fnu f = a("top", d);
   public static final fnu g = a("front", a);
   public static final fnu h = a("back", a);
   public static final fnu i = a("side", a);
   public static final fnu j = a("north", i);
   public static final fnu k = a("south", i);
   public static final fnu l = a("east", i);
   public static final fnu m = a("west", i);
   public static final fnu n = a("up");
   public static final fnu o = a("down");
   public static final fnu p = a("cross");
   public static final fnu q = a("cross_emissive");
   public static final fnu r = a("plant");
   public static final fnu s = a("wall", a);
   public static final fnu t = a("rail");
   public static final fnu u = a("wool");
   public static final fnu v = a("pattern");
   public static final fnu w = a("pane");
   public static final fnu x = a("edge");
   public static final fnu y = a("fan");
   public static final fnu z = a("stem");
   public static final fnu A = a("upperstem");
   public static final fnu B = a("crop");
   public static final fnu C = a("dirt");
   public static final fnu D = a("fire");
   public static final fnu E = a("lantern");
   public static final fnu F = a("platform");
   public static final fnu G = a("unsticky");
   public static final fnu H = a("torch");
   public static final fnu I = a("layer0");
   public static final fnu J = a("layer1");
   public static final fnu K = a("layer2");
   public static final fnu L = a("lit_log");
   public static final fnu M = a("candle");
   public static final fnu N = a("inside");
   public static final fnu O = a("content");
   public static final fnu P = a("inner_top");
   public static final fnu Q = a("flowerbed");
   private final String R;
   @Nullable
   private final fnu S;

   private static fnu a(String $$0) {
      return new fnu($$0, null);
   }

   private static fnu a(String $$0, fnu $$1) {
      return new fnu($$0, $$1);
   }

   private fnu(String $$0, @Nullable fnu $$1) {
      this.R = $$0;
      this.S = $$1;
   }

   public String a() {
      return this.R;
   }

   @Nullable
   public fnu b() {
      return this.S;
   }

   @Override
   public String toString() {
      return "#" + this.R;
   }
}

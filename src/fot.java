import javax.annotation.Nullable;

public final class fot {
   public static final fot a = a("all");
   public static final fot b = a("texture", a);
   public static final fot c = a("particle", b);
   public static final fot d = a("end", a);
   public static final fot e = a("bottom", d);
   public static final fot f = a("top", d);
   public static final fot g = a("front", a);
   public static final fot h = a("back", a);
   public static final fot i = a("side", a);
   public static final fot j = a("north", i);
   public static final fot k = a("south", i);
   public static final fot l = a("east", i);
   public static final fot m = a("west", i);
   public static final fot n = a("up");
   public static final fot o = a("down");
   public static final fot p = a("cross");
   public static final fot q = a("cross_emissive");
   public static final fot r = a("plant");
   public static final fot s = a("wall", a);
   public static final fot t = a("rail");
   public static final fot u = a("wool");
   public static final fot v = a("pattern");
   public static final fot w = a("pane");
   public static final fot x = a("edge");
   public static final fot y = a("fan");
   public static final fot z = a("stem");
   public static final fot A = a("upperstem");
   public static final fot B = a("crop");
   public static final fot C = a("dirt");
   public static final fot D = a("fire");
   public static final fot E = a("lantern");
   public static final fot F = a("platform");
   public static final fot G = a("unsticky");
   public static final fot H = a("torch");
   public static final fot I = a("layer0");
   public static final fot J = a("layer1");
   public static final fot K = a("layer2");
   public static final fot L = a("lit_log");
   public static final fot M = a("candle");
   public static final fot N = a("inside");
   public static final fot O = a("content");
   public static final fot P = a("inner_top");
   public static final fot Q = a("flowerbed");
   private final String R;
   @Nullable
   private final fot S;

   private static fot a(String $$0) {
      return new fot($$0, null);
   }

   private static fot a(String $$0, fot $$1) {
      return new fot($$0, $$1);
   }

   private fot(String $$0, @Nullable fot $$1) {
      this.R = $$0;
      this.S = $$1;
   }

   public String a() {
      return this.R;
   }

   @Nullable
   public fot b() {
      return this.S;
   }

   @Override
   public String toString() {
      return "#" + this.R;
   }
}

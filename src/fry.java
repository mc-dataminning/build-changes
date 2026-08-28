import javax.annotation.Nullable;

public final class fry {
   public static final fry a = a("all");
   public static final fry b = a("texture", a);
   public static final fry c = a("particle", b);
   public static final fry d = a("end", a);
   public static final fry e = a("bottom", d);
   public static final fry f = a("top", d);
   public static final fry g = a("front", a);
   public static final fry h = a("back", a);
   public static final fry i = a("side", a);
   public static final fry j = a("north", i);
   public static final fry k = a("south", i);
   public static final fry l = a("east", i);
   public static final fry m = a("west", i);
   public static final fry n = a("up");
   public static final fry o = a("down");
   public static final fry p = a("cross");
   public static final fry q = a("cross_emissive");
   public static final fry r = a("plant");
   public static final fry s = a("wall", a);
   public static final fry t = a("rail");
   public static final fry u = a("wool");
   public static final fry v = a("pattern");
   public static final fry w = a("pane");
   public static final fry x = a("edge");
   public static final fry y = a("fan");
   public static final fry z = a("stem");
   public static final fry A = a("upperstem");
   public static final fry B = a("crop");
   public static final fry C = a("dirt");
   public static final fry D = a("fire");
   public static final fry E = a("lantern");
   public static final fry F = a("platform");
   public static final fry G = a("unsticky");
   public static final fry H = a("torch");
   public static final fry I = a("layer0");
   public static final fry J = a("layer1");
   public static final fry K = a("layer2");
   public static final fry L = a("lit_log");
   public static final fry M = a("candle");
   public static final fry N = a("inside");
   public static final fry O = a("content");
   public static final fry P = a("inner_top");
   public static final fry Q = a("flowerbed");
   private final String R;
   @Nullable
   private final fry S;

   private static fry a(String $$0) {
      return new fry($$0, null);
   }

   private static fry a(String $$0, fry $$1) {
      return new fry($$0, $$1);
   }

   private fry(String $$0, @Nullable fry $$1) {
      this.R = $$0;
      this.S = $$1;
   }

   public String a() {
      return this.R;
   }

   @Nullable
   public fry b() {
      return this.S;
   }

   @Override
   public String toString() {
      return "#" + this.R;
   }
}

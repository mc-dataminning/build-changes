import javax.annotation.Nullable;

public final class fpq {
   public static final fpq a = a("all");
   public static final fpq b = a("texture", a);
   public static final fpq c = a("particle", b);
   public static final fpq d = a("end", a);
   public static final fpq e = a("bottom", d);
   public static final fpq f = a("top", d);
   public static final fpq g = a("front", a);
   public static final fpq h = a("back", a);
   public static final fpq i = a("side", a);
   public static final fpq j = a("north", i);
   public static final fpq k = a("south", i);
   public static final fpq l = a("east", i);
   public static final fpq m = a("west", i);
   public static final fpq n = a("up");
   public static final fpq o = a("down");
   public static final fpq p = a("cross");
   public static final fpq q = a("cross_emissive");
   public static final fpq r = a("plant");
   public static final fpq s = a("wall", a);
   public static final fpq t = a("rail");
   public static final fpq u = a("wool");
   public static final fpq v = a("pattern");
   public static final fpq w = a("pane");
   public static final fpq x = a("edge");
   public static final fpq y = a("fan");
   public static final fpq z = a("stem");
   public static final fpq A = a("upperstem");
   public static final fpq B = a("crop");
   public static final fpq C = a("dirt");
   public static final fpq D = a("fire");
   public static final fpq E = a("lantern");
   public static final fpq F = a("platform");
   public static final fpq G = a("unsticky");
   public static final fpq H = a("torch");
   public static final fpq I = a("layer0");
   public static final fpq J = a("layer1");
   public static final fpq K = a("layer2");
   public static final fpq L = a("lit_log");
   public static final fpq M = a("candle");
   public static final fpq N = a("inside");
   public static final fpq O = a("content");
   public static final fpq P = a("inner_top");
   public static final fpq Q = a("flowerbed");
   private final String R;
   @Nullable
   private final fpq S;

   private static fpq a(String $$0) {
      return new fpq($$0, null);
   }

   private static fpq a(String $$0, fpq $$1) {
      return new fpq($$0, $$1);
   }

   private fpq(String $$0, @Nullable fpq $$1) {
      this.R = $$0;
      this.S = $$1;
   }

   public String a() {
      return this.R;
   }

   @Nullable
   public fpq b() {
      return this.S;
   }

   @Override
   public String toString() {
      return "#" + this.R;
   }
}

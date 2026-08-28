import javax.annotation.Nullable;

public final class ftq {
   public static final ftq a = a("all");
   public static final ftq b = a("texture", a);
   public static final ftq c = a("particle", b);
   public static final ftq d = a("end", a);
   public static final ftq e = a("bottom", d);
   public static final ftq f = a("top", d);
   public static final ftq g = a("front", a);
   public static final ftq h = a("back", a);
   public static final ftq i = a("side", a);
   public static final ftq j = a("north", i);
   public static final ftq k = a("south", i);
   public static final ftq l = a("east", i);
   public static final ftq m = a("west", i);
   public static final ftq n = a("up");
   public static final ftq o = a("down");
   public static final ftq p = a("cross");
   public static final ftq q = a("cross_emissive");
   public static final ftq r = a("plant");
   public static final ftq s = a("wall", a);
   public static final ftq t = a("rail");
   public static final ftq u = a("wool");
   public static final ftq v = a("pattern");
   public static final ftq w = a("pane");
   public static final ftq x = a("edge");
   public static final ftq y = a("fan");
   public static final ftq z = a("stem");
   public static final ftq A = a("upperstem");
   public static final ftq B = a("crop");
   public static final ftq C = a("dirt");
   public static final ftq D = a("fire");
   public static final ftq E = a("lantern");
   public static final ftq F = a("platform");
   public static final ftq G = a("unsticky");
   public static final ftq H = a("torch");
   public static final ftq I = a("layer0");
   public static final ftq J = a("layer1");
   public static final ftq K = a("layer2");
   public static final ftq L = a("lit_log");
   public static final ftq M = a("candle");
   public static final ftq N = a("inside");
   public static final ftq O = a("content");
   public static final ftq P = a("inner_top");
   public static final ftq Q = a("flowerbed");
   private final String R;
   @Nullable
   private final ftq S;

   private static ftq a(String $$0) {
      return new ftq($$0, null);
   }

   private static ftq a(String $$0, ftq $$1) {
      return new ftq($$0, $$1);
   }

   private ftq(String $$0, @Nullable ftq $$1) {
      this.R = $$0;
      this.S = $$1;
   }

   public String a() {
      return this.R;
   }

   @Nullable
   public ftq b() {
      return this.S;
   }

   @Override
   public String toString() {
      return "#" + this.R;
   }
}

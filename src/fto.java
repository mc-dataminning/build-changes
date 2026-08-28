import javax.annotation.Nullable;

public final class fto {
   public static final fto a = a("all");
   public static final fto b = a("texture", a);
   public static final fto c = a("particle", b);
   public static final fto d = a("end", a);
   public static final fto e = a("bottom", d);
   public static final fto f = a("top", d);
   public static final fto g = a("front", a);
   public static final fto h = a("back", a);
   public static final fto i = a("side", a);
   public static final fto j = a("north", i);
   public static final fto k = a("south", i);
   public static final fto l = a("east", i);
   public static final fto m = a("west", i);
   public static final fto n = a("up");
   public static final fto o = a("down");
   public static final fto p = a("cross");
   public static final fto q = a("cross_emissive");
   public static final fto r = a("plant");
   public static final fto s = a("wall", a);
   public static final fto t = a("rail");
   public static final fto u = a("wool");
   public static final fto v = a("pattern");
   public static final fto w = a("pane");
   public static final fto x = a("edge");
   public static final fto y = a("fan");
   public static final fto z = a("stem");
   public static final fto A = a("upperstem");
   public static final fto B = a("crop");
   public static final fto C = a("dirt");
   public static final fto D = a("fire");
   public static final fto E = a("lantern");
   public static final fto F = a("platform");
   public static final fto G = a("unsticky");
   public static final fto H = a("torch");
   public static final fto I = a("layer0");
   public static final fto J = a("layer1");
   public static final fto K = a("layer2");
   public static final fto L = a("lit_log");
   public static final fto M = a("candle");
   public static final fto N = a("inside");
   public static final fto O = a("content");
   public static final fto P = a("inner_top");
   public static final fto Q = a("flowerbed");
   private final String R;
   @Nullable
   private final fto S;

   private static fto a(String $$0) {
      return new fto($$0, null);
   }

   private static fto a(String $$0, fto $$1) {
      return new fto($$0, $$1);
   }

   private fto(String $$0, @Nullable fto $$1) {
      this.R = $$0;
      this.S = $$1;
   }

   public String a() {
      return this.R;
   }

   @Nullable
   public fto b() {
      return this.S;
   }

   @Override
   public String toString() {
      return "#" + this.R;
   }
}

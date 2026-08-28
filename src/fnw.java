import javax.annotation.Nullable;

public final class fnw {
   public static final fnw a = a("all");
   public static final fnw b = a("texture", a);
   public static final fnw c = a("particle", b);
   public static final fnw d = a("end", a);
   public static final fnw e = a("bottom", d);
   public static final fnw f = a("top", d);
   public static final fnw g = a("front", a);
   public static final fnw h = a("back", a);
   public static final fnw i = a("side", a);
   public static final fnw j = a("north", i);
   public static final fnw k = a("south", i);
   public static final fnw l = a("east", i);
   public static final fnw m = a("west", i);
   public static final fnw n = a("up");
   public static final fnw o = a("down");
   public static final fnw p = a("cross");
   public static final fnw q = a("cross_emissive");
   public static final fnw r = a("plant");
   public static final fnw s = a("wall", a);
   public static final fnw t = a("rail");
   public static final fnw u = a("wool");
   public static final fnw v = a("pattern");
   public static final fnw w = a("pane");
   public static final fnw x = a("edge");
   public static final fnw y = a("fan");
   public static final fnw z = a("stem");
   public static final fnw A = a("upperstem");
   public static final fnw B = a("crop");
   public static final fnw C = a("dirt");
   public static final fnw D = a("fire");
   public static final fnw E = a("lantern");
   public static final fnw F = a("platform");
   public static final fnw G = a("unsticky");
   public static final fnw H = a("torch");
   public static final fnw I = a("layer0");
   public static final fnw J = a("layer1");
   public static final fnw K = a("layer2");
   public static final fnw L = a("lit_log");
   public static final fnw M = a("candle");
   public static final fnw N = a("inside");
   public static final fnw O = a("content");
   public static final fnw P = a("inner_top");
   public static final fnw Q = a("flowerbed");
   private final String R;
   @Nullable
   private final fnw S;

   private static fnw a(String $$0) {
      return new fnw($$0, null);
   }

   private static fnw a(String $$0, fnw $$1) {
      return new fnw($$0, $$1);
   }

   private fnw(String $$0, @Nullable fnw $$1) {
      this.R = $$0;
      this.S = $$1;
   }

   public String a() {
      return this.R;
   }

   @Nullable
   public fnw b() {
      return this.S;
   }

   @Override
   public String toString() {
      return "#" + this.R;
   }
}

import javax.annotation.Nullable;

public final class frm {
   public static final frm a = a("all");
   public static final frm b = a("texture", a);
   public static final frm c = a("particle", b);
   public static final frm d = a("end", a);
   public static final frm e = a("bottom", d);
   public static final frm f = a("top", d);
   public static final frm g = a("front", a);
   public static final frm h = a("back", a);
   public static final frm i = a("side", a);
   public static final frm j = a("north", i);
   public static final frm k = a("south", i);
   public static final frm l = a("east", i);
   public static final frm m = a("west", i);
   public static final frm n = a("up");
   public static final frm o = a("down");
   public static final frm p = a("cross");
   public static final frm q = a("cross_emissive");
   public static final frm r = a("plant");
   public static final frm s = a("wall", a);
   public static final frm t = a("rail");
   public static final frm u = a("wool");
   public static final frm v = a("pattern");
   public static final frm w = a("pane");
   public static final frm x = a("edge");
   public static final frm y = a("fan");
   public static final frm z = a("stem");
   public static final frm A = a("upperstem");
   public static final frm B = a("crop");
   public static final frm C = a("dirt");
   public static final frm D = a("fire");
   public static final frm E = a("lantern");
   public static final frm F = a("platform");
   public static final frm G = a("unsticky");
   public static final frm H = a("torch");
   public static final frm I = a("layer0");
   public static final frm J = a("layer1");
   public static final frm K = a("layer2");
   public static final frm L = a("lit_log");
   public static final frm M = a("candle");
   public static final frm N = a("inside");
   public static final frm O = a("content");
   public static final frm P = a("inner_top");
   public static final frm Q = a("flowerbed");
   private final String R;
   @Nullable
   private final frm S;

   private static frm a(String $$0) {
      return new frm($$0, null);
   }

   private static frm a(String $$0, frm $$1) {
      return new frm($$0, $$1);
   }

   private frm(String $$0, @Nullable frm $$1) {
      this.R = $$0;
      this.S = $$1;
   }

   public String a() {
      return this.R;
   }

   @Nullable
   public frm b() {
      return this.S;
   }

   @Override
   public String toString() {
      return "#" + this.R;
   }
}

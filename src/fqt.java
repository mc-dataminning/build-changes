import javax.annotation.Nullable;

public final class fqt {
   public static final fqt a = a("all");
   public static final fqt b = a("texture", a);
   public static final fqt c = a("particle", b);
   public static final fqt d = a("end", a);
   public static final fqt e = a("bottom", d);
   public static final fqt f = a("top", d);
   public static final fqt g = a("front", a);
   public static final fqt h = a("back", a);
   public static final fqt i = a("side", a);
   public static final fqt j = a("north", i);
   public static final fqt k = a("south", i);
   public static final fqt l = a("east", i);
   public static final fqt m = a("west", i);
   public static final fqt n = a("up");
   public static final fqt o = a("down");
   public static final fqt p = a("cross");
   public static final fqt q = a("cross_emissive");
   public static final fqt r = a("plant");
   public static final fqt s = a("wall", a);
   public static final fqt t = a("rail");
   public static final fqt u = a("wool");
   public static final fqt v = a("pattern");
   public static final fqt w = a("pane");
   public static final fqt x = a("edge");
   public static final fqt y = a("fan");
   public static final fqt z = a("stem");
   public static final fqt A = a("upperstem");
   public static final fqt B = a("crop");
   public static final fqt C = a("dirt");
   public static final fqt D = a("fire");
   public static final fqt E = a("lantern");
   public static final fqt F = a("platform");
   public static final fqt G = a("unsticky");
   public static final fqt H = a("torch");
   public static final fqt I = a("layer0");
   public static final fqt J = a("layer1");
   public static final fqt K = a("layer2");
   public static final fqt L = a("lit_log");
   public static final fqt M = a("candle");
   public static final fqt N = a("inside");
   public static final fqt O = a("content");
   public static final fqt P = a("inner_top");
   public static final fqt Q = a("flowerbed");
   private final String R;
   @Nullable
   private final fqt S;

   private static fqt a(String $$0) {
      return new fqt($$0, null);
   }

   private static fqt a(String $$0, fqt $$1) {
      return new fqt($$0, $$1);
   }

   private fqt(String $$0, @Nullable fqt $$1) {
      this.R = $$0;
      this.S = $$1;
   }

   public String a() {
      return this.R;
   }

   @Nullable
   public fqt b() {
      return this.S;
   }

   @Override
   public String toString() {
      return "#" + this.R;
   }
}

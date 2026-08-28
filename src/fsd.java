import javax.annotation.Nullable;

public final class fsd {
   public static final fsd a = a("all");
   public static final fsd b = a("texture", a);
   public static final fsd c = a("particle", b);
   public static final fsd d = a("end", a);
   public static final fsd e = a("bottom", d);
   public static final fsd f = a("top", d);
   public static final fsd g = a("front", a);
   public static final fsd h = a("back", a);
   public static final fsd i = a("side", a);
   public static final fsd j = a("north", i);
   public static final fsd k = a("south", i);
   public static final fsd l = a("east", i);
   public static final fsd m = a("west", i);
   public static final fsd n = a("up");
   public static final fsd o = a("down");
   public static final fsd p = a("cross");
   public static final fsd q = a("cross_emissive");
   public static final fsd r = a("plant");
   public static final fsd s = a("wall", a);
   public static final fsd t = a("rail");
   public static final fsd u = a("wool");
   public static final fsd v = a("pattern");
   public static final fsd w = a("pane");
   public static final fsd x = a("edge");
   public static final fsd y = a("fan");
   public static final fsd z = a("stem");
   public static final fsd A = a("upperstem");
   public static final fsd B = a("crop");
   public static final fsd C = a("dirt");
   public static final fsd D = a("fire");
   public static final fsd E = a("lantern");
   public static final fsd F = a("platform");
   public static final fsd G = a("unsticky");
   public static final fsd H = a("torch");
   public static final fsd I = a("layer0");
   public static final fsd J = a("layer1");
   public static final fsd K = a("layer2");
   public static final fsd L = a("lit_log");
   public static final fsd M = a("candle");
   public static final fsd N = a("inside");
   public static final fsd O = a("content");
   public static final fsd P = a("inner_top");
   public static final fsd Q = a("flowerbed");
   private final String R;
   @Nullable
   private final fsd S;

   private static fsd a(String $$0) {
      return new fsd($$0, null);
   }

   private static fsd a(String $$0, fsd $$1) {
      return new fsd($$0, $$1);
   }

   private fsd(String $$0, @Nullable fsd $$1) {
      this.R = $$0;
      this.S = $$1;
   }

   public String a() {
      return this.R;
   }

   @Nullable
   public fsd b() {
      return this.S;
   }

   @Override
   public String toString() {
      return "#" + this.R;
   }
}

import javax.annotation.Nullable;

public final class frf {
   public static final frf a = a("all");
   public static final frf b = a("texture", a);
   public static final frf c = a("particle", b);
   public static final frf d = a("end", a);
   public static final frf e = a("bottom", d);
   public static final frf f = a("top", d);
   public static final frf g = a("front", a);
   public static final frf h = a("back", a);
   public static final frf i = a("side", a);
   public static final frf j = a("north", i);
   public static final frf k = a("south", i);
   public static final frf l = a("east", i);
   public static final frf m = a("west", i);
   public static final frf n = a("up");
   public static final frf o = a("down");
   public static final frf p = a("cross");
   public static final frf q = a("cross_emissive");
   public static final frf r = a("plant");
   public static final frf s = a("wall", a);
   public static final frf t = a("rail");
   public static final frf u = a("wool");
   public static final frf v = a("pattern");
   public static final frf w = a("pane");
   public static final frf x = a("edge");
   public static final frf y = a("fan");
   public static final frf z = a("stem");
   public static final frf A = a("upperstem");
   public static final frf B = a("crop");
   public static final frf C = a("dirt");
   public static final frf D = a("fire");
   public static final frf E = a("lantern");
   public static final frf F = a("platform");
   public static final frf G = a("unsticky");
   public static final frf H = a("torch");
   public static final frf I = a("layer0");
   public static final frf J = a("layer1");
   public static final frf K = a("layer2");
   public static final frf L = a("lit_log");
   public static final frf M = a("candle");
   public static final frf N = a("inside");
   public static final frf O = a("content");
   public static final frf P = a("inner_top");
   public static final frf Q = a("flowerbed");
   private final String R;
   @Nullable
   private final frf S;

   private static frf a(String $$0) {
      return new frf($$0, null);
   }

   private static frf a(String $$0, frf $$1) {
      return new frf($$0, $$1);
   }

   private frf(String $$0, @Nullable frf $$1) {
      this.R = $$0;
      this.S = $$1;
   }

   public String a() {
      return this.R;
   }

   @Nullable
   public frf b() {
      return this.S;
   }

   @Override
   public String toString() {
      return "#" + this.R;
   }
}

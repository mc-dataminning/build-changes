import javax.annotation.Nullable;

public final class ftb {
   public static final ftb a = a("all");
   public static final ftb b = a("texture", a);
   public static final ftb c = a("particle", b);
   public static final ftb d = a("end", a);
   public static final ftb e = a("bottom", d);
   public static final ftb f = a("top", d);
   public static final ftb g = a("front", a);
   public static final ftb h = a("back", a);
   public static final ftb i = a("side", a);
   public static final ftb j = a("north", i);
   public static final ftb k = a("south", i);
   public static final ftb l = a("east", i);
   public static final ftb m = a("west", i);
   public static final ftb n = a("up");
   public static final ftb o = a("down");
   public static final ftb p = a("cross");
   public static final ftb q = a("cross_emissive");
   public static final ftb r = a("plant");
   public static final ftb s = a("wall", a);
   public static final ftb t = a("rail");
   public static final ftb u = a("wool");
   public static final ftb v = a("pattern");
   public static final ftb w = a("pane");
   public static final ftb x = a("edge");
   public static final ftb y = a("fan");
   public static final ftb z = a("stem");
   public static final ftb A = a("upperstem");
   public static final ftb B = a("crop");
   public static final ftb C = a("dirt");
   public static final ftb D = a("fire");
   public static final ftb E = a("lantern");
   public static final ftb F = a("platform");
   public static final ftb G = a("unsticky");
   public static final ftb H = a("torch");
   public static final ftb I = a("layer0");
   public static final ftb J = a("layer1");
   public static final ftb K = a("layer2");
   public static final ftb L = a("lit_log");
   public static final ftb M = a("candle");
   public static final ftb N = a("inside");
   public static final ftb O = a("content");
   public static final ftb P = a("inner_top");
   public static final ftb Q = a("flowerbed");
   private final String R;
   @Nullable
   private final ftb S;

   private static ftb a(String $$0) {
      return new ftb($$0, null);
   }

   private static ftb a(String $$0, ftb $$1) {
      return new ftb($$0, $$1);
   }

   private ftb(String $$0, @Nullable ftb $$1) {
      this.R = $$0;
      this.S = $$1;
   }

   public String a() {
      return this.R;
   }

   @Nullable
   public ftb b() {
      return this.S;
   }

   @Override
   public String toString() {
      return "#" + this.R;
   }
}

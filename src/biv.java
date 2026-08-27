import com.mojang.serialization.Codec;

public enum biv implements aru, ask {
   a(0, "left", "options.mainHand.left"),
   b(1, "right", "options.mainHand.right");

   public static final Codec<biv> c = ask.a(biv::values);
   private final int d;
   private final String e;
   private final String f;

   private biv(int $$0, String $$1, String $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public biv e() {
      return this == a ? b : a;
   }

   @Override
   public int a() {
      return this.d;
   }

   @Override
   public String b() {
      return this.f;
   }

   @Override
   public String c() {
      return this.e;
   }
}

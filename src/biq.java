import com.mojang.serialization.Codec;

public enum biq implements arq, asf {
   a(0, "left", "options.mainHand.left"),
   b(1, "right", "options.mainHand.right");

   public static final Codec<biq> c = asf.a(biq::values);
   private final int d;
   private final String e;
   private final String f;

   private biq(int $$0, String $$1, String $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public biq e() {
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

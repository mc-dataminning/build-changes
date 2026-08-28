import com.mojang.serialization.Codec;

public enum dhe implements bak {
   a(bwn.f, 11, "helmet"),
   b(bwn.e, 16, "chestplate"),
   c(bwn.d, 15, "leggings"),
   d(bwn.c, 13, "boots"),
   e(bwn.g, 16, "body");

   public static final Codec<dhe> f = bak.b(dhe::values);
   private final bwn g;
   private final String h;
   private final int i;

   private dhe(final bwn $$0, final int $$1, final String $$2) {
      this.g = $$0;
      this.h = $$2;
      this.i = $$1;
   }

   public int a(int $$0) {
      return this.i * $$0;
   }

   public bwn a() {
      return this.g;
   }

   public String b() {
      return this.h;
   }

   @Override
   public String c() {
      return this.h;
   }
}

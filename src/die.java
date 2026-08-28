import com.mojang.serialization.Codec;

public enum die implements bam {
   a(bxd.f, 11, "helmet"),
   b(bxd.e, 16, "chestplate"),
   c(bxd.d, 15, "leggings"),
   d(bxd.c, 13, "boots"),
   e(bxd.g, 16, "body");

   public static final Codec<die> f = bam.b(die::values);
   private final bxd g;
   private final String h;
   private final int i;

   private die(final bxd $$0, final int $$1, final String $$2) {
      this.g = $$0;
      this.h = $$2;
      this.i = $$1;
   }

   public int a(int $$0) {
      return this.i * $$0;
   }

   public bxd a() {
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

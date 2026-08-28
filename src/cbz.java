import com.mojang.serialization.Codec;

public enum cbz implements ayz {
   a("major_negative", -5, 100, 10, 10),
   b("minor_negative", -1, 200, 20, 20),
   c("minor_positive", 1, 25, 1, 5),
   d("major_positive", 5, 20, 0, 20),
   e("trading", 1, 25, 2, 20);

   public static final int f = 25;
   public static final int g = 20;
   public static final int h = 2;
   public final String i;
   public final int j;
   public final int k;
   public final int l;
   public final int m;
   public static final Codec<cbz> n = ayz.a(cbz::values);

   private cbz(final String $$0, final int $$1, final int $$2, final int $$3, final int $$4) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.l = $$3;
      this.m = $$4;
   }

   @Override
   public String c() {
      return this.i;
   }
}

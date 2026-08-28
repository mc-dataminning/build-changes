import com.mojang.serialization.Codec;

public record exk(ale d, boolean e, int f, boolean g, boolean h) {
   public static final int a = -1;
   public static final Codec<je<exk>> b = mf.ap.r();
   public static final yu<wh, je<exk>> c = ys.b(mg.R);

   public boolean a() {
      return this.f != -1;
   }

   public ale b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }

   public int d() {
      return this.f;
   }

   public boolean e() {
      return this.g;
   }

   public boolean f() {
      return this.h;
   }
}

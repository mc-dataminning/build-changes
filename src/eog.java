import com.mojang.serialization.Codec;

public record eog(akn d, boolean e, int f, boolean g, boolean h) {
   public static final int a = -1;
   public static final Codec<ix<eog>> b = le.av.r();
   public static final yv<wi, ix<eog>> c = yt.b(lf.ay);

   public boolean a() {
      return this.f != -1;
   }

   public akn b() {
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

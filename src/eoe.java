import com.mojang.serialization.Codec;

public record eoe(akm d, boolean e, int f, boolean g, boolean h) {
   public static final int a = -1;
   public static final Codec<ix<eoe>> b = le.av.r();
   public static final yv<wi, ix<eoe>> c = yt.b(lf.ay);

   public boolean a() {
      return this.f != -1;
   }

   public akm b() {
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

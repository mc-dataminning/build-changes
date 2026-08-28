import com.mojang.serialization.Codec;

public record eye(alg d, boolean e, int f, boolean g, boolean h) {
   public static final int a = -1;
   public static final Codec<je<eye>> b = mf.ap.r();
   public static final yw<wj, je<eye>> c = yu.b(mg.R);

   public boolean a() {
      return this.f != -1;
   }

   public alg b() {
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

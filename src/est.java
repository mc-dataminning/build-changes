import com.mojang.serialization.Codec;

public record est(alh d, boolean e, int f, boolean g, boolean h) {
   public static final int a = -1;
   public static final Codec<jp<est>> b = lx.ar.r();
   public static final zf<ws, jp<est>> c = zd.b(ly.aC);

   public boolean a() {
      return this.f != -1;
   }

   public alh b() {
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

import com.mojang.serialization.Codec;

public record eve(alz d, boolean e, int f, boolean g, boolean h) {
   public static final int a = -1;
   public static final Codec<jq<eve>> b = ma.ar.r();
   public static final zt<xg, jq<eve>> c = zr.b(mb.aC);

   public boolean a() {
      return this.f != -1;
   }

   public alz b() {
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

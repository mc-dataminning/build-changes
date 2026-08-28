import com.mojang.serialization.Codec;

public record etk(alj d, boolean e, int f, boolean g, boolean h) {
   public static final int a = -1;
   public static final Codec<jq<etk>> b = lz.ar.r();
   public static final zh<wu, jq<etk>> c = zf.b(ma.aC);

   public boolean a() {
      return this.f != -1;
   }

   public alj b() {
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

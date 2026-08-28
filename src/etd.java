import com.mojang.serialization.Codec;

public record etd(all d, boolean e, int f, boolean g, boolean h) {
   public static final int a = -1;
   public static final Codec<jq<etd>> b = lz.ar.r();
   public static final zj<ww, jq<etd>> c = zh.b(ma.aC);

   public boolean a() {
      return this.f != -1;
   }

   public all b() {
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

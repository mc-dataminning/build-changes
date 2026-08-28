import com.mojang.serialization.Codec;

public record esz(ali d, boolean e, int f, boolean g, boolean h) {
   public static final int a = -1;
   public static final Codec<jq<esz>> b = ly.ar.r();
   public static final zg<wt, jq<esz>> c = ze.b(lz.aC);

   public boolean a() {
      return this.f != -1;
   }

   public ali b() {
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

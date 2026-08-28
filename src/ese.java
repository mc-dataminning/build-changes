import com.mojang.serialization.Codec;

public record ese(alc d, boolean e, int f, boolean g, boolean h) {
   public static final int a = -1;
   public static final Codec<jn<ese>> b = lu.as.r();
   public static final zb<wo, jn<ese>> c = yz.b(lv.aD);

   public boolean a() {
      return this.f != -1;
   }

   public alc b() {
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

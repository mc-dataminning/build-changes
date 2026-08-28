import com.mojang.serialization.Codec;

public record eqi(akq d, boolean e, int f, boolean g, boolean h) {
   public static final int a = -1;
   public static final Codec<jm<eqi>> b = lt.at.s();
   public static final yw<wj, jm<eqi>> c = yu.b(lu.aD);

   public boolean a() {
      return this.f != -1;
   }

   public akq b() {
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

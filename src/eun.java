import com.mojang.serialization.Codec;

public record eun(akv d, boolean e, int f, boolean g, boolean h) {
   public static final int a = -1;
   public static final Codec<jr<eun>> b = mb.ar.r();
   public static final yn<wa, jr<eun>> c = yl.b(mc.aC);

   public boolean a() {
      return this.f != -1;
   }

   public akv b() {
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

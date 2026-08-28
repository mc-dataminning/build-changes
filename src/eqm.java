import com.mojang.serialization.Codec;

public record eqm(akr d, boolean e, int f, boolean g, boolean h) {
   public static final int a = -1;
   public static final Codec<jm<eqm>> b = lt.at.s();
   public static final yx<wk, jm<eqm>> c = yv.b(lu.aD);

   public boolean a() {
      return this.f != -1;
   }

   public akr b() {
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

import com.mojang.serialization.Codec;

public record evf(alp d, boolean e, int f, boolean g, boolean h) {
   public static final int a = -1;
   public static final Codec<jq<evf>> b = ma.ar.r();
   public static final zi<wv, jq<evf>> c = zg.b(mb.aC);

   public boolean a() {
      return this.f != -1;
   }

   public alp b() {
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

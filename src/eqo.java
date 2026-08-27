import com.mojang.serialization.Codec;

public record eqo(akt d, boolean e, int f, boolean g, boolean h) {
   public static final int a = -1;
   public static final Codec<ja<eqo>> b = lh.av.r();
   public static final zc<wp, ja<eqo>> c = za.b(li.ay);

   public boolean a() {
      return this.f != -1;
   }

   public akt b() {
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

import com.mojang.serialization.Codec;

public record ewi(ald d, boolean e, int f, boolean g, boolean h) {
   public static final int a = -1;
   public static final Codec<js<ewi>> b = md.ar.r();
   public static final yt<wg, js<ewi>> c = yr.b(me.aC);

   public boolean a() {
      return this.f != -1;
   }

   public ald b() {
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

import com.mojang.serialization.Codec;

public record enk(akh d, boolean e, int f, boolean g, boolean h) {
   public static final int a = -1;
   public static final Codec<iw<enk>> b = ld.av.r();
   public static final ys<wf, iw<enk>> c = yq.b(le.ay);

   public boolean a() {
      return this.f != -1;
   }

   public akh b() {
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

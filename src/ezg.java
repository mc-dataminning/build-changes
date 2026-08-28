import com.mojang.serialization.Codec;

public record ezg(alk d, boolean e, int f, boolean g, boolean h) {
   public static final int a = -1;
   public static final Codec<jg<ezg>> b = mh.ap.r();
   public static final za<wn, jg<ezg>> c = yy.b(mi.R);

   public boolean a() {
      return this.f != -1;
   }

   public alk b() {
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

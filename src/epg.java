import com.mojang.serialization.Codec;

public record epg(alf d, boolean e, int f, boolean g, boolean h) {
   public static final int a = -1;
   public static final Codec<ji<epg>> b = lp.av.r();
   public static final zn<xa, ji<epg>> c = zl.b(lq.ay);

   public boolean a() {
      return this.f != -1;
   }

   public alf b() {
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

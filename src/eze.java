import com.mojang.serialization.Codec;

public record eze(ali d, boolean e, int f, boolean g, boolean h) {
   public static final int a = -1;
   public static final Codec<jf<eze>> b = mg.ap.r();
   public static final yy<wl, jf<eze>> c = yw.b(mh.R);

   public boolean a() {
      return this.f != -1;
   }

   public ali b() {
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

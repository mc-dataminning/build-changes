import com.mojang.serialization.Codec;

public record ezq(alr d, boolean e, int f, boolean g, boolean h) {
   public static final int a = -1;
   public static final Codec<jg<ezq>> b = mh.ap.r();
   public static final ze<wp, jg<ezq>> c = zc.b(mi.R);

   public boolean a() {
      return this.f != -1;
   }

   public alr b() {
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

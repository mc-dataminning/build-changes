import com.mojang.serialization.Codec;

public record erq(alb d, boolean e, int f, boolean g, boolean h) {
   public static final int a = -1;
   public static final Codec<jn<erq>> b = lu.as.r();
   public static final zb<wo, jn<erq>> c = yz.b(lv.aD);

   public boolean a() {
      return this.f != -1;
   }

   public alb b() {
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

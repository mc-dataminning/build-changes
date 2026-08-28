import com.mojang.serialization.Codec;

public record epa(alb d, boolean e, int f, boolean g, boolean h) {
   public static final int a = -1;
   public static final Codec<ji<epa>> b = lp.av.r();
   public static final zj<ww, ji<epa>> c = zh.b(lq.ay);

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

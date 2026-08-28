import com.mojang.serialization.Codec;

public record esi(ale d, boolean e, int f, boolean g, boolean h) {
   public static final int a = -1;
   public static final Codec<jo<esi>> b = lv.as.r();
   public static final zc<wp, jo<esi>> c = za.b(lw.aD);

   public boolean a() {
      return this.f != -1;
   }

   public ale b() {
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

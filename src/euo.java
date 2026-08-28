import com.mojang.serialization.Codec;

public record euo(aku d, boolean e, int f, boolean g, boolean h) {
   public static final int a = -1;
   public static final Codec<jr<euo>> b = mb.ar.r();
   public static final ym<vz, jr<euo>> c = yk.b(mc.aC);

   public boolean a() {
      return this.f != -1;
   }

   public aku b() {
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

import java.util.Optional;

public record eyk(jf<eyl> b, byte c, byte d, byte e, Optional<wy> f) {
   public static final yw<wj, eyk> a = yw.a(eyl.c, eyk::c, yu.c, eyk::d, yu.c, eyk::e, yu.c, eyk::f, xa.c, eyk::g, eyk::new);

   public eyk(jf<eyl> b, byte c, byte d, byte e, Optional<wy> f) {
      e = (byte)(e & 15);
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
      this.f = f;
   }

   public alg a() {
      return this.b.a().b();
   }

   public boolean b() {
      return this.b.a().c();
   }

   public jf<eyl> c() {
      return this.b;
   }

   public byte d() {
      return this.c;
   }

   public byte e() {
      return this.d;
   }

   public byte f() {
      return this.e;
   }

   public Optional<wy> g() {
      return this.f;
   }
}

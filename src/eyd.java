import java.util.Optional;

public record eyd(je<eye> b, byte c, byte d, byte e, Optional<wy> f) {
   public static final yw<wj, eyd> a = yw.a(eye.c, eyd::c, yu.c, eyd::d, yu.c, eyd::e, yu.c, eyd::f, xa.c, eyd::g, eyd::new);

   public eyd(je<eye> b, byte c, byte d, byte e, Optional<wy> f) {
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

   public je<eye> c() {
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

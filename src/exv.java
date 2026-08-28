import java.util.Optional;

public record exv(je<exw> b, byte c, byte d, byte e, Optional<wy> f) {
   public static final yw<wj, exv> a = yw.a(exw.c, exv::c, yu.c, exv::d, yu.c, exv::e, yu.c, exv::f, xa.c, exv::g, exv::new);

   public exv(je<exw> b, byte c, byte d, byte e, Optional<wy> f) {
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

   public je<exw> c() {
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

import java.util.Optional;

public record exj(je<exk> b, byte c, byte d, byte e, Optional<ww> f) {
   public static final yu<wh, exj> a = yu.a(exk.c, exj::c, ys.c, exj::d, ys.c, exj::e, ys.c, exj::f, wy.c, exj::g, exj::new);

   public exj(je<exk> b, byte c, byte d, byte e, Optional<ww> f) {
      e = (byte)(e & 15);
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
      this.f = f;
   }

   public ale a() {
      return this.b.a().b();
   }

   public boolean b() {
      return this.b.a().c();
   }

   public je<exk> c() {
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

   public Optional<ww> g() {
      return this.f;
   }
}

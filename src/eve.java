import java.util.Optional;

public record eve(jq<evf> b, byte c, byte d, byte e, Optional<xk> f) {
   public static final zi<wv, eve> a = zi.a(evf.c, eve::c, zg.c, eve::d, zg.c, eve::e, zg.c, eve::f, xm.c, eve::g, eve::new);

   public eve(jq<evf> b, byte c, byte d, byte e, Optional<xk> f) {
      e = (byte)(e & 15);
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
      this.f = f;
   }

   public alp a() {
      return this.b.a().b();
   }

   public boolean b() {
      return this.b.a().c();
   }

   public jq<evf> c() {
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

   public Optional<xk> g() {
      return this.f;
   }
}

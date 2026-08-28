import java.util.Optional;

public record evd(jq<eve> b, byte c, byte d, byte e, Optional<xv> f) {
   public static final zt<xg, evd> a = zt.a(eve.c, evd::c, zr.c, evd::d, zr.c, evd::e, zr.c, evd::f, xx.c, evd::g, evd::new);

   public evd(jq<eve> b, byte c, byte d, byte e, Optional<xv> f) {
      e = (byte)(e & 15);
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
      this.f = f;
   }

   public alz a() {
      return this.b.a().b();
   }

   public boolean b() {
      return this.b.a().c();
   }

   public jq<eve> c() {
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

   public Optional<xv> g() {
      return this.f;
   }
}

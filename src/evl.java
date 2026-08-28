import java.util.Optional;

public record evl(jq<evm> b, byte c, byte d, byte e, Optional<xv> f) {
   public static final zt<xg, evl> a = zt.a(evm.c, evl::c, zr.c, evl::d, zr.c, evl::e, zr.c, evl::f, xx.c, evl::g, evl::new);

   public evl(jq<evm> b, byte c, byte d, byte e, Optional<xv> f) {
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

   public jq<evm> c() {
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

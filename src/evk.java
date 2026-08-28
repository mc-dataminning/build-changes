import java.util.Optional;

public record evk(jq<evl> b, byte c, byte d, byte e, Optional<xv> f) {
   public static final zt<xg, evk> a = zt.a(evl.c, evk::c, zr.c, evk::d, zr.c, evk::e, zr.c, evk::f, xx.c, evk::g, evk::new);

   public evk(jq<evl> b, byte c, byte d, byte e, Optional<xv> f) {
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

   public jq<evl> c() {
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

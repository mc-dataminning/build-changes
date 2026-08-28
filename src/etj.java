import java.util.Optional;

public record etj(jq<etk> b, byte c, byte d, byte e, Optional<xj> f) {
   public static final zh<wu, etj> a = zh.a(etk.c, etj::c, zf.c, etj::d, zf.c, etj::e, zf.c, etj::f, xl.c, etj::g, etj::new);

   public etj(jq<etk> b, byte c, byte d, byte e, Optional<xj> f) {
      e = (byte)(e & 15);
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
      this.f = f;
   }

   public alj a() {
      return this.b.a().b();
   }

   public boolean b() {
      return this.b.a().c();
   }

   public jq<etk> c() {
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

   public Optional<xj> g() {
      return this.f;
   }
}

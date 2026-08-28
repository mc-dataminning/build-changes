import java.util.Optional;

public record esy(jq<esz> b, byte c, byte d, byte e, Optional<xi> f) {
   public static final zg<wt, esy> a = zg.a(esz.c, esy::c, ze.c, esy::d, ze.c, esy::e, ze.c, esy::f, xk.c, esy::g, esy::new);

   public esy(jq<esz> b, byte c, byte d, byte e, Optional<xi> f) {
      e = (byte)(e & 15);
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
      this.f = f;
   }

   public ali a() {
      return this.b.a().b();
   }

   public boolean b() {
      return this.b.a().c();
   }

   public jq<esz> c() {
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

   public Optional<xi> g() {
      return this.f;
   }
}

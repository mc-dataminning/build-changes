import java.util.Optional;

public record eql(jm<eqm> b, byte c, byte d, byte e, Optional<wz> f) {
   public static final yx<wk, eql> a = yx.a(eqm.c, eql::c, yv.c, eql::d, yv.c, eql::e, yv.c, eql::f, xb.c, eql::g, eql::new);

   public eql(jm<eqm> b, byte c, byte d, byte e, Optional<wz> f) {
      e = (byte)(e & 15);
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
      this.f = f;
   }

   public akr a() {
      return this.b.a().b();
   }

   public boolean b() {
      return this.b.a().c();
   }

   public jm<eqm> c() {
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

   public Optional<wz> g() {
      return this.f;
   }
}

import java.util.Optional;

public record eqn(jm<eqo> b, byte c, byte d, byte e, Optional<wz> f) {
   public static final yx<wk, eqn> a = yx.a(eqo.c, eqn::c, yv.c, eqn::d, yv.c, eqn::e, yv.c, eqn::f, xb.c, eqn::g, eqn::new);

   public eqn(jm<eqo> b, byte c, byte d, byte e, Optional<wz> f) {
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

   public jm<eqo> c() {
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

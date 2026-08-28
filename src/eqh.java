import java.util.Optional;

public record eqh(jm<eqi> b, byte c, byte d, byte e, Optional<wy> f) {
   public static final yw<wj, eqh> a = yw.a(eqi.c, eqh::c, yu.c, eqh::d, yu.c, eqh::e, yu.c, eqh::f, xa.c, eqh::g, eqh::new);

   public eqh(jm<eqi> b, byte c, byte d, byte e, Optional<wy> f) {
      e = (byte)(e & 15);
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
      this.f = f;
   }

   public akq a() {
      return this.b.a().b();
   }

   public boolean b() {
      return this.b.a().c();
   }

   public jm<eqi> c() {
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

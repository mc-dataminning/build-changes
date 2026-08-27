import java.util.Optional;

public record eqn(ja<eqo> b, byte c, byte d, byte e, Optional<xe> f) {
   public static final zc<wp, eqn> a = zc.a(eqo.c, eqn::c, za.c, eqn::d, za.c, eqn::e, za.c, eqn::f, xg.c, eqn::g, eqn::new);

   public eqn(ja<eqo> b, byte c, byte d, byte e, Optional<xe> f) {
      e = (byte)(e & 15);
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
      this.f = f;
   }

   public akt a() {
      return this.b.a().b();
   }

   public boolean b() {
      return this.b.a().c();
   }

   public ja<eqo> c() {
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

   public Optional<xe> g() {
      return this.f;
   }
}

import java.util.Optional;

public record ezp(jg<ezq> b, byte c, byte d, byte e, Optional<xg> f) {
   public static final ze<wp, ezp> a = ze.a(ezq.c, ezp::c, zc.c, ezp::d, zc.c, ezp::e, zc.c, ezp::f, xi.c, ezp::g, ezp::new);

   public ezp(jg<ezq> b, byte c, byte d, byte e, Optional<xg> f) {
      e = (byte)(e & 15);
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
      this.f = f;
   }

   public alr a() {
      return this.b.a().b();
   }

   public boolean b() {
      return this.b.a().c();
   }

   public jg<ezq> c() {
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

   public Optional<xg> g() {
      return this.f;
   }
}

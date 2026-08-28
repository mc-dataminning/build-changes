import java.util.Optional;

public record erp(jn<erq> b, byte c, byte d, byte e, Optional<xd> f) {
   public static final zb<wo, erp> a = zb.a(erq.c, erp::c, yz.c, erp::d, yz.c, erp::e, yz.c, erp::f, xf.c, erp::g, erp::new);

   public erp(jn<erq> b, byte c, byte d, byte e, Optional<xd> f) {
      e = (byte)(e & 15);
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
      this.f = f;
   }

   public alb a() {
      return this.b.a().b();
   }

   public boolean b() {
      return this.b.a().c();
   }

   public jn<erq> c() {
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

   public Optional<xd> g() {
      return this.f;
   }
}

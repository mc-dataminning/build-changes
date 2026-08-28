import java.util.Optional;

public record ess(jp<est> b, byte c, byte d, byte e, Optional<xh> f) {
   public static final zf<ws, ess> a = zf.a(est.c, ess::c, zd.c, ess::d, zd.c, ess::e, zd.c, ess::f, xj.c, ess::g, ess::new);

   public ess(jp<est> b, byte c, byte d, byte e, Optional<xh> f) {
      e = (byte)(e & 15);
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
      this.f = f;
   }

   public alh a() {
      return this.b.a().b();
   }

   public boolean b() {
      return this.b.a().c();
   }

   public jp<est> c() {
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

   public Optional<xh> g() {
      return this.f;
   }
}

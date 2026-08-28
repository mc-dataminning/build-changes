import java.util.Optional;

public record epd(ji<epe> b, byte c, byte d, byte e, Optional<xo> f) {
   public static final zm<wz, epd> a = zm.a(epe.c, epd::c, zk.c, epd::d, zk.c, epd::e, zk.c, epd::f, xq.c, epd::g, epd::new);

   public epd(ji<epe> b, byte c, byte d, byte e, Optional<xo> f) {
      e = (byte)(e & 15);
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
      this.f = f;
   }

   public ale a() {
      return this.b.a().b();
   }

   public boolean b() {
      return this.b.a().c();
   }

   public ji<epe> c() {
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

   public Optional<xo> g() {
      return this.f;
   }
}

import java.util.Optional;

public record epc(ji<epd> b, byte c, byte d, byte e, Optional<xo> f) {
   public static final zm<wz, epc> a = zm.a(epd.c, epc::c, zk.c, epc::d, zk.c, epc::e, zk.c, epc::f, xq.c, epc::g, epc::new);

   public epc(ji<epd> b, byte c, byte d, byte e, Optional<xo> f) {
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

   public ji<epd> c() {
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

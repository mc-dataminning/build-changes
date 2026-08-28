import java.util.Optional;

public record epg(ji<eph> b, byte c, byte d, byte e, Optional<xp> f) {
   public static final zn<xa, epg> a = zn.a(eph.c, epg::c, zl.c, epg::d, zl.c, epg::e, zl.c, epg::f, xr.c, epg::g, epg::new);

   public epg(ji<eph> b, byte c, byte d, byte e, Optional<xp> f) {
      e = (byte)(e & 15);
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
      this.f = f;
   }

   public alf a() {
      return this.b.a().b();
   }

   public boolean b() {
      return this.b.a().c();
   }

   public ji<eph> c() {
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

   public Optional<xp> g() {
      return this.f;
   }
}

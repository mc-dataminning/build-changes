import java.util.Optional;

public record epf(ji<epg> b, byte c, byte d, byte e, Optional<xp> f) {
   public static final zn<xa, epf> a = zn.a(epg.c, epf::c, zl.c, epf::d, zl.c, epf::e, zl.c, epf::f, xr.c, epf::g, epf::new);

   public epf(ji<epg> b, byte c, byte d, byte e, Optional<xp> f) {
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

   public ji<epg> c() {
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

import java.util.Optional;

public record epe(ji<epf> b, byte c, byte d, byte e, Optional<xp> f) {
   public static final zn<xa, epe> a = zn.a(epf.c, epe::c, zl.c, epe::d, zl.c, epe::e, zl.c, epe::f, xr.c, epe::g, epe::new);

   public epe(ji<epf> b, byte c, byte d, byte e, Optional<xp> f) {
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

   public ji<epf> c() {
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
